package com.tencent.mm.plugin.monitor;

import com.tencent.mm.kernel.b.f;
import com.tencent.mm.kernel.b.g;
import com.tencent.mm.model.p;
import com.tencent.mm.plugin.monitor.a.a;
import com.tencent.mm.sdk.platformtools.x;

public class PluginMonitor
  extends f
  implements a
{
  public void execute(g paramg)
  {
    if (paramg.ES())
    {
      x.i("MicroMsg.PluginMonitor", "PluginMonitor execute PluginMonitor new SubCoreBaseMonitor");
      pin(new p(b.class));
    }
  }
  
  public void installed()
  {
    super.installed();
    alias(a.class);
  }
  
  public String name()
  {
    return "plugin-monitor";
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/monitor/PluginMonitor.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */