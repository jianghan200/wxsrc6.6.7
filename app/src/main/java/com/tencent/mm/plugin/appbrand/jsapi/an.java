package com.tencent.mm.plugin.appbrand.jsapi;

import com.tencent.mm.plugin.appbrand.config.AppBrandSysConfig;
import com.tencent.mm.plugin.appbrand.config.a.e;
import com.tencent.mm.plugin.appbrand.g;
import com.tencent.mm.plugin.appbrand.l;
import com.tencent.mm.plugin.appbrand.page.n;
import com.tencent.mm.plugin.appbrand.page.n.11;
import com.tencent.mm.sdk.platformtools.x;
import org.json.JSONObject;

public final class an
  extends a
{
  public static final int CTRL_INDEX = 14;
  public static final String NAME = "navigateTo";
  
  public final void a(l paraml, JSONObject paramJSONObject, int paramInt)
  {
    int i = paraml.fdO.fcu.fqR;
    if (paraml.fdO.fcz.getPageCount() >= i)
    {
      paraml.E(paramInt, f("fail:page limit exceeded: " + i, null));
      x.e("MicroMsg.JsApiNavigateTo", "page limit exceeded: " + i);
      return;
    }
    paramJSONObject = paramJSONObject.optString("url");
    if (paraml.fdO.fcv.foP.rH(paramJSONObject))
    {
      paraml.E(paramInt, f("fail:can not navigate to a tab bar page", null));
      return;
    }
    n localn = paraml.fdO.fcz;
    localn.runOnUiThread(new n.11(localn, paramJSONObject));
    paraml.E(paramInt, f("ok", null));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/an.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */