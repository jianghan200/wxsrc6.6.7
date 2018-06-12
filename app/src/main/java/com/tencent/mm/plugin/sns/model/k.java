package com.tencent.mm.plugin.sns.model;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.modelstat.p;
import com.tencent.mm.network.q;
import com.tencent.mm.platformtools.ab;
import com.tencent.mm.plugin.sns.storage.f;
import com.tencent.mm.protocal.c.bnz;
import com.tencent.mm.protocal.c.boa;
import com.tencent.mm.protocal.c.boc;
import com.tencent.mm.protocal.c.boh;
import com.tencent.mm.protocal.c.boi;
import com.tencent.mm.protocal.c.bon;
import com.tencent.mm.protocal.c.boy;
import com.tencent.mm.protocal.c.bpm;
import com.tencent.mm.protocal.c.bqx;
import com.tencent.mm.protocal.c.bsu;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.LinkedList;

public final class k
  extends l
  implements com.tencent.mm.network.k
{
  private b diG;
  public com.tencent.mm.ab.e diJ;
  private String nnN;
  private boi nnO;
  private int type;
  
  public k(boi paramboi, String paramString1, String paramString2)
  {
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new bnz();
    ((b.a)localObject).dIH = new boa();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/mmsnsadcomment";
    ((b.a)localObject).dIF = 682;
    ((b.a)localObject).dII = 0;
    ((b.a)localObject).dIJ = 0;
    this.diG = ((b.a)localObject).KT();
    localObject = (bnz)this.diG.dID.dIL;
    ((bnz)localObject).slU = paramboi;
    this.type = paramboi.smo.hcE;
    this.nnO = paramboi;
    ((bnz)localObject).rcc = paramString1;
    this.nnN = paramString1;
    long l = paramboi.rlK;
    paramString1 = af.byr().eZ(l);
    if (paramString1 != null)
    {
      paramString1 = paramString1.bAJ();
      if (paramString1 != null)
      {
        paramString1 = p.nn(paramString1.nNV);
        if (paramString1 != null)
        {
          ((bnz)localObject).slV = ab.oT(p.a(paramString1));
          ((bnz)localObject).rdq = paramString1.source;
        }
        ((bnz)localObject).slT = ab.oT(bi.aG(paramString2, ""));
        x.i("MicroMsg.NetSceneSnsAdComment", paramboi.smo.seC + " " + paramboi.smo.rxF + " type " + paramboi.smo.hcE + " aduxinfo " + paramString2 + ", SnsStat=" + ((bnz)localObject).slV + ", source=" + ((bnz)localObject).rdq);
        return;
      }
      x.v("SnsAdExtUtil", "parseStatSnsAdInfo snsInfo null, snsId %d", new Object[] { Long.valueOf(l) });
    }
    for (;;)
    {
      paramString1 = null;
      break;
      x.v("SnsAdExtUtil", "parseStatSnsAdInfo snsInfo null, snsId %d", new Object[] { Long.valueOf(l) });
    }
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.d("MicroMsg.NetSceneSnsAdComment", "netId : " + paramInt1 + " errType :" + paramInt2 + " errCode: " + paramInt3 + " errMsg :" + paramString);
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
    if ((paramq.hcE == 1) || (paramq.hcE == 2) || (paramq.hcE == 3) || (paramq.hcE == 5) || (paramq.hcE == 7) || (paramq.hcE == 8))
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
        paramq = (bnz)this.diG.dID.dIL;
        paramArrayOfByte = (boa)this.diG.dIE.dIL;
        if ((paramq.rdq != 1) && (paramq.rdq != 2)) {
          continue;
        }
        paramArrayOfByte = paramArrayOfByte.sgK;
        paramq = paramArrayOfByte.slX;
        a.a(paramArrayOfByte);
        x.d("MicroMsg.NetSceneSnsAdComment", "snsComment:" + paramq.toString() + " " + paramq.smL.size() + " " + paramq.smO.size());
      }
      catch (Exception paramq)
      {
        x.printErrStackTrace("MicroMsg.NetSceneSnsAdComment", paramq, "", new Object[0]);
        continue;
      }
      af.byn().bxP();
      break;
      paramArrayOfByte = paramArrayOfByte.rcB;
      paramq = paramArrayOfByte.slX;
      a.a(paramArrayOfByte);
    }
  }
  
  public final int getType()
  {
    return 682;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/sns/model/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */