package com.tencent.mm.plugin.appbrand.jsapi.file;

import com.tencent.mm.plugin.appbrand.g;
import com.tencent.mm.plugin.appbrand.jsapi.e;
import com.tencent.mm.plugin.appbrand.l;
import com.tencent.mm.plugin.appbrand.r.m;
import com.tencent.mm.sdk.platformtools.bi;
import org.json.JSONObject;

abstract class d
  implements f
{
  e fQc;
  
  static {}
  
  abstract f.a a(l paraml, String paramString, JSONObject paramJSONObject);
  
  public final f.a b(l paraml, JSONObject paramJSONObject)
  {
    String str = q(paramJSONObject);
    if (bi.oW(str)) {
      return new f.a("fail invalid path", new Object[0]);
    }
    if (paraml.fdO.mFinished) {
      return new f.a("fail:interrupted", new Object[0]);
    }
    paramJSONObject = a(paraml, str, paramJSONObject);
    m.a(paraml, paramJSONObject.values, this.fQc);
    return paramJSONObject;
  }
  
  protected String q(JSONObject paramJSONObject)
  {
    Object localObject2 = paramJSONObject.optString("filePath", null);
    Object localObject1 = localObject2;
    if (bi.oW((String)localObject2)) {
      localObject1 = paramJSONObject.optString("dirPath", null);
    }
    localObject2 = localObject1;
    if (bi.oW((String)localObject1)) {
      localObject2 = paramJSONObject.optString("path", null);
    }
    return (String)localObject2;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/file/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */