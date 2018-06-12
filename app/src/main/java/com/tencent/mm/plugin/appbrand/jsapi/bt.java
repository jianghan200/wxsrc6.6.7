package com.tencent.mm.plugin.appbrand.jsapi;

import com.tencent.mm.plugin.appbrand.performance.AppBrandPerformanceManager;
import com.tencent.mm.sdk.platformtools.bi;
import org.json.JSONArray;
import org.json.JSONObject;

final class bt
  extends a
{
  public static final int CTRL_INDEX = 283;
  public static final String NAME = "traceEvent";
  
  public final void a(c paramc, JSONObject paramJSONObject, int paramInt)
  {
    paramJSONObject = paramJSONObject.optJSONArray("events");
    if ((!AppBrandPerformanceManager.vi(paramc.getAppId())) || (paramJSONObject == null))
    {
      paramc.E(paramInt, f("fail", null));
      return;
    }
    int i = 0;
    while (i < paramJSONObject.length())
    {
      Object localObject = paramJSONObject.optJSONObject(i);
      if (localObject != null)
      {
        String str1 = ((JSONObject)localObject).optString("category");
        String str2 = ((JSONObject)localObject).optString("name");
        long l1 = ((JSONObject)localObject).optLong("start");
        long l2 = ((JSONObject)localObject).optLong("end");
        String str3 = ((JSONObject)localObject).optString("phase");
        localObject = ((JSONObject)localObject).optString("args");
        if (!bi.oW(str2)) {
          com.tencent.mm.plugin.appbrand.performance.a.a(paramc.getAppId(), str1, str2, str3, l1, l2, (String)localObject);
        }
      }
      i += 1;
    }
    paramc.E(paramInt, f("ok", null));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/bt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */