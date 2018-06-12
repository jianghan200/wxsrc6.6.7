package com.tencent.mm.plugin.remittance.bankcard.a;

import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.rx;
import com.tencent.mm.protocal.c.ry;
import com.tencent.mm.sdk.platformtools.x;

public final class e
  extends b
{
  private final String TAG = "MicroMsg.NetSceneBankRemitDeleteHistory";
  private com.tencent.mm.ab.b diG;
  private com.tencent.mm.ab.e diJ;
  public String hTH;
  public ry mtW;
  
  public e(String paramString)
  {
    b.a locala = new b.a();
    locala.dIG = new rx();
    locala.dIH = new ry();
    locala.dIF = 1737;
    locala.uri = "/cgi-bin/mmpay-bin/deletehistoryrecord_tsbc";
    locala.dII = 0;
    locala.dIJ = 0;
    this.diG = locala.KT();
    ((rx)this.diG.dID.dIL).rlf = paramString;
    this.hTH = paramString;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void b(int paramInt1, int paramInt2, String paramString, q paramq)
  {
    x.i("MicroMsg.NetSceneBankRemitDeleteHistory", "errType: %s, errCode: %s, errMsg: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    this.mtW = ((ry)((com.tencent.mm.ab.b)paramq).dIE.dIL);
    x.i("MicroMsg.NetSceneBankRemitDeleteHistory", "retcode: %s, retmsg: %s", new Object[] { Integer.valueOf(this.mtW.hUm), this.mtW.hUn });
    if (this.diJ != null) {
      this.diJ.a(paramInt1, paramInt2, paramString, this);
    }
  }
  
  protected final void f(q paramq)
  {
    paramq = (ry)((com.tencent.mm.ab.b)paramq).dIE.dIL;
    this.uXe = paramq.hUm;
    this.uXf = paramq.hUn;
  }
  
  public final int getType()
  {
    return 1737;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/remittance/bankcard/a/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */