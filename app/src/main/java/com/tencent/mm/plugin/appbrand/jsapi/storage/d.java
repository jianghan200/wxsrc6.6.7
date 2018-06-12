package com.tencent.mm.plugin.appbrand.jsapi.storage;

import com.tencent.mm.plugin.appbrand.ipc.AppBrandMainProcessService;
import com.tencent.mm.plugin.appbrand.jsapi.a;
import com.tencent.mm.plugin.appbrand.l;
import org.json.JSONObject;

public final class d
  extends a
{
  public static final int CTRL_INDEX = 113;
  public static final String NAME = "getStorageInfo";
  
  public final void a(l paraml, JSONObject paramJSONObject, int paramInt)
  {
    paramJSONObject = new JsApiGetStorageInfoTask();
    paramJSONObject.appId = paraml.mAppId;
    paramJSONObject.fFC = new d.1(this, paramJSONObject, paraml, paramInt);
    paramJSONObject.ahA();
    AppBrandMainProcessService.a(paramJSONObject);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/storage/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */