package com.tencent.mm.plugin.appbrand.menu;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo;
import com.tencent.mm.plugin.appbrand.config.AppBrandSysConfig;
import com.tencent.mm.plugin.appbrand.config.WxaExposedParams.a;
import com.tencent.mm.plugin.appbrand.g;
import com.tencent.mm.plugin.appbrand.jsapi.op_report.AppBrandOpReportLogic.a;
import com.tencent.mm.plugin.appbrand.page.p;
import com.tencent.mm.plugin.appbrand.page.t;
import com.tencent.mm.plugin.appbrand.s.d;
import com.tencent.mm.plugin.appbrand.s.e;
import com.tencent.mm.plugin.appbrand.s.j;
import com.tencent.mm.plugin.appbrand.ui.AppBrandProfileUI;
import com.tencent.mm.plugin.appbrand.widget.g.c;
import com.tencent.mm.sdk.platformtools.bi;

public final class a
  extends com.tencent.mm.plugin.appbrand.menu.a.a
{
  public a()
  {
    super(l.gjF - 1);
  }
  
  public final void a(Context paramContext, p paramp, com.tencent.mm.ui.base.l paraml, String paramString)
  {
    paramString = paramp.fdO.fcu;
    int k = l.gjF;
    String str = paramString.bKC;
    int i = paramString.frm.fih;
    boolean bool = paramp.gnz;
    paramp = paramContext.getString(s.j.app_brand_about_app_formatter, new Object[] { str });
    str = com.tencent.mm.plugin.appbrand.appcache.a.jB(i);
    if (bi.oW(str))
    {
      paramContext = paramp;
      paraml.e(k - 1, paramContext);
      return;
    }
    int j = Color.parseColor("#42000000");
    i = com.tencent.mm.bp.a.g(paramContext, s.d.bottom_sheet_text_color);
    if (bool)
    {
      j = Color.parseColor("#80FFFFFF");
      i = com.tencent.mm.bp.a.g(paramContext, s.d.white_text_color);
    }
    for (;;)
    {
      paramString = new c(str, com.tencent.mm.bp.a.fromDPToPix(paramContext, 11), com.tencent.mm.bp.a.fromDPToPix(paramContext, 11), com.tencent.mm.bp.a.fromDPToPix(paramContext, 9), j, com.tencent.mm.bp.a.fromDPToPix(paramContext, 2));
      j = paramString.b(null);
      int[] arrayOfInt = com.tencent.mm.plugin.appbrand.ui.j.anG();
      int m = com.tencent.mm.bp.a.ad(paramContext, s.e.bottomsheet_list_text_size);
      TextPaint localTextPaint = new TextPaint(new Paint(i));
      localTextPaint.setTextSize(m);
      paramp = TextUtils.ellipsize(paramp, localTextPaint, arrayOfInt[0] - com.tencent.mm.bp.a.ad(paramContext, s.e.bottomsheet_list_icon_padding) - j, TextUtils.TruncateAt.END);
      paramContext = new SpannableStringBuilder(paramp + str);
      paramContext.setSpan(new AbsoluteSizeSpan(m, false), 0, paramp.length(), 18);
      paramContext.setSpan(new ForegroundColorSpan(i), 0, paramp.length(), 18);
      paramContext.setSpan(paramString, paramp.length(), paramContext.length(), 18);
      break;
    }
  }
  
  public final void a(Context paramContext, p paramp, String paramString, k paramk)
  {
    AppBrandSysConfig localAppBrandSysConfig = paramp.fdO.fcu;
    if (localAppBrandSysConfig == null) {
      return;
    }
    paramk = "";
    if (com.tencent.mm.plugin.appbrand.a.qb(paramString) != null) {
      paramk = bi.oV(com.tencent.mm.plugin.appbrand.j.g(paramp.fdO).fdE);
    }
    AppBrandOpReportLogic.a.aju();
    WxaExposedParams.a locala = new WxaExposedParams.a();
    locala.appId = localAppBrandSysConfig.appId;
    locala.bJu = 3;
    if (paramp.gns == null) {}
    for (String str = "";; str = paramp.gns.getPagePath())
    {
      locala.bVs = str;
      locala.fih = localAppBrandSysConfig.frm.fih;
      locala.fii = localAppBrandSysConfig.frm.fii;
      AppBrandProfileUI.a(paramContext, localAppBrandSysConfig.bGy, paramk, locala.aeo());
      com.tencent.mm.plugin.appbrand.report.a.a(paramString, paramp.getURL(), 6, "", bi.VE(), 1, 0);
      return;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/appbrand/menu/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */