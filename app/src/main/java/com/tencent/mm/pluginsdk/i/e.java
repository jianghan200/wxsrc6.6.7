package com.tencent.mm.pluginsdk.i;

public final class e
{
  /* Error */
  public static void a(android.graphics.Bitmap paramBitmap, android.graphics.Bitmap.CompressFormat paramCompressFormat, String paramString)
  {
    // Byte code:
    //   0: aload_2
    //   1: ifnull +10 -> 11
    //   4: aload_2
    //   5: invokevirtual 18	java/lang/String:length	()I
    //   8: ifgt +19 -> 27
    //   11: iconst_1
    //   12: istore_3
    //   13: iload_3
    //   14: ifeq +18 -> 32
    //   17: new 10	java/io/IOException
    //   20: dup
    //   21: ldc 20
    //   23: invokespecial 24	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   26: athrow
    //   27: iconst_0
    //   28: istore_3
    //   29: goto -16 -> 13
    //   32: new 26	java/io/File
    //   35: dup
    //   36: aload_2
    //   37: invokespecial 27	java/io/File:<init>	(Ljava/lang/String;)V
    //   40: astore_2
    //   41: aload_2
    //   42: invokevirtual 31	java/io/File:createNewFile	()Z
    //   45: pop
    //   46: new 33	java/io/FileOutputStream
    //   49: dup
    //   50: aload_2
    //   51: invokespecial 36	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   54: astore 4
    //   56: aload 4
    //   58: astore_2
    //   59: aload_0
    //   60: aload_1
    //   61: bipush 60
    //   63: aload 4
    //   65: invokevirtual 42	android/graphics/Bitmap:compress	(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z
    //   68: pop
    //   69: aload 4
    //   71: astore_2
    //   72: aload 4
    //   74: invokevirtual 46	java/io/FileOutputStream:flush	()V
    //   77: aload 4
    //   79: invokevirtual 49	java/io/FileOutputStream:close	()V
    //   82: ldc 51
    //   84: ldc 53
    //   86: iconst_1
    //   87: anewarray 4	java/lang/Object
    //   90: dup
    //   91: iconst_0
    //   92: aload_0
    //   93: invokevirtual 57	java/lang/Object:toString	()Ljava/lang/String;
    //   96: aastore
    //   97: invokestatic 63	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   100: aload_0
    //   101: invokevirtual 66	android/graphics/Bitmap:recycle	()V
    //   104: return
    //   105: astore_1
    //   106: ldc 51
    //   108: aload_1
    //   109: ldc 68
    //   111: iconst_0
    //   112: anewarray 4	java/lang/Object
    //   115: invokestatic 72	com/tencent/mm/sdk/platformtools/x:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   118: goto -36 -> 82
    //   121: astore_1
    //   122: aconst_null
    //   123: astore 4
    //   125: aload 4
    //   127: astore_2
    //   128: ldc 51
    //   130: aload_1
    //   131: ldc 68
    //   133: iconst_0
    //   134: anewarray 4	java/lang/Object
    //   137: invokestatic 72	com/tencent/mm/sdk/platformtools/x:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   140: aload 4
    //   142: ifnull +8 -> 150
    //   145: aload 4
    //   147: invokevirtual 49	java/io/FileOutputStream:close	()V
    //   150: ldc 51
    //   152: ldc 53
    //   154: iconst_1
    //   155: anewarray 4	java/lang/Object
    //   158: dup
    //   159: iconst_0
    //   160: aload_0
    //   161: invokevirtual 57	java/lang/Object:toString	()Ljava/lang/String;
    //   164: aastore
    //   165: invokestatic 63	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   168: aload_0
    //   169: invokevirtual 66	android/graphics/Bitmap:recycle	()V
    //   172: return
    //   173: astore_1
    //   174: ldc 51
    //   176: aload_1
    //   177: ldc 68
    //   179: iconst_0
    //   180: anewarray 4	java/lang/Object
    //   183: invokestatic 72	com/tencent/mm/sdk/platformtools/x:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   186: goto -36 -> 150
    //   189: astore_1
    //   190: aconst_null
    //   191: astore 4
    //   193: aload 4
    //   195: astore_2
    //   196: ldc 51
    //   198: aload_1
    //   199: ldc 68
    //   201: iconst_0
    //   202: anewarray 4	java/lang/Object
    //   205: invokestatic 72	com/tencent/mm/sdk/platformtools/x:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   208: aload 4
    //   210: ifnull +8 -> 218
    //   213: aload 4
    //   215: invokevirtual 49	java/io/FileOutputStream:close	()V
    //   218: ldc 51
    //   220: ldc 53
    //   222: iconst_1
    //   223: anewarray 4	java/lang/Object
    //   226: dup
    //   227: iconst_0
    //   228: aload_0
    //   229: invokevirtual 57	java/lang/Object:toString	()Ljava/lang/String;
    //   232: aastore
    //   233: invokestatic 63	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   236: aload_0
    //   237: invokevirtual 66	android/graphics/Bitmap:recycle	()V
    //   240: return
    //   241: astore_1
    //   242: ldc 51
    //   244: aload_1
    //   245: ldc 68
    //   247: iconst_0
    //   248: anewarray 4	java/lang/Object
    //   251: invokestatic 72	com/tencent/mm/sdk/platformtools/x:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   254: goto -36 -> 218
    //   257: astore_1
    //   258: aconst_null
    //   259: astore 4
    //   261: aload 4
    //   263: astore_2
    //   264: ldc 51
    //   266: aload_1
    //   267: ldc 68
    //   269: iconst_0
    //   270: anewarray 4	java/lang/Object
    //   273: invokestatic 72	com/tencent/mm/sdk/platformtools/x:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   276: aload 4
    //   278: ifnull +8 -> 286
    //   281: aload 4
    //   283: invokevirtual 49	java/io/FileOutputStream:close	()V
    //   286: ldc 51
    //   288: ldc 53
    //   290: iconst_1
    //   291: anewarray 4	java/lang/Object
    //   294: dup
    //   295: iconst_0
    //   296: aload_0
    //   297: invokevirtual 57	java/lang/Object:toString	()Ljava/lang/String;
    //   300: aastore
    //   301: invokestatic 63	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   304: aload_0
    //   305: invokevirtual 66	android/graphics/Bitmap:recycle	()V
    //   308: return
    //   309: astore_1
    //   310: ldc 51
    //   312: aload_1
    //   313: ldc 68
    //   315: iconst_0
    //   316: anewarray 4	java/lang/Object
    //   319: invokestatic 72	com/tencent/mm/sdk/platformtools/x:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   322: goto -36 -> 286
    //   325: astore_1
    //   326: aconst_null
    //   327: astore_2
    //   328: aload_2
    //   329: ifnull +7 -> 336
    //   332: aload_2
    //   333: invokevirtual 49	java/io/FileOutputStream:close	()V
    //   336: ldc 51
    //   338: ldc 53
    //   340: iconst_1
    //   341: anewarray 4	java/lang/Object
    //   344: dup
    //   345: iconst_0
    //   346: aload_0
    //   347: invokevirtual 57	java/lang/Object:toString	()Ljava/lang/String;
    //   350: aastore
    //   351: invokestatic 63	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   354: aload_0
    //   355: invokevirtual 66	android/graphics/Bitmap:recycle	()V
    //   358: aload_1
    //   359: athrow
    //   360: astore_2
    //   361: ldc 51
    //   363: aload_2
    //   364: ldc 68
    //   366: iconst_0
    //   367: anewarray 4	java/lang/Object
    //   370: invokestatic 72	com/tencent/mm/sdk/platformtools/x:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   373: goto -37 -> 336
    //   376: astore_1
    //   377: goto -49 -> 328
    //   380: astore_1
    //   381: goto -120 -> 261
    //   384: astore_1
    //   385: goto -192 -> 193
    //   388: astore_1
    //   389: goto -264 -> 125
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	392	0	paramBitmap	android.graphics.Bitmap
    //   0	392	1	paramCompressFormat	android.graphics.Bitmap.CompressFormat
    //   0	392	2	paramString	String
    //   12	17	3	i	int
    //   54	228	4	localFileOutputStream	java.io.FileOutputStream
    // Exception table:
    //   from	to	target	type
    //   77	82	105	java/io/IOException
    //   46	56	121	java/io/FileNotFoundException
    //   145	150	173	java/io/IOException
    //   46	56	189	java/io/IOException
    //   213	218	241	java/io/IOException
    //   46	56	257	java/lang/Exception
    //   281	286	309	java/io/IOException
    //   46	56	325	finally
    //   332	336	360	java/io/IOException
    //   59	69	376	finally
    //   72	77	376	finally
    //   128	140	376	finally
    //   196	208	376	finally
    //   264	276	376	finally
    //   59	69	380	java/lang/Exception
    //   72	77	380	java/lang/Exception
    //   59	69	384	java/io/IOException
    //   72	77	384	java/io/IOException
    //   59	69	388	java/io/FileNotFoundException
    //   72	77	388	java/io/FileNotFoundException
  }
  
  public static String iR(int paramInt)
  {
    return String.format("%d:%02d", new Object[] { Long.valueOf(paramInt / 60L), Long.valueOf(paramInt % 60L) });
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/pluginsdk/i/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */