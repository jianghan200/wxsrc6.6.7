package com.tencent.mm.plugin.appbrand.jsapi;

import android.util.SparseArray;
import com.tencent.mm.plugin.appbrand.performance.AppBrandPerformanceManager;
import com.tencent.mm.sdk.platformtools.bi;
import org.json.JSONArray;
import org.json.JSONObject;

final class bu
  extends a
{
  public static final int CTRL_INDEX = 215;
  public static final String NAME = "updatePerfData";
  private static final SparseArray<Integer> fHm = new SparseArray();
  
  bu()
  {
    fHm.put("firstRenderTime".hashCode(), Integer.valueOf(301));
    fHm.put("reRenderTime".hashCode(), Integer.valueOf(302));
    fHm.put("webview2AppServiceTotalTime".hashCode(), Integer.valueOf(402));
    fHm.put("webview2AppServiceDataSize".hashCode(), Integer.valueOf(403));
    fHm.put("webview2AppServiceNativeTime".hashCode(), Integer.valueOf(404));
    fHm.put("appService2WebviewTotalTime".hashCode(), Integer.valueOf(405));
    fHm.put("appService2WebviewDataSize".hashCode(), Integer.valueOf(406));
    fHm.put("appService2WebviewNativeTime".hashCode(), Integer.valueOf(407));
  }
  
  public final void a(c paramc, JSONObject paramJSONObject, int paramInt)
  {
    paramJSONObject = paramJSONObject.optJSONArray("dataArray");
    if ((!AppBrandPerformanceManager.vi(paramc.getAppId())) || (paramJSONObject == null))
    {
      paramc.E(paramInt, f("fail", null));
      return;
    }
    int i = 0;
    if (i < paramJSONObject.length())
    {
      Object localObject = paramJSONObject.optJSONObject(i);
      String str;
      if (localObject != null)
      {
        str = ((JSONObject)localObject).optString("key");
        localObject = ((JSONObject)localObject).optString("value");
        if (!bi.oW(str))
        {
          Integer localInteger = (Integer)fHm.get(str.hashCode());
          if (localInteger == null) {
            break label129;
          }
          AppBrandPerformanceManager.o(paramc.getAppId(), localInteger.intValue(), (String)localObject);
        }
      }
      for (;;)
      {
        i += 1;
        break;
        label129:
        AppBrandPerformanceManager.H(paramc.getAppId(), str, (String)localObject);
      }
    }
    paramc.E(paramInt, f("ok", null));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/bu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */