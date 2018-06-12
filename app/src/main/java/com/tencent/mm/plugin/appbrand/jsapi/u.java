package com.tencent.mm.plugin.appbrand.jsapi;

import com.tencent.mm.plugin.appbrand.jsapi.b.a;
import com.tencent.mm.plugin.appbrand.jsapi.file.f.a;
import com.tencent.mm.plugin.appbrand.l;
import com.tencent.mm.sdk.platformtools.x;
import org.json.JSONObject;

public final class u
  extends n
{
  public static final int CTRL_INDEX = 401;
  public static final String NAME = "canvasToTempFilePathSync";
  
  public final String a(l paraml, JSONObject paramJSONObject)
  {
    paraml = d(paraml);
    if (paraml == null)
    {
      x.w("MicroMsg.JsApiCanvasToTempFilePathSync", "invoke JsApi insertView failed, current page view is null.");
      return f("fail", null);
    }
    x.i("MicroMsg.JsApiCanvasToTempFilePathSync", "call toTempFilePathForGame.");
    paraml = a.a(paraml, paramJSONObject, true);
    return f(paraml.Yy, paraml.values);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */