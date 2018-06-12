package com.tencent.mm.plugin.remittance.bankcard.a;

import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.nb;
import com.tencent.mm.protocal.c.nc;
import com.tencent.mm.sdk.platformtools.x;

public final class d
  extends b
{
  private final String TAG = "MicroMsg.NetSceneBankRemitCheckBankBind";
  private com.tencent.mm.ab.b diG;
  private com.tencent.mm.ab.e diJ;
  public nc mtV;
  
  public d(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new nb();
    ((b.a)localObject).dIH = new nc();
    ((b.a)localObject).dIF = 1349;
    ((b.a)localObject).uri = "/cgi-bin/mmpay-bin/checkbankbind_tsbc";
    ((b.a)localObject).dII = 0;
    ((b.a)localObject).dIJ = 0;
    this.diG = ((b.a)localObject).KT();
    localObject = (nb)this.diG.dID.dIL;
    ((nb)localObject).rrg = paramString1;
    ((nb)localObject).rrh = paramString2;
    ((nb)localObject).knE = paramString3;
    ((nb)localObject).lMV = paramString4;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void b(int paramInt1, int paramInt2, String paramString, q paramq)
  {
    x.i("MicroMsg.NetSceneBankRemitCheckBankBind", "errType: %s, errCode: %s, errMsg: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    this.mtV = ((nc)((com.tencent.mm.ab.b)paramq).dIE.dIL);
    x.i("MicroMsg.NetSceneBankRemitCheckBankBind", "retcode: %s, retmsg: %s", new Object[] { Integer.valueOf(this.mtV.hUm), this.mtV.hUn });
    if (this.diJ != null) {
      this.diJ.a(paramInt1, paramInt2, paramString, this);
    }
  }
  
  protected final void f(q paramq)
  {
    paramq = (nc)((com.tencent.mm.ab.b)paramq).dIE.dIL;
    this.uXe = paramq.hUm;
    this.uXf = paramq.hUn;
  }
  
  public final int getType()
  {
    return 1349;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/remittance/bankcard/a/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */