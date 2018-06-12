package com.tencent.mm.plugin.appbrand.jsapi.bluetooth;

import com.tencent.mm.plugin.appbrand.l;
import com.tencent.mm.sdk.platformtools.x;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

public final class i
  extends com.tencent.mm.plugin.appbrand.jsapi.a
{
  private static final int CTRL_INDEX = 175;
  private static final String NAME = "getBluetoothAdapterState";
  
  public final void a(l paraml, JSONObject paramJSONObject, int paramInt)
  {
    boolean bool2 = false;
    c.kB(126);
    x.i("MicroMsg.JsApiGetBluetoothAdapterState", "appId:%s getBluetoothAdapterState", new Object[] { paraml.mAppId });
    paramJSONObject = a.tr(paraml.mAppId);
    if (paramJSONObject == null)
    {
      x.e("MicroMsg.JsApiGetBluetoothAdapterState", "bleWorker is null, may not open ble");
      paramJSONObject = new HashMap();
      paramJSONObject.put("errCode", Integer.valueOf(10000));
      paraml.E(paramInt, f("fail:not init", paramJSONObject));
      c.bK(128, 130);
      return;
    }
    boolean bool3 = com.tencent.mm.plugin.appbrand.jsapi.bluetooth.ble.sdk.d.b.aiB();
    boolean bool1 = bool2;
    if (paramJSONObject.fLc != null)
    {
      paramJSONObject = paramJSONObject.fLc;
      bool1 = bool2;
      if (paramJSONObject.fLI != null) {
        bool1 = paramJSONObject.fLI.fMQ.get();
      }
    }
    x.i("MicroMsg.JsApiGetBluetoothAdapterState", "availableState : " + bool3 + ",discoveringState : " + bool1);
    paramJSONObject = new HashMap();
    paramJSONObject.put("available", Boolean.valueOf(bool3));
    paramJSONObject.put("discovering", Boolean.valueOf(bool1));
    paraml.E(paramInt, f("ok", paramJSONObject));
    c.kB(127);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/bluetooth/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */