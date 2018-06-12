package com.tencent.mm.plugin.appbrand.jsapi;

import com.tencent.mm.plugin.appbrand.config.a.e;
import com.tencent.mm.plugin.appbrand.g;
import com.tencent.mm.plugin.appbrand.l;
import com.tencent.mm.plugin.appbrand.page.n;
import com.tencent.mm.plugin.appbrand.widget.c;
import org.json.JSONObject;

public final class bm
  extends a
{
  public static final int CTRL_INDEX = -2;
  public static final String NAME = "setTabBarStyle";
  
  public final void a(l paraml, JSONObject paramJSONObject, int paramInt)
  {
    Object localObject = paraml.fdO.fcv.foP;
    String str1 = paramJSONObject.optString("color", ((a.e)localObject).dxh);
    String str2 = paramJSONObject.optString("selectedColor", ((a.e)localObject).fpb);
    String str3 = paramJSONObject.optString("backgroundColor", ((a.e)localObject).fpc);
    paramJSONObject = paramJSONObject.optString("borderStyle", ((a.e)localObject).fpd);
    localObject = paraml.fdO.fcz.getCurrentPage();
    if (!(localObject instanceof com.tencent.mm.plugin.appbrand.page.e))
    {
      paraml.E(paramInt, f("fail:not TabBar page", null));
      return;
    }
    ((com.tencent.mm.plugin.appbrand.page.e)localObject).getTabBar().h(str1, str2, str3, paramJSONObject);
    paraml.E(paramInt, f("ok", null));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/bm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */