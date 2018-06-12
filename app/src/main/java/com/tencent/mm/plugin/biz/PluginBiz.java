package com.tencent.mm.plugin.biz;

import com.tencent.mm.ac.l;
import com.tencent.mm.ac.z;
import com.tencent.mm.bt.h.d;
import com.tencent.mm.kernel.c.e;
import com.tencent.mm.model.j;
import com.tencent.mm.model.p;
import com.tencent.mm.plugin.biz.a.b;
import com.tencent.mm.pluginsdk.ui.applet.d;
import java.util.HashMap;

public class PluginBiz
  extends com.tencent.mm.kernel.b.f
  implements com.tencent.mm.kernel.api.bucket.a, b
{
  public HashMap<Integer, h.d> collectDatabaseFactory()
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put(Integer.valueOf("BIZ_MESSAGE_TABLE".hashCode()), new PluginBiz.1(this));
    localHashMap.put(Integer.valueOf("BIZ_TIME_LINE_TABLE".hashCode()), new PluginBiz.2(this));
    localHashMap.put(Integer.valueOf("BIZ_TIME_LINE_SINGLE_MSG_TABLE".hashCode()), new PluginBiz.3(this));
    return localHashMap;
  }
  
  public void configure(com.tencent.mm.kernel.b.g paramg)
  {
    if (paramg.ES())
    {
      com.tencent.mm.kernel.g.a(com.tencent.mm.ac.o.class, new e(new l()));
      com.tencent.mm.kernel.g.a(com.tencent.mm.plugin.biz.a.a.class, new a());
    }
    com.tencent.mm.pluginsdk.ui.applet.p.a.qJH = new d();
  }
  
  public void dependency()
  {
    dependsOn(com.tencent.mm.plugin.messenger.foundation.a.o.class);
  }
  
  public void execute(com.tencent.mm.kernel.b.g paramg)
  {
    if (paramg.ES())
    {
      pin(new p(z.class));
      com.tencent.mm.kernel.g.a(com.tencent.mm.api.f.class, new com.tencent.mm.model.g());
      com.tencent.mm.kernel.g.a(com.tencent.mm.api.g.class, new com.tencent.mm.model.h());
      com.tencent.mm.kernel.g.a(com.tencent.mm.api.h.class, new j());
    }
  }
  
  public void installed()
  {
    alias(b.class);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/biz/PluginBiz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */