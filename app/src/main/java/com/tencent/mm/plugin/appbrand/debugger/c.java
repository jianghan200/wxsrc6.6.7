package com.tencent.mm.plugin.appbrand.debugger;

import android.content.Intent;
import com.tencent.mm.g.a.qu;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.appbrand.appcache.an.c;
import com.tencent.mm.plugin.appbrand.appcache.ap;
import com.tencent.mm.plugin.appbrand.n.d;
import com.tencent.mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.Map;

public final class c
  implements an.c, DebuggerShell.a
{
  public final String name()
  {
    return "ForceOpenAppNotify";
  }
  
  public final void s(Intent paramIntent)
  {
    String str = paramIntent.getStringExtra("appId");
    int i = paramIntent.getIntExtra("versionType", 0);
    paramIntent = new AppBrandStatObject();
    paramIntent.scene = 1030;
    ((d)g.l(d.class)).a(null, null, str, i, 0, null, paramIntent);
  }
  
  public final void u(Map<String, String> paramMap)
  {
    String str1;
    String str2;
    int i;
    int j;
    String str3;
    String str4;
    if (DebuggerShell.aeq())
    {
      str1 = (String)paramMap.get(".sysmsg.ForceOpenAppNotify.OpenAppInfo.AppID");
      str2 = (String)paramMap.get(".sysmsg.ForceOpenAppNotify.OpenAppInfo.UserName");
      i = bi.getInt((String)paramMap.get(".sysmsg.ForceOpenAppNotify.OpenAppInfo.VersionType"), -1);
      j = bi.getInt((String)paramMap.get(".sysmsg.ForceOpenAppNotify.OpenAppInfo.AppVersion"), -1);
      str3 = (String)paramMap.get(".sysmsg.ForceOpenAppNotify.OpenAppInfo.Path");
      str4 = (String)paramMap.get(".sysmsg.ForceOpenAppNotify.OpenAppInfo.URL");
      paramMap = (String)paramMap.get(".sysmsg.ForceOpenAppNotify.OpenAppInfo.MD5");
      if (i >= 0) {
        break label107;
      }
    }
    label107:
    do
    {
      return;
      if (i == 0) {
        break;
      }
    } while ((com.tencent.mm.plugin.appbrand.app.e.abi() == null) || (bi.oW(str4)) || (bi.oW(paramMap)));
    if (com.tencent.mm.plugin.appbrand.app.e.abi().a(str1, i, str4, paramMap, bi.VE(), bi.VE() + 432000L)) {
      com.tencent.mm.plugin.appbrand.task.e.aN(str1, i);
    }
    x.i("MicroMsg.AppBrand.ForceOpenAppNotify", "before start weapp");
    qu localqu = new qu();
    localqu.cbq.appId = str1;
    localqu.cbq.userName = str2;
    localqu.cbq.cbt = i;
    localqu.cbq.cbs = str3;
    localqu.cbq.cbu = j;
    localqu.cbq.cbv = str4;
    localqu.cbq.cbw = paramMap;
    localqu.cbq.cbx = false;
    localqu.cbq.scene = 1030;
    a.sFg.m(localqu);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/appbrand/debugger/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */