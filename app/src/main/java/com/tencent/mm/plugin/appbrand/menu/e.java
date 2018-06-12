package com.tencent.mm.plugin.appbrand.menu;

import android.content.Context;
import android.widget.Toast;
import com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo;
import com.tencent.mm.plugin.appbrand.config.AppBrandSysConfig;
import com.tencent.mm.plugin.appbrand.g;
import com.tencent.mm.plugin.appbrand.menu.a.a;
import com.tencent.mm.plugin.appbrand.page.p;
import com.tencent.mm.plugin.appbrand.performance.AppBrandPerformanceManager;
import com.tencent.mm.plugin.appbrand.s.j;

public final class e
  extends a
{
  public e()
  {
    super(l.gjA - 1);
  }
  
  public final void a(Context paramContext, p paramp, com.tencent.mm.ui.base.l paraml, String paramString)
  {
    paramp = paramp.fdO.fcu;
    if (paramp.frm.fih == 1) {
      if (!paramp.fqM) {
        break label46;
      }
    }
    label46:
    for (paramContext = paramContext.getString(s.j.app_brand_performance_disable);; paramContext = paramContext.getString(s.j.app_brand_performance_enable))
    {
      paraml.e(l.gjA - 1, paramContext);
      return;
    }
  }
  
  public final void a(Context paramContext, p paramp, String paramString, k paramk)
  {
    if (!paramp.fdO.fcu.fqM) {}
    for (int i = 1; i != 0; i = 0)
    {
      AppBrandPerformanceManager.vg(paramString);
      Toast.makeText(paramContext, s.j.app_brand_performance_enable_toast, 0).show();
      return;
    }
    AppBrandPerformanceManager.vh(paramString);
    Toast.makeText(paramContext, s.j.app_brand_performance_disable_toast, 0).show();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/plugin/appbrand/menu/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */