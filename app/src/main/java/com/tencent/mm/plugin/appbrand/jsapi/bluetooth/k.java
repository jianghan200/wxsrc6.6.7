package com.tencent.mm.plugin.appbrand.jsapi.bluetooth;

import android.annotation.TargetApi;
import com.tencent.mm.plugin.appbrand.jsapi.bluetooth.ble.sdk.c.d;
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
public final class k
  extends com.tencent.mm.plugin.appbrand.jsapi.a
{
  private static final int CTRL_INDEX = 179;
  private static final String NAME = "getConnectedBluetoothDevices";
  
  public final void a(l paraml, JSONObject paramJSONObject, int paramInt)
  {
    c.kB(191);
    x.i("MicroMsg.JsApiGetConnectedBluetoothDevices", "getConnectedBluetoothDevices!");
    x.i("MicroMsg.JsApiGetConnectedBluetoothDevices", "appId:%s getBLEDeviceCharacteristics data %s", new Object[] { paraml.mAppId, paramJSONObject.toString() });
    paramJSONObject = a.tr(paraml.mAppId);
    if (paramJSONObject == null)
    {
      x.e("MicroMsg.JsApiGetConnectedBluetoothDevices", "bleWorker is null, may not open ble");
      paramJSONObject = new HashMap();
      paramJSONObject.put("errCode", Integer.valueOf(10000));
      paraml.E(paramInt, f("fail:not init", paramJSONObject));
      c.bK(193, 195);
      return;
    }
    if (!com.tencent.mm.plugin.appbrand.jsapi.bluetooth.ble.sdk.d.b.aiB())
    {
      x.e("MicroMsg.JsApiGetConnectedBluetoothDevices", "adapter is null or not enabled!");
      paramJSONObject = new HashMap();
      paramJSONObject.put("errCode", Integer.valueOf(10001));
      paraml.E(paramInt, f("fail:not available", paramJSONObject));
      c.bK(193, 197);
      return;
    }
    Object localObject1 = paramJSONObject.air();
    if (localObject1 == null)
    {
      x.e("MicroMsg.JsApiGetConnectedBluetoothDevices", "bluetoothDevices is empty!");
      paraml.E(paramInt, f("fail", null));
      c.bK(193, 198);
      return;
    }
    paramJSONObject = new JSONArray();
    localObject1 = ((List)localObject1).iterator();
    while (((Iterator)localObject1).hasNext())
    {
      Object localObject2 = (d)((Iterator)localObject1).next();
      String str = ((d)localObject2).byN;
      localObject2 = ((d)localObject2).name;
      JSONObject localJSONObject = new JSONObject();
      try
      {
        localJSONObject.put("deviceId", str);
        localJSONObject.put("name", localObject2);
        paramJSONObject.put(localJSONObject);
      }
      catch (JSONException localJSONException)
      {
        x.e("MicroMsg.JsApiGetConnectedBluetoothDevices", "put JSON data error : %s", new Object[] { localJSONException });
      }
    }
    localObject1 = new JSONObject();
    try
    {
      ((JSONObject)localObject1).put("errMsg", getName() + ":ok");
      ((JSONObject)localObject1).put("devices", paramJSONObject);
      x.i("MicroMsg.JsApiGetConnectedBluetoothDevices", "retJson %s", new Object[] { ((JSONObject)localObject1).toString() });
      paraml.E(paramInt, ((JSONObject)localObject1).toString());
      c.kB(192);
      return;
    }
    catch (JSONException paramJSONObject)
    {
      for (;;)
      {
        x.printErrStackTrace("MicroMsg.JsApiGetConnectedBluetoothDevices", paramJSONObject, "", new Object[0]);
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/bluetooth/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */