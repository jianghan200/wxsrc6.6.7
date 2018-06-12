package com.tencent.mm.plugin.appbrand.jsapi;

import com.tencent.mm.plugin.appbrand.l;
import com.tencent.mm.sdk.platformtools.ao;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class ad
  extends a
{
  public static final int CTRL_INDEX = 39;
  public static final String NAME = "getNetworkType";
  
  public final void a(l paraml, JSONObject paramJSONObject, int paramInt)
  {
    paramJSONObject = new HashMap();
    if (!ao.isConnected(paraml.getContext())) {
      paramJSONObject.put("networkType", "none");
    }
    for (;;)
    {
      paraml.E(paramInt, f("ok", paramJSONObject));
      return;
      if (ao.is2G(paraml.getContext())) {
        paramJSONObject.put("networkType", "2g");
      } else if (ao.is3G(paraml.getContext())) {
        paramJSONObject.put("networkType", "3g");
      } else if (ao.is4G(paraml.getContext())) {
        paramJSONObject.put("networkType", "4g");
      } else if (ao.isWifi(paraml.getContext())) {
        paramJSONObject.put("networkType", "wifi");
      } else {
        paramJSONObject.put("networkType", "unknown");
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/ad.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */