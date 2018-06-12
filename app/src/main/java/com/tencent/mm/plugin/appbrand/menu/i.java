package com.tencent.mm.plugin.appbrand.menu;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.text.method.ScrollingMovementMethod;
import android.view.ViewGroup.LayoutParams;
import android.widget.TextView;
import com.tencent.mm.plugin.appbrand.appcache.WxaCommLibRuntimeReader;
import com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo;
import com.tencent.mm.plugin.appbrand.appcache.af;
import com.tencent.mm.plugin.appbrand.config.AppBrandSysConfig;
import com.tencent.mm.plugin.appbrand.g;
import com.tencent.mm.plugin.appbrand.page.p;
import com.tencent.mm.plugin.appbrand.s.e;
import com.tencent.mm.plugin.appbrand.s.j;
import com.tencent.mm.sdk.a.b;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.ui.base.h;
import java.util.Locale;

final class i
  extends com.tencent.mm.plugin.appbrand.menu.a.a
{
  i()
  {
    super(l.gjz - 1);
  }
  
  public final void a(Context paramContext, p paramp, com.tencent.mm.ui.base.l paraml, String paramString)
  {
    if (b.chp()) {
      paraml.e(this.gjO, paramContext.getString(s.j.app_brand_show_debug_info));
    }
  }
  
  @SuppressLint({"DefaultLocale"})
  public final void a(Context paramContext, p paramp, String paramString, k paramk)
  {
    AppBrandSysConfig localAppBrandSysConfig = paramp.fdO.fcu;
    paramk = new StringBuilder("!PKG_INFO!\n");
    WxaPkgWrappingInfo localWxaPkgWrappingInfo = WxaCommLibRuntimeReader.abP();
    paramk.append("\n[lib.src] ");
    if (localWxaPkgWrappingInfo.fik) {
      if (af.abU())
      {
        paramString = "local(force)";
        paramk.append(paramString);
        label57:
        paramk.append("\n[lib.ver] ").append(localWxaPkgWrappingInfo.fii);
        if (localWxaPkgWrappingInfo.fih != 0)
        {
          StringBuilder localStringBuilder = paramk.append("  ");
          if (localWxaPkgWrappingInfo.fih != 0) {
            break label351;
          }
          paramString = "";
          label101:
          localStringBuilder.append(paramString);
        }
        paramString = localAppBrandSysConfig.frm;
        paramk.append('\n');
        paramk.append("\n[app.version] ").append(paramString.fii);
        if (localAppBrandSysConfig.frm.fih != 0) {
          paramk.append("  ").append(bi.gb(paramString.fij));
        }
        if (bi.cX(paramString.fil)) {
          break label363;
        }
      }
    }
    label351:
    label363:
    for (boolean bool = true;; bool = false)
    {
      paramk.append("\n[app.module ] ").append(String.valueOf(bool));
      if (bool)
      {
        paramp = paramp.fdO.fcM.uB(paramp.getURL());
        paramk.append(String.format(Locale.US, "  (%s)", new Object[] { paramp }));
      }
      paramp = new TextView(paramContext);
      paramp.setText(paramk);
      paramp.setGravity(19);
      paramp.setTextSize(1, 10.0F);
      paramp.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
      paramp.setTextColor(-16777216);
      paramp.setTypeface(Typeface.MONOSPACE);
      int i = paramContext.getResources().getDimensionPixelSize(s.e.LargePadding);
      paramp.setPadding(i, i, i, i);
      paramp.setMovementMethod(ScrollingMovementMethod.getInstance());
      h.a(paramContext, null, paramp, null);
      return;
      paramString = "local";
      break;
      paramk.append("cgi");
      break label57;
      paramString = bi.gb(localWxaPkgWrappingInfo.fij);
      break label101;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/appbrand/menu/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */