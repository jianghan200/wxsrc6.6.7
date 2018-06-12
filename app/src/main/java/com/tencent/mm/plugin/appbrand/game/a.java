package com.tencent.mm.plugin.appbrand.game;

import com.tencent.mm.plugin.appbrand.appcache.ao;
import com.tencent.mm.plugin.appbrand.g;
import com.tencent.mm.plugin.appbrand.q.c;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;

final class a
{
  static String a(g paramg, String paramString, boolean paramBoolean)
  {
    x.i("MicroMsg.GameFileUtils", "Ready to getJsString js! filePath: %s,isAsset:%s", new Object[] { paramString, Boolean.valueOf(paramBoolean) });
    if (paramBoolean) {}
    for (paramg = c.vM(paramString);; paramg = ao.a(paramg, paramString))
    {
      if (bi.oW(paramg)) {
        x.e("MicroMsg.GameFileUtils", "js code is null, filePath : " + paramString);
      }
      return paramg;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/appbrand/game/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */