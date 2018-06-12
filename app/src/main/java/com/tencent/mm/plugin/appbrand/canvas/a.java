package com.tencent.mm.plugin.appbrand.canvas;

import com.tencent.mm.modelappbrand.b.b.e;

final class a
  implements b.e
{
  private int fmL;
  private int fmM;
  private int mHeight;
  private int mWidth;
  
  public a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.fmL = paramInt1;
    this.fmM = paramInt2;
    this.mWidth = paramInt3;
    this.mHeight = paramInt4;
  }
  
  public final String Ke()
  {
    return String.format("Decoder_x%s_y%s_w%s_h%s", new Object[] { Integer.valueOf(this.fmL), Integer.valueOf(this.fmM), Integer.valueOf(this.mWidth), Integer.valueOf(this.mHeight) });
  }
  
  /* Error */
  public final android.graphics.Bitmap j(java.io.InputStream paramInputStream)
  {
    // Byte code:
    //   0: aload_1
    //   1: astore 7
    //   3: aload_1
    //   4: astore 9
    //   6: aload_1
    //   7: astore 8
    //   9: aload_1
    //   10: invokevirtual 51	java/io/InputStream:markSupported	()Z
    //   13: ifne +35 -> 48
    //   16: aload_1
    //   17: astore 9
    //   19: aload_1
    //   20: astore 8
    //   22: aload_1
    //   23: instanceof 53
    //   26: ifeq +204 -> 230
    //   29: aload_1
    //   30: astore 9
    //   32: aload_1
    //   33: astore 8
    //   35: new 55	com/tencent/mm/sdk/platformtools/i
    //   38: dup
    //   39: aload_1
    //   40: checkcast 53	java/io/FileInputStream
    //   43: invokespecial 58	com/tencent/mm/sdk/platformtools/i:<init>	(Ljava/io/FileInputStream;)V
    //   46: astore 7
    //   48: aload 7
    //   50: astore 9
    //   52: aload 7
    //   54: astore 8
    //   56: new 60	android/graphics/BitmapFactory$Options
    //   59: dup
    //   60: invokespecial 61	android/graphics/BitmapFactory$Options:<init>	()V
    //   63: astore_1
    //   64: aload 7
    //   66: astore 9
    //   68: aload 7
    //   70: astore 8
    //   72: aload_1
    //   73: iconst_1
    //   74: putfield 65	android/graphics/BitmapFactory$Options:inJustDecodeBounds	Z
    //   77: aload 7
    //   79: astore 9
    //   81: aload 7
    //   83: astore 8
    //   85: aload 7
    //   87: ldc 66
    //   89: invokevirtual 70	java/io/InputStream:mark	(I)V
    //   92: aload 7
    //   94: astore 9
    //   96: aload 7
    //   98: astore 8
    //   100: aload 7
    //   102: aconst_null
    //   103: aload_1
    //   104: invokestatic 76	android/graphics/BitmapFactory:decodeStream	(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    //   107: astore 10
    //   109: aload 7
    //   111: astore 9
    //   113: aload 7
    //   115: astore 8
    //   117: aload 7
    //   119: invokevirtual 79	java/io/InputStream:reset	()V
    //   122: aload 10
    //   124: ifnull +16 -> 140
    //   127: aload 7
    //   129: astore 9
    //   131: aload 7
    //   133: astore 8
    //   135: aload 10
    //   137: invokevirtual 84	android/graphics/Bitmap:recycle	()V
    //   140: aload 7
    //   142: astore 9
    //   144: aload 7
    //   146: astore 8
    //   148: aload_1
    //   149: getfield 87	android/graphics/BitmapFactory$Options:outHeight	I
    //   152: ifle +18 -> 170
    //   155: aload 7
    //   157: astore 9
    //   159: aload 7
    //   161: astore 8
    //   163: aload_1
    //   164: getfield 90	android/graphics/BitmapFactory$Options:outWidth	I
    //   167: ifgt +98 -> 265
    //   170: aload 7
    //   172: astore 9
    //   174: aload 7
    //   176: astore 8
    //   178: ldc 92
    //   180: ldc 94
    //   182: iconst_3
    //   183: anewarray 4	java/lang/Object
    //   186: dup
    //   187: iconst_0
    //   188: aload 7
    //   190: aastore
    //   191: dup
    //   192: iconst_1
    //   193: aload_1
    //   194: getfield 87	android/graphics/BitmapFactory$Options:outHeight	I
    //   197: invokestatic 35	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   200: aastore
    //   201: dup
    //   202: iconst_2
    //   203: aload_1
    //   204: getfield 90	android/graphics/BitmapFactory$Options:outWidth	I
    //   207: invokestatic 35	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   210: aastore
    //   211: invokestatic 100	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   214: aload 7
    //   216: ifnull +8 -> 224
    //   219: aload 7
    //   221: invokevirtual 103	java/io/InputStream:close	()V
    //   224: aconst_null
    //   225: astore 8
    //   227: aload 8
    //   229: areturn
    //   230: aload_1
    //   231: astore 7
    //   233: aload_1
    //   234: astore 9
    //   236: aload_1
    //   237: astore 8
    //   239: aload_1
    //   240: invokevirtual 51	java/io/InputStream:markSupported	()Z
    //   243: ifne -195 -> 48
    //   246: aload_1
    //   247: astore 9
    //   249: aload_1
    //   250: astore 8
    //   252: new 105	java/io/BufferedInputStream
    //   255: dup
    //   256: aload_1
    //   257: invokespecial 108	java/io/BufferedInputStream:<init>	(Ljava/io/InputStream;)V
    //   260: astore 7
    //   262: goto -214 -> 48
    //   265: aload 7
    //   267: astore 9
    //   269: aload 7
    //   271: astore 8
    //   273: aload_1
    //   274: aload_1
    //   275: getfield 90	android/graphics/BitmapFactory$Options:outWidth	I
    //   278: i2d
    //   279: dconst_1
    //   280: dmul
    //   281: aload_0
    //   282: getfield 22	com/tencent/mm/plugin/appbrand/canvas/a:mWidth	I
    //   285: i2d
    //   286: ddiv
    //   287: d2i
    //   288: putfield 111	android/graphics/BitmapFactory$Options:inSampleSize	I
    //   291: aload 7
    //   293: astore 9
    //   295: aload 7
    //   297: astore 8
    //   299: aload_1
    //   300: getfield 111	android/graphics/BitmapFactory$Options:inSampleSize	I
    //   303: iconst_1
    //   304: if_icmpgt +16 -> 320
    //   307: aload 7
    //   309: astore 9
    //   311: aload 7
    //   313: astore 8
    //   315: aload_1
    //   316: iconst_1
    //   317: putfield 111	android/graphics/BitmapFactory$Options:inSampleSize	I
    //   320: aload 7
    //   322: astore 9
    //   324: aload 7
    //   326: astore 8
    //   328: aload_1
    //   329: getfield 87	android/graphics/BitmapFactory$Options:outHeight	I
    //   332: aload_1
    //   333: getfield 90	android/graphics/BitmapFactory$Options:outWidth	I
    //   336: imul
    //   337: aload_1
    //   338: getfield 111	android/graphics/BitmapFactory$Options:inSampleSize	I
    //   341: idiv
    //   342: aload_1
    //   343: getfield 111	android/graphics/BitmapFactory$Options:inSampleSize	I
    //   346: idiv
    //   347: ldc 112
    //   349: if_icmple +59 -> 408
    //   352: aload 7
    //   354: astore 9
    //   356: aload 7
    //   358: astore 8
    //   360: aload_1
    //   361: aload_1
    //   362: getfield 111	android/graphics/BitmapFactory$Options:inSampleSize	I
    //   365: iconst_1
    //   366: iadd
    //   367: putfield 111	android/graphics/BitmapFactory$Options:inSampleSize	I
    //   370: goto -50 -> 320
    //   373: astore_1
    //   374: aload 9
    //   376: astore 8
    //   378: ldc 92
    //   380: ldc 114
    //   382: iconst_1
    //   383: anewarray 4	java/lang/Object
    //   386: dup
    //   387: iconst_0
    //   388: aload_1
    //   389: invokestatic 120	android/util/Log:getStackTraceString	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   392: aastore
    //   393: invokestatic 100	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   396: aload 9
    //   398: ifnull +8 -> 406
    //   401: aload 9
    //   403: invokevirtual 103	java/io/InputStream:close	()V
    //   406: aconst_null
    //   407: areturn
    //   408: aload 7
    //   410: astore 9
    //   412: aload 7
    //   414: astore 8
    //   416: aload_1
    //   417: iconst_0
    //   418: putfield 65	android/graphics/BitmapFactory$Options:inJustDecodeBounds	Z
    //   421: aload 7
    //   423: astore 9
    //   425: aload 7
    //   427: astore 8
    //   429: aload_1
    //   430: iconst_1
    //   431: putfield 123	android/graphics/BitmapFactory$Options:inMutable	Z
    //   434: aload 7
    //   436: astore 9
    //   438: aload 7
    //   440: astore 8
    //   442: aload_0
    //   443: getfield 18	com/tencent/mm/plugin/appbrand/canvas/a:fmL	I
    //   446: istore_2
    //   447: aload 7
    //   449: astore 9
    //   451: aload 7
    //   453: astore 8
    //   455: aload_0
    //   456: getfield 20	com/tencent/mm/plugin/appbrand/canvas/a:fmM	I
    //   459: istore_3
    //   460: aload 7
    //   462: astore 9
    //   464: aload 7
    //   466: astore 8
    //   468: aload_0
    //   469: getfield 18	com/tencent/mm/plugin/appbrand/canvas/a:fmL	I
    //   472: ifge +168 -> 640
    //   475: iconst_0
    //   476: istore_2
    //   477: aload 7
    //   479: astore 9
    //   481: aload 7
    //   483: astore 8
    //   485: aload_0
    //   486: getfield 20	com/tencent/mm/plugin/appbrand/canvas/a:fmM	I
    //   489: ifge +198 -> 687
    //   492: iconst_0
    //   493: istore_3
    //   494: aload 7
    //   496: astore 9
    //   498: aload 7
    //   500: astore 8
    //   502: aload_0
    //   503: getfield 22	com/tencent/mm/plugin/appbrand/canvas/a:mWidth	I
    //   506: aload_0
    //   507: getfield 18	com/tencent/mm/plugin/appbrand/canvas/a:fmL	I
    //   510: iadd
    //   511: iload_2
    //   512: isub
    //   513: istore 5
    //   515: aload 7
    //   517: astore 9
    //   519: aload 7
    //   521: astore 8
    //   523: aload_0
    //   524: getfield 24	com/tencent/mm/plugin/appbrand/canvas/a:mHeight	I
    //   527: aload_0
    //   528: getfield 20	com/tencent/mm/plugin/appbrand/canvas/a:fmM	I
    //   531: iadd
    //   532: iload_3
    //   533: isub
    //   534: istore 6
    //   536: aload 7
    //   538: astore 9
    //   540: iload 5
    //   542: istore 4
    //   544: aload 7
    //   546: astore 8
    //   548: iload_2
    //   549: iload 5
    //   551: iadd
    //   552: aload_1
    //   553: getfield 90	android/graphics/BitmapFactory$Options:outWidth	I
    //   556: if_icmple +19 -> 575
    //   559: aload 7
    //   561: astore 9
    //   563: aload 7
    //   565: astore 8
    //   567: aload_1
    //   568: getfield 90	android/graphics/BitmapFactory$Options:outWidth	I
    //   571: iload_2
    //   572: isub
    //   573: istore 4
    //   575: aload 7
    //   577: astore 9
    //   579: iload 6
    //   581: istore 5
    //   583: aload 7
    //   585: astore 8
    //   587: iload_3
    //   588: iload 6
    //   590: iadd
    //   591: aload_1
    //   592: getfield 87	android/graphics/BitmapFactory$Options:outHeight	I
    //   595: if_icmple +23 -> 618
    //   598: aload 7
    //   600: astore 9
    //   602: aload 7
    //   604: astore 8
    //   606: aload_1
    //   607: getfield 87	android/graphics/BitmapFactory$Options:outHeight	I
    //   610: istore 5
    //   612: iload 5
    //   614: iload_3
    //   615: isub
    //   616: istore 5
    //   618: iload 4
    //   620: ifle +8 -> 628
    //   623: iload 5
    //   625: ifgt +109 -> 734
    //   628: aload 7
    //   630: ifnull +8 -> 638
    //   633: aload 7
    //   635: invokevirtual 103	java/io/InputStream:close	()V
    //   638: aconst_null
    //   639: areturn
    //   640: aload 7
    //   642: astore 9
    //   644: aload 7
    //   646: astore 8
    //   648: aload_0
    //   649: getfield 18	com/tencent/mm/plugin/appbrand/canvas/a:fmL	I
    //   652: istore 4
    //   654: aload 7
    //   656: astore 9
    //   658: aload 7
    //   660: astore 8
    //   662: aload_1
    //   663: getfield 90	android/graphics/BitmapFactory$Options:outWidth	I
    //   666: istore 5
    //   668: iload 4
    //   670: iload 5
    //   672: if_icmple +158 -> 830
    //   675: aload 7
    //   677: ifnull +8 -> 685
    //   680: aload 7
    //   682: invokevirtual 103	java/io/InputStream:close	()V
    //   685: aconst_null
    //   686: areturn
    //   687: aload 7
    //   689: astore 9
    //   691: aload 7
    //   693: astore 8
    //   695: aload_0
    //   696: getfield 20	com/tencent/mm/plugin/appbrand/canvas/a:fmM	I
    //   699: istore 4
    //   701: aload 7
    //   703: astore 9
    //   705: aload 7
    //   707: astore 8
    //   709: aload_1
    //   710: getfield 87	android/graphics/BitmapFactory$Options:outHeight	I
    //   713: istore 5
    //   715: iload 4
    //   717: iload 5
    //   719: if_icmple +108 -> 827
    //   722: aload 7
    //   724: ifnull +8 -> 732
    //   727: aload 7
    //   729: invokevirtual 103	java/io/InputStream:close	()V
    //   732: aconst_null
    //   733: areturn
    //   734: aload 7
    //   736: astore 9
    //   738: aload 7
    //   740: astore 8
    //   742: aload 7
    //   744: iconst_0
    //   745: invokestatic 129	android/graphics/BitmapRegionDecoder:newInstance	(Ljava/io/InputStream;Z)Landroid/graphics/BitmapRegionDecoder;
    //   748: new 131	android/graphics/Rect
    //   751: dup
    //   752: iload_2
    //   753: iload_3
    //   754: iload 4
    //   756: iload_2
    //   757: iadd
    //   758: iload 5
    //   760: iload_3
    //   761: iadd
    //   762: invokespecial 133	android/graphics/Rect:<init>	(IIII)V
    //   765: aload_1
    //   766: invokevirtual 137	android/graphics/BitmapRegionDecoder:decodeRegion	(Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    //   769: astore_1
    //   770: aload_1
    //   771: astore 8
    //   773: aload 7
    //   775: ifnull -548 -> 227
    //   778: aload 7
    //   780: invokevirtual 103	java/io/InputStream:close	()V
    //   783: aload_1
    //   784: areturn
    //   785: astore 7
    //   787: aload_1
    //   788: areturn
    //   789: astore_1
    //   790: aload 8
    //   792: ifnull +8 -> 800
    //   795: aload 8
    //   797: invokevirtual 103	java/io/InputStream:close	()V
    //   800: aload_1
    //   801: athrow
    //   802: astore_1
    //   803: goto -579 -> 224
    //   806: astore_1
    //   807: goto -122 -> 685
    //   810: astore_1
    //   811: goto -79 -> 732
    //   814: astore_1
    //   815: goto -177 -> 638
    //   818: astore_1
    //   819: goto -413 -> 406
    //   822: astore 7
    //   824: goto -24 -> 800
    //   827: goto -333 -> 494
    //   830: goto -353 -> 477
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	833	0	this	a
    //   0	833	1	paramInputStream	java.io.InputStream
    //   446	312	2	i	int
    //   459	303	3	j	int
    //   542	216	4	k	int
    //   513	249	5	m	int
    //   534	57	6	n	int
    //   1	778	7	localObject1	Object
    //   785	1	7	localIOException1	java.io.IOException
    //   822	1	7	localIOException2	java.io.IOException
    //   7	789	8	localObject2	Object
    //   4	733	9	localObject3	Object
    //   107	29	10	localBitmap	android.graphics.Bitmap
    // Exception table:
    //   from	to	target	type
    //   9	16	373	java/io/IOException
    //   22	29	373	java/io/IOException
    //   35	48	373	java/io/IOException
    //   56	64	373	java/io/IOException
    //   72	77	373	java/io/IOException
    //   85	92	373	java/io/IOException
    //   100	109	373	java/io/IOException
    //   117	122	373	java/io/IOException
    //   135	140	373	java/io/IOException
    //   148	155	373	java/io/IOException
    //   163	170	373	java/io/IOException
    //   178	214	373	java/io/IOException
    //   239	246	373	java/io/IOException
    //   252	262	373	java/io/IOException
    //   273	291	373	java/io/IOException
    //   299	307	373	java/io/IOException
    //   315	320	373	java/io/IOException
    //   328	352	373	java/io/IOException
    //   360	370	373	java/io/IOException
    //   416	421	373	java/io/IOException
    //   429	434	373	java/io/IOException
    //   442	447	373	java/io/IOException
    //   455	460	373	java/io/IOException
    //   468	475	373	java/io/IOException
    //   485	492	373	java/io/IOException
    //   502	515	373	java/io/IOException
    //   523	536	373	java/io/IOException
    //   548	559	373	java/io/IOException
    //   567	575	373	java/io/IOException
    //   587	598	373	java/io/IOException
    //   606	612	373	java/io/IOException
    //   648	654	373	java/io/IOException
    //   662	668	373	java/io/IOException
    //   695	701	373	java/io/IOException
    //   709	715	373	java/io/IOException
    //   742	770	373	java/io/IOException
    //   778	783	785	java/io/IOException
    //   9	16	789	finally
    //   22	29	789	finally
    //   35	48	789	finally
    //   56	64	789	finally
    //   72	77	789	finally
    //   85	92	789	finally
    //   100	109	789	finally
    //   117	122	789	finally
    //   135	140	789	finally
    //   148	155	789	finally
    //   163	170	789	finally
    //   178	214	789	finally
    //   239	246	789	finally
    //   252	262	789	finally
    //   273	291	789	finally
    //   299	307	789	finally
    //   315	320	789	finally
    //   328	352	789	finally
    //   360	370	789	finally
    //   378	396	789	finally
    //   416	421	789	finally
    //   429	434	789	finally
    //   442	447	789	finally
    //   455	460	789	finally
    //   468	475	789	finally
    //   485	492	789	finally
    //   502	515	789	finally
    //   523	536	789	finally
    //   548	559	789	finally
    //   567	575	789	finally
    //   587	598	789	finally
    //   606	612	789	finally
    //   648	654	789	finally
    //   662	668	789	finally
    //   695	701	789	finally
    //   709	715	789	finally
    //   742	770	789	finally
    //   219	224	802	java/io/IOException
    //   680	685	806	java/io/IOException
    //   727	732	810	java/io/IOException
    //   633	638	814	java/io/IOException
    //   401	406	818	java/io/IOException
    //   795	800	822	java/io/IOException
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/canvas/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */