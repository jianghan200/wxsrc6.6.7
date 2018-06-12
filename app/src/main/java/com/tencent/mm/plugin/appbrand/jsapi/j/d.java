package com.tencent.mm.plugin.appbrand.jsapi.j;

import com.tencent.mm.plugin.appbrand.jsapi.e;
import com.tencent.mm.plugin.appbrand.page.p;
import org.json.JSONObject;

public final class d
  extends com.tencent.mm.plugin.appbrand.jsapi.a
{
  public static final int CTRL_INDEX = 84;
  public static final String NAME = "showDatePickerView";
  
  public final void a(p paramp, JSONObject paramJSONObject, int paramInt)
  {
    super.a(paramp, paramJSONObject, paramInt);
    String str = paramJSONObject.optString("mode");
    if ("date".equals(str))
    {
      new a().a(this, paramp, paramJSONObject, paramInt);
      return;
    }
    if ("time".equals(str))
    {
      new i().a(this, paramp, paramJSONObject, paramInt);
      return;
    }
    paramp.E(paramInt, f("fail:invalid data", null));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/j/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */