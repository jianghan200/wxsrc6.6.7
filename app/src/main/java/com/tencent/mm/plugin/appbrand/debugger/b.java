package com.tencent.mm.plugin.appbrand.debugger;

import android.content.Intent;
import com.tencent.mm.plugin.appbrand.appcache.an.c;
import com.tencent.mm.plugin.appbrand.task.e;
import com.tencent.mm.sdk.platformtools.bi;
import java.util.Map;

public final class b
  implements an.c, DebuggerShell.a
{
  public final String name()
  {
    return "ForceKillAppNotify";
  }
  
  public final void s(Intent paramIntent)
  {
    e.aN(paramIntent.getStringExtra("appId"), paramIntent.getIntExtra("versionType", 0));
  }
  
  public final void u(Map<String, String> paramMap)
  {
    String str;
    int i;
    if (DebuggerShell.aeq())
    {
      str = (String)paramMap.get(".sysmsg.AppBrandForceKill.AppId");
      i = bi.getInt((String)paramMap.get(".sysmsg.AppBrandForceKill.VersionType"), 0);
      if (!bi.oW(str)) {}
    }
    else
    {
      return;
    }
    e.aN(str, i);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/appbrand/debugger/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */