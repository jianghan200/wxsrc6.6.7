package com.tencent.mm.plugin.emoji.c;

import com.tencent.mm.g.a.bc;
import com.tencent.mm.sdk.b.c;

public final class b
  extends c<bc>
{
  public b()
  {
    this.sFo = bc.class.getName().hashCode();
  }
  
  /* Error */
  private static boolean a(bc parambc)
  {
    // Byte code:
    //   0: aload_0
    //   1: instanceof 11
    //   4: ifeq +340 -> 344
    //   7: aload_0
    //   8: getfield 36	com/tencent/mm/g/a/bc:bIB	Lcom/tencent/mm/g/a/bc$a;
    //   11: getfield 41	com/tencent/mm/g/a/bc$a:bIC	I
    //   14: bipush 33
    //   16: if_icmpne +441 -> 457
    //   19: new 43	java/io/File
    //   22: dup
    //   23: aload_0
    //   24: getfield 36	com/tencent/mm/g/a/bc:bIB	Lcom/tencent/mm/g/a/bc$a;
    //   27: getfield 47	com/tencent/mm/g/a/bc$a:filePath	Ljava/lang/String;
    //   30: invokespecial 50	java/io/File:<init>	(Ljava/lang/String;)V
    //   33: astore 8
    //   35: aload 8
    //   37: invokevirtual 54	java/io/File:exists	()Z
    //   40: ifeq +408 -> 448
    //   43: ldc 56
    //   45: ldc 58
    //   47: iconst_1
    //   48: anewarray 60	java/lang/Object
    //   51: dup
    //   52: iconst_0
    //   53: aload 8
    //   55: invokevirtual 64	java/io/File:getAbsoluteFile	()Ljava/io/File;
    //   58: aastore
    //   59: invokestatic 70	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   62: new 43	java/io/File
    //   65: dup
    //   66: invokestatic 75	com/tencent/mm/ag/a:Oc	()Ljava/lang/String;
    //   69: ldc 77
    //   71: invokespecial 80	java/io/File:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   74: astore 9
    //   76: new 43	java/io/File
    //   79: dup
    //   80: aload 9
    //   82: ldc 82
    //   84: invokespecial 85	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   87: astore 10
    //   89: aload 9
    //   91: invokevirtual 88	java/io/File:mkdirs	()Z
    //   94: pop
    //   95: aload 8
    //   97: invokevirtual 91	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   100: aload 10
    //   102: invokevirtual 91	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   105: invokestatic 97	com/tencent/mm/a/e:y	(Ljava/lang/String;Ljava/lang/String;)J
    //   108: pop2
    //   109: aload 10
    //   111: invokevirtual 91	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   114: aload 9
    //   116: invokevirtual 91	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   119: invokestatic 103	com/tencent/mm/sdk/platformtools/bi:fR	(Ljava/lang/String;Ljava/lang/String;)I
    //   122: iflt +703 -> 825
    //   125: new 105	java/io/FileInputStream
    //   128: dup
    //   129: new 43	java/io/File
    //   132: dup
    //   133: aload 9
    //   135: ldc 107
    //   137: invokespecial 85	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   140: invokespecial 110	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   143: astore 4
    //   145: new 112	java/io/InputStreamReader
    //   148: dup
    //   149: aload 4
    //   151: invokespecial 115	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;)V
    //   154: astore_3
    //   155: new 117	java/io/BufferedReader
    //   158: dup
    //   159: aload_3
    //   160: invokespecial 120	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   163: astore_2
    //   164: ldc 122
    //   166: astore_0
    //   167: aload_2
    //   168: astore 7
    //   170: aload_3
    //   171: astore 6
    //   173: aload 4
    //   175: astore 5
    //   177: aload_2
    //   178: invokevirtual 125	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   181: astore 11
    //   183: aload 11
    //   185: ifnull +36 -> 221
    //   188: aload_2
    //   189: astore 7
    //   191: aload_3
    //   192: astore 6
    //   194: aload 4
    //   196: astore 5
    //   198: new 127	java/lang/StringBuilder
    //   201: dup
    //   202: invokespecial 128	java/lang/StringBuilder:<init>	()V
    //   205: aload_0
    //   206: invokevirtual 132	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   209: aload 11
    //   211: invokevirtual 132	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   214: invokevirtual 135	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   217: astore_0
    //   218: goto -51 -> 167
    //   221: aload_2
    //   222: astore 7
    //   224: aload_3
    //   225: astore 6
    //   227: aload 4
    //   229: astore 5
    //   231: new 137	org/json/JSONObject
    //   234: dup
    //   235: aload_0
    //   236: invokespecial 138	org/json/JSONObject:<init>	(Ljava/lang/String;)V
    //   239: ldc -116
    //   241: invokevirtual 144	org/json/JSONObject:getInt	(Ljava/lang/String;)I
    //   244: istore_1
    //   245: aload_2
    //   246: astore 7
    //   248: aload_3
    //   249: astore 6
    //   251: aload 4
    //   253: astore 5
    //   255: ldc 56
    //   257: ldc -110
    //   259: iconst_2
    //   260: anewarray 60	java/lang/Object
    //   263: dup
    //   264: iconst_0
    //   265: aload_0
    //   266: aastore
    //   267: dup
    //   268: iconst_1
    //   269: iload_1
    //   270: invokestatic 152	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   273: aastore
    //   274: invokestatic 155	com/tencent/mm/sdk/platformtools/x:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   277: aload 4
    //   279: invokestatic 158	com/tencent/mm/a/e:f	(Ljava/io/InputStream;)V
    //   282: aload_3
    //   283: invokestatic 160	com/tencent/mm/a/e:a	(Ljava/io/Reader;)V
    //   286: aload_2
    //   287: invokestatic 160	com/tencent/mm/a/e:a	(Ljava/io/Reader;)V
    //   290: aload 9
    //   292: invokestatic 164	com/tencent/mm/a/e:k	(Ljava/io/File;)Z
    //   295: pop
    //   296: aload 10
    //   298: invokevirtual 167	java/io/File:getPath	()Ljava/lang/String;
    //   301: invokestatic 171	com/tencent/mm/a/e:deleteFile	(Ljava/lang/String;)Z
    //   304: pop
    //   305: getstatic 174	com/tencent/mm/ag/a:dRu	I
    //   308: iload_1
    //   309: if_icmpge +110 -> 419
    //   312: ldc 56
    //   314: ldc -80
    //   316: iconst_2
    //   317: anewarray 60	java/lang/Object
    //   320: dup
    //   321: iconst_0
    //   322: getstatic 174	com/tencent/mm/ag/a:dRu	I
    //   325: invokestatic 152	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   328: aastore
    //   329: dup
    //   330: iconst_1
    //   331: iload_1
    //   332: invokestatic 152	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   335: aastore
    //   336: invokestatic 70	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   339: aload 8
    //   341: invokestatic 179	com/tencent/mm/ag/a:s	(Ljava/io/File;)V
    //   344: iconst_0
    //   345: ireturn
    //   346: astore_0
    //   347: aconst_null
    //   348: astore_2
    //   349: aconst_null
    //   350: astore_3
    //   351: iconst_1
    //   352: istore_1
    //   353: aconst_null
    //   354: astore 4
    //   356: aload_2
    //   357: astore 7
    //   359: aload_3
    //   360: astore 6
    //   362: aload 4
    //   364: astore 5
    //   366: ldc 56
    //   368: aload_0
    //   369: aload_0
    //   370: invokevirtual 182	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   373: iconst_0
    //   374: anewarray 60	java/lang/Object
    //   377: invokestatic 186	com/tencent/mm/sdk/platformtools/x:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   380: aload 4
    //   382: invokestatic 158	com/tencent/mm/a/e:f	(Ljava/io/InputStream;)V
    //   385: aload_3
    //   386: invokestatic 160	com/tencent/mm/a/e:a	(Ljava/io/Reader;)V
    //   389: aload_2
    //   390: invokestatic 160	com/tencent/mm/a/e:a	(Ljava/io/Reader;)V
    //   393: goto -103 -> 290
    //   396: astore_0
    //   397: aconst_null
    //   398: astore_2
    //   399: aconst_null
    //   400: astore_3
    //   401: aconst_null
    //   402: astore 4
    //   404: aload 4
    //   406: invokestatic 158	com/tencent/mm/a/e:f	(Ljava/io/InputStream;)V
    //   409: aload_3
    //   410: invokestatic 160	com/tencent/mm/a/e:a	(Ljava/io/Reader;)V
    //   413: aload_2
    //   414: invokestatic 160	com/tencent/mm/a/e:a	(Ljava/io/Reader;)V
    //   417: aload_0
    //   418: athrow
    //   419: ldc 56
    //   421: ldc -68
    //   423: iconst_2
    //   424: anewarray 60	java/lang/Object
    //   427: dup
    //   428: iconst_0
    //   429: getstatic 174	com/tencent/mm/ag/a:dRu	I
    //   432: invokestatic 152	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   435: aastore
    //   436: dup
    //   437: iconst_1
    //   438: iload_1
    //   439: invokestatic 152	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   442: aastore
    //   443: invokestatic 70	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   446: iconst_0
    //   447: ireturn
    //   448: ldc 56
    //   450: ldc -66
    //   452: invokestatic 193	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   455: iconst_0
    //   456: ireturn
    //   457: aload_0
    //   458: getfield 36	com/tencent/mm/g/a/bc:bIB	Lcom/tencent/mm/g/a/bc$a;
    //   461: getfield 41	com/tencent/mm/g/a/bc$a:bIC	I
    //   464: bipush 37
    //   466: if_icmpne -122 -> 344
    //   469: aload_0
    //   470: getfield 36	com/tencent/mm/g/a/bc:bIB	Lcom/tencent/mm/g/a/bc$a;
    //   473: getfield 196	com/tencent/mm/g/a/bc$a:bID	I
    //   476: iconst_1
    //   477: if_icmpne +14 -> 491
    //   480: invokestatic 202	com/tencent/mm/plugin/emoji/e/i:aEd	()Lcom/tencent/mm/plugin/emoji/e/i;
    //   483: pop
    //   484: aload_0
    //   485: iconst_0
    //   486: invokestatic 205	com/tencent/mm/plugin/emoji/e/i:a	(Lcom/tencent/mm/g/a/bc;Z)V
    //   489: iconst_0
    //   490: ireturn
    //   491: aload_0
    //   492: getfield 36	com/tencent/mm/g/a/bc:bIB	Lcom/tencent/mm/g/a/bc$a;
    //   495: getfield 196	com/tencent/mm/g/a/bc$a:bID	I
    //   498: iconst_2
    //   499: if_icmpne +14 -> 513
    //   502: invokestatic 202	com/tencent/mm/plugin/emoji/e/i:aEd	()Lcom/tencent/mm/plugin/emoji/e/i;
    //   505: pop
    //   506: aload_0
    //   507: iconst_0
    //   508: invokestatic 208	com/tencent/mm/plugin/emoji/e/i:b	(Lcom/tencent/mm/g/a/bc;Z)V
    //   511: iconst_0
    //   512: ireturn
    //   513: aload_0
    //   514: getfield 36	com/tencent/mm/g/a/bc:bIB	Lcom/tencent/mm/g/a/bc$a;
    //   517: getfield 196	com/tencent/mm/g/a/bc$a:bID	I
    //   520: iconst_3
    //   521: if_icmpne +94 -> 615
    //   524: invokestatic 202	com/tencent/mm/plugin/emoji/e/i:aEd	()Lcom/tencent/mm/plugin/emoji/e/i;
    //   527: pop
    //   528: aload_0
    //   529: getstatic 214	com/tencent/mm/plugin/emoji/e/i$a:ifY	Lcom/tencent/mm/plugin/emoji/e/i$a;
    //   532: invokestatic 217	com/tencent/mm/plugin/emoji/e/i:a	(Lcom/tencent/mm/g/a/bc;Lcom/tencent/mm/plugin/emoji/e/i$a;)Z
    //   535: ifeq +71 -> 606
    //   538: aload_0
    //   539: getstatic 214	com/tencent/mm/plugin/emoji/e/i$a:ifY	Lcom/tencent/mm/plugin/emoji/e/i$a;
    //   542: getstatic 220	com/tencent/mm/plugin/emoji/e/i:ifC	Ljava/lang/String;
    //   545: invokestatic 223	com/tencent/mm/plugin/emoji/e/i:a	(Lcom/tencent/mm/g/a/bc;Lcom/tencent/mm/plugin/emoji/e/i$a;Ljava/lang/String;)Z
    //   548: ifeq +49 -> 597
    //   551: new 43	java/io/File
    //   554: dup
    //   555: new 43	java/io/File
    //   558: dup
    //   559: invokestatic 226	com/tencent/mm/plugin/emoji/e/i:getDataEmojiPath	()Ljava/lang/String;
    //   562: getstatic 220	com/tencent/mm/plugin/emoji/e/i:ifC	Ljava/lang/String;
    //   565: invokespecial 80	java/io/File:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   568: getstatic 229	com/tencent/mm/plugin/emoji/e/i:ifN	Ljava/lang/String;
    //   571: invokespecial 85	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   574: astore_0
    //   575: aload_0
    //   576: invokevirtual 54	java/io/File:exists	()Z
    //   579: ifeq +9 -> 588
    //   582: aload_0
    //   583: invokestatic 231	com/tencent/mm/plugin/emoji/e/i:I	(Ljava/io/File;)V
    //   586: iconst_0
    //   587: ireturn
    //   588: ldc -23
    //   590: ldc -21
    //   592: invokestatic 237	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   595: iconst_0
    //   596: ireturn
    //   597: ldc -23
    //   599: ldc -17
    //   601: invokestatic 237	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   604: iconst_0
    //   605: ireturn
    //   606: ldc -23
    //   608: ldc -15
    //   610: invokestatic 237	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   613: iconst_0
    //   614: ireturn
    //   615: aload_0
    //   616: getfield 36	com/tencent/mm/g/a/bc:bIB	Lcom/tencent/mm/g/a/bc$a;
    //   619: getfield 196	com/tencent/mm/g/a/bc$a:bID	I
    //   622: iconst_5
    //   623: if_icmpne +85 -> 708
    //   626: invokestatic 202	com/tencent/mm/plugin/emoji/e/i:aEd	()Lcom/tencent/mm/plugin/emoji/e/i;
    //   629: pop
    //   630: aload_0
    //   631: getstatic 244	com/tencent/mm/plugin/emoji/e/i$a:iga	Lcom/tencent/mm/plugin/emoji/e/i$a;
    //   634: invokestatic 217	com/tencent/mm/plugin/emoji/e/i:a	(Lcom/tencent/mm/g/a/bc;Lcom/tencent/mm/plugin/emoji/e/i$a;)Z
    //   637: ifeq -293 -> 344
    //   640: aload_0
    //   641: getstatic 244	com/tencent/mm/plugin/emoji/e/i$a:iga	Lcom/tencent/mm/plugin/emoji/e/i$a;
    //   644: getstatic 247	com/tencent/mm/plugin/emoji/e/i:ifD	Ljava/lang/String;
    //   647: invokestatic 223	com/tencent/mm/plugin/emoji/e/i:a	(Lcom/tencent/mm/g/a/bc;Lcom/tencent/mm/plugin/emoji/e/i$a;Ljava/lang/String;)Z
    //   650: ifeq +49 -> 699
    //   653: new 43	java/io/File
    //   656: dup
    //   657: new 43	java/io/File
    //   660: dup
    //   661: invokestatic 226	com/tencent/mm/plugin/emoji/e/i:getDataEmojiPath	()Ljava/lang/String;
    //   664: getstatic 247	com/tencent/mm/plugin/emoji/e/i:ifD	Ljava/lang/String;
    //   667: invokespecial 80	java/io/File:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   670: getstatic 250	com/tencent/mm/plugin/emoji/e/i:ifO	Ljava/lang/String;
    //   673: invokespecial 85	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   676: astore_0
    //   677: aload_0
    //   678: invokevirtual 54	java/io/File:exists	()Z
    //   681: ifeq +9 -> 690
    //   684: aload_0
    //   685: invokestatic 253	com/tencent/mm/plugin/emoji/e/i:J	(Ljava/io/File;)V
    //   688: iconst_0
    //   689: ireturn
    //   690: ldc -23
    //   692: ldc -1
    //   694: invokestatic 237	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   697: iconst_0
    //   698: ireturn
    //   699: ldc -23
    //   701: ldc -1
    //   703: invokestatic 237	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   706: iconst_0
    //   707: ireturn
    //   708: aload_0
    //   709: getfield 36	com/tencent/mm/g/a/bc:bIB	Lcom/tencent/mm/g/a/bc$a;
    //   712: getfield 196	com/tencent/mm/g/a/bc$a:bID	I
    //   715: iconst_4
    //   716: if_icmpne -372 -> 344
    //   719: invokestatic 202	com/tencent/mm/plugin/emoji/e/i:aEd	()Lcom/tencent/mm/plugin/emoji/e/i;
    //   722: pop
    //   723: ldc -23
    //   725: ldc_w 257
    //   728: invokestatic 259	com/tencent/mm/sdk/platformtools/x:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   731: aload_0
    //   732: invokestatic 261	com/tencent/mm/plugin/emoji/e/i:b	(Lcom/tencent/mm/g/a/bc;)Z
    //   735: ifeq -391 -> 344
    //   738: invokestatic 267	com/tencent/mm/br/b:cjC	()Lcom/tencent/mm/br/b;
    //   741: pop
    //   742: aload_0
    //   743: getfield 36	com/tencent/mm/g/a/bc:bIB	Lcom/tencent/mm/g/a/bc$a;
    //   746: getfield 47	com/tencent/mm/g/a/bc$a:filePath	Ljava/lang/String;
    //   749: astore_0
    //   750: invokestatic 270	com/tencent/mm/br/b:cjD	()V
    //   753: aload_0
    //   754: getstatic 273	com/tencent/mm/br/b:sLq	Ljava/lang/String;
    //   757: invokestatic 279	com/tencent/mm/sdk/platformtools/j:fN	(Ljava/lang/String;Ljava/lang/String;)Z
    //   760: pop
    //   761: invokestatic 267	com/tencent/mm/br/b:cjC	()Lcom/tencent/mm/br/b;
    //   764: invokevirtual 282	com/tencent/mm/br/b:init	()V
    //   767: iconst_0
    //   768: ireturn
    //   769: astore_0
    //   770: aconst_null
    //   771: astore_2
    //   772: aconst_null
    //   773: astore_3
    //   774: goto -370 -> 404
    //   777: astore_0
    //   778: aconst_null
    //   779: astore_2
    //   780: goto -376 -> 404
    //   783: astore_0
    //   784: aload 7
    //   786: astore_2
    //   787: aload 6
    //   789: astore_3
    //   790: aload 5
    //   792: astore 4
    //   794: goto -390 -> 404
    //   797: astore_0
    //   798: aconst_null
    //   799: astore_2
    //   800: aconst_null
    //   801: astore_3
    //   802: iconst_1
    //   803: istore_1
    //   804: goto -448 -> 356
    //   807: astore_0
    //   808: aconst_null
    //   809: astore_2
    //   810: iconst_1
    //   811: istore_1
    //   812: goto -456 -> 356
    //   815: astore_0
    //   816: iconst_1
    //   817: istore_1
    //   818: goto -462 -> 356
    //   821: astore_0
    //   822: goto -466 -> 356
    //   825: iconst_1
    //   826: istore_1
    //   827: goto -537 -> 290
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	830	0	parambc	bc
    //   244	583	1	i	int
    //   163	647	2	localObject1	Object
    //   154	648	3	localObject2	Object
    //   143	650	4	localObject3	Object
    //   175	616	5	localObject4	Object
    //   171	617	6	localObject5	Object
    //   168	617	7	localObject6	Object
    //   33	307	8	localFile1	java.io.File
    //   74	217	9	localFile2	java.io.File
    //   87	210	10	localFile3	java.io.File
    //   181	29	11	str	String
    // Exception table:
    //   from	to	target	type
    //   125	145	346	java/lang/Exception
    //   125	145	396	finally
    //   145	155	769	finally
    //   155	164	777	finally
    //   177	183	783	finally
    //   198	218	783	finally
    //   231	245	783	finally
    //   255	277	783	finally
    //   366	380	783	finally
    //   145	155	797	java/lang/Exception
    //   155	164	807	java/lang/Exception
    //   177	183	815	java/lang/Exception
    //   198	218	815	java/lang/Exception
    //   231	245	815	java/lang/Exception
    //   255	277	821	java/lang/Exception
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/emoji/c/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */