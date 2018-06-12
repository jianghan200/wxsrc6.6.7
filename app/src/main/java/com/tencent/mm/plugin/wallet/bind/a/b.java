package com.tencent.mm.plugin.wallet.bind.a;

import com.tencent.mm.network.q;
import com.tencent.mm.plugin.wallet.a.p;
import com.tencent.mm.plugin.wallet_core.model.ag;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.wallet_core.c.m;

public final class b
  extends m
{
  private com.tencent.mm.ab.b diG;
  private com.tencent.mm.ab.e diJ;
  private String pct;
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void e(int paramInt1, int paramInt2, String paramString, q paramq)
  {
    x.d("MicroMsg.NetSceneSetMainBankCard", "errType:" + paramInt1 + ",errCode:" + paramInt2 + ",errMsg" + paramString);
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      p.bNp();
      p.bNq();
      ag.Pc(this.pct);
    }
    this.diJ.a(paramInt1, paramInt2, paramString, this);
  }
  
  public final int getType()
  {
    return 621;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/wallet/bind/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */