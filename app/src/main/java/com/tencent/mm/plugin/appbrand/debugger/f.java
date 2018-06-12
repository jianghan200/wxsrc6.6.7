package com.tencent.mm.plugin.appbrand.debugger;

import com.tencent.mm.ab.d.a;
import com.tencent.mm.modelappbrand.LaunchParamsOptional;
import com.tencent.mm.plugin.appbrand.appcache.ap;
import com.tencent.mm.plugin.appbrand.launching.AppBrandLaunchProxyUI;
import com.tencent.mm.plugin.appbrand.launching.h;
import com.tencent.mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.mm.plugin.messenger.foundation.a.n;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.Map;

public final class f
  implements n
{
  public final void onNewXmlReceived(String paramString, Map<String, String> paramMap, d.a parama)
  {
    String str1;
    String str2;
    if (paramMap != null)
    {
      paramString = (String)paramMap.get(".sysmsg.DebugAppCodeUpdated.OpenAppInfo.AppID");
      parama = (String)paramMap.get(".sysmsg.DebugAppCodeUpdated.OpenAppInfo.UserName");
      str1 = (String)paramMap.get(".sysmsg.DebugAppCodeUpdated.OpenAppInfo.Path");
      localObject = (String)paramMap.get(".sysmsg.DebugAppCodeUpdated.OpenAppInfo.URL");
      str2 = (String)paramMap.get(".sysmsg.DebugAppCodeUpdated.OpenAppInfo.MD5");
      paramMap = (String)paramMap.get(".sysmsg.DebugAppCodeUpdated.OpenAppInfo.ExtInfo");
      x.i("MicroMsg.RemoteDebugCodeUpdateSysCmdMsgListener", "onNewXmlReceived appId %s, userName %s, path %s, url %s, md5 %s, extInfo %s", new Object[] { paramString, parama, str1, localObject, str2, paramMap });
      if ((bi.oW(paramString)) || (bi.oW(parama)) || (bi.oW((String)localObject))) {
        x.i("MicroMsg.RemoteDebugCodeUpdateSysCmdMsgListener", "appId = %s, username = %s, codeURL = %s, invalid, return", new Object[] { paramString, parama, localObject });
      }
    }
    else
    {
      return;
    }
    if (com.tencent.mm.plugin.appbrand.app.e.abi().a(paramString, 1, (String)localObject, str2, 0L, bi.VE() + 7200L)) {
      com.tencent.mm.plugin.appbrand.task.e.aN(paramString, 1);
    }
    Object localObject = new LaunchParamsOptional();
    ((LaunchParamsOptional)localObject).dFz = paramMap;
    ((h)com.tencent.mm.plugin.appbrand.app.e.x(h.class)).n(paramString, 1, paramMap);
    paramMap = new AppBrandStatObject();
    paramMap.scene = 1101;
    paramMap.bGG = (paramString + ":" + parama);
    AppBrandLaunchProxyUI.a(ad.getContext(), parama, str1, 1, -1, paramMap, (LaunchParamsOptional)localObject);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/appbrand/debugger/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */