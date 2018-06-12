package com.tencent.mm.plugin.appbrand.menu;

import android.content.Context;
import com.tencent.mm.plugin.appbrand.g;
import com.tencent.mm.plugin.appbrand.page.n;
import com.tencent.mm.plugin.appbrand.page.p;
import com.tencent.mm.plugin.appbrand.s.j;
import com.tencent.mm.sdk.platformtools.bi;

public final class b
  extends com.tencent.mm.plugin.appbrand.menu.a.a
{
  b()
  {
    super(l.gjv - 1);
  }
  
  public final void a(Context paramContext, p paramp, com.tencent.mm.ui.base.l paraml, String paramString)
  {
    if (paramp.fdO.aaq()) {}
    while (!paramp.fdO.fcz.gmM) {
      return;
    }
    paraml.e(this.gjO, paramContext.getString(s.j.app_brand_back_to_home));
  }
  
  public final void a(Context paramContext, p paramp, String paramString, k paramk)
  {
    paramp.fdO.fcz.V(paramp.fdO.fcv.adU(), true);
    if (paramp.gns != null) {
      com.tencent.mm.plugin.appbrand.report.a.a(paramString, paramp.getURL(), 20, "", bi.VE(), 1, 0);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/appbrand/menu/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */