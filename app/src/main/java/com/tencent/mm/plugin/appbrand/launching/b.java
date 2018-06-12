package com.tencent.mm.plugin.appbrand.launching;

import com.tencent.mm.plugin.appbrand.app.e;
import com.tencent.mm.plugin.appbrand.appusage.l;
import com.tencent.mm.plugin.appbrand.appusage.p;
import com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig;
import com.tencent.mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.mm.plugin.appbrand.ui.banner.AppBrandStickyBannerLogic.b;

public final class b
{
  public static void c(AppBrandInitConfig paramAppBrandInitConfig, AppBrandStatObject paramAppBrandStatObject)
  {
    String str = paramAppBrandInitConfig.appId;
    int i = paramAppBrandInitConfig.fig;
    paramAppBrandInitConfig.fqy = AppBrandStickyBannerLogic.b.anT();
    paramAppBrandInitConfig.aea();
    boolean bool = e.abg().ar(paramAppBrandInitConfig.username, paramAppBrandInitConfig.fig);
    if (e.abh().aq(paramAppBrandInitConfig.username, paramAppBrandInitConfig.fig))
    {
      paramAppBrandStatObject.gqK = 1;
      return;
    }
    if (bool)
    {
      paramAppBrandStatObject.gqK = 2;
      return;
    }
    paramAppBrandStatObject.gqK = 3;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/appbrand/launching/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */