package com.tencent.mm.plugin.wxpay;

import com.tencent.mm.bg.c;
import com.tencent.mm.kernel.b.f;
import com.tencent.mm.kernel.c.e;
import com.tencent.mm.plugin.offline.k;
import com.tencent.mm.plugin.wallet_core.model.o;

public class PluginWxPay
  extends f
  implements com.tencent.mm.plugin.wxpay.a.a
{
  public void configure(com.tencent.mm.kernel.b.g paramg)
  {
    if (paramg.ES())
    {
      pin(new com.tencent.mm.model.p(com.tencent.mm.plugin.aa.b.class));
      pin(new com.tencent.mm.model.p(com.tencent.mm.plugin.collect.a.a.class));
      pin(new com.tencent.mm.model.p(com.tencent.mm.plugin.luckymoney.a.a.class));
      pin(new com.tencent.mm.model.p(com.tencent.mm.plugin.mall.a.d.class));
      pin(new com.tencent.mm.model.p(k.class));
      pin(new com.tencent.mm.model.p(com.tencent.mm.plugin.order.a.b.class));
      pin(new com.tencent.mm.model.p(com.tencent.mm.plugin.product.a.a.class));
      pin(new com.tencent.mm.model.p(com.tencent.mm.plugin.recharge.a.a.class));
      pin(new com.tencent.mm.model.p(com.tencent.mm.plugin.remittance.a.b.class));
      pin(new com.tencent.mm.model.p(com.tencent.mm.plugin.wallet.a.p.class));
      pin(new com.tencent.mm.model.p(o.class));
      pin(new com.tencent.mm.model.p(com.tencent.mm.plugin.wallet_index.a.a.class));
      pin(new com.tencent.mm.model.p(com.tencent.mm.plugin.wallet_payu.a.d.class));
      pin(new com.tencent.mm.model.p(com.tencent.mm.plugin.wxcredit.a.class));
      pin(new com.tencent.mm.model.p(com.tencent.mm.plugin.fingerprint.a.class));
      pin(new com.tencent.mm.model.p(com.tencent.mm.plugin.wallet_ecard.a.class));
      pin(new com.tencent.mm.model.p(com.tencent.mm.plugin.honey_pay.a.class));
    }
    com.tencent.mm.kernel.g.a(com.tencent.mm.plugin.luckymoney.appbrand.a.class, new e(new com.tencent.mm.plugin.luckymoney.appbrand.b()));
  }
  
  public void dependency() {}
  
  public void execute(com.tencent.mm.kernel.b.g paramg)
  {
    if (paramg.ES())
    {
      c.Um("wallet");
      c.Um("mall");
      c.Um("wxcredit");
      c.Um("offline");
      c.Um("recharge");
      c.Um("wallet_index");
      c.Um("order");
      c.Um("product");
      c.Um("remittance");
      c.Um("collect");
      c.Um("wallet_payu");
      c.Um("luckymoney");
      c.Um("fingerprint");
    }
  }
  
  public void installed()
  {
    alias(com.tencent.mm.plugin.wxpay.a.a.class);
  }
  
  public String name()
  {
    return "plugin-wxpay";
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/wxpay/PluginWxPay.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */