package com.tencent.mm.plugin.remittance.bankcard.a;

import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.kernel.g;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.aym;
import com.tencent.mm.protocal.c.ayn;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.aa.a;

public final class k
  extends b
{
  private com.tencent.mm.ab.b diG;
  private com.tencent.mm.ab.e diJ;
  public ayn muc;
  
  public k()
  {
    b.a locala = new b.a();
    locala.dIG = new aym();
    locala.dIH = new ayn();
    locala.dIF = 1280;
    locala.uri = "/cgi-bin/mmpay-bin/operation_tsbc";
    locala.dII = 0;
    locala.dIJ = 0;
    this.diG = locala.KT();
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  protected final void b(int paramInt1, int paramInt2, String paramString, q paramq)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetSceneBankRemitOperation", "errType: %s, errCode: %s, errMsg: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    this.muc = ((ayn)((com.tencent.mm.ab.b)paramq).dIE.dIL);
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetSceneBankRemitOperation", "retcode: %s, retmsg: %s", new Object[] { Integer.valueOf(this.muc.hUm), this.muc.hUn });
    if ((!this.hUU) && (!this.hUV))
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetSceneBankRemitOperation", "min_poundage: %s, max_amount: %s", new Object[] { Integer.valueOf(this.muc.sbr), Integer.valueOf(this.muc.sbs) });
      if (this.muc.sbr >= 0) {
        g.Ei().DT().a(aa.a.sZi, Integer.valueOf(this.muc.sbr));
      }
      if (this.muc.sbs > 0) {
        g.Ei().DT().a(aa.a.sZj, Integer.valueOf(this.muc.sbs));
      }
      if (!bi.oW(this.muc.sbt)) {
        g.Ei().DT().a(aa.a.sZk, this.muc.sbt);
      }
    }
    if (this.diJ != null) {
      this.diJ.a(paramInt1, paramInt2, paramString, this);
    }
  }
  
  protected final void f(q paramq)
  {
    paramq = (ayn)((com.tencent.mm.ab.b)paramq).dIE.dIL;
    this.uXe = paramq.hUm;
    this.uXf = paramq.hUn;
  }
  
  public final int getType()
  {
    return 1280;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/remittance/bankcard/a/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */