package com.tencent.mm.plugin.appbrand.jsapi;

import com.tencent.mm.plugin.appbrand.l;
import com.tencent.mm.plugin.appbrand.page.p;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.x;
import org.json.JSONObject;

public final class aw
  extends a
{
  public static final int CTRL_INDEX = 430;
  public static final String NAME = "pageNotFoundCallback";
  
  public final void a(l paraml, JSONObject paramJSONObject, int paramInt)
  {
    if (paramJSONObject == null)
    {
      x.e("MicroMsg.JsApiPageNotFoundCallback", "data is null, do nothing");
      paraml.E(paramInt, f("fail", null));
      return;
    }
    x.i("MicroMsg.JsApiPageNotFoundCallback", "pageNotFoundCallback data:%s", new Object[] { paramJSONObject });
    boolean bool = paramJSONObject.optBoolean("hasHandler");
    int i = paramJSONObject.optInt("webviewId", -1);
    paramJSONObject = d(paraml);
    if (Boolean.valueOf(bool).booleanValue())
    {
      if (paramJSONObject != null)
      {
        ah.M(paramJSONObject.gnF);
        if (paramJSONObject.hashCode() != i) {
          x.e("MicroMsg.JsApiPageNotFoundCallback", "appBrandPageView.getComponentId():%d, webviewId:%d, err", new Object[] { Integer.valueOf(paramJSONObject.hashCode()), Integer.valueOf(i) });
        }
      }
      for (;;)
      {
        x.i("MicroMsg.JsApiPageNotFoundCallback", "already handler, ignore");
        paraml.E(paramInt, f("ok", null));
        return;
        x.e("MicroMsg.JsApiPageNotFoundCallback", "appBrandPageView is null");
      }
    }
    if ((paramJSONObject != null) && (paramJSONObject.hashCode() == i)) {
      ah.A(new aw.1(this, paramJSONObject));
    }
    x.e("MicroMsg.JsApiPageNotFoundCallback", "currentPageView is null, return");
    paraml.E(paramInt, f("ok", null));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/aw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */