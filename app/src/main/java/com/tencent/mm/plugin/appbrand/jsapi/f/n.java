package com.tencent.mm.plugin.appbrand.jsapi.f;

import android.view.View;
import com.tencent.mm.plugin.appbrand.jsapi.f.a.c.d;
import com.tencent.mm.plugin.appbrand.page.p;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import org.json.JSONArray;
import org.json.JSONObject;

public final class n
  extends com.tencent.mm.plugin.appbrand.jsapi.base.c
{
  public static final int CTRL_INDEX = 4;
  public static final String NAME = "updateMap";
  
  protected final boolean c(p paramp, int paramInt, View paramView, JSONObject paramJSONObject)
  {
    if (paramJSONObject == null)
    {
      x.e("MicroMsg.JsApiUpdateMap", "data is null");
      return false;
    }
    paramp = com.tencent.mm.plugin.appbrand.jsapi.f.a.b.E(paramp.mAppId, paramp.hashCode(), k(paramJSONObject));
    if (paramp == null)
    {
      x.e("MicroMsg.JsApiUpdateMap", "appBrandMapView is null, return");
      return false;
    }
    if (paramJSONObject.has("scale"))
    {
      paramInt = paramJSONObject.optInt("scale", 16);
      x.i("MicroMSg.AppBrandMapView", "mapId:%d zoomTo scale:%d", new Object[] { Integer.valueOf(paramp.mapId), Integer.valueOf(paramInt) });
      paramp.fSW.jS(paramInt);
    }
    float f1;
    float f2;
    if ((paramJSONObject.has("centerLatitude")) && (paramJSONObject.has("centerLongitude")))
    {
      f1 = bi.getFloat(paramJSONObject.optString("centerLatitude"), 0.0F);
      f2 = bi.getFloat(paramJSONObject.optString("centerLongitude"), 0.0F);
      if ((Math.abs(f1) <= 90.0F) && (Math.abs(f2) <= 180.0F))
      {
        x.i("MicroMSg.AppBrandMapView", "mapId:%d setCenter", new Object[] { Integer.valueOf(paramp.mapId) });
        paramp.fSW.setCenter(f1, f2);
      }
    }
    try
    {
      if (paramJSONObject.has("covers"))
      {
        paramp.ajm();
        paramView = new JSONArray(paramJSONObject.optString("covers"));
        paramInt = 0;
        while (paramInt < paramView.length())
        {
          Object localObject = (JSONObject)paramView.get(paramInt);
          f1 = bi.getFloat(((JSONObject)localObject).optString("latitude"), 0.0F);
          f2 = bi.getFloat(((JSONObject)localObject).optString("longitude"), 0.0F);
          paramJSONObject = ((JSONObject)localObject).optString("iconPath");
          float f3 = (float)((JSONObject)localObject).optDouble("rotate", 0.0D);
          localObject = new c.d();
          double d1 = f1;
          double d2 = f2;
          ((c.d)localObject).latitude = d1;
          ((c.d)localObject).longitude = d2;
          ((c.d)localObject).fTs = paramJSONObject;
          ((c.d)localObject).rotate = f3;
          paramp.a((c.d)localObject);
          paramInt += 1;
        }
      }
      return true;
    }
    catch (Exception paramp)
    {
      x.e("MicroMsg.JsApiUpdateMap", "parse covers error, exception : %s", new Object[] { paramp });
      return false;
    }
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
      x.e("MicroMsg.JsApiUpdateMap", "get mapId error, exception : %s", new Object[] { paramJSONObject });
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/f/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */