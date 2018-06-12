package com.tencent.mm.plugin.appbrand.launching.b;

import android.net.Uri;
import com.tencent.mm.plugin.appbrand.s.j;
import com.tencent.mm.plugin.appbrand.ui.AppBrand404PageUI;

final class e
  extends a
{
  final void a(Uri paramUri, int paramInt)
  {
    int i = 1;
    if (paramUri == null) {}
    for (String str = "";; str = paramUri.getQueryParameter("appid")) {
      switch (e.1.ghg[(paramInt - 1)])
      {
      default: 
        AppBrand404PageUI.show(s.j.app_brand_error);
      case 4: 
        return;
      }
    }
    if ((paramUri != null) && (paramUri.getBooleanQueryParameter("debug", false)))
    {
      paramInt = 1;
      AppBrand404PageUI.show(s.j.app_brand_scan_qrcode_parameter_error);
      if (paramInt == 0) {
        break label109;
      }
    }
    label109:
    for (paramInt = i;; paramInt = 0)
    {
      com.tencent.mm.plugin.appbrand.report.a.G(str, 2, paramInt + 1);
      return;
      paramInt = 0;
      break;
    }
    AppBrand404PageUI.show(s.j.app_brand_qrcode_result_dev_qrcode_expired);
    com.tencent.mm.plugin.appbrand.report.a.G("", 3, 2);
    return;
    AppBrand404PageUI.show(s.j.app_brand_qrcode_result_uin_invalid);
    com.tencent.mm.plugin.appbrand.report.a.G("", 4, 2);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/launching/b/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */