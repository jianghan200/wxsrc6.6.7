package com.tencent.mm.plugin.appbrand.jsapi;

import com.tencent.mm.plugin.appbrand.g;
import com.tencent.mm.plugin.appbrand.l;
import com.tencent.mm.plugin.appbrand.page.n;
import org.json.JSONObject;

public final class am
  extends a
{
  public static final int CTRL_INDEX = 15;
  public static final String NAME = "navigateBack";
  
  public final void a(l paraml, JSONObject paramJSONObject, int paramInt)
  {
    int i = paramJSONObject.optInt("delta", 1);
    paraml.fdO.fcz.ko(i);
    paraml.E(paramInt, f("ok", null));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/am.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */