package com.tencent.mm.plugin.wallet_ecard.a;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.bdd;
import com.tencent.mm.protocal.c.bde;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.wallet_core.c.h;

public final class g
  extends h
{
  private b diG;
  private com.tencent.mm.ab.e diJ;
  public bde pCe;
  
  public g()
  {
    b.a locala = new b.a();
    locala.dIG = new bdd();
    locala.dIH = new bde();
    locala.dIF = 2931;
    locala.uri = "/cgi-bin/mmpay-bin/qrycancelecarddesc";
    locala.dII = 0;
    locala.dIJ = 0;
    this.diG = locala.KT();
    ((bdd)this.diG.dID.dIL).sfn = 1L;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  protected final void b(int paramInt1, int paramInt2, String paramString, q paramq)
  {
    x.i("MicroMsg.NetSceneQryECardLogout", "errType: %s, errCode: %s, errMsg: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    this.pCe = ((bde)((b)paramq).dIE.dIL);
    x.i("MicroMsg.NetSceneQryECardLogout", "retcode: %s, retmsg: %s", new Object[] { Integer.valueOf(this.pCe.hwV), this.pCe.hwW });
    if (this.diJ != null) {
      this.diJ.a(paramInt1, paramInt2, paramString, this);
    }
  }
  
  protected final void f(q paramq)
  {
    paramq = (bde)((b)paramq).dIE.dIL;
    this.uXe = paramq.hwV;
    this.uXf = paramq.hwW;
  }
  
  public final int getType()
  {
    return 2931;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/wallet_ecard/a/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */