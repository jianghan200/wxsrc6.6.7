package com.tencent.mm.plugin.welab;

import com.tencent.mm.bt.h;
import com.tencent.mm.bt.h.d;
import com.tencent.mm.kernel.b.f;
import com.tencent.mm.kernel.c.e;
import com.tencent.mm.kernel.e.c;
import com.tencent.mm.model.bv;
import com.tencent.mm.plugin.messenger.foundation.a.o;
import com.tencent.mm.sdk.platformtools.x;
import java.util.HashMap;

public class PluginWelab
  extends f
  implements com.tencent.mm.kernel.api.bucket.a, com.tencent.mm.kernel.api.bucket.c, com.tencent.mm.kernel.api.bucket.d, com.tencent.mm.plugin.welab.a.a
{
  private c qmI = new c();
  private boolean qmJ;
  
  public HashMap<Integer, h.d> collectDatabaseFactory()
  {
    x.v("PluginWelab", "collectDatabaseFactory");
    HashMap localHashMap = new HashMap();
    localHashMap.put(Integer.valueOf("LabAppInfo".hashCode()), new PluginWelab.2(this));
    return localHashMap;
  }
  
  public void configure(com.tencent.mm.kernel.b.g paramg)
  {
    if (!paramg.ES()) {
      return;
    }
    x.v("PluginWelab", "configure");
    com.tencent.mm.kernel.g.a(com.tencent.mm.plugin.welab.a.a.d.class, new e(new d()));
    ((com.tencent.mm.plugin.auth.a.b)com.tencent.mm.kernel.g.n(com.tencent.mm.plugin.auth.a.b.class)).addHandleAuthResponse(new PluginWelab.1(this));
  }
  
  public void dependency()
  {
    dependsOn(o.class);
  }
  
  public void execute(com.tencent.mm.kernel.b.g paramg)
  {
    x.v("PluginWelab", "execute");
  }
  
  public void installed()
  {
    alias(com.tencent.mm.plugin.welab.a.a.class);
  }
  
  public void onAccountInitialized(e.c paramc)
  {
    x.v("PluginWelab", "onAccountInitialized");
    com.tencent.mm.kernel.g.a(com.tencent.mm.plugin.welab.a.a.a.class, new com.tencent.mm.plugin.welab.a.b());
    com.tencent.mm.kernel.g.a(com.tencent.mm.plugin.welab.a.a.c.class, new com.tencent.mm.plugin.welab.a.c());
    this.qmJ = paramc.dqH;
    ((o)com.tencent.mm.kernel.g.n(o.class)).getSysCmdMsgExtension().a("newabtestlabs", this.qmI, true);
  }
  
  public void onAccountRelease()
  {
    x.v("PluginWelab", "onAccountRelease");
    ((o)com.tencent.mm.kernel.g.n(o.class)).getSysCmdMsgExtension().b("newabtestlabs", this.qmI, true);
  }
  
  public void onDataBaseClosed(h paramh1, h paramh2) {}
  
  public void onDataBaseOpened(h paramh1, h paramh2)
  {
    x.v("PluginWelab", "onDataBaseOpened");
    b.bYI().qmM = new com.tencent.mm.plugin.welab.c.a(paramh1);
  }
  
  public String toString()
  {
    return "plugin-welab";
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/welab/PluginWelab.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */