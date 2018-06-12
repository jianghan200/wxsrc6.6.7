package com.tencent.mm.booter.notification.a;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Build.VERSION;
import com.tencent.mm.R.f;
import com.tencent.mm.sdk.platformtools.c;

public final class a
{
  public Bitmap cZd;
  
  /* Error */
  public static Bitmap D(String paramString1, String paramString2)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokestatic 23	com/tencent/mm/platformtools/ai:oW	(Ljava/lang/String;)Z
    //   4: ifeq +5 -> 9
    //   7: aconst_null
    //   8: areturn
    //   9: new 25	java/lang/StringBuilder
    //   12: dup
    //   13: invokespecial 26	java/lang/StringBuilder:<init>	()V
    //   16: aload_1
    //   17: ldc 28
    //   19: aload_0
    //   20: invokevirtual 34	java/lang/String:getBytes	()[B
    //   23: invokestatic 40	com/tencent/mm/a/g:u	([B)Ljava/lang/String;
    //   26: ldc 42
    //   28: iconst_1
    //   29: invokestatic 48	com/tencent/mm/sdk/platformtools/h:b	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;
    //   32: invokevirtual 52	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   35: ldc 54
    //   37: invokevirtual 52	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   40: invokevirtual 58	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   43: astore 9
    //   45: iconst_1
    //   46: istore_3
    //   47: aconst_null
    //   48: astore 6
    //   50: aconst_null
    //   51: astore 8
    //   53: aconst_null
    //   54: astore 7
    //   56: aconst_null
    //   57: astore_1
    //   58: new 60	java/io/File
    //   61: dup
    //   62: aload 9
    //   64: invokespecial 63	java/io/File:<init>	(Ljava/lang/String;)V
    //   67: astore_0
    //   68: aload_0
    //   69: invokevirtual 67	java/io/File:exists	()Z
    //   72: ifne +21 -> 93
    //   75: ldc 69
    //   77: ldc 71
    //   79: iconst_1
    //   80: anewarray 4	java/lang/Object
    //   83: dup
    //   84: iconst_0
    //   85: aload 9
    //   87: aastore
    //   88: invokestatic 77	com/tencent/mm/sdk/platformtools/x:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   91: aconst_null
    //   92: areturn
    //   93: aload_0
    //   94: invokevirtual 81	java/io/File:length	()J
    //   97: l2i
    //   98: istore_2
    //   99: iload_2
    //   100: ifle +15 -> 115
    //   103: iload_2
    //   104: ldc 82
    //   106: if_icmpeq +34 -> 140
    //   109: iload_2
    //   110: ldc 83
    //   112: if_icmpeq +28 -> 140
    //   115: ldc 69
    //   117: ldc 85
    //   119: iconst_2
    //   120: anewarray 4	java/lang/Object
    //   123: dup
    //   124: iconst_0
    //   125: iload_2
    //   126: invokestatic 91	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   129: aastore
    //   130: dup
    //   131: iconst_1
    //   132: aload 9
    //   134: aastore
    //   135: invokestatic 94	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   138: aconst_null
    //   139: areturn
    //   140: new 96	java/io/FileInputStream
    //   143: dup
    //   144: aload 9
    //   146: invokespecial 97	java/io/FileInputStream:<init>	(Ljava/lang/String;)V
    //   149: astore_0
    //   150: aload 8
    //   152: astore_1
    //   153: aload 7
    //   155: astore 6
    //   157: aload_0
    //   158: invokevirtual 101	java/io/FileInputStream:getChannel	()Ljava/nio/channels/FileChannel;
    //   161: astore 7
    //   163: aload 7
    //   165: astore_1
    //   166: aload 7
    //   168: astore 6
    //   170: ldc 82
    //   172: invokestatic 107	java/nio/ByteBuffer:allocateDirect	(I)Ljava/nio/ByteBuffer;
    //   175: astore 8
    //   177: aload 7
    //   179: astore_1
    //   180: aload 7
    //   182: astore 6
    //   184: aload 7
    //   186: aload 8
    //   188: invokevirtual 113	java/nio/channels/FileChannel:read	(Ljava/nio/ByteBuffer;)I
    //   191: pop
    //   192: aload 7
    //   194: astore_1
    //   195: aload 7
    //   197: astore 6
    //   199: aload 8
    //   201: iconst_0
    //   202: invokevirtual 117	java/nio/ByteBuffer:position	(I)Ljava/nio/Buffer;
    //   205: pop
    //   206: iload_2
    //   207: ldc 83
    //   209: if_icmpne +117 -> 326
    //   212: aload 7
    //   214: astore_1
    //   215: aload 7
    //   217: astore 6
    //   219: bipush 16
    //   221: invokestatic 107	java/nio/ByteBuffer:allocateDirect	(I)Ljava/nio/ByteBuffer;
    //   224: astore 10
    //   226: aload 7
    //   228: astore_1
    //   229: aload 7
    //   231: astore 6
    //   233: aload 7
    //   235: aload 10
    //   237: invokevirtual 113	java/nio/channels/FileChannel:read	(Ljava/nio/ByteBuffer;)I
    //   240: pop
    //   241: aload 7
    //   243: astore_1
    //   244: aload 7
    //   246: astore 6
    //   248: aload 10
    //   250: iconst_0
    //   251: invokevirtual 121	java/nio/ByteBuffer:getLong	(I)J
    //   254: lstore 4
    //   256: lload 4
    //   258: lconst_1
    //   259: lcmp
    //   260: ifeq +347 -> 607
    //   263: aload 7
    //   265: astore_1
    //   266: aload 7
    //   268: astore 6
    //   270: ldc 69
    //   272: ldc 123
    //   274: iconst_3
    //   275: anewarray 4	java/lang/Object
    //   278: dup
    //   279: iconst_0
    //   280: lload 4
    //   282: invokestatic 128	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   285: aastore
    //   286: dup
    //   287: iconst_1
    //   288: iload_2
    //   289: invokestatic 91	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   292: aastore
    //   293: dup
    //   294: iconst_2
    //   295: aload 9
    //   297: aastore
    //   298: invokestatic 94	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   301: aload 7
    //   303: astore_1
    //   304: aload 7
    //   306: astore 6
    //   308: aload 7
    //   310: invokevirtual 131	java/nio/channels/FileChannel:close	()V
    //   313: aload 7
    //   315: astore_1
    //   316: aload 7
    //   318: astore 6
    //   320: aload_0
    //   321: invokevirtual 132	java/io/FileInputStream:close	()V
    //   324: aconst_null
    //   325: areturn
    //   326: aload 7
    //   328: astore_1
    //   329: aload 7
    //   331: astore 6
    //   333: ldc 69
    //   335: ldc -122
    //   337: iconst_3
    //   338: anewarray 4	java/lang/Object
    //   341: dup
    //   342: iconst_0
    //   343: iload_2
    //   344: invokestatic 91	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   347: aastore
    //   348: dup
    //   349: iconst_1
    //   350: iload_3
    //   351: invokestatic 139	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   354: aastore
    //   355: dup
    //   356: iconst_2
    //   357: aload 9
    //   359: aastore
    //   360: invokestatic 142	com/tencent/mm/sdk/platformtools/x:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   363: aload 7
    //   365: astore_1
    //   366: aload 7
    //   368: astore 6
    //   370: aload 7
    //   372: invokevirtual 131	java/nio/channels/FileChannel:close	()V
    //   375: aload_0
    //   376: astore_1
    //   377: aload_0
    //   378: astore 6
    //   380: aload_0
    //   381: invokevirtual 132	java/io/FileInputStream:close	()V
    //   384: aconst_null
    //   385: astore 7
    //   387: aconst_null
    //   388: astore_0
    //   389: aload_0
    //   390: astore_1
    //   391: aload 7
    //   393: astore 6
    //   395: bipush 96
    //   397: bipush 96
    //   399: getstatic 148	android/graphics/Bitmap$Config:ARGB_8888	Landroid/graphics/Bitmap$Config;
    //   402: invokestatic 154	android/graphics/Bitmap:createBitmap	(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;
    //   405: astore 10
    //   407: aload_0
    //   408: astore_1
    //   409: aload 7
    //   411: astore 6
    //   413: aload 10
    //   415: aload 8
    //   417: invokevirtual 158	android/graphics/Bitmap:copyPixelsFromBuffer	(Ljava/nio/Buffer;)V
    //   420: iload_3
    //   421: ifeq +115 -> 536
    //   424: aload_0
    //   425: astore_1
    //   426: aload 7
    //   428: astore 6
    //   430: aload 10
    //   432: bipush 9
    //   434: bipush 9
    //   436: bipush 78
    //   438: bipush 78
    //   440: invokestatic 161	android/graphics/Bitmap:createBitmap	(Landroid/graphics/Bitmap;IIII)Landroid/graphics/Bitmap;
    //   443: astore 8
    //   445: aload_0
    //   446: astore_1
    //   447: aload 7
    //   449: astore 6
    //   451: ldc 69
    //   453: ldc -93
    //   455: iconst_1
    //   456: anewarray 4	java/lang/Object
    //   459: dup
    //   460: iconst_0
    //   461: aload 10
    //   463: invokevirtual 164	java/lang/Object:toString	()Ljava/lang/String;
    //   466: aastore
    //   467: invokestatic 167	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   470: aload_0
    //   471: astore_1
    //   472: aload 7
    //   474: astore 6
    //   476: aload 10
    //   478: invokevirtual 170	android/graphics/Bitmap:recycle	()V
    //   481: aload 8
    //   483: areturn
    //   484: astore 7
    //   486: aconst_null
    //   487: astore 6
    //   489: aload_1
    //   490: astore_0
    //   491: aload 6
    //   493: astore_1
    //   494: ldc 69
    //   496: ldc -84
    //   498: iconst_2
    //   499: anewarray 4	java/lang/Object
    //   502: dup
    //   503: iconst_0
    //   504: aload 7
    //   506: invokevirtual 175	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   509: aastore
    //   510: dup
    //   511: iconst_1
    //   512: aload 9
    //   514: aastore
    //   515: invokestatic 94	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   518: aload_1
    //   519: ifnull +7 -> 526
    //   522: aload_1
    //   523: invokevirtual 131	java/nio/channels/FileChannel:close	()V
    //   526: aload_0
    //   527: ifnull +7 -> 534
    //   530: aload_0
    //   531: invokevirtual 132	java/io/FileInputStream:close	()V
    //   534: aconst_null
    //   535: areturn
    //   536: aload 10
    //   538: areturn
    //   539: astore 7
    //   541: aconst_null
    //   542: astore_0
    //   543: aload 6
    //   545: astore_1
    //   546: ldc 69
    //   548: ldc -79
    //   550: iconst_2
    //   551: anewarray 4	java/lang/Object
    //   554: dup
    //   555: iconst_0
    //   556: aload 7
    //   558: invokevirtual 178	java/lang/OutOfMemoryError:getMessage	()Ljava/lang/String;
    //   561: aastore
    //   562: dup
    //   563: iconst_1
    //   564: aload 9
    //   566: aastore
    //   567: invokestatic 94	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   570: goto -52 -> 518
    //   573: astore_0
    //   574: goto -40 -> 534
    //   577: astore 7
    //   579: goto -33 -> 546
    //   582: astore 7
    //   584: aconst_null
    //   585: astore_1
    //   586: aload 6
    //   588: astore_0
    //   589: goto -43 -> 546
    //   592: astore 7
    //   594: aconst_null
    //   595: astore_0
    //   596: goto -102 -> 494
    //   599: astore 7
    //   601: aload 6
    //   603: astore_1
    //   604: goto -110 -> 494
    //   607: iconst_0
    //   608: istore_3
    //   609: goto -283 -> 326
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	612	0	paramString1	String
    //   0	612	1	paramString2	String
    //   98	246	2	i	int
    //   46	563	3	bool	boolean
    //   254	27	4	l	long
    //   48	554	6	localObject1	Object
    //   54	419	7	localFileChannel	java.nio.channels.FileChannel
    //   484	21	7	localException1	Exception
    //   539	18	7	localOutOfMemoryError1	OutOfMemoryError
    //   577	1	7	localOutOfMemoryError2	OutOfMemoryError
    //   582	1	7	localOutOfMemoryError3	OutOfMemoryError
    //   592	1	7	localException2	Exception
    //   599	1	7	localException3	Exception
    //   51	431	8	localObject2	Object
    //   43	522	9	str	String
    //   224	313	10	localObject3	Object
    // Exception table:
    //   from	to	target	type
    //   380	384	484	java/lang/Exception
    //   395	407	484	java/lang/Exception
    //   413	420	484	java/lang/Exception
    //   430	445	484	java/lang/Exception
    //   451	470	484	java/lang/Exception
    //   476	481	484	java/lang/Exception
    //   58	91	539	java/lang/OutOfMemoryError
    //   93	99	539	java/lang/OutOfMemoryError
    //   115	138	539	java/lang/OutOfMemoryError
    //   140	150	539	java/lang/OutOfMemoryError
    //   522	526	573	java/lang/Exception
    //   530	534	573	java/lang/Exception
    //   157	163	577	java/lang/OutOfMemoryError
    //   170	177	577	java/lang/OutOfMemoryError
    //   184	192	577	java/lang/OutOfMemoryError
    //   199	206	577	java/lang/OutOfMemoryError
    //   219	226	577	java/lang/OutOfMemoryError
    //   233	241	577	java/lang/OutOfMemoryError
    //   248	256	577	java/lang/OutOfMemoryError
    //   270	301	577	java/lang/OutOfMemoryError
    //   308	313	577	java/lang/OutOfMemoryError
    //   320	324	577	java/lang/OutOfMemoryError
    //   333	363	577	java/lang/OutOfMemoryError
    //   370	375	577	java/lang/OutOfMemoryError
    //   380	384	582	java/lang/OutOfMemoryError
    //   395	407	582	java/lang/OutOfMemoryError
    //   413	420	582	java/lang/OutOfMemoryError
    //   430	445	582	java/lang/OutOfMemoryError
    //   451	470	582	java/lang/OutOfMemoryError
    //   476	481	582	java/lang/OutOfMemoryError
    //   58	91	592	java/lang/Exception
    //   93	99	592	java/lang/Exception
    //   115	138	592	java/lang/Exception
    //   140	150	592	java/lang/Exception
    //   157	163	599	java/lang/Exception
    //   170	177	599	java/lang/Exception
    //   184	192	599	java/lang/Exception
    //   199	206	599	java/lang/Exception
    //   219	226	599	java/lang/Exception
    //   233	241	599	java/lang/Exception
    //   248	256	599	java/lang/Exception
    //   270	301	599	java/lang/Exception
    //   308	313	599	java/lang/Exception
    //   320	324	599	java/lang/Exception
    //   333	363	599	java/lang/Exception
    //   370	375	599	java/lang/Exception
  }
  
  public static Bitmap b(Context paramContext, Bitmap paramBitmap)
  {
    Bitmap localBitmap;
    if ((paramContext == null) || (paramBitmap == null)) {
      localBitmap = null;
    }
    do
    {
      return localBitmap;
      localBitmap = paramBitmap;
    } while (Build.VERSION.SDK_INT < 11);
    int i = paramContext.getResources().getDimensionPixelSize(17104902) - paramContext.getResources().getDimensionPixelSize(R.f.mmnotification_chatroom_avatar_margin);
    return c.a(c.a(paramBitmap, i, i, false, false), false, paramContext.getResources().getDimensionPixelSize(R.f.mmnotification_chatroom_avatar_corner));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/booter/notification/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */