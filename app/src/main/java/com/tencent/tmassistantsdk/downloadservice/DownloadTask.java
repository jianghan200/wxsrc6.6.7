package com.tencent.tmassistantsdk.downloadservice;

import android.text.TextUtils;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.tmassistantsdk.protocol.jce.DownloadChunkLogInfo;
import com.tencent.tmassistantsdk.storage.TMAssistantFile;
import com.tencent.tmassistantsdk.util.GlobalUtil;
import com.tencent.tmassistantsdk.util.TMLog;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;

public class DownloadTask
{
  public static final String TAG = "_DownloadTask";
  protected DownloadInfo mDownloadInfo = null;
  HttpClient mHttpClient = null;
  HttpGet mHttpGet = null;
  private boolean mIsRedirect = false;
  protected final byte[] mRecvBuf = new byte['က'];
  private String mRequestUrl;
  TMAssistantFile mSaveFile;
  protected boolean mStopTask = false;
  protected final int mTaskId = GlobalUtil.getMemUUID();
  private String startDownloadNetType = "wifi";
  
  public DownloadTask(DownloadInfo paramDownloadInfo)
  {
    this.mDownloadInfo = paramDownloadInfo;
  }
  
  private void handleResponseCode(HttpResponse paramHttpResponse, DownloadChunkLogInfo paramDownloadChunkLogInfo)
  {
    int i = paramHttpResponse.getStatusLine().getStatusCode();
    TMLog.i("_DownloadTask", "httpResponseCode = " + i + " " + Thread.currentThread().getName());
    paramDownloadChunkLogInfo.readHeaderTime = System.currentTimeMillis();
    paramDownloadChunkLogInfo.responseHttpCode = i;
    if ((i == 200) || (i == 206)) {
      this.mDownloadInfo.mRetryCnt = 0;
    }
    Object localObject;
    switch (i)
    {
    default: 
      throw new StopRequestException(i, "HTTP response code error, code = " + i);
    case 200: 
      localObject = paramHttpResponse.getHeaders("Content-Type");
      if ((localObject != null) && (localObject.length > 0))
      {
        if (!this.mDownloadInfo.mContentType.equals("resource/tm.android.unknown")) {
          break label253;
        }
        localObject = DownloadHelper.renameAPKFileName(this.mDownloadInfo.mFileName);
        this.mDownloadInfo.mFileName = ((String)localObject);
      }
      for (;;)
      {
        onReceivedResponseData(paramHttpResponse, paramDownloadChunkLogInfo);
        return;
        localObject = localObject[0].getValue();
        if ((!TextUtils.isEmpty((CharSequence)localObject)) && (((String)localObject).startsWith("text"))) {
          throw new StopRequestException(708, "Return contenttype = text " + Thread.currentThread().getName());
        }
        renameApkFileName(paramHttpResponse);
      }
    case 206: 
      if (this.mDownloadInfo.mContentType.equals("resource/tm.android.unknown"))
      {
        localObject = DownloadHelper.renameAPKFileName(this.mDownloadInfo.mFileName);
        this.mDownloadInfo.mFileName = ((String)localObject);
      }
      for (;;)
      {
        onReceivedResponseData(paramHttpResponse, paramDownloadChunkLogInfo);
        return;
        renameApkFileName(paramHttpResponse);
      }
    case 301: 
    case 302: 
    case 303: 
    case 307: 
      if (this.mDownloadInfo.mRedirectCnt > 5)
      {
        TMLog.i("_DownloadTask", "mRedirectCnt = " + this.mDownloadInfo.mRedirectCnt + ",MAX_REDIRESTS = 5");
        throw new StopRequestException(709, "Redirect cnt many times.");
      }
      paramHttpResponse = paramHttpResponse.getFirstHeader("location");
      if (paramHttpResponse != null)
      {
        paramHttpResponse = paramHttpResponse.getValue();
        TMLog.i("_DownloadTask", "jumpURL = " + paramHttpResponse);
        if (DownloadHelper.isValidURL(paramHttpResponse))
        {
          this.mRequestUrl = DownloadHelper.correctURL(paramHttpResponse);
          this.mIsRedirect = true;
          paramHttpResponse = this.mDownloadInfo;
          paramHttpResponse.mRedirectCnt += 1;
          return;
        }
        throw new StopRequestException(700, "Jump url is not valid. httpResponseCode = " + i + " url: " + paramHttpResponse);
      }
      TMLog.e("_DownloadTask", "location header is null. httpResponseCode = " + i);
      throw new StopRequestException(702, "location header is null. httpResponseCode = " + i);
    case 416: 
      throw new StopRequestException(i, "HTTP response code error, code = " + i);
    case 503: 
      label253:
      throw new StopRequestException(i, "HTTP response code error, code = " + i);
    }
    throw new StopRequestException(i, "HTTP response code error, code = " + i);
  }
  
  private void onDownloadError(Throwable paramThrowable)
  {
    if (paramThrowable != null) {
      x.printErrStackTrace("_DownloadTask", paramThrowable, "", new Object[0]);
    }
  }
  
  /* Error */
  private void onReceivedResponseData(HttpResponse paramHttpResponse, DownloadChunkLogInfo paramDownloadChunkLogInfo)
  {
    // Byte code:
    //   0: aload_1
    //   1: invokeinterface 234 1 0
    //   6: astore 9
    //   8: aload_0
    //   9: aload_1
    //   10: aload 9
    //   12: invokespecial 238	com/tencent/tmassistantsdk/downloadservice/DownloadTask:verifyTotalLen	(Lorg/apache/http/HttpResponse;Lorg/apache/http/HttpEntity;)Z
    //   15: ifne +23 -> 38
    //   18: ldc 8
    //   20: ldc -16
    //   22: invokestatic 103	com/tencent/tmassistantsdk/util/TMLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   25: new 125	com/tencent/tmassistantsdk/downloadservice/StopRequestException
    //   28: dup
    //   29: sipush 705
    //   32: ldc -14
    //   34: invokespecial 130	com/tencent/tmassistantsdk/downloadservice/StopRequestException:<init>	(ILjava/lang/String;)V
    //   37: athrow
    //   38: aload_0
    //   39: getfield 38	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mDownloadInfo	Lcom/tencent/tmassistantsdk/downloadservice/DownloadInfo;
    //   42: invokevirtual 245	com/tencent/tmassistantsdk/downloadservice/DownloadInfo:getTotalSize	()J
    //   45: lconst_0
    //   46: lcmp
    //   47: ifne +397 -> 444
    //   50: aload_1
    //   51: invokeinterface 63 1 0
    //   56: invokeinterface 68 1 0
    //   61: sipush 200
    //   64: if_icmpne +263 -> 327
    //   67: aload_0
    //   68: getfield 38	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mDownloadInfo	Lcom/tencent/tmassistantsdk/downloadservice/DownloadInfo;
    //   71: aload 9
    //   73: invokeinterface 250 1 0
    //   78: invokevirtual 254	com/tencent/tmassistantsdk/downloadservice/DownloadInfo:setTotalSize	(J)V
    //   81: ldc 8
    //   83: new 70	java/lang/StringBuilder
    //   86: dup
    //   87: ldc_w 256
    //   90: invokespecial 75	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   93: aload_0
    //   94: getfield 38	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mDownloadInfo	Lcom/tencent/tmassistantsdk/downloadservice/DownloadInfo;
    //   97: invokevirtual 245	com/tencent/tmassistantsdk/downloadservice/DownloadInfo:getTotalSize	()J
    //   100: invokevirtual 259	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   103: invokevirtual 97	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   106: invokestatic 103	com/tencent/tmassistantsdk/util/TMLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   109: ldc 8
    //   111: new 70	java/lang/StringBuilder
    //   114: dup
    //   115: ldc_w 261
    //   118: invokespecial 75	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   121: aload_0
    //   122: getfield 38	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mDownloadInfo	Lcom/tencent/tmassistantsdk/downloadservice/DownloadInfo;
    //   125: invokevirtual 245	com/tencent/tmassistantsdk/downloadservice/DownloadInfo:getTotalSize	()J
    //   128: invokevirtual 259	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   131: invokevirtual 97	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   134: invokestatic 264	com/tencent/tmassistantsdk/util/TMLog:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   137: aload_1
    //   138: ldc_w 266
    //   141: invokeinterface 197 2 0
    //   146: astore_1
    //   147: aload_1
    //   148: ifnull +36 -> 184
    //   151: aload_1
    //   152: invokeinterface 164 1 0
    //   157: invokestatic 272	com/tencent/tmassistantsdk/downloadservice/ByteRange:parseContentRange	(Ljava/lang/String;)Lcom/tencent/tmassistantsdk/downloadservice/ByteRange;
    //   160: astore_1
    //   161: aload_2
    //   162: aload_1
    //   163: invokevirtual 275	com/tencent/tmassistantsdk/downloadservice/ByteRange:getStart	()J
    //   166: putfield 278	com/tencent/tmassistantsdk/protocol/jce/DownloadChunkLogInfo:responseRangePosition	J
    //   169: aload_2
    //   170: aload_1
    //   171: invokevirtual 281	com/tencent/tmassistantsdk/downloadservice/ByteRange:getEnd	()J
    //   174: aload_1
    //   175: invokevirtual 275	com/tencent/tmassistantsdk/downloadservice/ByteRange:getStart	()J
    //   178: lsub
    //   179: lconst_1
    //   180: ladd
    //   181: putfield 284	com/tencent/tmassistantsdk/protocol/jce/DownloadChunkLogInfo:responseRangeLength	J
    //   184: aload_2
    //   185: aload_0
    //   186: getfield 38	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mDownloadInfo	Lcom/tencent/tmassistantsdk/downloadservice/DownloadInfo;
    //   189: invokevirtual 245	com/tencent/tmassistantsdk/downloadservice/DownloadInfo:getTotalSize	()J
    //   192: putfield 287	com/tencent/tmassistantsdk/protocol/jce/DownloadChunkLogInfo:responseContentLength	J
    //   195: aload_0
    //   196: getfield 289	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mSaveFile	Lcom/tencent/tmassistantsdk/storage/TMAssistantFile;
    //   199: ifnonnull +28 -> 227
    //   202: aload_0
    //   203: new 291	com/tencent/tmassistantsdk/storage/TMAssistantFile
    //   206: dup
    //   207: aload_0
    //   208: getfield 38	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mDownloadInfo	Lcom/tencent/tmassistantsdk/downloadservice/DownloadInfo;
    //   211: getfield 294	com/tencent/tmassistantsdk/downloadservice/DownloadInfo:mTempFileName	Ljava/lang/String;
    //   214: aload_0
    //   215: getfield 38	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mDownloadInfo	Lcom/tencent/tmassistantsdk/downloadservice/DownloadInfo;
    //   218: getfield 150	com/tencent/tmassistantsdk/downloadservice/DownloadInfo:mFileName	Ljava/lang/String;
    //   221: invokespecial 296	com/tencent/tmassistantsdk/storage/TMAssistantFile:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   224: putfield 289	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mSaveFile	Lcom/tencent/tmassistantsdk/storage/TMAssistantFile;
    //   227: lconst_0
    //   228: lstore 6
    //   230: lload 6
    //   232: lstore 4
    //   234: aload 9
    //   236: invokeinterface 300 1 0
    //   241: astore_1
    //   242: lload 6
    //   244: lstore 4
    //   246: ldc 8
    //   248: new 70	java/lang/StringBuilder
    //   251: dup
    //   252: ldc_w 302
    //   255: invokespecial 75	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   258: aload_0
    //   259: getfield 38	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mDownloadInfo	Lcom/tencent/tmassistantsdk/downloadservice/DownloadInfo;
    //   262: getfield 150	com/tencent/tmassistantsdk/downloadservice/DownloadInfo:mFileName	Ljava/lang/String;
    //   265: invokevirtual 84	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   268: invokevirtual 97	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   271: invokestatic 103	com/tencent/tmassistantsdk/util/TMLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   274: lconst_0
    //   275: lstore 4
    //   277: aload_1
    //   278: aload_0
    //   279: getfield 40	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mRecvBuf	[B
    //   282: invokevirtual 308	java/io/InputStream:read	([B)I
    //   285: istore_3
    //   286: iload_3
    //   287: ifle +14 -> 301
    //   290: aload_0
    //   291: getfield 32	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mStopTask	Z
    //   294: ifeq +474 -> 768
    //   297: aload_1
    //   298: invokevirtual 311	java/io/InputStream:close	()V
    //   301: aload_0
    //   302: getfield 289	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mSaveFile	Lcom/tencent/tmassistantsdk/storage/TMAssistantFile;
    //   305: ifnull +15 -> 320
    //   308: aload_0
    //   309: getfield 289	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mSaveFile	Lcom/tencent/tmassistantsdk/storage/TMAssistantFile;
    //   312: invokevirtual 312	com/tencent/tmassistantsdk/storage/TMAssistantFile:close	()V
    //   315: aload_0
    //   316: aconst_null
    //   317: putfield 289	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mSaveFile	Lcom/tencent/tmassistantsdk/storage/TMAssistantFile;
    //   320: aload_2
    //   321: lload 4
    //   323: putfield 315	com/tencent/tmassistantsdk/protocol/jce/DownloadChunkLogInfo:receiveDataSize	J
    //   326: return
    //   327: aload_1
    //   328: invokeinterface 63 1 0
    //   333: invokeinterface 68 1 0
    //   338: sipush 206
    //   341: if_icmpne +62 -> 403
    //   344: aload_1
    //   345: ldc_w 266
    //   348: invokeinterface 197 2 0
    //   353: astore 10
    //   355: aload_0
    //   356: getfield 38	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mDownloadInfo	Lcom/tencent/tmassistantsdk/downloadservice/DownloadInfo;
    //   359: aload 10
    //   361: invokeinterface 164 1 0
    //   366: invokestatic 318	com/tencent/tmassistantsdk/downloadservice/ByteRange:getTotalSize	(Ljava/lang/String;)J
    //   369: invokevirtual 254	com/tencent/tmassistantsdk/downloadservice/DownloadInfo:setTotalSize	(J)V
    //   372: ldc 8
    //   374: new 70	java/lang/StringBuilder
    //   377: dup
    //   378: ldc_w 320
    //   381: invokespecial 75	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   384: aload_0
    //   385: getfield 38	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mDownloadInfo	Lcom/tencent/tmassistantsdk/downloadservice/DownloadInfo;
    //   388: invokevirtual 245	com/tencent/tmassistantsdk/downloadservice/DownloadInfo:getTotalSize	()J
    //   391: invokevirtual 259	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   394: invokevirtual 97	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   397: invokestatic 103	com/tencent/tmassistantsdk/util/TMLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   400: goto -291 -> 109
    //   403: ldc 8
    //   405: new 70	java/lang/StringBuilder
    //   408: dup
    //   409: ldc_w 322
    //   412: invokespecial 75	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   415: aload_1
    //   416: invokeinterface 63 1 0
    //   421: invokeinterface 68 1 0
    //   426: invokevirtual 79	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   429: ldc_w 324
    //   432: invokevirtual 84	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   435: invokevirtual 97	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   438: invokestatic 264	com/tencent/tmassistantsdk/util/TMLog:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   441: goto -332 -> 109
    //   444: aload_1
    //   445: invokeinterface 63 1 0
    //   450: invokeinterface 68 1 0
    //   455: sipush 206
    //   458: if_icmpne -263 -> 195
    //   461: aload_1
    //   462: ldc_w 266
    //   465: invokeinterface 197 2 0
    //   470: astore_1
    //   471: aload_1
    //   472: invokeinterface 164 1 0
    //   477: invokestatic 272	com/tencent/tmassistantsdk/downloadservice/ByteRange:parseContentRange	(Ljava/lang/String;)Lcom/tencent/tmassistantsdk/downloadservice/ByteRange;
    //   480: astore 10
    //   482: aload_1
    //   483: invokeinterface 164 1 0
    //   488: invokestatic 318	com/tencent/tmassistantsdk/downloadservice/ByteRange:getTotalSize	(Ljava/lang/String;)J
    //   491: lstore 4
    //   493: aload_2
    //   494: aload 10
    //   496: invokevirtual 275	com/tencent/tmassistantsdk/downloadservice/ByteRange:getStart	()J
    //   499: putfield 278	com/tencent/tmassistantsdk/protocol/jce/DownloadChunkLogInfo:responseRangePosition	J
    //   502: aload_2
    //   503: aload 10
    //   505: invokevirtual 281	com/tencent/tmassistantsdk/downloadservice/ByteRange:getEnd	()J
    //   508: aload 10
    //   510: invokevirtual 275	com/tencent/tmassistantsdk/downloadservice/ByteRange:getStart	()J
    //   513: lsub
    //   514: lconst_1
    //   515: ladd
    //   516: putfield 284	com/tencent/tmassistantsdk/protocol/jce/DownloadChunkLogInfo:responseRangeLength	J
    //   519: aload_2
    //   520: lload 4
    //   522: putfield 287	com/tencent/tmassistantsdk/protocol/jce/DownloadChunkLogInfo:responseContentLength	J
    //   525: ldc 8
    //   527: new 70	java/lang/StringBuilder
    //   530: dup
    //   531: ldc_w 326
    //   534: invokespecial 75	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   537: lload 4
    //   539: invokevirtual 259	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   542: ldc_w 328
    //   545: invokevirtual 84	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   548: aload_0
    //   549: getfield 38	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mDownloadInfo	Lcom/tencent/tmassistantsdk/downloadservice/DownloadInfo;
    //   552: invokevirtual 245	com/tencent/tmassistantsdk/downloadservice/DownloadInfo:getTotalSize	()J
    //   555: invokevirtual 259	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   558: invokevirtual 97	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   561: invokestatic 264	com/tencent/tmassistantsdk/util/TMLog:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   564: ldc 8
    //   566: new 70	java/lang/StringBuilder
    //   569: dup
    //   570: ldc_w 330
    //   573: invokespecial 75	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   576: aload_0
    //   577: getfield 38	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mDownloadInfo	Lcom/tencent/tmassistantsdk/downloadservice/DownloadInfo;
    //   580: getfield 333	com/tencent/tmassistantsdk/downloadservice/DownloadInfo:mReceivedBytes	J
    //   583: invokevirtual 259	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   586: invokevirtual 97	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   589: invokestatic 103	com/tencent/tmassistantsdk/util/TMLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   592: ldc 8
    //   594: new 70	java/lang/StringBuilder
    //   597: dup
    //   598: ldc_w 335
    //   601: invokespecial 75	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   604: aload 10
    //   606: invokevirtual 275	com/tencent/tmassistantsdk/downloadservice/ByteRange:getStart	()J
    //   609: invokevirtual 259	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   612: ldc_w 337
    //   615: invokevirtual 84	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   618: aload 10
    //   620: invokevirtual 281	com/tencent/tmassistantsdk/downloadservice/ByteRange:getEnd	()J
    //   623: invokevirtual 259	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   626: invokevirtual 97	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   629: invokestatic 103	com/tencent/tmassistantsdk/util/TMLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   632: aload 10
    //   634: invokevirtual 275	com/tencent/tmassistantsdk/downloadservice/ByteRange:getStart	()J
    //   637: aload_0
    //   638: getfield 38	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mDownloadInfo	Lcom/tencent/tmassistantsdk/downloadservice/DownloadInfo;
    //   641: getfield 333	com/tencent/tmassistantsdk/downloadservice/DownloadInfo:mReceivedBytes	J
    //   644: lcmp
    //   645: ifeq +52 -> 697
    //   648: new 125	com/tencent/tmassistantsdk/downloadservice/StopRequestException
    //   651: dup
    //   652: sipush 706
    //   655: ldc_w 339
    //   658: invokespecial 130	com/tencent/tmassistantsdk/downloadservice/StopRequestException:<init>	(ILjava/lang/String;)V
    //   661: athrow
    //   662: astore_1
    //   663: new 125	com/tencent/tmassistantsdk/downloadservice/StopRequestException
    //   666: dup
    //   667: sipush 704
    //   670: aload_1
    //   671: invokespecial 342	com/tencent/tmassistantsdk/downloadservice/StopRequestException:<init>	(ILjava/lang/Throwable;)V
    //   674: athrow
    //   675: astore_1
    //   676: aload_0
    //   677: getfield 289	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mSaveFile	Lcom/tencent/tmassistantsdk/storage/TMAssistantFile;
    //   680: ifnull +15 -> 695
    //   683: aload_0
    //   684: getfield 289	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mSaveFile	Lcom/tencent/tmassistantsdk/storage/TMAssistantFile;
    //   687: invokevirtual 312	com/tencent/tmassistantsdk/storage/TMAssistantFile:close	()V
    //   690: aload_0
    //   691: aconst_null
    //   692: putfield 289	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mSaveFile	Lcom/tencent/tmassistantsdk/storage/TMAssistantFile;
    //   695: aload_1
    //   696: athrow
    //   697: lload 4
    //   699: aload_0
    //   700: getfield 38	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mDownloadInfo	Lcom/tencent/tmassistantsdk/downloadservice/DownloadInfo;
    //   703: invokevirtual 245	com/tencent/tmassistantsdk/downloadservice/DownloadInfo:getTotalSize	()J
    //   706: lcmp
    //   707: ifeq +17 -> 724
    //   710: new 125	com/tencent/tmassistantsdk/downloadservice/StopRequestException
    //   713: dup
    //   714: sipush 705
    //   717: ldc_w 344
    //   720: invokespecial 130	com/tencent/tmassistantsdk/downloadservice/StopRequestException:<init>	(ILjava/lang/String;)V
    //   723: athrow
    //   724: ldc 8
    //   726: new 70	java/lang/StringBuilder
    //   729: dup
    //   730: ldc_w 346
    //   733: invokespecial 75	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   736: aload_1
    //   737: invokevirtual 349	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   740: invokevirtual 97	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   743: invokestatic 352	com/tencent/tmassistantsdk/util/TMLog:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   746: aload_0
    //   747: getfield 289	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mSaveFile	Lcom/tencent/tmassistantsdk/storage/TMAssistantFile;
    //   750: ifnull -555 -> 195
    //   753: aload_0
    //   754: getfield 289	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mSaveFile	Lcom/tencent/tmassistantsdk/storage/TMAssistantFile;
    //   757: invokevirtual 312	com/tencent/tmassistantsdk/storage/TMAssistantFile:close	()V
    //   760: aload_0
    //   761: aconst_null
    //   762: putfield 289	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mSaveFile	Lcom/tencent/tmassistantsdk/storage/TMAssistantFile;
    //   765: goto -570 -> 195
    //   768: aload_0
    //   769: getfield 38	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mDownloadInfo	Lcom/tencent/tmassistantsdk/downloadservice/DownloadInfo;
    //   772: getfield 333	com/tencent/tmassistantsdk/downloadservice/DownloadInfo:mReceivedBytes	J
    //   775: iload_3
    //   776: i2l
    //   777: ladd
    //   778: lstore 6
    //   780: lload 6
    //   782: aload_0
    //   783: getfield 38	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mDownloadInfo	Lcom/tencent/tmassistantsdk/downloadservice/DownloadInfo;
    //   786: invokevirtual 245	com/tencent/tmassistantsdk/downloadservice/DownloadInfo:getTotalSize	()J
    //   789: lcmp
    //   790: ifgt +408 -> 1198
    //   793: lload 6
    //   795: aload_0
    //   796: getfield 38	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mDownloadInfo	Lcom/tencent/tmassistantsdk/downloadservice/DownloadInfo;
    //   799: invokevirtual 245	com/tencent/tmassistantsdk/downloadservice/DownloadInfo:getTotalSize	()J
    //   802: lcmp
    //   803: ifne +202 -> 1005
    //   806: iconst_1
    //   807: istore 8
    //   809: aload_0
    //   810: getfield 289	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mSaveFile	Lcom/tencent/tmassistantsdk/storage/TMAssistantFile;
    //   813: aload_0
    //   814: getfield 40	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mRecvBuf	[B
    //   817: iconst_0
    //   818: iload_3
    //   819: aload_0
    //   820: getfield 38	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mDownloadInfo	Lcom/tencent/tmassistantsdk/downloadservice/DownloadInfo;
    //   823: getfield 333	com/tencent/tmassistantsdk/downloadservice/DownloadInfo:mReceivedBytes	J
    //   826: iload 8
    //   828: invokevirtual 356	com/tencent/tmassistantsdk/storage/TMAssistantFile:write	([BIIJZ)Z
    //   831: ifne +348 -> 1179
    //   834: invokestatic 359	com/tencent/tmassistantsdk/storage/TMAssistantFile:getSavePathRootDir	()Ljava/lang/String;
    //   837: aload_0
    //   838: getfield 38	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mDownloadInfo	Lcom/tencent/tmassistantsdk/downloadservice/DownloadInfo;
    //   841: invokevirtual 245	com/tencent/tmassistantsdk/downloadservice/DownloadInfo:getTotalSize	()J
    //   844: invokestatic 363	com/tencent/tmassistantsdk/downloadservice/DownloadHelper:isSpaceEnough	(Ljava/lang/String;J)Z
    //   847: ifeq +248 -> 1095
    //   850: invokestatic 367	com/tencent/tmassistantsdk/storage/TMAssistantFile:isSDCardExistAndCanWrite	()Z
    //   853: ifeq +158 -> 1011
    //   856: new 70	java/lang/StringBuilder
    //   859: dup
    //   860: ldc_w 369
    //   863: invokespecial 75	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   866: aload_0
    //   867: getfield 38	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mDownloadInfo	Lcom/tencent/tmassistantsdk/downloadservice/DownloadInfo;
    //   870: getfield 150	com/tencent/tmassistantsdk/downloadservice/DownloadInfo:mFileName	Ljava/lang/String;
    //   873: invokevirtual 84	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   876: ldc_w 371
    //   879: invokevirtual 84	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   882: aload_0
    //   883: getfield 38	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mDownloadInfo	Lcom/tencent/tmassistantsdk/downloadservice/DownloadInfo;
    //   886: getfield 333	com/tencent/tmassistantsdk/downloadservice/DownloadInfo:mReceivedBytes	J
    //   889: invokevirtual 259	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   892: ldc_w 373
    //   895: invokevirtual 84	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   898: iload_3
    //   899: invokevirtual 79	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   902: ldc_w 375
    //   905: invokevirtual 84	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   908: aload_0
    //   909: getfield 38	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mDownloadInfo	Lcom/tencent/tmassistantsdk/downloadservice/DownloadInfo;
    //   912: invokevirtual 245	com/tencent/tmassistantsdk/downloadservice/DownloadInfo:getTotalSize	()J
    //   915: invokevirtual 259	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   918: invokevirtual 97	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   921: astore_1
    //   922: ldc 8
    //   924: aload_1
    //   925: invokestatic 264	com/tencent/tmassistantsdk/util/TMLog:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   928: new 125	com/tencent/tmassistantsdk/downloadservice/StopRequestException
    //   931: dup
    //   932: sipush 703
    //   935: aload_1
    //   936: invokespecial 130	com/tencent/tmassistantsdk/downloadservice/StopRequestException:<init>	(ILjava/lang/String;)V
    //   939: athrow
    //   940: astore_1
    //   941: lload 4
    //   943: lstore 6
    //   945: lload 6
    //   947: lstore 4
    //   949: ldc 8
    //   951: aload_1
    //   952: ldc -36
    //   954: iconst_0
    //   955: anewarray 4	java/lang/Object
    //   958: invokestatic 226	com/tencent/mm/sdk/platformtools/x:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   961: lload 6
    //   963: lstore 4
    //   965: new 125	com/tencent/tmassistantsdk/downloadservice/StopRequestException
    //   968: dup
    //   969: sipush 605
    //   972: aload_1
    //   973: invokespecial 342	com/tencent/tmassistantsdk/downloadservice/StopRequestException:<init>	(ILjava/lang/Throwable;)V
    //   976: athrow
    //   977: astore_1
    //   978: aload_0
    //   979: getfield 289	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mSaveFile	Lcom/tencent/tmassistantsdk/storage/TMAssistantFile;
    //   982: ifnull +15 -> 997
    //   985: aload_0
    //   986: getfield 289	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mSaveFile	Lcom/tencent/tmassistantsdk/storage/TMAssistantFile;
    //   989: invokevirtual 312	com/tencent/tmassistantsdk/storage/TMAssistantFile:close	()V
    //   992: aload_0
    //   993: aconst_null
    //   994: putfield 289	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mSaveFile	Lcom/tencent/tmassistantsdk/storage/TMAssistantFile;
    //   997: aload_2
    //   998: lload 4
    //   1000: putfield 315	com/tencent/tmassistantsdk/protocol/jce/DownloadChunkLogInfo:receiveDataSize	J
    //   1003: aload_1
    //   1004: athrow
    //   1005: iconst_0
    //   1006: istore 8
    //   1008: goto -199 -> 809
    //   1011: new 70	java/lang/StringBuilder
    //   1014: dup
    //   1015: ldc_w 377
    //   1018: invokespecial 75	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   1021: aload_0
    //   1022: getfield 38	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mDownloadInfo	Lcom/tencent/tmassistantsdk/downloadservice/DownloadInfo;
    //   1025: getfield 150	com/tencent/tmassistantsdk/downloadservice/DownloadInfo:mFileName	Ljava/lang/String;
    //   1028: invokevirtual 84	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1031: ldc_w 371
    //   1034: invokevirtual 84	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1037: aload_0
    //   1038: getfield 38	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mDownloadInfo	Lcom/tencent/tmassistantsdk/downloadservice/DownloadInfo;
    //   1041: getfield 333	com/tencent/tmassistantsdk/downloadservice/DownloadInfo:mReceivedBytes	J
    //   1044: invokevirtual 259	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   1047: ldc_w 373
    //   1050: invokevirtual 84	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1053: iload_3
    //   1054: invokevirtual 79	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   1057: ldc_w 375
    //   1060: invokevirtual 84	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1063: aload_0
    //   1064: getfield 38	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mDownloadInfo	Lcom/tencent/tmassistantsdk/downloadservice/DownloadInfo;
    //   1067: invokevirtual 245	com/tencent/tmassistantsdk/downloadservice/DownloadInfo:getTotalSize	()J
    //   1070: invokevirtual 259	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   1073: invokevirtual 97	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1076: astore_1
    //   1077: ldc 8
    //   1079: aload_1
    //   1080: invokestatic 264	com/tencent/tmassistantsdk/util/TMLog:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   1083: new 125	com/tencent/tmassistantsdk/downloadservice/StopRequestException
    //   1086: dup
    //   1087: sipush 711
    //   1090: aload_1
    //   1091: invokespecial 130	com/tencent/tmassistantsdk/downloadservice/StopRequestException:<init>	(ILjava/lang/String;)V
    //   1094: athrow
    //   1095: new 70	java/lang/StringBuilder
    //   1098: dup
    //   1099: ldc_w 379
    //   1102: invokespecial 75	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   1105: aload_0
    //   1106: getfield 38	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mDownloadInfo	Lcom/tencent/tmassistantsdk/downloadservice/DownloadInfo;
    //   1109: getfield 150	com/tencent/tmassistantsdk/downloadservice/DownloadInfo:mFileName	Ljava/lang/String;
    //   1112: invokevirtual 84	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1115: ldc_w 371
    //   1118: invokevirtual 84	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1121: aload_0
    //   1122: getfield 38	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mDownloadInfo	Lcom/tencent/tmassistantsdk/downloadservice/DownloadInfo;
    //   1125: getfield 333	com/tencent/tmassistantsdk/downloadservice/DownloadInfo:mReceivedBytes	J
    //   1128: invokevirtual 259	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   1131: ldc_w 373
    //   1134: invokevirtual 84	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1137: iload_3
    //   1138: invokevirtual 79	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   1141: ldc_w 375
    //   1144: invokevirtual 84	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1147: aload_0
    //   1148: getfield 38	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mDownloadInfo	Lcom/tencent/tmassistantsdk/downloadservice/DownloadInfo;
    //   1151: invokevirtual 245	com/tencent/tmassistantsdk/downloadservice/DownloadInfo:getTotalSize	()J
    //   1154: invokevirtual 259	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   1157: invokevirtual 97	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1160: astore_1
    //   1161: ldc 8
    //   1163: aload_1
    //   1164: invokestatic 264	com/tencent/tmassistantsdk/util/TMLog:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   1167: new 125	com/tencent/tmassistantsdk/downloadservice/StopRequestException
    //   1170: dup
    //   1171: sipush 710
    //   1174: aload_1
    //   1175: invokespecial 130	com/tencent/tmassistantsdk/downloadservice/StopRequestException:<init>	(ILjava/lang/String;)V
    //   1178: athrow
    //   1179: aload_0
    //   1180: getfield 38	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mDownloadInfo	Lcom/tencent/tmassistantsdk/downloadservice/DownloadInfo;
    //   1183: iload_3
    //   1184: i2l
    //   1185: invokevirtual 382	com/tencent/tmassistantsdk/downloadservice/DownloadInfo:updateReceivedSize	(J)V
    //   1188: lload 4
    //   1190: iload_3
    //   1191: i2l
    //   1192: ladd
    //   1193: lstore 4
    //   1195: goto -918 -> 277
    //   1198: ldc 8
    //   1200: new 70	java/lang/StringBuilder
    //   1203: dup
    //   1204: ldc_w 384
    //   1207: invokespecial 75	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   1210: iload_3
    //   1211: invokevirtual 79	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   1214: ldc_w 386
    //   1217: invokevirtual 84	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1220: aload_0
    //   1221: getfield 38	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mDownloadInfo	Lcom/tencent/tmassistantsdk/downloadservice/DownloadInfo;
    //   1224: getfield 333	com/tencent/tmassistantsdk/downloadservice/DownloadInfo:mReceivedBytes	J
    //   1227: invokevirtual 259	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   1230: ldc_w 388
    //   1233: invokevirtual 84	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1236: aload_0
    //   1237: getfield 38	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mDownloadInfo	Lcom/tencent/tmassistantsdk/downloadservice/DownloadInfo;
    //   1240: invokevirtual 245	com/tencent/tmassistantsdk/downloadservice/DownloadInfo:getTotalSize	()J
    //   1243: invokevirtual 259	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   1246: ldc_w 390
    //   1249: invokevirtual 84	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1252: invokevirtual 97	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1255: invokestatic 264	com/tencent/tmassistantsdk/util/TMLog:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   1258: new 125	com/tencent/tmassistantsdk/downloadservice/StopRequestException
    //   1261: dup
    //   1262: sipush 703
    //   1265: ldc_w 392
    //   1268: invokespecial 130	com/tencent/tmassistantsdk/downloadservice/StopRequestException:<init>	(ILjava/lang/String;)V
    //   1271: athrow
    //   1272: astore_1
    //   1273: goto -328 -> 945
    //   1276: astore_1
    //   1277: goto -299 -> 978
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	1280	0	this	DownloadTask
    //   0	1280	1	paramHttpResponse	HttpResponse
    //   0	1280	2	paramDownloadChunkLogInfo	DownloadChunkLogInfo
    //   285	926	3	i	int
    //   232	962	4	l1	long
    //   228	734	6	l2	long
    //   807	200	8	bool	boolean
    //   6	229	9	localHttpEntity	HttpEntity
    //   353	280	10	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   461	662	662	java/lang/Throwable
    //   697	724	662	java/lang/Throwable
    //   724	746	662	java/lang/Throwable
    //   461	662	675	finally
    //   663	675	675	finally
    //   697	724	675	finally
    //   724	746	675	finally
    //   277	286	940	java/net/SocketException
    //   290	301	940	java/net/SocketException
    //   768	806	940	java/net/SocketException
    //   809	940	940	java/net/SocketException
    //   1011	1095	940	java/net/SocketException
    //   1095	1179	940	java/net/SocketException
    //   1179	1188	940	java/net/SocketException
    //   1198	1272	940	java/net/SocketException
    //   234	242	977	finally
    //   246	274	977	finally
    //   949	961	977	finally
    //   965	977	977	finally
    //   234	242	1272	java/net/SocketException
    //   246	274	1272	java/net/SocketException
    //   277	286	1276	finally
    //   290	301	1276	finally
    //   768	806	1276	finally
    //   809	940	1276	finally
    //   1011	1095	1276	finally
    //   1095	1179	1276	finally
    //   1179	1188	1276	finally
    //   1198	1272	1276	finally
  }
  
  private void renameApkFileName(HttpResponse paramHttpResponse)
  {
    if (paramHttpResponse == null) {}
    for (;;)
    {
      return;
      if (this.mDownloadInfo.mContentType.equals("application/vnd.android.package-archive"))
      {
        Object localObject = null;
        paramHttpResponse = paramHttpResponse.getHeaders("Content-Disposition");
        if ((paramHttpResponse != null) && (paramHttpResponse.length > 0))
        {
          paramHttpResponse = paramHttpResponse[0].getValue();
          TMLog.i("_DownloadTask", "headerFileName = " + paramHttpResponse);
          if ((!TextUtils.isEmpty(paramHttpResponse)) && (paramHttpResponse.contains("filename=\"")))
          {
            String str = paramHttpResponse.substring(paramHttpResponse.indexOf("filename=\"") + 10);
            paramHttpResponse = (HttpResponse)localObject;
            if (!TextUtils.isEmpty(str))
            {
              paramHttpResponse = str.substring(0, str.indexOf("\""));
              TMLog.i("_DownloadTask", "header file Name =" + paramHttpResponse);
            }
          }
        }
        while (!TextUtils.isEmpty(paramHttpResponse))
        {
          paramHttpResponse = DownloadHelper.correctFileName(DownloadHelper.decodeFileName(paramHttpResponse));
          this.mDownloadInfo.mFileName = paramHttpResponse;
          return;
          paramHttpResponse = DownloadHelper.genAPKFileName(this.mDownloadInfo.mRequestURL);
          continue;
          paramHttpResponse = DownloadHelper.genAPKFileName(this.mDownloadInfo.mRequestURL);
        }
      }
    }
  }
  
  private void setExtraHeaderParam(HttpGet paramHttpGet, Map<String, String> paramMap)
  {
    if ((paramHttpGet != null) && (paramMap != null) && (paramMap.size() > 0))
    {
      paramMap = paramMap.entrySet().iterator();
      while (paramMap.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)paramMap.next();
        paramHttpGet.addHeader((String)localEntry.getKey(), (String)localEntry.getValue());
      }
    }
  }
  
  private void setRangeHeader(HttpGet paramHttpGet, DownloadChunkLogInfo paramDownloadChunkLogInfo)
  {
    String str = DownloadHelper.getNetStatus();
    this.mDownloadInfo.mNetType = str;
    if ((!TextUtils.isEmpty(str)) && ((str.contains("wap")) || ((str.contains("net")) && (this.mDownloadInfo.mRetryCnt > 0)))) {
      try
      {
        int i = DownloadSetting.getSplitSizeInBytes(str);
        long l3 = this.mDownloadInfo.mReceivedBytes;
        if (this.mDownloadInfo.getTotalSize() > 0L)
        {
          long l2 = this.mDownloadInfo.mReceivedBytes + i - 1L;
          l1 = l2;
          if (l2 < this.mDownloadInfo.getTotalSize()) {}
        }
        for (long l1 = this.mDownloadInfo.getTotalSize() - 1L;; l1 = i - 1)
        {
          str = "bytes=" + l3 + "-" + l1;
          paramHttpGet.addHeader("range", str);
          TMLog.d("_DownloadTask", "set range header: " + str);
          paramDownloadChunkLogInfo.responseContentLength = this.mDownloadInfo.getTotalSize();
          paramDownloadChunkLogInfo.requestRanagePosition = l3;
          paramDownloadChunkLogInfo.requestRanageSize = i;
          return;
        }
        str = "bytes=" + this.mDownloadInfo.mReceivedBytes + "-";
      }
      catch (UnsupportedOperationException paramHttpGet)
      {
        x.printErrStackTrace("_DownloadTask", paramHttpGet, "", new Object[0]);
        return;
      }
    }
    paramHttpGet.addHeader("range", str);
    TMLog.d("_DownloadTask", "set range header: " + str);
    paramDownloadChunkLogInfo.responseContentLength = this.mDownloadInfo.getTotalSize();
    paramDownloadChunkLogInfo.requestRanagePosition = this.mDownloadInfo.mReceivedBytes;
    paramDownloadChunkLogInfo.requestRanageSize = 0L;
  }
  
  private boolean shouldRetryConnect()
  {
    boolean bool2 = false;
    if (this.mStopTask)
    {
      TMLog.i("_DownloadTask", "mStopTask = " + this.mStopTask);
      return false;
    }
    try
    {
      Thread.sleep(5000L);
      if (!DownloadHelper.isNetworkConncted())
      {
        int i = 0;
        for (;;)
        {
          if ((!DownloadHelper.isNetworkConncted()) && (i < 5))
          {
            i += 1;
            try
            {
              Thread.sleep(10000L);
            }
            catch (InterruptedException localInterruptedException1)
            {
              this.mDownloadInfo.mDownloadFailedErrCode = 600;
            }
          }
        }
      }
      if (!DownloadHelper.isNetworkConncted())
      {
        TMLog.i("_DownloadTask", "network unconnected");
        return false;
      }
      if ((!DownloadHelper.getNetStatus().equalsIgnoreCase("wifi")) && (!DownloadHelper.getNetStatus().equalsIgnoreCase(this.startDownloadNetType)))
      {
        TMLog.i("_DownloadTask", "not equal netType, current: " + DownloadHelper.getNetStatus() + ", startNetType: " + this.startDownloadNetType);
        return false;
      }
      bool1 = bool2;
      if (this.mDownloadInfo.hasRetryChance())
      {
        DownloadInfo localDownloadInfo = this.mDownloadInfo;
        localDownloadInfo.mRetryCnt += 1;
        this.mDownloadInfo.mRedirectCnt = 0;
      }
      try
      {
        Thread.sleep(5000L);
        bool1 = true;
      }
      catch (InterruptedException localInterruptedException2)
      {
        for (;;)
        {
          this.mDownloadInfo.mDownloadFailedErrCode = 600;
          bool1 = bool2;
        }
      }
      TMLog.i("_DownloadTask", "shouldRetryConnect(" + bool1 + "), retryCnt = " + this.mDownloadInfo.mRetryCnt);
      return bool1;
    }
    catch (InterruptedException localInterruptedException3)
    {
      boolean bool1;
      for (;;) {}
    }
  }
  
  private boolean verifyTotalLen(HttpResponse paramHttpResponse, HttpEntity paramHttpEntity)
  {
    long l;
    if (paramHttpResponse.getStatusLine().getStatusCode() == 200)
    {
      l = paramHttpEntity.getContentLength();
      TMLog.i("_DownloadTask", "verifyTotalLen,totalLen = " + l + "mRequestFileSize = " + this.mDownloadInfo.mRequestFileSize);
      if ((l != -1L) && ((this.mDownloadInfo.mRequestFileSize.longValue() <= 0L) || (l == this.mDownloadInfo.mRequestFileSize.longValue()))) {}
    }
    else
    {
      do
      {
        return false;
        if (paramHttpResponse.getStatusLine().getStatusCode() != 206) {
          break;
        }
        l = ByteRange.getTotalSize(paramHttpResponse.getFirstHeader("content-range").getValue());
        TMLog.i("_DownloadTask", "verifyTotalLen,totalLen = " + l + "mRequestFileSize = " + this.mDownloadInfo.mRequestFileSize);
      } while ((l == -1L) || ((this.mDownloadInfo.mRequestFileSize.longValue() > 0L) && (l != this.mDownloadInfo.mRequestFileSize.longValue())));
    }
    return true;
  }
  
  public void cancel()
  {
    TMLog.i("_DownloadTask", "DownloadTask::cancel url: " + this.mDownloadInfo.mURL);
    this.mStopTask = true;
    if ((this.mHttpGet != null) && (!this.mHttpGet.isAborted())) {
      this.mHttpGet.abort();
    }
  }
  
  /* Error */
  public void exec(String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokestatic 477	com/tencent/tmassistantsdk/downloadservice/DownloadHelper:getNetStatus	()Ljava/lang/String;
    //   4: putfield 52	com/tencent/tmassistantsdk/downloadservice/DownloadTask:startDownloadNetType	Ljava/lang/String;
    //   7: aload_0
    //   8: getfield 38	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mDownloadInfo	Lcom/tencent/tmassistantsdk/downloadservice/DownloadInfo;
    //   11: iconst_1
    //   12: putfield 581	com/tencent/tmassistantsdk/downloadservice/DownloadInfo:mTaskIsRunning	Z
    //   15: aload_0
    //   16: getfield 38	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mDownloadInfo	Lcom/tencent/tmassistantsdk/downloadservice/DownloadInfo;
    //   19: iconst_2
    //   20: iconst_0
    //   21: invokevirtual 585	com/tencent/tmassistantsdk/downloadservice/DownloadInfo:updateStatus	(IZ)V
    //   24: iconst_0
    //   25: istore_3
    //   26: iconst_1
    //   27: istore_2
    //   28: iload_2
    //   29: ifeq +1973 -> 2002
    //   32: invokestatic 591	com/tencent/tmassistantsdk/logreport/DownloadReportManager:getInstance	()Lcom/tencent/tmassistantsdk/logreport/DownloadReportManager;
    //   35: iconst_0
    //   36: invokevirtual 595	com/tencent/tmassistantsdk/logreport/DownloadReportManager:createNewChunkLogInfo	(B)Lcom/tencent/tmassistantsdk/protocol/jce/DownloadChunkLogInfo;
    //   39: astore 5
    //   41: aload 5
    //   43: aload_0
    //   44: getfield 38	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mDownloadInfo	Lcom/tencent/tmassistantsdk/downloadservice/DownloadInfo;
    //   47: getfield 598	com/tencent/tmassistantsdk/downloadservice/DownloadInfo:mUUID	Ljava/lang/String;
    //   50: putfield 601	com/tencent/tmassistantsdk/protocol/jce/DownloadChunkLogInfo:UUID	Ljava/lang/String;
    //   53: aload 5
    //   55: aload_0
    //   56: getfield 38	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mDownloadInfo	Lcom/tencent/tmassistantsdk/downloadservice/DownloadInfo;
    //   59: getfield 123	com/tencent/tmassistantsdk/downloadservice/DownloadInfo:mRetryCnt	I
    //   62: i2b
    //   63: putfield 605	com/tencent/tmassistantsdk/protocol/jce/DownloadChunkLogInfo:currentRetryCnt	B
    //   66: aload 5
    //   68: aload_0
    //   69: invokevirtual 608	com/tencent/tmassistantsdk/downloadservice/DownloadTask:getDownloadURI	()Ljava/lang/String;
    //   72: putfield 611	com/tencent/tmassistantsdk/protocol/jce/DownloadChunkLogInfo:requestUrl	Ljava/lang/String;
    //   75: aload_0
    //   76: getfield 32	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mStopTask	Z
    //   79: ifne +1923 -> 2002
    //   82: aload_0
    //   83: getfield 54	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mIsRedirect	Z
    //   86: ifeq +20 -> 106
    //   89: aload_0
    //   90: getfield 207	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mRequestUrl	Ljava/lang/String;
    //   93: ifnull +13 -> 106
    //   96: aload_0
    //   97: getfield 207	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mRequestUrl	Ljava/lang/String;
    //   100: invokevirtual 614	java/lang/String:length	()I
    //   103: ifne +404 -> 507
    //   106: iload_3
    //   107: ifeq +389 -> 496
    //   110: aload_0
    //   111: getfield 38	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mDownloadInfo	Lcom/tencent/tmassistantsdk/downloadservice/DownloadInfo;
    //   114: getfield 617	com/tencent/tmassistantsdk/downloadservice/DownloadInfo:mSecondaryUrl	Ljava/lang/String;
    //   117: astore_1
    //   118: aload_0
    //   119: aload_1
    //   120: putfield 207	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mRequestUrl	Ljava/lang/String;
    //   123: ldc 8
    //   125: new 70	java/lang/StringBuilder
    //   128: dup
    //   129: ldc_w 619
    //   132: invokespecial 75	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   135: aload_0
    //   136: getfield 54	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mIsRedirect	Z
    //   139: invokevirtual 511	java/lang/StringBuilder:append	(Z)Ljava/lang/StringBuilder;
    //   142: invokevirtual 97	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   145: invokestatic 103	com/tencent/tmassistantsdk/util/TMLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   148: ldc 8
    //   150: new 70	java/lang/StringBuilder
    //   153: dup
    //   154: ldc_w 621
    //   157: invokespecial 75	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   160: iload_3
    //   161: invokevirtual 511	java/lang/StringBuilder:append	(Z)Ljava/lang/StringBuilder;
    //   164: invokevirtual 97	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   167: invokestatic 103	com/tencent/tmassistantsdk/util/TMLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   170: ldc 8
    //   172: new 70	java/lang/StringBuilder
    //   175: dup
    //   176: ldc_w 623
    //   179: invokespecial 75	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   182: aload_1
    //   183: invokevirtual 84	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   186: invokevirtual 97	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   189: invokestatic 103	com/tencent/tmassistantsdk/util/TMLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   192: aload_0
    //   193: iconst_0
    //   194: putfield 54	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mIsRedirect	Z
    //   197: aload_0
    //   198: invokestatic 629	com/tencent/tmassistantsdk/downloadservice/HttpClientUtil:createHttpClient	()Lorg/apache/http/client/HttpClient;
    //   201: putfield 34	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpClient	Lorg/apache/http/client/HttpClient;
    //   204: aload_0
    //   205: getfield 34	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpClient	Lorg/apache/http/client/HttpClient;
    //   208: invokestatic 633	com/tencent/tmassistantsdk/downloadservice/HttpClientUtil:setProxy	(Lorg/apache/http/client/HttpClient;)V
    //   211: aload_0
    //   212: new 465	org/apache/http/client/methods/HttpGet
    //   215: dup
    //   216: invokespecial 634	org/apache/http/client/methods/HttpGet:<init>	()V
    //   219: putfield 36	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpGet	Lorg/apache/http/client/methods/HttpGet;
    //   222: new 636	java/net/URI
    //   225: dup
    //   226: aload_1
    //   227: invokespecial 637	java/net/URI:<init>	(Ljava/lang/String;)V
    //   230: astore_1
    //   231: aload_0
    //   232: getfield 36	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpGet	Lorg/apache/http/client/methods/HttpGet;
    //   235: aload_1
    //   236: invokevirtual 641	org/apache/http/client/methods/HttpGet:setURI	(Ljava/net/URI;)V
    //   239: aload_0
    //   240: aload_0
    //   241: getfield 36	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpGet	Lorg/apache/http/client/methods/HttpGet;
    //   244: aload_0
    //   245: getfield 38	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mDownloadInfo	Lcom/tencent/tmassistantsdk/downloadservice/DownloadInfo;
    //   248: invokevirtual 645	com/tencent/tmassistantsdk/downloadservice/DownloadInfo:getHeaderParams	()Ljava/util/HashMap;
    //   251: invokespecial 647	com/tencent/tmassistantsdk/downloadservice/DownloadTask:setExtraHeaderParam	(Lorg/apache/http/client/methods/HttpGet;Ljava/util/Map;)V
    //   254: aload_0
    //   255: aload_0
    //   256: getfield 36	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpGet	Lorg/apache/http/client/methods/HttpGet;
    //   259: aload 5
    //   261: invokespecial 649	com/tencent/tmassistantsdk/downloadservice/DownloadTask:setRangeHeader	(Lorg/apache/http/client/methods/HttpGet;Lcom/tencent/tmassistantsdk/protocol/jce/DownloadChunkLogInfo;)V
    //   264: aload_1
    //   265: invokevirtual 652	java/net/URI:getScheme	()Ljava/lang/String;
    //   268: ldc_w 654
    //   271: invokevirtual 147	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   274: ifeq +48 -> 322
    //   277: invokestatic 660	org/apache/http/conn/ssl/SSLSocketFactory:getSocketFactory	()Lorg/apache/http/conn/ssl/SSLSocketFactory;
    //   280: astore_1
    //   281: aload_1
    //   282: getstatic 664	org/apache/http/conn/ssl/SSLSocketFactory:BROWSER_COMPATIBLE_HOSTNAME_VERIFIER	Lorg/apache/http/conn/ssl/X509HostnameVerifier;
    //   285: invokevirtual 668	org/apache/http/conn/ssl/SSLSocketFactory:setHostnameVerifier	(Lorg/apache/http/conn/ssl/X509HostnameVerifier;)V
    //   288: new 670	org/apache/http/conn/scheme/Scheme
    //   291: dup
    //   292: ldc_w 654
    //   295: aload_1
    //   296: sipush 443
    //   299: invokespecial 673	org/apache/http/conn/scheme/Scheme:<init>	(Ljava/lang/String;Lorg/apache/http/conn/scheme/SocketFactory;I)V
    //   302: astore_1
    //   303: aload_0
    //   304: getfield 34	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpClient	Lorg/apache/http/client/HttpClient;
    //   307: invokeinterface 679 1 0
    //   312: invokeinterface 685 1 0
    //   317: aload_1
    //   318: invokevirtual 691	org/apache/http/conn/scheme/SchemeRegistry:register	(Lorg/apache/http/conn/scheme/Scheme;)Lorg/apache/http/conn/scheme/Scheme;
    //   321: pop
    //   322: ldc 8
    //   324: new 70	java/lang/StringBuilder
    //   327: dup
    //   328: ldc_w 693
    //   331: invokespecial 75	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   334: invokestatic 90	java/lang/Thread:currentThread	()Ljava/lang/Thread;
    //   337: invokevirtual 94	java/lang/Thread:getName	()Ljava/lang/String;
    //   340: invokevirtual 84	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   343: invokevirtual 97	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   346: invokestatic 103	com/tencent/tmassistantsdk/util/TMLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   349: aload_0
    //   350: getfield 34	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpClient	Lorg/apache/http/client/HttpClient;
    //   353: aload_0
    //   354: getfield 36	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpGet	Lorg/apache/http/client/methods/HttpGet;
    //   357: invokeinterface 697 2 0
    //   362: astore_1
    //   363: aload_1
    //   364: ifnonnull +151 -> 515
    //   367: new 125	com/tencent/tmassistantsdk/downloadservice/StopRequestException
    //   370: dup
    //   371: sipush 701
    //   374: new 70	java/lang/StringBuilder
    //   377: dup
    //   378: ldc_w 699
    //   381: invokespecial 75	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   384: invokestatic 90	java/lang/Thread:currentThread	()Ljava/lang/Thread;
    //   387: invokevirtual 94	java/lang/Thread:getName	()Ljava/lang/String;
    //   390: invokevirtual 84	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   393: invokevirtual 97	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   396: invokespecial 130	com/tencent/tmassistantsdk/downloadservice/StopRequestException:<init>	(ILjava/lang/String;)V
    //   399: athrow
    //   400: astore_1
    //   401: aload_0
    //   402: getfield 32	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mStopTask	Z
    //   405: istore_2
    //   406: iload_2
    //   407: ifeq +219 -> 626
    //   410: iconst_0
    //   411: istore 4
    //   413: aload_0
    //   414: getfield 36	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpGet	Lorg/apache/http/client/methods/HttpGet;
    //   417: ifnull +25 -> 442
    //   420: aload_0
    //   421: getfield 36	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpGet	Lorg/apache/http/client/methods/HttpGet;
    //   424: invokevirtual 564	org/apache/http/client/methods/HttpGet:isAborted	()Z
    //   427: ifne +10 -> 437
    //   430: aload_0
    //   431: getfield 36	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpGet	Lorg/apache/http/client/methods/HttpGet;
    //   434: invokevirtual 567	org/apache/http/client/methods/HttpGet:abort	()V
    //   437: aload_0
    //   438: aconst_null
    //   439: putfield 36	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpGet	Lorg/apache/http/client/methods/HttpGet;
    //   442: aload_0
    //   443: getfield 34	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpClient	Lorg/apache/http/client/HttpClient;
    //   446: ifnull +22 -> 468
    //   449: aload_0
    //   450: getfield 34	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpClient	Lorg/apache/http/client/HttpClient;
    //   453: invokeinterface 679 1 0
    //   458: invokeinterface 702 1 0
    //   463: aload_0
    //   464: aconst_null
    //   465: putfield 34	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpClient	Lorg/apache/http/client/HttpClient;
    //   468: iload 4
    //   470: istore_2
    //   471: aload_0
    //   472: getfield 289	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mSaveFile	Lcom/tencent/tmassistantsdk/storage/TMAssistantFile;
    //   475: ifnull +1683 -> 2158
    //   478: aload_0
    //   479: getfield 289	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mSaveFile	Lcom/tencent/tmassistantsdk/storage/TMAssistantFile;
    //   482: invokevirtual 312	com/tencent/tmassistantsdk/storage/TMAssistantFile:close	()V
    //   485: aload_0
    //   486: aconst_null
    //   487: putfield 289	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mSaveFile	Lcom/tencent/tmassistantsdk/storage/TMAssistantFile;
    //   490: iload 4
    //   492: istore_2
    //   493: goto -465 -> 28
    //   496: aload_0
    //   497: getfield 38	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mDownloadInfo	Lcom/tencent/tmassistantsdk/downloadservice/DownloadInfo;
    //   500: getfield 427	com/tencent/tmassistantsdk/downloadservice/DownloadInfo:mRequestURL	Ljava/lang/String;
    //   503: astore_1
    //   504: goto -386 -> 118
    //   507: aload_0
    //   508: getfield 207	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mRequestUrl	Ljava/lang/String;
    //   511: astore_1
    //   512: goto -389 -> 123
    //   515: aload_0
    //   516: aload_1
    //   517: aload 5
    //   519: invokespecial 704	com/tencent/tmassistantsdk/downloadservice/DownloadTask:handleResponseCode	(Lorg/apache/http/HttpResponse;Lcom/tencent/tmassistantsdk/protocol/jce/DownloadChunkLogInfo;)V
    //   522: aload_0
    //   523: getfield 38	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mDownloadInfo	Lcom/tencent/tmassistantsdk/downloadservice/DownloadInfo;
    //   526: invokevirtual 707	com/tencent/tmassistantsdk/downloadservice/DownloadInfo:hasReceivedAllDataBytes	()Z
    //   529: istore_2
    //   530: iload_2
    //   531: ifne +89 -> 620
    //   534: iconst_1
    //   535: istore 4
    //   537: aload_0
    //   538: getfield 36	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpGet	Lorg/apache/http/client/methods/HttpGet;
    //   541: ifnull +25 -> 566
    //   544: aload_0
    //   545: getfield 36	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpGet	Lorg/apache/http/client/methods/HttpGet;
    //   548: invokevirtual 564	org/apache/http/client/methods/HttpGet:isAborted	()Z
    //   551: ifne +10 -> 561
    //   554: aload_0
    //   555: getfield 36	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpGet	Lorg/apache/http/client/methods/HttpGet;
    //   558: invokevirtual 567	org/apache/http/client/methods/HttpGet:abort	()V
    //   561: aload_0
    //   562: aconst_null
    //   563: putfield 36	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpGet	Lorg/apache/http/client/methods/HttpGet;
    //   566: aload_0
    //   567: getfield 34	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpClient	Lorg/apache/http/client/HttpClient;
    //   570: ifnull +22 -> 592
    //   573: aload_0
    //   574: getfield 34	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpClient	Lorg/apache/http/client/HttpClient;
    //   577: invokeinterface 679 1 0
    //   582: invokeinterface 702 1 0
    //   587: aload_0
    //   588: aconst_null
    //   589: putfield 34	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpClient	Lorg/apache/http/client/HttpClient;
    //   592: iload 4
    //   594: istore_2
    //   595: aload_0
    //   596: getfield 289	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mSaveFile	Lcom/tencent/tmassistantsdk/storage/TMAssistantFile;
    //   599: ifnull +1559 -> 2158
    //   602: aload_0
    //   603: getfield 289	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mSaveFile	Lcom/tencent/tmassistantsdk/storage/TMAssistantFile;
    //   606: invokevirtual 312	com/tencent/tmassistantsdk/storage/TMAssistantFile:close	()V
    //   609: aload_0
    //   610: aconst_null
    //   611: putfield 289	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mSaveFile	Lcom/tencent/tmassistantsdk/storage/TMAssistantFile;
    //   614: iload 4
    //   616: istore_2
    //   617: goto -589 -> 28
    //   620: iconst_0
    //   621: istore 4
    //   623: goto -86 -> 537
    //   626: ldc 8
    //   628: new 70	java/lang/StringBuilder
    //   631: dup
    //   632: ldc_w 709
    //   635: invokespecial 75	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   638: invokestatic 90	java/lang/Thread:currentThread	()Ljava/lang/Thread;
    //   641: invokevirtual 94	java/lang/Thread:getName	()Ljava/lang/String;
    //   644: invokevirtual 84	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   647: invokevirtual 97	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   650: invokestatic 103	com/tencent/tmassistantsdk/util/TMLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   653: ldc 8
    //   655: aload_1
    //   656: ldc -36
    //   658: iconst_0
    //   659: anewarray 4	java/lang/Object
    //   662: invokestatic 226	com/tencent/mm/sdk/platformtools/x:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   665: aload_0
    //   666: invokespecial 711	com/tencent/tmassistantsdk/downloadservice/DownloadTask:shouldRetryConnect	()Z
    //   669: istore_2
    //   670: iload_2
    //   671: istore 4
    //   673: iload_2
    //   674: ifne -261 -> 413
    //   677: aload_0
    //   678: getfield 38	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mDownloadInfo	Lcom/tencent/tmassistantsdk/downloadservice/DownloadInfo;
    //   681: sipush 601
    //   684: putfield 524	com/tencent/tmassistantsdk/downloadservice/DownloadInfo:mDownloadFailedErrCode	I
    //   687: iload_2
    //   688: istore 4
    //   690: goto -277 -> 413
    //   693: astore_1
    //   694: aload_0
    //   695: getfield 36	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpGet	Lorg/apache/http/client/methods/HttpGet;
    //   698: ifnull +25 -> 723
    //   701: aload_0
    //   702: getfield 36	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpGet	Lorg/apache/http/client/methods/HttpGet;
    //   705: invokevirtual 564	org/apache/http/client/methods/HttpGet:isAborted	()Z
    //   708: ifne +10 -> 718
    //   711: aload_0
    //   712: getfield 36	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpGet	Lorg/apache/http/client/methods/HttpGet;
    //   715: invokevirtual 567	org/apache/http/client/methods/HttpGet:abort	()V
    //   718: aload_0
    //   719: aconst_null
    //   720: putfield 36	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpGet	Lorg/apache/http/client/methods/HttpGet;
    //   723: aload_0
    //   724: getfield 34	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpClient	Lorg/apache/http/client/HttpClient;
    //   727: ifnull +22 -> 749
    //   730: aload_0
    //   731: getfield 34	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpClient	Lorg/apache/http/client/HttpClient;
    //   734: invokeinterface 679 1 0
    //   739: invokeinterface 702 1 0
    //   744: aload_0
    //   745: aconst_null
    //   746: putfield 34	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpClient	Lorg/apache/http/client/HttpClient;
    //   749: aload_0
    //   750: getfield 289	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mSaveFile	Lcom/tencent/tmassistantsdk/storage/TMAssistantFile;
    //   753: ifnull +15 -> 768
    //   756: aload_0
    //   757: getfield 289	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mSaveFile	Lcom/tencent/tmassistantsdk/storage/TMAssistantFile;
    //   760: invokevirtual 312	com/tencent/tmassistantsdk/storage/TMAssistantFile:close	()V
    //   763: aload_0
    //   764: aconst_null
    //   765: putfield 289	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mSaveFile	Lcom/tencent/tmassistantsdk/storage/TMAssistantFile;
    //   768: aload_1
    //   769: athrow
    //   770: astore_1
    //   771: aload_0
    //   772: getfield 32	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mStopTask	Z
    //   775: istore_2
    //   776: iload_2
    //   777: ifeq +89 -> 866
    //   780: iconst_0
    //   781: istore 4
    //   783: aload_0
    //   784: getfield 36	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpGet	Lorg/apache/http/client/methods/HttpGet;
    //   787: ifnull +25 -> 812
    //   790: aload_0
    //   791: getfield 36	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpGet	Lorg/apache/http/client/methods/HttpGet;
    //   794: invokevirtual 564	org/apache/http/client/methods/HttpGet:isAborted	()Z
    //   797: ifne +10 -> 807
    //   800: aload_0
    //   801: getfield 36	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpGet	Lorg/apache/http/client/methods/HttpGet;
    //   804: invokevirtual 567	org/apache/http/client/methods/HttpGet:abort	()V
    //   807: aload_0
    //   808: aconst_null
    //   809: putfield 36	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpGet	Lorg/apache/http/client/methods/HttpGet;
    //   812: aload_0
    //   813: getfield 34	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpClient	Lorg/apache/http/client/HttpClient;
    //   816: ifnull +22 -> 838
    //   819: aload_0
    //   820: getfield 34	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpClient	Lorg/apache/http/client/HttpClient;
    //   823: invokeinterface 679 1 0
    //   828: invokeinterface 702 1 0
    //   833: aload_0
    //   834: aconst_null
    //   835: putfield 34	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpClient	Lorg/apache/http/client/HttpClient;
    //   838: iload 4
    //   840: istore_2
    //   841: aload_0
    //   842: getfield 289	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mSaveFile	Lcom/tencent/tmassistantsdk/storage/TMAssistantFile;
    //   845: ifnull +1313 -> 2158
    //   848: aload_0
    //   849: getfield 289	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mSaveFile	Lcom/tencent/tmassistantsdk/storage/TMAssistantFile;
    //   852: invokevirtual 312	com/tencent/tmassistantsdk/storage/TMAssistantFile:close	()V
    //   855: aload_0
    //   856: aconst_null
    //   857: putfield 289	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mSaveFile	Lcom/tencent/tmassistantsdk/storage/TMAssistantFile;
    //   860: iload 4
    //   862: istore_2
    //   863: goto -835 -> 28
    //   866: ldc 8
    //   868: new 70	java/lang/StringBuilder
    //   871: dup
    //   872: ldc_w 713
    //   875: invokespecial 75	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   878: invokestatic 90	java/lang/Thread:currentThread	()Ljava/lang/Thread;
    //   881: invokevirtual 94	java/lang/Thread:getName	()Ljava/lang/String;
    //   884: invokevirtual 84	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   887: invokevirtual 97	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   890: invokestatic 103	com/tencent/tmassistantsdk/util/TMLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   893: ldc 8
    //   895: aload_1
    //   896: ldc -36
    //   898: iconst_0
    //   899: anewarray 4	java/lang/Object
    //   902: invokestatic 226	com/tencent/mm/sdk/platformtools/x:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   905: aload_0
    //   906: invokespecial 711	com/tencent/tmassistantsdk/downloadservice/DownloadTask:shouldRetryConnect	()Z
    //   909: istore_2
    //   910: iload_2
    //   911: istore 4
    //   913: iload_2
    //   914: ifne -131 -> 783
    //   917: aload_0
    //   918: getfield 38	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mDownloadInfo	Lcom/tencent/tmassistantsdk/downloadservice/DownloadInfo;
    //   921: sipush 602
    //   924: putfield 524	com/tencent/tmassistantsdk/downloadservice/DownloadInfo:mDownloadFailedErrCode	I
    //   927: iload_2
    //   928: istore 4
    //   930: goto -147 -> 783
    //   933: astore_1
    //   934: aload_0
    //   935: getfield 32	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mStopTask	Z
    //   938: istore_2
    //   939: iload_2
    //   940: ifeq +89 -> 1029
    //   943: iconst_0
    //   944: istore 4
    //   946: aload_0
    //   947: getfield 36	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpGet	Lorg/apache/http/client/methods/HttpGet;
    //   950: ifnull +25 -> 975
    //   953: aload_0
    //   954: getfield 36	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpGet	Lorg/apache/http/client/methods/HttpGet;
    //   957: invokevirtual 564	org/apache/http/client/methods/HttpGet:isAborted	()Z
    //   960: ifne +10 -> 970
    //   963: aload_0
    //   964: getfield 36	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpGet	Lorg/apache/http/client/methods/HttpGet;
    //   967: invokevirtual 567	org/apache/http/client/methods/HttpGet:abort	()V
    //   970: aload_0
    //   971: aconst_null
    //   972: putfield 36	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpGet	Lorg/apache/http/client/methods/HttpGet;
    //   975: aload_0
    //   976: getfield 34	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpClient	Lorg/apache/http/client/HttpClient;
    //   979: ifnull +22 -> 1001
    //   982: aload_0
    //   983: getfield 34	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpClient	Lorg/apache/http/client/HttpClient;
    //   986: invokeinterface 679 1 0
    //   991: invokeinterface 702 1 0
    //   996: aload_0
    //   997: aconst_null
    //   998: putfield 34	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpClient	Lorg/apache/http/client/HttpClient;
    //   1001: iload 4
    //   1003: istore_2
    //   1004: aload_0
    //   1005: getfield 289	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mSaveFile	Lcom/tencent/tmassistantsdk/storage/TMAssistantFile;
    //   1008: ifnull +1150 -> 2158
    //   1011: aload_0
    //   1012: getfield 289	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mSaveFile	Lcom/tencent/tmassistantsdk/storage/TMAssistantFile;
    //   1015: invokevirtual 312	com/tencent/tmassistantsdk/storage/TMAssistantFile:close	()V
    //   1018: aload_0
    //   1019: aconst_null
    //   1020: putfield 289	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mSaveFile	Lcom/tencent/tmassistantsdk/storage/TMAssistantFile;
    //   1023: iload 4
    //   1025: istore_2
    //   1026: goto -998 -> 28
    //   1029: ldc 8
    //   1031: new 70	java/lang/StringBuilder
    //   1034: dup
    //   1035: ldc_w 715
    //   1038: invokespecial 75	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   1041: invokestatic 90	java/lang/Thread:currentThread	()Ljava/lang/Thread;
    //   1044: invokevirtual 94	java/lang/Thread:getName	()Ljava/lang/String;
    //   1047: invokevirtual 84	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1050: invokevirtual 97	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1053: invokestatic 103	com/tencent/tmassistantsdk/util/TMLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   1056: ldc 8
    //   1058: aload_1
    //   1059: ldc -36
    //   1061: iconst_0
    //   1062: anewarray 4	java/lang/Object
    //   1065: invokestatic 226	com/tencent/mm/sdk/platformtools/x:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1068: aload_0
    //   1069: invokespecial 711	com/tencent/tmassistantsdk/downloadservice/DownloadTask:shouldRetryConnect	()Z
    //   1072: istore_2
    //   1073: iload_2
    //   1074: istore 4
    //   1076: iload_2
    //   1077: ifne -131 -> 946
    //   1080: aload_0
    //   1081: getfield 38	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mDownloadInfo	Lcom/tencent/tmassistantsdk/downloadservice/DownloadInfo;
    //   1084: sipush 603
    //   1087: putfield 524	com/tencent/tmassistantsdk/downloadservice/DownloadInfo:mDownloadFailedErrCode	I
    //   1090: iload_2
    //   1091: istore 4
    //   1093: goto -147 -> 946
    //   1096: astore_1
    //   1097: aload_0
    //   1098: getfield 32	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mStopTask	Z
    //   1101: istore_2
    //   1102: iload_2
    //   1103: ifeq +82 -> 1185
    //   1106: aload_0
    //   1107: getfield 36	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpGet	Lorg/apache/http/client/methods/HttpGet;
    //   1110: ifnull +25 -> 1135
    //   1113: aload_0
    //   1114: getfield 36	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpGet	Lorg/apache/http/client/methods/HttpGet;
    //   1117: invokevirtual 564	org/apache/http/client/methods/HttpGet:isAborted	()Z
    //   1120: ifne +10 -> 1130
    //   1123: aload_0
    //   1124: getfield 36	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpGet	Lorg/apache/http/client/methods/HttpGet;
    //   1127: invokevirtual 567	org/apache/http/client/methods/HttpGet:abort	()V
    //   1130: aload_0
    //   1131: aconst_null
    //   1132: putfield 36	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpGet	Lorg/apache/http/client/methods/HttpGet;
    //   1135: aload_0
    //   1136: getfield 34	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpClient	Lorg/apache/http/client/HttpClient;
    //   1139: ifnull +22 -> 1161
    //   1142: aload_0
    //   1143: getfield 34	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpClient	Lorg/apache/http/client/HttpClient;
    //   1146: invokeinterface 679 1 0
    //   1151: invokeinterface 702 1 0
    //   1156: aload_0
    //   1157: aconst_null
    //   1158: putfield 34	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpClient	Lorg/apache/http/client/HttpClient;
    //   1161: aload_0
    //   1162: getfield 289	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mSaveFile	Lcom/tencent/tmassistantsdk/storage/TMAssistantFile;
    //   1165: ifnull +1004 -> 2169
    //   1168: aload_0
    //   1169: getfield 289	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mSaveFile	Lcom/tencent/tmassistantsdk/storage/TMAssistantFile;
    //   1172: invokevirtual 312	com/tencent/tmassistantsdk/storage/TMAssistantFile:close	()V
    //   1175: aload_0
    //   1176: aconst_null
    //   1177: putfield 289	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mSaveFile	Lcom/tencent/tmassistantsdk/storage/TMAssistantFile;
    //   1180: iconst_0
    //   1181: istore_2
    //   1182: goto -1154 -> 28
    //   1185: ldc 8
    //   1187: new 70	java/lang/StringBuilder
    //   1190: dup
    //   1191: ldc_w 717
    //   1194: invokespecial 75	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   1197: invokestatic 90	java/lang/Thread:currentThread	()Ljava/lang/Thread;
    //   1200: invokevirtual 94	java/lang/Thread:getName	()Ljava/lang/String;
    //   1203: invokevirtual 84	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1206: invokevirtual 97	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1209: invokestatic 103	com/tencent/tmassistantsdk/util/TMLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   1212: ldc 8
    //   1214: aload_1
    //   1215: ldc -36
    //   1217: iconst_0
    //   1218: anewarray 4	java/lang/Object
    //   1221: invokestatic 226	com/tencent/mm/sdk/platformtools/x:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1224: aload_0
    //   1225: getfield 38	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mDownloadInfo	Lcom/tencent/tmassistantsdk/downloadservice/DownloadInfo;
    //   1228: sipush 600
    //   1231: putfield 524	com/tencent/tmassistantsdk/downloadservice/DownloadInfo:mDownloadFailedErrCode	I
    //   1234: goto -128 -> 1106
    //   1237: astore_1
    //   1238: aload_0
    //   1239: getfield 32	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mStopTask	Z
    //   1242: istore_2
    //   1243: iload_2
    //   1244: ifeq +82 -> 1326
    //   1247: aload_0
    //   1248: getfield 36	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpGet	Lorg/apache/http/client/methods/HttpGet;
    //   1251: ifnull +25 -> 1276
    //   1254: aload_0
    //   1255: getfield 36	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpGet	Lorg/apache/http/client/methods/HttpGet;
    //   1258: invokevirtual 564	org/apache/http/client/methods/HttpGet:isAborted	()Z
    //   1261: ifne +10 -> 1271
    //   1264: aload_0
    //   1265: getfield 36	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpGet	Lorg/apache/http/client/methods/HttpGet;
    //   1268: invokevirtual 567	org/apache/http/client/methods/HttpGet:abort	()V
    //   1271: aload_0
    //   1272: aconst_null
    //   1273: putfield 36	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpGet	Lorg/apache/http/client/methods/HttpGet;
    //   1276: aload_0
    //   1277: getfield 34	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpClient	Lorg/apache/http/client/HttpClient;
    //   1280: ifnull +22 -> 1302
    //   1283: aload_0
    //   1284: getfield 34	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpClient	Lorg/apache/http/client/HttpClient;
    //   1287: invokeinterface 679 1 0
    //   1292: invokeinterface 702 1 0
    //   1297: aload_0
    //   1298: aconst_null
    //   1299: putfield 34	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpClient	Lorg/apache/http/client/HttpClient;
    //   1302: aload_0
    //   1303: getfield 289	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mSaveFile	Lcom/tencent/tmassistantsdk/storage/TMAssistantFile;
    //   1306: ifnull +863 -> 2169
    //   1309: aload_0
    //   1310: getfield 289	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mSaveFile	Lcom/tencent/tmassistantsdk/storage/TMAssistantFile;
    //   1313: invokevirtual 312	com/tencent/tmassistantsdk/storage/TMAssistantFile:close	()V
    //   1316: aload_0
    //   1317: aconst_null
    //   1318: putfield 289	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mSaveFile	Lcom/tencent/tmassistantsdk/storage/TMAssistantFile;
    //   1321: iconst_0
    //   1322: istore_2
    //   1323: goto -1295 -> 28
    //   1326: ldc 8
    //   1328: new 70	java/lang/StringBuilder
    //   1331: dup
    //   1332: ldc_w 719
    //   1335: invokespecial 75	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   1338: invokestatic 90	java/lang/Thread:currentThread	()Ljava/lang/Thread;
    //   1341: invokevirtual 94	java/lang/Thread:getName	()Ljava/lang/String;
    //   1344: invokevirtual 84	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1347: invokevirtual 97	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1350: invokestatic 103	com/tencent/tmassistantsdk/util/TMLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   1353: ldc 8
    //   1355: aload_1
    //   1356: ldc -36
    //   1358: iconst_0
    //   1359: anewarray 4	java/lang/Object
    //   1362: invokestatic 226	com/tencent/mm/sdk/platformtools/x:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1365: aload_0
    //   1366: getfield 38	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mDownloadInfo	Lcom/tencent/tmassistantsdk/downloadservice/DownloadInfo;
    //   1369: sipush 607
    //   1372: putfield 524	com/tencent/tmassistantsdk/downloadservice/DownloadInfo:mDownloadFailedErrCode	I
    //   1375: goto -128 -> 1247
    //   1378: astore_1
    //   1379: aload_0
    //   1380: getfield 32	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mStopTask	Z
    //   1383: istore_2
    //   1384: iload_2
    //   1385: ifeq +89 -> 1474
    //   1388: iconst_0
    //   1389: istore 4
    //   1391: aload_0
    //   1392: getfield 36	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpGet	Lorg/apache/http/client/methods/HttpGet;
    //   1395: ifnull +25 -> 1420
    //   1398: aload_0
    //   1399: getfield 36	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpGet	Lorg/apache/http/client/methods/HttpGet;
    //   1402: invokevirtual 564	org/apache/http/client/methods/HttpGet:isAborted	()Z
    //   1405: ifne +10 -> 1415
    //   1408: aload_0
    //   1409: getfield 36	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpGet	Lorg/apache/http/client/methods/HttpGet;
    //   1412: invokevirtual 567	org/apache/http/client/methods/HttpGet:abort	()V
    //   1415: aload_0
    //   1416: aconst_null
    //   1417: putfield 36	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpGet	Lorg/apache/http/client/methods/HttpGet;
    //   1420: aload_0
    //   1421: getfield 34	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpClient	Lorg/apache/http/client/HttpClient;
    //   1424: ifnull +22 -> 1446
    //   1427: aload_0
    //   1428: getfield 34	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpClient	Lorg/apache/http/client/HttpClient;
    //   1431: invokeinterface 679 1 0
    //   1436: invokeinterface 702 1 0
    //   1441: aload_0
    //   1442: aconst_null
    //   1443: putfield 34	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpClient	Lorg/apache/http/client/HttpClient;
    //   1446: iload 4
    //   1448: istore_2
    //   1449: aload_0
    //   1450: getfield 289	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mSaveFile	Lcom/tencent/tmassistantsdk/storage/TMAssistantFile;
    //   1453: ifnull +705 -> 2158
    //   1456: aload_0
    //   1457: getfield 289	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mSaveFile	Lcom/tencent/tmassistantsdk/storage/TMAssistantFile;
    //   1460: invokevirtual 312	com/tencent/tmassistantsdk/storage/TMAssistantFile:close	()V
    //   1463: aload_0
    //   1464: aconst_null
    //   1465: putfield 289	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mSaveFile	Lcom/tencent/tmassistantsdk/storage/TMAssistantFile;
    //   1468: iload 4
    //   1470: istore_2
    //   1471: goto -1443 -> 28
    //   1474: ldc 8
    //   1476: new 70	java/lang/StringBuilder
    //   1479: dup
    //   1480: ldc_w 721
    //   1483: invokespecial 75	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   1486: invokestatic 90	java/lang/Thread:currentThread	()Ljava/lang/Thread;
    //   1489: invokevirtual 94	java/lang/Thread:getName	()Ljava/lang/String;
    //   1492: invokevirtual 84	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1495: invokevirtual 97	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1498: invokestatic 103	com/tencent/tmassistantsdk/util/TMLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   1501: ldc 8
    //   1503: aload_1
    //   1504: ldc -36
    //   1506: iconst_0
    //   1507: anewarray 4	java/lang/Object
    //   1510: invokestatic 226	com/tencent/mm/sdk/platformtools/x:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1513: aload_0
    //   1514: invokespecial 711	com/tencent/tmassistantsdk/downloadservice/DownloadTask:shouldRetryConnect	()Z
    //   1517: istore_2
    //   1518: iload_2
    //   1519: istore 4
    //   1521: iload_2
    //   1522: ifne -131 -> 1391
    //   1525: aload_0
    //   1526: getfield 38	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mDownloadInfo	Lcom/tencent/tmassistantsdk/downloadservice/DownloadInfo;
    //   1529: sipush 606
    //   1532: putfield 524	com/tencent/tmassistantsdk/downloadservice/DownloadInfo:mDownloadFailedErrCode	I
    //   1535: iload_2
    //   1536: istore 4
    //   1538: goto -147 -> 1391
    //   1541: astore_1
    //   1542: aload_0
    //   1543: getfield 32	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mStopTask	Z
    //   1546: istore_2
    //   1547: iload_2
    //   1548: ifeq +90 -> 1638
    //   1551: iload_3
    //   1552: istore_2
    //   1553: iconst_0
    //   1554: istore 4
    //   1556: aload_0
    //   1557: getfield 36	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpGet	Lorg/apache/http/client/methods/HttpGet;
    //   1560: ifnull +25 -> 1585
    //   1563: aload_0
    //   1564: getfield 36	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpGet	Lorg/apache/http/client/methods/HttpGet;
    //   1567: invokevirtual 564	org/apache/http/client/methods/HttpGet:isAborted	()Z
    //   1570: ifne +10 -> 1580
    //   1573: aload_0
    //   1574: getfield 36	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpGet	Lorg/apache/http/client/methods/HttpGet;
    //   1577: invokevirtual 567	org/apache/http/client/methods/HttpGet:abort	()V
    //   1580: aload_0
    //   1581: aconst_null
    //   1582: putfield 36	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpGet	Lorg/apache/http/client/methods/HttpGet;
    //   1585: aload_0
    //   1586: getfield 34	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpClient	Lorg/apache/http/client/HttpClient;
    //   1589: ifnull +22 -> 1611
    //   1592: aload_0
    //   1593: getfield 34	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpClient	Lorg/apache/http/client/HttpClient;
    //   1596: invokeinterface 679 1 0
    //   1601: invokeinterface 702 1 0
    //   1606: aload_0
    //   1607: aconst_null
    //   1608: putfield 34	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpClient	Lorg/apache/http/client/HttpClient;
    //   1611: aload_0
    //   1612: getfield 289	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mSaveFile	Lcom/tencent/tmassistantsdk/storage/TMAssistantFile;
    //   1615: ifnull +546 -> 2161
    //   1618: aload_0
    //   1619: getfield 289	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mSaveFile	Lcom/tencent/tmassistantsdk/storage/TMAssistantFile;
    //   1622: invokevirtual 312	com/tencent/tmassistantsdk/storage/TMAssistantFile:close	()V
    //   1625: aload_0
    //   1626: aconst_null
    //   1627: putfield 289	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mSaveFile	Lcom/tencent/tmassistantsdk/storage/TMAssistantFile;
    //   1630: iload_2
    //   1631: istore_3
    //   1632: iload 4
    //   1634: istore_2
    //   1635: goto -1607 -> 28
    //   1638: ldc 8
    //   1640: new 70	java/lang/StringBuilder
    //   1643: dup
    //   1644: ldc_w 723
    //   1647: invokespecial 75	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   1650: aload_1
    //   1651: getfield 726	com/tencent/tmassistantsdk/downloadservice/StopRequestException:mFinalErrCode	I
    //   1654: invokevirtual 79	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   1657: ldc 81
    //   1659: invokevirtual 84	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1662: invokestatic 90	java/lang/Thread:currentThread	()Ljava/lang/Thread;
    //   1665: invokevirtual 94	java/lang/Thread:getName	()Ljava/lang/String;
    //   1668: invokevirtual 84	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1671: invokevirtual 97	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1674: invokestatic 103	com/tencent/tmassistantsdk/util/TMLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   1677: ldc 8
    //   1679: aload_1
    //   1680: ldc -36
    //   1682: iconst_0
    //   1683: anewarray 4	java/lang/Object
    //   1686: invokestatic 226	com/tencent/mm/sdk/platformtools/x:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1689: aload_0
    //   1690: getfield 38	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mDownloadInfo	Lcom/tencent/tmassistantsdk/downloadservice/DownloadInfo;
    //   1693: aload_1
    //   1694: getfield 726	com/tencent/tmassistantsdk/downloadservice/StopRequestException:mFinalErrCode	I
    //   1697: putfield 524	com/tencent/tmassistantsdk/downloadservice/DownloadInfo:mDownloadFailedErrCode	I
    //   1700: aload_1
    //   1701: getfield 726	com/tencent/tmassistantsdk/downloadservice/StopRequestException:mFinalErrCode	I
    //   1704: sipush 703
    //   1707: if_icmpeq +467 -> 2174
    //   1710: aload_1
    //   1711: getfield 726	com/tencent/tmassistantsdk/downloadservice/StopRequestException:mFinalErrCode	I
    //   1714: sipush 710
    //   1717: if_icmpeq +457 -> 2174
    //   1720: aload_1
    //   1721: getfield 726	com/tencent/tmassistantsdk/downloadservice/StopRequestException:mFinalErrCode	I
    //   1724: sipush 711
    //   1727: if_icmpne +6 -> 1733
    //   1730: goto +444 -> 2174
    //   1733: sipush 704
    //   1736: aload_1
    //   1737: getfield 726	com/tencent/tmassistantsdk/downloadservice/StopRequestException:mFinalErrCode	I
    //   1740: if_icmpne +43 -> 1783
    //   1743: aload_0
    //   1744: getfield 38	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mDownloadInfo	Lcom/tencent/tmassistantsdk/downloadservice/DownloadInfo;
    //   1747: lconst_0
    //   1748: invokevirtual 254	com/tencent/tmassistantsdk/downloadservice/DownloadInfo:setTotalSize	(J)V
    //   1751: new 291	com/tencent/tmassistantsdk/storage/TMAssistantFile
    //   1754: dup
    //   1755: aload_0
    //   1756: getfield 38	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mDownloadInfo	Lcom/tencent/tmassistantsdk/downloadservice/DownloadInfo;
    //   1759: getfield 294	com/tencent/tmassistantsdk/downloadservice/DownloadInfo:mTempFileName	Ljava/lang/String;
    //   1762: aload_0
    //   1763: getfield 38	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mDownloadInfo	Lcom/tencent/tmassistantsdk/downloadservice/DownloadInfo;
    //   1766: getfield 150	com/tencent/tmassistantsdk/downloadservice/DownloadInfo:mFileName	Ljava/lang/String;
    //   1769: invokespecial 296	com/tencent/tmassistantsdk/storage/TMAssistantFile:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   1772: invokevirtual 729	com/tencent/tmassistantsdk/storage/TMAssistantFile:deleteTempFile	()V
    //   1775: iload_3
    //   1776: istore_2
    //   1777: iconst_0
    //   1778: istore 4
    //   1780: goto -224 -> 1556
    //   1783: sipush 705
    //   1786: aload_1
    //   1787: getfield 726	com/tencent/tmassistantsdk/downloadservice/StopRequestException:mFinalErrCode	I
    //   1790: if_icmpne +38 -> 1828
    //   1793: iload_3
    //   1794: ifne +388 -> 2182
    //   1797: aload_0
    //   1798: getfield 38	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mDownloadInfo	Lcom/tencent/tmassistantsdk/downloadservice/DownloadInfo;
    //   1801: invokevirtual 536	com/tencent/tmassistantsdk/downloadservice/DownloadInfo:hasRetryChance	()Z
    //   1804: ifeq +378 -> 2182
    //   1807: aload_0
    //   1808: getfield 38	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mDownloadInfo	Lcom/tencent/tmassistantsdk/downloadservice/DownloadInfo;
    //   1811: getfield 617	com/tencent/tmassistantsdk/downloadservice/DownloadInfo:mSecondaryUrl	Ljava/lang/String;
    //   1814: invokestatic 170	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   1817: ifne +365 -> 2182
    //   1820: iconst_1
    //   1821: istore_2
    //   1822: iconst_1
    //   1823: istore 4
    //   1825: goto -269 -> 1556
    //   1828: aload_0
    //   1829: invokespecial 711	com/tencent/tmassistantsdk/downloadservice/DownloadTask:shouldRetryConnect	()Z
    //   1832: istore 4
    //   1834: iload_3
    //   1835: istore_2
    //   1836: goto -280 -> 1556
    //   1839: astore_1
    //   1840: aload_0
    //   1841: getfield 32	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mStopTask	Z
    //   1844: istore_2
    //   1845: iload_2
    //   1846: ifeq +89 -> 1935
    //   1849: iconst_0
    //   1850: istore 4
    //   1852: aload_0
    //   1853: getfield 36	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpGet	Lorg/apache/http/client/methods/HttpGet;
    //   1856: ifnull +25 -> 1881
    //   1859: aload_0
    //   1860: getfield 36	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpGet	Lorg/apache/http/client/methods/HttpGet;
    //   1863: invokevirtual 564	org/apache/http/client/methods/HttpGet:isAborted	()Z
    //   1866: ifne +10 -> 1876
    //   1869: aload_0
    //   1870: getfield 36	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpGet	Lorg/apache/http/client/methods/HttpGet;
    //   1873: invokevirtual 567	org/apache/http/client/methods/HttpGet:abort	()V
    //   1876: aload_0
    //   1877: aconst_null
    //   1878: putfield 36	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpGet	Lorg/apache/http/client/methods/HttpGet;
    //   1881: aload_0
    //   1882: getfield 34	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpClient	Lorg/apache/http/client/HttpClient;
    //   1885: ifnull +22 -> 1907
    //   1888: aload_0
    //   1889: getfield 34	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpClient	Lorg/apache/http/client/HttpClient;
    //   1892: invokeinterface 679 1 0
    //   1897: invokeinterface 702 1 0
    //   1902: aload_0
    //   1903: aconst_null
    //   1904: putfield 34	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpClient	Lorg/apache/http/client/HttpClient;
    //   1907: iload 4
    //   1909: istore_2
    //   1910: aload_0
    //   1911: getfield 289	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mSaveFile	Lcom/tencent/tmassistantsdk/storage/TMAssistantFile;
    //   1914: ifnull +244 -> 2158
    //   1917: aload_0
    //   1918: getfield 289	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mSaveFile	Lcom/tencent/tmassistantsdk/storage/TMAssistantFile;
    //   1921: invokevirtual 312	com/tencent/tmassistantsdk/storage/TMAssistantFile:close	()V
    //   1924: aload_0
    //   1925: aconst_null
    //   1926: putfield 289	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mSaveFile	Lcom/tencent/tmassistantsdk/storage/TMAssistantFile;
    //   1929: iload 4
    //   1931: istore_2
    //   1932: goto -1904 -> 28
    //   1935: ldc 8
    //   1937: new 70	java/lang/StringBuilder
    //   1940: dup
    //   1941: ldc_w 731
    //   1944: invokespecial 75	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   1947: invokestatic 90	java/lang/Thread:currentThread	()Ljava/lang/Thread;
    //   1950: invokevirtual 94	java/lang/Thread:getName	()Ljava/lang/String;
    //   1953: invokevirtual 84	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1956: invokevirtual 97	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1959: invokestatic 103	com/tencent/tmassistantsdk/util/TMLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   1962: ldc 8
    //   1964: aload_1
    //   1965: ldc -36
    //   1967: iconst_0
    //   1968: anewarray 4	java/lang/Object
    //   1971: invokestatic 226	com/tencent/mm/sdk/platformtools/x:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1974: aload_0
    //   1975: invokespecial 711	com/tencent/tmassistantsdk/downloadservice/DownloadTask:shouldRetryConnect	()Z
    //   1978: istore_2
    //   1979: iload_2
    //   1980: istore 4
    //   1982: iload_2
    //   1983: ifne -131 -> 1852
    //   1986: aload_0
    //   1987: getfield 38	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mDownloadInfo	Lcom/tencent/tmassistantsdk/downloadservice/DownloadInfo;
    //   1990: sipush 604
    //   1993: putfield 524	com/tencent/tmassistantsdk/downloadservice/DownloadInfo:mDownloadFailedErrCode	I
    //   1996: iload_2
    //   1997: istore 4
    //   1999: goto -147 -> 1852
    //   2002: ldc 8
    //   2004: new 70	java/lang/StringBuilder
    //   2007: dup
    //   2008: ldc_w 508
    //   2011: invokespecial 75	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   2014: aload_0
    //   2015: getfield 32	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mStopTask	Z
    //   2018: invokevirtual 511	java/lang/StringBuilder:append	(Z)Ljava/lang/StringBuilder;
    //   2021: ldc 81
    //   2023: invokevirtual 84	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2026: invokestatic 90	java/lang/Thread:currentThread	()Ljava/lang/Thread;
    //   2029: invokevirtual 94	java/lang/Thread:getName	()Ljava/lang/String;
    //   2032: invokevirtual 84	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2035: invokevirtual 97	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   2038: invokestatic 103	com/tencent/tmassistantsdk/util/TMLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   2041: aload_0
    //   2042: getfield 32	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mStopTask	Z
    //   2045: ifne +102 -> 2147
    //   2048: ldc 8
    //   2050: new 70	java/lang/StringBuilder
    //   2053: dup
    //   2054: ldc_w 733
    //   2057: invokespecial 75	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   2060: invokestatic 90	java/lang/Thread:currentThread	()Ljava/lang/Thread;
    //   2063: invokevirtual 94	java/lang/Thread:getName	()Ljava/lang/String;
    //   2066: invokevirtual 84	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2069: ldc_w 735
    //   2072: invokevirtual 84	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2075: aload_0
    //   2076: getfield 38	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mDownloadInfo	Lcom/tencent/tmassistantsdk/downloadservice/DownloadInfo;
    //   2079: getfield 738	com/tencent/tmassistantsdk/downloadservice/DownloadInfo:mStatus	I
    //   2082: invokevirtual 79	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   2085: ldc_w 740
    //   2088: invokevirtual 84	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2091: aload_0
    //   2092: getfield 38	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mDownloadInfo	Lcom/tencent/tmassistantsdk/downloadservice/DownloadInfo;
    //   2095: getfield 524	com/tencent/tmassistantsdk/downloadservice/DownloadInfo:mDownloadFailedErrCode	I
    //   2098: invokevirtual 79	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   2101: invokevirtual 97	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   2104: invokestatic 103	com/tencent/tmassistantsdk/util/TMLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   2107: aload_0
    //   2108: getfield 38	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mDownloadInfo	Lcom/tencent/tmassistantsdk/downloadservice/DownloadInfo;
    //   2111: invokevirtual 707	com/tencent/tmassistantsdk/downloadservice/DownloadInfo:hasReceivedAllDataBytes	()Z
    //   2114: ifeq +21 -> 2135
    //   2117: aload_0
    //   2118: getfield 38	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mDownloadInfo	Lcom/tencent/tmassistantsdk/downloadservice/DownloadInfo;
    //   2121: iconst_4
    //   2122: iload_3
    //   2123: invokevirtual 585	com/tencent/tmassistantsdk/downloadservice/DownloadInfo:updateStatus	(IZ)V
    //   2126: aload_0
    //   2127: getfield 38	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mDownloadInfo	Lcom/tencent/tmassistantsdk/downloadservice/DownloadInfo;
    //   2130: iconst_0
    //   2131: putfield 581	com/tencent/tmassistantsdk/downloadservice/DownloadInfo:mTaskIsRunning	Z
    //   2134: return
    //   2135: aload_0
    //   2136: getfield 38	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mDownloadInfo	Lcom/tencent/tmassistantsdk/downloadservice/DownloadInfo;
    //   2139: iconst_5
    //   2140: iload_3
    //   2141: invokevirtual 585	com/tencent/tmassistantsdk/downloadservice/DownloadInfo:updateStatus	(IZ)V
    //   2144: goto -18 -> 2126
    //   2147: aload_0
    //   2148: getfield 38	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mDownloadInfo	Lcom/tencent/tmassistantsdk/downloadservice/DownloadInfo;
    //   2151: iconst_0
    //   2152: putfield 524	com/tencent/tmassistantsdk/downloadservice/DownloadInfo:mDownloadFailedErrCode	I
    //   2155: goto -29 -> 2126
    //   2158: goto -2130 -> 28
    //   2161: iload_2
    //   2162: istore_3
    //   2163: iload 4
    //   2165: istore_2
    //   2166: goto -2138 -> 28
    //   2169: iconst_0
    //   2170: istore_2
    //   2171: goto -2143 -> 28
    //   2174: iload_3
    //   2175: istore_2
    //   2176: iconst_0
    //   2177: istore 4
    //   2179: goto -623 -> 1556
    //   2182: iload_3
    //   2183: istore_2
    //   2184: iconst_0
    //   2185: istore 4
    //   2187: goto -631 -> 1556
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	2190	0	this	DownloadTask
    //   0	2190	1	paramString	String
    //   27	2157	2	bool1	boolean
    //   25	2158	3	bool2	boolean
    //   411	1775	4	bool3	boolean
    //   39	479	5	localDownloadChunkLogInfo	DownloadChunkLogInfo
    // Exception table:
    //   from	to	target	type
    //   82	106	400	org/apache/http/conn/ConnectTimeoutException
    //   110	118	400	org/apache/http/conn/ConnectTimeoutException
    //   118	123	400	org/apache/http/conn/ConnectTimeoutException
    //   123	322	400	org/apache/http/conn/ConnectTimeoutException
    //   322	363	400	org/apache/http/conn/ConnectTimeoutException
    //   367	400	400	org/apache/http/conn/ConnectTimeoutException
    //   496	504	400	org/apache/http/conn/ConnectTimeoutException
    //   507	512	400	org/apache/http/conn/ConnectTimeoutException
    //   515	530	400	org/apache/http/conn/ConnectTimeoutException
    //   82	106	693	finally
    //   110	118	693	finally
    //   118	123	693	finally
    //   123	322	693	finally
    //   322	363	693	finally
    //   367	400	693	finally
    //   401	406	693	finally
    //   496	504	693	finally
    //   507	512	693	finally
    //   515	530	693	finally
    //   626	670	693	finally
    //   677	687	693	finally
    //   771	776	693	finally
    //   866	910	693	finally
    //   917	927	693	finally
    //   934	939	693	finally
    //   1029	1073	693	finally
    //   1080	1090	693	finally
    //   1097	1102	693	finally
    //   1185	1234	693	finally
    //   1238	1243	693	finally
    //   1326	1375	693	finally
    //   1379	1384	693	finally
    //   1474	1518	693	finally
    //   1525	1535	693	finally
    //   1542	1547	693	finally
    //   1638	1730	693	finally
    //   1733	1775	693	finally
    //   1783	1793	693	finally
    //   1797	1820	693	finally
    //   1828	1834	693	finally
    //   1840	1845	693	finally
    //   1935	1979	693	finally
    //   1986	1996	693	finally
    //   82	106	770	java/net/SocketTimeoutException
    //   110	118	770	java/net/SocketTimeoutException
    //   118	123	770	java/net/SocketTimeoutException
    //   123	322	770	java/net/SocketTimeoutException
    //   322	363	770	java/net/SocketTimeoutException
    //   367	400	770	java/net/SocketTimeoutException
    //   496	504	770	java/net/SocketTimeoutException
    //   507	512	770	java/net/SocketTimeoutException
    //   515	530	770	java/net/SocketTimeoutException
    //   82	106	933	java/net/UnknownHostException
    //   110	118	933	java/net/UnknownHostException
    //   118	123	933	java/net/UnknownHostException
    //   123	322	933	java/net/UnknownHostException
    //   322	363	933	java/net/UnknownHostException
    //   367	400	933	java/net/UnknownHostException
    //   496	504	933	java/net/UnknownHostException
    //   507	512	933	java/net/UnknownHostException
    //   515	530	933	java/net/UnknownHostException
    //   82	106	1096	java/lang/InterruptedException
    //   110	118	1096	java/lang/InterruptedException
    //   118	123	1096	java/lang/InterruptedException
    //   123	322	1096	java/lang/InterruptedException
    //   322	363	1096	java/lang/InterruptedException
    //   367	400	1096	java/lang/InterruptedException
    //   496	504	1096	java/lang/InterruptedException
    //   507	512	1096	java/lang/InterruptedException
    //   515	530	1096	java/lang/InterruptedException
    //   82	106	1237	javax/net/ssl/SSLHandshakeException
    //   110	118	1237	javax/net/ssl/SSLHandshakeException
    //   118	123	1237	javax/net/ssl/SSLHandshakeException
    //   123	322	1237	javax/net/ssl/SSLHandshakeException
    //   322	363	1237	javax/net/ssl/SSLHandshakeException
    //   367	400	1237	javax/net/ssl/SSLHandshakeException
    //   496	504	1237	javax/net/ssl/SSLHandshakeException
    //   507	512	1237	javax/net/ssl/SSLHandshakeException
    //   515	530	1237	javax/net/ssl/SSLHandshakeException
    //   82	106	1378	java/io/IOException
    //   110	118	1378	java/io/IOException
    //   118	123	1378	java/io/IOException
    //   123	322	1378	java/io/IOException
    //   322	363	1378	java/io/IOException
    //   367	400	1378	java/io/IOException
    //   496	504	1378	java/io/IOException
    //   507	512	1378	java/io/IOException
    //   515	530	1378	java/io/IOException
    //   82	106	1541	com/tencent/tmassistantsdk/downloadservice/StopRequestException
    //   110	118	1541	com/tencent/tmassistantsdk/downloadservice/StopRequestException
    //   118	123	1541	com/tencent/tmassistantsdk/downloadservice/StopRequestException
    //   123	322	1541	com/tencent/tmassistantsdk/downloadservice/StopRequestException
    //   322	363	1541	com/tencent/tmassistantsdk/downloadservice/StopRequestException
    //   367	400	1541	com/tencent/tmassistantsdk/downloadservice/StopRequestException
    //   496	504	1541	com/tencent/tmassistantsdk/downloadservice/StopRequestException
    //   507	512	1541	com/tencent/tmassistantsdk/downloadservice/StopRequestException
    //   515	530	1541	com/tencent/tmassistantsdk/downloadservice/StopRequestException
    //   82	106	1839	java/lang/Throwable
    //   110	118	1839	java/lang/Throwable
    //   118	123	1839	java/lang/Throwable
    //   123	322	1839	java/lang/Throwable
    //   322	363	1839	java/lang/Throwable
    //   367	400	1839	java/lang/Throwable
    //   496	504	1839	java/lang/Throwable
    //   507	512	1839	java/lang/Throwable
    //   515	530	1839	java/lang/Throwable
  }
  
  public String getDownloadURI()
  {
    return this.mDownloadInfo.mURL;
  }
  
  public int getPriority()
  {
    return this.mDownloadInfo.mPriority;
  }
  
  public int getTaskId()
  {
    return this.mTaskId;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/tmassistantsdk/downloadservice/DownloadTask.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */