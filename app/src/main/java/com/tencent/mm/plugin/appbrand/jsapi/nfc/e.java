package com.tencent.mm.plugin.appbrand.jsapi.nfc;

import com.tencent.mm.plugin.appbrand.l;
import com.tencent.mm.sdk.platformtools.x;
import org.json.JSONObject;

public final class e
  extends JsApiAppBrandNFCBase
{
  public static final int CTRL_INDEX = 353;
  public static final String NAME = "stopHCE";
  
  static void a(l paraml, int paramInt, String paramString)
  {
    x.i("MicroMsg.JsApiNFCStartHCE", "alvinluo stopHCE callback result: %s", new Object[] { paramString });
    if (paraml != null) {
      paraml.E(paramInt, paramString);
    }
  }
  
  public final void a(l paraml, JSONObject paramJSONObject, int paramInt)
  {
    a(new e.1(this, paraml, paramInt));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/nfc/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */