package com.tencent.mm.plugin.appbrand.jsapi.bluetooth;

import android.annotation.TargetApi;
import com.tencent.mm.plugin.appbrand.l;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@TargetApi(18)
public final class h
  extends com.tencent.mm.plugin.appbrand.jsapi.a
{
  private static final int CTRL_INDEX = 182;
  private static final String NAME = "getBLEDeviceServices";
  
  public final void a(l paraml, JSONObject paramJSONObject, int paramInt)
  {
    c.kB(136);
    if (paramJSONObject == null)
    {
      x.e("MicroMsg.JsApiGetBLEDeviceServices", "getBLEDeviceServices data is null");
      paraml.E(paramInt, f("fail:invalid data", null));
      c.bK(138, 139);
      return;
    }
    x.i("MicroMsg.JsApiGetBLEDeviceServices", "appId:%s getBLEDeviceServices data %s", new Object[] { paraml.mAppId, paramJSONObject.toString() });
    Object localObject = a.tr(paraml.mAppId);
    if (localObject == null)
    {
      x.e("MicroMsg.JsApiGetBLEDeviceServices", "bleWorker is null, may not open ble");
      paramJSONObject = new HashMap();
      paramJSONObject.put("errCode", Integer.valueOf(10000));
      paraml.E(paramInt, f("fail:not init", paramJSONObject));
      c.bK(138, 141);
      return;
    }
    if (!com.tencent.mm.plugin.appbrand.jsapi.bluetooth.ble.sdk.d.b.aiB())
    {
      x.e("MicroMsg.JsApiGetBLEDeviceServices", "adapter is null or not enabled!");
      paramJSONObject = new HashMap();
      paramJSONObject.put("errCode", Integer.valueOf(10001));
      paraml.E(paramInt, f("fail:not available", paramJSONObject));
      c.bK(138, 145);
      return;
    }
    localObject = ((b)localObject).tt(paramJSONObject.optString("deviceId"));
    paramJSONObject = new HashMap();
    if ((localObject == null) || (((List)localObject).size() <= 0))
    {
      x.e("MicroMsg.JsApiGetBLEDeviceServices", "not found services");
      paramJSONObject.put("errCode", Integer.valueOf(10004));
      paraml.E(paramInt, f("fail:no service", paramJSONObject));
      c.bK(138, 144);
      return;
    }
    paramJSONObject = new JSONArray();
    localObject = ((List)localObject).iterator();
    while (((Iterator)localObject).hasNext())
    {
      com.tencent.mm.plugin.appbrand.jsapi.bluetooth.ble.sdk.c.e locale = (com.tencent.mm.plugin.appbrand.jsapi.bluetooth.ble.sdk.c.e)((Iterator)localObject).next();
      if (bi.oW(locale.fMk)) {
        x.e("MicroMsg.JsApiGetBLEDeviceServices", "get uuid is null");
      } else {
        try
        {
          if (locale.fMp == null)
          {
            locale.fMp = new JSONObject();
            locale.fMp.put("uuid", locale.fMk);
            locale.fMp.put("isPrimary", locale.fMu);
          }
          paramJSONObject.put(locale.fMp);
        }
        catch (JSONException localJSONException)
        {
          x.e("MicroMsg.JsApiGetBLEDeviceServices", "JSONException %s", new Object[] { localJSONException.getMessage() });
        }
      }
    }
    localObject = new JSONObject();
    try
    {
      ((JSONObject)localObject).put("errMsg", getName() + ":ok");
      ((JSONObject)localObject).put("services", paramJSONObject);
      ((JSONObject)localObject).put("errCode", 0);
      x.i("MicroMsg.JsApiGetBLEDeviceServices", "retJson %s", new Object[] { ((JSONObject)localObject).toString() });
      paraml.E(paramInt, ((JSONObject)localObject).toString());
      c.kB(137);
      return;
    }
    catch (JSONException paramJSONObject)
    {
      for (;;)
      {
        x.printErrStackTrace("MicroMsg.JsApiGetBLEDeviceServices", paramJSONObject, "", new Object[0]);
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/bluetooth/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */