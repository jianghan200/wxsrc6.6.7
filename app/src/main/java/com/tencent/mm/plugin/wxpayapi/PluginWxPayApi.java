package com.tencent.mm.plugin.wxpayapi;

import com.tencent.mm.kernel.b.f;
import com.tencent.mm.pluginsdk.wallet.b;

public class PluginWxPayApi
  extends f
  implements com.tencent.mm.plugin.wxpayapi.a.a
{
  public void configure(com.tencent.mm.kernel.b.g paramg)
  {
    paramg.ES();
  }
  
  public void dependency() {}
  
  public void execute(com.tencent.mm.kernel.b.g paramg)
  {
    if (paramg.ES()) {
      com.tencent.mm.kernel.g.a(b.class, new com.tencent.mm.plugin.x.a());
    }
  }
  
  public void installed()
  {
    alias(PluginWxPayApi.class);
  }
  
  public String name()
  {
    return "plugin-wxpayapi";
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/wxpayapi/PluginWxPayApi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */