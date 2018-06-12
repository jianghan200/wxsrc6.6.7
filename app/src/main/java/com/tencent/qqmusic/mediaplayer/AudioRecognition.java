package com.tencent.qqmusic.mediaplayer;

import android.media.AudioTrack;
import android.text.TextUtils;
import com.tencent.qqmusic.mediaplayer.codec.BaseDecoder;
import com.tencent.qqmusic.mediaplayer.codec.flac.FLACDecoder;
import com.tencent.qqmusic.mediaplayer.util.Logger;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class AudioRecognition
{
  private static final int READ_FILE_HEADER_SIZE = 64;
  private static String TAG = "AudioRecognition";
  private static HashMap<String, AudioFormat.AudioType> mGuessFormatResultCache = new HashMap();
  private static HashMap<String, AudioFormat.AudioType> mRecognitionResultCache = new HashMap();
  
  public static int calcBitDept(long paramLong1, long paramLong2, int paramInt, long paramLong3)
  {
    if ((0L == paramLong2) || (paramInt == 0)) {
      return 0;
    }
    double d = 1000.0F * (float)paramLong1 / (float)(paramInt * paramLong2 * paramLong3);
    int i = (int)Math.round(d);
    Logger.i(TAG, "byteNumbers = " + paramLong1 + ",time = " + paramLong2 + ",channels = " + paramInt + ",sampleRate = " + paramLong3 + ",bitDept = " + d);
    return i;
  }
  
  public static int getAudioBitDept(BaseDecoder paramBaseDecoder, AudioInformation paramAudioInformation)
  {
    try
    {
      if ((paramBaseDecoder instanceof FLACDecoder))
      {
        i = ((FLACDecoder)paramBaseDecoder).getminBufferSize();
        j = AudioTrack.getMinBufferSize((int)paramAudioInformation.getSampleRate(), paramAudioInformation.getChannels(), 2);
        if (!(paramBaseDecoder instanceof FLACDecoder))
        {
          if (j % 2048 == 0) {
            break label113;
          }
          i = (j / 2048 + 1) * 2048;
        }
        j = paramBaseDecoder.decodeData(i * 2, new short[i]);
        if (j > 0) {
          break label108;
        }
        i *= 2;
        return calcBitDept(i, paramBaseDecoder.getCurrentTime(), paramAudioInformation.getChannels(), paramAudioInformation.getSampleRate());
      }
    }
    catch (Throwable localThrowable)
    {
      for (;;)
      {
        int j;
        Logger.e(TAG, localThrowable);
        int i = 0;
        continue;
        label108:
        i = j;
        continue;
        label113:
        i = j;
      }
    }
  }
  
  public static BaseDecoder getDecoderFormFile(String paramString)
  {
    Object localObject1 = null;
    Object localObject2 = null;
    if (TextUtils.isEmpty(paramString)) {
      localObject1 = localObject2;
    }
    do
    {
      return (BaseDecoder)localObject1;
      try
      {
        localObject2 = recognitionAudioFormatExactly(paramString);
        localObject1 = localObject2;
      }
      catch (IOException localIOException)
      {
        for (;;)
        {
          Logger.e(TAG, localIOException);
        }
      }
      localObject2 = MediaCodecFactory.createDecoderByType((AudioFormat.AudioType)localObject1);
      localObject1 = localObject2;
    } while (localObject2 == null);
    ((BaseDecoder)localObject2).init(paramString, false);
    return (BaseDecoder)localObject2;
  }
  
  public static AudioFormat.AudioType guessFormat(String paramString)
  {
    if ((mGuessFormatResultCache != null) && (mGuessFormatResultCache.containsKey(paramString))) {
      return (AudioFormat.AudioType)mGuessFormatResultCache.get(paramString);
    }
    Iterator localIterator = MediaCodecFactory.getSupportAudioType().iterator();
    while (localIterator.hasNext())
    {
      Object localObject = MediaCodecFactory.createDecoderByType((AudioFormat.AudioType)localIterator.next());
      if (localObject != null)
      {
        localObject = ((BaseDecoder)localObject).guessAudioType(paramString);
        if (AudioFormat.isAudioType((AudioFormat.AudioType)localObject))
        {
          mGuessFormatResultCache.put(paramString, localObject);
          return (AudioFormat.AudioType)localObject;
        }
      }
    }
    return AudioFormat.AudioType.UNSUPPORT;
  }
  
  public static AudioFormat.AudioType recognitionAudioFormatByExtensions(String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {
      return null;
    }
    if (mRecognitionResultCache.containsKey(paramString))
    {
      localObject1 = (AudioFormat.AudioType)mRecognitionResultCache.get(paramString);
      Logger.w(TAG, "Get from cache " + localObject1 + ",checkFilePath = " + paramString + ",retType = " + localObject1);
      return (AudioFormat.AudioType)localObject1;
    }
    AudioFormat.AudioType localAudioType = guessFormat(paramString);
    Object localObject1 = localAudioType;
    if (!AudioFormat.isAudioType(localAudioType)) {
      Logger.i(TAG, "recognitionAudioFormatByExtensions guessAudioType = null,so recognitionAudioFormatExactly checkFilePath = " + paramString);
    }
    try
    {
      localObject1 = recognitionAudioFormatExactly(paramString);
      Logger.i(TAG, "recognitionAudioFormatByExtensions checkFilePath = " + paramString + ",guessAudioType = " + localObject1);
      return (AudioFormat.AudioType)localObject1;
    }
    catch (IOException localIOException)
    {
      for (;;)
      {
        Logger.e(TAG, localIOException);
        Object localObject2 = localAudioType;
      }
    }
  }
  
  /* Error */
  public static AudioFormat.AudioType recognitionAudioFormatExactly(String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: ifnonnull +5 -> 6
    //   4: aconst_null
    //   5: areturn
    //   6: getstatic 28	com/tencent/qqmusic/mediaplayer/AudioRecognition:mGuessFormatResultCache	Ljava/util/HashMap;
    //   9: aload_0
    //   10: invokevirtual 217	java/util/HashMap:remove	(Ljava/lang/Object;)Ljava/lang/Object;
    //   13: pop
    //   14: getstatic 19	com/tencent/qqmusic/mediaplayer/AudioRecognition:TAG	Ljava/lang/String;
    //   17: new 41	java/lang/StringBuilder
    //   20: dup
    //   21: ldc -37
    //   23: invokespecial 46	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   26: aload_0
    //   27: invokevirtual 55	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   30: invokevirtual 71	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   33: invokestatic 77	com/tencent/qqmusic/mediaplayer/util/Logger:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   36: new 221	java/io/File
    //   39: dup
    //   40: aload_0
    //   41: invokespecial 222	java/io/File:<init>	(Ljava/lang/String;)V
    //   44: astore 4
    //   46: aload 4
    //   48: invokevirtual 225	java/io/File:exists	()Z
    //   51: ifne +27 -> 78
    //   54: new 227	java/io/FileNotFoundException
    //   57: dup
    //   58: new 41	java/lang/StringBuilder
    //   61: dup
    //   62: ldc -27
    //   64: invokespecial 46	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   67: aload_0
    //   68: invokevirtual 55	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   71: invokevirtual 71	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   74: invokespecial 230	java/io/FileNotFoundException:<init>	(Ljava/lang/String;)V
    //   77: athrow
    //   78: aload 4
    //   80: invokevirtual 233	java/io/File:canRead	()Z
    //   83: ifne +27 -> 110
    //   86: new 121	java/io/IOException
    //   89: dup
    //   90: new 41	java/lang/StringBuilder
    //   93: dup
    //   94: ldc -21
    //   96: invokespecial 46	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   99: aload_0
    //   100: invokevirtual 55	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   103: invokevirtual 71	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   106: invokespecial 236	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   109: athrow
    //   110: getstatic 19	com/tencent/qqmusic/mediaplayer/AudioRecognition:TAG	Ljava/lang/String;
    //   113: new 41	java/lang/StringBuilder
    //   116: dup
    //   117: ldc -18
    //   119: invokespecial 46	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   122: aload 4
    //   124: invokevirtual 241	java/io/File:length	()J
    //   127: invokevirtual 50	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   130: invokevirtual 71	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   133: invokestatic 77	com/tencent/qqmusic/mediaplayer/util/Logger:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   136: invokestatic 246	java/lang/System:currentTimeMillis	()J
    //   139: lstore_2
    //   140: aload_0
    //   141: invokestatic 204	com/tencent/qqmusic/mediaplayer/AudioRecognition:guessFormat	(Ljava/lang/String;)Lcom/tencent/qqmusic/mediaplayer/AudioFormat$AudioType;
    //   144: astore 8
    //   146: invokestatic 156	com/tencent/qqmusic/mediaplayer/MediaCodecFactory:getSupportAudioType	()Ljava/util/ArrayList;
    //   149: astore 9
    //   151: aload 8
    //   153: ifnull +58 -> 211
    //   156: aload 9
    //   158: aload 8
    //   160: invokevirtual 249	java/util/ArrayList:contains	(Ljava/lang/Object;)Z
    //   163: ifeq +48 -> 211
    //   166: aload 9
    //   168: aload 8
    //   170: invokevirtual 251	java/util/ArrayList:remove	(Ljava/lang/Object;)Z
    //   173: pop
    //   174: aload 9
    //   176: iconst_0
    //   177: aload 8
    //   179: invokevirtual 255	java/util/ArrayList:add	(ILjava/lang/Object;)V
    //   182: getstatic 258	com/tencent/qqmusic/mediaplayer/AudioFormat$AudioType:MP3	Lcom/tencent/qqmusic/mediaplayer/AudioFormat$AudioType;
    //   185: aload 8
    //   187: invokevirtual 261	com/tencent/qqmusic/mediaplayer/AudioFormat$AudioType:equals	(Ljava/lang/Object;)Z
    //   190: ifeq +21 -> 211
    //   193: aload 9
    //   195: getstatic 264	com/tencent/qqmusic/mediaplayer/AudioFormat$AudioType:FLAC	Lcom/tencent/qqmusic/mediaplayer/AudioFormat$AudioType;
    //   198: invokevirtual 251	java/util/ArrayList:remove	(Ljava/lang/Object;)Z
    //   201: pop
    //   202: aload 9
    //   204: iconst_0
    //   205: getstatic 264	com/tencent/qqmusic/mediaplayer/AudioFormat$AudioType:FLAC	Lcom/tencent/qqmusic/mediaplayer/AudioFormat$AudioType;
    //   208: invokevirtual 255	java/util/ArrayList:add	(ILjava/lang/Object;)V
    //   211: new 266	java/io/FileInputStream
    //   214: dup
    //   215: aload_0
    //   216: invokespecial 267	java/io/FileInputStream:<init>	(Ljava/lang/String;)V
    //   219: astore 7
    //   221: aload 7
    //   223: astore 5
    //   225: sipush 1024
    //   228: invokestatic 273	com/tencent/qqmusic/mediaplayer/CacheBytesManager:getStatic	(I)[B
    //   231: astore 10
    //   233: aload 7
    //   235: astore 5
    //   237: aload 7
    //   239: aload 10
    //   241: invokevirtual 279	java/io/InputStream:read	([B)I
    //   244: istore_1
    //   245: iload_1
    //   246: bipush 64
    //   248: if_icmplt +473 -> 721
    //   251: aload 7
    //   253: astore 5
    //   255: bipush 64
    //   257: newarray <illegal type>
    //   259: astore 4
    //   261: aload 7
    //   263: astore 5
    //   265: aload 4
    //   267: astore 6
    //   269: aload 10
    //   271: iconst_0
    //   272: aload 4
    //   274: iconst_0
    //   275: bipush 64
    //   277: invokestatic 283	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   280: aload 7
    //   282: astore 5
    //   284: aload 4
    //   286: astore 6
    //   288: aload 10
    //   290: invokestatic 287	com/tencent/qqmusic/mediaplayer/CacheBytesManager:recycle	([B)[B
    //   293: pop
    //   294: aload 7
    //   296: astore 5
    //   298: aload 4
    //   300: astore 6
    //   302: getstatic 19	com/tencent/qqmusic/mediaplayer/AudioRecognition:TAG	Ljava/lang/String;
    //   305: new 41	java/lang/StringBuilder
    //   308: dup
    //   309: ldc_w 289
    //   312: invokespecial 46	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   315: new 291	java/lang/String
    //   318: dup
    //   319: aload 10
    //   321: iconst_0
    //   322: iload_1
    //   323: invokespecial 294	java/lang/String:<init>	([BII)V
    //   326: invokevirtual 55	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   329: ldc_w 296
    //   332: invokevirtual 55	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   335: aload_0
    //   336: invokevirtual 55	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   339: invokevirtual 71	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   342: invokestatic 77	com/tencent/qqmusic/mediaplayer/util/Logger:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   345: aload 7
    //   347: invokevirtual 299	java/io/InputStream:close	()V
    //   350: aload 9
    //   352: invokevirtual 162	java/util/ArrayList:iterator	()Ljava/util/Iterator;
    //   355: astore 6
    //   357: aload 6
    //   359: invokeinterface 168 1 0
    //   364: ifeq +348 -> 712
    //   367: aload 6
    //   369: invokeinterface 172 1 0
    //   374: checkcast 152	com/tencent/qqmusic/mediaplayer/AudioFormat$AudioType
    //   377: invokestatic 137	com/tencent/qqmusic/mediaplayer/MediaCodecFactory:createDecoderByType	(Lcom/tencent/qqmusic/mediaplayer/AudioFormat$AudioType;)Lcom/tencent/qqmusic/mediaplayer/codec/BaseDecoder;
    //   380: astore 5
    //   382: aload 5
    //   384: ifnull -27 -> 357
    //   387: aload 5
    //   389: aload_0
    //   390: aload 4
    //   392: invokevirtual 303	com/tencent/qqmusic/mediaplayer/codec/BaseDecoder:getAudioType	(Ljava/lang/String;[B)Lcom/tencent/qqmusic/mediaplayer/AudioFormat$AudioType;
    //   395: astore 5
    //   397: aload 5
    //   399: invokestatic 181	com/tencent/qqmusic/mediaplayer/AudioFormat:isAudioType	(Lcom/tencent/qqmusic/mediaplayer/AudioFormat$AudioType;)Z
    //   402: ifeq -45 -> 357
    //   405: getstatic 19	com/tencent/qqmusic/mediaplayer/AudioRecognition:TAG	Ljava/lang/String;
    //   408: new 41	java/lang/StringBuilder
    //   411: dup
    //   412: ldc_w 305
    //   415: invokespecial 46	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   418: aload 5
    //   420: invokevirtual 195	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   423: ldc_w 307
    //   426: invokevirtual 55	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   429: aload_0
    //   430: invokevirtual 55	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   433: ldc_w 309
    //   436: invokevirtual 55	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   439: invokestatic 246	java/lang/System:currentTimeMillis	()J
    //   442: lload_2
    //   443: lsub
    //   444: invokevirtual 50	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   447: ldc_w 311
    //   450: invokevirtual 55	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   453: aload 5
    //   455: aload 8
    //   457: invokevirtual 261	com/tencent/qqmusic/mediaplayer/AudioFormat$AudioType:equals	(Ljava/lang/Object;)Z
    //   460: invokevirtual 314	java/lang/StringBuilder:append	(Z)Ljava/lang/StringBuilder;
    //   463: invokevirtual 71	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   466: invokestatic 202	com/tencent/qqmusic/mediaplayer/util/Logger:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   469: aload 5
    //   471: ifnonnull +153 -> 624
    //   474: getstatic 189	com/tencent/qqmusic/mediaplayer/AudioFormat$AudioType:UNSUPPORT	Lcom/tencent/qqmusic/mediaplayer/AudioFormat$AudioType;
    //   477: astore 5
    //   479: getstatic 19	com/tencent/qqmusic/mediaplayer/AudioRecognition:TAG	Ljava/lang/String;
    //   482: new 41	java/lang/StringBuilder
    //   485: dup
    //   486: ldc_w 316
    //   489: invokespecial 46	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   492: aload_0
    //   493: invokevirtual 55	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   496: ldc -57
    //   498: invokevirtual 55	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   501: aload 5
    //   503: invokevirtual 195	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   506: invokevirtual 71	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   509: invokestatic 77	com/tencent/qqmusic/mediaplayer/util/Logger:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   512: aload 5
    //   514: areturn
    //   515: astore 5
    //   517: getstatic 19	com/tencent/qqmusic/mediaplayer/AudioRecognition:TAG	Ljava/lang/String;
    //   520: aload 5
    //   522: invokestatic 117	com/tencent/qqmusic/mediaplayer/util/Logger:e	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   525: goto -175 -> 350
    //   528: astore 6
    //   530: aconst_null
    //   531: astore 4
    //   533: aconst_null
    //   534: astore 7
    //   536: aload 7
    //   538: astore 5
    //   540: getstatic 19	com/tencent/qqmusic/mediaplayer/AudioRecognition:TAG	Ljava/lang/String;
    //   543: aload 6
    //   545: invokestatic 117	com/tencent/qqmusic/mediaplayer/util/Logger:e	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   548: aload 7
    //   550: ifnull +168 -> 718
    //   553: aload 7
    //   555: invokevirtual 299	java/io/InputStream:close	()V
    //   558: goto -208 -> 350
    //   561: astore 5
    //   563: getstatic 19	com/tencent/qqmusic/mediaplayer/AudioRecognition:TAG	Ljava/lang/String;
    //   566: aload 5
    //   568: invokestatic 117	com/tencent/qqmusic/mediaplayer/util/Logger:e	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   571: goto -221 -> 350
    //   574: astore_0
    //   575: aconst_null
    //   576: astore 5
    //   578: aload 5
    //   580: ifnull +8 -> 588
    //   583: aload 5
    //   585: invokevirtual 299	java/io/InputStream:close	()V
    //   588: aload_0
    //   589: athrow
    //   590: astore 4
    //   592: getstatic 19	com/tencent/qqmusic/mediaplayer/AudioRecognition:TAG	Ljava/lang/String;
    //   595: aload 4
    //   597: invokestatic 117	com/tencent/qqmusic/mediaplayer/util/Logger:e	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   600: goto -12 -> 588
    //   603: astore 5
    //   605: getstatic 19	com/tencent/qqmusic/mediaplayer/AudioRecognition:TAG	Ljava/lang/String;
    //   608: ldc_w 318
    //   611: aload 5
    //   613: invokestatic 321	com/tencent/qqmusic/mediaplayer/util/Logger:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   616: getstatic 189	com/tencent/qqmusic/mediaplayer/AudioFormat$AudioType:UNSUPPORT	Lcom/tencent/qqmusic/mediaplayer/AudioFormat$AudioType;
    //   619: astore 5
    //   621: goto -224 -> 397
    //   624: getstatic 19	com/tencent/qqmusic/mediaplayer/AudioRecognition:TAG	Ljava/lang/String;
    //   627: new 41	java/lang/StringBuilder
    //   630: dup
    //   631: ldc_w 323
    //   634: invokespecial 46	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   637: aload_0
    //   638: invokevirtual 55	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   641: ldc_w 325
    //   644: invokevirtual 55	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   647: aload 5
    //   649: invokevirtual 195	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   652: ldc_w 327
    //   655: invokevirtual 55	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   658: invokevirtual 71	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   661: invokestatic 77	com/tencent/qqmusic/mediaplayer/util/Logger:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   664: getstatic 26	com/tencent/qqmusic/mediaplayer/AudioRecognition:mRecognitionResultCache	Ljava/util/HashMap;
    //   667: aload_0
    //   668: aload 5
    //   670: invokevirtual 185	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   673: pop
    //   674: getstatic 28	com/tencent/qqmusic/mediaplayer/AudioRecognition:mGuessFormatResultCache	Ljava/util/HashMap;
    //   677: aload_0
    //   678: aload 5
    //   680: invokevirtual 185	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   683: pop
    //   684: goto -205 -> 479
    //   687: astore_0
    //   688: goto -110 -> 578
    //   691: astore 6
    //   693: aconst_null
    //   694: astore 4
    //   696: goto -160 -> 536
    //   699: astore 5
    //   701: aload 6
    //   703: astore 4
    //   705: aload 5
    //   707: astore 6
    //   709: goto -173 -> 536
    //   712: aconst_null
    //   713: astore 5
    //   715: goto -246 -> 469
    //   718: goto -368 -> 350
    //   721: aconst_null
    //   722: astore 4
    //   724: goto -444 -> 280
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	727	0	paramString	String
    //   244	79	1	i	int
    //   139	304	2	l	long
    //   44	488	4	localObject1	Object
    //   590	6	4	localException1	Exception
    //   694	29	4	localObject2	Object
    //   223	290	5	localObject3	Object
    //   515	6	5	localException2	Exception
    //   538	1	5	localFileInputStream1	java.io.FileInputStream
    //   561	6	5	localException3	Exception
    //   576	8	5	localObject4	Object
    //   603	9	5	localSoNotFindException	SoNotFindException
    //   619	60	5	localAudioType1	AudioFormat.AudioType
    //   699	7	5	localException4	Exception
    //   713	1	5	localObject5	Object
    //   267	101	6	localObject6	Object
    //   528	16	6	localException5	Exception
    //   691	11	6	localException6	Exception
    //   707	1	6	localException7	Exception
    //   219	335	7	localFileInputStream2	java.io.FileInputStream
    //   144	312	8	localAudioType2	AudioFormat.AudioType
    //   149	202	9	localArrayList	ArrayList
    //   231	89	10	arrayOfByte	byte[]
    // Exception table:
    //   from	to	target	type
    //   345	350	515	java/lang/Exception
    //   211	221	528	java/lang/Exception
    //   553	558	561	java/lang/Exception
    //   211	221	574	finally
    //   583	588	590	java/lang/Exception
    //   387	397	603	com/tencent/qqmusic/mediaplayer/SoNotFindException
    //   225	233	687	finally
    //   237	245	687	finally
    //   255	261	687	finally
    //   269	280	687	finally
    //   288	294	687	finally
    //   302	345	687	finally
    //   540	548	687	finally
    //   225	233	691	java/lang/Exception
    //   237	245	691	java/lang/Exception
    //   255	261	691	java/lang/Exception
    //   269	280	699	java/lang/Exception
    //   288	294	699	java/lang/Exception
    //   302	345	699	java/lang/Exception
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/qqmusic/mediaplayer/AudioRecognition.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */