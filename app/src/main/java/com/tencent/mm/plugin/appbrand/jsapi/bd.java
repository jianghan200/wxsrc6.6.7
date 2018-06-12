package com.tencent.mm.plugin.appbrand.jsapi;

import android.view.View;
import com.tencent.mm.plugin.appbrand.l;
import com.tencent.mm.plugin.appbrand.page.p;
import org.json.JSONObject;

public final class bd
  extends a
{
  public static final int CTRL_INDEX = 454;
  public static final String NAME = "setBackgroundTextStyle";
  
  public final void a(l paraml, JSONObject paramJSONObject, int paramInt)
  {
    p localp = d(paraml);
    if (localp == null)
    {
      paraml.E(paramInt, "fail");
      return;
    }
    paramJSONObject = paramJSONObject.optString("textStyle", "ignore");
    localp.getContentView().post(new bd.1(this, localp, paramJSONObject));
    paraml.E(paramInt, f("ok", null));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/bd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */