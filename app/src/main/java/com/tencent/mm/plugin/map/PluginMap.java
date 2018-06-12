package com.tencent.mm.plugin.map;

import com.tencent.mm.bg.c;
import com.tencent.mm.kernel.b.f;
import com.tencent.mm.kernel.b.g;
import com.tencent.mm.model.p;
import com.tencent.mm.plugin.location.model.l;
import com.tencent.mm.plugin.map.a.a;

public class PluginMap
  extends f
  implements a
{
  public void configure(g paramg)
  {
    if (paramg.ES()) {
      pin(new p(l.class));
    }
  }
  
  public void execute(g paramg)
  {
    if (paramg.ES()) {
      c.Um("location");
    }
  }
  
  public void installed()
  {
    alias(a.class);
  }
  
  public String name()
  {
    return "plugin-map";
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/map/PluginMap.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */