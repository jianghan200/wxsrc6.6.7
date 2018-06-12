package com.tencent.mm.plugin.appbrand.launching.precondition;

import android.content.Context;
import com.tencent.mm.kernel.b.h;
import com.tencent.mm.kernel.d;
import com.tencent.mm.modelappbrand.LaunchParamsOptional;
import com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer;
import com.tencent.mm.plugin.appbrand.report.AppBrandStatObject;

public abstract interface g
{
  public static final g ghE;
  
  static
  {
    if (((h)com.tencent.mm.kernel.g.Ef().DM()).ES()) {}
    for (Object localObject = new i();; localObject = new c())
    {
      ghE = (g)localObject;
      return;
    }
  }
  
  public abstract boolean a(Context paramContext, String paramString1, String paramString2, String paramString3, int paramInt1, int paramInt2, AppBrandStatObject paramAppBrandStatObject, AppBrandLaunchReferrer paramAppBrandLaunchReferrer, LaunchParamsOptional paramLaunchParamsOptional);
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/appbrand/launching/precondition/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */