package com.tencent.mm.plugin.appbrand.jsapi.f;

import android.view.View;
import com.tencent.mm.plugin.appbrand.jsapi.f.a.d;
import com.tencent.mm.plugin.appbrand.page.p;
import com.tencent.mm.sdk.platformtools.x;
import org.json.JSONObject;

public final class j
  extends com.tencent.mm.plugin.appbrand.jsapi.base.c
{
  public static final int CTRL_INDEX = 141;
  public static final String NAME = "moveToMapLocation";
  
  protected final boolean c(p paramp, int paramInt, View paramView, JSONObject paramJSONObject)
  {
    if (paramJSONObject == null)
    {
      x.e("MicroMsg.JsApiMoveToMapLocation", "data is null");
      return false;
    }
    paramp = com.tencent.mm.plugin.appbrand.jsapi.f.a.b.E(paramp.mAppId, paramp.hashCode(), k(paramJSONObject));
    if (paramp == null)
    {
      x.e("MicroMsg.JsApiMoveToMapLocation", "appBrandMapView is null, return");
      return false;
    }
    x.i("MicroMsg.JsApiMoveToMapLocation", "moveToMapLocation");
    x.i("MicroMSg.AppBrandMapView", "mapId:%d moveToMapLocation", new Object[] { Integer.valueOf(paramp.mapId) });
    if ((paramp.fSY != null) && (paramp.fSX))
    {
      double d1 = paramp.fSY.getLatitude();
      double d2 = paramp.fSY.getLongitude();
      paramp.fSW.animateTo(d1, d2);
      x.d("MicroMSg.AppBrandMapView", "[moveToMapLocation]latitude:%f, longtitude:%f", new Object[] { Double.valueOf(d1), Double.valueOf(d2) });
    }
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
      x.e("MicroMsg.JsApiMoveToMapLocation", "get mapId error, exception : %s", new Object[] { paramJSONObject });
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/f/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */