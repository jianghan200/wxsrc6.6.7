package com.tencent.mm.plugin.appbrand.jsapi.f;

import com.tencent.mm.plugin.appbrand.compat.a.b.f;
import com.tencent.mm.plugin.appbrand.jsapi.a;
import com.tencent.mm.plugin.appbrand.jsapi.f.a.c;
import com.tencent.mm.plugin.appbrand.l;
import com.tencent.mm.sdk.platformtools.x;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class e
  extends a
{
  public static final int CTRL_INDEX = 144;
  public static final String NAME = "getMapCenterLocation";
  
  private static int k(JSONObject paramJSONObject)
  {
    try
    {
      int i = paramJSONObject.optInt("mapId");
      return i;
    }
    catch (Exception paramJSONObject)
    {
      x.e("MicroMsg.JsApiGetMapCenterLocation", "get mapId error, exception : %s", new Object[] { paramJSONObject });
    }
    return -1;
  }
  
  public final void a(l paraml, JSONObject paramJSONObject, int paramInt)
  {
    if (paramJSONObject == null)
    {
      x.e("MicroMsg.JsApiGetMapCenterLocation", "getMapCenterLocation data is null");
      paraml.E(paramInt, f("fail:data is null", null));
      return;
    }
    Object localObject = d(paraml);
    if (localObject == null)
    {
      x.e("MicroMsg.JsApiGetMapCenterLocation", "pageView is null");
      paraml.E(paramInt, f("fail", null));
      return;
    }
    localObject = com.tencent.mm.plugin.appbrand.jsapi.f.a.b.E(paraml.mAppId, localObject.hashCode(), k(paramJSONObject));
    if (localObject == null)
    {
      x.e("MicroMsg.JsApiGetMapCenterLocation", "appBrandMapView is null, return");
      paraml.E(paramInt, f("fail", null));
      return;
    }
    paramJSONObject = new HashMap();
    localObject = ((c)localObject).fSW.adw();
    paramJSONObject.put("latitude", Double.valueOf(((b.f)localObject).adG()));
    paramJSONObject.put("longitude", Double.valueOf(((b.f)localObject).adH()));
    x.i("MicroMsg.JsApiGetMapCenterLocation", "ok, values:%s", new Object[] { paramJSONObject.toString() });
    paraml.E(paramInt, f("ok", paramJSONObject));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/f/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */