package com.tencent.mm.plugin.appbrand.debugger;

import android.content.Intent;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.appbrand.n.d;
import com.tencent.mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;

final class e
  implements DebuggerShell.a
{
  public final String name()
  {
    return "LaunchApp";
  }
  
  public final void s(Intent paramIntent)
  {
    String str1 = paramIntent.getStringExtra("username");
    String str2 = paramIntent.getStringExtra("appId");
    String str3 = paramIntent.getStringExtra("path");
    int i = bi.getInt(paramIntent.getStringExtra("versionType"), 0);
    int j = bi.getInt(paramIntent.getStringExtra("scene"), 1030);
    paramIntent = paramIntent.getStringExtra("sceneNote");
    AppBrandStatObject localAppBrandStatObject = new AppBrandStatObject();
    localAppBrandStatObject.scene = j;
    localAppBrandStatObject.bGG = paramIntent;
    ((d)g.l(d.class)).a(ad.getContext(), str1, str2, i, 0, str3, localAppBrandStatObject);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/appbrand/debugger/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */