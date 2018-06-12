package com.tencent.mm.plugin.wenote.a;

import com.tencent.mm.plugin.fav.a.p;
import com.tencent.mm.sdk.platformtools.x;

public final class c
  implements p, com.tencent.mm.plugin.record.a.c
{
  /* Error */
  private static void a(com.tencent.mm.plugin.wenote.model.e parame)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_2
    //   2: invokestatic 23	com/tencent/mm/plugin/wenote/model/c:bZb	()Lcom/tencent/mm/plugin/wenote/model/c;
    //   5: getfield 27	com/tencent/mm/plugin/wenote/model/c:qnC	Lcom/tencent/mm/plugin/wenote/model/d;
    //   8: astore 6
    //   10: aload 6
    //   12: ifnonnull +4 -> 16
    //   15: return
    //   16: aload_0
    //   17: getfield 33	com/tencent/mm/plugin/wenote/model/e:field_status	I
    //   20: iconst_3
    //   21: if_icmpeq +11 -> 32
    //   24: aload_0
    //   25: getfield 33	com/tencent/mm/plugin/wenote/model/e:field_status	I
    //   28: iconst_2
    //   29: if_icmpne +160 -> 189
    //   32: iconst_1
    //   33: istore_1
    //   34: iload_1
    //   35: ifeq -20 -> 15
    //   38: aload_0
    //   39: getfield 37	com/tencent/mm/plugin/wenote/model/e:field_path	Ljava/lang/String;
    //   42: invokestatic 43	com/tencent/mm/a/e:cn	(Ljava/lang/String;)Z
    //   45: ifeq -30 -> 15
    //   48: aload 6
    //   50: getfield 49	com/tencent/mm/plugin/wenote/model/d:qnH	Ljava/util/HashMap;
    //   53: aload_0
    //   54: getfield 52	com/tencent/mm/plugin/wenote/model/e:field_dataId	Ljava/lang/String;
    //   57: invokevirtual 58	java/util/HashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   60: checkcast 60	java/lang/String
    //   63: astore 7
    //   65: aload 7
    //   67: invokestatic 65	com/tencent/mm/sdk/platformtools/bi:oW	(Ljava/lang/String;)Z
    //   70: ifne -55 -> 15
    //   73: ldc 67
    //   75: ldc 69
    //   77: iconst_1
    //   78: anewarray 4	java/lang/Object
    //   81: dup
    //   82: iconst_0
    //   83: aload 7
    //   85: aastore
    //   86: invokestatic 75	com/tencent/mm/sdk/platformtools/x:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   89: aload_0
    //   90: getfield 52	com/tencent/mm/plugin/wenote/model/e:field_dataId	Ljava/lang/String;
    //   93: ldc 77
    //   95: invokevirtual 80	java/lang/String:endsWith	(Ljava/lang/String;)Z
    //   98: ifeq +96 -> 194
    //   101: aload 6
    //   103: getfield 83	com/tencent/mm/plugin/wenote/model/d:qnI	Ljava/util/HashMap;
    //   106: aload 7
    //   108: invokevirtual 58	java/util/HashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   111: ifnull +83 -> 194
    //   114: aload 6
    //   116: getfield 83	com/tencent/mm/plugin/wenote/model/d:qnI	Ljava/util/HashMap;
    //   119: aload 7
    //   121: invokevirtual 58	java/util/HashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   124: checkcast 85	com/tencent/mm/plugin/wenote/model/a/n
    //   127: invokevirtual 89	com/tencent/mm/plugin/wenote/model/a/n:getType	()I
    //   130: iconst_2
    //   131: if_icmpne +23 -> 154
    //   134: aload 6
    //   136: getfield 83	com/tencent/mm/plugin/wenote/model/d:qnI	Ljava/util/HashMap;
    //   139: aload 7
    //   141: invokevirtual 58	java/util/HashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   144: checkcast 85	com/tencent/mm/plugin/wenote/model/a/n
    //   147: aload_0
    //   148: getfield 37	com/tencent/mm/plugin/wenote/model/e:field_path	Ljava/lang/String;
    //   151: putfield 92	com/tencent/mm/plugin/wenote/model/a/n:bVd	Ljava/lang/String;
    //   154: invokestatic 98	com/tencent/mm/plugin/wenote/model/nativenote/manager/c:bZD	()Lcom/tencent/mm/plugin/wenote/model/nativenote/manager/c;
    //   157: aload 7
    //   159: aload 6
    //   161: getfield 83	com/tencent/mm/plugin/wenote/model/d:qnI	Ljava/util/HashMap;
    //   164: aload 7
    //   166: invokevirtual 58	java/util/HashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   169: checkcast 100	com/tencent/mm/plugin/wenote/model/a/b
    //   172: invokevirtual 103	com/tencent/mm/plugin/wenote/model/nativenote/manager/c:a	(Ljava/lang/String;Lcom/tencent/mm/plugin/wenote/model/a/b;)V
    //   175: aload 6
    //   177: getfield 49	com/tencent/mm/plugin/wenote/model/d:qnH	Ljava/util/HashMap;
    //   180: aload_0
    //   181: getfield 52	com/tencent/mm/plugin/wenote/model/e:field_dataId	Ljava/lang/String;
    //   184: invokevirtual 106	java/util/HashMap:remove	(Ljava/lang/Object;)Ljava/lang/Object;
    //   187: pop
    //   188: return
    //   189: iconst_0
    //   190: istore_1
    //   191: goto -157 -> 34
    //   194: aload 7
    //   196: ldc 108
    //   198: invokevirtual 112	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   201: ifne +608 -> 809
    //   204: aload 6
    //   206: getfield 49	com/tencent/mm/plugin/wenote/model/d:qnH	Ljava/util/HashMap;
    //   209: ldc 108
    //   211: invokevirtual 115	java/util/HashMap:containsValue	(Ljava/lang/Object;)Z
    //   214: ifne +319 -> 533
    //   217: new 117	com/tencent/mm/g/a/kq
    //   220: dup
    //   221: invokespecial 118	com/tencent/mm/g/a/kq:<init>	()V
    //   224: astore 5
    //   226: aload 5
    //   228: getfield 122	com/tencent/mm/g/a/kq:bVa	Lcom/tencent/mm/g/a/kq$a;
    //   231: aload 7
    //   233: putfield 127	com/tencent/mm/g/a/kq$a:bUR	Ljava/lang/String;
    //   236: aload 5
    //   238: getfield 122	com/tencent/mm/g/a/kq:bVa	Lcom/tencent/mm/g/a/kq$a;
    //   241: aload_0
    //   242: getfield 37	com/tencent/mm/plugin/wenote/model/e:field_path	Ljava/lang/String;
    //   245: putfield 128	com/tencent/mm/g/a/kq$a:bVd	Ljava/lang/String;
    //   248: aload 5
    //   250: getfield 122	com/tencent/mm/g/a/kq:bVa	Lcom/tencent/mm/g/a/kq$a;
    //   253: iconst_1
    //   254: putfield 131	com/tencent/mm/g/a/kq$a:type	I
    //   257: aload 5
    //   259: getfield 122	com/tencent/mm/g/a/kq:bVa	Lcom/tencent/mm/g/a/kq$a;
    //   262: aload 6
    //   264: getfield 83	com/tencent/mm/plugin/wenote/model/d:qnI	Ljava/util/HashMap;
    //   267: aload 7
    //   269: invokevirtual 58	java/util/HashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   272: checkcast 85	com/tencent/mm/plugin/wenote/model/a/n
    //   275: getfield 132	com/tencent/mm/plugin/wenote/model/a/n:type	I
    //   278: putfield 135	com/tencent/mm/g/a/kq$a:bUV	I
    //   281: aload 5
    //   283: getfield 122	com/tencent/mm/g/a/kq:bVa	Lcom/tencent/mm/g/a/kq$a;
    //   286: getfield 135	com/tencent/mm/g/a/kq$a:bUV	I
    //   289: iconst_4
    //   290: if_icmpeq +55 -> 345
    //   293: aload 6
    //   295: getfield 83	com/tencent/mm/plugin/wenote/model/d:qnI	Ljava/util/HashMap;
    //   298: aload 7
    //   300: invokevirtual 58	java/util/HashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   303: checkcast 85	com/tencent/mm/plugin/wenote/model/a/n
    //   306: astore 8
    //   308: aload 5
    //   310: getfield 122	com/tencent/mm/g/a/kq:bVa	Lcom/tencent/mm/g/a/kq$a;
    //   313: getfield 135	com/tencent/mm/g/a/kq$a:bUV	I
    //   316: iconst_2
    //   317: if_icmpeq +191 -> 508
    //   320: aload 8
    //   322: aload_0
    //   323: getfield 37	com/tencent/mm/plugin/wenote/model/e:field_path	Ljava/lang/String;
    //   326: putfield 92	com/tencent/mm/plugin/wenote/model/a/n:bVd	Ljava/lang/String;
    //   329: aload 8
    //   331: iconst_1
    //   332: putfield 139	com/tencent/mm/plugin/wenote/model/a/n:qpd	Z
    //   335: invokestatic 98	com/tencent/mm/plugin/wenote/model/nativenote/manager/c:bZD	()Lcom/tencent/mm/plugin/wenote/model/nativenote/manager/c;
    //   338: aload 7
    //   340: aload 8
    //   342: invokevirtual 103	com/tencent/mm/plugin/wenote/model/nativenote/manager/c:a	(Ljava/lang/String;Lcom/tencent/mm/plugin/wenote/model/a/b;)V
    //   345: iconst_5
    //   346: aload 5
    //   348: getfield 122	com/tencent/mm/g/a/kq:bVa	Lcom/tencent/mm/g/a/kq$a;
    //   351: getfield 135	com/tencent/mm/g/a/kq$a:bUV	I
    //   354: if_icmpeq -339 -> 15
    //   357: aload 5
    //   359: getfield 122	com/tencent/mm/g/a/kq:bVa	Lcom/tencent/mm/g/a/kq$a;
    //   362: getfield 135	com/tencent/mm/g/a/kq$a:bUV	I
    //   365: iconst_4
    //   366: if_icmpne +95 -> 461
    //   369: aload 6
    //   371: aload_0
    //   372: getfield 52	com/tencent/mm/plugin/wenote/model/e:field_dataId	Ljava/lang/String;
    //   375: invokevirtual 143	com/tencent/mm/plugin/wenote/model/d:Se	(Ljava/lang/String;)Lcom/tencent/mm/protocal/c/vx;
    //   378: astore 8
    //   380: aload 8
    //   382: ifnonnull +142 -> 524
    //   385: ldc 67
    //   387: ldc -111
    //   389: invokestatic 149	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   392: iconst_0
    //   393: istore_1
    //   394: aload 5
    //   396: getfield 122	com/tencent/mm/g/a/kq:bVa	Lcom/tencent/mm/g/a/kq$a;
    //   399: iload_1
    //   400: putfield 152	com/tencent/mm/g/a/kq$a:bOT	I
    //   403: aload 6
    //   405: getfield 83	com/tencent/mm/plugin/wenote/model/d:qnI	Ljava/util/HashMap;
    //   408: aload 7
    //   410: invokevirtual 58	java/util/HashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   413: checkcast 85	com/tencent/mm/plugin/wenote/model/a/n
    //   416: aload_0
    //   417: getfield 37	com/tencent/mm/plugin/wenote/model/e:field_path	Ljava/lang/String;
    //   420: putfield 92	com/tencent/mm/plugin/wenote/model/a/n:bVd	Ljava/lang/String;
    //   423: aload 6
    //   425: getfield 83	com/tencent/mm/plugin/wenote/model/d:qnI	Ljava/util/HashMap;
    //   428: aload 7
    //   430: invokevirtual 58	java/util/HashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   433: checkcast 85	com/tencent/mm/plugin/wenote/model/a/n
    //   436: iconst_1
    //   437: putfield 139	com/tencent/mm/plugin/wenote/model/a/n:qpd	Z
    //   440: invokestatic 98	com/tencent/mm/plugin/wenote/model/nativenote/manager/c:bZD	()Lcom/tencent/mm/plugin/wenote/model/nativenote/manager/c;
    //   443: aload 7
    //   445: aload 6
    //   447: getfield 83	com/tencent/mm/plugin/wenote/model/d:qnI	Ljava/util/HashMap;
    //   450: aload 7
    //   452: invokevirtual 58	java/util/HashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   455: checkcast 100	com/tencent/mm/plugin/wenote/model/a/b
    //   458: invokevirtual 103	com/tencent/mm/plugin/wenote/model/nativenote/manager/c:a	(Ljava/lang/String;Lcom/tencent/mm/plugin/wenote/model/a/b;)V
    //   461: ldc 67
    //   463: ldc -102
    //   465: iconst_2
    //   466: anewarray 4	java/lang/Object
    //   469: dup
    //   470: iconst_0
    //   471: aload 5
    //   473: getfield 122	com/tencent/mm/g/a/kq:bVa	Lcom/tencent/mm/g/a/kq$a;
    //   476: getfield 127	com/tencent/mm/g/a/kq$a:bUR	Ljava/lang/String;
    //   479: aastore
    //   480: dup
    //   481: iconst_1
    //   482: aload 5
    //   484: getfield 122	com/tencent/mm/g/a/kq:bVa	Lcom/tencent/mm/g/a/kq$a;
    //   487: getfield 128	com/tencent/mm/g/a/kq$a:bVd	Ljava/lang/String;
    //   490: aastore
    //   491: invokestatic 157	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   494: aload 6
    //   496: getfield 49	com/tencent/mm/plugin/wenote/model/d:qnH	Ljava/util/HashMap;
    //   499: aload_0
    //   500: getfield 52	com/tencent/mm/plugin/wenote/model/e:field_dataId	Ljava/lang/String;
    //   503: invokevirtual 106	java/util/HashMap:remove	(Ljava/lang/Object;)Ljava/lang/Object;
    //   506: pop
    //   507: return
    //   508: aload_0
    //   509: getfield 37	com/tencent/mm/plugin/wenote/model/e:field_path	Ljava/lang/String;
    //   512: aload 8
    //   514: getfield 92	com/tencent/mm/plugin/wenote/model/a/n:bVd	Ljava/lang/String;
    //   517: invokestatic 163	com/tencent/mm/plugin/wenote/b/c:fx	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   520: pop
    //   521: goto -192 -> 329
    //   524: aload 8
    //   526: getfield 168	com/tencent/mm/protocal/c/vx:duration	I
    //   529: istore_1
    //   530: goto -136 -> 394
    //   533: aload 6
    //   535: getfield 172	com/tencent/mm/plugin/wenote/model/d:qnE	Lcom/tencent/mm/plugin/wenote/model/a/l;
    //   538: getfield 178	com/tencent/mm/plugin/wenote/model/a/l:bVe	J
    //   541: ldc2_w 179
    //   544: lcmp
    //   545: ifne +180 -> 725
    //   548: aload 6
    //   550: getfield 183	com/tencent/mm/plugin/wenote/model/d:qnG	Ljava/util/HashMap;
    //   553: aload 6
    //   555: getfield 172	com/tencent/mm/plugin/wenote/model/d:qnE	Lcom/tencent/mm/plugin/wenote/model/a/l;
    //   558: getfield 186	com/tencent/mm/plugin/wenote/model/a/l:bJC	J
    //   561: invokestatic 192	java/lang/Long:toString	(J)Ljava/lang/String;
    //   564: invokevirtual 58	java/util/HashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   567: checkcast 194	com/tencent/mm/plugin/wenote/model/a/v
    //   570: astore 5
    //   572: aload 5
    //   574: ifnull -559 -> 15
    //   577: aload 5
    //   579: getfield 198	com/tencent/mm/plugin/wenote/model/a/v:qpv	Ljava/util/ArrayList;
    //   582: ifnull -567 -> 15
    //   585: aload 5
    //   587: getfield 198	com/tencent/mm/plugin/wenote/model/a/v:qpv	Ljava/util/ArrayList;
    //   590: invokevirtual 204	java/util/ArrayList:iterator	()Ljava/util/Iterator;
    //   593: astore 8
    //   595: aload 8
    //   597: invokeinterface 210 1 0
    //   602: ifeq -108 -> 494
    //   605: aload 8
    //   607: invokeinterface 214 1 0
    //   612: checkcast 85	com/tencent/mm/plugin/wenote/model/a/n
    //   615: astore 5
    //   617: aload 5
    //   619: getfield 217	com/tencent/mm/plugin/wenote/model/a/n:qpc	Ljava/lang/String;
    //   622: aload 7
    //   624: invokevirtual 112	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   627: ifeq -32 -> 595
    //   630: aload 5
    //   632: iconst_1
    //   633: putfield 139	com/tencent/mm/plugin/wenote/model/a/n:qpd	Z
    //   636: aload 5
    //   638: getfield 132	com/tencent/mm/plugin/wenote/model/a/n:type	I
    //   641: iconst_4
    //   642: if_icmpne +119 -> 761
    //   645: aload 5
    //   647: checkcast 219	com/tencent/mm/plugin/wenote/model/a/u
    //   650: astore 8
    //   652: aload 8
    //   654: getstatic 222	com/tencent/mm/plugin/wenote/model/d:qnQ	Ljava/lang/String;
    //   657: putfield 225	com/tencent/mm/plugin/wenote/model/a/u:fTs	Ljava/lang/String;
    //   660: aload 6
    //   662: aload_0
    //   663: getfield 52	com/tencent/mm/plugin/wenote/model/e:field_dataId	Ljava/lang/String;
    //   666: invokevirtual 143	com/tencent/mm/plugin/wenote/model/d:Se	(Ljava/lang/String;)Lcom/tencent/mm/protocal/c/vx;
    //   669: astore 9
    //   671: aload 9
    //   673: ifnonnull +79 -> 752
    //   676: ldc 67
    //   678: ldc -111
    //   680: invokestatic 149	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   683: iload_2
    //   684: istore_1
    //   685: aload 8
    //   687: iload_1
    //   688: i2l
    //   689: invokestatic 231	com/tencent/mm/plugin/wenote/model/f:bD	(J)F
    //   692: f2i
    //   693: putfield 234	com/tencent/mm/plugin/wenote/model/a/u:length	I
    //   696: aload 8
    //   698: invokestatic 240	com/tencent/mm/sdk/platformtools/ad:getContext	()Landroid/content/Context;
    //   701: aload 8
    //   703: getfield 234	com/tencent/mm/plugin/wenote/model/a/u:length	I
    //   706: invokestatic 244	com/tencent/mm/plugin/wenote/model/f:C	(Landroid/content/Context;I)Ljava/lang/String;
    //   709: putfield 247	com/tencent/mm/plugin/wenote/model/a/u:qps	Ljava/lang/String;
    //   712: invokestatic 98	com/tencent/mm/plugin/wenote/model/nativenote/manager/c:bZD	()Lcom/tencent/mm/plugin/wenote/model/nativenote/manager/c;
    //   715: aload 7
    //   717: aload 5
    //   719: invokevirtual 103	com/tencent/mm/plugin/wenote/model/nativenote/manager/c:a	(Ljava/lang/String;Lcom/tencent/mm/plugin/wenote/model/a/b;)V
    //   722: goto -228 -> 494
    //   725: aload 6
    //   727: getfield 183	com/tencent/mm/plugin/wenote/model/d:qnG	Ljava/util/HashMap;
    //   730: aload 6
    //   732: getfield 172	com/tencent/mm/plugin/wenote/model/d:qnE	Lcom/tencent/mm/plugin/wenote/model/a/l;
    //   735: getfield 178	com/tencent/mm/plugin/wenote/model/a/l:bVe	J
    //   738: invokestatic 192	java/lang/Long:toString	(J)Ljava/lang/String;
    //   741: invokevirtual 58	java/util/HashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   744: checkcast 194	com/tencent/mm/plugin/wenote/model/a/v
    //   747: astore 5
    //   749: goto -177 -> 572
    //   752: aload 9
    //   754: getfield 168	com/tencent/mm/protocal/c/vx:duration	I
    //   757: istore_1
    //   758: goto -73 -> 685
    //   761: aload 5
    //   763: invokevirtual 89	com/tencent/mm/plugin/wenote/model/a/n:getType	()I
    //   766: iconst_2
    //   767: if_icmpne +30 -> 797
    //   770: aload_0
    //   771: getfield 37	com/tencent/mm/plugin/wenote/model/e:field_path	Ljava/lang/String;
    //   774: aload 6
    //   776: getfield 83	com/tencent/mm/plugin/wenote/model/d:qnI	Ljava/util/HashMap;
    //   779: aload 7
    //   781: invokevirtual 58	java/util/HashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   784: checkcast 85	com/tencent/mm/plugin/wenote/model/a/n
    //   787: getfield 92	com/tencent/mm/plugin/wenote/model/a/n:bVd	Ljava/lang/String;
    //   790: invokestatic 163	com/tencent/mm/plugin/wenote/b/c:fx	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   793: pop
    //   794: goto -82 -> 712
    //   797: aload 5
    //   799: aload_0
    //   800: getfield 37	com/tencent/mm/plugin/wenote/model/e:field_path	Ljava/lang/String;
    //   803: putfield 92	com/tencent/mm/plugin/wenote/model/a/n:bVd	Ljava/lang/String;
    //   806: goto -94 -> 712
    //   809: ldc 67
    //   811: ldc -7
    //   813: invokestatic 251	com/tencent/mm/sdk/platformtools/x:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   816: aload 6
    //   818: getfield 172	com/tencent/mm/plugin/wenote/model/d:qnE	Lcom/tencent/mm/plugin/wenote/model/a/l;
    //   821: getfield 178	com/tencent/mm/plugin/wenote/model/a/l:bVe	J
    //   824: ldc2_w 179
    //   827: lcmp
    //   828: ifne +191 -> 1019
    //   831: aload 6
    //   833: getfield 183	com/tencent/mm/plugin/wenote/model/d:qnG	Ljava/util/HashMap;
    //   836: aload 6
    //   838: getfield 172	com/tencent/mm/plugin/wenote/model/d:qnE	Lcom/tencent/mm/plugin/wenote/model/a/l;
    //   841: getfield 186	com/tencent/mm/plugin/wenote/model/a/l:bJC	J
    //   844: invokestatic 192	java/lang/Long:toString	(J)Ljava/lang/String;
    //   847: invokevirtual 58	java/util/HashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   850: checkcast 194	com/tencent/mm/plugin/wenote/model/a/v
    //   853: astore 5
    //   855: aload 5
    //   857: ifnull -842 -> 15
    //   860: aload 5
    //   862: aload_0
    //   863: getfield 37	com/tencent/mm/plugin/wenote/model/e:field_path	Ljava/lang/String;
    //   866: invokestatic 255	com/tencent/mm/plugin/wenote/b/c:Sv	(Ljava/lang/String;)Ljava/lang/String;
    //   869: putfield 258	com/tencent/mm/plugin/wenote/model/a/v:qpu	Ljava/lang/String;
    //   872: invokestatic 98	com/tencent/mm/plugin/wenote/model/nativenote/manager/c:bZD	()Lcom/tencent/mm/plugin/wenote/model/nativenote/manager/c;
    //   875: astore 7
    //   877: aload 5
    //   879: getfield 258	com/tencent/mm/plugin/wenote/model/a/v:qpu	Ljava/lang/String;
    //   882: astore 5
    //   884: aload 5
    //   886: invokestatic 65	com/tencent/mm/sdk/platformtools/bi:oW	(Ljava/lang/String;)Z
    //   889: ifne -395 -> 494
    //   892: aload 7
    //   894: getfield 261	com/tencent/mm/plugin/wenote/model/nativenote/manager/c:gBc	Ljava/util/ArrayList;
    //   897: ifnull -403 -> 494
    //   900: aload 5
    //   902: invokestatic 267	com/tencent/mm/plugin/wenote/b/b:So	(Ljava/lang/String;)Ljava/util/ArrayList;
    //   905: astore 8
    //   907: aload 8
    //   909: ifnull -415 -> 494
    //   912: aload 8
    //   914: invokevirtual 270	java/util/ArrayList:size	()I
    //   917: ifle -423 -> 494
    //   920: aload 7
    //   922: monitorenter
    //   923: ldc_w 272
    //   926: ldc_w 274
    //   929: iconst_1
    //   930: anewarray 4	java/lang/Object
    //   933: dup
    //   934: iconst_0
    //   935: aload 7
    //   937: getfield 277	com/tencent/mm/plugin/wenote/model/nativenote/manager/c:qpW	Z
    //   940: invokestatic 283	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   943: aastore
    //   944: invokestatic 157	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   947: invokestatic 289	com/tencent/mm/model/au:Em	()Lcom/tencent/mm/sdk/platformtools/ah;
    //   950: astore 5
    //   952: new 291	com/tencent/mm/plugin/wenote/model/nativenote/manager/c$2
    //   955: dup
    //   956: aload 7
    //   958: aload 8
    //   960: invokespecial 294	com/tencent/mm/plugin/wenote/model/nativenote/manager/c$2:<init>	(Lcom/tencent/mm/plugin/wenote/model/nativenote/manager/c;Ljava/util/ArrayList;)V
    //   963: astore 8
    //   965: aload 7
    //   967: getfield 277	com/tencent/mm/plugin/wenote/model/nativenote/manager/c:qpW	Z
    //   970: ifeq +76 -> 1046
    //   973: ldc2_w 295
    //   976: lstore_3
    //   977: aload 5
    //   979: aload 8
    //   981: lload_3
    //   982: invokevirtual 302	com/tencent/mm/sdk/platformtools/ah:h	(Ljava/lang/Runnable;J)I
    //   985: pop
    //   986: aload 7
    //   988: monitorexit
    //   989: goto -495 -> 494
    //   992: astore 5
    //   994: aload 7
    //   996: monitorexit
    //   997: aload 5
    //   999: athrow
    //   1000: astore 5
    //   1002: ldc 67
    //   1004: aload 5
    //   1006: ldc_w 304
    //   1009: iconst_0
    //   1010: anewarray 4	java/lang/Object
    //   1013: invokestatic 308	com/tencent/mm/sdk/platformtools/x:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1016: goto -522 -> 494
    //   1019: aload 6
    //   1021: getfield 183	com/tencent/mm/plugin/wenote/model/d:qnG	Ljava/util/HashMap;
    //   1024: aload 6
    //   1026: getfield 172	com/tencent/mm/plugin/wenote/model/d:qnE	Lcom/tencent/mm/plugin/wenote/model/a/l;
    //   1029: getfield 178	com/tencent/mm/plugin/wenote/model/a/l:bVe	J
    //   1032: invokestatic 192	java/lang/Long:toString	(J)Ljava/lang/String;
    //   1035: invokevirtual 58	java/util/HashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   1038: checkcast 194	com/tencent/mm/plugin/wenote/model/a/v
    //   1041: astore 5
    //   1043: goto -188 -> 855
    //   1046: ldc2_w 309
    //   1049: lstore_3
    //   1050: goto -73 -> 977
    //   1053: astore 5
    //   1055: ldc_w 272
    //   1058: ldc_w 312
    //   1061: iconst_1
    //   1062: anewarray 4	java/lang/Object
    //   1065: dup
    //   1066: iconst_0
    //   1067: aload 5
    //   1069: invokevirtual 315	java/lang/Exception:toString	()Ljava/lang/String;
    //   1072: aastore
    //   1073: invokestatic 317	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1076: goto -90 -> 986
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	1079	0	parame	com.tencent.mm.plugin.wenote.model.e
    //   33	725	1	i	int
    //   1	683	2	j	int
    //   976	74	3	l	long
    //   224	754	5	localObject1	Object
    //   992	6	5	localObject2	Object
    //   1000	5	5	localException1	Exception
    //   1041	1	5	localv	com.tencent.mm.plugin.wenote.model.a.v
    //   1053	15	5	localException2	Exception
    //   8	1017	6	locald	com.tencent.mm.plugin.wenote.model.d
    //   63	932	7	localObject3	Object
    //   306	674	8	localObject4	Object
    //   669	84	9	localvx	com.tencent.mm.protocal.c.vx
    // Exception table:
    //   from	to	target	type
    //   923	973	992	finally
    //   977	986	992	finally
    //   986	989	992	finally
    //   994	997	992	finally
    //   1055	1076	992	finally
    //   860	907	1000	java/lang/Exception
    //   912	923	1000	java/lang/Exception
    //   997	1000	1000	java/lang/Exception
    //   923	973	1053	java/lang/Exception
    //   977	986	1053	java/lang/Exception
  }
  
  public final void a(int paramInt, com.tencent.mm.plugin.record.a.f paramf)
  {
    com.tencent.mm.plugin.wenote.model.e locale = new com.tencent.mm.plugin.wenote.model.e();
    locale.field_localId = paramf.field_localId;
    locale.field_dataId = paramf.field_dataId;
    locale.field_status = paramf.field_status;
    locale.field_offset = paramf.field_offset;
    locale.field_totalLen = paramf.field_totalLen;
    locale.field_path = paramf.field_path;
    a(locale);
  }
  
  public final void d(com.tencent.mm.plugin.fav.a.c paramc)
  {
    if (paramc.field_type != 18)
    {
      x.i("MicroMsg.Note.WNNoteFavCdnChangedListener", "Not Note CDN onCdnStatusChanged %d", new Object[] { Long.valueOf(paramc.field_favLocalId) });
      return;
    }
    if ((paramc.field_status == 3) && (com.tencent.mm.a.e.cn(paramc.field_path)) && (paramc.field_path.endsWith("..htm"))) {
      com.tencent.mm.plugin.wenote.model.f.t(paramc.field_favLocalId, paramc.field_path);
    }
    com.tencent.mm.plugin.wenote.model.e locale = new com.tencent.mm.plugin.wenote.model.e();
    locale.field_favLocalId = paramc.field_favLocalId;
    locale.field_dataId = paramc.field_dataId;
    locale.field_status = paramc.field_status;
    locale.field_offset = paramc.field_offset;
    locale.field_totalLen = paramc.field_totalLen;
    locale.field_path = paramc.field_path;
    a(locale);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/wenote/a/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */