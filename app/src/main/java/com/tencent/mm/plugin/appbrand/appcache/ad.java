package com.tencent.mm.plugin.appbrand.appcache;

import android.annotation.SuppressLint;
import com.tencent.mm.plugin.appbrand.appcache.base.a;

@SuppressLint({"DefaultLocale"})
class ad
  extends a
{
  ad(String paramString1, String paramString2, int paramInt)
  {
    super(str1, str2 + String.format("debug_%d_%d_%d.wxapkg", new Object[] { Integer.valueOf(paramString1.hashCode()), Integer.valueOf(paramInt), Integer.valueOf(paramString2.hashCode()) }), paramString2, paramString1, String.format("%d-%s", new Object[] { Integer.valueOf(paramInt), paramString2 }).hashCode(), paramInt);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/appbrand/appcache/ad.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */