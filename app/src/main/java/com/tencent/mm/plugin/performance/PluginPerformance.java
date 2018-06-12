package com.tencent.mm.plugin.performance;

import com.tencent.mm.kernel.b.f;
import com.tencent.mm.kernel.b.g;
import com.tencent.mm.plugin.messenger.foundation.a.o;
import com.tencent.mm.plugin.performance.a.a;
import com.tencent.mm.plugin.report.PluginReport;

public class PluginPerformance
  extends f
  implements a
{
  public void configure(g paramg)
  {
    com.tencent.mm.bv.c.tfx = new a.1();
  }
  
  public void dependency()
  {
    dependsOn(PluginReport.class);
    dependsOn(o.class);
  }
  
  public void execute(g paramg) {}
  
  public void installed()
  {
    alias(a.class);
  }
  
  public String toString()
  {
    return "plugin-performance";
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/performance/PluginPerformance.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */