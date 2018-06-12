package com.tencent.mm.plugin.appbrand.jsapi.nfc;

import com.tencent.mm.plugin.appbrand.l;
import org.json.JSONObject;

public final class b
  extends JsApiAppBrandNFCBase
{
  public static final int CTRL_INDEX = 358;
  public static final String NAME = "getHCEState";
  
  public final void a(l paraml, JSONObject paramJSONObject, int paramInt)
  {
    super.a(paraml, paramJSONObject, paramInt);
    a(new b.1(this, paraml, paramInt));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/nfc/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */