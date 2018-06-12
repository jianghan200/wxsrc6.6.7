package com.tencent.mm.plugin.appbrand.jsapi.share;

import com.tencent.mm.model.u.b;
import com.tencent.mm.plugin.appbrand.jsapi.a;
import com.tencent.mm.plugin.appbrand.jsapi.e;
import com.tencent.mm.plugin.appbrand.menu.k;
import com.tencent.mm.plugin.appbrand.page.p;
import com.tencent.mm.sdk.platformtools.x;
import org.json.JSONObject;

public final class g
  extends a
{
  public static final int CTRL_INDEX = 202;
  public static final String NAME = "showShareMenuWithShareTicket";
  
  public final void a(com.tencent.mm.plugin.appbrand.l paraml, JSONObject paramJSONObject, int paramInt)
  {
    x.i("MicroMsg.JsApiShowShareMenuWithShareTicket", "invoke");
    paramJSONObject = d(paraml);
    if (paramJSONObject != null)
    {
      paramJSONObject.D(com.tencent.mm.plugin.appbrand.menu.l.gjw, false);
      paramJSONObject = paramJSONObject.lo(com.tencent.mm.plugin.appbrand.menu.l.gjw);
      if (paramJSONObject == null)
      {
        paraml.E(paramInt, f("fail:menu item do not exist", null));
        return;
      }
      paramJSONObject.fvX.p("enable_share_with_share_ticket", Boolean.valueOf(true));
      paraml.E(paramInt, f("ok", null));
      return;
    }
    paraml.E(paramInt, f("ok", null));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/share/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */