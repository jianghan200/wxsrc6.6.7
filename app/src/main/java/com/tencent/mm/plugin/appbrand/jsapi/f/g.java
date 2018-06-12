package com.tencent.mm.plugin.appbrand.jsapi.f;

import com.tencent.mm.plugin.appbrand.jsapi.a;
import com.tencent.mm.plugin.appbrand.jsapi.e;
import com.tencent.mm.plugin.appbrand.jsapi.f.a.c;
import com.tencent.mm.plugin.appbrand.l;
import com.tencent.mm.sdk.platformtools.x;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class g
  extends a
{
  public static final int CTRL_INDEX = -2;
  public static final String NAME = "getMapScale";
  
  private static int k(JSONObject paramJSONObject)
  {
    try
    {
      int i = paramJSONObject.optInt("mapId");
      return i;
    }
    catch (Exception paramJSONObject)
    {
      x.e("MicroMsg.JsApiGetMapScale", "get mapId error, exception : %s", new Object[] { paramJSONObject });
    }
    return -1;
  }
  
  public final void a(l paraml, JSONObject paramJSONObject, int paramInt)
  {
    if (paramJSONObject == null)
    {
      x.e("MicroMsg.JsApiGetMapScale", "JsApiGetMapScale data is null");
      paraml.E(paramInt, f("fail:data is null", null));
      return;
    }
    Object localObject = d(paraml);
    if (localObject == null)
    {
      x.e("MicroMsg.JsApiGetMapScale", "pageView is null");
      paraml.E(paramInt, f("fail", null));
      return;
    }
    paramJSONObject = com.tencent.mm.plugin.appbrand.jsapi.f.a.b.E(paraml.mAppId, localObject.hashCode(), k(paramJSONObject));
    if (paramJSONObject == null)
    {
      x.e("MicroMsg.JsApiGetMapScale", "appBrandMapView is null, return");
      paraml.E(paramInt, f("fail", null));
      return;
    }
    localObject = new HashMap();
    ((Map)localObject).put("scale", Integer.valueOf(paramJSONObject.fSW.getZoomLevel()));
    x.i("MicroMsg.JsApiGetMapScale", "getMapScale ok, values:%s", new Object[] { localObject.toString() });
    paraml.E(paramInt, f("ok", (Map)localObject));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/f/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */