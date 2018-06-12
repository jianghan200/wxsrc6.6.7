package com.tencent.mm.plugin.wallet_payu.order.a;

import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.baf;
import com.tencent.mm.protocal.c.bag;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.wallet_core.c.m;

public final class b
  extends m
{
  private com.tencent.mm.ab.b diG;
  private com.tencent.mm.ab.e diJ;
  
  public b(String paramString)
  {
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new baf();
    ((b.a)localObject).dIH = new bag();
    ((b.a)localObject).uri = "/cgi-bin/mmpay-bin/payudeluserroll";
    ((b.a)localObject).dIF = 1544;
    ((b.a)localObject).dII = 0;
    ((b.a)localObject).dIJ = 0;
    this.diG = ((b.a)localObject).KT();
    localObject = (baf)this.diG.dID.dIL;
    if (!bi.oW(paramString)) {
      ((baf)localObject).lOE = paramString;
    }
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void e(int paramInt1, int paramInt2, String paramString, q paramq)
  {
    x.d("MicroMsg.NetScenePayUDelUserRoll", "errType:" + paramInt1 + ",errCode:" + paramInt2 + ",errMsg" + paramString);
    this.diJ.a(paramInt1, paramInt2, paramString, this);
  }
  
  public final int getType()
  {
    return 1544;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/wallet_payu/order/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */