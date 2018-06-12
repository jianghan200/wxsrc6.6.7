package com.tencent.mm.plugin.appbrand.jsapi;

import com.tencent.mm.plugin.appbrand.l;
import com.tencent.mm.plugin.appbrand.r.a.a;
import com.tencent.mm.plugin.appbrand.r.a.c;
import java.util.HashMap;
import org.json.JSONObject;

public final class z
  extends n
{
  public static final int CTRL_INDEX = 425;
  public static final String NAME = "getBatteryInfo";
  
  public final String a(l paraml, JSONObject paramJSONObject)
  {
    paraml = a.gCg.aoB();
    paramJSONObject = new HashMap();
    paramJSONObject.put("level", Integer.valueOf(paraml.gCq));
    paramJSONObject.put("isCharging", Boolean.valueOf(paraml.gCp));
    return f("ok", paramJSONObject);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/z.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */