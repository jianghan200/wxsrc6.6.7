package com.tencent.mm.plugin.appbrand.jsapi.storage;

import com.tencent.mm.plugin.appbrand.ipc.AppBrandMainProcessService;
import com.tencent.mm.plugin.appbrand.jsapi.e;
import com.tencent.mm.plugin.appbrand.jsapi.n;
import com.tencent.mm.plugin.appbrand.l;
import com.tencent.mm.sdk.platformtools.bi;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class f
  extends n
{
  public static final int CTRL_INDEX = 17;
  public static final String NAME = "getStorageSync";
  
  public final String a(l paraml, JSONObject paramJSONObject)
  {
    paramJSONObject = paramJSONObject.optString("key");
    if (bi.oW(paramJSONObject)) {
      return f("fail", null);
    }
    JsApiGetStorageTask localJsApiGetStorageTask = new JsApiGetStorageTask();
    localJsApiGetStorageTask.appId = paraml.mAppId;
    localJsApiGetStorageTask.aAL = paramJSONObject;
    AppBrandMainProcessService.b(localJsApiGetStorageTask);
    HashMap localHashMap;
    if (localJsApiGetStorageTask.value == null)
    {
      paraml = "fail";
      localHashMap = new HashMap();
      if (localJsApiGetStorageTask.value != null) {
        break label123;
      }
      paramJSONObject = "";
      label77:
      localHashMap.put("data", paramJSONObject);
      if (localJsApiGetStorageTask.type != null) {
        break label131;
      }
    }
    label123:
    label131:
    for (paramJSONObject = "";; paramJSONObject = localJsApiGetStorageTask.type)
    {
      localHashMap.put("dataType", paramJSONObject);
      return f(paraml, localHashMap);
      paraml = "ok";
      break;
      paramJSONObject = localJsApiGetStorageTask.value;
      break label77;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/storage/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */