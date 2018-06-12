package com.tencent.mm.plugin.appbrand.jsapi.f;

import com.tencent.mm.plugin.appbrand.compat.a.b.f;
import com.tencent.mm.plugin.appbrand.compat.a.b.g;
import com.tencent.mm.plugin.appbrand.compat.a.b.q;
import com.tencent.mm.plugin.appbrand.compat.a.b.r;
import com.tencent.mm.plugin.appbrand.jsapi.a;
import com.tencent.mm.plugin.appbrand.jsapi.e;
import com.tencent.mm.plugin.appbrand.jsapi.f.a.c;
import com.tencent.mm.plugin.appbrand.l;
import com.tencent.mm.sdk.platformtools.x;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class f
  extends a
{
  public static final int CTRL_INDEX = -2;
  public static final String NAME = "getMapRegion";
  
  private static int k(JSONObject paramJSONObject)
  {
    try
    {
      int i = paramJSONObject.optInt("mapId");
      return i;
    }
    catch (Exception paramJSONObject)
    {
      x.e("MicroMsg.JsApiGetMapRegion", "get mapId error, exception : %s", new Object[] { paramJSONObject });
    }
    return -1;
  }
  
  public final void a(l paraml, JSONObject paramJSONObject, int paramInt)
  {
    if (paramJSONObject == null)
    {
      x.e("MicroMsg.JsApiGetMapRegion", "JsApiGetMapRegion data is null");
      paraml.E(paramInt, f("fail:data is null", null));
      return;
    }
    Object localObject1 = d(paraml);
    if (localObject1 == null)
    {
      x.e("MicroMsg.JsApiGetMapRegion", "pageView is null");
      paraml.E(paramInt, f("fail", null));
      return;
    }
    paramJSONObject = com.tencent.mm.plugin.appbrand.jsapi.f.a.b.E(paraml.mAppId, localObject1.hashCode(), k(paramJSONObject));
    if (paramJSONObject == null)
    {
      x.e("MicroMsg.JsApiGetMapRegion", "appBrandMapView is null, return");
      paraml.E(paramInt, f("fail", null));
      return;
    }
    paramJSONObject = paramJSONObject.fSW.adx().adK().adL();
    localObject1 = paramJSONObject.adE();
    Object localObject2 = paramJSONObject.adF();
    paramJSONObject = new HashMap();
    paramJSONObject.put("latitude", Double.valueOf(((b.f)localObject1).adG()));
    paramJSONObject.put("longitude", Double.valueOf(((b.f)localObject1).adH()));
    localObject1 = new HashMap();
    ((Map)localObject1).put("latitude", Double.valueOf(((b.f)localObject2).adG()));
    ((Map)localObject1).put("longitude", Double.valueOf(((b.f)localObject2).adH()));
    localObject2 = new HashMap();
    ((Map)localObject2).put("southwest", paramJSONObject);
    ((Map)localObject2).put("northeast", localObject1);
    x.i("MicroMsg.JsApiGetMapRegion", "getMapRegion ok, values:%s", new Object[] { localObject2.toString() });
    paraml.E(paramInt, f("ok", (Map)localObject2));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/f/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */