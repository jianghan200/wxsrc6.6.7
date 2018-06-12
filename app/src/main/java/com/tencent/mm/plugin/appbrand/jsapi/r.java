package com.tencent.mm.plugin.appbrand.jsapi;

import com.tencent.mm.plugin.appbrand.l;
import com.tencent.mm.sdk.platformtools.x;
import org.json.JSONObject;

public final class r
  extends JsApiUploadWeRunData
{
  public static final int CTRL_INDEX = 324;
  public static final String NAME = "addWeRunData";
  
  public final void a(l paraml, JSONObject paramJSONObject, int paramInt)
  {
    x.d("MicroMsg.JsApiAddWeRunData", "JsApiAddWeRunData!");
    if (paramJSONObject == null)
    {
      paraml.E(paramInt, f("fail:data is null", null));
      x.e("MicroMsg.JsApiAddWeRunData", "data is null");
      return;
    }
    a(this, paraml, paramInt, paramJSONObject.optInt("step"), true);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */