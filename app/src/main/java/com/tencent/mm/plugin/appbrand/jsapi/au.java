package com.tencent.mm.plugin.appbrand.jsapi;

import android.content.Intent;
import com.tencent.mm.bg.d;
import com.tencent.mm.plugin.appbrand.config.AppBrandSysConfig;
import com.tencent.mm.plugin.appbrand.g;
import com.tencent.mm.plugin.appbrand.l;
import com.tencent.mm.plugin.appbrand.ui.AppBrandAuthorizeUI;
import com.tencent.mm.sdk.platformtools.x;
import org.json.JSONObject;

public final class au
  extends a
{
  public static final int CTRL_INDEX = 192;
  public static final String NAME = "openSetting";
  
  public final void a(l paraml, JSONObject paramJSONObject, int paramInt)
  {
    x.d("MicroMsg.JsApiOpenSetting", "jumpToSettingView!");
    Object localObject = paraml.fdO.fcu;
    if (localObject == null)
    {
      x.e("MicroMsg.JsApiOpenSetting", "config is null!");
      paraml.E(paramInt, f("fail", null));
      return;
    }
    paramJSONObject = c(paraml);
    if (paramJSONObject == null)
    {
      paraml.E(paramInt, f("fail", null));
      x.e("MicroMsg.JsApiOpenSetting", "mmActivity is null, invoke fail!");
      return;
    }
    paramJSONObject.geJ = new au.1(this, paraml, paramInt);
    localObject = ((AppBrandSysConfig)localObject).bGy;
    paraml = new Intent(paraml.getContext(), AppBrandAuthorizeUI.class).putExtra("key_username", (String)localObject);
    paraml.putExtra("key_app_authorize_jsapi", true);
    d.b(paramJSONObject, "appbrand", ".ui.AppBrandAuthorizeUI", paraml, 1);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/au.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */