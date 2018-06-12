package com.tencent.mm.plugin.remittance.bankcard.a;

import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.bhe;
import com.tencent.mm.protocal.c.bhf;
import com.tencent.mm.protocal.c.ck;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.wallet_core.c.d;

public final class n
  extends b
  implements d
{
  private final String TAG = "MicroMsg.NetSceneBankRemitRequestOrder";
  private com.tencent.mm.ab.b diG;
  private com.tencent.mm.ab.e diJ;
  public bhf muf;
  
  public n(String paramString1, String paramString2, String paramString3, int paramInt1, int paramInt2, String paramString4, int paramInt3, int paramInt4, String paramString5)
  {
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new bhe();
    ((b.a)localObject).dIH = new bhf();
    ((b.a)localObject).dIF = 1380;
    ((b.a)localObject).uri = "/cgi-bin/mmpay-bin/request_tsbc";
    ((b.a)localObject).dII = 0;
    ((b.a)localObject).dIJ = 0;
    this.diG = ((b.a)localObject).KT();
    localObject = (bhe)this.diG.dID.dIL;
    ((bhe)localObject).muA = paramString1;
    ((bhe)localObject).muB = paramString2;
    ((bhe)localObject).lMV = paramString3;
    ((bhe)localObject).mun = paramInt1;
    ((bhe)localObject).shY = paramInt2;
    ((bhe)localObject).shZ = paramString4;
    ((bhe)localObject).sia = paramInt3;
    ((bhe)localObject).sib = paramInt4;
    ((bhe)localObject).ref = paramString5;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final boolean aBQ()
  {
    boolean bool2 = true;
    boolean bool1 = bool2;
    if (this.muf.sic != null)
    {
      bool1 = bool2;
      if (this.muf.sic.bWA == 1) {
        bool1 = false;
      }
    }
    return bool1;
  }
  
  public final void b(int paramInt1, int paramInt2, String paramString, q paramq)
  {
    x.i("MicroMsg.NetSceneBankRemitRequestOrder", "errType: %s, errCode: %s, errMsg: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    this.muf = ((bhf)((com.tencent.mm.ab.b)paramq).dIE.dIL);
    x.i("MicroMsg.NetSceneBankRemitRequestOrder", "retcode: %s, retmsg: %s", new Object[] { Integer.valueOf(this.muf.hUm), this.muf.hUn });
    if (this.diJ != null) {
      this.diJ.a(paramInt1, paramInt2, paramString, this);
    }
  }
  
  protected final void f(q paramq)
  {
    paramq = (bhf)((com.tencent.mm.ab.b)paramq).dIE.dIL;
    this.uXe = paramq.hUm;
    this.uXf = paramq.hUn;
  }
  
  public final int getType()
  {
    return 1380;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/plugin/remittance/bankcard/a/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */