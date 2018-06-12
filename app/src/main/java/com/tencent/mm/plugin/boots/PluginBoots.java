package com.tencent.mm.plugin.boots;

import com.tencent.mm.bt.h;
import com.tencent.mm.bt.h.d;
import com.tencent.mm.plugin.boots.a.c;
import com.tencent.mm.sdk.platformtools.x;
import java.util.HashMap;

public class PluginBoots
  extends com.tencent.mm.kernel.b.f
  implements com.tencent.mm.kernel.api.bucket.a, com.tencent.mm.kernel.api.bucket.d, com.tencent.mm.plugin.boots.a.e
{
  private com.tencent.mm.plugin.boots.c.a hjr;
  private com.tencent.mm.plugin.boots.b.b hjs;
  
  public HashMap<Integer, h.d> collectDatabaseFactory()
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put(Integer.valueOf("ACTIVE_TABLE".hashCode()), new PluginBoots.1(this));
    return localHashMap;
  }
  
  public void configure(com.tencent.mm.kernel.b.g paramg)
  {
    super.configure(paramg);
  }
  
  public void dependency()
  {
    x.d("MicroMsg.Boots.PluginBoots", "dependency");
    dependsOn(com.tencent.mm.plugin.comm.a.a.class);
  }
  
  public void execute(com.tencent.mm.kernel.b.g paramg)
  {
    x.d("MicroMsg.Boots.PluginBoots", "execute");
    if (paramg.ES()) {
      com.tencent.mm.kernel.g.a(c.class, new com.tencent.mm.kernel.c.e(new b()));
    }
  }
  
  public com.tencent.mm.plugin.boots.a.d getLuggageLogic()
  {
    return this.hjs;
  }
  
  public com.tencent.mm.plugin.boots.a.f getTinkerLogic()
  {
    return this.hjr;
  }
  
  public void installed()
  {
    x.d("MicroMsg.Boots.PluginBoots", "installed");
    alias(com.tencent.mm.plugin.boots.a.e.class);
    com.tencent.mm.pluginsdk.cmd.b.a(new a(), new String[] { "//boots" });
  }
  
  public String name()
  {
    return "plugin-tinker";
  }
  
  public void onDataBaseClosed(h paramh1, h paramh2)
  {
    if (this.hjs != null)
    {
      paramh1 = this.hjs;
      com.tencent.mm.plugin.downloader.model.d.aCU();
      com.tencent.mm.plugin.downloader.model.b.b(paramh1.hjE);
    }
  }
  
  public void onDataBaseOpened(h paramh1, h paramh2)
  {
    paramh1 = new com.tencent.mm.plugin.boots.c.a.a(paramh1);
    if (com.tencent.mm.plugin.boots.c.a.hjJ == null) {
      com.tencent.mm.plugin.boots.c.a.hjJ = new com.tencent.mm.plugin.boots.c.a(paramh1);
    }
    this.hjr = com.tencent.mm.plugin.boots.c.a.hjJ;
    if (com.tencent.mm.plugin.boots.b.b.hjC == null) {
      com.tencent.mm.plugin.boots.b.b.hjC = new com.tencent.mm.plugin.boots.b.b();
    }
    this.hjs = com.tencent.mm.plugin.boots.b.b.hjC;
    paramh1 = this.hjs;
    com.tencent.mm.plugin.downloader.model.d.aCU();
    com.tencent.mm.plugin.downloader.model.b.a(paramh1.hjE);
  }
  
  public void uninstalled()
  {
    x.d("MicroMsg.Boots.PluginBoots", "uninstalled");
    super.uninstalled();
    com.tencent.mm.pluginsdk.cmd.b.D(new String[] { "//boots" });
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/boots/PluginBoots.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */