package com.tencent.mm.plugin.remittance.bankcard.a;

import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.rz;
import com.tencent.mm.protocal.c.sa;
import com.tencent.mm.sdk.platformtools.x;

public final class f
  extends b
{
  private final String TAG = "MicroMsg.NetSceneBankRemitDeleteRecord";
  private com.tencent.mm.ab.b diG;
  private com.tencent.mm.ab.e diJ;
  public String mtT;
  public sa mtX;
  
  public f(String paramString)
  {
    b.a locala = new b.a();
    locala.dIG = new rz();
    locala.dIH = new sa();
    locala.dIF = 1395;
    locala.uri = "/cgi-bin/mmpay-bin/deleterecord_tsbc";
    locala.dII = 0;
    locala.dIJ = 0;
    this.diG = locala.KT();
    ((rz)this.diG.dID.dIL).muA = paramString;
    this.mtT = paramString;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void b(int paramInt1, int paramInt2, String paramString, q paramq)
  {
    x.i("MicroMsg.NetSceneBankRemitDeleteRecord", "errType: %s, errCode: %s, errMsg: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    this.mtX = ((sa)((com.tencent.mm.ab.b)paramq).dIE.dIL);
    x.i("MicroMsg.NetSceneBankRemitDeleteRecord", "retcode: %s, retmsg: %s", new Object[] { Integer.valueOf(this.mtX.hUm), this.mtX.hUn });
    if (this.diJ != null) {
      this.diJ.a(paramInt1, paramInt2, paramString, this);
    }
  }
  
  protected final void f(q paramq)
  {
    paramq = (sa)((com.tencent.mm.ab.b)paramq).dIE.dIL;
    this.uXe = paramq.hUm;
    this.uXf = paramq.hUn;
  }
  
  public final int getType()
  {
    return 1395;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/remittance/bankcard/a/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */