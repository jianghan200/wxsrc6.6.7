package com.tencent.mm.plugin.appbrand.jsapi;

import com.tencent.mm.plugin.appbrand.g;
import com.tencent.mm.plugin.appbrand.l;
import com.tencent.mm.plugin.appbrand.page.n;
import org.json.JSONObject;

public final class az
  extends a
{
  private static final int CTRL_INDEX = 170;
  private static final String NAME = "reLaunch";
  
  public final void a(l paraml, JSONObject paramJSONObject, int paramInt)
  {
    paramJSONObject = paramJSONObject.optString("url");
    paraml.fdO.fcz.V(paramJSONObject, false);
    paraml.E(paramInt, f("ok", null));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/az.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */