package com.tencent.mm.plugin.fav.ui;

import com.tencent.mm.kernel.a.b.b;
import com.tencent.mm.kernel.api.bucket.c;
import com.tencent.mm.kernel.b.f;
import com.tencent.mm.kernel.e.c;
import com.tencent.mm.plugin.fts.a.m;
import com.tencent.mm.plugin.fts.a.n;

public class PluginFavUI
  extends f
  implements b, c
{
  private com.tencent.mm.plugin.fav.ui.c.a jbw = new com.tencent.mm.plugin.fav.ui.c.a();
  private a jbx = new a();
  private l jby = new l();
  
  public void execute(com.tencent.mm.kernel.b.g paramg) {}
  
  public void onAccountInitialized(e.c paramc)
  {
    this.jbw.cht();
    this.jbx.cht();
    this.jby.cht();
    ((n)com.tencent.mm.kernel.g.n(n.class)).getFTSTaskDaemon().a(-86016, new PluginFavUI.1(this));
  }
  
  public void onAccountRelease()
  {
    this.jbw.dead();
    this.jbx.dead();
    this.jby.dead();
  }
  
  public void parallelsDependency() {}
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/fav/ui/PluginFavUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */