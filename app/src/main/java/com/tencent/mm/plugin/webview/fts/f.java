package com.tencent.mm.plugin.webview.fts;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.websearch.api.a;
import com.tencent.mm.plugin.websearch.api.ad;
import com.tencent.mm.plugin.websearch.api.j;
import com.tencent.mm.plugin.websearch.api.o;
import com.tencent.mm.protocal.c.boq;
import com.tencent.mm.protocal.c.bxd;
import com.tencent.mm.protocal.c.cfo;
import com.tencent.mm.protocal.c.cfp;
import com.tencent.mm.sdk.platformtools.x;
import java.util.LinkedList;

public final class f
  extends a
  implements k
{
  private j dFC;
  private b dZf;
  private com.tencent.mm.ab.e diJ;
  private int pKO;
  private cfp pOX;
  private cfo pOY;
  private int scene;
  
  /* Error */
  public f(j paramj)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore 7
    //   3: aload_0
    //   4: invokespecial 28	com/tencent/mm/plugin/websearch/api/a:<init>	()V
    //   7: aload_0
    //   8: aload_1
    //   9: putfield 30	com/tencent/mm/plugin/webview/fts/f:dFC	Lcom/tencent/mm/plugin/websearch/api/j;
    //   12: aload_0
    //   13: aload_1
    //   14: getfield 36	com/tencent/mm/plugin/websearch/api/j:bHt	Ljava/lang/String;
    //   17: putfield 39	com/tencent/mm/plugin/webview/fts/f:pKM	Ljava/lang/String;
    //   20: aload_0
    //   21: aload_1
    //   22: getfield 42	com/tencent/mm/plugin/websearch/api/j:kJG	Ljava/lang/String;
    //   25: putfield 45	com/tencent/mm/plugin/webview/fts/f:bWs	Ljava/lang/String;
    //   28: aload_0
    //   29: aload_1
    //   30: getfield 48	com/tencent/mm/plugin/websearch/api/j:offset	I
    //   33: putfield 51	com/tencent/mm/plugin/webview/fts/f:tH	I
    //   36: aload_0
    //   37: aload_1
    //   38: getfield 53	com/tencent/mm/plugin/websearch/api/j:scene	I
    //   41: putfield 56	com/tencent/mm/plugin/webview/fts/f:fdx	I
    //   44: aload_0
    //   45: aload_1
    //   46: getfield 59	com/tencent/mm/plugin/websearch/api/j:bWo	I
    //   49: putfield 62	com/tencent/mm/plugin/webview/fts/f:pKL	I
    //   52: aload_0
    //   53: aload_1
    //   54: getfield 64	com/tencent/mm/plugin/websearch/api/j:pKO	I
    //   57: putfield 65	com/tencent/mm/plugin/webview/fts/f:pKO	I
    //   60: aload_0
    //   61: aload_1
    //   62: putfield 30	com/tencent/mm/plugin/webview/fts/f:dFC	Lcom/tencent/mm/plugin/websearch/api/j;
    //   65: aload_0
    //   66: aload_1
    //   67: getfield 69	com/tencent/mm/plugin/websearch/api/j:pLg	Landroid/os/Bundle;
    //   70: putfield 72	com/tencent/mm/plugin/webview/fts/f:pKN	Landroid/os/Bundle;
    //   73: aload_1
    //   74: getfield 36	com/tencent/mm/plugin/websearch/api/j:bHt	Ljava/lang/String;
    //   77: invokestatic 78	com/tencent/mm/sdk/platformtools/bi:oW	(Ljava/lang/String;)Z
    //   80: ifne +1044 -> 1124
    //   83: ldc 80
    //   85: ldc 82
    //   87: iconst_1
    //   88: anewarray 84	java/lang/Object
    //   91: dup
    //   92: iconst_0
    //   93: aload_1
    //   94: getfield 36	com/tencent/mm/plugin/websearch/api/j:bHt	Ljava/lang/String;
    //   97: aastore
    //   98: invokestatic 90	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   101: aload_0
    //   102: aload_1
    //   103: getfield 53	com/tencent/mm/plugin/websearch/api/j:scene	I
    //   106: putfield 91	com/tencent/mm/plugin/webview/fts/f:scene	I
    //   109: new 93	com/tencent/mm/ab/b$a
    //   112: dup
    //   113: invokespecial 94	com/tencent/mm/ab/b$a:<init>	()V
    //   116: astore 8
    //   118: aload 8
    //   120: sipush 719
    //   123: putfield 97	com/tencent/mm/ab/b$a:dIF	I
    //   126: aload 8
    //   128: ldc 99
    //   130: putfield 102	com/tencent/mm/ab/b$a:uri	Ljava/lang/String;
    //   133: aload 8
    //   135: new 104	com/tencent/mm/protocal/c/cfo
    //   138: dup
    //   139: invokespecial 105	com/tencent/mm/protocal/c/cfo:<init>	()V
    //   142: putfield 109	com/tencent/mm/ab/b$a:dIG	Lcom/tencent/mm/bk/a;
    //   145: aload 8
    //   147: new 111	com/tencent/mm/protocal/c/cfp
    //   150: dup
    //   151: invokespecial 112	com/tencent/mm/protocal/c/cfp:<init>	()V
    //   154: putfield 115	com/tencent/mm/ab/b$a:dIH	Lcom/tencent/mm/bk/a;
    //   157: aload_0
    //   158: aload 8
    //   160: invokevirtual 119	com/tencent/mm/ab/b$a:KT	()Lcom/tencent/mm/ab/b;
    //   163: putfield 121	com/tencent/mm/plugin/webview/fts/f:dZf	Lcom/tencent/mm/ab/b;
    //   166: aload_0
    //   167: aload_0
    //   168: getfield 121	com/tencent/mm/plugin/webview/fts/f:dZf	Lcom/tencent/mm/ab/b;
    //   171: getfield 127	com/tencent/mm/ab/b:dID	Lcom/tencent/mm/ab/b$b;
    //   174: getfield 132	com/tencent/mm/ab/b$b:dIL	Lcom/tencent/mm/bk/a;
    //   177: checkcast 104	com/tencent/mm/protocal/c/cfo
    //   180: putfield 134	com/tencent/mm/plugin/webview/fts/f:pOY	Lcom/tencent/mm/protocal/c/cfo;
    //   183: aload_0
    //   184: getfield 134	com/tencent/mm/plugin/webview/fts/f:pOY	Lcom/tencent/mm/protocal/c/cfo;
    //   187: aload_1
    //   188: getfield 36	com/tencent/mm/plugin/websearch/api/j:bHt	Ljava/lang/String;
    //   191: putfield 137	com/tencent/mm/protocal/c/cfo:rDH	Ljava/lang/String;
    //   194: aload_0
    //   195: getfield 134	com/tencent/mm/plugin/webview/fts/f:pOY	Lcom/tencent/mm/protocal/c/cfo;
    //   198: aload_1
    //   199: getfield 64	com/tencent/mm/plugin/websearch/api/j:pKO	I
    //   202: putfield 140	com/tencent/mm/protocal/c/cfo:shN	I
    //   205: aload_0
    //   206: getfield 134	com/tencent/mm/plugin/webview/fts/f:pOY	Lcom/tencent/mm/protocal/c/cfo;
    //   209: aload_1
    //   210: getfield 143	com/tencent/mm/plugin/websearch/api/j:iPZ	I
    //   213: i2l
    //   214: putfield 147	com/tencent/mm/protocal/c/cfo:rll	J
    //   217: aload_0
    //   218: getfield 134	com/tencent/mm/plugin/webview/fts/f:pOY	Lcom/tencent/mm/protocal/c/cfo;
    //   221: invokestatic 153	com/tencent/mm/plugin/websearch/api/p:JU	()Lcom/tencent/mm/protocal/c/aqs;
    //   224: putfield 157	com/tencent/mm/protocal/c/cfo:rUI	Lcom/tencent/mm/protocal/c/aqs;
    //   227: aload_0
    //   228: getfield 134	com/tencent/mm/plugin/webview/fts/f:pOY	Lcom/tencent/mm/protocal/c/cfo;
    //   231: aload_1
    //   232: getfield 48	com/tencent/mm/plugin/websearch/api/j:offset	I
    //   235: putfield 160	com/tencent/mm/protocal/c/cfo:rjC	I
    //   238: aload_0
    //   239: getfield 134	com/tencent/mm/plugin/webview/fts/f:pOY	Lcom/tencent/mm/protocal/c/cfo;
    //   242: iconst_0
    //   243: invokestatic 164	com/tencent/mm/plugin/websearch/api/p:zP	(I)I
    //   246: putfield 167	com/tencent/mm/protocal/c/cfo:syH	I
    //   249: aload_0
    //   250: getfield 134	com/tencent/mm/plugin/webview/fts/f:pOY	Lcom/tencent/mm/protocal/c/cfo;
    //   253: aload_1
    //   254: getfield 171	com/tencent/mm/plugin/websearch/api/j:pKP	Ljava/util/LinkedList;
    //   257: putfield 174	com/tencent/mm/protocal/c/cfo:sjr	Ljava/util/LinkedList;
    //   260: aload_0
    //   261: getfield 134	com/tencent/mm/plugin/webview/fts/f:pOY	Lcom/tencent/mm/protocal/c/cfo;
    //   264: aload_1
    //   265: getfield 53	com/tencent/mm/plugin/websearch/api/j:scene	I
    //   268: putfield 177	com/tencent/mm/protocal/c/cfo:otY	I
    //   271: aload_0
    //   272: getfield 134	com/tencent/mm/plugin/webview/fts/f:pOY	Lcom/tencent/mm/protocal/c/cfo;
    //   275: aload_1
    //   276: getfield 180	com/tencent/mm/plugin/websearch/api/j:iow	Ljava/lang/String;
    //   279: putfield 183	com/tencent/mm/protocal/c/cfo:rlo	Ljava/lang/String;
    //   282: aload_0
    //   283: getfield 134	com/tencent/mm/plugin/webview/fts/f:pOY	Lcom/tencent/mm/protocal/c/cfo;
    //   286: aload_1
    //   287: getfield 186	com/tencent/mm/plugin/websearch/api/j:pKQ	I
    //   290: putfield 189	com/tencent/mm/protocal/c/cfo:szP	I
    //   293: aload_0
    //   294: getfield 134	com/tencent/mm/plugin/webview/fts/f:pOY	Lcom/tencent/mm/protocal/c/cfo;
    //   297: aload_1
    //   298: getfield 192	com/tencent/mm/plugin/websearch/api/j:pKR	Ljava/lang/String;
    //   301: putfield 195	com/tencent/mm/protocal/c/cfo:szX	Ljava/lang/String;
    //   304: aload_0
    //   305: getfield 134	com/tencent/mm/plugin/webview/fts/f:pOY	Lcom/tencent/mm/protocal/c/cfo;
    //   308: aload_1
    //   309: getfield 198	com/tencent/mm/plugin/websearch/api/j:pKT	I
    //   312: putfield 201	com/tencent/mm/protocal/c/cfo:szZ	I
    //   315: aload_0
    //   316: getfield 134	com/tencent/mm/plugin/webview/fts/f:pOY	Lcom/tencent/mm/protocal/c/cfo;
    //   319: aload_1
    //   320: getfield 204	com/tencent/mm/plugin/websearch/api/j:pKS	Ljava/lang/String;
    //   323: putfield 207	com/tencent/mm/protocal/c/cfo:szY	Ljava/lang/String;
    //   326: aload_0
    //   327: getfield 134	com/tencent/mm/plugin/webview/fts/f:pOY	Lcom/tencent/mm/protocal/c/cfo;
    //   330: aload_1
    //   331: getfield 210	com/tencent/mm/plugin/websearch/api/j:pKU	Ljava/util/LinkedList;
    //   334: putfield 213	com/tencent/mm/protocal/c/cfo:sAa	Ljava/util/LinkedList;
    //   337: aload_0
    //   338: getfield 134	com/tencent/mm/plugin/webview/fts/f:pOY	Lcom/tencent/mm/protocal/c/cfo;
    //   341: aload_1
    //   342: getfield 216	com/tencent/mm/plugin/websearch/api/j:pKZ	Ljava/util/LinkedList;
    //   345: putfield 219	com/tencent/mm/protocal/c/cfo:szQ	Ljava/util/LinkedList;
    //   348: aload_0
    //   349: getfield 134	com/tencent/mm/plugin/webview/fts/f:pOY	Lcom/tencent/mm/protocal/c/cfo;
    //   352: aload_1
    //   353: getfield 223	com/tencent/mm/plugin/websearch/api/j:pKY	Lcom/tencent/mm/protocal/c/bsg;
    //   356: putfield 224	com/tencent/mm/protocal/c/cfo:pKY	Lcom/tencent/mm/protocal/c/bsg;
    //   359: aload_0
    //   360: getfield 134	com/tencent/mm/plugin/webview/fts/f:pOY	Lcom/tencent/mm/protocal/c/cfo;
    //   363: aload_1
    //   364: getfield 227	com/tencent/mm/plugin/websearch/api/j:pLa	Ljava/util/LinkedList;
    //   367: putfield 230	com/tencent/mm/protocal/c/cfo:sAb	Ljava/util/LinkedList;
    //   370: aload_0
    //   371: getfield 134	com/tencent/mm/plugin/webview/fts/f:pOY	Lcom/tencent/mm/protocal/c/cfo;
    //   374: aload_1
    //   375: getfield 233	com/tencent/mm/plugin/websearch/api/j:aem	Ljava/lang/String;
    //   378: putfield 236	com/tencent/mm/protocal/c/cfo:iwP	Ljava/lang/String;
    //   381: aload_0
    //   382: getfield 134	com/tencent/mm/plugin/webview/fts/f:pOY	Lcom/tencent/mm/protocal/c/cfo;
    //   385: aload_1
    //   386: getfield 239	com/tencent/mm/plugin/websearch/api/j:bJK	Ljava/lang/String;
    //   389: putfield 242	com/tencent/mm/protocal/c/cfo:syL	Ljava/lang/String;
    //   392: aload_1
    //   393: getfield 246	com/tencent/mm/plugin/websearch/api/j:pLd	Lcom/tencent/mm/protocal/c/cfk;
    //   396: ifnonnull +14 -> 410
    //   399: aload_1
    //   400: new 248	com/tencent/mm/protocal/c/cfk
    //   403: dup
    //   404: invokespecial 249	com/tencent/mm/protocal/c/cfk:<init>	()V
    //   407: putfield 246	com/tencent/mm/plugin/websearch/api/j:pLd	Lcom/tencent/mm/protocal/c/cfk;
    //   410: aload_1
    //   411: getfield 246	com/tencent/mm/plugin/websearch/api/j:pLd	Lcom/tencent/mm/protocal/c/cfk;
    //   414: getfield 253	com/tencent/mm/protocal/c/cfk:szT	Lcom/tencent/mm/protocal/c/iv;
    //   417: ifnonnull +17 -> 434
    //   420: aload_1
    //   421: getfield 246	com/tencent/mm/plugin/websearch/api/j:pLd	Lcom/tencent/mm/protocal/c/cfk;
    //   424: new 255	com/tencent/mm/protocal/c/iv
    //   427: dup
    //   428: invokespecial 256	com/tencent/mm/protocal/c/iv:<init>	()V
    //   431: putfield 253	com/tencent/mm/protocal/c/cfk:szT	Lcom/tencent/mm/protocal/c/iv;
    //   434: aload_0
    //   435: getfield 134	com/tencent/mm/plugin/webview/fts/f:pOY	Lcom/tencent/mm/protocal/c/cfo;
    //   438: getfield 157	com/tencent/mm/protocal/c/cfo:rUI	Lcom/tencent/mm/protocal/c/aqs;
    //   441: ifnull +640 -> 1081
    //   444: aload_1
    //   445: getfield 246	com/tencent/mm/plugin/websearch/api/j:pLd	Lcom/tencent/mm/protocal/c/cfk;
    //   448: getfield 253	com/tencent/mm/protocal/c/cfk:szT	Lcom/tencent/mm/protocal/c/iv;
    //   451: astore 8
    //   453: invokestatic 262	com/tencent/mm/modelgeo/c:OB	()Lcom/tencent/mm/modelgeo/c;
    //   456: astore 9
    //   458: aload 9
    //   460: getfield 265	com/tencent/mm/modelgeo/c:dSf	J
    //   463: lconst_0
    //   464: lcmp
    //   465: ifle +604 -> 1069
    //   468: aload 9
    //   470: getfield 269	com/tencent/mm/modelgeo/c:dSh	Z
    //   473: ifeq +596 -> 1069
    //   476: invokestatic 275	java/lang/System:currentTimeMillis	()J
    //   479: aload 9
    //   481: getfield 265	com/tencent/mm/modelgeo/c:dSf	J
    //   484: lsub
    //   485: ldc2_w 276
    //   488: lcmp
    //   489: ifge +580 -> 1069
    //   492: iconst_1
    //   493: istore 4
    //   495: iload 4
    //   497: ifeq +578 -> 1075
    //   500: iconst_0
    //   501: istore 4
    //   503: aload 8
    //   505: iload 4
    //   507: putfield 280	com/tencent/mm/protocal/c/iv:rkh	I
    //   510: aload_0
    //   511: getfield 134	com/tencent/mm/plugin/webview/fts/f:pOY	Lcom/tencent/mm/protocal/c/cfo;
    //   514: getfield 157	com/tencent/mm/protocal/c/cfo:rUI	Lcom/tencent/mm/protocal/c/aqs;
    //   517: getfield 286	com/tencent/mm/protocal/c/aqs:rmr	F
    //   520: fstore_3
    //   521: aload_0
    //   522: getfield 134	com/tencent/mm/plugin/webview/fts/f:pOY	Lcom/tencent/mm/protocal/c/cfo;
    //   525: getfield 157	com/tencent/mm/protocal/c/cfo:rUI	Lcom/tencent/mm/protocal/c/aqs;
    //   528: getfield 289	com/tencent/mm/protocal/c/aqs:rms	F
    //   531: fstore_2
    //   532: ldc 80
    //   534: ldc_w 291
    //   537: iconst_3
    //   538: anewarray 84	java/lang/Object
    //   541: dup
    //   542: iconst_0
    //   543: fload_3
    //   544: invokestatic 297	java/lang/Float:valueOf	(F)Ljava/lang/Float;
    //   547: aastore
    //   548: dup
    //   549: iconst_1
    //   550: fload_2
    //   551: invokestatic 297	java/lang/Float:valueOf	(F)Ljava/lang/Float;
    //   554: aastore
    //   555: dup
    //   556: iconst_2
    //   557: aload_1
    //   558: getfield 246	com/tencent/mm/plugin/websearch/api/j:pLd	Lcom/tencent/mm/protocal/c/cfk;
    //   561: getfield 253	com/tencent/mm/protocal/c/cfk:szT	Lcom/tencent/mm/protocal/c/iv;
    //   564: getfield 280	com/tencent/mm/protocal/c/iv:rkh	I
    //   567: invokestatic 302	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   570: aastore
    //   571: invokestatic 90	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   574: aload_1
    //   575: getfield 305	com/tencent/mm/plugin/websearch/api/j:pLe	Ljava/lang/String;
    //   578: invokestatic 311	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   581: ifne +148 -> 729
    //   584: aload_1
    //   585: getfield 305	com/tencent/mm/plugin/websearch/api/j:pLe	Ljava/lang/String;
    //   588: invokestatic 317	java/net/URLDecoder:decode	(Ljava/lang/String;)Ljava/lang/String;
    //   591: astore 8
    //   593: new 319	org/json/JSONObject
    //   596: dup
    //   597: aload 8
    //   599: invokespecial 322	org/json/JSONObject:<init>	(Ljava/lang/String;)V
    //   602: astore 8
    //   604: new 324	com/tencent/mm/protocal/c/bbb
    //   607: dup
    //   608: invokespecial 325	com/tencent/mm/protocal/c/bbb:<init>	()V
    //   611: astore 9
    //   613: aload 9
    //   615: aload 8
    //   617: ldc_w 327
    //   620: invokevirtual 330	org/json/JSONObject:optString	(Ljava/lang/String;)Ljava/lang/String;
    //   623: putfield 333	com/tencent/mm/protocal/c/bbb:eJJ	Ljava/lang/String;
    //   626: aload 9
    //   628: aload 8
    //   630: ldc_w 335
    //   633: invokevirtual 330	org/json/JSONObject:optString	(Ljava/lang/String;)Ljava/lang/String;
    //   636: putfield 338	com/tencent/mm/protocal/c/bbb:eJQ	Ljava/lang/String;
    //   639: aload 9
    //   641: aload 8
    //   643: ldc_w 340
    //   646: invokevirtual 344	org/json/JSONObject:optDouble	(Ljava/lang/String;)D
    //   649: d2f
    //   650: putfield 345	com/tencent/mm/protocal/c/bbb:rms	F
    //   653: aload 9
    //   655: aload 8
    //   657: ldc_w 347
    //   660: invokevirtual 344	org/json/JSONObject:optDouble	(Ljava/lang/String;)D
    //   663: d2f
    //   664: putfield 348	com/tencent/mm/protocal/c/bbb:rmr	F
    //   667: aload 9
    //   669: aload 8
    //   671: ldc_w 350
    //   674: invokevirtual 330	org/json/JSONObject:optString	(Ljava/lang/String;)Ljava/lang/String;
    //   677: putfield 353	com/tencent/mm/protocal/c/bbb:sdn	Ljava/lang/String;
    //   680: aload 9
    //   682: aload 8
    //   684: ldc_w 355
    //   687: invokevirtual 330	org/json/JSONObject:optString	(Ljava/lang/String;)Ljava/lang/String;
    //   690: putfield 358	com/tencent/mm/protocal/c/bbb:rPL	Ljava/lang/String;
    //   693: aload 9
    //   695: aload 8
    //   697: ldc_w 360
    //   700: invokevirtual 330	org/json/JSONObject:optString	(Ljava/lang/String;)Ljava/lang/String;
    //   703: invokestatic 364	com/tencent/mm/plugin/websearch/api/p:LP	(Ljava/lang/String;)J
    //   706: putfield 367	com/tencent/mm/protocal/c/bbb:sdp	J
    //   709: aload 9
    //   711: getfield 353	com/tencent/mm/protocal/c/bbb:sdn	Ljava/lang/String;
    //   714: invokestatic 311	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   717: ifne +12 -> 729
    //   720: aload_0
    //   721: getfield 134	com/tencent/mm/plugin/webview/fts/f:pOY	Lcom/tencent/mm/protocal/c/cfo;
    //   724: aload 9
    //   726: putfield 371	com/tencent/mm/protocal/c/cfo:sAg	Lcom/tencent/mm/protocal/c/bbb;
    //   729: aload_1
    //   730: getfield 246	com/tencent/mm/plugin/websearch/api/j:pLd	Lcom/tencent/mm/protocal/c/cfk;
    //   733: ifnull +88 -> 821
    //   736: aload_1
    //   737: getfield 246	com/tencent/mm/plugin/websearch/api/j:pLd	Lcom/tencent/mm/protocal/c/cfk;
    //   740: invokestatic 377	com/tencent/mm/plugin/appbrand/appcache/WxaCommLibRuntimeReader:abP	()Lcom/tencent/mm/plugin/appbrand/appcache/WxaPkgWrappingInfo;
    //   743: getfield 382	com/tencent/mm/plugin/appbrand/appcache/WxaPkgWrappingInfo:fii	I
    //   746: putfield 385	com/tencent/mm/protocal/c/cfk:szU	I
    //   749: aload_0
    //   750: getfield 134	com/tencent/mm/plugin/webview/fts/f:pOY	Lcom/tencent/mm/protocal/c/cfo;
    //   753: new 387	com/tencent/mm/bk/b
    //   756: dup
    //   757: aload_1
    //   758: getfield 246	com/tencent/mm/plugin/websearch/api/j:pLd	Lcom/tencent/mm/protocal/c/cfk;
    //   761: invokevirtual 391	com/tencent/mm/protocal/c/cfk:toByteArray	()[B
    //   764: invokespecial 394	com/tencent/mm/bk/b:<init>	([B)V
    //   767: putfield 398	com/tencent/mm/protocal/c/cfo:sAd	Lcom/tencent/mm/bk/b;
    //   770: ldc 80
    //   772: ldc_w 400
    //   775: iconst_3
    //   776: anewarray 84	java/lang/Object
    //   779: dup
    //   780: iconst_0
    //   781: aload_1
    //   782: getfield 246	com/tencent/mm/plugin/websearch/api/j:pLd	Lcom/tencent/mm/protocal/c/cfk;
    //   785: getfield 403	com/tencent/mm/protocal/c/cfk:szS	J
    //   788: invokestatic 408	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   791: aastore
    //   792: dup
    //   793: iconst_1
    //   794: aload_1
    //   795: getfield 246	com/tencent/mm/plugin/websearch/api/j:pLd	Lcom/tencent/mm/protocal/c/cfk;
    //   798: getfield 253	com/tencent/mm/protocal/c/cfk:szT	Lcom/tencent/mm/protocal/c/iv;
    //   801: getfield 411	com/tencent/mm/protocal/c/iv:bPS	Ljava/lang/String;
    //   804: aastore
    //   805: dup
    //   806: iconst_2
    //   807: aload_1
    //   808: getfield 246	com/tencent/mm/plugin/websearch/api/j:pLd	Lcom/tencent/mm/protocal/c/cfk;
    //   811: getfield 253	com/tencent/mm/protocal/c/cfk:szT	Lcom/tencent/mm/protocal/c/iv;
    //   814: getfield 414	com/tencent/mm/protocal/c/iv:rkc	Ljava/lang/String;
    //   817: aastore
    //   818: invokestatic 417	com/tencent/mm/sdk/platformtools/x:v	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   821: aload_1
    //   822: getfield 421	com/tencent/mm/plugin/websearch/api/j:pLc	Lcom/tencent/mm/protocal/c/chk;
    //   825: ifnull +24 -> 849
    //   828: aload_0
    //   829: getfield 134	com/tencent/mm/plugin/webview/fts/f:pOY	Lcom/tencent/mm/protocal/c/cfo;
    //   832: new 387	com/tencent/mm/bk/b
    //   835: dup
    //   836: aload_1
    //   837: getfield 421	com/tencent/mm/plugin/websearch/api/j:pLc	Lcom/tencent/mm/protocal/c/chk;
    //   840: invokevirtual 424	com/tencent/mm/protocal/c/chk:toByteArray	()[B
    //   843: invokespecial 394	com/tencent/mm/bk/b:<init>	([B)V
    //   846: putfield 427	com/tencent/mm/protocal/c/cfo:sAc	Lcom/tencent/mm/bk/b;
    //   849: aload_0
    //   850: getfield 134	com/tencent/mm/plugin/webview/fts/f:pOY	Lcom/tencent/mm/protocal/c/cfo;
    //   853: getfield 157	com/tencent/mm/protocal/c/cfo:rUI	Lcom/tencent/mm/protocal/c/aqs;
    //   856: ifnull +262 -> 1118
    //   859: iconst_1
    //   860: istore 6
    //   862: ldc 80
    //   864: ldc_w 429
    //   867: bipush 7
    //   869: anewarray 84	java/lang/Object
    //   872: dup
    //   873: iconst_0
    //   874: iload 6
    //   876: invokestatic 434	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   879: aastore
    //   880: dup
    //   881: iconst_1
    //   882: aload_1
    //   883: getfield 171	com/tencent/mm/plugin/websearch/api/j:pKP	Ljava/util/LinkedList;
    //   886: invokevirtual 440	java/util/LinkedList:size	()I
    //   889: invokestatic 302	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   892: aastore
    //   893: dup
    //   894: iconst_2
    //   895: aload_1
    //   896: getfield 53	com/tencent/mm/plugin/websearch/api/j:scene	I
    //   899: invokestatic 302	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   902: aastore
    //   903: dup
    //   904: iconst_3
    //   905: aload_1
    //   906: getfield 143	com/tencent/mm/plugin/websearch/api/j:iPZ	I
    //   909: invokestatic 302	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   912: aastore
    //   913: dup
    //   914: iconst_4
    //   915: aload_0
    //   916: getfield 65	com/tencent/mm/plugin/webview/fts/f:pKO	I
    //   919: invokestatic 302	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   922: aastore
    //   923: dup
    //   924: iconst_5
    //   925: aload_1
    //   926: getfield 186	com/tencent/mm/plugin/websearch/api/j:pKQ	I
    //   929: invokestatic 302	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   932: aastore
    //   933: dup
    //   934: bipush 6
    //   936: aload_1
    //   937: getfield 59	com/tencent/mm/plugin/websearch/api/j:bWo	I
    //   940: invokestatic 302	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   943: aastore
    //   944: invokestatic 90	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   947: aload_0
    //   948: getfield 134	com/tencent/mm/plugin/webview/fts/f:pOY	Lcom/tencent/mm/protocal/c/cfo;
    //   951: getfield 157	com/tencent/mm/protocal/c/cfo:rUI	Lcom/tencent/mm/protocal/c/aqs;
    //   954: ifnull +39 -> 993
    //   957: sipush 2005
    //   960: aload_0
    //   961: getfield 134	com/tencent/mm/plugin/webview/fts/f:pOY	Lcom/tencent/mm/protocal/c/cfo;
    //   964: getfield 157	com/tencent/mm/protocal/c/cfo:rUI	Lcom/tencent/mm/protocal/c/aqs;
    //   967: getfield 286	com/tencent/mm/protocal/c/aqs:rmr	F
    //   970: aload_0
    //   971: getfield 134	com/tencent/mm/plugin/webview/fts/f:pOY	Lcom/tencent/mm/protocal/c/cfo;
    //   974: getfield 157	com/tencent/mm/protocal/c/cfo:rUI	Lcom/tencent/mm/protocal/c/aqs;
    //   977: getfield 289	com/tencent/mm/protocal/c/aqs:rms	F
    //   980: aload_0
    //   981: getfield 134	com/tencent/mm/plugin/webview/fts/f:pOY	Lcom/tencent/mm/protocal/c/cfo;
    //   984: getfield 157	com/tencent/mm/protocal/c/cfo:rUI	Lcom/tencent/mm/protocal/c/aqs;
    //   987: getfield 443	com/tencent/mm/protocal/c/aqs:ryV	I
    //   990: invokestatic 449	com/tencent/mm/modelstat/o:a	(IFFI)V
    //   993: aload_1
    //   994: getfield 53	com/tencent/mm/plugin/websearch/api/j:scene	I
    //   997: istore 4
    //   999: aload_1
    //   1000: getfield 239	com/tencent/mm/plugin/websearch/api/j:bJK	Ljava/lang/String;
    //   1003: astore 8
    //   1005: aload_1
    //   1006: getfield 452	com/tencent/mm/plugin/websearch/api/j:bWr	Ljava/lang/String;
    //   1009: astore 9
    //   1011: aload_1
    //   1012: getfield 180	com/tencent/mm/plugin/websearch/api/j:iow	Ljava/lang/String;
    //   1015: astore 10
    //   1017: aload_1
    //   1018: getfield 48	com/tencent/mm/plugin/websearch/api/j:offset	I
    //   1021: istore 5
    //   1023: iload 7
    //   1025: istore 6
    //   1027: aload_1
    //   1028: getfield 64	com/tencent/mm/plugin/websearch/api/j:pKO	I
    //   1031: iconst_1
    //   1032: if_icmpne +6 -> 1038
    //   1035: iconst_1
    //   1036: istore 6
    //   1038: iload 4
    //   1040: aload 8
    //   1042: aload 9
    //   1044: aload 10
    //   1046: iload 5
    //   1048: iload 6
    //   1050: aload_1
    //   1051: getfield 42	com/tencent/mm/plugin/websearch/api/j:kJG	Ljava/lang/String;
    //   1054: aload_1
    //   1055: getfield 36	com/tencent/mm/plugin/websearch/api/j:bHt	Ljava/lang/String;
    //   1058: aload_1
    //   1059: getfield 143	com/tencent/mm/plugin/websearch/api/j:iPZ	I
    //   1062: ldc_w 454
    //   1065: invokestatic 459	com/tencent/mm/plugin/websearch/api/o:a	(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;IZLjava/lang/String;Ljava/lang/String;ILjava/lang/String;)V
    //   1068: return
    //   1069: iconst_0
    //   1070: istore 4
    //   1072: goto -577 -> 495
    //   1075: iconst_1
    //   1076: istore 4
    //   1078: goto -575 -> 503
    //   1081: aload_1
    //   1082: getfield 246	com/tencent/mm/plugin/websearch/api/j:pLd	Lcom/tencent/mm/protocal/c/cfk;
    //   1085: getfield 253	com/tencent/mm/protocal/c/cfk:szT	Lcom/tencent/mm/protocal/c/iv;
    //   1088: iconst_1
    //   1089: putfield 280	com/tencent/mm/protocal/c/iv:rkh	I
    //   1092: fconst_0
    //   1093: fstore_2
    //   1094: fconst_0
    //   1095: fstore_3
    //   1096: goto -564 -> 532
    //   1099: astore 8
    //   1101: ldc 80
    //   1103: aload 8
    //   1105: ldc_w 454
    //   1108: iconst_0
    //   1109: anewarray 84	java/lang/Object
    //   1112: invokestatic 463	com/tencent/mm/sdk/platformtools/x:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1115: goto -386 -> 729
    //   1118: iconst_0
    //   1119: istore 6
    //   1121: goto -259 -> 862
    //   1124: ldc 80
    //   1126: ldc_w 465
    //   1129: invokestatic 469	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   1132: return
    //   1133: astore 8
    //   1135: goto -286 -> 849
    //   1138: astore 8
    //   1140: goto -319 -> 821
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	1143	0	this	f
    //   0	1143	1	paramj	j
    //   531	563	2	f1	float
    //   520	576	3	f2	float
    //   493	584	4	i	int
    //   1021	26	5	j	int
    //   860	260	6	bool1	boolean
    //   1	1023	7	bool2	boolean
    //   116	925	8	localObject1	Object
    //   1099	5	8	localJSONException	org.json.JSONException
    //   1133	1	8	localException1	Exception
    //   1138	1	8	localException2	Exception
    //   456	587	9	localObject2	Object
    //   1015	30	10	str	String
    // Exception table:
    //   from	to	target	type
    //   593	729	1099	org/json/JSONException
    //   828	849	1133	java/lang/Exception
    //   736	821	1138	java/lang/Exception
  }
  
  public final String JS()
  {
    if (this.pOX != null) {
      return this.pOX.rjK;
    }
    return "";
  }
  
  public final int JT()
  {
    if (this.pOX != null) {
      return this.pOX.syR;
    }
    return 0;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    ad.ef(this.scene, 2);
    this.diJ = parame1;
    return a(parame, this.dZf, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.i("MicroMsg.FTS.NetSceneWebSearch", "netId %d | errType %d | errCode %d | errMsg %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    boolean bool1;
    int i;
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      bool1 = true;
      if ((paramInt2 == 0) && (paramInt3 == 0)) {
        break label188;
      }
      this.diJ.a(paramInt2, paramInt3, paramString, this);
      paramInt1 = this.dFC.scene;
      paramString = this.dFC.bJK;
      paramq = this.dFC.bWr;
      paramArrayOfByte = this.dFC.iow;
      i = this.dFC.offset;
      if (this.dFC.pKO != 1) {
        break label182;
      }
    }
    label182:
    for (boolean bool2 = true;; bool2 = false)
    {
      o.a(paramInt1, paramString, paramq, paramArrayOfByte, i, bool2, this.dFC.kJG, bool1, this.dFC.bHt, this.dFC.iPZ);
      ad.aa(this.scene, paramInt2, paramInt3);
      return;
      bool1 = false;
      break;
    }
    label188:
    this.pOX = ((cfp)this.dZf.dIE.dIL);
    String str;
    if (this.pOX != null)
    {
      paramInt1 = this.dFC.scene;
      paramq = this.dFC.bJK;
      paramArrayOfByte = this.dFC.bWr;
      str = this.dFC.iow;
      i = this.dFC.offset;
      if (this.dFC.pKO != 1) {
        break label353;
      }
    }
    label353:
    for (bool2 = true;; bool2 = false)
    {
      o.a(paramInt1, paramq, paramArrayOfByte, str, i, bool2, this.dFC.kJG, bool1, this.dFC.bHt, this.dFC.iPZ);
      x.v("MicroMsg.FTS.NetSceneWebSearch", "return data\n%s", new Object[] { this.pOX.rjK });
      this.diJ.a(paramInt2, paramInt3, paramString, this);
      ad.aa(this.scene, paramInt2, paramInt3);
      return;
    }
  }
  
  public final void ak(LinkedList<bxd> paramLinkedList)
  {
    this.pOY.sjr = paramLinkedList;
    boq localboq = new boq();
    localboq.smC = paramLinkedList.size();
    this.pOY.sAe = localboq;
  }
  
  public final int getType()
  {
    return 719;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/webview/fts/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */