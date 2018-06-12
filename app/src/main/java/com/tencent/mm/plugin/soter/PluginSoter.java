package com.tencent.mm.plugin.soter;

import com.tencent.mm.kernel.b.f;
import com.tencent.mm.kernel.b.g;
import com.tencent.mm.kernel.e.c;
import com.tencent.mm.plugin.soter.c.d;
import com.tencent.mm.plugin.soter.c.h;
import com.tencent.mm.plugin.soter.d.b;
import com.tencent.mm.sdk.platformtools.x;

public class PluginSoter
  extends f
  implements com.tencent.mm.kernel.api.bucket.c, com.tencent.mm.plugin.soter.a.a
{
  private d onr = null;
  private boolean ons = false;
  
  private void safeAddListener(com.tencent.mm.sdk.b.c paramc)
  {
    if (paramc == null)
    {
      x.w("MicroMsg.PluginSoter", "hy: listener is null or id is invalid");
      return;
    }
    if (com.tencent.mm.sdk.b.a.sFg.d(paramc))
    {
      x.w("MicroMsg.PluginSoter", "hy: already has listener");
      return;
    }
    com.tencent.mm.sdk.b.a.sFg.b(paramc);
  }
  
  private void safeRemoveListener(com.tencent.mm.sdk.b.c paramc)
  {
    if (paramc == null)
    {
      x.w("MicroMsg.PluginSoter", "alvinluo listener is null");
      return;
    }
    com.tencent.mm.sdk.b.a.sFg.c(paramc);
  }
  
  public void execute(g paramg)
  {
    if (paramg.ES())
    {
      x.i("MicroMsg.PluginSoter", "alvinluo PluginSoter in process: %s execute and run pipeline", new Object[] { paramg.dox });
      this.ons = true;
      x.v("MicroMsg.PluginSoter", "alvinluo PluginSoter add SoterDynamicConfigUpdatedEventListener");
      this.onr = new d();
      safeAddListener(this.onr);
    }
  }
  
  public String name()
  {
    return "plugin-soter";
  }
  
  public void onAccountInitialized(e.c paramc)
  {
    x.v("MicroMsg.PluginSoter", "alvinluo onAccountInitialized, isMainProcess: %b", new Object[] { Boolean.valueOf(this.ons) });
    if (this.ons)
    {
      h.bFi();
      b.a(false, false, null);
    }
  }
  
  public void onAccountRelease()
  {
    x.v("MicroMsg.PluginSoter", "alvinluo onAccountRelease");
  }
  
  public void uninstalled()
  {
    super.uninstalled();
    safeRemoveListener(this.onr);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/soter/PluginSoter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */