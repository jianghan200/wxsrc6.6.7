package com.tencent.mm.plugin.appbrand.config;

import com.tencent.mm.plugin.appbrand.a;
import com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo;
import com.tencent.mm.sdk.platformtools.bi;

public final class h
{
  public static boolean rO(String paramString)
  {
    if (bi.oW(paramString)) {}
    do
    {
      return false;
      paramString = a.qa(paramString);
    } while ((paramString == null) || (paramString.fqw) || (paramString.frm.fih == 0));
    return true;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/config/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */