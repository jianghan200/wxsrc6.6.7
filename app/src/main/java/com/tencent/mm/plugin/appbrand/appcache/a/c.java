package com.tencent.mm.plugin.appbrand.appcache.a;

import com.tencent.mm.ab.d.a;
import com.tencent.mm.ab.d.b;
import com.tencent.mm.by.f;
import com.tencent.mm.by.g;
import com.tencent.mm.plugin.messenger.foundation.a.m;
import com.tencent.mm.sdk.platformtools.bi;
import java.util.Map;

public enum c
  implements m
{
  private c() {}
  
  public final d.b a(String paramString, Map<String, String> paramMap, d.a parama)
  {
    paramString = (String)paramMap.get(".sysmsg.WeAppSyncCommand.Base64JsonContent");
    if (!bi.oW(paramString)) {
      g.cC(paramString).j(new c.1(this));
    }
    return null;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/appbrand/appcache/a/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */