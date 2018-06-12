package com.tencent.mm.plugin.wallet.pay.a.d;

import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.plugin.wallet_core.model.Orders;
import com.tencent.mm.plugin.wallet_core.model.ag;
import com.tencent.mm.pluginsdk.wallet.PayInfo;
import com.tencent.mm.sdk.platformtools.x;
import java.util.Map;
import org.json.JSONObject;

public final class b
  extends e
{
  private boolean pfj = false;
  private boolean pfk;
  
  public b(com.tencent.mm.plugin.wallet_core.model.p paramp, Orders paramOrders)
  {
    super(paramp, paramOrders);
    bNw();
  }
  
  private void bNw()
  {
    this.pfj = false;
    com.tencent.mm.plugin.wallet.a.p.bNp();
    if ((com.tencent.mm.plugin.wallet.a.p.bNq().prG != null) && (this.pfq.mpb != null))
    {
      String str = this.pfq.lMV;
      com.tencent.mm.plugin.wallet.a.p.bNp();
      if (str.equals(com.tencent.mm.plugin.wallet.a.p.bNq().prG.field_bankcardType))
      {
        if ((this.pfq.mpb.bVY != 31) && (this.pfq.mpb.bVY != 32) && (this.pfq.mpb.bVY != 33) && (this.pfq.mpb.bVY != 42) && (this.pfq.mpb.bVY != 37)) {
          break label168;
        }
        this.pfj = true;
      }
    }
    for (;;)
    {
      x.i("MicroMsg.NetSceneTenpayPayVertify", "isLqtSns: %s, isLqtTs: %s", new Object[] { Boolean.valueOf(this.pfj), Boolean.valueOf(this.pfk) });
      return;
      label168:
      this.pfk = true;
    }
  }
  
  public final int If()
  {
    bNw();
    if (this.pfj) {
      return 1281;
    }
    if (this.pfk) {
      return 1305;
    }
    return 1601;
  }
  
  protected final void Q(Map<String, String> paramMap)
  {
    bNw();
    if ((this.pfj) || (this.pfk)) {
      paramMap.put("busi_scene", this.pfq.lMV);
    }
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    if (this.pfj) {
      h.mEJ.a(663L, 26L, 1L, false);
    }
    for (;;)
    {
      return super.a(parame, parame1);
      if (this.pfk) {
        h.mEJ.a(663L, 22L, 1L, false);
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
      h.mEJ.a(663L, 27L, 1L, false);
    }
    label33:
    while (!this.pfk) {
      return;
    }
    h.mEJ.a(663L, 23L, 1L, false);
  }
  
  public final int aBO()
  {
    return 121;
  }
  
  public final String getUri()
  {
    bNw();
    if (this.pfj) {
      return "/cgi-bin/mmpay-bin/tenpay/snslqtpaybindverify";
    }
    if (this.pfk) {
      return "/cgi-bin/mmpay-bin/tenpay/lqtpaybindverify";
    }
    return "/cgi-bin/mmpay-bin/tenpay/banpaybindverify";
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/wallet/pay/a/d/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */