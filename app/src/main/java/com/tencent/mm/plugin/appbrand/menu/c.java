package com.tencent.mm.plugin.appbrand.menu;

import android.content.Context;
import android.content.res.Resources;
import com.tencent.mm.plugin.appbrand.menu.a.a;
import com.tencent.mm.plugin.appbrand.page.p;
import com.tencent.mm.plugin.appbrand.s.d;
import com.tencent.mm.plugin.appbrand.s.j;
import com.tencent.mm.sdk.platformtools.bj;

final class c
  extends a
{
  c()
  {
    super(l.gjH - 1);
  }
  
  public final void a(Context paramContext, p paramp, com.tencent.mm.ui.base.l paraml, String paramString)
  {
    if (bj.cjh()) {
      paraml.a(this.gjO, paramContext.getResources().getColor(s.d.red_text_color), paramContext.getString(s.j.app_brand_actionsheet_debug_entrance));
    }
  }
  
  public final void a(Context paramContext, p paramp, String paramString, k paramk)
  {
    paramString = new com.tencent.mm.ui.tools.k(paramContext);
    paramString.ofp = new c.1(this, paramp);
    paramString.ofq = new c.2(this, paramp, paramContext);
    paramString.bEo();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/plugin/appbrand/menu/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */