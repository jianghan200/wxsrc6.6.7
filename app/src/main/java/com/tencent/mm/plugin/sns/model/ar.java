package com.tencent.mm.plugin.sns.model;

import com.tencent.mm.a.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.modelcdntran.j;
import com.tencent.mm.modelcontrol.b;
import com.tencent.mm.modelvideo.f.a;
import com.tencent.mm.modelvideo.i;
import com.tencent.mm.modelvideo.r;
import com.tencent.mm.pointers.PBool;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.pointers.PString;
import com.tencent.mm.protocal.c.ate;
import com.tencent.mm.protocal.c.bbj;
import com.tencent.mm.protocal.c.boy;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ao;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.av;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

public final class ar
  implements f.a
{
  boolean emK = false;
  boolean emL = false;
  com.tencent.mm.modelvideo.f emO = null;
  c nrA = new c() {};
  ay nrJ = null;
  LinkedList<ay> nrK = null;
  Map<String, ay> nrL = null;
  LinkedList<com.tencent.mm.plugin.sns.storage.n> nrM = null;
  c nrN = new ar.9(this);
  c nrz = new ar.10(this);
  
  public ar()
  {
    com.tencent.mm.sdk.b.a.sFg.b(this.nrN);
    com.tencent.mm.sdk.b.a.sFg.b(this.nrz);
    com.tencent.mm.sdk.b.a.sFg.b(this.nrA);
  }
  
  public final void a(com.tencent.mm.modelvideo.f paramf, boolean paramBoolean, int paramInt1, int paramInt2)
  {
    if (paramf == null)
    {
      x.e("MicroMsg.SnsVideoService", "%d on preload finish but scene is null?", new Object[] { Integer.valueOf(hashCode()) });
      return;
    }
    if (this.emO != paramf) {
      x.w("MicroMsg.SnsVideoService", "%d on preload finish, but scene callback not same object.", new Object[] { Integer.valueOf(hashCode()) });
    }
    x.i("MicroMsg.SnsVideoService", "%d preload video[%s] finish success[%b] range[%d, %d]", new Object[] { Integer.valueOf(hashCode()), paramf.SS(), Boolean.valueOf(paramBoolean), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    g.Em().H(new ar.4(this, paramf));
  }
  
  final boolean a(ay paramay, boolean paramBoolean)
  {
    Object localObject1 = aq.a(paramay.bKW, paramay.caK);
    if (!bi.oW((String)localObject1))
    {
      x.i("MicroMsg.SnsVideoService", "this video[%s] already download finish, do nothing. [%s, %s]", new Object[] { paramay.elz, paramay.bKW, localObject1 });
      return false;
    }
    boolean bool = e.cr(aq.Ms(paramay.caK.ksA));
    localObject1 = aq.D(paramay.caK);
    Object localObject2 = aq.Mt(paramay.bKW);
    if (localObject2 == null) {
      aq.cf(paramay.bKW, paramay.dQo);
    }
    for (;;)
    {
      x.i("MicroMsg.SnsVideoService", "prepare stream download sns video %s mkDir %b", new Object[] { localObject1, Boolean.valueOf(bool) });
      localObject2 = new com.tencent.mm.plugin.sns.model.a.a(paramay.caK.ksA);
      ((com.tencent.mm.plugin.sns.model.a.a)localObject2).noc = paramay.caK;
      av localav = av.clY();
      localav.time = paramay.dTR;
      ((com.tencent.mm.plugin.sns.model.a.a)localObject2).nsJ = localav;
      ((com.tencent.mm.plugin.sns.model.a.a)localObject2).nsH = true;
      ((com.tencent.mm.plugin.sns.model.a.a)localObject2).url = paramay.caK.jPK;
      int i = paramay.caK.hcE;
      ((com.tencent.mm.plugin.sns.model.a.a)localObject2).nsG = false;
      com.tencent.mm.modelvideo.n.SY();
      com.tencent.mm.modelvideo.o.Tb();
      localObject1 = com.tencent.mm.modelcdntran.f.a(((com.tencent.mm.plugin.sns.model.a.a)localObject2).nsJ, ((com.tencent.mm.plugin.sns.model.a.a)localObject2).url, (String)localObject1, aq.nJ(paramay.bKW), paramay.dQm);
      if (localObject1 == null) {
        break;
      }
      localObject2 = paramay.nsF;
      ((j)localObject1).dQn = ((String)localObject2);
      ((j)localObject1).bSS = ((String)localObject2);
      try
      {
        localObject2 = aj.m(af.byo().Nl(paramay.bKW));
        if (localObject2 != null)
        {
          ((j)localObject1).bSZ = ((boy)localObject2).rlK;
          ((j)localObject1).dQr = ((boy)localObject2).sna.sdz;
        }
      }
      catch (Exception localException)
      {
        for (;;) {}
      }
      this.nrJ = paramay;
      this.nrJ.elz = ((j)localObject1).field_mediaId;
      x.i("MicroMsg.SnsVideoService", "start stream download sns video cdnMediaId %s delay %b", new Object[] { this.nrJ.elz, Boolean.valueOf(paramBoolean) });
      com.tencent.mm.modelvideo.o.Tb().a((j)localObject1, paramBoolean);
      return true;
      aq.c((r)localObject2, paramay.dQo);
    }
  }
  
  public final boolean a(ate paramate, int paramInt1, String paramString, boolean paramBoolean1, boolean paramBoolean2, int paramInt2)
  {
    int i = 0;
    if (paramate.rVD == 2)
    {
      x.w("MicroMsg.SnsVideoService", "add video task, but url is weixin, do nothing");
      return false;
    }
    ay localay = new ay();
    localay.elz = aq.aG(paramInt1, paramate.jPK);
    localay.caK = paramate;
    localay.dTR = paramInt1;
    localay.bKW = paramString;
    paramInt1 = i;
    if (paramBoolean1) {
      paramInt1 = 1;
    }
    localay.dQm = paramInt1;
    localay.dQo = paramInt2;
    g.Ek();
    g.Em().H(new ar.6(this, localay, paramBoolean2));
    if (paramBoolean2) {
      byU();
    }
    return true;
  }
  
  public final void byR()
  {
    g.Em().H(new Runnable()
    {
      public final void run()
      {
        if (ar.this.nrJ != null) {
          break label10;
        }
        label10:
        while ((!ar.this.nrK.isEmpty()) || (ar.this.emO != null) || (ar.this.emK) || (ar.this.emL)) {
          return;
        }
        Object localObject1 = null;
        ??? = null;
        PBool localPBool = new PBool();
        PInt localPInt = new PInt();
        PString localPString = new PString();
        for (;;)
        {
          Object localObject7;
          Object localObject6;
          int i;
          synchronized (ar.this.nrM)
          {
            Iterator localIterator = ar.this.nrM.iterator();
            localObject7 = ???;
            if (!localIterator.hasNext()) {
              break label566;
            }
            localObject6 = (com.tencent.mm.plugin.sns.storage.n)localIterator.next();
            localObject1 = ar.this;
            if (localObject6 == null)
            {
              localPBool.value = true;
              i = 0;
              if (localPBool.value) {
                localIterator.remove();
              }
              if (i == 0) {
                break label792;
              }
              ??? = ar.b((com.tencent.mm.plugin.sns.storage.n)localObject6, localPInt.value, localPString.value);
              localObject1 = localObject6;
              localObject7 = ???;
              if (??? != null) {
                break label566;
              }
              localIterator.remove();
              localObject1 = localObject6;
            }
          }
          if (bi.bG(((com.tencent.mm.plugin.sns.storage.n)localObject6).field_createTime) >= 86400L)
          {
            localPBool.value = true;
            i = 0;
          }
          else if (com.tencent.mm.modelvideo.o.Tc().bU(false))
          {
            localPBool.value = true;
            i = 0;
          }
          else
          {
            localObject7 = aj.m((com.tencent.mm.plugin.sns.storage.n)localObject6);
            if ((localObject7 == null) || (((boy)localObject7).sna == null))
            {
              x.i("MicroMsg.SnsVideoService", "sns obj is null or sns obj PreDownloadInfo is null");
              localPBool.value = true;
              i = 0;
            }
            else
            {
              x.i("MicroMsg.SnsVideoService", "%d check sns video[%s] preload [%d %d %s]", new Object[] { Integer.valueOf(localObject2.hashCode()), ((com.tencent.mm.plugin.sns.storage.n)localObject6).bBe(), Integer.valueOf(((boy)localObject7).sna.sdz), Integer.valueOf(((boy)localObject7).sna.sdA), ((boy)localObject7).sna.sdB });
              if (((boy)localObject7).sna.sdz <= 0)
              {
                x.i("MicroMsg.SnsVideoService", "%d can not preload because percent <= 0", new Object[] { Integer.valueOf(localObject2.hashCode()) });
                localPBool.value = true;
                i = 0;
              }
              else
              {
                localPString.value = ((boy)localObject7).rlK;
                localPInt.value = ((boy)localObject7).sna.sdz;
                if (!b.lz(((boy)localObject7).sna.sdB))
                {
                  if (ao.isWifi(ad.getContext())) {
                    i = ((boy)localObject7).sna.sdA & 0x1;
                  }
                  for (;;)
                  {
                    if (i > 0)
                    {
                      localPBool.value = false;
                      i = 1;
                      break;
                      if (ao.is4G(ad.getContext()))
                      {
                        i = ((boy)localObject7).sna.sdA & 0x2;
                      }
                      else if (ao.is3G(ad.getContext()))
                      {
                        i = ((boy)localObject7).sna.sdA & 0x4;
                      }
                      else
                      {
                        localPBool.value = false;
                        i = 0;
                        break;
                      }
                    }
                  }
                }
                localPBool.value = false;
                i = 0;
                continue;
                label566:
                if ((localObject2 == null) || (localObject7 == null)) {
                  break;
                }
                i = 0;
                if (localObject7 != null) {}
                for (;;)
                {
                  try
                  {
                    ar.this.emO = new com.tencent.mm.modelvideo.f((j)localObject7, ((com.tencent.mm.plugin.sns.storage.n)localObject2).bBe());
                    if (ar.this.emO.a(ar.this) < 0)
                    {
                      x.w("MicroMsg.SnsVideoService", "%s curr preload task do scene error.", new Object[] { Integer.valueOf(ar.this.hashCode()) });
                      i = 1;
                      ar.this.emO = null;
                    }
                    if (i == 0) {
                      break;
                    }
                    synchronized (ar.this.nrM)
                    {
                      localObject6 = ar.this.nrM.iterator();
                      if (!((Iterator)localObject6).hasNext()) {
                        break label789;
                      }
                      localObject7 = (com.tencent.mm.plugin.sns.storage.n)((Iterator)localObject6).next();
                      if ((localObject7 == null) || (!bi.fS(((com.tencent.mm.plugin.sns.storage.n)localObject7).bBe(), ((com.tencent.mm.plugin.sns.storage.n)localObject2).bBe()))) {
                        continue;
                      }
                      x.i("MicroMsg.SnsVideoService", "%d find sns info[%s], remove now", new Object[] { Integer.valueOf(ar.this.hashCode()), ((com.tencent.mm.plugin.sns.storage.n)localObject2).bBe() });
                      ((Iterator)localObject6).remove();
                    }
                    i = 1;
                  }
                  catch (Exception localException)
                  {
                    x.printErrStackTrace("MicroMsg.SnsVideoService", localException, "", new Object[0]);
                    return;
                  }
                }
                label789:
                return;
                label792:
                Object localObject4 = null;
              }
            }
          }
        }
      }
    });
  }
  
  public final void byS()
  {
    x.d("MicroMsg.SnsVideoService", "%d stop preload %s", new Object[] { Integer.valueOf(hashCode()), bi.cjd() });
    g.Em().H(new ar.1(this));
  }
  
  /* Error */
  final boolean byT()
  {
    // Byte code:
    //   0: invokestatic 456	com/tencent/mm/sdk/platformtools/bi:VG	()J
    //   3: lstore_2
    //   4: ldc_w 458
    //   7: invokestatic 462	com/tencent/mm/kernel/g:l	(Ljava/lang/Class;)Lcom/tencent/mm/kernel/c/a;
    //   10: checkcast 458	com/tencent/mm/plugin/zero/b/a
    //   13: invokeinterface 466 1 0
    //   18: ldc_w 468
    //   21: iconst_1
    //   22: invokevirtual 474	com/tencent/mm/k/e:getInt	(Ljava/lang/String;I)I
    //   25: istore_1
    //   26: invokestatic 477	com/tencent/mm/sdk/platformtools/bi:VE	()J
    //   29: iload_1
    //   30: i2l
    //   31: ldc2_w 478
    //   34: lmul
    //   35: lsub
    //   36: lstore 4
    //   38: ldc -116
    //   40: ldc_w 481
    //   43: iconst_4
    //   44: anewarray 4	java/lang/Object
    //   47: dup
    //   48: iconst_0
    //   49: aload_0
    //   50: invokevirtual 304	java/lang/Object:hashCode	()I
    //   53: invokestatic 309	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   56: aastore
    //   57: dup
    //   58: iconst_1
    //   59: iconst_1
    //   60: invokestatic 309	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   63: aastore
    //   64: dup
    //   65: iconst_2
    //   66: sipush 130
    //   69: invokestatic 309	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   72: aastore
    //   73: dup
    //   74: iconst_3
    //   75: lload 4
    //   77: invokestatic 486	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   80: aastore
    //   81: invokestatic 148	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   84: invokestatic 490	com/tencent/mm/modelvideo/o:Ta	()Lcom/tencent/mm/modelvideo/s;
    //   87: sipush 130
    //   90: lload 4
    //   92: invokevirtual 496	com/tencent/mm/modelvideo/s:n	(IJ)Ljava/util/List;
    //   95: astore 6
    //   97: aload 6
    //   99: ifnull +13 -> 112
    //   102: aload 6
    //   104: invokeinterface 501 1 0
    //   109: ifeq +5 -> 114
    //   112: iconst_0
    //   113: ireturn
    //   114: aload 6
    //   116: invokeinterface 505 1 0
    //   121: astore 7
    //   123: iconst_0
    //   124: istore_1
    //   125: aload 7
    //   127: invokeinterface 510 1 0
    //   132: ifeq +203 -> 335
    //   135: aload 7
    //   137: invokeinterface 514 1 0
    //   142: checkcast 516	com/tencent/mm/modelvideo/r
    //   145: astore 8
    //   147: aload 8
    //   149: ifnull -24 -> 125
    //   152: aload 8
    //   154: invokevirtual 519	com/tencent/mm/modelvideo/r:getFileName	()Ljava/lang/String;
    //   157: invokestatic 522	com/tencent/mm/plugin/sns/model/aq:Mr	(Ljava/lang/String;)Ljava/lang/String;
    //   160: astore 9
    //   162: invokestatic 365	com/tencent/mm/plugin/sns/model/af:byo	()Lcom/tencent/mm/plugin/sns/storage/o;
    //   165: aload 9
    //   167: invokevirtual 371	com/tencent/mm/plugin/sns/storage/o:Nl	(Ljava/lang/String;)Lcom/tencent/mm/plugin/sns/storage/n;
    //   170: invokevirtual 106	com/tencent/mm/plugin/sns/storage/n:bAJ	()Lcom/tencent/mm/protocal/c/bsu;
    //   173: getfield 112	com/tencent/mm/protocal/c/bsu:sqc	Lcom/tencent/mm/protocal/c/qc;
    //   176: getfield 117	com/tencent/mm/protocal/c/qc:ruA	Ljava/util/LinkedList;
    //   179: iconst_0
    //   180: invokevirtual 121	java/util/LinkedList:get	(I)Ljava/lang/Object;
    //   183: checkcast 123	com/tencent/mm/protocal/c/ate
    //   186: invokestatic 204	com/tencent/mm/plugin/sns/model/aq:D	(Lcom/tencent/mm/protocal/c/ate;)Ljava/lang/String;
    //   189: astore 9
    //   191: aload 9
    //   193: invokestatic 138	com/tencent/mm/sdk/platformtools/bi:oW	(Ljava/lang/String;)Z
    //   196: ifne +213 -> 409
    //   199: new 524	java/io/File
    //   202: dup
    //   203: aload 9
    //   205: invokespecial 525	java/io/File:<init>	(Ljava/lang/String;)V
    //   208: astore 10
    //   210: aload 10
    //   212: invokevirtual 528	java/io/File:exists	()Z
    //   215: ifeq +194 -> 409
    //   218: aload 10
    //   220: invokevirtual 531	java/io/File:length	()J
    //   223: lstore 4
    //   225: ldc -116
    //   227: ldc_w 533
    //   230: iconst_5
    //   231: anewarray 4	java/lang/Object
    //   234: dup
    //   235: iconst_0
    //   236: aload 8
    //   238: invokevirtual 519	com/tencent/mm/modelvideo/r:getFileName	()Ljava/lang/String;
    //   241: aastore
    //   242: dup
    //   243: iconst_1
    //   244: lload 4
    //   246: invokestatic 486	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   249: aastore
    //   250: dup
    //   251: iconst_2
    //   252: aload 8
    //   254: getfield 536	com/tencent/mm/modelvideo/r:bSX	I
    //   257: invokestatic 309	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   260: aastore
    //   261: dup
    //   262: iconst_3
    //   263: aload 8
    //   265: getfield 539	com/tencent/mm/modelvideo/r:enK	J
    //   268: invokestatic 486	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   271: aastore
    //   272: dup
    //   273: iconst_4
    //   274: aload 9
    //   276: aastore
    //   277: invokestatic 148	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   280: lload 4
    //   282: lconst_0
    //   283: lcmp
    //   284: ifle +125 -> 409
    //   287: lload 4
    //   289: aload 8
    //   291: getfield 536	com/tencent/mm/modelvideo/r:bSX	I
    //   294: i2l
    //   295: lcmp
    //   296: ifgt +113 -> 409
    //   299: aload 10
    //   301: invokevirtual 542	java/io/File:delete	()Z
    //   304: pop
    //   305: iload_1
    //   306: iconst_1
    //   307: iadd
    //   308: istore_1
    //   309: aload 8
    //   311: iconst_0
    //   312: putfield 536	com/tencent/mm/modelvideo/r:bSX	I
    //   315: aload 8
    //   317: iconst_1
    //   318: putfield 545	com/tencent/mm/modelvideo/r:bWA	I
    //   321: aload 8
    //   323: invokestatic 550	com/tencent/mm/modelvideo/t:e	(Lcom/tencent/mm/modelvideo/r;)Z
    //   326: pop
    //   327: goto -202 -> 125
    //   330: astore 8
    //   332: goto -207 -> 125
    //   335: getstatic 183	com/tencent/mm/plugin/report/service/h:mEJ	Lcom/tencent/mm/plugin/report/service/h;
    //   338: ldc2_w 184
    //   341: ldc2_w 551
    //   344: iload_1
    //   345: i2l
    //   346: iconst_0
    //   347: invokevirtual 190	com/tencent/mm/plugin/report/service/h:a	(JJJZ)V
    //   350: ldc -116
    //   352: ldc_w 554
    //   355: iconst_4
    //   356: anewarray 4	java/lang/Object
    //   359: dup
    //   360: iconst_0
    //   361: aload_0
    //   362: invokevirtual 304	java/lang/Object:hashCode	()I
    //   365: invokestatic 309	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   368: aastore
    //   369: dup
    //   370: iconst_1
    //   371: aload 6
    //   373: invokeinterface 557 1 0
    //   378: invokestatic 309	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   381: aastore
    //   382: dup
    //   383: iconst_2
    //   384: iload_1
    //   385: invokestatic 309	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   388: aastore
    //   389: dup
    //   390: iconst_3
    //   391: lload_2
    //   392: invokestatic 561	com/tencent/mm/sdk/platformtools/bi:bI	(J)J
    //   395: invokestatic 486	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   398: aastore
    //   399: invokestatic 148	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   402: iconst_0
    //   403: ireturn
    //   404: astore 8
    //   406: goto -74 -> 332
    //   409: goto -100 -> 309
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	412	0	this	ar
    //   25	360	1	i	int
    //   3	389	2	l1	long
    //   36	252	4	l2	long
    //   95	277	6	localList	java.util.List
    //   121	15	7	localIterator	Iterator
    //   145	177	8	localr	r
    //   330	1	8	localException1	Exception
    //   404	1	8	localException2	Exception
    //   160	115	9	str	String
    //   208	92	10	localFile	java.io.File
    // Exception table:
    //   from	to	target	type
    //   152	280	330	java/lang/Exception
    //   287	305	330	java/lang/Exception
    //   309	327	404	java/lang/Exception
  }
  
  final void byU()
  {
    g.Ek();
    g.Em().H(new ar.7(this));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/sns/model/ar.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */