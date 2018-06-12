package com.tencent.mm.plugin.fav.a;

import com.tencent.mm.k.e;
import com.tencent.mm.protocal.c.vx;
import com.tencent.mm.protocal.c.wl;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.vfs.d;
import java.util.Iterator;
import java.util.LinkedList;

public final class k
  implements w
{
  public boolean iWc = true;
  
  public static boolean h(vx paramvx)
  {
    if (paramvx == null) {}
    do
    {
      do
      {
        do
        {
          return true;
          switch (paramvx.bjS)
          {
          case 3: 
          case 5: 
          case 6: 
          case 9: 
          case 10: 
          case 11: 
          case 12: 
          case 13: 
          case 14: 
          default: 
            return false;
          }
        } while (!new com.tencent.mm.vfs.b(b.b(paramvx)).exists());
        return false;
        if (bi.WU(com.tencent.mm.k.g.AT().getValue("SIGHTCannotTransmitForFav")) != 0)
        {
          com.tencent.mm.sdk.platformtools.x.w("MicroMsg.FavSendFilter", "can not retransmit short video");
          return true;
        }
      } while (!new com.tencent.mm.vfs.b(b.b(paramvx)).exists());
      return false;
      if (new com.tencent.mm.vfs.b(b.b(paramvx)).exists()) {
        return false;
      }
      return bi.oW(paramvx.rzv);
    } while ((bi.oW(paramvx.rzv)) && (bi.oW(paramvx.rzx)) && (bi.oW(paramvx.rzz)) && (bi.oW(paramvx.rzz)));
    return false;
  }
  
  public static boolean u(g paramg)
  {
    if (paramg == null) {
      return false;
    }
    if ((paramg.field_itemStatus > 0) && (!b.g(paramg))) {
      return false;
    }
    Object localObject = ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavItemInfoStorage().dy(paramg.field_localId);
    com.tencent.mm.vfs.b localb = new com.tencent.mm.vfs.b(b.b(b.c(paramg)));
    switch (paramg.field_type)
    {
    }
    do
    {
      do
      {
        do
        {
          return false;
          if ((paramg.field_id <= 0) && (localObject != null)) {
            return false;
          }
          if ((paramg.field_favProto == null) || (paramg.field_favProto.rBI.size() <= 1)) {
            return false;
          }
          paramg = paramg.field_favProto.rBI.iterator();
          do
          {
            if (!paramg.hasNext()) {
              break;
            }
            localObject = (vx)paramg.next();
          } while ((bi.oW(((vx)localObject).rzo)) || (bi.oW(((vx)localObject).rzq)) || (d.cn(b.b((vx)localObject))));
          return true;
        } while (localb.exists());
        return true;
        if (bi.WU(com.tencent.mm.k.g.AT().getValue("SIGHTCannotTransmitForFav")) != 0)
        {
          com.tencent.mm.sdk.platformtools.x.w("MicroMsg.FavSendFilter", "can not retransmit short video");
          return false;
        }
      } while (localb.exists());
      return true;
    } while ((!bi.oW(b.c(paramg).rzv)) || (localb.exists()));
    return true;
  }
  
  /* Error */
  public final boolean t(g paramg)
  {
    // Byte code:
    //   0: aload_1
    //   1: ifnonnull +5 -> 6
    //   4: iconst_1
    //   5: ireturn
    //   6: aload_1
    //   7: invokestatic 170	com/tencent/mm/plugin/fav/a/b:f	(Lcom/tencent/mm/plugin/fav/a/g;)Z
    //   10: ifeq +5 -> 15
    //   13: iconst_1
    //   14: ireturn
    //   15: ldc 94
    //   17: invokestatic 100	com/tencent/mm/kernel/g:n	(Ljava/lang/Class;)Lcom/tencent/mm/kernel/b/a;
    //   20: checkcast 94	com/tencent/mm/plugin/fav/a/ae
    //   23: invokeinterface 104 1 0
    //   28: aload_1
    //   29: getfield 108	com/tencent/mm/plugin/fav/a/g:field_localId	J
    //   32: invokeinterface 114 3 0
    //   37: astore 6
    //   39: aload_1
    //   40: getfield 121	com/tencent/mm/plugin/fav/a/g:field_type	I
    //   43: tableswitch	default:+85->128, 1:+274->317, 2:+285->328, 3:+803->846, 4:+568->611, 5:+663->706, 6:+600->643, 7:+614->657, 8:+285->328, 9:+85->128, 10:+725->768, 11:+777->820, 12:+85->128, 13:+85->128, 14:+87->130, 15:+751->794, 16:+309->352, 17:+85->128, 18:+87->130
    //   128: iconst_0
    //   129: ireturn
    //   130: aload_1
    //   131: getfield 124	com/tencent/mm/plugin/fav/a/g:field_id	I
    //   134: ifgt +10 -> 144
    //   137: aload 6
    //   139: ifnull +5 -> 144
    //   142: iconst_1
    //   143: ireturn
    //   144: aload_1
    //   145: getfield 121	com/tencent/mm/plugin/fav/a/g:field_type	I
    //   148: bipush 18
    //   150: if_icmpne +26 -> 176
    //   153: aload_1
    //   154: getfield 128	com/tencent/mm/plugin/fav/a/g:field_favProto	Lcom/tencent/mm/protocal/c/wl;
    //   157: ifnull +17 -> 174
    //   160: aload_1
    //   161: getfield 128	com/tencent/mm/plugin/fav/a/g:field_favProto	Lcom/tencent/mm/protocal/c/wl;
    //   164: getfield 134	com/tencent/mm/protocal/c/wl:rBI	Ljava/util/LinkedList;
    //   167: invokevirtual 140	java/util/LinkedList:size	()I
    //   170: iconst_1
    //   171: if_icmpgt +5 -> 176
    //   174: iconst_1
    //   175: ireturn
    //   176: aload_1
    //   177: getfield 121	com/tencent/mm/plugin/fav/a/g:field_type	I
    //   180: bipush 18
    //   182: if_icmpne +51 -> 233
    //   185: aload_1
    //   186: getfield 128	com/tencent/mm/plugin/fav/a/g:field_favProto	Lcom/tencent/mm/protocal/c/wl;
    //   189: getfield 134	com/tencent/mm/protocal/c/wl:rBI	Ljava/util/LinkedList;
    //   192: iconst_0
    //   193: invokevirtual 174	java/util/LinkedList:get	(I)Ljava/lang/Object;
    //   196: checkcast 19	com/tencent/mm/protocal/c/vx
    //   199: getfield 156	com/tencent/mm/protocal/c/vx:rzo	Ljava/lang/String;
    //   202: invokestatic 76	com/tencent/mm/sdk/platformtools/bi:oW	(Ljava/lang/String;)Z
    //   205: ifne +26 -> 231
    //   208: aload_1
    //   209: getfield 128	com/tencent/mm/plugin/fav/a/g:field_favProto	Lcom/tencent/mm/protocal/c/wl;
    //   212: getfield 134	com/tencent/mm/protocal/c/wl:rBI	Ljava/util/LinkedList;
    //   215: iconst_0
    //   216: invokevirtual 174	java/util/LinkedList:get	(I)Ljava/lang/Object;
    //   219: checkcast 19	com/tencent/mm/protocal/c/vx
    //   222: getfield 159	com/tencent/mm/protocal/c/vx:rzq	Ljava/lang/String;
    //   225: invokestatic 76	com/tencent/mm/sdk/platformtools/bi:oW	(Ljava/lang/String;)Z
    //   228: ifeq +5 -> 233
    //   231: iconst_1
    //   232: ireturn
    //   233: aload_1
    //   234: getfield 128	com/tencent/mm/plugin/fav/a/g:field_favProto	Lcom/tencent/mm/protocal/c/wl;
    //   237: getfield 134	com/tencent/mm/protocal/c/wl:rBI	Ljava/util/LinkedList;
    //   240: invokevirtual 144	java/util/LinkedList:iterator	()Ljava/util/Iterator;
    //   243: astore_1
    //   244: aload_1
    //   245: invokeinterface 149 1 0
    //   250: ifeq +65 -> 315
    //   253: aload_1
    //   254: invokeinterface 153 1 0
    //   259: checkcast 19	com/tencent/mm/protocal/c/vx
    //   262: astore 6
    //   264: aload 6
    //   266: getfield 23	com/tencent/mm/protocal/c/vx:bjS	I
    //   269: iconst_2
    //   270: if_icmpeq +32 -> 302
    //   273: aload 6
    //   275: getfield 23	com/tencent/mm/protocal/c/vx:bjS	I
    //   278: bipush 8
    //   280: if_icmpeq +22 -> 302
    //   283: aload 6
    //   285: getfield 23	com/tencent/mm/protocal/c/vx:bjS	I
    //   288: bipush 15
    //   290: if_icmpeq +12 -> 302
    //   293: aload 6
    //   295: getfield 23	com/tencent/mm/protocal/c/vx:bjS	I
    //   298: iconst_4
    //   299: if_icmpne -55 -> 244
    //   302: aload 6
    //   304: invokestatic 31	com/tencent/mm/plugin/fav/a/b:b	(Lcom/tencent/mm/protocal/c/vx;)Ljava/lang/String;
    //   307: invokestatic 164	com/tencent/mm/vfs/d:cn	(Ljava/lang/String;)Z
    //   310: ifne -66 -> 244
    //   313: iconst_1
    //   314: ireturn
    //   315: iconst_0
    //   316: ireturn
    //   317: aload_1
    //   318: getfield 128	com/tencent/mm/plugin/fav/a/g:field_favProto	Lcom/tencent/mm/protocal/c/wl;
    //   321: getfield 177	com/tencent/mm/protocal/c/wl:desc	Ljava/lang/String;
    //   324: invokestatic 76	com/tencent/mm/sdk/platformtools/bi:oW	(Ljava/lang/String;)Z
    //   327: ireturn
    //   328: new 25	com/tencent/mm/vfs/b
    //   331: dup
    //   332: aload_1
    //   333: invokestatic 118	com/tencent/mm/plugin/fav/a/b:c	(Lcom/tencent/mm/plugin/fav/a/g;)Lcom/tencent/mm/protocal/c/vx;
    //   336: invokestatic 31	com/tencent/mm/plugin/fav/a/b:b	(Lcom/tencent/mm/protocal/c/vx;)Ljava/lang/String;
    //   339: invokespecial 34	com/tencent/mm/vfs/b:<init>	(Ljava/lang/String;)V
    //   342: invokevirtual 38	com/tencent/mm/vfs/b:exists	()Z
    //   345: ifne +5 -> 350
    //   348: iconst_1
    //   349: ireturn
    //   350: iconst_0
    //   351: ireturn
    //   352: invokestatic 44	com/tencent/mm/k/g:AT	()Lcom/tencent/mm/k/e;
    //   355: ldc 46
    //   357: invokevirtual 52	com/tencent/mm/k/e:getValue	(Ljava/lang/String;)Ljava/lang/String;
    //   360: invokestatic 58	com/tencent/mm/sdk/platformtools/bi:WU	(Ljava/lang/String;)I
    //   363: ifeq +12 -> 375
    //   366: ldc 60
    //   368: ldc 62
    //   370: invokestatic 68	com/tencent/mm/sdk/platformtools/x:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   373: iconst_1
    //   374: ireturn
    //   375: aload_1
    //   376: invokestatic 118	com/tencent/mm/plugin/fav/a/b:c	(Lcom/tencent/mm/plugin/fav/a/g;)Lcom/tencent/mm/protocal/c/vx;
    //   379: astore 8
    //   381: new 25	com/tencent/mm/vfs/b
    //   384: dup
    //   385: aload 8
    //   387: invokestatic 31	com/tencent/mm/plugin/fav/a/b:b	(Lcom/tencent/mm/protocal/c/vx;)Ljava/lang/String;
    //   390: invokespecial 34	com/tencent/mm/vfs/b:<init>	(Ljava/lang/String;)V
    //   393: astore 6
    //   395: ldc 60
    //   397: ldc -77
    //   399: iconst_4
    //   400: anewarray 4	java/lang/Object
    //   403: dup
    //   404: iconst_0
    //   405: aload_1
    //   406: getfield 124	com/tencent/mm/plugin/fav/a/g:field_id	I
    //   409: invokestatic 185	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   412: aastore
    //   413: dup
    //   414: iconst_1
    //   415: aload_1
    //   416: getfield 108	com/tencent/mm/plugin/fav/a/g:field_localId	J
    //   419: invokestatic 190	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   422: aastore
    //   423: dup
    //   424: iconst_2
    //   425: aload 6
    //   427: invokevirtual 194	com/tencent/mm/vfs/b:cBX	()Landroid/net/Uri;
    //   430: invokevirtual 200	android/net/Uri:toString	()Ljava/lang/String;
    //   433: aastore
    //   434: dup
    //   435: iconst_3
    //   436: aload 6
    //   438: invokevirtual 38	com/tencent/mm/vfs/b:exists	()Z
    //   441: invokestatic 205	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   444: aastore
    //   445: invokestatic 209	com/tencent/mm/sdk/platformtools/x:v	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   448: aload 6
    //   450: invokevirtual 38	com/tencent/mm/vfs/b:exists	()Z
    //   453: ifeq +156 -> 609
    //   456: aload 6
    //   458: invokevirtual 213	com/tencent/mm/vfs/b:length	()J
    //   461: lstore_2
    //   462: aload 8
    //   464: getfield 216	com/tencent/mm/protocal/c/vx:rzJ	J
    //   467: lstore 4
    //   469: lload 4
    //   471: lload_2
    //   472: lsub
    //   473: invokestatic 222	java/lang/Math:abs	(J)J
    //   476: ldc2_w 223
    //   479: lcmp
    //   480: ifle +127 -> 607
    //   483: aload 6
    //   485: getfield 228	com/tencent/mm/vfs/b:aMJ	Landroid/net/Uri;
    //   488: invokestatic 232	com/tencent/mm/vfs/d:o	(Landroid/net/Uri;)Ljava/io/InputStream;
    //   491: astore_1
    //   492: aload_1
    //   493: sipush 4096
    //   496: invokestatic 237	com/tencent/mm/a/g:b	(Ljava/io/InputStream;I)Ljava/lang/String;
    //   499: astore 7
    //   501: aload 7
    //   503: astore 6
    //   505: aload_1
    //   506: ifnull +11 -> 517
    //   509: aload_1
    //   510: invokevirtual 242	java/io/InputStream:close	()V
    //   513: aload 7
    //   515: astore 6
    //   517: ldc 60
    //   519: ldc -12
    //   521: iconst_4
    //   522: anewarray 4	java/lang/Object
    //   525: dup
    //   526: iconst_0
    //   527: lload_2
    //   528: invokestatic 190	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   531: aastore
    //   532: dup
    //   533: iconst_1
    //   534: aload 6
    //   536: aastore
    //   537: dup
    //   538: iconst_2
    //   539: lload 4
    //   541: invokestatic 190	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   544: aastore
    //   545: dup
    //   546: iconst_3
    //   547: aload 8
    //   549: getfield 247	com/tencent/mm/protocal/c/vx:rzF	Ljava/lang/String;
    //   552: aastore
    //   553: invokestatic 249	com/tencent/mm/sdk/platformtools/x:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   556: iconst_1
    //   557: ireturn
    //   558: astore_1
    //   559: aconst_null
    //   560: astore_1
    //   561: aconst_null
    //   562: astore 7
    //   564: aload 7
    //   566: astore 6
    //   568: aload_1
    //   569: ifnull -52 -> 517
    //   572: aload_1
    //   573: invokevirtual 242	java/io/InputStream:close	()V
    //   576: aload 7
    //   578: astore 6
    //   580: goto -63 -> 517
    //   583: astore_1
    //   584: aload 7
    //   586: astore 6
    //   588: goto -71 -> 517
    //   591: astore_1
    //   592: aconst_null
    //   593: astore 6
    //   595: aload 6
    //   597: ifnull +8 -> 605
    //   600: aload 6
    //   602: invokevirtual 242	java/io/InputStream:close	()V
    //   605: aload_1
    //   606: athrow
    //   607: iconst_0
    //   608: ireturn
    //   609: iconst_1
    //   610: ireturn
    //   611: aload_1
    //   612: invokestatic 118	com/tencent/mm/plugin/fav/a/b:c	(Lcom/tencent/mm/plugin/fav/a/g;)Lcom/tencent/mm/protocal/c/vx;
    //   615: astore_1
    //   616: new 25	com/tencent/mm/vfs/b
    //   619: dup
    //   620: aload_1
    //   621: invokestatic 31	com/tencent/mm/plugin/fav/a/b:b	(Lcom/tencent/mm/protocal/c/vx;)Ljava/lang/String;
    //   624: invokespecial 34	com/tencent/mm/vfs/b:<init>	(Ljava/lang/String;)V
    //   627: invokevirtual 38	com/tencent/mm/vfs/b:exists	()Z
    //   630: ifeq +5 -> 635
    //   633: iconst_0
    //   634: ireturn
    //   635: aload_1
    //   636: getfield 72	com/tencent/mm/protocal/c/vx:rzv	Ljava/lang/String;
    //   639: invokestatic 76	com/tencent/mm/sdk/platformtools/bi:oW	(Ljava/lang/String;)Z
    //   642: ireturn
    //   643: aload_1
    //   644: getfield 128	com/tencent/mm/plugin/fav/a/g:field_favProto	Lcom/tencent/mm/protocal/c/wl;
    //   647: getfield 253	com/tencent/mm/protocal/c/wl:rAL	Lcom/tencent/mm/protocal/c/we;
    //   650: ifnonnull +5 -> 655
    //   653: iconst_1
    //   654: ireturn
    //   655: iconst_0
    //   656: ireturn
    //   657: aload_1
    //   658: invokestatic 118	com/tencent/mm/plugin/fav/a/b:c	(Lcom/tencent/mm/plugin/fav/a/g;)Lcom/tencent/mm/protocal/c/vx;
    //   661: astore_1
    //   662: aload_1
    //   663: getfield 72	com/tencent/mm/protocal/c/vx:rzv	Ljava/lang/String;
    //   666: invokestatic 76	com/tencent/mm/sdk/platformtools/bi:oW	(Ljava/lang/String;)Z
    //   669: ifeq +35 -> 704
    //   672: aload_1
    //   673: getfield 79	com/tencent/mm/protocal/c/vx:rzx	Ljava/lang/String;
    //   676: invokestatic 76	com/tencent/mm/sdk/platformtools/bi:oW	(Ljava/lang/String;)Z
    //   679: ifeq +25 -> 704
    //   682: aload_1
    //   683: getfield 82	com/tencent/mm/protocal/c/vx:rzz	Ljava/lang/String;
    //   686: invokestatic 76	com/tencent/mm/sdk/platformtools/bi:oW	(Ljava/lang/String;)Z
    //   689: ifeq +15 -> 704
    //   692: aload_1
    //   693: getfield 82	com/tencent/mm/protocal/c/vx:rzz	Ljava/lang/String;
    //   696: invokestatic 76	com/tencent/mm/sdk/platformtools/bi:oW	(Ljava/lang/String;)Z
    //   699: ifeq +5 -> 704
    //   702: iconst_1
    //   703: ireturn
    //   704: iconst_0
    //   705: ireturn
    //   706: aload_1
    //   707: getfield 128	com/tencent/mm/plugin/fav/a/g:field_favProto	Lcom/tencent/mm/protocal/c/wl;
    //   710: getfield 257	com/tencent/mm/protocal/c/wl:rBG	Lcom/tencent/mm/protocal/c/wr;
    //   713: astore 7
    //   715: aload_1
    //   716: getfield 128	com/tencent/mm/plugin/fav/a/g:field_favProto	Lcom/tencent/mm/protocal/c/wl;
    //   719: getfield 261	com/tencent/mm/protocal/c/wl:rAN	Lcom/tencent/mm/protocal/c/xa;
    //   722: astore 6
    //   724: aconst_null
    //   725: astore_1
    //   726: aload 6
    //   728: ifnull +9 -> 737
    //   731: aload 6
    //   733: getfield 266	com/tencent/mm/protocal/c/xa:rCn	Ljava/lang/String;
    //   736: astore_1
    //   737: aload_1
    //   738: astore 6
    //   740: aload 7
    //   742: ifnull +20 -> 762
    //   745: aload_1
    //   746: astore 6
    //   748: aload_1
    //   749: invokestatic 76	com/tencent/mm/sdk/platformtools/bi:oW	(Ljava/lang/String;)Z
    //   752: ifeq +10 -> 762
    //   755: aload 7
    //   757: getfield 271	com/tencent/mm/protocal/c/wr:egr	Ljava/lang/String;
    //   760: astore 6
    //   762: aload 6
    //   764: invokestatic 76	com/tencent/mm/sdk/platformtools/bi:oW	(Ljava/lang/String;)Z
    //   767: ireturn
    //   768: aload_1
    //   769: getfield 128	com/tencent/mm/plugin/fav/a/g:field_favProto	Lcom/tencent/mm/protocal/c/wl;
    //   772: getfield 275	com/tencent/mm/protocal/c/wl:rAP	Lcom/tencent/mm/protocal/c/wk;
    //   775: astore_1
    //   776: aload_1
    //   777: ifnull +13 -> 790
    //   780: aload_1
    //   781: getfield 280	com/tencent/mm/protocal/c/wk:info	Ljava/lang/String;
    //   784: invokestatic 76	com/tencent/mm/sdk/platformtools/bi:oW	(Ljava/lang/String;)Z
    //   787: ifeq +5 -> 792
    //   790: iconst_1
    //   791: ireturn
    //   792: iconst_0
    //   793: ireturn
    //   794: aload_1
    //   795: getfield 128	com/tencent/mm/plugin/fav/a/g:field_favProto	Lcom/tencent/mm/protocal/c/wl;
    //   798: getfield 284	com/tencent/mm/protocal/c/wl:rAR	Lcom/tencent/mm/protocal/c/wu;
    //   801: astore_1
    //   802: aload_1
    //   803: ifnull +13 -> 816
    //   806: aload_1
    //   807: getfield 287	com/tencent/mm/protocal/c/wu:info	Ljava/lang/String;
    //   810: invokestatic 76	com/tencent/mm/sdk/platformtools/bi:oW	(Ljava/lang/String;)Z
    //   813: ifeq +5 -> 818
    //   816: iconst_1
    //   817: ireturn
    //   818: iconst_0
    //   819: ireturn
    //   820: aload_1
    //   821: getfield 128	com/tencent/mm/plugin/fav/a/g:field_favProto	Lcom/tencent/mm/protocal/c/wl;
    //   824: getfield 275	com/tencent/mm/protocal/c/wl:rAP	Lcom/tencent/mm/protocal/c/wk;
    //   827: astore_1
    //   828: aload_1
    //   829: ifnull +13 -> 842
    //   832: aload_1
    //   833: getfield 280	com/tencent/mm/protocal/c/wk:info	Ljava/lang/String;
    //   836: invokestatic 76	com/tencent/mm/sdk/platformtools/bi:oW	(Ljava/lang/String;)Z
    //   839: ifeq +5 -> 844
    //   842: iconst_1
    //   843: ireturn
    //   844: iconst_0
    //   845: ireturn
    //   846: aload_0
    //   847: getfield 14	com/tencent/mm/plugin/fav/a/k:iWc	Z
    //   850: ifeq +5 -> 855
    //   853: iconst_1
    //   854: ireturn
    //   855: iconst_0
    //   856: ireturn
    //   857: astore_1
    //   858: aload 7
    //   860: astore 6
    //   862: goto -345 -> 517
    //   865: astore 6
    //   867: goto -262 -> 605
    //   870: astore 6
    //   872: aload_1
    //   873: astore 7
    //   875: aload 6
    //   877: astore_1
    //   878: aload 7
    //   880: astore 6
    //   882: goto -287 -> 595
    //   885: astore 6
    //   887: goto -326 -> 561
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	890	0	this	k
    //   0	890	1	paramg	g
    //   461	67	2	l1	long
    //   467	73	4	l2	long
    //   37	824	6	localObject1	Object
    //   865	1	6	localIOException1	java.io.IOException
    //   870	6	6	localObject2	Object
    //   880	1	6	localObject3	Object
    //   885	1	6	localIOException2	java.io.IOException
    //   499	380	7	localObject4	Object
    //   379	169	8	localvx	vx
    // Exception table:
    //   from	to	target	type
    //   483	492	558	java/io/IOException
    //   572	576	583	java/io/IOException
    //   483	492	591	finally
    //   509	513	857	java/io/IOException
    //   600	605	865	java/io/IOException
    //   492	501	870	finally
    //   492	501	885	java/io/IOException
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/fav/a/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */