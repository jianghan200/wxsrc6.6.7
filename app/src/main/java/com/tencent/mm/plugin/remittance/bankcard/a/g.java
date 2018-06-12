package com.tencent.mm.plugin.remittance.bankcard.a;

import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.zx;
import com.tencent.mm.protocal.c.zy;
import com.tencent.mm.sdk.platformtools.x;

public final class g
  extends b
{
  private final String TAG = "MicroMsg.NetSceneBankRemitGetBankInfo";
  public String bKg;
  private com.tencent.mm.ab.b diG;
  private com.tencent.mm.ab.e diJ;
  public zy mtY;
  
  public g(String paramString1, String paramString2)
  {
    b.a locala = new b.a();
    locala.dIG = new zx();
    locala.dIH = new zy();
    locala.dIF = 1542;
    locala.uri = "/cgi-bin/mmpay-bin/getbankinfo_tsbc";
    locala.dII = 0;
    locala.dIJ = 0;
    this.diG = locala.KT();
    ((zx)this.diG.dID.dIL).rrh = paramString1;
    this.bKg = paramString2;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void b(int paramInt1, int paramInt2, String paramString, q paramq)
  {
    x.i("MicroMsg.NetSceneBankRemitGetBankInfo", "errType: %s, errCode: %s, errMsg: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    this.mtY = ((zy)((com.tencent.mm.ab.b)paramq).dIE.dIL);
    x.i("MicroMsg.NetSceneBankRemitGetBankInfo", "retcode: %s, retmsg: %s", new Object[] { Integer.valueOf(this.mtY.hUm), this.mtY.hUn });
    if (this.diJ != null) {
      this.diJ.a(paramInt1, paramInt2, paramString, this);
    }
  }
  
  protected final void f(q paramq)
  {
    paramq = (zy)((com.tencent.mm.ab.b)paramq).dIE.dIL;
    this.uXe = paramq.hUm;
    this.uXf = paramq.hUn;
  }
  
  public final int getType()
  {
    return 1542;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/remittance/bankcard/a/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */