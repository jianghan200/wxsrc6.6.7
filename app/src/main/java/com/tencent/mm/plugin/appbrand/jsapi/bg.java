package com.tencent.mm.plugin.appbrand.jsapi;

import com.tencent.mm.plugin.appbrand.l;
import com.tencent.mm.plugin.appbrand.page.p;
import com.tencent.mm.sdk.platformtools.x;
import org.json.JSONObject;

public final class bg
  extends a
{
  public static final int CTRL_INDEX = 388;
  public static final String NAME = "setMenuStyle";
  
  public final void a(l paraml, JSONObject paramJSONObject, int paramInt)
  {
    x.d("MicroMsg.JsApiSetMenuStyle", "JsApiSetMenuStyle!");
    if (paramJSONObject == null)
    {
      paraml.E(paramInt, f("fail:data is null", null));
      x.e("MicroMsg.JsApiSetMenuStyle", "data is null");
      return;
    }
    paramJSONObject = paramJSONObject.optString("style");
    p localp = d(paraml);
    if (localp == null)
    {
      paraml.E(paramInt, f("fail view is null", null));
      return;
    }
    if (paramJSONObject.equalsIgnoreCase("dark")) {
      localp.vb("dark");
    }
    for (;;)
    {
      paraml.E(paramInt, f("ok", null));
      return;
      if (!paramJSONObject.equalsIgnoreCase("light")) {
        break;
      }
      localp.vb("light");
    }
    paraml.E(paramInt, f("fail invalid style " + paramJSONObject, null));
    x.e("MicroMsg.JsApiSetMenuStyle", "fail invalid style %s", new Object[] { paramJSONObject });
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/bg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */