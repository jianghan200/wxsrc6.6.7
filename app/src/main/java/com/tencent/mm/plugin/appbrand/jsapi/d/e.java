package com.tencent.mm.plugin.appbrand.jsapi.d;

import com.tencent.mm.plugin.appbrand.jsapi.a;
import com.tencent.mm.plugin.appbrand.l;
import com.tencent.mm.plugin.appbrand.page.p;
import com.tencent.mm.plugin.appbrand.widget.input.m;
import org.json.JSONObject;

public final class e
  extends a
{
  private static final int CTRL_INDEX = 77;
  private static final String NAME = "setKeyboardValue";
  
  public final void a(l paraml, JSONObject paramJSONObject, int paramInt)
  {
    p localp = d(paraml);
    if (localp == null) {
      return;
    }
    try
    {
      str = paramJSONObject.getString("value");
    }
    catch (Exception paramJSONObject)
    {
      String str;
      int i;
      label34:
      paraml.E(paramInt, f("fail:invalid data", null));
      return;
    }
    try
    {
      i = paramJSONObject.getInt("cursor");
      paramJSONObject = Integer.valueOf(i);
    }
    catch (Exception paramJSONObject)
    {
      paramJSONObject = null;
      break label34;
    }
    m.a(localp, str, paramJSONObject);
    paraml.E(paramInt, f("ok", null));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/d/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */