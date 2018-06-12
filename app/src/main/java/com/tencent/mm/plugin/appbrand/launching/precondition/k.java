package com.tencent.mm.plugin.appbrand.launching.precondition;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ServiceInfo;
import com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig;
import com.tencent.mm.plugin.appbrand.launching.b;
import com.tencent.mm.plugin.appbrand.launching.d;
import com.tencent.mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.mm.plugin.appbrand.task.e;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.Map;

final class k
{
  static void a(Context paramContext, AppBrandInitConfig paramAppBrandInitConfig, AppBrandStatObject paramAppBrandStatObject)
  {
    x.i("MicroMsg.AppBrand.PreconditionUtil", "startAppOnInitConfigGot, %s", new Object[] { paramAppBrandInitConfig });
    b.c(paramAppBrandInitConfig, paramAppBrandStatObject);
    paramAppBrandInitConfig.startTime = bi.VF();
    int i = e.b(paramContext, paramAppBrandInitConfig, paramAppBrandStatObject);
    if ((paramContext instanceof Activity)) {
      com.tencent.mm.plugin.appbrand.ui.f.a((Activity)paramContext, paramAppBrandStatObject);
    }
    x.i("MicroMsg.AppBrand.AppLaunchLogic", "[applaunch] startAppOnInitConfigGot %s", new Object[] { paramAppBrandInitConfig });
    if (i == 1) {
      new d(paramAppBrandInitConfig, paramAppBrandStatObject).akB();
    }
    paramContext = com.tencent.mm.plugin.appbrand.config.f.aee();
    paramAppBrandStatObject = paramAppBrandInitConfig.username;
    if ((paramAppBrandInitConfig == null) || (bi.oW(paramAppBrandInitConfig.appId))) {}
    for (;;)
    {
      return;
      synchronized (paramContext.fqC)
      {
        paramContext.fqC.put(paramAppBrandInitConfig.appId, paramAppBrandInitConfig);
        if (bi.oW(paramAppBrandStatObject)) {
          continue;
        }
        synchronized (paramContext.fqD)
        {
          paramContext.fqD.put(paramAppBrandStatObject, paramAppBrandInitConfig.appId);
          return;
        }
      }
    }
  }
  
  static String uq(String paramString)
  {
    if (bi.oW(paramString)) {
      return "";
    }
    paramString = new ComponentName(ad.getContext(), paramString);
    PackageManager localPackageManager = ad.getContext().getPackageManager();
    if (localPackageManager == null) {
      return "";
    }
    try
    {
      Object localObject = localPackageManager.getActivityInfo(paramString, 128);
      if (localObject == null) {
        return "";
      }
      localObject = ((ActivityInfo)localObject).processName;
      return (String)localObject;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      try
      {
        paramString = localPackageManager.getServiceInfo(paramString, 128);
        if (paramString == null) {
          return "";
        }
        paramString = paramString.processName;
        return paramString;
      }
      catch (PackageManager.NameNotFoundException paramString) {}
    }
    return "";
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/appbrand/launching/precondition/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */