package com.tencent.tencentmap.mapsdk.a;

import java.util.Locale;

public final class tn
{
  private static String a = Locale.getDefault().getLanguage() + "-" + Locale.getDefault().getCountry();
  
  /* Error */
  public static byte[] a(java.net.URL paramURL)
  {
    // Byte code:
    //   0: aload_0
    //   1: ifnonnull +5 -> 6
    //   4: aconst_null
    //   5: areturn
    //   6: invokestatic 46	android/net/Proxy:getDefaultHost	()Ljava/lang/String;
    //   9: ifnull +503 -> 512
    //   12: new 48	java/net/Proxy
    //   15: dup
    //   16: getstatic 54	java/net/Proxy$Type:HTTP	Ljava/net/Proxy$Type;
    //   19: new 56	java/net/InetSocketAddress
    //   22: dup
    //   23: invokestatic 46	android/net/Proxy:getDefaultHost	()Ljava/lang/String;
    //   26: invokestatic 60	android/net/Proxy:getDefaultPort	()I
    //   29: invokespecial 63	java/net/InetSocketAddress:<init>	(Ljava/lang/String;I)V
    //   32: invokespecial 66	java/net/Proxy:<init>	(Ljava/net/Proxy$Type;Ljava/net/SocketAddress;)V
    //   35: astore_1
    //   36: aload_1
    //   37: ifnull +172 -> 209
    //   40: aload_0
    //   41: aload_1
    //   42: invokevirtual 72	java/net/URL:openConnection	(Ljava/net/Proxy;)Ljava/net/URLConnection;
    //   45: checkcast 74	java/net/HttpURLConnection
    //   48: astore_3
    //   49: aload_3
    //   50: sipush 5000
    //   53: invokevirtual 78	java/net/HttpURLConnection:setConnectTimeout	(I)V
    //   56: aload_3
    //   57: sipush 15000
    //   60: invokevirtual 81	java/net/HttpURLConnection:setReadTimeout	(I)V
    //   63: aload_3
    //   64: ldc 83
    //   66: ldc 85
    //   68: invokevirtual 89	java/net/HttpURLConnection:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   71: aload_3
    //   72: ldc 91
    //   74: ldc 93
    //   76: invokevirtual 89	java/net/HttpURLConnection:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   79: aload_3
    //   80: ldc 95
    //   82: getstatic 37	com/tencent/tencentmap/mapsdk/a/tn:a	Ljava/lang/String;
    //   85: invokevirtual 89	java/net/HttpURLConnection:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   88: aload_3
    //   89: invokevirtual 98	java/net/HttpURLConnection:getResponseCode	()I
    //   92: sipush 200
    //   95: if_icmpne +405 -> 500
    //   98: aload_3
    //   99: invokevirtual 102	java/net/HttpURLConnection:getInputStream	()Ljava/io/InputStream;
    //   102: astore_1
    //   103: aload_3
    //   104: invokevirtual 105	java/net/HttpURLConnection:getContentType	()Ljava/lang/String;
    //   107: invokevirtual 110	java/lang/String:toLowerCase	()Ljava/lang/String;
    //   110: invokevirtual 113	java/lang/String:trim	()Ljava/lang/String;
    //   113: ldc 115
    //   115: invokevirtual 119	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   118: ifeq +102 -> 220
    //   121: new 121	java/io/InputStreamReader
    //   124: dup
    //   125: aload_1
    //   126: invokespecial 124	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;)V
    //   129: astore 5
    //   131: new 126	java/io/BufferedReader
    //   134: dup
    //   135: aload 5
    //   137: invokespecial 129	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   140: astore_0
    //   141: aload_0
    //   142: invokevirtual 132	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   145: invokevirtual 110	java/lang/String:toLowerCase	()Ljava/lang/String;
    //   148: invokevirtual 113	java/lang/String:trim	()Ljava/lang/String;
    //   151: astore_2
    //   152: aload_2
    //   153: ifnull +341 -> 494
    //   156: aload_2
    //   157: ldc -122
    //   159: invokevirtual 138	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   162: ifeq +332 -> 494
    //   165: iconst_1
    //   166: newarray <illegal type>
    //   168: astore 6
    //   170: aload 6
    //   172: iconst_0
    //   173: iconst_m1
    //   174: bastore
    //   175: aload_0
    //   176: astore 4
    //   178: aload_1
    //   179: astore_2
    //   180: aload 5
    //   182: astore_1
    //   183: aload 6
    //   185: astore_0
    //   186: aload_3
    //   187: ifnull +7 -> 194
    //   190: aload_3
    //   191: invokevirtual 141	java/net/HttpURLConnection:disconnect	()V
    //   194: aload 4
    //   196: invokestatic 146	com/tencent/tencentmap/mapsdk/a/rv:a	(Ljava/io/Closeable;)V
    //   199: aload_1
    //   200: invokestatic 146	com/tencent/tencentmap/mapsdk/a/rv:a	(Ljava/io/Closeable;)V
    //   203: aload_2
    //   204: invokestatic 146	com/tencent/tencentmap/mapsdk/a/rv:a	(Ljava/io/Closeable;)V
    //   207: aload_0
    //   208: areturn
    //   209: aload_0
    //   210: invokevirtual 149	java/net/URL:openConnection	()Ljava/net/URLConnection;
    //   213: checkcast 74	java/net/HttpURLConnection
    //   216: astore_3
    //   217: goto -168 -> 49
    //   220: ldc -105
    //   222: aload_3
    //   223: ldc -103
    //   225: invokevirtual 157	java/net/HttpURLConnection:getHeaderField	(Ljava/lang/String;)Ljava/lang/String;
    //   228: invokevirtual 161	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
    //   231: ifeq +258 -> 489
    //   234: new 163	java/util/zip/GZIPInputStream
    //   237: dup
    //   238: aload_1
    //   239: invokespecial 164	java/util/zip/GZIPInputStream:<init>	(Ljava/io/InputStream;)V
    //   242: astore_0
    //   243: aload_0
    //   244: invokestatic 167	com/tencent/tencentmap/mapsdk/a/rv:a	(Ljava/io/InputStream;)[B
    //   247: astore_1
    //   248: aload_1
    //   249: iconst_0
    //   250: aload_1
    //   251: arraylength
    //   252: invokestatic 173	android/graphics/BitmapFactory:decodeByteArray	([BII)Landroid/graphics/Bitmap;
    //   255: pop
    //   256: aconst_null
    //   257: astore 4
    //   259: aconst_null
    //   260: astore 5
    //   262: aload_0
    //   263: astore_2
    //   264: aload_1
    //   265: astore_0
    //   266: aload 5
    //   268: astore_1
    //   269: goto -83 -> 186
    //   272: astore_1
    //   273: new 10	java/lang/StringBuilder
    //   276: dup
    //   277: ldc -81
    //   279: invokespecial 178	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   282: aload_1
    //   283: invokevirtual 181	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   286: invokevirtual 27	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   289: pop
    //   290: aconst_null
    //   291: astore 4
    //   293: aconst_null
    //   294: astore_1
    //   295: aload_0
    //   296: astore_2
    //   297: aconst_null
    //   298: astore_0
    //   299: goto -113 -> 186
    //   302: astore_0
    //   303: aconst_null
    //   304: astore_0
    //   305: aconst_null
    //   306: astore_2
    //   307: aconst_null
    //   308: astore_1
    //   309: aconst_null
    //   310: astore_3
    //   311: aload_3
    //   312: ifnull +7 -> 319
    //   315: aload_3
    //   316: invokevirtual 141	java/net/HttpURLConnection:disconnect	()V
    //   319: aload_0
    //   320: invokestatic 146	com/tencent/tencentmap/mapsdk/a/rv:a	(Ljava/io/Closeable;)V
    //   323: aload_2
    //   324: invokestatic 146	com/tencent/tencentmap/mapsdk/a/rv:a	(Ljava/io/Closeable;)V
    //   327: aload_1
    //   328: invokestatic 146	com/tencent/tencentmap/mapsdk/a/rv:a	(Ljava/io/Closeable;)V
    //   331: aconst_null
    //   332: areturn
    //   333: astore_0
    //   334: aconst_null
    //   335: astore_1
    //   336: aconst_null
    //   337: astore_2
    //   338: aconst_null
    //   339: astore 4
    //   341: aconst_null
    //   342: astore_3
    //   343: aload_3
    //   344: ifnull +7 -> 351
    //   347: aload_3
    //   348: invokevirtual 141	java/net/HttpURLConnection:disconnect	()V
    //   351: aload_1
    //   352: invokestatic 146	com/tencent/tencentmap/mapsdk/a/rv:a	(Ljava/io/Closeable;)V
    //   355: aload_2
    //   356: invokestatic 146	com/tencent/tencentmap/mapsdk/a/rv:a	(Ljava/io/Closeable;)V
    //   359: aload 4
    //   361: invokestatic 146	com/tencent/tencentmap/mapsdk/a/rv:a	(Ljava/io/Closeable;)V
    //   364: aload_0
    //   365: athrow
    //   366: astore_0
    //   367: aconst_null
    //   368: astore_1
    //   369: aconst_null
    //   370: astore_2
    //   371: aconst_null
    //   372: astore 4
    //   374: goto -31 -> 343
    //   377: astore_0
    //   378: aconst_null
    //   379: astore 5
    //   381: aconst_null
    //   382: astore_2
    //   383: aload_1
    //   384: astore 4
    //   386: aload 5
    //   388: astore_1
    //   389: goto -46 -> 343
    //   392: astore_0
    //   393: aconst_null
    //   394: astore 6
    //   396: aload 5
    //   398: astore_2
    //   399: aload_1
    //   400: astore 4
    //   402: aload 6
    //   404: astore_1
    //   405: goto -62 -> 343
    //   408: astore_2
    //   409: aload_0
    //   410: astore 6
    //   412: aload_2
    //   413: astore_0
    //   414: aload 5
    //   416: astore_2
    //   417: aload_1
    //   418: astore 4
    //   420: aload 6
    //   422: astore_1
    //   423: goto -80 -> 343
    //   426: astore 5
    //   428: aconst_null
    //   429: astore_1
    //   430: aconst_null
    //   431: astore_2
    //   432: aload_0
    //   433: astore 4
    //   435: aload 5
    //   437: astore_0
    //   438: goto -95 -> 343
    //   441: astore_0
    //   442: aconst_null
    //   443: astore_0
    //   444: aconst_null
    //   445: astore_2
    //   446: aconst_null
    //   447: astore_1
    //   448: goto -137 -> 311
    //   451: astore_0
    //   452: aconst_null
    //   453: astore_0
    //   454: aconst_null
    //   455: astore_2
    //   456: goto -145 -> 311
    //   459: astore_0
    //   460: aconst_null
    //   461: astore_0
    //   462: aload 5
    //   464: astore_2
    //   465: goto -154 -> 311
    //   468: astore_2
    //   469: aload 5
    //   471: astore_2
    //   472: goto -161 -> 311
    //   475: astore_1
    //   476: aconst_null
    //   477: astore 4
    //   479: aconst_null
    //   480: astore_2
    //   481: aload_0
    //   482: astore_1
    //   483: aload 4
    //   485: astore_0
    //   486: goto -175 -> 311
    //   489: aload_1
    //   490: astore_0
    //   491: goto -248 -> 243
    //   494: aconst_null
    //   495: astore 6
    //   497: goto -322 -> 175
    //   500: aconst_null
    //   501: astore 4
    //   503: aconst_null
    //   504: astore_1
    //   505: aconst_null
    //   506: astore_2
    //   507: aconst_null
    //   508: astore_0
    //   509: goto -323 -> 186
    //   512: aconst_null
    //   513: astore_1
    //   514: goto -478 -> 36
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	517	0	paramURL	java.net.URL
    //   35	234	1	localObject1	Object
    //   272	11	1	localException1	Exception
    //   294	154	1	localObject2	Object
    //   475	1	1	localException2	Exception
    //   482	32	1	localURL	java.net.URL
    //   151	248	2	localObject3	Object
    //   408	5	2	localObject4	Object
    //   416	49	2	localObject5	Object
    //   468	1	2	localException3	Exception
    //   471	36	2	localObject6	Object
    //   48	300	3	localHttpURLConnection	java.net.HttpURLConnection
    //   176	326	4	localObject7	Object
    //   129	286	5	localInputStreamReader	java.io.InputStreamReader
    //   426	44	5	localObject8	Object
    //   168	328	6	localObject9	Object
    // Exception table:
    //   from	to	target	type
    //   248	256	272	java/lang/Exception
    //   6	36	302	java/lang/Exception
    //   40	49	302	java/lang/Exception
    //   209	217	302	java/lang/Exception
    //   6	36	333	finally
    //   40	49	333	finally
    //   209	217	333	finally
    //   49	103	366	finally
    //   103	131	377	finally
    //   220	243	377	finally
    //   131	141	392	finally
    //   141	152	408	finally
    //   156	170	408	finally
    //   243	248	426	finally
    //   248	256	426	finally
    //   273	290	426	finally
    //   49	103	441	java/lang/Exception
    //   103	131	451	java/lang/Exception
    //   220	243	451	java/lang/Exception
    //   131	141	459	java/lang/Exception
    //   141	152	468	java/lang/Exception
    //   156	170	468	java/lang/Exception
    //   243	248	475	java/lang/Exception
    //   273	290	475	java/lang/Exception
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/tn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */