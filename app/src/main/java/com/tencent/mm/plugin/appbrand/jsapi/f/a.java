package com.tencent.mm.plugin.appbrand.jsapi.f;

import android.graphics.Color;
import android.view.View;
import com.tencent.mm.plugin.appbrand.compat.a.b.b;
import com.tencent.mm.plugin.appbrand.compat.a.b.c;
import com.tencent.mm.plugin.appbrand.page.p;
import com.tencent.mm.plugin.appbrand.q.f;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

public final class a
  extends com.tencent.mm.plugin.appbrand.jsapi.base.c
{
  public static final int CTRL_INDEX = 135;
  public static final String NAME = "addMapCircles";
  
  protected final boolean c(p paramp, int paramInt, View arg3, JSONObject arg4)
  {
    if (??? == null)
    {
      x.e("MicroMsg.JsApiAddMapCircles", "data is null");
      return false;
    }
    paramp = com.tencent.mm.plugin.appbrand.jsapi.f.a.b.E(paramp.mAppId, paramp.hashCode(), k(???));
    if (paramp == null)
    {
      x.e("MicroMsg.JsApiAddMapCircles", "appBrandMapView is null, return");
      return false;
    }
    Object localObject;
    try
    {
      if (!???.has("circles")) {
        break label358;
      }
      synchronized (paramp.fTe)
      {
        localObject = paramp.fTe.iterator();
        if (((Iterator)localObject).hasNext()) {
          ((b.b)((Iterator)localObject).next()).remove();
        }
      }
      paramp.fTe.clear();
    }
    catch (Exception paramp)
    {
      x.e("MicroMsg.JsApiAddMapCircles", "parse circles error, exception : %s", new Object[] { paramp });
      return false;
    }
    ??? = new JSONArray(???.optString("circles"));
    paramInt = 0;
    while (paramInt < ???.length())
    {
      ??? = (JSONObject)???.get(paramInt);
      float f1 = bi.getFloat(???.optString("latitude"), 0.0F);
      float f2 = bi.getFloat(???.optString("longitude"), 0.0F);
      int i = f.aQ(???.optString("color", ""), Color.parseColor("#000000"));
      int j = f.aQ(???.optString("fillColor", ""), Color.parseColor("#000000"));
      int k = ???.optInt("radius");
      float f3 = f.a(???, "strokeWidth", 0.0F);
      ??? = paramp.fSW.adz();
      ???.f(f1, f2);
      ???.jO(k);
      ???.jP(i);
      ???.jQ((int)f3);
      ???.jR(j);
      localObject = paramp.fSW.a(???);
      synchronized (paramp.fTe)
      {
        paramp.fTe.add(localObject);
        paramInt += 1;
      }
    }
    label358:
    return true;
  }
  
  protected final int k(JSONObject paramJSONObject)
  {
    try
    {
      int i = paramJSONObject.optInt("mapId");
      return i;
    }
    catch (Exception paramJSONObject)
    {
      x.e("MicroMsg.JsApiAddMapCircles", "get mapId error, exception : %s", new Object[] { paramJSONObject });
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/f/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */