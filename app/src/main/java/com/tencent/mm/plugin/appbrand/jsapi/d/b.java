package com.tencent.mm.plugin.appbrand.jsapi.d;

import com.tencent.mm.plugin.appbrand.jsapi.a;
import com.tencent.mm.plugin.appbrand.l;
import com.tencent.mm.plugin.appbrand.page.p;
import org.json.JSONException;
import org.json.JSONObject;

public final class b
  extends a
{
  public static final int CTRL_INDEX = 70;
  public static final String NAME = "hideKeyboard";
  
  private void b(com.tencent.mm.plugin.appbrand.jsapi.c paramc, JSONObject paramJSONObject, int paramInt)
  {
    localObject = null;
    try
    {
      int i = paramJSONObject.getInt("inputId");
      paramJSONObject = Integer.valueOf(i);
    }
    catch (JSONException paramJSONObject)
    {
      for (;;)
      {
        paramJSONObject = (JSONObject)localObject;
      }
    }
    com.tencent.mm.plugin.appbrand.r.c.runOnUiThread(new b.1(this, paramc, paramJSONObject, paramInt));
  }
  
  public final void a(l paraml, JSONObject paramJSONObject, int paramInt)
  {
    b(paraml, paramJSONObject, paramInt);
  }
  
  public final void a(p paramp, JSONObject paramJSONObject, int paramInt)
  {
    b(paramp, paramJSONObject, paramInt);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/d/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */