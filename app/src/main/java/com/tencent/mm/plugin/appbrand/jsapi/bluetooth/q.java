package com.tencent.mm.plugin.appbrand.jsapi.bluetooth;

import android.annotation.TargetApi;
import com.tencent.mm.plugin.appbrand.jsapi.bluetooth.ble.sdk.a.a.f;
import com.tencent.mm.plugin.appbrand.jsapi.e;
import com.tencent.mm.plugin.appbrand.l;
import com.tencent.mm.sdk.platformtools.x;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

@TargetApi(18)
public final class q
  extends com.tencent.mm.plugin.appbrand.jsapi.a
{
  private static final int CTRL_INDEX = 184;
  private static final String NAME = "writeBLECharacteristicValue";
  
  public final void a(l paraml, JSONObject paramJSONObject, int paramInt)
  {
    c.kB(56);
    if (paramJSONObject == null)
    {
      x.e("MicroMsg.JsApiWriteBLECharacteristicValue", "JsApiWriteBLECharacteristicValue data is null");
      paraml.E(paramInt, f("fail:data is null", null));
      c.bK(58, 59);
      return;
    }
    x.i("MicroMsg.JsApiWriteBLECharacteristicValue", "appId:%s writeBLECharacteristicValue data %s", new Object[] { paraml.mAppId, paramJSONObject.toString() });
    b localb = a.tr(paraml.mAppId);
    if (localb == null)
    {
      x.e("MicroMsg.JsApiWriteBLECharacteristicValue", "bleWorker is null, may not open ble");
      paramJSONObject = new HashMap();
      paramJSONObject.put("errCode", Integer.valueOf(10000));
      paraml.E(paramInt, f("fail:not init", paramJSONObject));
      c.bK(58, 61);
      return;
    }
    if (!com.tencent.mm.plugin.appbrand.jsapi.bluetooth.ble.sdk.d.b.aiB())
    {
      x.e("MicroMsg.JsApiWriteBLECharacteristicValue", "adapter is null or not enabled!");
      paramJSONObject = new HashMap();
      paramJSONObject.put("errCode", Integer.valueOf(10001));
      paraml.E(paramInt, f("fail:not available", paramJSONObject));
      c.bK(58, 63);
      return;
    }
    String str1 = paramJSONObject.optString("deviceId");
    String str2 = paramJSONObject.optString("serviceId");
    String str3 = paramJSONObject.optString("characteristicId");
    String str4 = paramJSONObject.optString("value");
    boolean bool1 = paramJSONObject.optBoolean("debug", false);
    boolean bool2 = paramJSONObject.optBoolean("serial", true);
    paramJSONObject = new f(str2, str3, str4);
    paramJSONObject.Zq = bool1;
    paramJSONObject.fLy = false;
    paramJSONObject.fLA = bool2;
    localb.a(str1, paramJSONObject, new q.1(this, paraml, paramInt));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/bluetooth/q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */