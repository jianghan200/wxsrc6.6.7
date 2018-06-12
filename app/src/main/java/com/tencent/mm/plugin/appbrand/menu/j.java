package com.tencent.mm.plugin.appbrand.menu;

import android.content.Context;
import com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo;
import com.tencent.mm.plugin.appbrand.config.AppBrandSysConfig;
import com.tencent.mm.plugin.appbrand.e;
import com.tencent.mm.plugin.appbrand.e.c;
import com.tencent.mm.plugin.appbrand.page.p;
import com.tencent.mm.plugin.appbrand.ui.banner.AppBrandStickyBannerLogic.a;
import com.tencent.mm.plugin.appbrand.widget.recentview.d;
import com.tencent.mm.sdk.platformtools.bi;

public final class j
  extends com.tencent.mm.plugin.appbrand.menu.a.a
{
  public j()
  {
    super(l.gjD - 1);
  }
  
  public final void a(Context paramContext, p paramp, com.tencent.mm.ui.base.l paraml, String paramString)
  {
    com.tencent.mm.kernel.g.l(d.class);
  }
  
  public final void a(Context paramContext, p paramp, String paramString, k paramk)
  {
    paramk = paramp.fdO.fcu;
    String str = paramk.appId;
    int i = paramk.frm.fih;
    AppBrandStickyBannerLogic.a.anT();
    e.a(paramString, e.c.fci);
    AppBrandStickyBannerLogic.a.a(paramContext, paramk.appId, paramk.frm.fih, paramk.bKC, paramk.fqJ);
    com.tencent.mm.plugin.appbrand.report.a.a(paramString, paramp.getURL(), 13, "", bi.VE(), 1, 0);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/appbrand/menu/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */