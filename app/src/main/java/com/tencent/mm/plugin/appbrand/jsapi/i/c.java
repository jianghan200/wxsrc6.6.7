package com.tencent.mm.plugin.appbrand.jsapi.i;

import com.tencent.mm.plugin.appbrand.jsapi.e;
import com.tencent.mm.plugin.appbrand.l;
import com.tencent.mm.pluginsdk.wallet.g;
import com.tencent.mm.pluginsdk.wallet.h;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import org.json.JSONObject;

public final class c
  extends com.tencent.mm.plugin.appbrand.jsapi.a
{
  public static final int CTRL_INDEX = 86;
  public static final String NAME = "bindPaymentCard";
  
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
      a locala = a.fWH;
      paraml = new a.3(locala, new c.1(this, paraml, paramInt));
      paramJSONObject = new g(paramJSONObject);
      paramJSONObject.bVZ = 4;
      h.b(localMMActivity, paramJSONObject, locala.hashCode() & 0xFFFF, paraml);
      return;
    }
    catch (Exception paramJSONObject)
    {
      x.e("MicroMsg.JsApiBindPaymentCard", paramJSONObject.getMessage());
      paraml.E(paramInt, f("fail", null));
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/i/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */