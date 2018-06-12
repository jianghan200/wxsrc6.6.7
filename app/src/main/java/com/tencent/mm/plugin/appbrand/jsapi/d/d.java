package com.tencent.mm.plugin.appbrand.jsapi.d;

import com.tencent.mm.plugin.appbrand.jsapi.a;
import com.tencent.mm.plugin.appbrand.jsapi.e;
import com.tencent.mm.plugin.appbrand.page.p;
import com.tencent.mm.plugin.appbrand.r.c;
import java.lang.ref.WeakReference;
import org.json.JSONException;
import org.json.JSONObject;

public final class d
  extends a
{
  private static final int CTRL_INDEX = 119;
  private static final String NAME = "removeTextArea";
  
  public final void a(p paramp, JSONObject paramJSONObject, int paramInt)
  {
    try
    {
      int i = paramJSONObject.getInt("inputId");
      c.runOnUiThread(new d.1(this, new WeakReference(paramp), i, paramInt));
      return;
    }
    catch (JSONException paramJSONObject)
    {
      paramp.E(paramInt, f("fail:invalid data", null));
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/d/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */