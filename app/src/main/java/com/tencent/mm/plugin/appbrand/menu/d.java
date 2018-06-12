package com.tencent.mm.plugin.appbrand.menu;

import android.content.Context;
import android.widget.Toast;
import com.tencent.mm.plugin.appbrand.menu.a.a;
import com.tencent.mm.plugin.appbrand.page.p;
import com.tencent.mm.plugin.appbrand.performance.AppBrandPerformanceManager;
import com.tencent.mm.plugin.appbrand.r.c;
import com.tencent.mm.plugin.appbrand.s.j;
import com.tencent.mm.sdk.platformtools.ah;

public final class d
  extends a
{
  public d()
  {
    super(l.gjI - 1);
  }
  
  public final void a(Context paramContext, p paramp, com.tencent.mm.ui.base.l paraml, String paramString)
  {
    if (AppBrandPerformanceManager.vi(paramString))
    {
      paramContext = paramContext.getString(s.j.app_brand_performance_dump_trace);
      paraml.e(l.gjI - 1, paramContext);
    }
  }
  
  public final void a(Context paramContext, p paramp, String paramString, k paramk)
  {
    Toast.makeText(paramContext, s.j.app_brand_performance_dump_trace_start, 0).show();
    c.Em().H(new d.1(this, paramString, paramContext));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/plugin/appbrand/menu/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */