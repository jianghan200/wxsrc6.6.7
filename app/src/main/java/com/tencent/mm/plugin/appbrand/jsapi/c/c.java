package com.tencent.mm.plugin.appbrand.jsapi.c;

import android.annotation.TargetApi;
import android.bluetooth.BluetoothAdapter;
import com.tencent.mm.compatible.util.d;
import com.tencent.mm.plugin.appbrand.e;
import com.tencent.mm.plugin.appbrand.e.b;
import com.tencent.mm.plugin.appbrand.jsapi.h;
import com.tencent.mm.plugin.appbrand.l;
import com.tencent.mm.sdk.platformtools.x;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@TargetApi(18)
public final class c
  extends com.tencent.mm.plugin.appbrand.jsapi.a
{
  private static final int CTRL_INDEX = 221;
  private static final String NAME = "startBeaconDiscovery";
  e.b fQA = null;
  private a.a.a fQx;
  
  private static UUID[] r(JSONObject paramJSONObject)
  {
    int i = 0;
    localObject2 = null;
    Object localObject3 = null;
    if (paramJSONObject.has("uuids"))
    {
      Object localObject1 = localObject3;
      try
      {
        JSONArray localJSONArray = new JSONArray(paramJSONObject.optString("uuids"));
        localObject1 = localObject3;
        paramJSONObject = new UUID[localJSONArray.length()];
        for (;;)
        {
          localObject1 = paramJSONObject;
          localObject2 = paramJSONObject;
          if (i >= localJSONArray.length()) {
            break;
          }
          localObject1 = paramJSONObject;
          localObject2 = localJSONArray.getString(i);
          localObject1 = paramJSONObject;
          x.d("MicroMsg.JsApiStartBeaconDiscovery", "uuid %s", new Object[] { localObject2 });
          localObject1 = paramJSONObject;
          paramJSONObject[i] = UUID.fromString((String)localObject2);
          i += 1;
        }
        return (UUID[])localObject2;
      }
      catch (JSONException paramJSONObject)
      {
        x.e("MicroMsg.JsApiStartBeaconDiscovery", "get uuid error!");
        localObject2 = localObject1;
      }
    }
  }
  
  public final void a(l paraml, JSONObject paramJSONObject, int paramInt)
  {
    x.i("MicroMsg.JsApiStartBeaconDiscovery", "startBeaconDiscovery data %s", new Object[] { paramJSONObject });
    UUID[] arrayOfUUID = r(paramJSONObject);
    if ((arrayOfUUID == null) || (arrayOfUUID.length <= 0))
    {
      paraml.E(paramInt, f("fail:invalid data", new HashMap()));
      return;
    }
    String str = paraml.mAppId;
    Object localObject = a.tz(paraml.mAppId);
    paramJSONObject = (JSONObject)localObject;
    if (localObject == null)
    {
      x.i("MicroMsg.JsApiStartBeaconDiscovery", "beaconWorker init");
      paramJSONObject = new a.a();
      a.a(str, paramJSONObject);
    }
    if (this.fQx == null)
    {
      x.i("MicroMsg.JsApiStartBeaconDiscovery", "onBeaconScanCallback init");
      this.fQx = new c.1(this, paraml);
    }
    if (this.fQA == null)
    {
      x.i("MicroMsg.JsApiStartBeaconDiscovery", "listener init");
      this.fQA = new c.2(this, paraml);
      e.a(paraml.mAppId, this.fQA);
    }
    paramJSONObject.fQw = arrayOfUUID;
    paramJSONObject.fQx = this.fQx;
    x.i("MicroMsg.BeaconManager", "BeaconWorker:%d start", new Object[] { Integer.valueOf(paramJSONObject.hashCode()) });
    int i;
    if (paramJSONObject.aiS())
    {
      x.i("MicroMsg.BeaconManager", "BeaconWorker:%d, already start", new Object[] { Integer.valueOf(paramJSONObject.hashCode()) });
      i = 11003;
      localObject = new HashMap();
      ((Map)localObject).put("errCode", Integer.valueOf(i));
      if (i != 0) {
        break label433;
      }
    }
    label433:
    for (paramJSONObject = "ok";; paramJSONObject = "fail")
    {
      paraml.E(paramInt, f(paramJSONObject, (Map)localObject));
      return;
      if (d.fS(18))
      {
        x.e("MicroMsg.BeaconManager", "API version is below 18!");
        i = 11000;
        break;
      }
      if (paramJSONObject.fQu == null)
      {
        x.e("MicroMsg.BeaconManager", "bluetoothAdapter is null!");
        i = 11001;
        break;
      }
      if (!paramJSONObject.fQu.isEnabled())
      {
        x.e("MicroMsg.BeaconManager", "bluetoothAdapter is null!");
        i = 11001;
        break;
      }
      if (paramJSONObject.fQu.isDiscovering())
      {
        x.e("MicroMsg.BeaconManager", "bluetoothAdapter is Discovering!");
        i = 11003;
        break;
      }
      paramJSONObject.fQv.clear();
      boolean bool = paramJSONObject.fQu.startLeScan(paramJSONObject.fQy);
      x.i("MicroMsg.BeaconManager", "startLeScan:%b", new Object[] { Boolean.valueOf(bool) });
      if (!bool)
      {
        i = 11005;
        break;
      }
      paramJSONObject.bTv = true;
      i = 0;
      break;
    }
  }
  
  private static final class a
    extends h
  {
    private static final int CTRL_INDEX = 225;
    private static final String NAME = "onBeaconServiceChanged";
  }
  
  private static final class b
    extends h
  {
    private static final int CTRL_INDEX = 224;
    private static final String NAME = "onBeaconUpdated";
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/c/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */