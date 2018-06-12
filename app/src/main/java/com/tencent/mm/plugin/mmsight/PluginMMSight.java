package com.tencent.mm.plugin.mmsight;

import com.tencent.mm.kernel.b.f;
import com.tencent.mm.kernel.b.g;
import com.tencent.mm.model.p;
import com.tencent.mm.plugin.api.b.a;
import com.tencent.mm.sdk.platformtools.x;

public class PluginMMSight
  extends f
  implements a
{
  public void execute(g paramg)
  {
    if (paramg != null) {
      x.i("MicroMsg.PluginMMSight", "execute, process: %s", new Object[] { paramg.dox });
    }
    com.tencent.mm.plugin.mmsight.api.b.leD = new b.a();
    com.tencent.mm.plugin.mmsight.api.MMSightRecordView.leC = new com.tencent.mm.plugin.api.recordView.e();
    com.tencent.mm.plugin.mmsight.api.a.leA = new com.tencent.mm.plugin.api.a();
    pin(new p(e.class));
  }
  
  public String name()
  {
    return "plugin-mmsight";
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/mmsight/PluginMMSight.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */