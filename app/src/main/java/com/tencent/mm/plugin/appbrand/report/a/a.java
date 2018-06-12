package com.tencent.mm.plugin.appbrand.report.a;

import com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer;

public final class a
{
  public static String d(AppBrandLaunchReferrer paramAppBrandLaunchReferrer)
  {
    String str;
    if (paramAppBrandLaunchReferrer == null) {
      str = null;
    }
    do
    {
      return str;
      str = "";
      if ((1 == paramAppBrandLaunchReferrer.fqE) || (3 == paramAppBrandLaunchReferrer.fqE)) {
        return paramAppBrandLaunchReferrer.appId;
      }
    } while (2 != paramAppBrandLaunchReferrer.fqE);
    return paramAppBrandLaunchReferrer.url;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/appbrand/report/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */