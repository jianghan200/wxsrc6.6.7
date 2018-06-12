package com.tencent.mm.plugin.appbrand.jsapi.n;

import com.tencent.mm.plugin.appbrand.jsapi.a;
import com.tencent.mm.plugin.appbrand.jsapi.c;
import com.tencent.mm.plugin.appbrand.jsapi.e;
import com.tencent.mm.plugin.appbrand.l;
import com.tencent.mm.plugin.appbrand.page.b;
import com.tencent.mm.plugin.appbrand.page.p;
import org.json.JSONObject;

public final class d
  extends a
{
  private static final int CTRL_INDEX = 238;
  private static final String NAME = "setNavigationBarRightButton";
  
  public final void a(c paramc, JSONObject paramJSONObject, int paramInt)
  {
    boolean bool = paramJSONObject.optBoolean("hide", false);
    paramJSONObject.optString("text", "");
    paramJSONObject.optString("iconPath", "");
    if ((paramc instanceof p))
    {
      paramJSONObject = (p)paramc;
      int i = b.a(paramJSONObject, bool);
      paramJSONObject = "fail";
      switch (d.1.fZD[(i - 1)])
      {
      }
    }
    for (;;)
    {
      paramc.E(paramInt, f(paramJSONObject, null));
      return;
      paramJSONObject = a.d((l)paramc);
      break;
      paramJSONObject = "ok";
      continue;
      paramJSONObject = "fail no page available";
      continue;
      paramJSONObject = "fail iconPath not found";
      continue;
      paramJSONObject = "fail invalid text length";
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/n/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */