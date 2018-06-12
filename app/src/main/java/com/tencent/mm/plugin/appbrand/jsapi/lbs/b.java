package com.tencent.mm.plugin.appbrand.jsapi.lbs;

import com.tencent.mm.plugin.appbrand.jsapi.h;
import com.tencent.mm.plugin.appbrand.l;
import com.tencent.mm.plugin.appbrand.r.b.b.a;
import com.tencent.mm.sdk.platformtools.x;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

final class b
  extends h
  implements com.tencent.mm.plugin.appbrand.r.b.b
{
  private static final int CTRL_INDEX = 341;
  private static final String NAME = "onLocationChange";
  private final l fFa;
  
  b(l paraml)
  {
    this.fFa = paraml;
  }
  
  public final void a(double paramDouble1, double paramDouble2, b.a parama, double paramDouble3, double paramDouble4, double paramDouble5)
  {
    Object localObject = new HashMap(7);
    ((Map)localObject).put("longitude", Double.valueOf(paramDouble2));
    ((Map)localObject).put("latitude", Double.valueOf(paramDouble1));
    ((Map)localObject).put("speed", Double.valueOf(paramDouble3));
    ((Map)localObject).put("accuracy", Double.valueOf(paramDouble4));
    ((Map)localObject).put("altitude", Double.valueOf(paramDouble5));
    ((Map)localObject).put("verticalAccuracy", Float.valueOf(0.0F));
    ((Map)localObject).put("horizontalAccuracy", Double.valueOf(paramDouble4));
    localObject = new JSONObject((Map)localObject).toString();
    x.v("MicroMsg.AppBrand.EventOnLocationChange", "onLocationChanged %s, %s, %s", new Object[] { this.fFa.mAppId, parama.name(), localObject });
    try
    {
      parama = a(this.fFa);
      parama.mData = ((String)localObject);
      parama.ahM();
      return;
    }
    finally {}
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/lbs/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */