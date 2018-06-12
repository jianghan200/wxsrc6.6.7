package com.tencent.mm.plugin.wear.model.e;

import java.util.ArrayList;
import java.util.List;

public final class g
  extends a
{
  public final List<Integer> bSy()
  {
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(Integer.valueOf(11005));
    localArrayList.add(Integer.valueOf(11006));
    localArrayList.add(Integer.valueOf(11007));
    return localArrayList;
  }
  
  /* Error */
  protected final byte[] p(int paramInt, byte[] paramArrayOfByte)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 4
    //   3: iload_1
    //   4: sipush 11005
    //   7: if_icmpne +142 -> 149
    //   10: new 38	com/tencent/mm/protocal/c/cdp
    //   13: dup
    //   14: invokespecial 39	com/tencent/mm/protocal/c/cdp:<init>	()V
    //   17: astore_3
    //   18: aload_3
    //   19: aload_2
    //   20: invokevirtual 43	com/tencent/mm/protocal/c/cdp:aG	([B)Lcom/tencent/mm/bk/a;
    //   23: pop
    //   24: new 45	com/tencent/mm/protocal/c/cdq
    //   27: dup
    //   28: invokespecial 46	com/tencent/mm/protocal/c/cdq:<init>	()V
    //   31: astore_2
    //   32: aload_3
    //   33: getfield 50	com/tencent/mm/protocal/c/cdp:rdS	Ljava/lang/String;
    //   36: invokestatic 56	com/tencent/mm/plugin/wear/model/h:PO	(Ljava/lang/String;)Landroid/graphics/Bitmap;
    //   39: astore 4
    //   41: aload 4
    //   43: ifnull +86 -> 129
    //   46: aload_2
    //   47: invokestatic 62	java/lang/System:currentTimeMillis	()J
    //   50: putfield 66	com/tencent/mm/protocal/c/cdq:sza	J
    //   53: aload 4
    //   55: invokestatic 70	com/tencent/mm/plugin/wear/model/h:N	(Landroid/graphics/Bitmap;)[B
    //   58: astore 4
    //   60: ldc 72
    //   62: ldc 74
    //   64: iconst_1
    //   65: anewarray 76	java/lang/Object
    //   68: dup
    //   69: iconst_0
    //   70: aload_3
    //   71: getfield 50	com/tencent/mm/protocal/c/cdp:rdS	Ljava/lang/String;
    //   74: aastore
    //   75: invokestatic 82	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   78: aload_2
    //   79: new 84	com/tencent/mm/bk/b
    //   82: dup
    //   83: aload 4
    //   85: invokespecial 87	com/tencent/mm/bk/b:<init>	([B)V
    //   88: putfield 91	com/tencent/mm/protocal/c/cdq:hbs	Lcom/tencent/mm/bk/b;
    //   91: aload_2
    //   92: invokevirtual 95	com/tencent/mm/protocal/c/cdq:toByteArray	()[B
    //   95: astore_3
    //   96: aload_3
    //   97: areturn
    //   98: astore_2
    //   99: ldc 72
    //   101: aload_2
    //   102: ldc 97
    //   104: iconst_0
    //   105: anewarray 76	java/lang/Object
    //   108: invokestatic 101	com/tencent/mm/sdk/platformtools/x:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   111: goto -87 -> 24
    //   114: astore_2
    //   115: ldc 72
    //   117: aload_2
    //   118: ldc 97
    //   120: iconst_0
    //   121: anewarray 76	java/lang/Object
    //   124: invokestatic 101	com/tencent/mm/sdk/platformtools/x:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   127: aconst_null
    //   128: areturn
    //   129: ldc 72
    //   131: ldc 103
    //   133: iconst_1
    //   134: anewarray 76	java/lang/Object
    //   137: dup
    //   138: iconst_0
    //   139: aload_3
    //   140: getfield 50	com/tencent/mm/protocal/c/cdp:rdS	Ljava/lang/String;
    //   143: aastore
    //   144: invokestatic 106	com/tencent/mm/sdk/platformtools/x:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   147: aconst_null
    //   148: areturn
    //   149: iload_1
    //   150: sipush 11006
    //   153: if_icmpne +170 -> 323
    //   156: new 108	java/lang/String
    //   159: dup
    //   160: aload_2
    //   161: ldc 110
    //   163: invokespecial 113	java/lang/String:<init>	([BLjava/lang/String;)V
    //   166: astore_2
    //   167: ldc 115
    //   169: invokestatic 121	com/tencent/mm/kernel/g:n	(Ljava/lang/Class;)Lcom/tencent/mm/kernel/b/a;
    //   172: checkcast 115	com/tencent/mm/plugin/emoji/b/c
    //   175: invokeinterface 125 1 0
    //   180: aload_2
    //   181: invokeinterface 131 2 0
    //   186: astore_2
    //   187: aload 4
    //   189: astore_3
    //   190: aload_2
    //   191: ifnull -95 -> 96
    //   194: aload_2
    //   195: invokevirtual 137	com/tencent/mm/storage/emotion/EmojiInfo:aaq	()Z
    //   198: ifeq +29 -> 227
    //   201: aload_2
    //   202: invokestatic 143	com/tencent/mm/sdk/platformtools/ad:getContext	()Landroid/content/Context;
    //   205: invokevirtual 147	com/tencent/mm/storage/emotion/EmojiInfo:gj	(Landroid/content/Context;)Landroid/graphics/Bitmap;
    //   208: invokestatic 70	com/tencent/mm/plugin/wear/model/h:N	(Landroid/graphics/Bitmap;)[B
    //   211: areturn
    //   212: astore_2
    //   213: ldc 72
    //   215: aload_2
    //   216: ldc 97
    //   218: iconst_0
    //   219: anewarray 76	java/lang/Object
    //   222: invokestatic 101	com/tencent/mm/sdk/platformtools/x:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   225: aconst_null
    //   226: areturn
    //   227: aload_2
    //   228: getfield 151	com/tencent/mm/storage/emotion/EmojiInfo:field_catalog	I
    //   231: getstatic 156	com/tencent/mm/storage/emotion/EmojiGroupInfo:tcy	I
    //   234: if_icmpne +69 -> 303
    //   237: invokestatic 143	com/tencent/mm/sdk/platformtools/ad:getContext	()Landroid/content/Context;
    //   240: aload_2
    //   241: invokevirtual 160	com/tencent/mm/storage/emotion/EmojiInfo:getName	()Ljava/lang/String;
    //   244: invokestatic 164	com/tencent/mm/storage/emotion/EmojiInfo:bt	(Landroid/content/Context;Ljava/lang/String;)Ljava/io/InputStream;
    //   247: astore_3
    //   248: aload_3
    //   249: astore_2
    //   250: aload_3
    //   251: invokestatic 170	com/tencent/mm/a/e:g	(Ljava/io/InputStream;)[B
    //   254: astore 4
    //   256: aload_3
    //   257: invokestatic 174	com/tencent/mm/a/e:f	(Ljava/io/InputStream;)V
    //   260: aload 4
    //   262: areturn
    //   263: astore 4
    //   265: aconst_null
    //   266: astore_3
    //   267: aload_3
    //   268: astore_2
    //   269: ldc 72
    //   271: ldc -80
    //   273: iconst_1
    //   274: anewarray 76	java/lang/Object
    //   277: dup
    //   278: iconst_0
    //   279: aload 4
    //   281: invokestatic 181	com/tencent/mm/sdk/platformtools/bi:i	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   284: aastore
    //   285: invokestatic 184	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   288: aload_3
    //   289: invokestatic 174	com/tencent/mm/a/e:f	(Ljava/io/InputStream;)V
    //   292: aconst_null
    //   293: areturn
    //   294: astore_3
    //   295: aconst_null
    //   296: astore_2
    //   297: aload_2
    //   298: invokestatic 174	com/tencent/mm/a/e:f	(Ljava/io/InputStream;)V
    //   301: aload_3
    //   302: athrow
    //   303: ldc 115
    //   305: invokestatic 121	com/tencent/mm/kernel/g:n	(Ljava/lang/Class;)Lcom/tencent/mm/kernel/b/a;
    //   308: checkcast 115	com/tencent/mm/plugin/emoji/b/c
    //   311: invokeinterface 125 1 0
    //   316: aload_2
    //   317: invokeinterface 188 2 0
    //   322: areturn
    //   323: aload 4
    //   325: astore_3
    //   326: iload_1
    //   327: sipush 11007
    //   330: if_icmpne -234 -> 96
    //   333: new 190	com/tencent/mm/protocal/c/ceh
    //   336: dup
    //   337: invokespecial 191	com/tencent/mm/protocal/c/ceh:<init>	()V
    //   340: astore_3
    //   341: aload_3
    //   342: aload_2
    //   343: invokevirtual 192	com/tencent/mm/protocal/c/ceh:aG	([B)Lcom/tencent/mm/bk/a;
    //   346: pop
    //   347: invokestatic 198	com/tencent/mm/model/au:HU	()Lcom/tencent/mm/model/c;
    //   350: pop
    //   351: invokestatic 204	com/tencent/mm/model/c:FT	()Lcom/tencent/mm/plugin/messenger/foundation/a/a/f;
    //   354: aload_3
    //   355: getfield 207	com/tencent/mm/protocal/c/ceh:szl	J
    //   358: invokeinterface 213 3 0
    //   363: astore_2
    //   364: aload_3
    //   365: getfield 217	com/tencent/mm/protocal/c/ceh:szp	Z
    //   368: ifne +79 -> 447
    //   371: invokestatic 223	com/tencent/mm/ak/o:Pf	()Lcom/tencent/mm/ak/g;
    //   374: aload_2
    //   375: getfield 228	com/tencent/mm/g/c/cm:field_imgPath	Ljava/lang/String;
    //   378: invokevirtual 234	com/tencent/mm/ak/g:lN	(Ljava/lang/String;)Ljava/lang/String;
    //   381: astore_2
    //   382: aload 4
    //   384: astore_3
    //   385: aload_2
    //   386: invokestatic 238	com/tencent/mm/sdk/platformtools/bi:oW	(Ljava/lang/String;)Z
    //   389: ifne -293 -> 96
    //   392: new 240	com/tencent/mm/protocal/c/cei
    //   395: dup
    //   396: invokespecial 241	com/tencent/mm/protocal/c/cei:<init>	()V
    //   399: astore_3
    //   400: aload_3
    //   401: invokestatic 62	java/lang/System:currentTimeMillis	()J
    //   404: putfield 242	com/tencent/mm/protocal/c/cei:sza	J
    //   407: aload_3
    //   408: new 84	com/tencent/mm/bk/b
    //   411: dup
    //   412: aload_2
    //   413: iconst_0
    //   414: iconst_m1
    //   415: invokestatic 247	com/tencent/mm/modelsfs/FileOp:e	(Ljava/lang/String;II)[B
    //   418: invokespecial 87	com/tencent/mm/bk/b:<init>	([B)V
    //   421: putfield 248	com/tencent/mm/protocal/c/cei:hbs	Lcom/tencent/mm/bk/b;
    //   424: aload_3
    //   425: invokevirtual 249	com/tencent/mm/protocal/c/cei:toByteArray	()[B
    //   428: astore_2
    //   429: aload_2
    //   430: areturn
    //   431: astore_2
    //   432: ldc 72
    //   434: aload_2
    //   435: ldc 97
    //   437: iconst_0
    //   438: anewarray 76	java/lang/Object
    //   441: invokestatic 101	com/tencent/mm/sdk/platformtools/x:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   444: goto -97 -> 347
    //   447: new 240	com/tencent/mm/protocal/c/cei
    //   450: dup
    //   451: invokespecial 241	com/tencent/mm/protocal/c/cei:<init>	()V
    //   454: astore 6
    //   456: aload 6
    //   458: invokestatic 62	java/lang/System:currentTimeMillis	()J
    //   461: putfield 242	com/tencent/mm/protocal/c/cei:sza	J
    //   464: aload_2
    //   465: getfield 252	com/tencent/mm/g/c/cm:field_isSend	I
    //   468: iconst_1
    //   469: if_icmpne +104 -> 573
    //   472: invokestatic 223	com/tencent/mm/ak/o:Pf	()Lcom/tencent/mm/ak/g;
    //   475: aload_2
    //   476: getfield 255	com/tencent/mm/g/c/cm:field_msgId	J
    //   479: invokevirtual 259	com/tencent/mm/ak/g:br	(J)Lcom/tencent/mm/ak/e;
    //   482: astore_3
    //   483: invokestatic 223	com/tencent/mm/ak/o:Pf	()Lcom/tencent/mm/ak/g;
    //   486: invokestatic 223	com/tencent/mm/ak/o:Pf	()Lcom/tencent/mm/ak/g;
    //   489: aload_3
    //   490: invokevirtual 263	com/tencent/mm/ak/g:d	(Lcom/tencent/mm/ak/e;)Ljava/lang/String;
    //   493: ldc 97
    //   495: ldc 97
    //   497: invokevirtual 267	com/tencent/mm/ak/g:o	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   500: astore_2
    //   501: aload_2
    //   502: invokestatic 270	com/tencent/mm/modelsfs/FileOp:cn	(Ljava/lang/String;)Z
    //   505: ifeq +39 -> 544
    //   508: aload 4
    //   510: astore_3
    //   511: aload_2
    //   512: invokestatic 238	com/tencent/mm/sdk/platformtools/bi:oW	(Ljava/lang/String;)Z
    //   515: ifne -419 -> 96
    //   518: aload 6
    //   520: new 84	com/tencent/mm/bk/b
    //   523: dup
    //   524: aload_2
    //   525: iconst_0
    //   526: iconst_m1
    //   527: invokestatic 247	com/tencent/mm/modelsfs/FileOp:e	(Ljava/lang/String;II)[B
    //   530: invokespecial 87	com/tencent/mm/bk/b:<init>	([B)V
    //   533: putfield 248	com/tencent/mm/protocal/c/cei:hbs	Lcom/tencent/mm/bk/b;
    //   536: aload 6
    //   538: invokevirtual 249	com/tencent/mm/protocal/c/cei:toByteArray	()[B
    //   541: astore_2
    //   542: aload_2
    //   543: areturn
    //   544: invokestatic 223	com/tencent/mm/ak/o:Pf	()Lcom/tencent/mm/ak/g;
    //   547: aload_3
    //   548: getfield 275	com/tencent/mm/ak/e:dTL	Ljava/lang/String;
    //   551: ldc 97
    //   553: ldc 97
    //   555: invokevirtual 267	com/tencent/mm/ak/g:o	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   558: astore_3
    //   559: aload_3
    //   560: astore_2
    //   561: aload_3
    //   562: invokestatic 270	com/tencent/mm/modelsfs/FileOp:cn	(Ljava/lang/String;)Z
    //   565: ifne -57 -> 508
    //   568: aconst_null
    //   569: astore_2
    //   570: goto -62 -> 508
    //   573: invokestatic 223	com/tencent/mm/ak/o:Pf	()Lcom/tencent/mm/ak/g;
    //   576: aload_2
    //   577: getfield 278	com/tencent/mm/g/c/cm:field_msgSvrId	J
    //   580: invokevirtual 281	com/tencent/mm/ak/g:bq	(J)Lcom/tencent/mm/ak/e;
    //   583: astore 5
    //   585: aload 5
    //   587: invokevirtual 284	com/tencent/mm/ak/e:OM	()Z
    //   590: ifeq -22 -> 568
    //   593: aload 5
    //   595: invokevirtual 287	com/tencent/mm/ak/e:ON	()Z
    //   598: ifeq +86 -> 684
    //   601: invokestatic 223	com/tencent/mm/ak/o:Pf	()Lcom/tencent/mm/ak/g;
    //   604: invokestatic 223	com/tencent/mm/ak/o:Pf	()Lcom/tencent/mm/ak/g;
    //   607: aload 5
    //   609: invokevirtual 263	com/tencent/mm/ak/g:d	(Lcom/tencent/mm/ak/e;)Ljava/lang/String;
    //   612: ldc 97
    //   614: ldc 97
    //   616: invokevirtual 267	com/tencent/mm/ak/g:o	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   619: astore_3
    //   620: aload_3
    //   621: invokestatic 270	com/tencent/mm/modelsfs/FileOp:cn	(Ljava/lang/String;)Z
    //   624: ifeq +60 -> 684
    //   627: aload_3
    //   628: astore_2
    //   629: aload_3
    //   630: invokestatic 238	com/tencent/mm/sdk/platformtools/bi:oW	(Ljava/lang/String;)Z
    //   633: ifeq -125 -> 508
    //   636: invokestatic 223	com/tencent/mm/ak/o:Pf	()Lcom/tencent/mm/ak/g;
    //   639: aload 5
    //   641: getfield 275	com/tencent/mm/ak/e:dTL	Ljava/lang/String;
    //   644: ldc 97
    //   646: ldc 97
    //   648: invokevirtual 267	com/tencent/mm/ak/g:o	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   651: astore 5
    //   653: aload_3
    //   654: astore_2
    //   655: aload 5
    //   657: invokestatic 270	com/tencent/mm/modelsfs/FileOp:cn	(Ljava/lang/String;)Z
    //   660: ifeq -152 -> 508
    //   663: aload 5
    //   665: astore_2
    //   666: goto -158 -> 508
    //   669: astore_2
    //   670: aconst_null
    //   671: areturn
    //   672: astore_2
    //   673: aconst_null
    //   674: areturn
    //   675: astore_3
    //   676: goto -379 -> 297
    //   679: astore 4
    //   681: goto -414 -> 267
    //   684: aconst_null
    //   685: astore_3
    //   686: goto -59 -> 627
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	689	0	this	g
    //   0	689	1	paramInt	int
    //   0	689	2	paramArrayOfByte	byte[]
    //   17	272	3	localObject1	Object
    //   294	8	3	localObject2	Object
    //   325	329	3	localObject3	Object
    //   675	1	3	localObject4	Object
    //   685	1	3	localObject5	Object
    //   1	260	4	localObject6	Object
    //   263	246	4	localException1	Exception
    //   679	1	4	localException2	Exception
    //   583	81	5	localObject7	Object
    //   454	83	6	localcei	com.tencent.mm.protocal.c.cei
    // Exception table:
    //   from	to	target	type
    //   18	24	98	java/io/IOException
    //   91	96	114	java/io/IOException
    //   156	167	212	java/io/UnsupportedEncodingException
    //   237	248	263	java/lang/Exception
    //   237	248	294	finally
    //   341	347	431	java/io/IOException
    //   424	429	669	java/io/IOException
    //   536	542	672	java/io/IOException
    //   250	256	675	finally
    //   269	288	675	finally
    //   250	256	679	java/lang/Exception
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/wear/model/e/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */