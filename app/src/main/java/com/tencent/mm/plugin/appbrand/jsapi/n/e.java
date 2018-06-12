package com.tencent.mm.plugin.appbrand.jsapi.n;

import com.tencent.mm.plugin.appbrand.jsapi.a;
import com.tencent.mm.plugin.appbrand.l;
import com.tencent.mm.plugin.appbrand.page.p;
import org.json.JSONObject;

public final class e
  extends a
{
  private static final int CTRL_INDEX = 197;
  private static final String NAME = "setStatusBarStyle";
  
  public final void a(l paraml, JSONObject paramJSONObject, int paramInt)
  {
    paramJSONObject = paramJSONObject.optString("color", "");
    p localp = d(paraml);
    if (localp == null)
    {
      paraml.E(paramInt, f("fail", null));
      return;
    }
    if (paramJSONObject.equals("white")) {
      localp.tb("white");
    }
    for (;;)
    {
      paraml.E(paramInt, f("ok", null));
      return;
      if (paramJSONObject.equals("black")) {
        localp.tb("black");
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/n/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */