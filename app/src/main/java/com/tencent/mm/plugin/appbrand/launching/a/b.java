package com.tencent.mm.plugin.appbrand.launching.a;

import com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer;
import com.tencent.mm.protocal.c.chh;
import com.tencent.mm.protocal.c.chx;

public final class b
{
  public static chx b(AppBrandLaunchReferrer paramAppBrandLaunchReferrer)
  {
    if (paramAppBrandLaunchReferrer == null) {}
    while (2 != paramAppBrandLaunchReferrer.fqE) {
      return null;
    }
    chx localchx = new chx();
    localchx.rbW = paramAppBrandLaunchReferrer.appId;
    localchx.jPK = paramAppBrandLaunchReferrer.url;
    return localchx;
  }
  
  public static chh c(AppBrandLaunchReferrer paramAppBrandLaunchReferrer)
  {
    if (paramAppBrandLaunchReferrer == null) {}
    while (1 != paramAppBrandLaunchReferrer.fqE) {
      return null;
    }
    chh localchh = new chh();
    localchh.rQV = paramAppBrandLaunchReferrer.appId;
    localchh.rQO = paramAppBrandLaunchReferrer.bJt;
    localchh.sBk = paramAppBrandLaunchReferrer.fqH;
    return localchh;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/launching/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */