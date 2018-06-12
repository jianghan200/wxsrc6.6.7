package com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcmodel;

import com.tencent.mm.a.g;
import com.tencent.mm.ab.e;
import com.tencent.mm.ab.f;
import com.tencent.mm.ab.l;
import com.tencent.mm.sdk.platformtools.bi;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public final class d
  implements f
{
  private boolean bPd = false;
  private boolean dJO = false;
  private Random dlF = new Random();
  List<String> gZA = new LinkedList();
  HashSet<String> gZB = new HashSet();
  e.d gZC;
  e gZD;
  boolean gZE = false;
  private long gZF;
  private long gZG;
  int gZH;
  int gZI = 0;
  Object lock = new Object();
  
  private static String a(Random paramRandom)
  {
    return g.u((bi.VG() + paramRandom.nextDouble()).getBytes());
  }
  
  public final void a(int paramInt1, int paramInt2, l paraml)
  {
    this.gZG += paramInt1;
    if (this.gZF == 0L) {}
    for (paramInt1 = 0;; paramInt1 = (int)(this.gZG * 100L / this.gZF))
    {
      if (paramInt1 > this.gZH)
      {
        this.gZH = paramInt1;
        com.tencent.mm.plugin.backup.bakoldlogic.c.c.setProgress(this.gZH);
        if ((!this.bPd) && (!this.dJO) && (this.gZC != null) && (this.gZH >= 0) && (this.gZH <= 100)) {
          this.gZC.mT(this.gZH);
        }
      }
      return;
    }
  }
  
  final void asU()
  {
    if ((!this.gZE) || (this.dJO)) {
      return;
    }
    for (;;)
    {
      synchronized (this.lock)
      {
        if (this.gZB.isEmpty())
        {
          a.asN().asO().gZU = 4;
          a.asN().asO().gZV = 3;
          com.tencent.mm.plugin.backup.f.b.b(5, this.gZD);
          new com.tencent.mm.plugin.backup.bakoldlogic.c.b(5).ass();
          c localc = a.asN().asP();
          localc.gZw += 1;
          if (this.gZC != null)
          {
            this.gZC.atb();
            cancel();
            com.tencent.mm.sdk.platformtools.x.i("MicroMsg.BakPCServer", "send backup finish cmd");
          }
        }
        else
        {
          return;
        }
      }
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.BakPCServer", "operatorCallback is null");
    }
  }
  
  public final void cancel()
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.BakPCServer", "cancel");
    this.dJO = true;
    com.tencent.mm.plugin.backup.f.b.b(5, this.gZD);
    this.gZC = null;
    this.gZE = false;
    this.gZH = 0;
    synchronized (this.lock)
    {
      this.lock.notifyAll();
      return;
    }
  }
  
  /* Error */
  public final boolean o(String arg1, String paramString2, int paramInt)
  {
    // Byte code:
    //   0: new 199	com/tencent/mm/pointers/PLong
    //   3: dup
    //   4: invokespecial 200	com/tencent/mm/pointers/PLong:<init>	()V
    //   7: astore 8
    //   9: invokestatic 206	com/tencent/mm/plugin/backup/bakoldlogic/d/b:atl	()Lcom/tencent/mm/plugin/backup/bakoldlogic/d/b;
    //   12: invokevirtual 210	com/tencent/mm/plugin/backup/bakoldlogic/d/b:atm	()Lcom/tencent/mm/plugin/backup/bakoldlogic/d/c;
    //   15: invokevirtual 216	com/tencent/mm/plugin/backup/bakoldlogic/d/c:FT	()Lcom/tencent/mm/plugin/messenger/foundation/a/a/f;
    //   18: aload_1
    //   19: invokeinterface 222 2 0
    //   24: astore 7
    //   26: new 49	java/util/LinkedList
    //   29: dup
    //   30: invokespecial 50	java/util/LinkedList:<init>	()V
    //   33: astore 6
    //   35: new 49	java/util/LinkedList
    //   38: dup
    //   39: invokespecial 50	java/util/LinkedList:<init>	()V
    //   42: astore 9
    //   44: aload 6
    //   46: astore_1
    //   47: aload 7
    //   49: invokeinterface 227 1 0
    //   54: ifeq +867 -> 921
    //   57: aload 7
    //   59: invokeinterface 230 1 0
    //   64: ifne +984 -> 1048
    //   67: aload_0
    //   68: getfield 38	com/tencent/mm/plugin/backup/bakoldlogic/bakoldpcmodel/d:lock	Ljava/lang/Object;
    //   71: astore_1
    //   72: aload_1
    //   73: monitorenter
    //   74: aload_0
    //   75: getfield 57	com/tencent/mm/plugin/backup/bakoldlogic/bakoldpcmodel/d:gZB	Ljava/util/HashSet;
    //   78: invokevirtual 234	java/util/HashSet:size	()I
    //   81: istore 4
    //   83: iload 4
    //   85: bipush 10
    //   87: if_icmple +10 -> 97
    //   90: aload_0
    //   91: getfield 38	com/tencent/mm/plugin/backup/bakoldlogic/bakoldpcmodel/d:lock	Ljava/lang/Object;
    //   94: invokevirtual 237	java/lang/Object:wait	()V
    //   97: aload_0
    //   98: getfield 45	com/tencent/mm/plugin/backup/bakoldlogic/bakoldpcmodel/d:bPd	Z
    //   101: ifeq +21 -> 122
    //   104: aload_0
    //   105: getfield 47	com/tencent/mm/plugin/backup/bakoldlogic/bakoldpcmodel/d:dJO	Z
    //   108: istore 5
    //   110: iload 5
    //   112: ifne +10 -> 122
    //   115: aload_0
    //   116: getfield 38	com/tencent/mm/plugin/backup/bakoldlogic/bakoldpcmodel/d:lock	Ljava/lang/Object;
    //   119: invokevirtual 237	java/lang/Object:wait	()V
    //   122: aload_0
    //   123: getfield 47	com/tencent/mm/plugin/backup/bakoldlogic/bakoldpcmodel/d:dJO	Z
    //   126: ifeq +54 -> 180
    //   129: ldc -79
    //   131: ldc -17
    //   133: invokestatic 185	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   136: aload_1
    //   137: monitorexit
    //   138: aload 7
    //   140: invokeinterface 242 1 0
    //   145: iconst_0
    //   146: ireturn
    //   147: astore 10
    //   149: ldc -79
    //   151: aload 10
    //   153: ldc -12
    //   155: iconst_0
    //   156: anewarray 4	java/lang/Object
    //   159: invokestatic 248	com/tencent/mm/sdk/platformtools/x:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   162: goto -40 -> 122
    //   165: astore_2
    //   166: aload_1
    //   167: monitorexit
    //   168: aload_2
    //   169: athrow
    //   170: astore_1
    //   171: aload 7
    //   173: invokeinterface 242 1 0
    //   178: aload_1
    //   179: athrow
    //   180: aload_1
    //   181: monitorexit
    //   182: new 250	com/tencent/mm/storage/bd
    //   185: dup
    //   186: invokespecial 251	com/tencent/mm/storage/bd:<init>	()V
    //   189: astore 10
    //   191: aload 10
    //   193: aload 7
    //   195: invokevirtual 255	com/tencent/mm/storage/bd:d	(Landroid/database/Cursor;)V
    //   198: iload_3
    //   199: ifle +183 -> 382
    //   202: iconst_1
    //   203: istore 4
    //   205: aload 10
    //   207: getfield 260	com/tencent/mm/g/c/cm:field_msgSvrId	J
    //   210: lconst_0
    //   211: lcmp
    //   212: ifne +176 -> 388
    //   215: ldc_w 262
    //   218: ldc_w 264
    //   221: iconst_2
    //   222: anewarray 4	java/lang/Object
    //   225: dup
    //   226: iconst_0
    //   227: aload 10
    //   229: getfield 268	com/tencent/mm/g/c/cm:field_talker	Ljava/lang/String;
    //   232: aastore
    //   233: dup
    //   234: iconst_1
    //   235: aload 10
    //   237: invokevirtual 271	com/tencent/mm/storage/bd:getType	()I
    //   240: invokestatic 277	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   243: aastore
    //   244: invokestatic 281	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   247: aconst_null
    //   248: astore_1
    //   249: iload_3
    //   250: iconst_1
    //   251: isub
    //   252: istore_3
    //   253: aload_1
    //   254: ifnull +10 -> 264
    //   257: aload 6
    //   259: aload_1
    //   260: invokevirtual 285	java/util/LinkedList:add	(Ljava/lang/Object;)Z
    //   263: pop
    //   264: aload 9
    //   266: invokevirtual 289	java/util/LinkedList:iterator	()Ljava/util/Iterator;
    //   269: astore 10
    //   271: aload 10
    //   273: invokeinterface 294 1 0
    //   278: ifeq +481 -> 759
    //   281: aload 10
    //   283: invokeinterface 298 1 0
    //   288: checkcast 300	com/tencent/mm/plugin/backup/h/u
    //   291: astore 11
    //   293: new 109	com/tencent/mm/plugin/backup/bakoldlogic/c/c
    //   296: dup
    //   297: aload 11
    //   299: getfield 303	com/tencent/mm/plugin/backup/h/u:mediaId	Ljava/lang/String;
    //   302: iconst_2
    //   303: aconst_null
    //   304: aload 11
    //   306: getfield 306	com/tencent/mm/plugin/backup/h/u:path	Ljava/lang/String;
    //   309: aload_0
    //   310: invokestatic 133	com/tencent/mm/plugin/backup/bakoldlogic/bakoldpcmodel/a:asN	()Lcom/tencent/mm/plugin/backup/bakoldlogic/bakoldpcmodel/a;
    //   313: getfield 312	com/tencent/mm/plugin/backup/a/d:gRA	[B
    //   316: invokespecial 315	com/tencent/mm/plugin/backup/bakoldlogic/c/c:<init>	(Ljava/lang/String;ILjava/util/LinkedList;Ljava/lang/String;Lcom/tencent/mm/ab/f;[B)V
    //   319: astore 12
    //   321: aload_0
    //   322: getfield 38	com/tencent/mm/plugin/backup/bakoldlogic/bakoldpcmodel/d:lock	Ljava/lang/Object;
    //   325: astore_1
    //   326: aload_1
    //   327: monitorenter
    //   328: aload 12
    //   330: invokevirtual 316	com/tencent/mm/plugin/backup/bakoldlogic/c/c:ass	()Z
    //   333: pop
    //   334: aload_0
    //   335: getfield 57	com/tencent/mm/plugin/backup/bakoldlogic/bakoldpcmodel/d:gZB	Ljava/util/HashSet;
    //   338: aload 11
    //   340: getfield 303	com/tencent/mm/plugin/backup/h/u:mediaId	Ljava/lang/String;
    //   343: invokevirtual 317	java/util/HashSet:add	(Ljava/lang/Object;)Z
    //   346: pop
    //   347: ldc -79
    //   349: ldc_w 319
    //   352: iconst_1
    //   353: anewarray 4	java/lang/Object
    //   356: dup
    //   357: iconst_0
    //   358: aload_0
    //   359: getfield 57	com/tencent/mm/plugin/backup/bakoldlogic/bakoldpcmodel/d:gZB	Ljava/util/HashSet;
    //   362: invokevirtual 234	java/util/HashSet:size	()I
    //   365: invokestatic 277	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   368: aastore
    //   369: invokestatic 321	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   372: aload_1
    //   373: monitorexit
    //   374: goto -103 -> 271
    //   377: astore_2
    //   378: aload_1
    //   379: monitorexit
    //   380: aload_2
    //   381: athrow
    //   382: iconst_0
    //   383: istore 4
    //   385: goto -180 -> 205
    //   388: new 323	com/tencent/mm/protocal/c/ey
    //   391: dup
    //   392: invokespecial 324	com/tencent/mm/protocal/c/ey:<init>	()V
    //   395: astore_1
    //   396: aload_1
    //   397: aload 10
    //   399: getfield 260	com/tencent/mm/g/c/cm:field_msgSvrId	J
    //   402: putfield 327	com/tencent/mm/protocal/c/ey:rcq	J
    //   405: aload 10
    //   407: getfield 330	com/tencent/mm/g/c/cm:field_isSend	I
    //   410: iconst_1
    //   411: if_icmpne +208 -> 619
    //   414: aload_1
    //   415: new 332	com/tencent/mm/protocal/c/bhz
    //   418: dup
    //   419: invokespecial 333	com/tencent/mm/protocal/c/bhz:<init>	()V
    //   422: aload_2
    //   423: invokevirtual 337	com/tencent/mm/protocal/c/bhz:VO	(Ljava/lang/String;)Lcom/tencent/mm/protocal/c/bhz;
    //   426: putfield 341	com/tencent/mm/protocal/c/ey:rcj	Lcom/tencent/mm/protocal/c/bhz;
    //   429: aload_1
    //   430: new 332	com/tencent/mm/protocal/c/bhz
    //   433: dup
    //   434: invokespecial 333	com/tencent/mm/protocal/c/bhz:<init>	()V
    //   437: aload 10
    //   439: getfield 268	com/tencent/mm/g/c/cm:field_talker	Ljava/lang/String;
    //   442: invokevirtual 337	com/tencent/mm/protocal/c/bhz:VO	(Ljava/lang/String;)Lcom/tencent/mm/protocal/c/bhz;
    //   445: putfield 344	com/tencent/mm/protocal/c/ey:rck	Lcom/tencent/mm/protocal/c/bhz;
    //   448: iconst_2
    //   449: istore 4
    //   451: aload_1
    //   452: iload 4
    //   454: putfield 347	com/tencent/mm/protocal/c/ey:rft	I
    //   457: aload_1
    //   458: new 349	com/tencent/mm/protocal/c/bhy
    //   461: dup
    //   462: invokespecial 350	com/tencent/mm/protocal/c/bhy:<init>	()V
    //   465: putfield 354	com/tencent/mm/protocal/c/ey:rfy	Lcom/tencent/mm/protocal/c/bhy;
    //   468: aload_1
    //   469: iconst_0
    //   470: putfield 357	com/tencent/mm/protocal/c/ey:rfz	I
    //   473: aload_1
    //   474: iconst_0
    //   475: putfield 360	com/tencent/mm/protocal/c/ey:rfA	I
    //   478: aload_1
    //   479: ldc -12
    //   481: putfield 363	com/tencent/mm/protocal/c/ey:rco	Ljava/lang/String;
    //   484: aload_1
    //   485: aload 10
    //   487: invokevirtual 271	com/tencent/mm/storage/bd:getType	()I
    //   490: invokestatic 369	com/tencent/mm/pluginsdk/model/app/l:BJ	(I)I
    //   493: putfield 372	com/tencent/mm/protocal/c/ey:hcE	I
    //   496: aload_1
    //   497: aload 10
    //   499: getfield 375	com/tencent/mm/g/c/cm:field_createTime	J
    //   502: ldc2_w 376
    //   505: ldiv
    //   506: l2i
    //   507: putfield 380	com/tencent/mm/protocal/c/ey:rfu	I
    //   510: aload_1
    //   511: aload 10
    //   513: getfield 375	com/tencent/mm/g/c/cm:field_createTime	J
    //   516: putfield 383	com/tencent/mm/protocal/c/ey:rfC	J
    //   519: aload_1
    //   520: aload 10
    //   522: getfield 386	com/tencent/mm/g/c/cm:field_msgSeq	J
    //   525: l2i
    //   526: putfield 389	com/tencent/mm/protocal/c/ey:rfB	I
    //   529: aload_1
    //   530: aload 10
    //   532: getfield 392	com/tencent/mm/g/c/cm:field_flag	I
    //   535: putfield 395	com/tencent/mm/protocal/c/ey:rfD	I
    //   538: new 332	com/tencent/mm/protocal/c/bhz
    //   541: dup
    //   542: invokespecial 333	com/tencent/mm/protocal/c/bhz:<init>	()V
    //   545: astore 11
    //   547: aload 11
    //   549: aload 10
    //   551: getfield 398	com/tencent/mm/g/c/cm:field_content	Ljava/lang/String;
    //   554: ldc -12
    //   556: invokestatic 402	com/tencent/mm/sdk/platformtools/bi:aG	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   559: invokevirtual 337	com/tencent/mm/protocal/c/bhz:VO	(Ljava/lang/String;)Lcom/tencent/mm/protocal/c/bhz;
    //   562: pop
    //   563: aload_1
    //   564: aload 11
    //   566: putfield 405	com/tencent/mm/protocal/c/ey:rcl	Lcom/tencent/mm/protocal/c/bhz;
    //   569: invokestatic 411	com/tencent/mm/plugin/backup/bakoldlogic/b/d:asM	()Lcom/tencent/mm/plugin/backup/bakoldlogic/b/d;
    //   572: aload 10
    //   574: invokevirtual 271	com/tencent/mm/storage/bd:getType	()I
    //   577: invokestatic 369	com/tencent/mm/pluginsdk/model/app/l:BJ	(I)I
    //   580: invokevirtual 415	com/tencent/mm/plugin/backup/bakoldlogic/b/d:mN	(I)Lcom/tencent/mm/plugin/backup/bakoldlogic/b/j;
    //   583: astore 11
    //   585: aload 11
    //   587: ifnonnull +77 -> 664
    //   590: ldc_w 262
    //   593: ldc_w 417
    //   596: iconst_1
    //   597: anewarray 4	java/lang/Object
    //   600: dup
    //   601: iconst_0
    //   602: aload 10
    //   604: invokevirtual 271	com/tencent/mm/storage/bd:getType	()I
    //   607: invokestatic 277	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   610: aastore
    //   611: invokestatic 419	com/tencent/mm/sdk/platformtools/x:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   614: aconst_null
    //   615: astore_1
    //   616: goto -367 -> 249
    //   619: aload_1
    //   620: new 332	com/tencent/mm/protocal/c/bhz
    //   623: dup
    //   624: invokespecial 333	com/tencent/mm/protocal/c/bhz:<init>	()V
    //   627: aload 10
    //   629: getfield 268	com/tencent/mm/g/c/cm:field_talker	Ljava/lang/String;
    //   632: invokevirtual 337	com/tencent/mm/protocal/c/bhz:VO	(Ljava/lang/String;)Lcom/tencent/mm/protocal/c/bhz;
    //   635: putfield 341	com/tencent/mm/protocal/c/ey:rcj	Lcom/tencent/mm/protocal/c/bhz;
    //   638: aload_1
    //   639: new 332	com/tencent/mm/protocal/c/bhz
    //   642: dup
    //   643: invokespecial 333	com/tencent/mm/protocal/c/bhz:<init>	()V
    //   646: aload_2
    //   647: invokevirtual 337	com/tencent/mm/protocal/c/bhz:VO	(Ljava/lang/String;)Lcom/tencent/mm/protocal/c/bhz;
    //   650: putfield 344	com/tencent/mm/protocal/c/ey:rck	Lcom/tencent/mm/protocal/c/bhz;
    //   653: iload 4
    //   655: ifeq +387 -> 1042
    //   658: iconst_3
    //   659: istore 4
    //   661: goto -210 -> 451
    //   664: aload 11
    //   666: aload_1
    //   667: aload 10
    //   669: aload 9
    //   671: invokeinterface 424 4 0
    //   676: istore 4
    //   678: iload 4
    //   680: ifge +8 -> 688
    //   683: aconst_null
    //   684: astore_1
    //   685: goto -436 -> 249
    //   688: aload 8
    //   690: aload 8
    //   692: getfield 427	com/tencent/mm/pointers/PLong:value	J
    //   695: iload 4
    //   697: i2l
    //   698: ladd
    //   699: putfield 427	com/tencent/mm/pointers/PLong:value	J
    //   702: aload 8
    //   704: aload 8
    //   706: getfield 427	com/tencent/mm/pointers/PLong:value	J
    //   709: ldc2_w 428
    //   712: ladd
    //   713: putfield 427	com/tencent/mm/pointers/PLong:value	J
    //   716: goto -467 -> 249
    //   719: astore_1
    //   720: ldc -79
    //   722: aload_1
    //   723: ldc -12
    //   725: iconst_0
    //   726: anewarray 4	java/lang/Object
    //   729: invokestatic 248	com/tencent/mm/sdk/platformtools/x:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   732: ldc -79
    //   734: new 66	java/lang/StringBuilder
    //   737: dup
    //   738: ldc_w 431
    //   741: invokespecial 434	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   744: aload_1
    //   745: invokevirtual 437	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   748: invokevirtual 88	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   751: invokestatic 440	com/tencent/mm/sdk/platformtools/x:f	(Ljava/lang/String;Ljava/lang/String;)V
    //   754: aconst_null
    //   755: astore_1
    //   756: goto -503 -> 253
    //   759: aload 9
    //   761: invokevirtual 443	java/util/LinkedList:clear	()V
    //   764: aload 6
    //   766: astore_1
    //   767: aload 8
    //   769: getfield 427	com/tencent/mm/pointers/PLong:value	J
    //   772: ldc2_w 444
    //   775: lcmp
    //   776: ifle +125 -> 901
    //   779: ldc -79
    //   781: new 66	java/lang/StringBuilder
    //   784: dup
    //   785: ldc_w 447
    //   788: invokespecial 434	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   791: aload 8
    //   793: getfield 427	com/tencent/mm/pointers/PLong:value	J
    //   796: invokevirtual 77	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   799: invokevirtual 88	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   802: invokestatic 449	com/tencent/mm/sdk/platformtools/x:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   805: aload_0
    //   806: getfield 43	com/tencent/mm/plugin/backup/bakoldlogic/bakoldpcmodel/d:dlF	Ljava/util/Random;
    //   809: invokestatic 451	com/tencent/mm/plugin/backup/bakoldlogic/bakoldpcmodel/d:a	(Ljava/util/Random;)Ljava/lang/String;
    //   812: astore_1
    //   813: new 109	com/tencent/mm/plugin/backup/bakoldlogic/c/c
    //   816: dup
    //   817: aload_1
    //   818: iconst_1
    //   819: aload 6
    //   821: ldc -12
    //   823: aload_0
    //   824: invokestatic 133	com/tencent/mm/plugin/backup/bakoldlogic/bakoldpcmodel/a:asN	()Lcom/tencent/mm/plugin/backup/bakoldlogic/bakoldpcmodel/a;
    //   827: getfield 312	com/tencent/mm/plugin/backup/a/d:gRA	[B
    //   830: invokespecial 315	com/tencent/mm/plugin/backup/bakoldlogic/c/c:<init>	(Ljava/lang/String;ILjava/util/LinkedList;Ljava/lang/String;Lcom/tencent/mm/ab/f;[B)V
    //   833: astore 10
    //   835: aload_0
    //   836: getfield 38	com/tencent/mm/plugin/backup/bakoldlogic/bakoldpcmodel/d:lock	Ljava/lang/Object;
    //   839: astore 6
    //   841: aload 6
    //   843: monitorenter
    //   844: aload 10
    //   846: invokevirtual 316	com/tencent/mm/plugin/backup/bakoldlogic/c/c:ass	()Z
    //   849: pop
    //   850: aload_0
    //   851: getfield 57	com/tencent/mm/plugin/backup/bakoldlogic/bakoldpcmodel/d:gZB	Ljava/util/HashSet;
    //   854: aload_1
    //   855: invokevirtual 317	java/util/HashSet:add	(Ljava/lang/Object;)Z
    //   858: pop
    //   859: ldc -79
    //   861: ldc_w 319
    //   864: iconst_1
    //   865: anewarray 4	java/lang/Object
    //   868: dup
    //   869: iconst_0
    //   870: aload_0
    //   871: getfield 57	com/tencent/mm/plugin/backup/bakoldlogic/bakoldpcmodel/d:gZB	Ljava/util/HashSet;
    //   874: invokevirtual 234	java/util/HashSet:size	()I
    //   877: invokestatic 277	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   880: aastore
    //   881: invokestatic 321	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   884: aload 6
    //   886: monitorexit
    //   887: new 49	java/util/LinkedList
    //   890: dup
    //   891: invokespecial 50	java/util/LinkedList:<init>	()V
    //   894: astore_1
    //   895: aload 8
    //   897: lconst_0
    //   898: putfield 427	com/tencent/mm/pointers/PLong:value	J
    //   901: aload 7
    //   903: invokeinterface 454 1 0
    //   908: pop
    //   909: aload_1
    //   910: astore 6
    //   912: goto -855 -> 57
    //   915: astore_1
    //   916: aload 6
    //   918: monitorexit
    //   919: aload_1
    //   920: athrow
    //   921: aload 8
    //   923: getfield 427	com/tencent/mm/pointers/PLong:value	J
    //   926: lconst_0
    //   927: lcmp
    //   928: ifle +95 -> 1023
    //   931: aload_0
    //   932: getfield 43	com/tencent/mm/plugin/backup/bakoldlogic/bakoldpcmodel/d:dlF	Ljava/util/Random;
    //   935: invokestatic 451	com/tencent/mm/plugin/backup/bakoldlogic/bakoldpcmodel/d:a	(Ljava/util/Random;)Ljava/lang/String;
    //   938: astore_2
    //   939: new 109	com/tencent/mm/plugin/backup/bakoldlogic/c/c
    //   942: dup
    //   943: aload_2
    //   944: iconst_1
    //   945: aload_1
    //   946: ldc -12
    //   948: aload_0
    //   949: invokestatic 133	com/tencent/mm/plugin/backup/bakoldlogic/bakoldpcmodel/a:asN	()Lcom/tencent/mm/plugin/backup/bakoldlogic/bakoldpcmodel/a;
    //   952: getfield 312	com/tencent/mm/plugin/backup/a/d:gRA	[B
    //   955: invokespecial 315	com/tencent/mm/plugin/backup/bakoldlogic/c/c:<init>	(Ljava/lang/String;ILjava/util/LinkedList;Ljava/lang/String;Lcom/tencent/mm/ab/f;[B)V
    //   958: astore 6
    //   960: aload_0
    //   961: getfield 38	com/tencent/mm/plugin/backup/bakoldlogic/bakoldpcmodel/d:lock	Ljava/lang/Object;
    //   964: astore_1
    //   965: aload_1
    //   966: monitorenter
    //   967: aload 6
    //   969: invokevirtual 316	com/tencent/mm/plugin/backup/bakoldlogic/c/c:ass	()Z
    //   972: pop
    //   973: aload_0
    //   974: getfield 57	com/tencent/mm/plugin/backup/bakoldlogic/bakoldpcmodel/d:gZB	Ljava/util/HashSet;
    //   977: aload_2
    //   978: invokevirtual 317	java/util/HashSet:add	(Ljava/lang/Object;)Z
    //   981: pop
    //   982: ldc -79
    //   984: ldc_w 319
    //   987: iconst_1
    //   988: anewarray 4	java/lang/Object
    //   991: dup
    //   992: iconst_0
    //   993: aload_0
    //   994: getfield 57	com/tencent/mm/plugin/backup/bakoldlogic/bakoldpcmodel/d:gZB	Ljava/util/HashSet;
    //   997: invokevirtual 234	java/util/HashSet:size	()I
    //   1000: invokestatic 277	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1003: aastore
    //   1004: invokestatic 321	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1007: aload_1
    //   1008: monitorexit
    //   1009: aload 8
    //   1011: lconst_0
    //   1012: putfield 427	com/tencent/mm/pointers/PLong:value	J
    //   1015: new 49	java/util/LinkedList
    //   1018: dup
    //   1019: invokespecial 50	java/util/LinkedList:<init>	()V
    //   1022: pop
    //   1023: aload 7
    //   1025: invokeinterface 242 1 0
    //   1030: iconst_1
    //   1031: ireturn
    //   1032: astore_2
    //   1033: aload_1
    //   1034: monitorexit
    //   1035: aload_2
    //   1036: athrow
    //   1037: astore 10
    //   1039: goto -942 -> 97
    //   1042: iconst_4
    //   1043: istore 4
    //   1045: goto -594 -> 451
    //   1048: aload 6
    //   1050: astore_1
    //   1051: goto -130 -> 921
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	1054	0	this	d
    //   0	1054	2	paramString2	String
    //   0	1054	3	paramInt	int
    //   81	963	4	i	int
    //   108	3	5	bool	boolean
    //   24	1000	7	localCursor	android.database.Cursor
    //   7	1003	8	localPLong	com.tencent.mm.pointers.PLong
    //   42	718	9	localLinkedList	LinkedList
    //   147	5	10	localInterruptedException1	InterruptedException
    //   189	656	10	localObject2	Object
    //   1037	1	10	localInterruptedException2	InterruptedException
    //   291	374	11	localObject3	Object
    //   319	10	12	localc	com.tencent.mm.plugin.backup.bakoldlogic.c.c
    // Exception table:
    //   from	to	target	type
    //   115	122	147	java/lang/InterruptedException
    //   74	83	165	finally
    //   90	97	165	finally
    //   97	110	165	finally
    //   115	122	165	finally
    //   122	138	165	finally
    //   149	162	165	finally
    //   166	168	165	finally
    //   180	182	165	finally
    //   47	57	170	finally
    //   57	74	170	finally
    //   168	170	170	finally
    //   182	198	170	finally
    //   205	247	170	finally
    //   257	264	170	finally
    //   264	271	170	finally
    //   271	328	170	finally
    //   380	382	170	finally
    //   388	448	170	finally
    //   451	585	170	finally
    //   590	614	170	finally
    //   619	653	170	finally
    //   664	678	170	finally
    //   688	716	170	finally
    //   720	754	170	finally
    //   759	764	170	finally
    //   767	844	170	finally
    //   887	901	170	finally
    //   901	909	170	finally
    //   919	921	170	finally
    //   921	967	170	finally
    //   1009	1023	170	finally
    //   1035	1037	170	finally
    //   328	374	377	finally
    //   378	380	377	finally
    //   205	247	719	java/lang/Exception
    //   388	448	719	java/lang/Exception
    //   451	585	719	java/lang/Exception
    //   590	614	719	java/lang/Exception
    //   619	653	719	java/lang/Exception
    //   664	678	719	java/lang/Exception
    //   688	716	719	java/lang/Exception
    //   844	887	915	finally
    //   916	919	915	finally
    //   967	1009	1032	finally
    //   1033	1035	1032	finally
    //   90	97	1037	java/lang/InterruptedException
  }
  
  public final void pause()
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.BakPCServer", "pause");
    this.bPd = true;
  }
  
  public final void resume()
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.BakPCServer", "resume");
    this.bPd = false;
    synchronized (this.lock)
    {
      this.lock.notifyAll();
      return;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/backup/bakoldlogic/bakoldpcmodel/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */