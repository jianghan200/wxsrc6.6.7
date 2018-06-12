package com.tencent.mm.plugin.appbrand.launching;

import android.content.Context;
import com.tencent.mm.compatible.util.p;
import com.tencent.mm.modelappbrand.LaunchParamsOptional;
import com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer;
import com.tencent.mm.plugin.appbrand.n.d;
import com.tencent.mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.y.g.a;
import junit.framework.Assert;

public final class ae
  implements d
{
  public final void a(Context paramContext, String paramString1, String paramString2, int paramInt1, int paramInt2, String paramString3, AppBrandStatObject paramAppBrandStatObject)
  {
    AppBrandLaunchProxyUI.a(paramContext, paramString1, paramString2, paramString3, paramInt1, paramInt2, paramAppBrandStatObject, null, null);
  }
  
  public final void a(Context paramContext, String paramString1, String paramString2, int paramInt1, int paramInt2, String paramString3, AppBrandStatObject paramAppBrandStatObject, String paramString4)
  {
    AppBrandLaunchReferrer localAppBrandLaunchReferrer = new AppBrandLaunchReferrer();
    switch (paramAppBrandStatObject.scene)
    {
    }
    for (;;)
    {
      localAppBrandLaunchReferrer.appId = paramString4;
      AppBrandLaunchProxyUI.a(paramContext, paramString1, paramString2, paramString3, paramInt1, paramInt2, paramAppBrandStatObject, localAppBrandLaunchReferrer, null);
      return;
      localAppBrandLaunchReferrer.fqE = 4;
      continue;
      localAppBrandLaunchReferrer.fqE = 2;
      continue;
      localAppBrandLaunchReferrer.fqE = 5;
    }
  }
  
  public final void a(Context paramContext, String paramString1, String paramString2, String paramString3, int paramInt, String paramString4)
  {
    if (bi.oW(paramString3)) {
      return;
    }
    if ((bi.oW(paramString3)) || (bi.oW(paramString2)))
    {
      x.e("MicroMsg.WeAppLauncher", "targetAppId %s referrerAppId %s, Null Or Nil");
      return;
    }
    AppBrandStatObject localAppBrandStatObject = new AppBrandStatObject();
    localAppBrandStatObject.scene = 1055;
    localAppBrandStatObject.bGG = (p.encode(bi.oV(paramString1)) + ":" + paramString2);
    AppBrandLaunchReferrer localAppBrandLaunchReferrer = new AppBrandLaunchReferrer();
    localAppBrandLaunchReferrer.appId = paramString2;
    localAppBrandLaunchReferrer.fqE = 2;
    localAppBrandLaunchReferrer.url = paramString1;
    AppBrandLaunchProxyUI.a(paramContext, null, paramString3, paramString4, paramInt, -1, localAppBrandStatObject, localAppBrandLaunchReferrer, null);
    Assert.assertTrue(true);
  }
  
  public final void a(Context paramContext, String paramString1, String paramString2, boolean paramBoolean, g.a parama)
  {
    AppBrandStatObject localAppBrandStatObject = new AppBrandStatObject();
    localAppBrandStatObject.scene = 1036;
    localAppBrandStatObject.bGG = (bi.oV(parama.appId) + ":" + bi.oV(p.encode(parama.url)));
    if (paramBoolean) {}
    for (int i = 2;; i = 1)
    {
      localAppBrandStatObject.cbB = i;
      if (paramBoolean) {
        paramString2 = paramString1;
      }
      localAppBrandStatObject.cbC = paramString2;
      paramString2 = null;
      if (!bi.oW(parama.dyY))
      {
        paramString2 = new LaunchParamsOptional();
        paramString2.dFy = paramString1;
        paramString2.dzR = parama.dyY;
      }
      paramString1 = new AppBrandLaunchReferrer();
      paramString1.fqE = 4;
      paramString1.appId = parama.appId;
      AppBrandLaunchProxyUI.a(paramContext, parama.dyS, parama.dyT, parama.dyR, parama.dyZ, parama.dza, localAppBrandStatObject, paramString1, paramString2);
      return;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/appbrand/launching/ae.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */