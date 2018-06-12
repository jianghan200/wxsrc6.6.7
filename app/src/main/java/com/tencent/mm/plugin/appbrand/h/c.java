package com.tencent.mm.plugin.appbrand.h;

import com.tencent.mm.plugin.messenger.a.e.a;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.Map;

public final class c
  implements e.a
{
  public final String h(Map<String, String> paramMap, String paramString)
  {
    if ((paramMap == null) || (paramMap.isEmpty()))
    {
      x.w("MicroMsg.WxaSysTemplateMsgDigestHandler", "values map is null or nil");
      return "";
    }
    return bi.oV((String)paramMap.get(paramString + ".title"));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/appbrand/h/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */