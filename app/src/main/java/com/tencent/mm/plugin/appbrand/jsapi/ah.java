package com.tencent.mm.plugin.appbrand.jsapi;

import com.tencent.mm.plugin.appbrand.l;
import com.tencent.mm.plugin.appbrand.page.p;
import org.json.JSONObject;

public final class ah
  extends a
{
  public static final int CTRL_INDEX = 10;
  public static final String NAME = "hideNavigationBarLoading";
  
  public final void a(l paraml, JSONObject paramJSONObject, int paramInt)
  {
    paramJSONObject = d(paraml);
    if (paramJSONObject == null)
    {
      paraml.E(paramInt, f("fail", null));
      return;
    }
    paramJSONObject.cD(false);
    paraml.E(paramInt, f("ok", null));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/ah.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */