package com.tencent.mm.plugin.appbrand.launching.precondition;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer;
import com.tencent.mm.plugin.appbrand.launching.AppBrandLaunchProxyUI;
import com.tencent.mm.plugin.appbrand.launching.params.LaunchParcel;
import com.tencent.mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.mm.plugin.appbrand.ui.AppBrandInToolsUI;
import com.tencent.mm.plugin.appbrand.ui.AppBrandPluginUI;
import com.tencent.mm.plugin.appbrand.ui.AppBrandUI;

final class c
  extends a
{
  protected final boolean a(Context paramContext, LaunchParcel paramLaunchParcel)
  {
    int j = 0;
    Intent localIntent = new Intent(paramContext, AppBrandLaunchProxyUI.class);
    if (!(paramContext instanceof Activity)) {
      localIntent.addFlags(268435456);
    }
    localIntent.putExtra("extra_from_mm", false);
    localIntent.putExtra("extra_launch_parcel", paramLaunchParcel);
    localIntent.putExtra("extra_launch_source_context", paramContext.getClass().getName());
    int i;
    if (!(paramContext instanceof AppBrandUI)) {
      i = j;
    }
    for (;;)
    {
      if (i != 0) {
        localIntent.putExtra("extra_result_receiver", new ClientLaunchEntry.1(this, new Handler(Looper.getMainLooper()), paramContext));
      }
      paramContext.startActivity(localIntent);
      return true;
      i = j;
      if (!(paramContext instanceof AppBrandPluginUI))
      {
        i = j;
        if (!(paramContext instanceof AppBrandInToolsUI)) {
          if (paramLaunchParcel.fqA != null)
          {
            i = j;
            if (paramLaunchParcel.fqA.fqE == 1) {}
          }
          else
          {
            i = j;
            if (paramLaunchParcel.ghm.scene != 1085) {
              i = 1;
            }
          }
        }
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/appbrand/launching/precondition/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */