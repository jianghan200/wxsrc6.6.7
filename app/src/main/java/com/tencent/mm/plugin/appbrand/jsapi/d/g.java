package com.tencent.mm.plugin.appbrand.jsapi.d;

import com.tencent.mm.plugin.appbrand.jsapi.e;
import com.tencent.mm.plugin.appbrand.page.p;
import com.tencent.mm.plugin.appbrand.r.c;
import com.tencent.mm.plugin.appbrand.widget.input.c.h;
import org.json.JSONException;
import org.json.JSONObject;

public class g
  extends a<h>
{
  private static final int CTRL_INDEX = 112;
  private static final String NAME = "updateInput";
  
  public void a(p paramp, JSONObject paramJSONObject, int paramInt)
  {
    h localh = new h();
    if (!a(localh, paramJSONObject, paramp, paramInt)) {
      return;
    }
    try
    {
      int i = paramJSONObject.getInt("inputId");
      if ((localh.gLB != null) && (localh.gLB.intValue() < 0)) {
        localh.gLB = Integer.valueOf(0);
      }
      if ((localh.gLC != null) && (localh.gLC.intValue() < 0)) {
        localh.gLC = Integer.valueOf(0);
      }
      paramJSONObject = paramJSONObject.optString("data", null);
      if (paramJSONObject != null) {
        L(i, paramJSONObject);
      }
      c.runOnUiThread(new g.1(this, i, localh, paramp, paramInt));
      return;
    }
    catch (JSONException paramJSONObject)
    {
      paramp.E(paramInt, f("fail:invalid data", null));
    }
  }
  
  protected final boolean aiT()
  {
    return true;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/d/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */