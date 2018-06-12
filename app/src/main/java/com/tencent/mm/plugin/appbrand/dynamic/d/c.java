package com.tencent.mm.plugin.appbrand.dynamic.d;

import com.tencent.mm.sdk.platformtools.ao;
import com.tencent.mm.u.b.b.a;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class c
  extends com.tencent.mm.plugin.appbrand.dynamic.d.a.a
{
  public c(int paramInt)
  {
    super("getNetworkType", paramInt);
  }
  
  protected final void a(com.tencent.mm.u.c.a parama, JSONObject paramJSONObject, b.a<JSONObject> parama1)
  {
    parama = parama.getContext();
    paramJSONObject = new HashMap();
    if (!ao.isConnected(parama)) {
      paramJSONObject.put("networkType", "none");
    }
    for (;;)
    {
      parama1.aA(a(true, "", paramJSONObject));
      return;
      if (ao.is2G(parama)) {
        paramJSONObject.put("networkType", "2g");
      } else if (ao.is3G(parama)) {
        paramJSONObject.put("networkType", "3g");
      } else if (ao.is4G(parama)) {
        paramJSONObject.put("networkType", "4g");
      } else if (ao.isWifi(parama)) {
        paramJSONObject.put("networkType", "wifi");
      } else {
        paramJSONObject.put("networkType", "unknown");
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/appbrand/dynamic/d/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */