package com.tencent.mm.plugin.appbrand.jsapi.storage;

import com.tencent.mm.plugin.appbrand.ipc.AppBrandMainProcessService;
import com.tencent.mm.plugin.appbrand.jsapi.a;
import com.tencent.mm.plugin.appbrand.jsapi.e;
import com.tencent.mm.plugin.appbrand.l;
import com.tencent.mm.sdk.platformtools.bi;
import org.json.JSONObject;

public final class c
  extends a
{
  public static final int CTRL_INDEX = 17;
  public static final String NAME = "getStorage";
  
  public final void a(l paraml, JSONObject paramJSONObject, int paramInt)
  {
    long l = System.currentTimeMillis();
    paramJSONObject = paramJSONObject.optString("key");
    if (bi.oW(paramJSONObject))
    {
      paraml.E(paramInt, f("fail", null));
      return;
    }
    JsApiGetStorageTask localJsApiGetStorageTask = new JsApiGetStorageTask();
    localJsApiGetStorageTask.appId = paraml.mAppId;
    localJsApiGetStorageTask.aAL = paramJSONObject;
    localJsApiGetStorageTask.fFC = new c.1(this, localJsApiGetStorageTask, paraml, paramInt, l);
    localJsApiGetStorageTask.ahA();
    AppBrandMainProcessService.a(localJsApiGetStorageTask);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/storage/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */