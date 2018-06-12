package com.tencent.mm.plugin.appbrand.jsapi;

import com.tencent.mm.plugin.appbrand.config.AppBrandSysConfig;
import com.tencent.mm.plugin.appbrand.g;
import com.tencent.mm.plugin.appbrand.l;
import com.tencent.mm.plugin.appbrand.menu.MenuDelegate_EnableDebug;
import org.json.JSONObject;

public final class be
  extends a
{
  public static final int CTRL_INDEX = 249;
  public static final String NAME = "setEnableDebug";
  
  public final void a(l paraml, JSONObject paramJSONObject, int paramInt)
  {
    boolean bool = paramJSONObject.optBoolean("enableDebug", false);
    if (paraml.fdO.fcu.fqL == bool)
    {
      paraml.E(paramInt, f("ok", null));
      return;
    }
    MenuDelegate_EnableDebug.e(paraml.getContext(), paraml.mAppId, bool);
    paraml.E(paramInt, f("ok", null));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/be.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */