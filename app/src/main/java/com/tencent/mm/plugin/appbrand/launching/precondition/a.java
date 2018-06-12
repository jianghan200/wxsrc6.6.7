package com.tencent.mm.plugin.appbrand.launching.precondition;

import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import com.tencent.mm.modelappbrand.LaunchParamsOptional;
import com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer;
import com.tencent.mm.plugin.appbrand.launching.params.LaunchParcel;
import com.tencent.mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.base.b;

abstract class a
  implements g
{
  protected abstract boolean a(Context paramContext, LaunchParcel paramLaunchParcel);
  
  public final boolean a(Context paramContext, String paramString1, String paramString2, String paramString3, int paramInt1, int paramInt2, AppBrandStatObject paramAppBrandStatObject, AppBrandLaunchReferrer paramAppBrandLaunchReferrer, LaunchParamsOptional paramLaunchParamsOptional)
  {
    if ((bi.oW(paramString1)) && (bi.oW(paramString2))) {
      return false;
    }
    LaunchParcel localLaunchParcel = new LaunchParcel();
    localLaunchParcel.username = paramString1;
    localLaunchParcel.appId = paramString2;
    if (paramString3 == null)
    {
      paramString1 = null;
      localLaunchParcel.fqx = paramString1;
      localLaunchParcel.fmv = paramInt1;
      localLaunchParcel.version = paramInt2;
      localLaunchParcel.ghm = paramAppBrandStatObject;
      localLaunchParcel.fqA = paramAppBrandLaunchReferrer;
      localLaunchParcel.ghn = paramLaunchParamsOptional;
      if (paramContext != null) {
        break label110;
      }
      paramString2 = ad.getContext();
    }
    for (;;)
    {
      return a(paramString2, localLaunchParcel);
      paramString1 = paramString3.trim();
      break;
      label110:
      paramString2 = paramContext;
      if (!(paramContext instanceof Activity)) {
        continue;
      }
      paramString2 = null;
      paramString1 = null;
      try
      {
        paramString3 = paramContext.obtainStyledAttributes(new int[] { 16842840 });
        paramString1 = paramString3;
        paramString2 = paramString3;
        if (!paramString3.getBoolean(0, false))
        {
          paramString1 = paramString3;
          paramString2 = paramString3;
          b.Y((Activity)paramContext);
        }
        paramString2 = paramContext;
        if (paramString3 == null) {
          continue;
        }
        paramString3.recycle();
        paramString2 = paramContext;
      }
      catch (Exception paramString3)
      {
        paramString2 = paramString1;
        x.printErrStackTrace("MicroMsg.AppBrand.Precondition.AbstractLaunchEntry", paramString3, "convertActivityFromTranslucent %s", new Object[] { paramContext.getClass().getSimpleName() });
        paramString2 = paramContext;
        if (paramString1 == null) {
          continue;
        }
        paramString1.recycle();
        paramString2 = paramContext;
      }
      finally
      {
        if (paramString2 != null) {
          paramString2.recycle();
        }
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/appbrand/launching/precondition/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */