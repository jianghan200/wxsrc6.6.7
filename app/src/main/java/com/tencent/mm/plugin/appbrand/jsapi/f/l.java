package com.tencent.mm.plugin.appbrand.jsapi.f;

import android.view.View;
import com.tencent.mm.plugin.appbrand.compat.a.b.h;
import com.tencent.mm.plugin.appbrand.jsapi.f.a.a;
import com.tencent.mm.plugin.appbrand.jsapi.f.a.b;
import com.tencent.mm.plugin.appbrand.jsapi.f.a.c.e;
import com.tencent.mm.plugin.appbrand.page.p;
import com.tencent.mm.plugin.appbrand.page.u;
import com.tencent.mm.plugin.appbrand.widget.e.e;
import com.tencent.mm.sdk.platformtools.x;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class l
  extends com.tencent.mm.plugin.appbrand.jsapi.base.c
{
  public static final int CTRL_INDEX = 343;
  public static final String NAME = "removeMapMarkers";
  
  protected final boolean c(p paramp, int paramInt, View arg3, JSONObject paramJSONObject)
  {
    if (paramp.agU().E(paramInt, false) == null)
    {
      x.e("MicroMsg.JsApiRemoveMapMarkers", "KeyValueSet(%s) is null.", new Object[] { Integer.valueOf(paramInt) });
      return false;
    }
    if (paramJSONObject == null)
    {
      x.e("MicroMsg.JsApiRemoveMapMarkers", "data is null");
      return false;
    }
    paramp = b.E(paramp.mAppId, paramp.hashCode(), k(paramJSONObject));
    if (paramp == null)
    {
      x.e("MicroMsg.JsApiRemoveMapMarkers", "appBrandMapView is null, return");
      return false;
    }
    x.i("MicroMsg.JsApiRemoveMapMarkers", "removeMapMarkers, data:%s", new Object[] { paramJSONObject.toString() });
    if (paramJSONObject.has("markers")) {}
    for (;;)
    {
      try
      {
        paramJSONObject = new JSONArray(paramJSONObject.optString("markers"));
        paramInt = 0;
        if (paramInt < paramJSONObject.length())
        {
          String str = paramJSONObject.getString(paramInt);
          x.i("MicroMSg.AppBrandMapView", "mapId:%d removeMarker markerId:%s", new Object[] { Integer.valueOf(paramp.mapId), str });
          synchronized (paramp.fTa)
          {
            c.e locale = (c.e)paramp.fTa.get(str);
            if (locale == null)
            {
              x.w("MicroMSg.AppBrandMapView", "marker:%s is null", new Object[] { str });
              break label359;
            }
            locale.fTv.remove();
            if (locale.fTw != null)
            {
              if ((locale.fTw.getMarkerView() != null) && ((locale.fTw.getMarkerView() instanceof e))) {
                a.a((e)locale.fTw.getMarkerView());
              }
              locale.fTw.remove();
              paramp.fTa.remove(str + "#label");
            }
            paramp.fTa.remove(str);
          }
        }
        return true;
      }
      catch (JSONException paramp)
      {
        x.printErrStackTrace("MicroMsg.JsApiRemoveMapMarkers", paramp, "", new Object[0]);
        return false;
      }
      label359:
      paramInt += 1;
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
      x.e("MicroMsg.JsApiRemoveMapMarkers", "get mapId error, exception : %s", new Object[] { paramJSONObject });
    }
    return 0;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/f/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */