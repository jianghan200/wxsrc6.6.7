package com.tencent.mm.plugin.sns.model;

import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.platformtools.ab;
import com.tencent.mm.plugin.sns.storage.f;
import com.tencent.mm.plugin.sns.storage.n;
import com.tencent.mm.protocal.c.bbo;
import com.tencent.mm.protocal.c.bhy;
import com.tencent.mm.protocal.c.bhz;
import com.tencent.mm.protocal.c.boh;
import com.tencent.mm.protocal.c.boi;
import com.tencent.mm.protocal.c.bon;
import com.tencent.mm.protocal.c.boo;
import com.tencent.mm.protocal.c.bop;
import com.tencent.mm.protocal.c.boy;
import com.tencent.mm.protocal.c.bpg;
import com.tencent.mm.sdk.platformtools.x;
import java.util.LinkedList;
import java.util.Locale;

public final class o
  extends l
  implements k
{
  private com.tencent.mm.ab.b diG;
  public com.tencent.mm.ab.e diJ;
  private String nnN;
  private boi nnO;
  private int type;
  
  public o(boi paramboi, String paramString)
  {
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new boo();
    ((b.a)localObject).dIH = new bop();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/mmsnscomment";
    ((b.a)localObject).dIF = 213;
    ((b.a)localObject).dII = 100;
    ((b.a)localObject).dIJ = 1000000100;
    this.diG = ((b.a)localObject).KT();
    localObject = (boo)this.diG.dID.dIL;
    ((boo)localObject).slU = paramboi;
    this.type = paramboi.smo.hcE;
    this.nnO = paramboi;
    ((boo)localObject).rcc = paramString;
    this.nnN = paramString;
    x.d("MicroMsg.NetSceneSnsComment", paramboi.smo.seC + " " + paramboi.smo.rxF);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    Object localObject2 = af.byo().fi(this.nnO.rlK);
    Object localObject1 = localObject2;
    if (localObject2 == null)
    {
      com.tencent.mm.plugin.sns.storage.e locale = af.byr().eZ(this.nnO.rlK);
      localObject1 = localObject2;
      if (locale != null) {
        localObject1 = locale.bAL();
      }
    }
    if (localObject1 != null) {}
    try
    {
      localObject1 = (boy)new boy().aG(((n)localObject1).field_attrBuf);
      if ((((boy)localObject1).smY != null) && (((boy)localObject1).smY.siL))
      {
        localObject2 = (bpg)new bpg().aG(((boy)localObject1).smY.siK.lR);
        localObject1 = (boo)this.diG.dID.dIL;
        if (((bpg)localObject2).snn != null)
        {
          localObject2 = String.format(Locale.US, "preloadLayerId=%d&preloadExpId=%d", new Object[] { Integer.valueOf(((bpg)localObject2).snn.rvt), Integer.valueOf(((bpg)localObject2).snn.rvu) });
          x.i("MicroMsg.NetSceneSnsComment", "doScene(sight_autodownload) snsStatExt:%s", new Object[] { localObject2 });
          ((boo)localObject1).slV = new bhz().VO((String)localObject2);
        }
      }
      this.diJ = parame1;
      return a(parame, this.diG, this);
    }
    catch (Exception localException)
    {
      for (;;)
      {
        x.printErrStackTrace("MicroMsg.NetSceneSnsComment", localException, "", new Object[0]);
      }
    }
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.d("MicroMsg.NetSceneSnsComment", "netId : " + paramInt1 + " errType :" + paramInt2 + " errCode: " + paramInt3 + " errMsg :" + paramString);
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      if (paramInt2 == 4) {
        af.byn().d(this.nnO.rlK, this.type, this.nnN);
      }
      this.diJ.a(paramInt2, paramInt3, paramString, this);
      return;
    }
    af.byn().d(this.nnO.rlK, this.type, this.nnN);
    paramq = this.nnO.smo;
    if ((paramq.hcE == 1) || (paramq.hcE == 2) || (paramq.hcE == 3) || (paramq.hcE == 5))
    {
      paramArrayOfByte = new bon();
      paramArrayOfByte.lOH = paramq.lOH;
      paramArrayOfByte.hcE = paramq.hcE;
      paramArrayOfByte.rdq = paramq.rdq;
      paramArrayOfByte.rdS = paramq.seC;
      paramArrayOfByte.rTW = paramq.sme;
      paramArrayOfByte.jSA = paramq.jSA;
      paramArrayOfByte.smm = paramq.smm;
    }
    for (;;)
    {
      try
      {
        paramArrayOfByte = ((bop)this.diG.dIE.dIL).slX;
        if ((paramq.hcE != 1) && (paramq.hcE != 5)) {
          continue;
        }
        x.i("MicroMsg.NetSceneSnsComment", "snsComment:" + paramArrayOfByte.rlK + " " + ab.b(paramArrayOfByte.smH) + " " + paramArrayOfByte.smL.size() + " " + paramArrayOfByte.smO.size());
        aj.d(paramArrayOfByte);
      }
      catch (Exception paramq)
      {
        x.printErrStackTrace("MicroMsg.NetSceneSnsComment", paramq, "", new Object[0]);
        continue;
      }
      af.byn().bxP();
      break;
      x.i("MicroMsg.NetSceneSnsComment", "snsComment:" + paramArrayOfByte.rlK + " " + paramArrayOfByte.smL.size() + " " + paramArrayOfByte.smO.size());
    }
  }
  
  public final int getType()
  {
    return 213;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/sns/model/o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */