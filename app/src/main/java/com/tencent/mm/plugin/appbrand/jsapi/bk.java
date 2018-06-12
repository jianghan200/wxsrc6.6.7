package com.tencent.mm.plugin.appbrand.jsapi;

import com.tencent.mm.plugin.appbrand.g;
import com.tencent.mm.plugin.appbrand.l;
import com.tencent.mm.plugin.appbrand.page.n;
import com.tencent.mm.plugin.appbrand.ui.j;
import com.tencent.mm.plugin.appbrand.widget.c;
import com.tencent.mm.plugin.appbrand.widget.c.a;
import java.util.LinkedList;
import org.json.JSONObject;

public final class bk
  extends a
{
  public static final int CTRL_INDEX = 389;
  public static final String NAME = "setTabBarBadge";
  
  public final void a(l paraml, JSONObject paramJSONObject, int paramInt)
  {
    int j;
    String str1;
    String str3;
    String str2;
    try
    {
      j = paramJSONObject.getInt("index");
      str1 = paramJSONObject.optString("type", "none");
      str3 = paramJSONObject.optString("badgeValue", "");
      str2 = paramJSONObject.optString("badgeColor", "");
      paramJSONObject = paramJSONObject.optString("badgeTextColor", "");
      localObject = paraml.fdO.fcz.getCurrentPage();
      if (!(localObject instanceof com.tencent.mm.plugin.appbrand.page.e))
      {
        paraml.E(paramInt, f("fail:not TabBar page", null));
        return;
      }
    }
    catch (Exception paramJSONObject)
    {
      paraml.E(paramInt, f("fail", null));
      return;
    }
    Object localObject = ((com.tencent.mm.plugin.appbrand.page.e)localObject).getTabBar();
    int i;
    int k;
    int m;
    if (str3.length() < 4)
    {
      i = str3.length();
      str3 = str3.substring(0, i);
      k = j.aO(str2, 0);
      m = j.aO(paramJSONObject, -1);
      i = 0;
      label148:
      if (i >= ((c)localObject).gEl.size()) {
        break label293;
      }
      if (i == j)
      {
        ((c.a)((c)localObject).gEl.get(i)).aoW();
        if (!"redDot".equals(str1)) {
          break label226;
        }
        ((c.a)((c)localObject).gEl.get(i)).gEy = true;
      }
    }
    for (;;)
    {
      i += 1;
      break label148;
      i = 4;
      break;
      label226:
      if ("text".equals(str1))
      {
        ((c.a)((c)localObject).gEl.get(i)).gEz = str3;
        ((c.a)((c)localObject).gEl.get(i)).gEA = k;
        ((c.a)((c)localObject).gEl.get(i)).gEB = m;
      }
    }
    label293:
    ((c)localObject).aoV();
    paraml.E(paramInt, f("ok", null));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/bk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */