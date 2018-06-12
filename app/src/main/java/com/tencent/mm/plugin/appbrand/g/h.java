package com.tencent.mm.plugin.appbrand.g;

import android.content.Context;
import android.content.SharedPreferences;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.xweb.g;

public final class h
{
  private static boolean gdQ = false;
  
  public static b cD(Context paramContext)
  {
    Object localObject = ad.getContext().getSharedPreferences("com.tencent.mm_webview_x5_preferences", 4);
    String str = ((SharedPreferences)localObject).getString("tbs_webview_disable", "0");
    int i;
    if ((!((SharedPreferences)localObject).getBoolean("switch_x5_jscore", true)) || ("1".equals(str)) || (gdQ))
    {
      i = 1;
      if (i == 0) {
        break label113;
      }
      paramContext = new j(paramContext);
    }
    for (;;)
    {
      if ((paramContext instanceof j))
      {
        com.tencent.mm.plugin.report.service.h.mEJ.a(434L, 1L, 1L, false);
        x.i("MicroMsg.AppBrandJsRuntimeFactory", "Using WebView Based Javascript Engine");
        com.tencent.mm.plugin.report.service.h.mEJ.a(434L, 0L, 1L, false);
        return paramContext;
        i = 0;
        break;
        label113:
        localObject = new i(paramContext);
        if (((i)localObject).gdR.isValid()) {
          break label208;
        }
        gdQ = true;
        ((b)localObject).destroy();
        paramContext = new j(paramContext);
        continue;
      }
      localObject = com.tencent.mm.plugin.report.service.h.mEJ;
      if (!((i)paramContext).gdR.isValid()) {}
      for (long l = 1L;; l = 2L)
      {
        ((com.tencent.mm.plugin.report.service.h)localObject).a(434L, l, 1L, false);
        x.i("MicroMsg.AppBrandJsRuntimeFactory", "Using v8 Javascript Engine, probably");
        break;
      }
      label208:
      paramContext = (Context)localObject;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/g/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */