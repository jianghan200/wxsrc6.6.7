package com.tencent.mm.plugin.remittance.bankcard.a;

import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.aaa;
import com.tencent.mm.protocal.c.zz;
import com.tencent.mm.sdk.platformtools.x;

public final class h
  extends b
{
  private final String TAG = "MicroMsg.NetSceneBankRemitGetBankList";
  private com.tencent.mm.ab.b diG;
  private com.tencent.mm.ab.e diJ;
  public aaa mtZ;
  
  public h()
  {
    b.a locala = new b.a();
    locala.dIG = new zz();
    locala.dIH = new aaa();
    locala.dIF = 1399;
    locala.uri = "/cgi-bin/mmpay-bin/getbanklist_tsbc";
    locala.dII = 0;
    locala.dIJ = 0;
    this.diG = locala.KT();
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void b(int paramInt1, int paramInt2, String paramString, q paramq)
  {
    x.i("MicroMsg.NetSceneBankRemitGetBankList", "errType: %s, errCode: %s, errMsg: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    this.mtZ = ((aaa)((com.tencent.mm.ab.b)paramq).dIE.dIL);
    x.i("MicroMsg.NetSceneBankRemitGetBankList", "retcode: %s, retmsg: %s", new Object[] { Integer.valueOf(this.mtZ.hUm), this.mtZ.hUn });
    if ((!this.hUU) && (this.mtZ.hUm != 0)) {
      this.hUV = true;
    }
    if (this.diJ != null) {
      this.diJ.a(paramInt1, paramInt2, paramString, this);
    }
  }
  
  protected final void f(q paramq)
  {
    paramq = (aaa)((com.tencent.mm.ab.b)paramq).dIE.dIL;
    this.uXe = paramq.hUm;
    this.uXf = paramq.hUn;
  }
  
  public final int getType()
  {
    return 1399;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/remittance/bankcard/a/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */