package com.tencent.mm.plugin.appbrand.jsapi.storage;

import com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig;
import com.tencent.mm.plugin.appbrand.config.AppBrandSysConfig;
import com.tencent.mm.plugin.appbrand.g;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandMainProcessService;
import com.tencent.mm.plugin.appbrand.jsapi.e;
import com.tencent.mm.plugin.appbrand.jsapi.n;
import com.tencent.mm.plugin.appbrand.l;
import com.tencent.mm.sdk.platformtools.bi;
import org.json.JSONObject;

public final class j
  extends n
{
  public static final int CTRL_INDEX = 16;
  public static final String NAME = "setStorageSync";
  
  public final String a(l paraml, JSONObject paramJSONObject)
  {
    String str1 = paramJSONObject.optString("key");
    String str2 = paramJSONObject.optString("data");
    String str3 = paramJSONObject.optString("dataType");
    if (bi.oW(str1)) {
      return f("fail", null);
    }
    int j = paraml.fdO.fcu.frn.fpI;
    int k = str1.length();
    if (str2 == null) {}
    for (int i = 0; i + k > j; i = str2.length()) {
      return f("fail:entry size limit reached", null);
    }
    paramJSONObject = "fail";
    JsApiSetStorageTask localJsApiSetStorageTask = new JsApiSetStorageTask();
    localJsApiSetStorageTask.appId = paraml.mAppId;
    localJsApiSetStorageTask.E(str1, str2, str3);
    paraml = paramJSONObject;
    if (AppBrandMainProcessService.b(localJsApiSetStorageTask)) {
      paraml = localJsApiSetStorageTask.result;
    }
    return f(paraml, null);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/storage/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */