package com.tencent.mm.wallet_core.c;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.wallet_core.model.i;
import com.tencent.mm.protocal.c.kq;
import com.tencent.mm.protocal.c.kr;
import com.tencent.mm.sdk.platformtools.x;

public final class e
  extends m
{
  private b diG;
  private com.tencent.mm.ab.e diJ;
  
  public e(String paramString1, String paramString2)
  {
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new kq();
    ((b.a)localObject).dIH = new kr();
    ((b.a)localObject).uri = "/cgi-bin/mmpay-bin/cancelqrpay";
    ((b.a)localObject).dIF = 410;
    ((b.a)localObject).dII = 198;
    ((b.a)localObject).dIJ = 1000000198;
    this.diG = ((b.a)localObject).KT();
    localObject = (kq)this.diG.dID.dIL;
    ((kq)localObject).rmP = paramString1;
    ((kq)localObject).reo = paramString2;
    ((kq)localObject).rmQ = i.bOL();
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void e(int paramInt1, int paramInt2, String paramString, q paramq)
  {
    x.d("MicroMsg.NetSceneCancelQRPay", "errType:" + paramInt1 + ",errCode:" + paramInt2 + ",errMsg" + paramString);
    this.diJ.a(paramInt1, paramInt2, paramString, this);
  }
  
  public final int getType()
  {
    return 410;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/wallet_core/c/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */