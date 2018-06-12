package com.tencent.mm.plugin.remittance.bankcard.a;

import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.bds;
import com.tencent.mm.protocal.c.bdt;
import com.tencent.mm.sdk.platformtools.x;

public final class l
  extends b
{
  private final String TAG = "MicroMsg.NetSceneBankRemitQueryDetail";
  private com.tencent.mm.ab.b diG;
  private com.tencent.mm.ab.e diJ;
  public bdt mud;
  
  public l(String paramString)
  {
    b.a locala = new b.a();
    locala.dIG = new bds();
    locala.dIH = new bdt();
    locala.dIF = 1579;
    locala.uri = "/cgi-bin/mmpay-bin/querydetail_tsbc";
    locala.dII = 0;
    locala.dIJ = 0;
    this.diG = locala.KT();
    ((bds)this.diG.dID.dIL).rlf = paramString;
    x.i("MicroMsg.NetSceneBankRemitQueryDetail", "bill id: %s", new Object[] { paramString });
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void b(int paramInt1, int paramInt2, String paramString, q paramq)
  {
    x.i("MicroMsg.NetSceneBankRemitQueryDetail", "errType: %s, errCode: %s, errMsg: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    this.mud = ((bdt)((com.tencent.mm.ab.b)paramq).dIE.dIL);
    if (this.diJ != null) {
      this.diJ.a(paramInt1, paramInt2, paramString, this);
    }
  }
  
  protected final void f(q paramq)
  {
    paramq = (bdt)((com.tencent.mm.ab.b)paramq).dIE.dIL;
    this.uXe = paramq.hUm;
    this.uXf = paramq.hUn;
  }
  
  public final int getType()
  {
    return 1579;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/remittance/bankcard/a/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */