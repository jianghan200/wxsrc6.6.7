package com.tencent.mm.plugin.appbrand.launching.precondition;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig;
import com.tencent.mm.plugin.appbrand.config.f;
import com.tencent.mm.plugin.appbrand.launching.AppBrandLaunchProxyUI;
import com.tencent.mm.plugin.appbrand.launching.params.LaunchParcel;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;

final class i
  extends a
{
  private static long ghF = 0L;
  
  protected final boolean a(Context paramContext, LaunchParcel paramLaunchParcel)
  {
    Object localObject2 = paramLaunchParcel.appId;
    int i = paramLaunchParcel.fmv;
    Object localObject1 = localObject2;
    if (bi.oW((String)localObject2)) {
      localObject1 = f.aee().rL(paramLaunchParcel.username);
    }
    if ((!bi.oW((String)localObject1)) && (i == 0) && (com.tencent.mm.plugin.appbrand.task.e.vD((String)localObject1)))
    {
      localObject2 = f.aee().rN((String)localObject1);
      if ((localObject2 != null) && (((AppBrandInitConfig)localObject2).fig == i))
      {
        ((AppBrandInitConfig)localObject2).fqz = false;
        paramLaunchParcel.a((AppBrandInitConfig)localObject2);
        k.a(paramContext, (AppBrandInitConfig)localObject2, paramLaunchParcel.ghm);
        return true;
      }
    }
    if (Math.abs(System.currentTimeMillis() - ghF) < 200L)
    {
      x.w("MicroMsg.AppBrand.Precondition.MMLaunchEntry", "start in 200 ms, just return");
      return false;
    }
    ghF = bi.VF();
    x.v("MicroMsg.AppBrand.Precondition.MMLaunchEntry", "[applaunch] start entered %s %d", new Object[] { localObject1, Integer.valueOf(i) });
    localObject2 = "Token@" + i.class.hashCode() + "#" + System.nanoTime();
    new e(paramContext, (String)localObject2).a(paramLaunchParcel);
    x.v("MicroMsg.AppBrand.Precondition.MMLaunchEntry", "start we app with username(%s) and appId(%s) and statObj(%s)", new Object[] { paramLaunchParcel.username, localObject1, paramLaunchParcel.ghm });
    paramLaunchParcel = new Intent(paramContext, AppBrandLaunchProxyUI.class);
    if (!(paramContext instanceof Activity)) {
      paramLaunchParcel.addFlags(268435456);
    }
    paramLaunchParcel.putExtra("extra_from_mm", true);
    paramLaunchParcel.putExtra("extra_entry_token", (String)localObject2);
    paramContext.startActivity(paramLaunchParcel);
    return true;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/appbrand/launching/precondition/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */