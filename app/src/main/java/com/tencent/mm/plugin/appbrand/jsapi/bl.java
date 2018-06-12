package com.tencent.mm.plugin.appbrand.jsapi;

import android.graphics.BitmapFactory;
import com.tencent.mm.plugin.appbrand.appcache.ao;
import com.tencent.mm.plugin.appbrand.g;
import com.tencent.mm.plugin.appbrand.l;
import com.tencent.mm.plugin.appbrand.page.n;
import com.tencent.mm.plugin.appbrand.widget.c;
import com.tencent.mm.plugin.appbrand.widget.c.a;
import com.tencent.mm.sdk.platformtools.bi;
import java.io.Closeable;
import java.io.InputStream;
import java.util.LinkedList;
import org.json.JSONObject;

public final class bl
  extends a
{
  public static final int CTRL_INDEX = -2;
  public static final String NAME = "setTabBarItem";
  
  public final void a(l paraml, JSONObject paramJSONObject, int paramInt)
  {
    int i;
    String str;
    try
    {
      i = paramJSONObject.getInt("index");
      str = paramJSONObject.optString("text", "");
      localObject1 = paramJSONObject.optString("iconPath", "");
      localObject2 = paramJSONObject.optString("selectedIconPath", "");
      paramJSONObject = paraml.fdO.fcz.getCurrentPage();
      if (!(paramJSONObject instanceof com.tencent.mm.plugin.appbrand.page.e))
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
    Object localObject3 = ao.d(paraml.fdO, (String)localObject1);
    Object localObject1 = BitmapFactory.decodeStream((InputStream)localObject3);
    if (localObject3 != null) {
      bi.d((Closeable)localObject3);
    }
    Object localObject4 = ao.d(paraml.fdO, (String)localObject2);
    Object localObject2 = BitmapFactory.decodeStream((InputStream)localObject4);
    if (localObject4 != null) {
      bi.d((Closeable)localObject3);
    }
    localObject3 = ((com.tencent.mm.plugin.appbrand.page.e)paramJSONObject).getTabBar();
    if (i < ((c)localObject3).gEl.size())
    {
      localObject4 = (c.a)((c)localObject3).gEl.get(i);
      ((c.a)localObject4).gEw = str;
      paramJSONObject = (JSONObject)localObject1;
      if (localObject1 == null) {
        paramJSONObject = ((c.a)localObject4).sq;
      }
      ((c.a)localObject4).sq = paramJSONObject;
      if (localObject2 != null) {
        break label238;
      }
    }
    label238:
    for (paramJSONObject = ((c.a)localObject4).gEv;; paramJSONObject = (JSONObject)localObject2)
    {
      ((c.a)localObject4).gEv = paramJSONObject;
      ((c)localObject3).aoV();
      paraml.E(paramInt, f("ok", null));
      return;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/bl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */