package com.tencent.mm.sdk.platformtools;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.BitmapFactory.Options;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.vfs.d;
import java.io.FileNotFoundException;
import java.io.IOException;

public final class z
{
  public static int Wn(String paramString)
  {
    Object localObject = null;
    BitmapFactory.Options localOptions = new BitmapFactory.Options();
    localOptions.inJustDecodeBounds = true;
    try
    {
      paramString = MMBitmapFactory.decodeStream(d.openRead(paramString), null, localOptions, 0);
      if (paramString != null)
      {
        x.i("MicroMsg.LongBitmapHandler", "isLongPicture bitmap recycle. %s", new Object[] { paramString });
        paramString.recycle();
      }
      float f1 = localOptions.outWidth / localOptions.outHeight;
      float f2 = localOptions.outHeight / localOptions.outWidth;
      if (f1 >= 2.0F) {
        return 1;
      }
      if (f2 >= 2.0F) {
        return 2;
      }
      return -1;
    }
    catch (FileNotFoundException paramString)
    {
      for (;;)
      {
        paramString = (String)localObject;
      }
    }
  }
  
  public static boolean a(String paramString1, Bitmap.CompressFormat paramCompressFormat, String paramString2, int paramInt)
  {
    return a(paramString1, paramCompressFormat, paramString2, paramInt, new PInt(), new PInt());
  }
  
  private static boolean a(String paramString1, Bitmap.CompressFormat paramCompressFormat, String paramString2, int paramInt, PInt paramPInt1, PInt paramPInt2)
  {
    paramString1 = l(paramString1, paramInt, 0, 1);
    try
    {
      paramPInt1.value = paramString1.getWidth();
      paramPInt2.value = paramString1.getHeight();
      c.a(paramString1, 90, paramCompressFormat, paramString2, true);
      return true;
    }
    catch (IOException paramString1)
    {
      x.e("MicroMsg.LongBitmapHandler", "create thumbnail from orig failed: " + paramString2);
    }
    return false;
  }
  
  public static boolean bu(int paramInt1, int paramInt2)
  {
    return paramInt2 > paramInt1 * 2.0D;
  }
  
  public static boolean bv(int paramInt1, int paramInt2)
  {
    return paramInt1 > paramInt2 * 2.0D;
  }
  
  /* Error */
  public static Bitmap l(String paramString, int paramInt1, int paramInt2, int paramInt3)
  {
    // Byte code:
    //   0: ldc 32
    //   2: ldc 108
    //   4: bipush 6
    //   6: anewarray 4	java/lang/Object
    //   9: dup
    //   10: iconst_0
    //   11: aload_0
    //   12: aastore
    //   13: dup
    //   14: iconst_1
    //   15: bipush 56
    //   17: invokestatic 114	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   20: aastore
    //   21: dup
    //   22: iconst_2
    //   23: sipush 144
    //   26: invokestatic 114	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   29: aastore
    //   30: dup
    //   31: iconst_3
    //   32: iload_1
    //   33: invokestatic 114	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   36: aastore
    //   37: dup
    //   38: iconst_4
    //   39: iload_2
    //   40: invokestatic 114	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   43: aastore
    //   44: dup
    //   45: iconst_5
    //   46: iload_3
    //   47: invokestatic 114	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   50: aastore
    //   51: invokestatic 40	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   54: getstatic 119	com/tencent/mm/compatible/d/a:dbt	I
    //   57: istore 5
    //   59: lconst_0
    //   60: invokestatic 123	com/tencent/mm/compatible/d/a:aK	(J)V
    //   63: aload_0
    //   64: invokestatic 129	com/tencent/mm/sdk/platformtools/bi:oW	(Ljava/lang/String;)Z
    //   67: ifne +59 -> 126
    //   70: iload_1
    //   71: iconst_2
    //   72: if_icmpeq +8 -> 80
    //   75: iload_1
    //   76: iconst_1
    //   77: if_icmpne +49 -> 126
    //   80: aload_0
    //   81: invokestatic 133	com/tencent/mm/sdk/platformtools/c:Wa	(Ljava/lang/String;)Landroid/graphics/Point;
    //   84: astore 13
    //   86: aload 13
    //   88: ifnull +19 -> 107
    //   91: aload 13
    //   93: getfield 138	android/graphics/Point:x	I
    //   96: ifle +11 -> 107
    //   99: aload 13
    //   101: getfield 141	android/graphics/Point:y	I
    //   104: ifgt +39 -> 143
    //   107: ldc 32
    //   109: ldc -113
    //   111: invokestatic 146	com/tencent/mm/sdk/platformtools/x:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   114: getstatic 119	com/tencent/mm/compatible/d/a:dbt	I
    //   117: istore_1
    //   118: ldc2_w 147
    //   121: invokestatic 123	com/tencent/mm/compatible/d/a:aK	(J)V
    //   124: aconst_null
    //   125: areturn
    //   126: ldc 32
    //   128: ldc -106
    //   130: invokestatic 146	com/tencent/mm/sdk/platformtools/x:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   133: getstatic 119	com/tencent/mm/compatible/d/a:dbt	I
    //   136: istore_1
    //   137: lconst_1
    //   138: invokestatic 123	com/tencent/mm/compatible/d/a:aK	(J)V
    //   141: aconst_null
    //   142: areturn
    //   143: aload 13
    //   145: getfield 138	android/graphics/Point:x	I
    //   148: istore 5
    //   150: aload 13
    //   152: getfield 141	android/graphics/Point:y	I
    //   155: istore 6
    //   157: iload_1
    //   158: iconst_1
    //   159: if_icmpne +294 -> 453
    //   162: iload 5
    //   164: i2d
    //   165: iload 6
    //   167: i2d
    //   168: ddiv
    //   169: ldc2_w 151
    //   172: dcmpl
    //   173: ifle +274 -> 447
    //   176: iconst_1
    //   177: istore 12
    //   179: iload 12
    //   181: ifeq +351 -> 532
    //   184: iload_1
    //   185: iconst_1
    //   186: if_icmpne +293 -> 479
    //   189: iload 6
    //   191: i2d
    //   192: ldc2_w 151
    //   195: dmul
    //   196: d2i
    //   197: istore 7
    //   199: iload 5
    //   201: i2d
    //   202: iload 6
    //   204: i2d
    //   205: ldc2_w 151
    //   208: dmul
    //   209: dsub
    //   210: ldc2_w 104
    //   213: ddiv
    //   214: d2i
    //   215: istore 10
    //   217: iconst_0
    //   218: istore 8
    //   220: iload 6
    //   222: istore_1
    //   223: iload 7
    //   225: istore 5
    //   227: iload 7
    //   229: istore 9
    //   231: iload 6
    //   233: istore 7
    //   235: iload 10
    //   237: istore 6
    //   239: ldc 32
    //   241: ldc -102
    //   243: iconst_5
    //   244: anewarray 4	java/lang/Object
    //   247: dup
    //   248: iconst_0
    //   249: iload 12
    //   251: invokestatic 159	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   254: aastore
    //   255: dup
    //   256: iconst_1
    //   257: iload 9
    //   259: invokestatic 114	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   262: aastore
    //   263: dup
    //   264: iconst_2
    //   265: iload 7
    //   267: invokestatic 114	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   270: aastore
    //   271: dup
    //   272: iconst_3
    //   273: iload 6
    //   275: invokestatic 114	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   278: aastore
    //   279: dup
    //   280: iconst_4
    //   281: iload 8
    //   283: invokestatic 114	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   286: aastore
    //   287: invokestatic 162	com/tencent/mm/sdk/platformtools/x:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   290: iconst_1
    //   291: istore 10
    //   293: fconst_1
    //   294: fstore 4
    //   296: iload 5
    //   298: sipush 144
    //   301: if_icmple +294 -> 595
    //   304: iload_1
    //   305: iload 5
    //   307: iload_1
    //   308: invokestatic 166	com/tencent/mm/sdk/platformtools/c:ai	(III)I
    //   311: istore_1
    //   312: ldc -89
    //   314: iload 5
    //   316: iload_1
    //   317: idiv
    //   318: i2f
    //   319: fdiv
    //   320: fstore 4
    //   322: ldc 32
    //   324: ldc -87
    //   326: iconst_2
    //   327: anewarray 4	java/lang/Object
    //   330: dup
    //   331: iconst_0
    //   332: iload_1
    //   333: invokestatic 114	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   336: aastore
    //   337: dup
    //   338: iconst_1
    //   339: fload 4
    //   341: invokestatic 174	java/lang/Float:valueOf	(F)Ljava/lang/Float;
    //   344: aastore
    //   345: invokestatic 162	com/tencent/mm/sdk/platformtools/x:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   348: iload_1
    //   349: istore 5
    //   351: new 10	android/graphics/BitmapFactory$Options
    //   354: dup
    //   355: invokespecial 14	android/graphics/BitmapFactory$Options:<init>	()V
    //   358: astore 13
    //   360: aload 13
    //   362: iload 5
    //   364: putfield 177	android/graphics/BitmapFactory$Options:inSampleSize	I
    //   367: iload 12
    //   369: ifeq +321 -> 690
    //   372: aload_0
    //   373: invokestatic 24	com/tencent/mm/vfs/d:openRead	(Ljava/lang/String;)Ljava/io/InputStream;
    //   376: astore_0
    //   377: aload_0
    //   378: new 179	android/graphics/Rect
    //   381: dup
    //   382: iload 6
    //   384: iload 8
    //   386: iload 6
    //   388: iload 9
    //   390: iadd
    //   391: iload 7
    //   393: iload 8
    //   395: iadd
    //   396: invokespecial 182	android/graphics/Rect:<init>	(IIII)V
    //   399: aload 13
    //   401: aconst_null
    //   402: invokestatic 186	com/tencent/mm/sdk/platformtools/MMBitmapFactory:decodeRegion	(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;Lcom/tencent/mm/sdk/platformtools/MMBitmapFactory$DecodeResultLogger;)Landroid/graphics/Bitmap;
    //   405: astore 14
    //   407: aload 14
    //   409: astore 13
    //   411: aload_0
    //   412: ifnull +11 -> 423
    //   415: aload_0
    //   416: invokevirtual 191	java/io/InputStream:close	()V
    //   419: aload 14
    //   421: astore 13
    //   423: aload 13
    //   425: ifnonnull +281 -> 706
    //   428: ldc 32
    //   430: ldc -63
    //   432: invokestatic 101	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   435: getstatic 119	com/tencent/mm/compatible/d/a:dbt	I
    //   438: istore_1
    //   439: ldc2_w 194
    //   442: invokestatic 123	com/tencent/mm/compatible/d/a:aK	(J)V
    //   445: aconst_null
    //   446: areturn
    //   447: iconst_0
    //   448: istore 12
    //   450: goto -271 -> 179
    //   453: iload 6
    //   455: i2d
    //   456: iload 5
    //   458: i2d
    //   459: ddiv
    //   460: ldc2_w 151
    //   463: dcmpl
    //   464: ifle +9 -> 473
    //   467: iconst_1
    //   468: istore 12
    //   470: goto -291 -> 179
    //   473: iconst_0
    //   474: istore 12
    //   476: goto -297 -> 179
    //   479: iload 5
    //   481: i2d
    //   482: ldc2_w 151
    //   485: dmul
    //   486: d2i
    //   487: istore 7
    //   489: iconst_0
    //   490: istore 10
    //   492: iload 6
    //   494: i2d
    //   495: iload 5
    //   497: i2d
    //   498: ldc2_w 151
    //   501: dmul
    //   502: dsub
    //   503: ldc2_w 104
    //   506: ddiv
    //   507: d2i
    //   508: istore 8
    //   510: iload 5
    //   512: istore_1
    //   513: iload 7
    //   515: istore 6
    //   517: iload 5
    //   519: istore 9
    //   521: iload 6
    //   523: istore 5
    //   525: iload 10
    //   527: istore 6
    //   529: goto -290 -> 239
    //   532: iload_1
    //   533: iconst_1
    //   534: if_icmpne +48 -> 582
    //   537: iload 5
    //   539: istore 7
    //   541: iload_1
    //   542: iconst_1
    //   543: if_icmpne +46 -> 589
    //   546: iload 6
    //   548: istore_1
    //   549: iconst_0
    //   550: istore 10
    //   552: iconst_0
    //   553: istore 11
    //   555: iload 6
    //   557: istore 8
    //   559: iload 5
    //   561: istore 9
    //   563: iload 7
    //   565: istore 5
    //   567: iload 11
    //   569: istore 6
    //   571: iload 8
    //   573: istore 7
    //   575: iload 10
    //   577: istore 8
    //   579: goto -340 -> 239
    //   582: iload 6
    //   584: istore 7
    //   586: goto -45 -> 541
    //   589: iload 5
    //   591: istore_1
    //   592: goto -43 -> 549
    //   595: iload 10
    //   597: istore 5
    //   599: iload_1
    //   600: bipush 56
    //   602: if_icmpge -251 -> 351
    //   605: ldc -60
    //   607: iload_1
    //   608: i2f
    //   609: fdiv
    //   610: fstore 4
    //   612: ldc 32
    //   614: ldc -58
    //   616: iconst_1
    //   617: anewarray 4	java/lang/Object
    //   620: dup
    //   621: iconst_0
    //   622: fload 4
    //   624: invokestatic 174	java/lang/Float:valueOf	(F)Ljava/lang/Float;
    //   627: aastore
    //   628: invokestatic 162	com/tencent/mm/sdk/platformtools/x:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   631: iload 10
    //   633: istore 5
    //   635: goto -284 -> 351
    //   638: astore 13
    //   640: aconst_null
    //   641: astore_0
    //   642: ldc 32
    //   644: aload 13
    //   646: ldc -56
    //   648: iconst_0
    //   649: anewarray 4	java/lang/Object
    //   652: invokestatic 204	com/tencent/mm/sdk/platformtools/x:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   655: getstatic 119	com/tencent/mm/compatible/d/a:dbt	I
    //   658: istore_1
    //   659: ldc2_w 205
    //   662: invokestatic 123	com/tencent/mm/compatible/d/a:aK	(J)V
    //   665: aload_0
    //   666: ifnull +7 -> 673
    //   669: aload_0
    //   670: invokevirtual 191	java/io/InputStream:close	()V
    //   673: aconst_null
    //   674: areturn
    //   675: astore 13
    //   677: aconst_null
    //   678: astore_0
    //   679: aload_0
    //   680: ifnull +7 -> 687
    //   683: aload_0
    //   684: invokevirtual 191	java/io/InputStream:close	()V
    //   687: aload 13
    //   689: athrow
    //   690: aload_0
    //   691: aload 13
    //   693: aconst_null
    //   694: iload_3
    //   695: iconst_0
    //   696: newarray <illegal type>
    //   698: invokestatic 210	com/tencent/mm/sdk/platformtools/MMBitmapFactory:decodeFile	(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;Lcom/tencent/mm/sdk/platformtools/MMBitmapFactory$DecodeResultLogger;I[I)Landroid/graphics/Bitmap;
    //   701: astore 13
    //   703: goto -280 -> 423
    //   706: getstatic 119	com/tencent/mm/compatible/d/a:dbt	I
    //   709: istore_1
    //   710: ldc2_w 211
    //   713: invokestatic 123	com/tencent/mm/compatible/d/a:aK	(J)V
    //   716: fload 4
    //   718: fconst_1
    //   719: fcmpl
    //   720: ifne +17 -> 737
    //   723: iload_2
    //   724: ifne +13 -> 737
    //   727: ldc 32
    //   729: ldc -42
    //   731: invokestatic 216	com/tencent/mm/sdk/platformtools/x:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   734: aload 13
    //   736: areturn
    //   737: new 218	android/graphics/Matrix
    //   740: dup
    //   741: invokespecial 219	android/graphics/Matrix:<init>	()V
    //   744: astore_0
    //   745: aload_0
    //   746: fload 4
    //   748: fload 4
    //   750: invokevirtual 223	android/graphics/Matrix:preScale	(FF)Z
    //   753: pop
    //   754: aload_0
    //   755: iload_2
    //   756: i2f
    //   757: invokevirtual 227	android/graphics/Matrix:postRotate	(F)Z
    //   760: pop
    //   761: aload 13
    //   763: iconst_0
    //   764: iconst_0
    //   765: aload 13
    //   767: invokevirtual 71	android/graphics/Bitmap:getWidth	()I
    //   770: aload 13
    //   772: invokevirtual 77	android/graphics/Bitmap:getHeight	()I
    //   775: aload_0
    //   776: iconst_1
    //   777: invokestatic 231	android/graphics/Bitmap:createBitmap	(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;
    //   780: astore_0
    //   781: aload_0
    //   782: aload 13
    //   784: if_acmpeq +8 -> 792
    //   787: aload 13
    //   789: invokevirtual 45	android/graphics/Bitmap:recycle	()V
    //   792: aload_0
    //   793: ifnull +34 -> 827
    //   796: ldc 32
    //   798: ldc -23
    //   800: iconst_2
    //   801: anewarray 4	java/lang/Object
    //   804: dup
    //   805: iconst_0
    //   806: aload_0
    //   807: invokevirtual 71	android/graphics/Bitmap:getWidth	()I
    //   810: invokestatic 114	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   813: aastore
    //   814: dup
    //   815: iconst_1
    //   816: aload_0
    //   817: invokevirtual 77	android/graphics/Bitmap:getHeight	()I
    //   820: invokestatic 114	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   823: aastore
    //   824: invokestatic 162	com/tencent/mm/sdk/platformtools/x:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   827: aload_0
    //   828: areturn
    //   829: astore_0
    //   830: aload 14
    //   832: astore 13
    //   834: goto -411 -> 423
    //   837: astore_0
    //   838: goto -165 -> 673
    //   841: astore_0
    //   842: goto -155 -> 687
    //   845: astore 13
    //   847: goto -168 -> 679
    //   850: astore 13
    //   852: goto -173 -> 679
    //   855: astore 13
    //   857: goto -215 -> 642
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	860	0	paramString	String
    //   0	860	1	paramInt1	int
    //   0	860	2	paramInt2	int
    //   0	860	3	paramInt3	int
    //   294	455	4	f	float
    //   57	577	5	i	int
    //   155	428	6	j	int
    //   197	388	7	k	int
    //   218	360	8	m	int
    //   229	333	9	n	int
    //   215	417	10	i1	int
    //   553	15	11	i2	int
    //   177	298	12	bool	boolean
    //   84	340	13	localObject1	Object
    //   638	7	13	localFileNotFoundException1	FileNotFoundException
    //   675	17	13	localOptions	BitmapFactory.Options
    //   701	132	13	localObject2	Object
    //   845	1	13	localObject3	Object
    //   850	1	13	localObject4	Object
    //   855	1	13	localFileNotFoundException2	FileNotFoundException
    //   405	426	14	localBitmap	Bitmap
    // Exception table:
    //   from	to	target	type
    //   372	377	638	java/io/FileNotFoundException
    //   372	377	675	finally
    //   415	419	829	java/io/IOException
    //   669	673	837	java/io/IOException
    //   683	687	841	java/io/IOException
    //   377	407	845	finally
    //   642	665	850	finally
    //   377	407	855	java/io/FileNotFoundException
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/sdk/platformtools/z.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */