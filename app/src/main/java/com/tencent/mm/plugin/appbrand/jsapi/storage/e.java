package com.tencent.mm.plugin.appbrand.jsapi.storage;

import com.tencent.mm.plugin.appbrand.ipc.AppBrandMainProcessService;
import com.tencent.mm.plugin.appbrand.jsapi.n;
import com.tencent.mm.plugin.appbrand.l;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class e
  extends n
{
  public static final int CTRL_INDEX = 113;
  public static final String NAME = "getStorageInfoSync";
  
  public final String a(l paraml, JSONObject paramJSONObject)
  {
    paramJSONObject = new JsApiGetStorageInfoTask();
    paramJSONObject.appId = paraml.mAppId;
    AppBrandMainProcessService.b(paramJSONObject);
    paraml = new HashMap();
    paraml.put("keys", paramJSONObject.fZr);
    paraml.put("currentSize", Integer.valueOf(paramJSONObject.size));
    paraml.put("limitSize", Integer.valueOf(paramJSONObject.limit));
    return f("ok", paraml);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/storage/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */