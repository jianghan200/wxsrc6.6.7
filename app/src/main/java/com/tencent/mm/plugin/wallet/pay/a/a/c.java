package com.tencent.mm.plugin.wallet.pay.a.a;

import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.wallet.a.p;
import com.tencent.mm.plugin.wallet_core.model.Authen;
import com.tencent.mm.plugin.wallet_core.model.Orders;
import com.tencent.mm.plugin.wallet_core.model.ag;
import com.tencent.mm.pluginsdk.wallet.PayInfo;
import com.tencent.mm.sdk.platformtools.x;
import java.util.Map;
import org.json.JSONObject;

public final class c
  extends b
{
  private boolean pfj;
  private boolean pfk;
  private boolean pfl;
  
  public c(Authen paramAuthen, Orders paramOrders, boolean paramBoolean)
  {
    super(paramAuthen, paramOrders);
    this.pfl = paramBoolean;
    bNw();
  }
  
  private void bNw()
  {
    this.pfj = false;
    p.bNp();
    if ((p.bNq().prG != null) && (this.pfc.mpb != null) && (!this.pfl))
    {
      if ((this.pfc.mpb.bVY != 31) && (this.pfc.mpb.bVY != 32) && (this.pfc.mpb.bVY != 33) && (this.pfc.mpb.bVY != 42) && (this.pfc.mpb.bVY != 37)) {
        break label157;
      }
      this.pfj = true;
    }
    for (;;)
    {
      x.i("MicroMsg.NetSceneTenpayBalanceBindAuthen", "isLqtSns: %s, isLqtTs: %s, isBalance: %s", new Object[] { Boolean.valueOf(this.pfj), Boolean.valueOf(this.pfk), Boolean.valueOf(this.pfl) });
      return;
      label157:
      this.pfk = true;
    }
  }
  
  public final int If()
  {
    bNw();
    if (this.pfj) {
      return 1274;
    }
    if (this.pfk) {
      return 1259;
    }
    return 1600;
  }
  
  protected final void Q(Map<String, String> paramMap)
  {
    bNw();
    if ((this.pfj) || (this.pfk)) {
      paramMap.put("busi_scene", this.pfc.lMV);
    }
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    if (this.pfj) {
      h.mEJ.a(663L, 24L, 1L, false);
    }
    for (;;)
    {
      return super.a(parame, parame1);
      if (this.pfk) {
        h.mEJ.a(663L, 20L, 1L, false);
      }
    }
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    super.a(paramInt, paramString, paramJSONObject);
    if (paramInt != 0)
    {
      if (!this.pfj) {
        break label33;
      }
      h.mEJ.a(663L, 25L, 1L, false);
    }
    label33:
    while (!this.pfk) {
      return;
    }
    h.mEJ.a(663L, 21L, 1L, false);
  }
  
  public final int aBO()
  {
    return 120;
  }
  
  public final String getUri()
  {
    bNw();
    if (this.pfj) {
      return "/cgi-bin/mmpay-bin/tenpay/snslqtpaybindauthen";
    }
    if (this.pfk) {
      return "/cgi-bin/mmpay-bin/tenpay/lqtpaybindauthen";
    }
    return "/cgi-bin/mmpay-bin/tenpay/banpaybindauthen";
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/wallet/pay/a/a/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */