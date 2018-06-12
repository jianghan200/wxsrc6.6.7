package com.tencent.mm.plugin.appbrand.jsapi.share;

import com.tencent.mm.model.u.b;
import com.tencent.mm.plugin.appbrand.jsapi.a;
import com.tencent.mm.plugin.appbrand.jsapi.e;
import com.tencent.mm.plugin.appbrand.menu.k;
import com.tencent.mm.plugin.appbrand.page.p;
import com.tencent.mm.sdk.platformtools.x;
import org.json.JSONObject;

public final class h
  extends a
{
  public static final int CTRL_INDEX = 211;
  public static final String NAME = "updateShareMenuDynamic";
  
  public final void a(com.tencent.mm.plugin.appbrand.l paraml, JSONObject paramJSONObject, int paramInt)
  {
    Object localObject = d(paraml);
    if (localObject != null)
    {
      localObject = ((p)localObject).lo(com.tencent.mm.plugin.appbrand.menu.l.gjw);
      if (localObject == null)
      {
        paraml.E(paramInt, f("fail:menu item do not exist", null));
        return;
      }
      boolean bool = paramJSONObject.optBoolean("isDynamic", false);
      ((k)localObject).fvX.p("enable_share_dynamic", Boolean.valueOf(bool));
      paraml.E(paramInt, f("ok", null));
      x.i("MicroMsg.JsApiUpdateShareMenuDynamic", "update share menu dynamic(%s)", new Object[] { Boolean.valueOf(bool) });
      return;
    }
    paraml.E(paramInt, f("fail", null));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/share/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */