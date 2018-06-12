package com.tencent.mm.plugin.appbrand.jsapi.wifi;

import android.content.Context;
import com.tencent.mm.plugin.appbrand.jsapi.a;
import com.tencent.mm.plugin.appbrand.l;
import com.tencent.mm.sdk.platformtools.x;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class e
  extends a
{
  public static final int CTRL_INDEX = 315;
  public static final String NAME = "stopWifi";
  
  public final void a(l paraml, JSONObject paramJSONObject, int paramInt)
  {
    x.i("MicroMsg.JsApiStopWifi", "invoke registerHotspotHelper");
    paramJSONObject = paraml.getContext();
    if (paramJSONObject == null)
    {
      x.e("MicroMsg.JsApiStopWifi", "mContext is null, invoke fail!");
      paramJSONObject = new HashMap();
      paramJSONObject.put("errCode", Integer.valueOf(12010));
      paraml.E(paramInt, f("fail:context is null", paramJSONObject));
      return;
    }
    if (!d.gdr)
    {
      x.e("MicroMsg.JsApiStopWifi", "not invoke startWifi");
      paramJSONObject = new HashMap();
      paramJSONObject.put("errCode", Integer.valueOf(12000));
      paraml.E(paramInt, f("fail:not invoke startWifi", paramJSONObject));
      return;
    }
    if (d.gds != null)
    {
      x.i("MicroMsg.JsApiStopWifi", "unregisterReceiver");
      paramJSONObject.unregisterReceiver(d.gds);
      d.gdr = false;
      d.gds = null;
    }
    paramJSONObject = new HashMap();
    paramJSONObject.put("errCode", Integer.valueOf(0));
    paraml.E(paramInt, f("ok", paramJSONObject));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/wifi/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */