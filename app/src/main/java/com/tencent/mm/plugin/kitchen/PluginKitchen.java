package com.tencent.mm.plugin.kitchen;

import com.tencent.mm.kernel.b.f;
import com.tencent.mm.plugin.messenger.foundation.a.o;

public class PluginKitchen
  extends f
  implements a
{
  public void dependency()
  {
    dependsOn(o.class);
  }
  
  public void execute(com.tencent.mm.kernel.b.g paramg)
  {
    com.tencent.mm.kernel.g.a(com.tencent.mm.plugin.kitchen.a.a.class, new com.tencent.mm.plugin.kitchen.b.a());
  }
  
  public void installed()
  {
    alias(a.class);
  }
  
  public String toString()
  {
    return "plugin-kitchen";
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/kitchen/PluginKitchen.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */