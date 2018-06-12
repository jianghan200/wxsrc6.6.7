package com.tencent.mm.plugin.appbrand.jsapi;

import com.tencent.mm.plugin.appbrand.game.c.d;
import com.tencent.mm.plugin.appbrand.l;
import com.tencent.mm.sdk.platformtools.x;
import org.json.JSONObject;

public class ak
  extends a
{
  public static final int CTRL_INDEX = -2;
  public static final String NAME = "logInJava";
  
  public final void a(l paraml, JSONObject paramJSONObject, int paramInt)
  {
    try
    {
      paramInt = paramJSONObject.getInt("level");
      paraml = paramJSONObject.getString("logs");
      switch (paramInt)
      {
      }
    }
    catch (Exception paraml)
    {
      for (;;)
      {
        x.e("MicroMsg.JsApiLogInJava", paraml.toString());
        continue;
        x.i("MicroMsg.JsApiLogInJava", paraml);
        continue;
        x.w("MicroMsg.JsApiLogInJava", paraml);
        continue;
        x.e("MicroMsg.JsApiLogInJava", paraml);
      }
    }
    x.d("MicroMsg.JsApiLogInJava", paraml);
    for (;;)
    {
      d.ags().sU(paramJSONObject.toString());
      return;
      x.d("MicroMsg.JsApiLogInJava", paraml);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/ak.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */