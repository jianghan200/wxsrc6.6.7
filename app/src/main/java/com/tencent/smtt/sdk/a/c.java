package com.tencent.smtt.sdk.a;

import MTT.ThirdAppInfoNew;
import android.content.Context;

final class c
  extends Thread
{
  c(String paramString, Context paramContext, ThirdAppInfoNew paramThirdAppInfoNew)
  {
    super(paramString);
  }
  
  /* Error */
  public final void run()
  {
    // Byte code:
    //   0: getstatic 38	android/os/Build$VERSION:SDK_INT	I
    //   3: bipush 8
    //   5: if_icmpge +4 -> 9
    //   8: return
    //   9: getstatic 43	com/tencent/smtt/sdk/a/b:a	[B
    //   12: ifnonnull +13 -> 25
    //   15: ldc 45
    //   17: ldc 47
    //   19: invokevirtual 53	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   22: putstatic 43	com/tencent/smtt/sdk/a/b:a	[B
    //   25: getstatic 43	com/tencent/smtt/sdk/a/b:a	[B
    //   28: ifnonnull +26 -> 54
    //   31: ldc 55
    //   33: ldc 57
    //   35: invokestatic 63	com/tencent/smtt/utils/TbsLog:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   38: return
    //   39: astore_2
    //   40: aconst_null
    //   41: putstatic 43	com/tencent/smtt/sdk/a/b:a	[B
    //   44: ldc 55
    //   46: ldc 65
    //   48: invokestatic 63	com/tencent/smtt/utils/TbsLog:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   51: goto -26 -> 25
    //   54: aload_0
    //   55: getfield 12	com/tencent/smtt/sdk/a/c:a	Landroid/content/Context;
    //   58: invokestatic 71	com/tencent/smtt/sdk/TbsDownloadConfig:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsDownloadConfig;
    //   61: getfield 75	com/tencent/smtt/sdk/TbsDownloadConfig:mPreferences	Landroid/content/SharedPreferences;
    //   64: ldc 77
    //   66: ldc 79
    //   68: invokeinterface 85 3 0
    //   73: astore_2
    //   74: ldc 79
    //   76: astore_3
    //   77: aload_2
    //   78: invokestatic 91	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   81: ifne +413 -> 494
    //   84: aload_2
    //   85: iconst_0
    //   86: aload_2
    //   87: ldc 93
    //   89: invokevirtual 97	java/lang/String:indexOf	(Ljava/lang/String;)I
    //   92: invokevirtual 101	java/lang/String:substring	(II)Ljava/lang/String;
    //   95: astore_3
    //   96: aload_2
    //   97: aload_2
    //   98: ldc 93
    //   100: invokevirtual 97	java/lang/String:indexOf	(Ljava/lang/String;)I
    //   103: iconst_1
    //   104: iadd
    //   105: aload_2
    //   106: invokevirtual 105	java/lang/String:length	()I
    //   109: invokevirtual 101	java/lang/String:substring	(II)Ljava/lang/String;
    //   112: astore_2
    //   113: aload_3
    //   114: invokestatic 91	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   117: ifne +28 -> 145
    //   120: aload_3
    //   121: invokevirtual 105	java/lang/String:length	()I
    //   124: bipush 96
    //   126: if_icmpne +19 -> 145
    //   129: aload_2
    //   130: invokestatic 91	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   133: ifne +12 -> 145
    //   136: aload_2
    //   137: invokevirtual 105	java/lang/String:length	()I
    //   140: bipush 24
    //   142: if_icmpeq +132 -> 274
    //   145: iconst_1
    //   146: istore_1
    //   147: invokestatic 110	com/tencent/smtt/utils/s:a	()Lcom/tencent/smtt/utils/s;
    //   150: astore 4
    //   152: iload_1
    //   153: ifeq +126 -> 279
    //   156: new 112	java/lang/StringBuilder
    //   159: dup
    //   160: invokespecial 114	java/lang/StringBuilder:<init>	()V
    //   163: aload 4
    //   165: invokevirtual 117	com/tencent/smtt/utils/s:b	()Ljava/lang/String;
    //   168: invokevirtual 121	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   171: invokestatic 126	com/tencent/smtt/utils/n:a	()Lcom/tencent/smtt/utils/n;
    //   174: invokevirtual 127	com/tencent/smtt/utils/n:b	()Ljava/lang/String;
    //   177: invokevirtual 121	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   180: invokevirtual 130	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   183: astore_3
    //   184: new 132	java/net/URL
    //   187: dup
    //   188: aload_3
    //   189: invokespecial 133	java/net/URL:<init>	(Ljava/lang/String;)V
    //   192: invokevirtual 137	java/net/URL:openConnection	()Ljava/net/URLConnection;
    //   195: checkcast 139	java/net/HttpURLConnection
    //   198: astore 4
    //   200: aload 4
    //   202: ldc -115
    //   204: invokevirtual 144	java/net/HttpURLConnection:setRequestMethod	(Ljava/lang/String;)V
    //   207: aload 4
    //   209: iconst_1
    //   210: invokevirtual 148	java/net/HttpURLConnection:setDoOutput	(Z)V
    //   213: aload 4
    //   215: iconst_1
    //   216: invokevirtual 151	java/net/HttpURLConnection:setDoInput	(Z)V
    //   219: aload 4
    //   221: iconst_0
    //   222: invokevirtual 154	java/net/HttpURLConnection:setUseCaches	(Z)V
    //   225: aload 4
    //   227: sipush 20000
    //   230: invokevirtual 158	java/net/HttpURLConnection:setConnectTimeout	(I)V
    //   233: getstatic 38	android/os/Build$VERSION:SDK_INT	I
    //   236: bipush 13
    //   238: if_icmple +12 -> 250
    //   241: aload 4
    //   243: ldc -96
    //   245: ldc -94
    //   247: invokevirtual 165	java/net/HttpURLConnection:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   250: aload_0
    //   251: getfield 14	com/tencent/smtt/sdk/a/c:b	LMTT/ThirdAppInfoNew;
    //   254: aload_0
    //   255: getfield 12	com/tencent/smtt/sdk/a/c:a	Landroid/content/Context;
    //   258: invokestatic 168	com/tencent/smtt/sdk/a/b:b	(LMTT/ThirdAppInfoNew;Landroid/content/Context;)Lorg/json/JSONObject;
    //   261: astore_3
    //   262: aload_3
    //   263: ifnonnull +117 -> 380
    //   266: ldc 55
    //   268: ldc -86
    //   270: invokestatic 63	com/tencent/smtt/utils/TbsLog:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   273: return
    //   274: iconst_0
    //   275: istore_1
    //   276: goto -129 -> 147
    //   279: new 112	java/lang/StringBuilder
    //   282: dup
    //   283: invokespecial 114	java/lang/StringBuilder:<init>	()V
    //   286: aload 4
    //   288: invokevirtual 173	com/tencent/smtt/utils/s:f	()Ljava/lang/String;
    //   291: invokevirtual 121	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   294: aload_3
    //   295: invokevirtual 121	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   298: invokevirtual 130	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   301: astore_3
    //   302: goto -118 -> 184
    //   305: astore_2
    //   306: ldc 55
    //   308: new 112	java/lang/StringBuilder
    //   311: dup
    //   312: ldc -81
    //   314: invokespecial 176	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   317: aload_2
    //   318: invokevirtual 179	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   321: invokevirtual 130	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   324: invokestatic 63	com/tencent/smtt/utils/TbsLog:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   327: return
    //   328: astore_2
    //   329: ldc 55
    //   331: new 112	java/lang/StringBuilder
    //   334: dup
    //   335: ldc -75
    //   337: invokespecial 176	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   340: aload_2
    //   341: invokevirtual 179	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   344: invokevirtual 130	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   347: invokestatic 63	com/tencent/smtt/utils/TbsLog:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   350: return
    //   351: astore_2
    //   352: ldc 55
    //   354: new 112	java/lang/StringBuilder
    //   357: dup
    //   358: ldc -73
    //   360: invokespecial 176	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   363: aload_2
    //   364: invokevirtual 179	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   367: invokevirtual 130	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   370: invokestatic 63	com/tencent/smtt/utils/TbsLog:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   373: return
    //   374: astore_3
    //   375: aconst_null
    //   376: astore_3
    //   377: goto -115 -> 262
    //   380: aload_3
    //   381: invokevirtual 186	org/json/JSONObject:toString	()Ljava/lang/String;
    //   384: ldc 47
    //   386: invokevirtual 53	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   389: astore_3
    //   390: iload_1
    //   391: ifeq +92 -> 483
    //   394: invokestatic 126	com/tencent/smtt/utils/n:a	()Lcom/tencent/smtt/utils/n;
    //   397: aload_3
    //   398: invokevirtual 189	com/tencent/smtt/utils/n:a	([B)[B
    //   401: astore_2
    //   402: aload 4
    //   404: ldc -65
    //   406: ldc -63
    //   408: invokevirtual 165	java/net/HttpURLConnection:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   411: aload 4
    //   413: ldc -61
    //   415: aload_2
    //   416: arraylength
    //   417: invokestatic 199	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   420: invokevirtual 165	java/net/HttpURLConnection:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   423: aload 4
    //   425: invokevirtual 203	java/net/HttpURLConnection:getOutputStream	()Ljava/io/OutputStream;
    //   428: astore_3
    //   429: aload_3
    //   430: aload_2
    //   431: invokevirtual 209	java/io/OutputStream:write	([B)V
    //   434: aload_3
    //   435: invokevirtual 212	java/io/OutputStream:flush	()V
    //   438: aload 4
    //   440: invokevirtual 215	java/net/HttpURLConnection:getResponseCode	()I
    //   443: sipush 200
    //   446: if_icmpeq -438 -> 8
    //   449: ldc 55
    //   451: ldc -39
    //   453: invokestatic 63	com/tencent/smtt/utils/TbsLog:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   456: return
    //   457: astore_2
    //   458: ldc 55
    //   460: new 112	java/lang/StringBuilder
    //   463: dup
    //   464: ldc -37
    //   466: invokespecial 176	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   469: aload_2
    //   470: invokevirtual 222	java/lang/Throwable:getMessage	()Ljava/lang/String;
    //   473: invokevirtual 121	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   476: invokevirtual 130	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   479: invokestatic 63	com/tencent/smtt/utils/TbsLog:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   482: return
    //   483: aload_3
    //   484: aload_2
    //   485: invokestatic 225	com/tencent/smtt/utils/n:a	([BLjava/lang/String;)[B
    //   488: astore_2
    //   489: goto -87 -> 402
    //   492: astore_2
    //   493: return
    //   494: ldc 79
    //   496: astore_2
    //   497: goto -384 -> 113
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	500	0	this	c
    //   146	245	1	i	int
    //   39	1	2	localUnsupportedEncodingException	java.io.UnsupportedEncodingException
    //   73	64	2	str1	String
    //   305	13	2	localIOException	java.io.IOException
    //   328	13	2	localAssertionError	AssertionError
    //   351	13	2	localNoClassDefFoundError	NoClassDefFoundError
    //   401	30	2	arrayOfByte1	byte[]
    //   457	28	2	localThrowable1	Throwable
    //   488	1	2	arrayOfByte2	byte[]
    //   492	1	2	localThrowable2	Throwable
    //   496	1	2	str2	String
    //   76	226	3	localObject1	Object
    //   374	1	3	localException	Exception
    //   376	108	3	localObject2	Object
    //   150	289	4	localObject3	Object
    // Exception table:
    //   from	to	target	type
    //   15	25	39	java/io/UnsupportedEncodingException
    //   147	152	305	java/io/IOException
    //   156	184	305	java/io/IOException
    //   184	207	305	java/io/IOException
    //   279	302	305	java/io/IOException
    //   147	152	328	java/lang/AssertionError
    //   156	184	328	java/lang/AssertionError
    //   184	207	328	java/lang/AssertionError
    //   279	302	328	java/lang/AssertionError
    //   147	152	351	java/lang/NoClassDefFoundError
    //   156	184	351	java/lang/NoClassDefFoundError
    //   184	207	351	java/lang/NoClassDefFoundError
    //   279	302	351	java/lang/NoClassDefFoundError
    //   250	262	374	java/lang/Exception
    //   423	456	457	java/lang/Throwable
    //   380	390	492	java/lang/Throwable
    //   394	402	492	java/lang/Throwable
    //   483	489	492	java/lang/Throwable
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/smtt/sdk/a/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */