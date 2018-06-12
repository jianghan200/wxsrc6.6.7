package com.tencent.mm.plugin.appbrand.jsapi.bluetooth;

import android.annotation.TargetApi;
import android.util.Log;
import com.tencent.mm.plugin.appbrand.jsapi.bluetooth.ble.sdk.c.d;
import com.tencent.mm.plugin.appbrand.l;
import com.tencent.mm.sdk.platformtools.x;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@TargetApi(18)
public final class j
  extends com.tencent.mm.plugin.appbrand.jsapi.a
{
  private static final int CTRL_INDEX = 178;
  private static final String NAME = "getBluetoothDevices";
  
  public final void a(l paraml, JSONObject paramJSONObject, int paramInt)
  {
    JSONArray localJSONArray = null;
    c.kB(166);
    Object localObject2 = paraml.mAppId;
    Object localObject1 = paramJSONObject;
    if (paramJSONObject == null) {
      localObject1 = "";
    }
    x.i("MicroMsg.JsApiGetBluetoothDevices", "appId:%s getBluetoothDevices data:%s", new Object[] { localObject2, localObject1 });
    localObject2 = a.tr((String)localObject2);
    if (localObject2 == null)
    {
      x.e("MicroMsg.JsApiGetBluetoothDevices", "bleWorker is null, may not open ble");
      paramJSONObject = new HashMap();
      paramJSONObject.put("errCode", Integer.valueOf(10000));
      paraml.E(paramInt, f("fail:not init", paramJSONObject));
      c.bK(168, 170);
      return;
    }
    if (!com.tencent.mm.plugin.appbrand.jsapi.bluetooth.ble.sdk.d.b.aiB())
    {
      x.e("MicroMsg.JsApiGetBluetoothDevices", "adapter is null or not enabled!");
      paramJSONObject = new HashMap();
      paramJSONObject.put("errCode", Integer.valueOf(10001));
      paraml.E(paramInt, f("fail:not available", paramJSONObject));
      c.bK(168, 172);
      return;
    }
    paramJSONObject = localJSONArray;
    if (((b)localObject2).fLc != null)
    {
      localObject1 = ((b)localObject2).fLc;
      paramJSONObject = localJSONArray;
      if (((com.tencent.mm.plugin.appbrand.jsapi.bluetooth.ble.sdk.b)localObject1).fLI != null) {
        paramJSONObject = new ArrayList(((com.tencent.mm.plugin.appbrand.jsapi.bluetooth.ble.sdk.b)localObject1).fLI.fMP.values());
      }
    }
    localObject1 = new JSONObject();
    localJSONArray = new JSONArray();
    if (paramJSONObject != null)
    {
      paramJSONObject.addAll(((b)localObject2).air());
      paramJSONObject = paramJSONObject.iterator();
      while (paramJSONObject.hasNext())
      {
        localObject2 = (d)paramJSONObject.next();
        try
        {
          localJSONArray.put(((d)localObject2).ahS());
        }
        catch (JSONException localJSONException)
        {
          x.printErrStackTrace("MicroMsg.JsApiGetBluetoothDevices", localJSONException, "", new Object[0]);
        }
      }
    }
    try
    {
      ((JSONObject)localObject1).put("errMsg", getName() + ":ok");
      ((JSONObject)localObject1).put("devices", localJSONArray);
      x.i("MicroMsg.JsApiGetBluetoothDevices", "retJson %s", new Object[] { localObject1 });
      paraml.E(paramInt, ((JSONObject)localObject1).toString());
      c.kB(167);
      return;
    }
    catch (JSONException paramJSONObject)
    {
      for (;;)
      {
        x.e("MicroMsg.JsApiGetBluetoothDevices", "put json value error : %s", new Object[] { Log.getStackTraceString(paramJSONObject) });
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/bluetooth/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */