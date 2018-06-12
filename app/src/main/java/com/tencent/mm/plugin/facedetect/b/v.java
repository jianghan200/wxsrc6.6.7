package com.tencent.mm.plugin.facedetect.b;

import com.tencent.mm.ab.l.a;
import com.tencent.mm.ab.l.b;
import com.tencent.mm.modelcdntran.g;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.platformtools.ab;
import com.tencent.mm.protocal.c.aai;
import com.tencent.mm.protocal.c.avt;
import com.tencent.mm.protocal.c.bhy;
import com.tencent.mm.protocal.c.lj;
import com.tencent.mm.sdk.platformtools.x;

public final class v
  extends p
  implements k, b
{
  private final q dJM = new h();
  private long iML = -1L;
  private byte[] iMM = null;
  
  public v(int paramInt)
  {
    i.a locala = (i.a)this.dJM.KV();
    locala.iMp.rFO = p.iMG;
    locala.iMp.hcE = 1;
    locala.iMp.otY = paramInt;
  }
  
  final void AQ(String paramString)
  {
    ((i.a)this.dJM.KV()).iMp.rFO = paramString;
  }
  
  protected final int Cc()
  {
    return 3;
  }
  
  protected final int a(q paramq)
  {
    return l.b.dJm;
  }
  
  protected final void a(l.a parama) {}
  
  public final long aJp()
  {
    return this.iML;
  }
  
  public final byte[] aJq()
  {
    return this.iMM;
  }
  
  public final void c(int paramInt1, int paramInt2, String paramString, q paramq)
  {
    x.d("MicroMsg.NetSceneGetBioConfigRsa", "hy: onGYNetEnd  errType:" + paramInt1 + " errCode:" + paramInt2);
    i.b localb;
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      localb = (i.b)paramq.Id();
      this.iML = localb.iMq.rFP;
      if (localb.iMq.rFQ != null) {
        this.iMM = localb.iMq.rFQ.lR;
      }
      if (localb.iMq.rFS != null)
      {
        if ((localb.iMq.rFS.roF == null) || (localb.iMq.rFS.roF.siI <= 0)) {
          break label383;
        }
        x.i("MicroMsg.NetSceneGetBioConfigRsa", "summersafecdn onGYNetEnd cdnrule:%d", new Object[] { Integer.valueOf(localb.iMq.rFS.roF.siI) });
      }
    }
    label383:
    for (paramq = ab.a(localb.iMq.rFS.roF);; paramq = null)
    {
      if ((localb.iMq.rFS.roG != null) && (localb.iMq.rFS.roG.siI > 0)) {
        x.i("MicroMsg.NetSceneGetBioConfigRsa", "summersafecdn onGYNetEnd safecdnrule:%d", new Object[] { Integer.valueOf(localb.iMq.rFS.roG.siI) });
      }
      for (byte[] arrayOfByte = ab.a(localb.iMq.rFS.roG);; arrayOfByte = null)
      {
        g.NE().a(localb.iMq.rFS.roC, localb.iMq.rFS.roD, localb.iMq.rFS.roE, paramq, arrayOfByte, localb.iMq.rFS.roH);
        long l = this.iML;
        if (this.iMM == null) {}
        for (int i = 0;; i = this.iMM.length)
        {
          x.i("MicroMsg.NetSceneGetBioConfigRsa", "hy: get bio config: bioId: %s, bioConfigSize: %d", new Object[] { Long.valueOf(l), Integer.valueOf(i) });
          this.diJ.a(paramInt1, paramInt2, paramString, this);
          return;
        }
      }
    }
  }
  
  final int g(com.tencent.mm.network.e parame)
  {
    return a(parame, this.dJM, this);
  }
  
  protected final avt g(q paramq)
  {
    return ((i.b)paramq.Id()).iMq.rFR;
  }
  
  public final int getType()
  {
    return 733;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/facedetect/b/v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */