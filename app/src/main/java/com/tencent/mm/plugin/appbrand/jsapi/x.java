package com.tencent.mm.plugin.appbrand.jsapi;

import com.tencent.mm.plugin.appbrand.config.a.d;
import com.tencent.mm.plugin.appbrand.g;
import com.tencent.mm.plugin.appbrand.page.p;
import org.json.JSONObject;

public final class x
  extends a
{
  public static final int CTRL_INDEX = 139;
  public static final String NAME = "disableScrollBounce";
  
  public final void a(p paramp, JSONObject paramJSONObject, int paramInt)
  {
    if (!paramJSONObject.has("disable"))
    {
      paramp.E(paramInt, f("ok", null));
      return;
    }
    if (paramJSONObject.optBoolean("disable", false)) {
      paramp.cE(false);
    }
    for (;;)
    {
      paramp.E(paramInt, f("ok", null));
      return;
      paramp.cE(paramp.fdO.fcv.rG(paramp.getURL()).fpo);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */