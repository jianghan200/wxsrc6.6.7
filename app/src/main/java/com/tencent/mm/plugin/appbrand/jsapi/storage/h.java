package com.tencent.mm.plugin.appbrand.jsapi.storage;

import com.tencent.mm.plugin.appbrand.ipc.AppBrandMainProcessService;
import com.tencent.mm.plugin.appbrand.jsapi.e;
import com.tencent.mm.plugin.appbrand.jsapi.n;
import com.tencent.mm.plugin.appbrand.l;
import com.tencent.mm.sdk.platformtools.bi;
import org.json.JSONObject;

public final class h
  extends n
{
  public static final int CTRL_INDEX = 98;
  public static final String NAME = "removeStorageSync";
  
  public final String a(l paraml, JSONObject paramJSONObject)
  {
    paramJSONObject = paramJSONObject.optString("key");
    if (bi.oW(paramJSONObject)) {
      return f("fail", null);
    }
    JsApiRemoveStorageTask localJsApiRemoveStorageTask = new JsApiRemoveStorageTask();
    localJsApiRemoveStorageTask.appId = paraml.mAppId;
    localJsApiRemoveStorageTask.aAL = paramJSONObject;
    AppBrandMainProcessService.b(localJsApiRemoveStorageTask);
    return f("ok", null);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/storage/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */