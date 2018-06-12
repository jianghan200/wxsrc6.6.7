package com.tencent.mm.plugin.appbrand.compat;

import android.support.annotation.Keep;
import com.tencent.mm.kernel.e.c;
import com.tencent.mm.plugin.appbrand.jsapi.p.c.a;

@Keep
public final class PluginAppBrandCompat
  extends com.tencent.mm.kernel.b.f
  implements com.tencent.mm.kernel.api.c, com.tencent.mm.plugin.appbrand.compat.a.e
{
  private final com.tencent.mm.sdk.b.c bannerOnInitListener = new PluginAppBrandCompat.2(this);
  
  public final void configure(com.tencent.mm.kernel.b.g paramg) {}
  
  public final void execute(com.tencent.mm.kernel.b.g paramg)
  {
    if (paramg.ES())
    {
      com.tencent.mm.kernel.g.a(com.tencent.mm.plugin.appbrand.compat.a.f.class, new com.tencent.mm.kernel.c.e(new com.tencent.mm.plugin.appbrand.m.d()));
      com.tencent.mm.kernel.g.a(com.tencent.mm.plugin.appbrand.compat.a.d.class, new com.tencent.mm.kernel.c.e(new b()));
      com.tencent.mm.kernel.g.Ek().a(new PluginAppBrandCompat.1(this));
    }
    for (;;)
    {
      com.tencent.mm.kernel.g.a(com.tencent.mm.plugin.appbrand.compat.a.a.class, new com.tencent.mm.kernel.c.e(new a()));
      com.tencent.mm.kernel.g.a(com.tencent.mm.plugin.appbrand.compat.a.c.class, new com.tencent.mm.kernel.c.e(new k()));
      return;
      com.tencent.mm.kernel.g.a(c.a.class, new com.tencent.mm.kernel.c.e(new com.tencent.mm.plugin.appbrand.jsapi.p.d()));
    }
  }
  
  public final void installed()
  {
    super.installed();
    alias(com.tencent.mm.plugin.appbrand.compat.a.e.class);
  }
  
  public final void onAccountInitialized(e.c paramc)
  {
    this.bannerOnInitListener.cht();
  }
  
  public final void onAccountRelease()
  {
    this.bannerOnInitListener.dead();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/compat/PluginAppBrandCompat.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */