package com.tencent.mm.plugin.appbrand.jsapi.c;

import com.tencent.mm.plugin.appbrand.l;
import com.tencent.mm.sdk.platformtools.x;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

public final class b
  extends com.tencent.mm.plugin.appbrand.jsapi.a
{
  private static final int CTRL_INDEX = 223;
  private static final String NAME = "getBeacons";
  
  public final void a(l paraml, JSONObject paramJSONObject, int paramInt)
  {
    x.d("MicroMsg.JsApiGetBeacons", "getBeacons!");
    Object localObject = a.tz(paraml.mAppId);
    paramJSONObject = new JSONArray();
    if ((localObject == null) || (((a.a)localObject).fQv == null))
    {
      x.e("MicroMsg.JsApiGetBeacons", "not found device");
      localObject = new HashMap();
      ((Map)localObject).put("beacons", paramJSONObject);
      paraml.E(paramInt, f("ok", (Map)localObject));
      return;
    }
    localObject = ((a.a)localObject).fQv.entrySet().iterator();
    while (((Iterator)localObject).hasNext()) {
      paramJSONObject.put((JSONObject)((Map.Entry)((Iterator)localObject).next()).getValue());
    }
    localObject = new HashMap();
    ((Map)localObject).put("beacons", paramJSONObject);
    paraml.E(paramInt, f("ok", (Map)localObject));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/c/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */