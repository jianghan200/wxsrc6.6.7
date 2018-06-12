package com.tencent.mm.plugin.appbrand.jsapi.share;

import com.tencent.mm.plugin.appbrand.jsapi.a;
import com.tencent.mm.plugin.appbrand.jsapi.e;
import com.tencent.mm.plugin.appbrand.page.p;
import com.tencent.mm.sdk.platformtools.x;
import org.json.JSONObject;

public final class b
  extends a
{
  public static final int CTRL_INDEX = 203;
  public static final String NAME = "hideShareMenu";
  
  public final void a(com.tencent.mm.plugin.appbrand.l paraml, JSONObject paramJSONObject, int paramInt)
  {
    x.i("MicroMsg.JsApiHideShareMenu", "invoke");
    paramJSONObject = d(paraml);
    if (paramJSONObject != null) {
      paramJSONObject.D(com.tencent.mm.plugin.appbrand.menu.l.gjw, true);
    }
    paraml.E(paramInt, f("ok", null));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/share/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */