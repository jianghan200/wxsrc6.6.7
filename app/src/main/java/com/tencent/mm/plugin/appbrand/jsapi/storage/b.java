package com.tencent.mm.plugin.appbrand.jsapi.storage;

import com.tencent.mm.plugin.appbrand.ipc.AppBrandMainProcessService;
import com.tencent.mm.plugin.appbrand.jsapi.e;
import com.tencent.mm.plugin.appbrand.jsapi.n;
import com.tencent.mm.plugin.appbrand.l;
import org.json.JSONObject;

public final class b
  extends n
{
  public static final int CTRL_INDEX = 18;
  public static final String NAME = "clearStorageSync";
  
  public final String a(l paraml, JSONObject paramJSONObject)
  {
    paramJSONObject = new JsApiClearStorageTask();
    paramJSONObject.appId = paraml.mAppId;
    AppBrandMainProcessService.b(paramJSONObject);
    return f("ok", null);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/storage/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */