package com.tencent.mm.plugin.appbrand.launching.b;

import android.net.Uri;
import com.tencent.mm.plugin.appbrand.s.j;
import com.tencent.mm.plugin.appbrand.ui.AppBrand404PageUI;

final class d
  extends a
{
  final void a(Uri paramUri, int paramInt)
  {
    switch (d.1.ghg[(paramInt - 1)])
    {
    default: 
      AppBrand404PageUI.show(s.j.app_brand_error);
    case 4: 
      return;
    case 1: 
      AppBrand404PageUI.show(s.j.app_brand_barcode_parameter_error);
      return;
    case 2: 
      AppBrand404PageUI.show(s.j.app_brand_barcode_result_dev_code_exipred);
      return;
    }
    AppBrand404PageUI.show(s.j.app_brand_qrcode_result_uin_invalid);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/launching/b/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */