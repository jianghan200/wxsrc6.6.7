package com.tencent.mm.plugin.appbrand.jsapi;

import com.tencent.mm.plugin.appbrand.config.a.e;
import com.tencent.mm.plugin.appbrand.g;
import com.tencent.mm.plugin.appbrand.l;
import com.tencent.mm.plugin.appbrand.page.n;
import com.tencent.mm.plugin.appbrand.page.n.13;
import org.json.JSONObject;

public final class ba
  extends a
{
  public static final int CTRL_INDEX = 13;
  public static final String NAME = "redirectTo";
  
  public final void a(l paraml, JSONObject paramJSONObject, int paramInt)
  {
    paramJSONObject = paramJSONObject.optString("url");
    if (paraml.fdO.fcv.foP.rH(paramJSONObject))
    {
      paraml.E(paramInt, f("fail:can not redirect to a tab bar page", null));
      return;
    }
    n localn = paraml.fdO.fcz;
    localn.runOnUiThread(new n.13(localn, paramJSONObject));
    paraml.E(paramInt, f("ok", null));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/ba.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */