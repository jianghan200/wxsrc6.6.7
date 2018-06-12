package com.tencent.mm.plugin.appbrand.jsapi;

import com.tencent.mm.plugin.appbrand.g;
import com.tencent.mm.plugin.appbrand.page.n;
import com.tencent.mm.plugin.appbrand.widget.c;
import org.json.JSONObject;

public final class ai
  extends a
{
  public static final int CTRL_INDEX = -2;
  public static final String NAME = "hideTabBar";
  
  public final void a(com.tencent.mm.plugin.appbrand.l paraml, JSONObject paramJSONObject, int paramInt)
  {
    com.tencent.mm.plugin.appbrand.page.l locall = paraml.fdO.fcz.getCurrentPage();
    if (!(locall instanceof com.tencent.mm.plugin.appbrand.page.e))
    {
      paraml.E(paramInt, f("fail:not TabBar page", null));
      return;
    }
    ((com.tencent.mm.plugin.appbrand.page.e)locall).getTabBar().di(paramJSONObject.optBoolean("animation", true));
    paraml.E(paramInt, f("ok", null));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/ai.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */