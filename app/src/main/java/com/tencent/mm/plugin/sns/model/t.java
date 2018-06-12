package com.tencent.mm.plugin.sns.model;

import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.g.a.qm;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.platformtools.ab;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.sns.data.i;
import com.tencent.mm.plugin.sns.storage.m;
import com.tencent.mm.plugin.sns.storage.n;
import com.tencent.mm.plugin.sns.storage.o;
import com.tencent.mm.protocal.c.ate;
import com.tencent.mm.protocal.c.bhy;
import com.tencent.mm.protocal.c.boc;
import com.tencent.mm.protocal.c.boy;
import com.tencent.mm.protocal.c.bpp;
import com.tencent.mm.protocal.c.bpz;
import com.tencent.mm.protocal.c.bqa;
import com.tencent.mm.protocal.c.bsu;
import com.tencent.mm.protocal.c.cg;
import com.tencent.mm.protocal.c.qc;
import com.tencent.mm.protocal.k.e;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.ao;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.av;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class t
  extends com.tencent.mm.ab.l
  implements k
{
  public int Ma = 0;
  final int bJt;
  private com.tencent.mm.ab.b diG;
  public com.tencent.mm.ab.e diJ;
  private long nnT = 0L;
  public int nnV = 0;
  public int nnW = 0;
  private long nos = 0L;
  private String not = "";
  
  public t()
  {
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new bpz();
    ((b.a)localObject).dIH = new bqa();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/mmsnspreloadingtimeline";
    ((b.a)localObject).dIF = 718;
    ((b.a)localObject).dII = 0;
    ((b.a)localObject).dIJ = 0;
    this.diG = ((b.a)localObject).KT();
    int i;
    if (ao.isWifi(ad.getContext())) {
      i = 1;
    }
    for (;;)
    {
      this.bJt = 2;
      bpz localbpz = (bpz)this.diG.dID.dIL;
      localbpz.snU = i;
      localbpz.smv = 0L;
      int j = af.bye().byM();
      this.nnT = af.byo().e(0L, j, true);
      localbpz.snR = this.nnT;
      int k = c.a(this.nnT, 0L, "@__weixintimtline");
      localbpz.snS = k;
      this.nos = af.byo().e(0L, 1, true);
      x.i("MicroMsg.NetSceneSnsPreTimeLine", "newerid " + this.nos);
      localbpz.snT = this.nos;
      com.tencent.mm.plugin.sns.storage.l locall = af.bys().Np("@__weixintimtline");
      if (locall == null)
      {
        localObject = "";
        label258:
        this.not = ((String)localObject);
        if (this.not == null) {
          this.not = "";
        }
        localbpz.smu = this.not;
        if ((locall != null) && (locall.field_adsession != null)) {
          break label453;
        }
      }
      for (localbpz.slZ = new bhy().bq(new byte[0]);; localbpz.slZ = new bhy().bq(locall.field_adsession))
      {
        x.i("MicroMsg.NetSceneSnsPreTimeLine", " This req nextCount: " + j + " min:" + this.nnT + " ReqTime:" + localbpz.snS + " nettype: " + i);
        x.d("MicroMsg.NetSceneSnsPreTimeLine", "minId: %s lastReqTime: %s", new Object[] { i.eF(this.nnT), Integer.valueOf(k) });
        return;
        if (ao.is3G(ad.getContext()))
        {
          i = 3;
          break;
        }
        if (ao.is4G(ad.getContext()))
        {
          i = 4;
          break;
        }
        if (!ao.is2G(ad.getContext())) {
          break label495;
        }
        i = 2;
        break;
        localObject = locall.field_md5;
        break label258;
        label453:
        x.d("MicroMsg.NetSceneSnsPreTimeLine", "request adsession %s", new Object[] { locall.field_adsession });
      }
      label495:
      i = 0;
    }
  }
  
  private void a(bqa parambqa, String paramString)
  {
    aj.a("@__weixintimtline", this.bJt, parambqa.rgH, paramString);
    this.nnT = ((boy)parambqa.rgH.getLast()).rlK;
    c.d("@__weixintimtline", ((boy)parambqa.rgH.getFirst()).rlK, this.nnT, parambqa.snV);
    parambqa = parambqa.rgH.iterator();
    while (parambqa.hasNext())
    {
      paramString = (boy)parambqa.next();
      if (paramString.smS == 0)
      {
        Object localObject1 = af.byo().fi(paramString.rlK);
        if ((localObject1 != null) && (((n)localObject1).bAJ() != null))
        {
          ??? = ((n)localObject1).bAJ().sqc.ruA;
          Object localObject2 = ???.iterator();
          if (((Iterator)localObject2).hasNext())
          {
            ate localate = (ate)((Iterator)localObject2).next();
            if (???.size() <= 1)
            {
              i = 1;
              label173:
              if (localate == null) {
                break label314;
              }
              localObject3 = i.e(localate);
              if (i == 0) {
                break label316;
              }
            }
            label314:
            label316:
            for (int i = 1;; i = 0)
            {
              localObject4 = an.s(af.getAccSnsPath(), localate.ksA);
              if ((!FileOp.cn((String)localObject4 + (String)localObject3)) && (!FileOp.cn((String)localObject4 + i.l(localate))) && (!FileOp.cn((String)localObject4 + i.m(localate)))) {
                break label321;
              }
              x.i("MicroMsg.NetSceneSnsPreTimeLine", "dealwithMedia exist:%s", new Object[] { localate.ksA });
              break;
              i = 0;
              break label173;
              break;
            }
            label321:
            x.i("MicroMsg.NetSceneSnsPreTimeLine", "dealwithMedia ready to download:%s", new Object[] { localate.ksA });
            Object localObject3 = new com.tencent.mm.plugin.sns.data.e(localate);
            ((com.tencent.mm.plugin.sns.data.e)localObject3).nkQ = i;
            ((com.tencent.mm.plugin.sns.data.e)localObject3).kJG = localate.ksA;
            Object localObject4 = af.byj();
            if (localate.hcE == 6) {}
            for (i = 5;; i = 1)
            {
              ((b)localObject4).a(localate, i, (com.tencent.mm.plugin.sns.data.e)localObject3, av.tbm);
              break;
            }
          }
          if (((n)localObject1).field_type == 15)
          {
            localObject2 = af.bym();
            if (localObject1 != null) {
              x.i("MicroMsg.SnsVideoService", "%d add preload video[%s]", new Object[] { Integer.valueOf(localObject2.hashCode()), ((n)localObject1).bBe() });
            }
            synchronized (((ar)localObject2).nrM)
            {
              ((ar)localObject2).nrM.addFirst(localObject1);
              try
              {
                localObject1 = ((ate)((n)localObject1).bAJ().sqc.ruA.get(0)).jPK;
                h.mEJ.h(14388, new Object[] { Long.valueOf(paramString.rlK), Integer.valueOf(4), localObject1, Integer.valueOf(0) });
              }
              catch (Exception paramString) {}
            }
          }
        }
      }
    }
    af.bym().byR();
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.i("MicroMsg.NetSceneSnsPreTimeLine", "netId : " + paramInt1 + " errType :" + paramInt2 + " errCode: " + paramInt3 + " errMsg :" + paramString);
    paramArrayOfByte = (bqa)((com.tencent.mm.ab.b)paramq).dIE.dIL;
    if ((paramq.Id().qWB != 207) && (paramq.Id().qWB != 0))
    {
      y.Mc("@__weixintimtline");
      this.diJ.a(paramInt2, paramInt3, paramString, this);
      return;
    }
    if (paramArrayOfByte.smA != null)
    {
      x.d("MicroMsg.NetSceneSnsPreTimeLine", "serverConfig  " + paramArrayOfByte.smA.snN + " " + paramArrayOfByte.smA.snM);
      paramInt1 = paramArrayOfByte.smA.snN;
      com.tencent.mm.plugin.sns.c.a.nkE = paramInt1;
      if (paramInt1 <= 0) {
        com.tencent.mm.plugin.sns.c.a.nkE = Integer.MAX_VALUE;
      }
      com.tencent.mm.storage.z.sOr = paramArrayOfByte.smA.snM;
    }
    this.nnV = paramArrayOfByte.smy;
    this.nnW = paramArrayOfByte.smz;
    x.i("MicroMsg.NetSceneSnsPreTimeLine", "for same md5 count: " + paramArrayOfByte.smy + " , objCount:  " + paramArrayOfByte.rXE + " cflag : " + paramArrayOfByte.smz);
    this.Ma = paramArrayOfByte.rXE;
    String str = i.eG(0L);
    if (!paramArrayOfByte.rgH.isEmpty()) {
      x.i("MicroMsg.NetSceneSnsPreTimeLine", "respone size " + paramArrayOfByte.rgH.size() + " Max " + ((boy)paramArrayOfByte.rgH.getFirst()).rlK + " " + i.eF(((boy)paramArrayOfByte.rgH.getFirst()).rlK) + "  respone min  " + ((boy)paramArrayOfByte.rgH.getLast()).rlK + " " + i.eF(((boy)paramArrayOfByte.rgH.getLast()).rlK));
    }
    for (;;)
    {
      this.Ma = paramArrayOfByte.rXE;
      if (!this.not.equals(paramArrayOfByte.smu)) {
        break;
      }
      this.nnT = af.byo().e(0L, this.nnV, true);
      x.i("MicroMsg.NetSceneSnsPreTimeLine", "md5 is no change!! the new minid %s", new Object[] { Long.valueOf(this.nnT) });
      y.Mc("@__weixintimtline");
      this.diJ.a(paramInt2, paramInt3, paramString, this);
      return;
      x.i("MicroMsg.NetSceneSnsPreTimeLine", " respone is Empty");
    }
    x.d("MicroMsg.NetSceneSnsPreTimeLine", "fp resp list size " + paramArrayOfByte.rgH.size() + " adsize : " + paramArrayOfByte.snW);
    af.bys().f("@__weixintimtline", paramArrayOfByte.smu, ab.a(paramArrayOfByte.slZ));
    paramInt1 = 0;
    while (paramInt1 < paramArrayOfByte.snX.size())
    {
      Object localObject3 = (cg)paramArrayOfByte.snX.get(paramInt1);
      localObject1 = ab.a(((cg)localObject3).rcC);
      localObject2 = ab.a(((cg)localObject3).rcB.slY);
      localObject3 = ab.b(((cg)localObject3).rcB.slX.smH);
      x.i("MicroMsg.NetSceneSnsPreTimeLine", "skXml " + (String)localObject1);
      x.i("MicroMsg.NetSceneSnsPreTimeLine", "adXml " + (String)localObject2);
      x.i("MicroMsg.NetSceneSnsPreTimeLine", "snsXml " + (String)localObject3 + "\r\n");
      paramInt1 += 1;
    }
    a.e(paramArrayOfByte.snX, paramArrayOfByte.rgH);
    a.ad(paramArrayOfByte.snX);
    if (paramArrayOfByte.snW == 0)
    {
      x.i("MicroMsg.NetSceneSnsPreTimeLine", "recv %d recommend", new Object[] { Integer.valueOf(paramArrayOfByte.snY) });
      a.d(paramArrayOfByte.snZ, paramArrayOfByte.rgH);
      a.ac(paramArrayOfByte.snZ);
    }
    Object localObject1 = new LinkedList();
    Object localObject2 = paramArrayOfByte.rgH.iterator();
    while (((Iterator)localObject2).hasNext()) {
      ((LinkedList)localObject1).add(Long.valueOf(((boy)((Iterator)localObject2).next()).rlK));
    }
    localObject2 = new qm();
    ((qm)localObject2).cba.cbb = ((LinkedList)localObject1);
    com.tencent.mm.sdk.b.a.sFg.m((com.tencent.mm.sdk.b.b)localObject2);
    if (paramq.Id().qWB == 207)
    {
      if (paramArrayOfByte.rgH.isEmpty()) {
        af.byo().bBv();
      }
      for (;;)
      {
        y.Mc("@__weixintimtline");
        this.diJ.a(paramInt2, paramInt3, paramString, this);
        return;
        af.byo().Nr(i.eG(((boy)paramArrayOfByte.rgH.getFirst()).rlK));
        af.byo().Nq(i.eG(((boy)paramArrayOfByte.rgH.getLast()).rlK));
        a(paramArrayOfByte, str);
        a.ae(paramArrayOfByte.rgH);
      }
    }
    if (paramArrayOfByte.rgH.isEmpty()) {
      af.byo().bBv();
    }
    for (;;)
    {
      y.Mc("@__weixintimtline");
      this.diJ.a(paramInt2, paramInt3, paramString, this);
      return;
      a(paramArrayOfByte, str);
      a.ae(paramArrayOfByte.rgH);
    }
  }
  
  public final int getType()
  {
    return 718;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/model/t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */