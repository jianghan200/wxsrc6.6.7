package com.tencent.mm.plugin.appbrand.jsapi.storage;

import com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig;
import com.tencent.mm.plugin.appbrand.config.AppBrandSysConfig;
import com.tencent.mm.plugin.appbrand.g;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandMainProcessService;
import com.tencent.mm.plugin.appbrand.jsapi.a;
import com.tencent.mm.plugin.appbrand.jsapi.e;
import com.tencent.mm.plugin.appbrand.l;
import com.tencent.mm.sdk.platformtools.bi;
import org.json.JSONObject;

public final class i
  extends a
{
  public static final int CTRL_INDEX = 16;
  public static final String NAME = "setStorage";
  
  public final void a(l paraml, JSONObject paramJSONObject, int paramInt)
  {
    String str1 = paramJSONObject.optString("key");
    String str2 = paramJSONObject.optString("data");
    paramJSONObject = paramJSONObject.optString("dataType");
    if (bi.oW(str1))
    {
      paraml.E(paramInt, f("fail", null));
      return;
    }
    int j = paraml.fdO.fcu.frn.fpI;
    int k = str1.length();
    if (str2 == null) {}
    for (int i = 0; i + k > j; i = str2.length())
    {
      paraml.E(paramInt, f("fail:entry size limit reached", null));
      return;
    }
    JsApiSetStorageTask localJsApiSetStorageTask = new JsApiSetStorageTask();
    localJsApiSetStorageTask.appId = paraml.mAppId;
    localJsApiSetStorageTask.E(str1, str2, paramJSONObject);
    localJsApiSetStorageTask.fFC = new i.1(this, paraml, paramInt, localJsApiSetStorageTask);
    localJsApiSetStorageTask.ahA();
    AppBrandMainProcessService.a(localJsApiSetStorageTask);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/storage/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */