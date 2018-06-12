package com.tencent.mm.plugin.appbrand.jsapi.bluetooth;

import android.annotation.TargetApi;
import com.tencent.mm.plugin.appbrand.jsapi.bluetooth.ble.sdk.c.j;
import com.tencent.mm.plugin.appbrand.l;
import com.tencent.mm.sdk.platformtools.x;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

@TargetApi(18)
public final class p
  extends com.tencent.mm.plugin.appbrand.jsapi.a
{
  private static final int CTRL_INDEX = 177;
  private static final String NAME = "stopBluetoothDevicesDiscovery";
  
  public final void a(l paraml, JSONObject paramJSONObject, int paramInt)
  {
    c.kB(101);
    String str = paraml.mAppId;
    Object localObject = paramJSONObject;
    if (paramJSONObject == null) {
      localObject = "";
    }
    x.i("MicroMsg.JsApiStopBluetoothDevicesDiscovery", "appId:%s stopBluetoothDevicesDiscovery data:%s", new Object[] { str, localObject });
    paramJSONObject = a.tr(str);
    if (paramJSONObject == null)
    {
      x.e("MicroMsg.JsApiStopBluetoothDevicesDiscovery", "bleWorker is null, may not open ble");
      paramJSONObject = new HashMap();
      paramJSONObject.put("errCode", Integer.valueOf(10000));
      paraml.E(paramInt, f("fail:not init", paramJSONObject));
      c.bK(103, 106);
      return;
    }
    if (!com.tencent.mm.plugin.appbrand.jsapi.bluetooth.ble.sdk.d.b.aiB())
    {
      x.e("MicroMsg.JsApiStopBluetoothDevicesDiscovery", "adapter is null or not enabled!");
      paramJSONObject = new HashMap();
      paramJSONObject.put("errCode", Integer.valueOf(10001));
      paraml.E(paramInt, f("fail:not available", paramJSONObject));
      c.bK(103, 108);
      return;
    }
    if (paramJSONObject.fLc != null)
    {
      paramJSONObject = paramJSONObject.fLc;
      if (paramJSONObject.fLI != null) {
        paramJSONObject = paramJSONObject.fLI.aiw();
      }
    }
    for (;;)
    {
      x.i("MicroMsg.JsApiStopBluetoothDevicesDiscovery", "stopBleScan result:%s", new Object[] { paramJSONObject });
      localObject = new HashMap();
      switch (p.1.fLf[paramJSONObject.ordinal()])
      {
      default: 
        ((Map)localObject).put("isDiscovering", Boolean.valueOf(false));
        paraml.E(paramInt, f("fail", (Map)localObject));
        c.kB(103);
        return;
        paramJSONObject = j.fMw;
        continue;
        paramJSONObject = j.fMw;
      }
    }
    ((Map)localObject).put("isDiscovering", Boolean.valueOf(false));
    paraml.E(paramInt, f("ok", (Map)localObject));
    c.kB(102);
    m.c.a(paraml, true, false);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/bluetooth/p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */