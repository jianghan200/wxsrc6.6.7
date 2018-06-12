package com.tencent.mm.plugin.appbrand.jsapi.i;

import com.tencent.mm.plugin.appbrand.jsapi.e;
import com.tencent.mm.plugin.appbrand.l;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import org.json.JSONObject;

public final class i
  extends com.tencent.mm.plugin.appbrand.jsapi.a
{
  public static final int CTRL_INDEX = 85;
  public static final String NAME = "verifyPaymentPassword";
  
  public final void a(l paraml, JSONObject paramJSONObject, int paramInt)
  {
    if (paramJSONObject == null)
    {
      paraml.E(paramInt, f("fail", null));
      return;
    }
    MMActivity localMMActivity = c(paraml);
    if (localMMActivity == null)
    {
      paraml.E(paramInt, f("fail", null));
      return;
    }
    try
    {
      paramJSONObject.put("appId", paraml.mAppId);
      a.fWH.a(localMMActivity, paramJSONObject, new i.1(this, paraml, paramInt));
      return;
    }
    catch (Exception paramJSONObject)
    {
      x.e("MicroMsg.JsApiVerifyPaymentPassword", paramJSONObject.getMessage());
      paraml.E(paramInt, f("fail", null));
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/i/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */