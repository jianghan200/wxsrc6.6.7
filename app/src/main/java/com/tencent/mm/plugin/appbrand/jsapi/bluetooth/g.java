package com.tencent.mm.plugin.appbrand.jsapi.bluetooth;

import android.annotation.TargetApi;
import com.tencent.mm.plugin.appbrand.jsapi.e;
import com.tencent.mm.plugin.appbrand.l;
import com.tencent.mm.sdk.platformtools.x;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@TargetApi(18)
public final class g
  extends com.tencent.mm.plugin.appbrand.jsapi.a
{
  private static final int CTRL_INDEX = 183;
  private static final String NAME = "getBLEDeviceCharacteristics";
  
  public final void a(l paraml, JSONObject paramJSONObject, int paramInt)
  {
    c.kB(151);
    if (paramJSONObject == null)
    {
      x.e("MicroMsg.JsApiGetBLEDeviceCharacteristics", "getBLEDeviceCharacteristics data is null");
      paraml.E(paramInt, f("fail:invalid data", null));
      c.bK(153, 154);
      return;
    }
    x.i("MicroMsg.JsApiGetBLEDeviceCharacteristics", "appId:%s getBLEDeviceCharacteristics data %s", new Object[] { paraml.mAppId, paramJSONObject.toString() });
    Object localObject = a.tr(paraml.mAppId);
    if (localObject == null)
    {
      x.e("MicroMsg.JsApiGetBLEDeviceCharacteristics", "bleWorker is null, may not open ble");
      paramJSONObject = new HashMap();
      paramJSONObject.put("errCode", Integer.valueOf(10000));
      paraml.E(paramInt, f("fail:not init", paramJSONObject));
      c.bK(153, 156);
      return;
    }
    if (!com.tencent.mm.plugin.appbrand.jsapi.bluetooth.ble.sdk.d.b.aiB())
    {
      x.e("MicroMsg.JsApiGetBLEDeviceCharacteristics", "adapter is null or not enabled!");
      paramJSONObject = new HashMap();
      paramJSONObject.put("errCode", Integer.valueOf(10001));
      paraml.E(paramInt, f("fail:not available", paramJSONObject));
      c.bK(153, 158);
      return;
    }
    localObject = ((b)localObject).bn(paramJSONObject.optString("deviceId"), paramJSONObject.optString("serviceId"));
    paramJSONObject = new HashMap();
    if ((localObject == null) || (((List)localObject).size() <= 0))
    {
      x.e("MicroMsg.JsApiGetBLEDeviceCharacteristics", "not found characteristic");
      paramJSONObject.put("errCode", Integer.valueOf(10005));
      paraml.E(paramInt, f("fail:no characteristic", paramJSONObject));
      c.bK(153, 159);
      return;
    }
    paramJSONObject = new JSONArray();
    localObject = ((List)localObject).iterator();
    com.tencent.mm.plugin.appbrand.jsapi.bluetooth.ble.sdk.c.c localc;
    if (((Iterator)localObject).hasNext()) {
      localc = (com.tencent.mm.plugin.appbrand.jsapi.bluetooth.ble.sdk.c.c)((Iterator)localObject).next();
    }
    for (;;)
    {
      try
      {
        if (localc.fMp == null)
        {
          localc.fMp = new JSONObject();
          localc.fMp.put("uuid", localc.fMk);
          JSONObject localJSONObject = new JSONObject();
          localJSONObject.put("read", localc.fMl);
          if (localc.fMm) {
            break label591;
          }
          if (!localc.fMn) {
            break label476;
          }
          break label591;
          localJSONObject.put("write", bool);
          localJSONObject.put("notify", localc.dBn);
          localJSONObject.put("indicate", localc.fMo);
          localc.fMp.put("properties", localJSONObject);
        }
        paramJSONObject.put(localc.fMp);
      }
      catch (JSONException localJSONException)
      {
        x.e("MicroMsg.JsApiGetBLEDeviceCharacteristics", "JSONException %s", new Object[] { localJSONException.getMessage() });
      }
      break;
      label476:
      boolean bool = false;
      continue;
      localObject = new JSONObject();
      try
      {
        ((JSONObject)localObject).put("errMsg", getName() + ":ok");
        ((JSONObject)localObject).put("characteristics", paramJSONObject);
        ((JSONObject)localObject).put("errCode", 0);
        x.i("MicroMsg.JsApiGetBLEDeviceCharacteristics", "retJson %s", new Object[] { ((JSONObject)localObject).toString() });
        paraml.E(paramInt, ((JSONObject)localObject).toString());
        c.kB(152);
        return;
      }
      catch (JSONException paramJSONObject)
      {
        for (;;)
        {
          x.printErrStackTrace("MicroMsg.JsApiGetBLEDeviceCharacteristics", paramJSONObject, "", new Object[0]);
        }
      }
      label591:
      bool = true;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/bluetooth/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */