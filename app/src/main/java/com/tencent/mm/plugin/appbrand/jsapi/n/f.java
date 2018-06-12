package com.tencent.mm.plugin.appbrand.jsapi.n;

import com.tencent.mm.plugin.appbrand.jsapi.a;
import com.tencent.mm.plugin.appbrand.l;
import com.tencent.mm.plugin.appbrand.ui.banner.AppBrandStickyBannerLogic.a;
import org.json.JSONObject;

public final class f
  extends a
{
  private static final int CTRL_INDEX = 241;
  private static final String NAME = "setTopBarText";
  
  public final void a(l paraml, JSONObject paramJSONObject, int paramInt)
  {
    paramJSONObject = paramJSONObject.optString("text");
    AppBrandStickyBannerLogic.a.bO(paraml.mAppId, paramJSONObject);
    paraml.E(paramInt, f("ok", null));
    com.tencent.mm.plugin.appbrand.e.a(paraml.mAppId, new f.1(this, paraml));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/n/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */