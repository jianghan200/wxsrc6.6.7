package com.tencent.mm.aa;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.ab.l.b;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.protocal.c.bhy;
import com.tencent.mm.protocal.c.bvy;
import com.tencent.mm.protocal.c.bvz;
import com.tencent.mm.protocal.k.e;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.c;
import com.tencent.mm.storage.ab;

public final class n
  extends l
  implements com.tencent.mm.network.k
{
  private String bSw;
  private int dHI;
  private int dHJ;
  private int dHK;
  private String dIa;
  private String dIb;
  private String dIc = com.tencent.mm.model.q.GF();
  private com.tencent.mm.ab.e diJ;
  
  public n(int paramInt, String paramString)
  {
    if (paramInt == 2) {
      this.dIc = ab.XV(this.dIc);
    }
    this.dIa = q.Kp().c(this.dIc, true, true);
    String str = this.dIa + ".tmp";
    if (af(paramString, str) == 0)
    {
      this.bSw = str;
      this.dHK = paramInt;
      this.dIb = com.tencent.mm.a.g.u(FileOp.e(q.Kp().c(this.dIc, true, false), 0, -1));
      this.dHI = 0;
      this.dHJ = 0;
    }
  }
  
  /* Error */
  private static int af(String paramString1, String paramString2)
  {
    // Byte code:
    //   0: sipush 1080
    //   3: istore 7
    //   5: bipush 50
    //   7: istore 4
    //   9: iconst_0
    //   10: istore 5
    //   12: aload_0
    //   13: invokestatic 99	com/tencent/mm/sdk/platformtools/c:VZ	(Ljava/lang/String;)Landroid/graphics/BitmapFactory$Options;
    //   16: astore 11
    //   18: aload 11
    //   20: getfield 104	android/graphics/BitmapFactory$Options:outHeight	I
    //   23: sipush 640
    //   26: if_icmpge +60 -> 86
    //   29: aload 11
    //   31: getfield 107	android/graphics/BitmapFactory$Options:outWidth	I
    //   34: sipush 640
    //   37: if_icmpge +49 -> 86
    //   40: aload_0
    //   41: aload_1
    //   42: invokestatic 111	com/tencent/mm/modelsfs/FileOp:y	(Ljava/lang/String;Ljava/lang/String;)J
    //   45: pop2
    //   46: ldc 113
    //   48: ldc 115
    //   50: iconst_2
    //   51: anewarray 117	java/lang/Object
    //   54: dup
    //   55: iconst_0
    //   56: aload 11
    //   58: getfield 104	android/graphics/BitmapFactory$Options:outHeight	I
    //   61: invokestatic 123	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   64: aastore
    //   65: dup
    //   66: iconst_1
    //   67: aload 11
    //   69: getfield 107	android/graphics/BitmapFactory$Options:outWidth	I
    //   72: invokestatic 123	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   75: aastore
    //   76: invokestatic 129	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   79: iload 5
    //   81: istore 4
    //   83: iload 4
    //   85: ireturn
    //   86: invokestatic 135	com/tencent/mm/sdk/platformtools/ad:getContext	()Landroid/content/Context;
    //   89: invokestatic 141	com/tencent/mm/sdk/platformtools/ao:isWifi	(Landroid/content/Context;)Z
    //   92: ifeq +384 -> 476
    //   95: ldc -113
    //   97: invokestatic 149	com/tencent/mm/kernel/g:l	(Ljava/lang/Class;)Lcom/tencent/mm/kernel/c/a;
    //   100: checkcast 143	com/tencent/mm/plugin/zero/b/a
    //   103: invokeinterface 153 1 0
    //   108: ldc -101
    //   110: invokevirtual 160	com/tencent/mm/k/e:getValue	(Ljava/lang/String;)Ljava/lang/String;
    //   113: bipush 50
    //   115: invokestatic 166	com/tencent/mm/sdk/platformtools/bi:getInt	(Ljava/lang/String;I)I
    //   118: istore 5
    //   120: iload 5
    //   122: istore 4
    //   124: invokestatic 135	com/tencent/mm/sdk/platformtools/ad:getContext	()Landroid/content/Context;
    //   127: invokestatic 141	com/tencent/mm/sdk/platformtools/ao:isWifi	(Landroid/content/Context;)Z
    //   130: ifeq +460 -> 590
    //   133: ldc -113
    //   135: invokestatic 149	com/tencent/mm/kernel/g:l	(Ljava/lang/Class;)Lcom/tencent/mm/kernel/c/a;
    //   138: checkcast 143	com/tencent/mm/plugin/zero/b/a
    //   141: invokeinterface 153 1 0
    //   146: ldc -88
    //   148: invokevirtual 160	com/tencent/mm/k/e:getValue	(Ljava/lang/String;)Ljava/lang/String;
    //   151: astore 10
    //   153: aload 10
    //   155: ldc -86
    //   157: invokevirtual 176	java/lang/String:indexOf	(Ljava/lang/String;)I
    //   160: istore 6
    //   162: iconst_m1
    //   163: iload 6
    //   165: if_icmpeq +963 -> 1128
    //   168: aload 10
    //   170: iconst_0
    //   171: iload 6
    //   173: invokevirtual 180	java/lang/String:substring	(II)Ljava/lang/String;
    //   176: invokestatic 183	java/lang/Integer:valueOf	(Ljava/lang/String;)Ljava/lang/Integer;
    //   179: invokevirtual 187	java/lang/Integer:intValue	()I
    //   182: istore 5
    //   184: aload 10
    //   186: iload 6
    //   188: iconst_1
    //   189: iadd
    //   190: invokevirtual 190	java/lang/String:substring	(I)Ljava/lang/String;
    //   193: invokestatic 183	java/lang/Integer:valueOf	(Ljava/lang/String;)Ljava/lang/Integer;
    //   196: invokevirtual 187	java/lang/Integer:intValue	()I
    //   199: istore 6
    //   201: iload 5
    //   203: ifgt +487 -> 690
    //   206: iload 6
    //   208: ifgt +482 -> 690
    //   211: iconst_0
    //   212: istore 5
    //   214: iload 7
    //   216: istore 6
    //   218: aload 11
    //   220: getfield 107	android/graphics/BitmapFactory$Options:outWidth	I
    //   223: aload 11
    //   225: getfield 104	android/graphics/BitmapFactory$Options:outHeight	I
    //   228: if_icmple +504 -> 732
    //   231: aload 11
    //   233: getfield 107	android/graphics/BitmapFactory$Options:outWidth	I
    //   236: istore 7
    //   238: aload 11
    //   240: getfield 107	android/graphics/BitmapFactory$Options:outWidth	I
    //   243: aload 11
    //   245: getfield 104	android/graphics/BitmapFactory$Options:outHeight	I
    //   248: if_icmpge +494 -> 742
    //   251: aload 11
    //   253: getfield 107	android/graphics/BitmapFactory$Options:outWidth	I
    //   256: istore 8
    //   258: ldc 113
    //   260: ldc -64
    //   262: iconst_5
    //   263: anewarray 117	java/lang/Object
    //   266: dup
    //   267: iconst_0
    //   268: iload 5
    //   270: invokestatic 123	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   273: aastore
    //   274: dup
    //   275: iconst_1
    //   276: iload 6
    //   278: invokestatic 123	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   281: aastore
    //   282: dup
    //   283: iconst_2
    //   284: iload 4
    //   286: invokestatic 123	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   289: aastore
    //   290: dup
    //   291: iconst_3
    //   292: aload 11
    //   294: getfield 107	android/graphics/BitmapFactory$Options:outWidth	I
    //   297: invokestatic 123	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   300: aastore
    //   301: dup
    //   302: iconst_4
    //   303: aload 11
    //   305: getfield 104	android/graphics/BitmapFactory$Options:outHeight	I
    //   308: invokestatic 123	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   311: aastore
    //   312: invokestatic 129	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   315: iload 6
    //   317: ifle +435 -> 752
    //   320: iload 8
    //   322: iload 6
    //   324: idiv
    //   325: istore 7
    //   327: aload 11
    //   329: getfield 104	android/graphics/BitmapFactory$Options:outHeight	I
    //   332: iload 6
    //   334: imul
    //   335: iload 8
    //   337: idiv
    //   338: istore 9
    //   340: iload 6
    //   342: aload 11
    //   344: getfield 107	android/graphics/BitmapFactory$Options:outWidth	I
    //   347: imul
    //   348: iload 8
    //   350: idiv
    //   351: istore 5
    //   353: iload 9
    //   355: istore 6
    //   357: iload 6
    //   359: istore 9
    //   361: iload 5
    //   363: istore 8
    //   365: iload 6
    //   367: iload 5
    //   369: imul
    //   370: ldc -63
    //   372: if_icmple +33 -> 405
    //   375: ldc2_w 194
    //   378: iload 6
    //   380: iload 5
    //   382: imul
    //   383: i2d
    //   384: ddiv
    //   385: invokestatic 201	java/lang/Math:sqrt	(D)D
    //   388: dstore_2
    //   389: iload 6
    //   391: i2d
    //   392: dload_2
    //   393: ddiv
    //   394: d2i
    //   395: istore 9
    //   397: iload 5
    //   399: i2d
    //   400: dload_2
    //   401: ddiv
    //   402: d2i
    //   403: istore 8
    //   405: new 101	android/graphics/BitmapFactory$Options
    //   408: dup
    //   409: invokespecial 202	android/graphics/BitmapFactory$Options:<init>	()V
    //   412: astore 10
    //   414: aload 10
    //   416: getstatic 208	android/graphics/Bitmap$Config:ARGB_8888	Landroid/graphics/Bitmap$Config;
    //   419: putfield 211	android/graphics/BitmapFactory$Options:inPreferredConfig	Landroid/graphics/Bitmap$Config;
    //   422: iload 7
    //   424: iconst_2
    //   425: if_icmplt +10 -> 435
    //   428: aload 10
    //   430: iload 7
    //   432: putfield 214	android/graphics/BitmapFactory$Options:inSampleSize	I
    //   435: aload_0
    //   436: aload 10
    //   438: invokestatic 218	com/tencent/mm/sdk/platformtools/c:decodeFile	(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    //   441: astore 12
    //   443: aload 12
    //   445: ifnonnull +347 -> 792
    //   448: ldc 113
    //   450: ldc -36
    //   452: iconst_1
    //   453: anewarray 117	java/lang/Object
    //   456: dup
    //   457: iconst_0
    //   458: aload 10
    //   460: getfield 214	android/graphics/BitmapFactory$Options:inSampleSize	I
    //   463: invokestatic 123	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   466: aastore
    //   467: invokestatic 222	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   470: iconst_0
    //   471: invokestatic 227	com/tencent/mm/compatible/util/g:getLine	()I
    //   474: isub
    //   475: ireturn
    //   476: invokestatic 135	com/tencent/mm/sdk/platformtools/ad:getContext	()Landroid/content/Context;
    //   479: invokestatic 230	com/tencent/mm/sdk/platformtools/ao:is2G	(Landroid/content/Context;)Z
    //   482: ifeq +35 -> 517
    //   485: ldc -113
    //   487: invokestatic 149	com/tencent/mm/kernel/g:l	(Ljava/lang/Class;)Lcom/tencent/mm/kernel/c/a;
    //   490: checkcast 143	com/tencent/mm/plugin/zero/b/a
    //   493: invokeinterface 153 1 0
    //   498: ldc -24
    //   500: invokevirtual 160	com/tencent/mm/k/e:getValue	(Ljava/lang/String;)Ljava/lang/String;
    //   503: bipush 50
    //   505: invokestatic 166	com/tencent/mm/sdk/platformtools/bi:getInt	(Ljava/lang/String;I)I
    //   508: istore 5
    //   510: iload 5
    //   512: istore 4
    //   514: goto -390 -> 124
    //   517: invokestatic 135	com/tencent/mm/sdk/platformtools/ad:getContext	()Landroid/content/Context;
    //   520: invokestatic 235	com/tencent/mm/sdk/platformtools/ao:is3G	(Landroid/content/Context;)Z
    //   523: ifeq +35 -> 558
    //   526: ldc -113
    //   528: invokestatic 149	com/tencent/mm/kernel/g:l	(Ljava/lang/Class;)Lcom/tencent/mm/kernel/c/a;
    //   531: checkcast 143	com/tencent/mm/plugin/zero/b/a
    //   534: invokeinterface 153 1 0
    //   539: ldc -19
    //   541: invokevirtual 160	com/tencent/mm/k/e:getValue	(Ljava/lang/String;)Ljava/lang/String;
    //   544: bipush 50
    //   546: invokestatic 166	com/tencent/mm/sdk/platformtools/bi:getInt	(Ljava/lang/String;I)I
    //   549: istore 5
    //   551: iload 5
    //   553: istore 4
    //   555: goto -431 -> 124
    //   558: ldc -113
    //   560: invokestatic 149	com/tencent/mm/kernel/g:l	(Ljava/lang/Class;)Lcom/tencent/mm/kernel/c/a;
    //   563: checkcast 143	com/tencent/mm/plugin/zero/b/a
    //   566: invokeinterface 153 1 0
    //   571: ldc -17
    //   573: invokevirtual 160	com/tencent/mm/k/e:getValue	(Ljava/lang/String;)Ljava/lang/String;
    //   576: bipush 50
    //   578: invokestatic 166	com/tencent/mm/sdk/platformtools/bi:getInt	(Ljava/lang/String;I)I
    //   581: istore 5
    //   583: iload 5
    //   585: istore 4
    //   587: goto -463 -> 124
    //   590: invokestatic 135	com/tencent/mm/sdk/platformtools/ad:getContext	()Landroid/content/Context;
    //   593: invokestatic 230	com/tencent/mm/sdk/platformtools/ao:is2G	(Landroid/content/Context;)Z
    //   596: ifeq +26 -> 622
    //   599: ldc -113
    //   601: invokestatic 149	com/tencent/mm/kernel/g:l	(Ljava/lang/Class;)Lcom/tencent/mm/kernel/c/a;
    //   604: checkcast 143	com/tencent/mm/plugin/zero/b/a
    //   607: invokeinterface 153 1 0
    //   612: ldc -15
    //   614: invokevirtual 160	com/tencent/mm/k/e:getValue	(Ljava/lang/String;)Ljava/lang/String;
    //   617: astore 10
    //   619: goto -466 -> 153
    //   622: invokestatic 135	com/tencent/mm/sdk/platformtools/ad:getContext	()Landroid/content/Context;
    //   625: invokestatic 235	com/tencent/mm/sdk/platformtools/ao:is3G	(Landroid/content/Context;)Z
    //   628: ifeq +26 -> 654
    //   631: ldc -113
    //   633: invokestatic 149	com/tencent/mm/kernel/g:l	(Ljava/lang/Class;)Lcom/tencent/mm/kernel/c/a;
    //   636: checkcast 143	com/tencent/mm/plugin/zero/b/a
    //   639: invokeinterface 153 1 0
    //   644: ldc -13
    //   646: invokevirtual 160	com/tencent/mm/k/e:getValue	(Ljava/lang/String;)Ljava/lang/String;
    //   649: astore 10
    //   651: goto -498 -> 153
    //   654: ldc -113
    //   656: invokestatic 149	com/tencent/mm/kernel/g:l	(Ljava/lang/Class;)Lcom/tencent/mm/kernel/c/a;
    //   659: checkcast 143	com/tencent/mm/plugin/zero/b/a
    //   662: invokeinterface 153 1 0
    //   667: ldc -11
    //   669: invokevirtual 160	com/tencent/mm/k/e:getValue	(Ljava/lang/String;)Ljava/lang/String;
    //   672: astore 10
    //   674: goto -521 -> 153
    //   677: astore 10
    //   679: iconst_0
    //   680: istore 5
    //   682: sipush 1080
    //   685: istore 6
    //   687: goto -486 -> 201
    //   690: iload 6
    //   692: sipush 2160
    //   695: if_icmplt +13 -> 708
    //   698: iconst_0
    //   699: istore 5
    //   701: iload 7
    //   703: istore 6
    //   705: goto -487 -> 218
    //   708: iload 6
    //   710: ifgt +415 -> 1125
    //   713: iload 5
    //   715: sipush 3240
    //   718: if_icmple +407 -> 1125
    //   721: iconst_0
    //   722: istore 6
    //   724: sipush 1620
    //   727: istore 5
    //   729: goto -511 -> 218
    //   732: aload 11
    //   734: getfield 104	android/graphics/BitmapFactory$Options:outHeight	I
    //   737: istore 7
    //   739: goto -501 -> 238
    //   742: aload 11
    //   744: getfield 104	android/graphics/BitmapFactory$Options:outHeight	I
    //   747: istore 8
    //   749: goto -491 -> 258
    //   752: iload 7
    //   754: iload 5
    //   756: idiv
    //   757: istore 8
    //   759: aload 11
    //   761: getfield 104	android/graphics/BitmapFactory$Options:outHeight	I
    //   764: iload 5
    //   766: imul
    //   767: iload 7
    //   769: idiv
    //   770: istore 6
    //   772: aload 11
    //   774: getfield 107	android/graphics/BitmapFactory$Options:outWidth	I
    //   777: iload 5
    //   779: imul
    //   780: iload 7
    //   782: idiv
    //   783: istore 5
    //   785: iload 8
    //   787: istore 7
    //   789: goto -432 -> 357
    //   792: ldc 113
    //   794: ldc -9
    //   796: iconst_2
    //   797: anewarray 117	java/lang/Object
    //   800: dup
    //   801: iconst_0
    //   802: aload 12
    //   804: invokevirtual 252	android/graphics/Bitmap:getWidth	()I
    //   807: invokestatic 123	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   810: aastore
    //   811: dup
    //   812: iconst_1
    //   813: aload 12
    //   815: invokevirtual 255	android/graphics/Bitmap:getHeight	()I
    //   818: invokestatic 123	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   821: aastore
    //   822: invokestatic 258	com/tencent/mm/sdk/platformtools/x:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   825: iload 7
    //   827: iconst_1
    //   828: if_icmple +70 -> 898
    //   831: aload 12
    //   833: iload 8
    //   835: iload 9
    //   837: iconst_1
    //   838: invokestatic 262	android/graphics/Bitmap:createScaledBitmap	(Landroid/graphics/Bitmap;IIZ)Landroid/graphics/Bitmap;
    //   841: astore 10
    //   843: aload 12
    //   845: aload 10
    //   847: if_acmpeq +28 -> 875
    //   850: ldc 113
    //   852: ldc_w 264
    //   855: iconst_1
    //   856: anewarray 117	java/lang/Object
    //   859: dup
    //   860: iconst_0
    //   861: aload 12
    //   863: invokevirtual 265	java/lang/Object:toString	()Ljava/lang/String;
    //   866: aastore
    //   867: invokestatic 129	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   870: aload 12
    //   872: invokevirtual 268	android/graphics/Bitmap:recycle	()V
    //   875: aload 10
    //   877: astore 12
    //   879: aload 10
    //   881: ifnonnull +17 -> 898
    //   884: ldc 113
    //   886: ldc_w 270
    //   889: invokestatic 273	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   892: iconst_0
    //   893: invokestatic 227	com/tencent/mm/compatible/util/g:getLine	()I
    //   896: isub
    //   897: ireturn
    //   898: aconst_null
    //   899: astore 11
    //   901: aconst_null
    //   902: astore 10
    //   904: aload_1
    //   905: invokestatic 277	com/tencent/mm/modelsfs/FileOp:jx	(Ljava/lang/String;)Ljava/io/OutputStream;
    //   908: astore 13
    //   910: aload 13
    //   912: astore 10
    //   914: aload 13
    //   916: astore 11
    //   918: aload 12
    //   920: getstatic 283	android/graphics/Bitmap$CompressFormat:JPEG	Landroid/graphics/Bitmap$CompressFormat;
    //   923: iload 4
    //   925: aload 13
    //   927: invokevirtual 287	android/graphics/Bitmap:compress	(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z
    //   930: pop
    //   931: aload 13
    //   933: ifnull +8 -> 941
    //   936: aload 13
    //   938: invokevirtual 292	java/io/OutputStream:close	()V
    //   941: ldc 113
    //   943: ldc_w 294
    //   946: iconst_3
    //   947: anewarray 117	java/lang/Object
    //   950: dup
    //   951: iconst_0
    //   952: aload 12
    //   954: invokevirtual 265	java/lang/Object:toString	()Ljava/lang/String;
    //   957: aastore
    //   958: dup
    //   959: iconst_1
    //   960: aload_0
    //   961: invokestatic 298	com/tencent/mm/modelsfs/FileOp:mI	(Ljava/lang/String;)J
    //   964: invokestatic 303	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   967: aastore
    //   968: dup
    //   969: iconst_2
    //   970: aload_1
    //   971: invokestatic 298	com/tencent/mm/modelsfs/FileOp:mI	(Ljava/lang/String;)J
    //   974: invokestatic 303	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   977: aastore
    //   978: invokestatic 129	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   981: aload 12
    //   983: invokevirtual 268	android/graphics/Bitmap:recycle	()V
    //   986: iconst_0
    //   987: ireturn
    //   988: astore_0
    //   989: aload 10
    //   991: astore 11
    //   993: ldc 113
    //   995: ldc_w 305
    //   998: invokestatic 273	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   1001: aload 10
    //   1003: astore 11
    //   1005: ldc 113
    //   1007: ldc_w 307
    //   1010: iconst_1
    //   1011: anewarray 117	java/lang/Object
    //   1014: dup
    //   1015: iconst_0
    //   1016: aload_0
    //   1017: invokestatic 310	com/tencent/mm/sdk/platformtools/bi:i	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   1020: aastore
    //   1021: invokestatic 222	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1024: aload 10
    //   1026: astore 11
    //   1028: ldc 113
    //   1030: ldc_w 264
    //   1033: iconst_1
    //   1034: anewarray 117	java/lang/Object
    //   1037: dup
    //   1038: iconst_0
    //   1039: aload 12
    //   1041: invokevirtual 265	java/lang/Object:toString	()Ljava/lang/String;
    //   1044: aastore
    //   1045: invokestatic 129	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1048: aload 10
    //   1050: astore 11
    //   1052: aload 12
    //   1054: invokevirtual 268	android/graphics/Bitmap:recycle	()V
    //   1057: aload 10
    //   1059: astore 11
    //   1061: invokestatic 227	com/tencent/mm/compatible/util/g:getLine	()I
    //   1064: istore 4
    //   1066: iconst_0
    //   1067: iload 4
    //   1069: isub
    //   1070: istore 5
    //   1072: iload 5
    //   1074: istore 4
    //   1076: aload 10
    //   1078: ifnull -995 -> 83
    //   1081: aload 10
    //   1083: invokevirtual 292	java/io/OutputStream:close	()V
    //   1086: iload 5
    //   1088: ireturn
    //   1089: astore_0
    //   1090: iload 5
    //   1092: ireturn
    //   1093: astore_0
    //   1094: aload 11
    //   1096: ifnull +8 -> 1104
    //   1099: aload 11
    //   1101: invokevirtual 292	java/io/OutputStream:close	()V
    //   1104: aload_0
    //   1105: athrow
    //   1106: astore 10
    //   1108: goto -167 -> 941
    //   1111: astore_1
    //   1112: goto -8 -> 1104
    //   1115: astore 10
    //   1117: goto -435 -> 682
    //   1120: astore 10
    //   1122: goto -998 -> 124
    //   1125: goto -907 -> 218
    //   1128: sipush 1080
    //   1131: istore 6
    //   1133: iconst_0
    //   1134: istore 5
    //   1136: goto -935 -> 201
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	1139	0	paramString1	String
    //   0	1139	1	paramString2	String
    //   388	13	2	d	double
    //   7	1068	4	i	int
    //   10	1125	5	j	int
    //   160	972	6	k	int
    //   3	826	7	m	int
    //   256	578	8	n	int
    //   338	498	9	i1	int
    //   151	522	10	localObject1	Object
    //   677	1	10	localException1	Exception
    //   841	241	10	localObject2	Object
    //   1106	1	10	localIOException	java.io.IOException
    //   1115	1	10	localException2	Exception
    //   1120	1	10	localException3	Exception
    //   16	1084	11	localObject3	Object
    //   441	612	12	localObject4	Object
    //   908	29	13	localOutputStream	java.io.OutputStream
    // Exception table:
    //   from	to	target	type
    //   124	153	677	java/lang/Exception
    //   153	162	677	java/lang/Exception
    //   168	184	677	java/lang/Exception
    //   590	619	677	java/lang/Exception
    //   622	651	677	java/lang/Exception
    //   654	674	677	java/lang/Exception
    //   904	910	988	java/lang/Exception
    //   918	931	988	java/lang/Exception
    //   1081	1086	1089	java/io/IOException
    //   904	910	1093	finally
    //   918	931	1093	finally
    //   993	1001	1093	finally
    //   1005	1024	1093	finally
    //   1028	1048	1093	finally
    //   1052	1057	1093	finally
    //   1061	1066	1093	finally
    //   936	941	1106	java/io/IOException
    //   1099	1104	1111	java/io/IOException
    //   184	201	1115	java/lang/Exception
    //   86	120	1120	java/lang/Exception
    //   476	510	1120	java/lang/Exception
    //   517	551	1120	java/lang/Exception
    //   558	583	1120	java/lang/Exception
  }
  
  protected final int Cc()
  {
    return 200;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    if ((this.bSw == null) || (this.bSw.length() == 0))
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.NetSceneUploadHDHeadImg", "imgPath is null or length = 0");
      return -1;
    }
    if (!FileOp.cn(this.bSw))
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.NetSceneUploadHDHeadImg", "The img does not exist, imgPath = " + this.bSw);
      return -1;
    }
    if (this.dHI == 0) {
      this.dHI = ((int)FileOp.mI(this.bSw));
    }
    int i = Math.min(this.dHI - this.dHJ, 8192);
    parame1 = FileOp.e(this.bSw, this.dHJ, i);
    if (parame1 == null)
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.NetSceneUploadHDHeadImg", "readFromFile error");
      return -1;
    }
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetSceneUploadHDHeadImg", "doScene uploadLen:%d, total: %d", new Object[] { Integer.valueOf(parame1.length), Integer.valueOf(this.dHI) });
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new bvy();
    ((b.a)localObject).dIH = new bvz();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/uploadhdheadimg";
    ((b.a)localObject).dIF = 157;
    ((b.a)localObject).dII = 46;
    ((b.a)localObject).dIJ = 1000000046;
    localObject = ((b.a)localObject).KT();
    bvy localbvy = (bvy)((b)localObject).dID.dIL;
    localbvy.rdV = this.dHI;
    localbvy.rdW = this.dHJ;
    localbvy.rIp = this.dHK;
    localbvy.rtW = new bhy().bq(parame1);
    localbvy.ssm = this.dIb;
    return a(parame, (com.tencent.mm.network.q)localObject, this);
  }
  
  protected final int a(com.tencent.mm.network.q paramq)
  {
    if ((this.bSw == null) || (this.bSw.length() == 0)) {
      return l.b.dJn;
    }
    return l.b.dJm;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, com.tencent.mm.network.q paramq, byte[] paramArrayOfByte)
  {
    paramInt1 = 0;
    paramArrayOfByte = (bvz)((b)paramq).dIE.dIL;
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.NetSceneUploadHDHeadImg", "errType:" + paramInt2 + " errCode:" + paramInt3);
    if ((paramInt2 != 4) && (paramInt3 != 0))
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.NetSceneUploadHDHeadImg", "errType:" + paramInt2 + " errCode:" + paramInt3);
      this.diJ.a(paramInt2, paramInt3, paramString, this);
      return;
    }
    if ((paramInt2 == 4) || (paramInt2 == 5))
    {
      this.diJ.a(paramInt2, paramInt3, paramString, this);
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.NetSceneUploadHDHeadImg", "ErrType:" + paramInt2);
      return;
    }
    int i = paramq.Id().qWB;
    if (i == -4)
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.NetSceneUploadHDHeadImg", "retcode == %d", new Object[] { Integer.valueOf(i) });
      paramInt1 = 1;
    }
    if (paramInt1 != 0)
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.NetSceneUploadHDHeadImg", "handleCertainError");
      this.diJ.a(paramInt2, paramInt3, paramString, this);
      return;
    }
    this.dHJ = paramArrayOfByte.rdW;
    if (this.dHJ < this.dHI)
    {
      if (a(this.dIX, this.diJ) < 0)
      {
        com.tencent.mm.sdk.platformtools.x.e("MicroMsg.NetSceneUploadHDHeadImg", "doScene again failed");
        this.diJ.a(3, -1, "", this);
      }
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.NetSceneUploadHDHeadImg", "doScene again");
      return;
    }
    try
    {
      FileOp.av(this.bSw, this.dIa);
      com.tencent.mm.kernel.g.Ei().DT().set(12297, paramArrayOfByte.ssn);
      q.Kp().f(this.dIc, c.Wb(this.dIa));
      paramq = com.tencent.mm.model.q.GF();
      if (!bi.oW(paramq))
      {
        paramArrayOfByte = new j();
        paramArrayOfByte.username = paramq;
        paramArrayOfByte.by(true);
        paramArrayOfByte.bWA = 32;
        paramArrayOfByte.csA = 3;
        paramArrayOfByte.bWA = 34;
        q.KH().a(paramArrayOfByte);
      }
      this.diJ.a(paramInt2, paramInt3, paramString, this);
      return;
    }
    catch (Exception paramString)
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.NetSceneUploadHDHeadImg", "rename temp file failed :" + paramString.getMessage());
      this.diJ.a(3, -1, "", this);
    }
  }
  
  protected final void cancel()
  {
    super.cancel();
  }
  
  public final int getType()
  {
    return 157;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/aa/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */