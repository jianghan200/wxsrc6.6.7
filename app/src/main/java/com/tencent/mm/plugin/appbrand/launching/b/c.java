package com.tencent.mm.plugin.appbrand.launching.b;

import android.net.Uri;
import com.tencent.mm.plugin.appbrand.s.j;
import com.tencent.mm.plugin.appbrand.ui.AppBrand404PageUI;

public final class c
  extends a
{
  final void a(Uri paramUri, int paramInt)
  {
    switch (c.1.ghg[(paramInt - 1)])
    {
    default: 
      AppBrand404PageUI.show(s.j.app_brand_error);
    case 4: 
      return;
    case 1: 
      AppBrand404PageUI.show(s.j.app_brand_error);
      return;
    case 2: 
      AppBrand404PageUI.show(s.j.app_brand_error);
      return;
    }
    AppBrand404PageUI.show(s.j.app_brand_error);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/appbrand/launching/b/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */