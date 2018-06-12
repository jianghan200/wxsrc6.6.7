package com.tencent.mm.plugin.music.c.a;

import android.text.TextUtils;
import com.tencent.mm.plugin.music.cache.c;
import com.tencent.mm.plugin.music.cache.e;
import com.tencent.mm.plugin.music.cache.f;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.qqmusic.mediaplayer.network.IMediaHTTPConnection;
import com.tencent.qqmusic.mediaplayer.util.Logger;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.NoRouteToHostException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.URL;
import java.net.UnknownServiceException;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class a
  implements IMediaHTTPConnection
{
  private com.tencent.mm.plugin.music.cache.a lAg;
  public URL lAh = null;
  private boolean mAllowCrossDomainRedirect = true;
  private boolean mAllowCrossProtocolRedirect = true;
  private HttpURLConnection mConnection = null;
  private long mCurrentOffset = -1L;
  private Map<String, String> mHeaders = null;
  private InputStream mInputStream = null;
  private String mMimeType = "";
  private long mTotalSize = -1L;
  private URL mURL = null;
  
  private static final boolean isLocalHost(URL paramURL)
  {
    if (paramURL == null) {}
    for (;;)
    {
      return false;
      paramURL = paramURL.getHost();
      if (paramURL != null) {
        try
        {
          boolean bool = paramURL.equalsIgnoreCase("localhost");
          if (bool) {
            return true;
          }
        }
        catch (IllegalArgumentException paramURL)
        {
          Logger.e("MicroMsg.MMMediaHTTPConnection", "isLocalHost IllegalArgumentException:%s", new Object[] { String.valueOf(paramURL) });
        }
      }
    }
    return false;
  }
  
  private void seekTo(long paramLong)
  {
    teardownConnection();
    j = 0;
    int i = j;
    try
    {
      localObject1 = this.mURL;
      i = j;
      bool1 = isLocalHost((URL)localObject1);
      k = 0;
      j = 0;
    }
    catch (IOException localIOException2)
    {
      for (;;)
      {
        Object localObject1;
        boolean bool1;
        int k;
        int m;
        continue;
        j = m;
      }
    }
    if (bool1) {}
    label262:
    label888:
    for (;;)
    {
      try
      {
        this.mConnection = ((HttpURLConnection)((URL)localObject1).openConnection(Proxy.NO_PROXY));
        this.mConnection.setConnectTimeout(30000);
        this.mConnection.setInstanceFollowRedirects(this.mAllowCrossDomainRedirect);
        m = 0;
        i = 0;
        if (this.mHeaders == null) {
          break label262;
        }
        localObject1 = this.mHeaders.entrySet().iterator();
        m = i;
        if (!((Iterator)localObject1).hasNext()) {
          break label262;
        }
        Map.Entry localEntry = (Map.Entry)((Iterator)localObject1).next();
        this.mConnection.setRequestProperty((String)localEntry.getKey(), (String)localEntry.getValue());
        if ((i != 0) || (!"Accept-Encoding".equals(localEntry.getKey()))) {
          break label888;
        }
        i = 1;
      }
      catch (IOException localIOException1)
      {
        i = j;
        this.mTotalSize = -1L;
        this.mInputStream = null;
        this.mConnection = null;
        this.mCurrentOffset = -1L;
        Logger.e("MicroMsg.MMMediaHTTPConnection", "seekTo exception:%s", new Object[] { localIOException1 + ", response:" + i });
        throw localIOException1;
      }
      this.mConnection = ((HttpURLConnection)((URL)localObject1).openConnection());
      continue;
      if (paramLong > 0L) {
        this.mConnection.setRequestProperty("Range", "bytes=" + paramLong + "-");
      }
      if (m == 0) {
        this.mConnection.setRequestProperty("Accept-Encoding", "");
      }
      m = this.mConnection.getResponseCode();
      e.bL(this.lAh.toString(), m);
      Object localObject2;
      if ((m == 300) || (m == 301) || (m == 302) || (m == 303) || (m == 307))
      {
        k += 1;
        if (k > 20)
        {
          i = m;
          throw new NoRouteToHostException("Too many redirects: " + k);
        }
        i = m;
        localObject2 = this.mConnection.getRequestMethod();
        if (m == 307)
        {
          i = m;
          if (!((String)localObject2).equals("GET"))
          {
            i = m;
            if (!((String)localObject2).equals("HEAD"))
            {
              i = m;
              throw new NoRouteToHostException("Invalid redirect");
            }
          }
        }
        i = m;
        localObject2 = this.mConnection.getHeaderField("Location");
        if (localObject2 == null)
        {
          i = m;
          throw new NoRouteToHostException("Invalid redirect");
        }
        i = m;
        localObject2 = new URL(this.mURL, (String)localObject2);
        i = m;
        if (!((URL)localObject2).getProtocol().equals("https"))
        {
          i = m;
          if (!((URL)localObject2).getProtocol().equals("http"))
          {
            i = m;
            throw new NoRouteToHostException("Unsupported protocol redirect");
          }
        }
        i = m;
        boolean bool2 = this.mURL.getProtocol().equals(((URL)localObject2).getProtocol());
        i = m;
        if ((!this.mAllowCrossProtocolRedirect) && (!bool2))
        {
          i = m;
          throw new NoRouteToHostException("Cross-protocol redirects are disallowed");
        }
        i = m;
        bool2 = this.mURL.getHost().equals(((URL)localObject2).getHost());
        i = m;
        if ((!this.mAllowCrossDomainRedirect) && (!bool2))
        {
          i = m;
          throw new NoRouteToHostException("Cross-domain redirects are disallowed");
        }
        if (m == 307) {
          break;
        }
        i = m;
        this.mURL = ((URL)localObject2);
        break;
      }
      i = m;
      if (this.mAllowCrossDomainRedirect)
      {
        i = m;
        this.mURL = this.mConnection.getURL();
      }
      if (m == 206)
      {
        i = m;
        localObject2 = this.mConnection.getHeaderField("Content-Range");
        i = m;
        this.mTotalSize = -1L;
        if (localObject2 != null)
        {
          i = m;
          j = ((String)localObject2).lastIndexOf('/');
          if (j >= 0)
          {
            i = m;
            localObject2 = ((String)localObject2).substring(j + 1);
            i = m;
          }
        }
      }
      try
      {
        for (this.mTotalSize = bi.getLong((String)localObject2, 0L); (paramLong > 0L) && (m != 206); this.mTotalSize = this.mConnection.getContentLength())
        {
          i = m;
          throw new ProtocolException();
          if (m != 200)
          {
            i = m;
            throw new IOException();
          }
          i = m;
        }
        i = m;
        this.mInputStream = new BufferedInputStream(this.mConnection.getInputStream());
        i = m;
        this.mCurrentOffset = paramLong;
        return;
      }
      catch (NumberFormatException localNumberFormatException)
      {
        for (;;) {}
      }
    }
  }
  
  private void teardownConnection()
  {
    if (this.mConnection != null)
    {
      this.mInputStream = null;
      this.mConnection.disconnect();
      this.mConnection = null;
      this.mCurrentOffset = -1L;
    }
  }
  
  /* Error */
  public final boolean connect(URL paramURL, Map<String, String> paramMap)
  {
    // Byte code:
    //   0: ldc 75
    //   2: ldc_w 286
    //   5: invokestatic 289	com/tencent/qqmusic/mediaplayer/util/Logger:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   8: ldc 75
    //   10: new 165	java/lang/StringBuilder
    //   13: dup
    //   14: ldc_w 291
    //   17: invokespecial 188	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   20: aload_1
    //   21: invokevirtual 170	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   24: ldc_w 293
    //   27: invokevirtual 175	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   30: aload_2
    //   31: invokevirtual 170	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   34: invokevirtual 181	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   37: invokestatic 289	com/tencent/qqmusic/mediaplayer/util/Logger:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   40: aload_0
    //   41: invokevirtual 294	com/tencent/mm/plugin/music/c/a/a:disconnect	()V
    //   44: aload_0
    //   45: iconst_1
    //   46: putfield 52	com/tencent/mm/plugin/music/c/a/a:mAllowCrossDomainRedirect	Z
    //   49: aload_0
    //   50: aload_1
    //   51: putfield 36	com/tencent/mm/plugin/music/c/a/a:mURL	Ljava/net/URL;
    //   54: aload_0
    //   55: aload_1
    //   56: putfield 38	com/tencent/mm/plugin/music/c/a/a:lAh	Ljava/net/URL;
    //   59: aload_0
    //   60: aload_2
    //   61: putfield 40	com/tencent/mm/plugin/music/c/a/a:mHeaders	Ljava/util/Map;
    //   64: aload_0
    //   65: ldc2_w 31
    //   68: putfield 44	com/tencent/mm/plugin/music/c/a/a:mTotalSize	J
    //   71: aload_0
    //   72: ldc 46
    //   74: putfield 48	com/tencent/mm/plugin/music/c/a/a:mMimeType	Ljava/lang/String;
    //   77: invokestatic 299	com/tencent/mm/sdk/platformtools/ad:cic	()Z
    //   80: ifeq +74 -> 154
    //   83: ldc_w 301
    //   86: invokestatic 307	com/tencent/mm/kernel/g:l	(Ljava/lang/Class;)Lcom/tencent/mm/kernel/c/a;
    //   89: checkcast 301	com/tencent/mm/an/a/a
    //   92: aload_0
    //   93: getfield 36	com/tencent/mm/plugin/music/c/a/a:mURL	Ljava/net/URL;
    //   96: invokevirtual 198	java/net/URL:toString	()Ljava/lang/String;
    //   99: invokeinterface 310 2 0
    //   104: astore_1
    //   105: aload_1
    //   106: invokestatic 316	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   109: ifne +45 -> 154
    //   112: aload_1
    //   113: aload_0
    //   114: getfield 36	com/tencent/mm/plugin/music/c/a/a:mURL	Ljava/net/URL;
    //   117: invokevirtual 198	java/net/URL:toString	()Ljava/lang/String;
    //   120: invokevirtual 73	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
    //   123: ifne +31 -> 154
    //   126: ldc 75
    //   128: ldc_w 318
    //   131: iconst_1
    //   132: anewarray 4	java/lang/Object
    //   135: dup
    //   136: iconst_0
    //   137: aload_1
    //   138: aastore
    //   139: invokestatic 322	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   142: aload_0
    //   143: new 61	java/net/URL
    //   146: dup
    //   147: aload_1
    //   148: invokespecial 323	java/net/URL:<init>	(Ljava/lang/String;)V
    //   151: putfield 36	com/tencent/mm/plugin/music/c/a/a:mURL	Ljava/net/URL;
    //   154: aload_0
    //   155: getfield 36	com/tencent/mm/plugin/music/c/a/a:mURL	Ljava/net/URL;
    //   158: ifnull +36 -> 194
    //   161: aload_0
    //   162: getfield 36	com/tencent/mm/plugin/music/c/a/a:mURL	Ljava/net/URL;
    //   165: invokevirtual 198	java/net/URL:toString	()Ljava/lang/String;
    //   168: aload_2
    //   169: invokestatic 327	com/tencent/mm/plugin/music/cache/e:k	(Ljava/lang/String;Ljava/util/Map;)V
    //   172: ldc 75
    //   174: new 165	java/lang/StringBuilder
    //   177: dup
    //   178: ldc_w 329
    //   181: invokespecial 188	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   184: aload_2
    //   185: invokevirtual 170	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   188: invokevirtual 181	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   191: invokestatic 289	com/tencent/qqmusic/mediaplayer/util/Logger:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   194: aload_0
    //   195: new 331	com/tencent/mm/plugin/music/cache/a
    //   198: dup
    //   199: aload_0
    //   200: invokespecial 334	com/tencent/mm/plugin/music/cache/a:<init>	(Lcom/tencent/mm/plugin/music/c/a/a;)V
    //   203: putfield 336	com/tencent/mm/plugin/music/c/a/a:lAg	Lcom/tencent/mm/plugin/music/cache/a;
    //   206: aload_0
    //   207: getfield 336	com/tencent/mm/plugin/music/c/a/a:lAg	Lcom/tencent/mm/plugin/music/cache/a;
    //   210: astore_1
    //   211: aload_1
    //   212: getfield 340	com/tencent/mm/plugin/music/cache/a:lxo	Lcom/tencent/mm/plugin/music/c/a/a;
    //   215: getfield 38	com/tencent/mm/plugin/music/c/a/a:lAh	Ljava/net/URL;
    //   218: invokevirtual 198	java/net/URL:toString	()Ljava/lang/String;
    //   221: astore_2
    //   222: aload_1
    //   223: new 342	com/tencent/mm/plugin/music/cache/c
    //   226: dup
    //   227: aload_2
    //   228: invokespecial 343	com/tencent/mm/plugin/music/cache/c:<init>	(Ljava/lang/String;)V
    //   231: putfield 347	com/tencent/mm/plugin/music/cache/a:lxp	Lcom/tencent/mm/plugin/music/cache/c;
    //   234: aload_1
    //   235: getfield 347	com/tencent/mm/plugin/music/cache/a:lxp	Lcom/tencent/mm/plugin/music/cache/c;
    //   238: aload_1
    //   239: getfield 340	com/tencent/mm/plugin/music/cache/a:lxo	Lcom/tencent/mm/plugin/music/c/a/a;
    //   242: invokevirtual 351	com/tencent/mm/plugin/music/c/a/a:getSize	()J
    //   245: putfield 354	com/tencent/mm/plugin/music/cache/c:eyz	J
    //   248: aload_1
    //   249: getfield 347	com/tencent/mm/plugin/music/cache/a:lxp	Lcom/tencent/mm/plugin/music/cache/c;
    //   252: astore 5
    //   254: ldc_w 356
    //   257: ldc_w 358
    //   260: invokestatic 359	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   263: aload 5
    //   265: getfield 354	com/tencent/mm/plugin/music/cache/c:eyz	J
    //   268: lconst_0
    //   269: lcmp
    //   270: ifgt +298 -> 568
    //   273: ldc_w 356
    //   276: ldc_w 361
    //   279: invokestatic 363	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   282: aload_1
    //   283: new 365	com/tencent/mm/plugin/music/cache/f
    //   286: dup
    //   287: aload_2
    //   288: invokespecial 366	com/tencent/mm/plugin/music/cache/f:<init>	(Ljava/lang/String;)V
    //   291: putfield 370	com/tencent/mm/plugin/music/cache/a:lxq	Lcom/tencent/mm/plugin/music/cache/f;
    //   294: new 372	java/io/File
    //   297: dup
    //   298: aload_1
    //   299: getfield 370	com/tencent/mm/plugin/music/cache/a:lxq	Lcom/tencent/mm/plugin/music/cache/f;
    //   302: getfield 375	com/tencent/mm/plugin/music/cache/f:fileName	Ljava/lang/String;
    //   305: invokespecial 376	java/io/File:<init>	(Ljava/lang/String;)V
    //   308: invokevirtual 379	java/io/File:exists	()Z
    //   311: ifne +736 -> 1047
    //   314: ldc_w 381
    //   317: ldc_w 383
    //   320: invokestatic 359	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   323: aload_1
    //   324: getfield 347	com/tencent/mm/plugin/music/cache/a:lxp	Lcom/tencent/mm/plugin/music/cache/c;
    //   327: invokevirtual 386	com/tencent/mm/plugin/music/cache/c:clearCache	()V
    //   330: aload_1
    //   331: getfield 340	com/tencent/mm/plugin/music/cache/a:lxo	Lcom/tencent/mm/plugin/music/c/a/a;
    //   334: invokevirtual 351	com/tencent/mm/plugin/music/c/a/a:getSize	()J
    //   337: lstore_3
    //   338: aload_1
    //   339: getfield 370	com/tencent/mm/plugin/music/cache/a:lxq	Lcom/tencent/mm/plugin/music/cache/f;
    //   342: astore 5
    //   344: ldc_w 388
    //   347: ldc_w 390
    //   350: invokestatic 289	com/tencent/qqmusic/mediaplayer/util/Logger:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   353: new 372	java/io/File
    //   356: dup
    //   357: aload 5
    //   359: getfield 375	com/tencent/mm/plugin/music/cache/f:fileName	Ljava/lang/String;
    //   362: invokespecial 376	java/io/File:<init>	(Ljava/lang/String;)V
    //   365: astore 6
    //   367: aload 6
    //   369: invokevirtual 379	java/io/File:exists	()Z
    //   372: ifne +27 -> 399
    //   375: ldc_w 388
    //   378: ldc_w 392
    //   381: iconst_1
    //   382: anewarray 4	java/lang/Object
    //   385: dup
    //   386: iconst_0
    //   387: aload 6
    //   389: invokevirtual 395	java/io/File:createNewFile	()Z
    //   392: invokestatic 400	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   395: aastore
    //   396: invokestatic 322	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   399: aload 5
    //   401: new 402	java/io/RandomAccessFile
    //   404: dup
    //   405: aload 6
    //   407: ldc_w 404
    //   410: invokespecial 407	java/io/RandomAccessFile:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   413: putfield 411	com/tencent/mm/plugin/music/cache/f:randomAccessFile	Ljava/io/RandomAccessFile;
    //   416: ldc_w 388
    //   419: ldc_w 413
    //   422: iconst_1
    //   423: anewarray 4	java/lang/Object
    //   426: dup
    //   427: iconst_0
    //   428: aload 5
    //   430: getfield 375	com/tencent/mm/plugin/music/cache/f:fileName	Ljava/lang/String;
    //   433: aastore
    //   434: invokestatic 87	com/tencent/qqmusic/mediaplayer/util/Logger:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   437: aload_1
    //   438: getfield 370	com/tencent/mm/plugin/music/cache/a:lxq	Lcom/tencent/mm/plugin/music/cache/f;
    //   441: lload_3
    //   442: invokevirtual 416	com/tencent/mm/plugin/music/cache/f:setLength	(J)V
    //   445: aload_2
    //   446: lload_3
    //   447: invokestatic 419	com/tencent/mm/plugin/music/cache/e:Z	(Ljava/lang/String;J)V
    //   450: ldc_w 381
    //   453: new 165	java/lang/StringBuilder
    //   456: dup
    //   457: ldc_w 421
    //   460: invokespecial 188	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   463: lload_3
    //   464: invokevirtual 191	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   467: ldc_w 423
    //   470: invokevirtual 175	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   473: aload_1
    //   474: getfield 370	com/tencent/mm/plugin/music/cache/a:lxq	Lcom/tencent/mm/plugin/music/cache/f;
    //   477: invokevirtual 426	com/tencent/mm/plugin/music/cache/f:getLength	()I
    //   480: invokevirtual 178	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   483: invokevirtual 181	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   486: invokestatic 359	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   489: aload_1
    //   490: getfield 340	com/tencent/mm/plugin/music/cache/a:lxo	Lcom/tencent/mm/plugin/music/c/a/a;
    //   493: invokevirtual 429	com/tencent/mm/plugin/music/c/a/a:getMIMEType	()Ljava/lang/String;
    //   496: astore 5
    //   498: aload 5
    //   500: invokestatic 316	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   503: ifne +26 -> 529
    //   506: ldc_w 431
    //   509: aload 5
    //   511: invokevirtual 73	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
    //   514: ifne +15 -> 529
    //   517: aload_2
    //   518: aload 5
    //   520: invokestatic 434	com/tencent/mm/plugin/music/cache/e:dR	(Ljava/lang/String;Ljava/lang/String;)V
    //   523: aload_2
    //   524: aload 5
    //   526: invokestatic 437	com/tencent/mm/plugin/music/cache/e:dS	(Ljava/lang/String;Ljava/lang/String;)V
    //   529: aload_1
    //   530: iconst_m1
    //   531: putfield 441	com/tencent/mm/plugin/music/cache/a:tH	I
    //   534: aload_1
    //   535: iconst_0
    //   536: putfield 444	com/tencent/mm/plugin/music/cache/a:fi	I
    //   539: aload_1
    //   540: iconst_m1
    //   541: putfield 447	com/tencent/mm/plugin/music/cache/a:lxr	I
    //   544: aload_1
    //   545: iconst_0
    //   546: putfield 450	com/tencent/mm/plugin/music/cache/a:lxs	I
    //   549: iconst_1
    //   550: ireturn
    //   551: astore_1
    //   552: ldc 75
    //   554: aload_1
    //   555: ldc_w 452
    //   558: iconst_0
    //   559: anewarray 4	java/lang/Object
    //   562: invokestatic 456	com/tencent/mm/sdk/platformtools/x:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   565: goto -411 -> 154
    //   568: aload 5
    //   570: getfield 354	com/tencent/mm/plugin/music/cache/c:eyz	J
    //   573: ldc2_w 457
    //   576: lrem
    //   577: lconst_0
    //   578: lcmp
    //   579: ifeq +15 -> 594
    //   582: aload 5
    //   584: getfield 354	com/tencent/mm/plugin/music/cache/c:eyz	J
    //   587: ldc2_w 457
    //   590: lcmp
    //   591: ifge +133 -> 724
    //   594: aload 5
    //   596: aload 5
    //   598: getfield 354	com/tencent/mm/plugin/music/cache/c:eyz	J
    //   601: ldc2_w 457
    //   604: ldiv
    //   605: l2i
    //   606: putfield 461	com/tencent/mm/plugin/music/cache/c:count	I
    //   609: aload 5
    //   611: getfield 354	com/tencent/mm/plugin/music/cache/c:eyz	J
    //   614: ldc2_w 457
    //   617: lcmp
    //   618: ifgt +18 -> 636
    //   621: ldc_w 356
    //   624: ldc_w 463
    //   627: invokestatic 359	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   630: aload 5
    //   632: iconst_1
    //   633: putfield 461	com/tencent/mm/plugin/music/cache/c:count	I
    //   636: ldc_w 356
    //   639: ldc_w 465
    //   642: iconst_2
    //   643: anewarray 4	java/lang/Object
    //   646: dup
    //   647: iconst_0
    //   648: aload 5
    //   650: getfield 354	com/tencent/mm/plugin/music/cache/c:eyz	J
    //   653: invokestatic 470	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   656: aastore
    //   657: dup
    //   658: iconst_1
    //   659: aload 5
    //   661: getfield 461	com/tencent/mm/plugin/music/cache/c:count	I
    //   664: invokestatic 475	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   667: aastore
    //   668: invokestatic 322	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   671: aload 5
    //   673: new 477	java/util/BitSet
    //   676: dup
    //   677: aload 5
    //   679: getfield 461	com/tencent/mm/plugin/music/cache/c:count	I
    //   682: invokespecial 479	java/util/BitSet:<init>	(I)V
    //   685: putfield 483	com/tencent/mm/plugin/music/cache/c:lxw	Ljava/util/BitSet;
    //   688: aload 5
    //   690: aload 5
    //   692: getfield 486	com/tencent/mm/plugin/music/cache/c:mUrl	Ljava/lang/String;
    //   695: invokestatic 489	com/tencent/mm/plugin/music/cache/e:Ij	(Ljava/lang/String;)Ljava/lang/String;
    //   698: putfield 492	com/tencent/mm/plugin/music/cache/c:lxx	Ljava/lang/String;
    //   701: aload 5
    //   703: getfield 492	com/tencent/mm/plugin/music/cache/c:lxx	Ljava/lang/String;
    //   706: invokestatic 316	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   709: ifeq +35 -> 744
    //   712: ldc_w 356
    //   715: ldc_w 494
    //   718: invokestatic 363	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   721: goto -439 -> 282
    //   724: aload 5
    //   726: aload 5
    //   728: getfield 354	com/tencent/mm/plugin/music/cache/c:eyz	J
    //   731: ldc2_w 457
    //   734: ldiv
    //   735: l2i
    //   736: iconst_1
    //   737: iadd
    //   738: putfield 461	com/tencent/mm/plugin/music/cache/c:count	I
    //   741: goto -132 -> 609
    //   744: ldc_w 356
    //   747: ldc_w 496
    //   750: iconst_1
    //   751: anewarray 4	java/lang/Object
    //   754: dup
    //   755: iconst_0
    //   756: aload 5
    //   758: getfield 492	com/tencent/mm/plugin/music/cache/c:lxx	Ljava/lang/String;
    //   761: aastore
    //   762: invokestatic 322	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   765: ldc_w 498
    //   768: new 500	com/tencent/mm/ipcinvoker/type/IPCString
    //   771: dup
    //   772: aload 5
    //   774: getfield 492	com/tencent/mm/plugin/music/cache/c:lxx	Ljava/lang/String;
    //   777: invokespecial 501	com/tencent/mm/ipcinvoker/type/IPCString:<init>	(Ljava/lang/String;)V
    //   780: ldc_w 503
    //   783: invokestatic 509	com/tencent/mm/ipcinvoker/extension/XIPCInvoker:a	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;
    //   786: checkcast 511	com/tencent/mm/plugin/music/cache/ipc/IPCAudioParamResponse
    //   789: astore 6
    //   791: aload 6
    //   793: ifnonnull +15 -> 808
    //   796: ldc_w 356
    //   799: ldc_w 513
    //   802: invokestatic 363	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   805: goto -523 -> 282
    //   808: ldc_w 356
    //   811: ldc_w 515
    //   814: iconst_1
    //   815: anewarray 4	java/lang/Object
    //   818: dup
    //   819: iconst_0
    //   820: aload 6
    //   822: getfield 518	com/tencent/mm/plugin/music/cache/ipc/IPCAudioParamResponse:lxK	I
    //   825: invokestatic 475	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   828: aastore
    //   829: invokestatic 322	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   832: aload 6
    //   834: getfield 522	com/tencent/mm/plugin/music/cache/ipc/IPCAudioParamResponse:lxI	[B
    //   837: ifnull +12 -> 849
    //   840: aload 6
    //   842: getfield 522	com/tencent/mm/plugin/music/cache/ipc/IPCAudioParamResponse:lxI	[B
    //   845: arraylength
    //   846: ifne +15 -> 861
    //   849: ldc_w 356
    //   852: ldc_w 524
    //   855: invokestatic 363	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   858: goto -576 -> 282
    //   861: aload 5
    //   863: aload 6
    //   865: getfield 522	com/tencent/mm/plugin/music/cache/ipc/IPCAudioParamResponse:lxI	[B
    //   868: invokestatic 530	com/tencent/mm/plugin/music/cache/c$a:aC	([B)Ljava/util/BitSet;
    //   871: putfield 483	com/tencent/mm/plugin/music/cache/c:lxw	Ljava/util/BitSet;
    //   874: aload 5
    //   876: getfield 483	com/tencent/mm/plugin/music/cache/c:lxw	Ljava/util/BitSet;
    //   879: ifnonnull +106 -> 985
    //   882: ldc_w 356
    //   885: ldc_w 532
    //   888: invokestatic 363	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   891: aload 5
    //   893: new 477	java/util/BitSet
    //   896: dup
    //   897: aload 5
    //   899: getfield 461	com/tencent/mm/plugin/music/cache/c:count	I
    //   902: invokespecial 479	java/util/BitSet:<init>	(I)V
    //   905: putfield 483	com/tencent/mm/plugin/music/cache/c:lxw	Ljava/util/BitSet;
    //   908: ldc_w 356
    //   911: new 165	java/lang/StringBuilder
    //   914: dup
    //   915: ldc_w 534
    //   918: invokespecial 188	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   921: aload 5
    //   923: getfield 483	com/tencent/mm/plugin/music/cache/c:lxw	Ljava/util/BitSet;
    //   926: invokevirtual 535	java/util/BitSet:toString	()Ljava/lang/String;
    //   929: invokevirtual 175	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   932: invokevirtual 181	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   935: invokestatic 359	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   938: ldc_w 356
    //   941: new 165	java/lang/StringBuilder
    //   944: dup
    //   945: ldc_w 537
    //   948: invokespecial 188	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   951: aload 5
    //   953: getfield 461	com/tencent/mm/plugin/music/cache/c:count	I
    //   956: invokevirtual 178	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   959: ldc_w 539
    //   962: invokevirtual 175	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   965: aload 5
    //   967: getfield 483	com/tencent/mm/plugin/music/cache/c:lxw	Ljava/util/BitSet;
    //   970: invokevirtual 542	java/util/BitSet:cardinality	()I
    //   973: invokevirtual 178	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   976: invokevirtual 181	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   979: invokestatic 359	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   982: goto -700 -> 282
    //   985: aload 5
    //   987: getfield 461	com/tencent/mm/plugin/music/cache/c:count	I
    //   990: aload 5
    //   992: getfield 483	com/tencent/mm/plugin/music/cache/c:lxw	Ljava/util/BitSet;
    //   995: invokevirtual 542	java/util/BitSet:cardinality	()I
    //   998: if_icmpge -90 -> 908
    //   1001: ldc_w 356
    //   1004: ldc_w 544
    //   1007: iconst_2
    //   1008: anewarray 4	java/lang/Object
    //   1011: dup
    //   1012: iconst_0
    //   1013: aload 5
    //   1015: getfield 461	com/tencent/mm/plugin/music/cache/c:count	I
    //   1018: invokestatic 475	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1021: aastore
    //   1022: dup
    //   1023: iconst_1
    //   1024: aload 5
    //   1026: getfield 483	com/tencent/mm/plugin/music/cache/c:lxw	Ljava/util/BitSet;
    //   1029: invokevirtual 542	java/util/BitSet:cardinality	()I
    //   1032: invokestatic 475	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1035: aastore
    //   1036: invokestatic 545	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1039: aload 5
    //   1041: invokevirtual 386	com/tencent/mm/plugin/music/cache/c:clearCache	()V
    //   1044: goto -136 -> 908
    //   1047: aload_1
    //   1048: getfield 370	com/tencent/mm/plugin/music/cache/a:lxq	Lcom/tencent/mm/plugin/music/cache/f;
    //   1051: invokevirtual 548	com/tencent/mm/plugin/music/cache/f:bhM	()J
    //   1054: aload_1
    //   1055: getfield 340	com/tencent/mm/plugin/music/cache/a:lxo	Lcom/tencent/mm/plugin/music/c/a/a;
    //   1058: invokevirtual 351	com/tencent/mm/plugin/music/c/a/a:getSize	()J
    //   1061: lcmp
    //   1062: ifeq +59 -> 1121
    //   1065: aload_1
    //   1066: getfield 340	com/tencent/mm/plugin/music/cache/a:lxo	Lcom/tencent/mm/plugin/music/c/a/a;
    //   1069: invokevirtual 351	com/tencent/mm/plugin/music/c/a/a:getSize	()J
    //   1072: ldc2_w 31
    //   1075: lcmp
    //   1076: ifeq +45 -> 1121
    //   1079: ldc_w 381
    //   1082: ldc_w 550
    //   1085: invokestatic 359	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   1088: aload_1
    //   1089: getfield 347	com/tencent/mm/plugin/music/cache/a:lxp	Lcom/tencent/mm/plugin/music/cache/c;
    //   1092: invokevirtual 386	com/tencent/mm/plugin/music/cache/c:clearCache	()V
    //   1095: aload_1
    //   1096: getfield 370	com/tencent/mm/plugin/music/cache/a:lxq	Lcom/tencent/mm/plugin/music/cache/f;
    //   1099: astore 5
    //   1101: ldc_w 388
    //   1104: ldc_w 552
    //   1107: invokestatic 289	com/tencent/qqmusic/mediaplayer/util/Logger:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   1110: aload 5
    //   1112: getfield 375	com/tencent/mm/plugin/music/cache/f:fileName	Ljava/lang/String;
    //   1115: invokestatic 554	com/tencent/mm/plugin/music/cache/f:deleteFile	(Ljava/lang/String;)V
    //   1118: goto -788 -> 330
    //   1121: aload_1
    //   1122: getfield 340	com/tencent/mm/plugin/music/cache/a:lxo	Lcom/tencent/mm/plugin/music/c/a/a;
    //   1125: invokevirtual 351	com/tencent/mm/plugin/music/c/a/a:getSize	()J
    //   1128: ldc2_w 31
    //   1131: lcmp
    //   1132: ifne +15 -> 1147
    //   1135: ldc_w 381
    //   1138: ldc_w 556
    //   1141: invokestatic 359	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   1144: goto -814 -> 330
    //   1147: ldc_w 381
    //   1150: ldc_w 558
    //   1153: invokestatic 359	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   1156: goto -826 -> 330
    //   1159: astore 6
    //   1161: ldc_w 388
    //   1164: ldc_w 560
    //   1167: aload 6
    //   1169: invokestatic 563	com/tencent/qqmusic/mediaplayer/util/Logger:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   1172: ldc_w 388
    //   1175: ldc_w 413
    //   1178: iconst_1
    //   1179: anewarray 4	java/lang/Object
    //   1182: dup
    //   1183: iconst_0
    //   1184: aload 5
    //   1186: getfield 375	com/tencent/mm/plugin/music/cache/f:fileName	Ljava/lang/String;
    //   1189: aastore
    //   1190: invokestatic 87	com/tencent/qqmusic/mediaplayer/util/Logger:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1193: goto -756 -> 437
    //   1196: astore 6
    //   1198: ldc_w 388
    //   1201: ldc_w 565
    //   1204: aload 6
    //   1206: invokestatic 563	com/tencent/qqmusic/mediaplayer/util/Logger:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   1209: ldc_w 388
    //   1212: ldc_w 413
    //   1215: iconst_1
    //   1216: anewarray 4	java/lang/Object
    //   1219: dup
    //   1220: iconst_0
    //   1221: aload 5
    //   1223: getfield 375	com/tencent/mm/plugin/music/cache/f:fileName	Ljava/lang/String;
    //   1226: aastore
    //   1227: invokestatic 87	com/tencent/qqmusic/mediaplayer/util/Logger:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1230: goto -793 -> 437
    //   1233: astore_1
    //   1234: ldc_w 388
    //   1237: ldc_w 413
    //   1240: iconst_1
    //   1241: anewarray 4	java/lang/Object
    //   1244: dup
    //   1245: iconst_0
    //   1246: aload 5
    //   1248: getfield 375	com/tencent/mm/plugin/music/cache/f:fileName	Ljava/lang/String;
    //   1251: aastore
    //   1252: invokestatic 87	com/tencent/qqmusic/mediaplayer/util/Logger:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1255: aload_1
    //   1256: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	1257	0	this	a
    //   0	1257	1	paramURL	URL
    //   0	1257	2	paramMap	Map<String, String>
    //   337	127	3	l	long
    //   252	995	5	localObject1	Object
    //   365	499	6	localObject2	Object
    //   1159	9	6	localFileNotFoundException	java.io.FileNotFoundException
    //   1196	9	6	localIOException	IOException
    // Exception table:
    //   from	to	target	type
    //   142	154	551	java/net/MalformedURLException
    //   353	399	1159	java/io/FileNotFoundException
    //   399	416	1159	java/io/FileNotFoundException
    //   353	399	1196	java/io/IOException
    //   399	416	1196	java/io/IOException
    //   353	399	1233	finally
    //   399	416	1233	finally
    //   1161	1172	1233	finally
    //   1198	1209	1233	finally
  }
  
  public final void disconnect()
  {
    Logger.i("MicroMsg.MMMediaHTTPConnection", "disconnect");
    teardownConnection();
    this.mHeaders = null;
    this.mURL = null;
    if (this.lAg != null)
    {
      com.tencent.mm.plugin.music.cache.a locala = this.lAg;
      locala.bhI();
      locala.lxp.bhK();
      locala.lxq.close();
      locala.lxo = null;
      x.i("MicroMsg.FileBytesCacheMgr", "detach()");
      this.lAg = null;
    }
  }
  
  public final String getMIMEType()
  {
    Object localObject;
    if (!TextUtils.isEmpty(this.mMimeType))
    {
      Logger.i("MicroMsg.MMMediaHTTPConnection", "getMIMEType mimeType:" + this.mMimeType);
      localObject = this.mMimeType;
      return (String)localObject;
    }
    String str1 = e.Im(this.lAh.toString());
    if (!TextUtils.isEmpty(str1))
    {
      this.mMimeType = str1;
      return str1;
    }
    if (this.mConnection == null) {}
    for (;;)
    {
      try
      {
        l = System.currentTimeMillis();
        seekTo(0L);
        str1 = this.mConnection.getContentType();
        x.d("MicroMsg.MMMediaHTTPConnection", "getMIMEType cost time :%d!", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
        this.mMimeType = str1;
        localObject = str1;
        if (!TextUtils.isEmpty(str1)) {
          break;
        }
        str1 = e.Il(this.lAh.toString());
        this.mMimeType = str1;
        localObject = str1;
        if (!TextUtils.isEmpty(str1)) {
          break;
        }
        return "application/octet-stream";
      }
      catch (IOException localIOException)
      {
        Logger.e("MicroMsg.MMMediaHTTPConnection", "getMIMEType exception:%s", new Object[] { String.valueOf(localIOException) });
        str2 = "";
        continue;
      }
      long l = System.currentTimeMillis();
      String str2 = this.mConnection.getContentType();
      Logger.i("MicroMsg.MMMediaHTTPConnection", "getMIMEType mimeType:" + str2);
      x.d("MicroMsg.MMMediaHTTPConnection", "getMIMEType cost time2 :%d!", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
    }
  }
  
  public final long getSize()
  {
    long l1 = -1L;
    if (this.mTotalSize > 0L) {
      l1 = this.mTotalSize;
    }
    do
    {
      return l1;
      if (e.In(this.lAh.toString()) > 0L)
      {
        this.mTotalSize = e.In(this.lAh.toString());
        return this.mTotalSize;
      }
      if (this.mConnection == null) {}
      try
      {
        long l2 = System.currentTimeMillis();
        seekTo(0L);
        x.d("MicroMsg.MMMediaHTTPConnection", "getSize cost time :%d!", new Object[] { Long.valueOf(System.currentTimeMillis() - l2) });
        if (this.mTotalSize > 0L) {
          return this.mTotalSize;
        }
      }
      catch (IOException localIOException)
      {
        for (;;)
        {
          Logger.e("MicroMsg.MMMediaHTTPConnection", "getSize exception:%s", new Object[] { String.valueOf(localIOException) });
          this.mTotalSize = -1L;
        }
      }
    } while (e.Io(this.lAh.toString()) <= 0L);
    this.mTotalSize = e.Io(this.lAh.toString());
    return this.mTotalSize;
  }
  
  public final String getUri()
  {
    return this.mURL.toString();
  }
  
  public final int readAt(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    int j;
    for (;;)
    {
      com.tencent.mm.plugin.music.cache.a locala;
      int k;
      try
      {
        if (this.lAg == null) {
          continue;
        }
        locala = this.lAg;
        if ((paramArrayOfByte != null) && (paramInt1 >= 0) && (paramInt2 >= 0)) {
          continue;
        }
        x.e("MicroMsg.FileBytesCacheMgr", "read() params is invalid, offset:%d, size:%d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
      }
      catch (ProtocolException paramArrayOfByte)
      {
        Logger.e("MicroMsg.MMMediaHTTPConnection", "readAt " + paramInt1 + " / " + paramInt2 + " => " + paramArrayOfByte);
        e.bM(this.lAh.toString(), 750);
        return 64526;
        i = paramInt1 + paramInt2;
        l = i;
        if (l <= locala.lxo.getSize()) {
          break label1035;
        }
        x.e("MicroMsg.FileBytesCacheMgr", "read() endOffset is error,  startOffset %d, endOffset:%d, file length:%d ", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(i), Long.valueOf(locala.lxo.getSize()) });
        i = (int)locala.lxo.getSize() - paramInt1;
        if (!locala.lxp.cV(paramInt1, i)) {
          break label1041;
        }
        i = locala.lxq.b(paramArrayOfByte, paramInt1, i);
        continue;
        if ((this.mTotalSize <= 0L) || (paramInt1 < this.mTotalSize) || (paramInt2 <= 0)) {
          continue;
        }
        x.e("MicroMsg.MMMediaHTTPConnection", "offset is illegal, mTotalSize:%d, offset:%d, size:%d", new Object[] { Long.valueOf(this.mTotalSize), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
        return 0;
        Logger.d("MicroMsg.MMMediaHTTPConnection", "read from network");
        if (paramInt1 == this.mCurrentOffset) {
          continue;
        }
        seekTo(paramInt1);
        j = this.mInputStream.read(paramArrayOfByte, 0, paramInt2);
        i = j;
        if (j != -1) {
          continue;
        }
        i = 0;
        this.mCurrentOffset += i;
        j = i;
        if (this.lAg == null) {
          break;
        }
        locala = this.lAg;
        if ((paramArrayOfByte != null) && (paramInt1 >= 0) && (i >= 0)) {
          continue;
        }
        x.e("MicroMsg.FileBytesCacheMgr", "write() params is invalid, offset:%d, size:%d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(i) });
        return i;
      }
      catch (NoRouteToHostException paramArrayOfByte)
      {
        Logger.e("MicroMsg.MMMediaHTTPConnection", "readAt " + paramInt1 + " / " + paramInt2 + " => " + paramArrayOfByte);
        e.bM(this.lAh.toString(), 751);
        return 64526;
        if (locala.lxo.getSize() > 0L) {
          continue;
        }
        x.e("MicroMsg.FileBytesCacheMgr", "write() fileLength is error, file length is " + locala.lxo.getSize());
        return i;
      }
      catch (UnknownServiceException paramArrayOfByte)
      {
        Logger.e("MicroMsg.MMMediaHTTPConnection", "readAt " + paramInt1 + " / " + paramInt2 + " => " + paramArrayOfByte);
        e.bM(this.lAh.toString(), 752);
        return 64526;
        k = paramInt1 + i;
        l = k;
        if (l <= locala.lxo.getSize()) {
          continue;
        }
        x.e("MicroMsg.FileBytesCacheMgr", "write() endOffset is error, endOffset:%d, file length:%d", new Object[] { Integer.valueOf(k), Long.valueOf(locala.lxo.getSize()) });
        return i;
      }
      catch (IOException paramArrayOfByte)
      {
        Logger.e("MicroMsg.MMMediaHTTPConnection", "readAt " + paramInt1 + " / " + paramInt2 + " => -1 " + paramArrayOfByte);
        e.bM(this.lAh.toString(), 753);
        return -1;
        long l = k;
        if (l != locala.lxo.getSize()) {
          break label924;
        }
        locala.bhI();
        locala.tt(paramInt1);
        locala.p(paramArrayOfByte, paramInt1, i);
        locala.bhI();
        locala.tt(paramInt1);
        return i;
      }
      catch (Exception paramArrayOfByte)
      {
        Logger.e("MicroMsg.MMMediaHTTPConnection", "unknown exception " + paramArrayOfByte);
        Logger.e("MicroMsg.MMMediaHTTPConnection", "readAt " + paramInt1 + " / " + paramInt2 + " => -1");
        e.bM(this.lAh.toString(), 754);
        return -1;
      }
      if (i > 0)
      {
        j = i;
        if (i == paramInt2) {
          break;
        }
        Logger.i("MicroMsg.MMMediaHTTPConnection", "read from cache, n%d, size %d " + i + "," + paramInt2);
        return i;
        if (locala.lxo.getSize() <= 0L)
        {
          x.e("MicroMsg.FileBytesCacheMgr", "read()，fileLength is error, file length is " + locala.lxo.getSize());
          break label1041;
        }
      }
      label924:
      if ((locala.tr(paramInt1)) && (locala.tr(k)))
      {
        if (locala.ts(paramInt1))
        {
          j = i;
          if (locala.ts(k)) {
            break;
          }
        }
        if (locala.ts(paramInt1))
        {
          locala.p(paramArrayOfByte, paramInt1, i);
          return i;
        }
        locala.bhI();
        locala.tt(paramInt1);
        locala.p(paramArrayOfByte, paramInt1, i);
        return i;
      }
      locala.bhI();
      locala.tt(paramInt1);
      locala.p(paramArrayOfByte, paramInt1, i);
      return i;
      label1035:
      int i = paramInt2;
      continue;
      label1041:
      i = -1;
    }
    return j;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/music/c/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */