package com.tencent.mm.plugin.appbrand.menu;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import com.tencent.mm.plugin.appbrand.e;
import com.tencent.mm.plugin.appbrand.e.c;
import com.tencent.mm.plugin.appbrand.page.p;
import com.tencent.mm.plugin.appbrand.s.d;
import com.tencent.mm.plugin.appbrand.s.j;
import com.tencent.mm.sdk.a.b;
import com.tencent.mm.sdk.platformtools.bi;

public final class f
  extends com.tencent.mm.plugin.appbrand.menu.a.a
{
  public f()
  {
    super(l.gjC - 1);
  }
  
  public final void a(Context paramContext, p paramp, com.tencent.mm.ui.base.l paraml, String paramString)
  {
    if (b.chp()) {
      paraml.a(this.gjO, paramContext.getResources().getColor(s.d.red_text_color), paramContext.getString(s.j.app_brand_back));
    }
  }
  
  public final void a(Context paramContext, p paramp, String paramString, k paramk)
  {
    e.a(paramString, e.c.fcf);
    if ((paramContext instanceof Activity))
    {
      ((Activity)paramContext).finish();
      com.tencent.mm.plugin.appbrand.report.a.a(paramString, paramp.getURL(), 10, "", bi.VE(), 1, 0);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/appbrand/menu/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */