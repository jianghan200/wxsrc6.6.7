package com.tencent.mm.plugin.appbrand.jsapi.bluetooth;

import android.annotation.TargetApi;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattService;
import com.tencent.mm.plugin.appbrand.jsapi.e;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.json.JSONObject;

@TargetApi(18)
public final class l
  extends com.tencent.mm.plugin.appbrand.jsapi.a
{
  private static final int CTRL_INDEX = 186;
  private static final String NAME = "notifyBLECharacteristicValueChanged";
  public static String fLh = "notification";
  public static String fLi = "indication";
  
  public final void a(com.tencent.mm.plugin.appbrand.l paraml, JSONObject paramJSONObject, int paramInt)
  {
    c.kB(71);
    if (paramJSONObject == null)
    {
      x.e("MicroMsg.JsApiNotifyBLECharacteristicValueChanged", "JsApiNotifyBLECharacteristicValueChanged data is null");
      paraml.E(paramInt, f("fail:data is null", null));
      c.bK(73, 74);
      return;
    }
    String str2 = paraml.mAppId;
    x.i("MicroMsg.JsApiNotifyBLECharacteristicValueChanged", "appId:%s notifyBLECharacteristicValueChanged data %s", new Object[] { str2, paramJSONObject.toString() });
    b localb = a.tr(paraml.mAppId);
    if (localb == null)
    {
      x.e("MicroMsg.JsApiNotifyBLECharacteristicValueChanged", "bleWorker is null, may not open ble");
      paramJSONObject = new HashMap();
      paramJSONObject.put("errCode", Integer.valueOf(10000));
      paraml.E(paramInt, f("fail:not init", paramJSONObject));
      c.bK(73, 76);
      return;
    }
    if (!com.tencent.mm.plugin.appbrand.jsapi.bluetooth.ble.sdk.d.b.aiB())
    {
      x.e("MicroMsg.JsApiNotifyBLECharacteristicValueChanged", "adapter is null or not enabled!");
      paramJSONObject = new HashMap();
      paramJSONObject.put("errCode", Integer.valueOf(10001));
      paraml.E(paramInt, f("fail:not available", paramJSONObject));
      c.bK(73, 79);
      return;
    }
    String str1 = paramJSONObject.optString("deviceId");
    String str3 = paramJSONObject.optString("serviceId");
    String str4 = paramJSONObject.optString("characteristicId");
    boolean bool3 = paramJSONObject.optBoolean("state");
    String str5 = paramJSONObject.optString("type", fLi);
    boolean bool4 = paramJSONObject.optBoolean("debug", false);
    boolean bool5 = paramJSONObject.optBoolean("mainThread", false);
    boolean bool6 = paramJSONObject.optBoolean("serial", true);
    if (localb.fLc != null)
    {
      paramJSONObject = localb.fLc;
      if (paramJSONObject.fLH != null)
      {
        paramJSONObject = paramJSONObject.fLH;
        if (paramJSONObject.fLQ.get(str1) != null)
        {
          paramJSONObject = (com.tencent.mm.plugin.appbrand.jsapi.bluetooth.ble.sdk.a.d)paramJSONObject.fLQ.get(str1);
          if (paramJSONObject.fLV != null) {
            break label382;
          }
          com.tencent.mm.plugin.appbrand.jsapi.bluetooth.ble.sdk.d.a.e("MicroMsg.Ble.BleConnectWorker", "[getCharacteristic] bluetoothGatt is null, err", new Object[0]);
        }
      }
      paramJSONObject = null;
    }
    for (;;)
    {
      if (paramJSONObject != null) {
        break label600;
      }
      x.e("MicroMsg.JsApiNotifyBLECharacteristicValueChanged", "bleCharacteristic is null, may not connect");
      paramJSONObject = new HashMap();
      paramJSONObject.put("errCode", Integer.valueOf(10005));
      paraml.E(paramInt, f("fail:no characteristic", paramJSONObject));
      c.kB(73);
      return;
      label382:
      if ((bi.oW(str3)) || (bi.oW(str4)))
      {
        com.tencent.mm.plugin.appbrand.jsapi.bluetooth.ble.sdk.d.a.e("MicroMsg.Ble.BleConnectWorker", "[getCharacteristic] serviceId is null, err", new Object[0]);
        break;
      }
      if (!com.tencent.mm.plugin.appbrand.jsapi.bluetooth.ble.sdk.d.b.tv(str3))
      {
        com.tencent.mm.plugin.appbrand.jsapi.bluetooth.ble.sdk.d.a.e("MicroMsg.Ble.BleConnectWorker", "[getCharacteristics] serviceId is illegal, err", new Object[0]);
        break;
      }
      if (!com.tencent.mm.plugin.appbrand.jsapi.bluetooth.ble.sdk.d.b.tv(str4))
      {
        com.tencent.mm.plugin.appbrand.jsapi.bluetooth.ble.sdk.d.a.e("MicroMsg.Ble.BleConnectWorker", "[getCharacteristics] characteristicId is illegal, err", new Object[0]);
        break;
      }
      paramJSONObject = paramJSONObject.fLV.getService(UUID.fromString(str3));
      if (paramJSONObject == null)
      {
        com.tencent.mm.plugin.appbrand.jsapi.bluetooth.ble.sdk.d.a.w("MicroMsg.Ble.BleConnectWorker", "[getCharacteristic] bluetoothGattServices is null, err", new Object[0]);
        break;
      }
      BluetoothGattCharacteristic localBluetoothGattCharacteristic = paramJSONObject.getCharacteristic(UUID.fromString(str4));
      if (localBluetoothGattCharacteristic == null)
      {
        com.tencent.mm.plugin.appbrand.jsapi.bluetooth.ble.sdk.d.a.w("MicroMsg.Ble.BleConnectWorker", "[getCharacteristic] characteristics is null, err", new Object[0]);
        break;
      }
      paramJSONObject = new com.tencent.mm.plugin.appbrand.jsapi.bluetooth.ble.sdk.c.c();
      paramJSONObject.fMk = localBluetoothGattCharacteristic.getUuid().toString().toUpperCase();
      int i = localBluetoothGattCharacteristic.getProperties();
      paramJSONObject.fMl = com.tencent.mm.plugin.appbrand.jsapi.bluetooth.ble.sdk.d.b.kE(i);
      paramJSONObject.fMm = com.tencent.mm.plugin.appbrand.jsapi.bluetooth.ble.sdk.d.b.kF(i);
      paramJSONObject.fMn = com.tencent.mm.plugin.appbrand.jsapi.bluetooth.ble.sdk.d.b.kG(i);
      paramJSONObject.dBn = com.tencent.mm.plugin.appbrand.jsapi.bluetooth.ble.sdk.d.b.kH(i);
      paramJSONObject.fMo = com.tencent.mm.plugin.appbrand.jsapi.bluetooth.ble.sdk.d.b.kI(i);
      continue;
      paramJSONObject = null;
    }
    label600:
    boolean bool1;
    if (((paramJSONObject.dBn) && (!paramJSONObject.fMo)) || ((paramJSONObject.dBn) && (paramJSONObject.fMo) && (str5.toLowerCase().equals(fLh))))
    {
      bool1 = true;
      if (((paramJSONObject.dBn) || (!paramJSONObject.fMo)) && ((!paramJSONObject.dBn) || (!paramJSONObject.fMo) || (!str5.toLowerCase().equals(fLi)))) {
        break label785;
      }
    }
    label785:
    for (boolean bool2 = true;; bool2 = false)
    {
      x.i("MicroMsg.JsApiNotifyBLECharacteristicValueChanged", "appId:%s notifyBLECharacteristicValueChanged isNotify:%b isIndicate:%b", new Object[] { str2, Boolean.valueOf(bool1), Boolean.valueOf(bool2) });
      if (!bool1) {
        break label791;
      }
      paramJSONObject = new com.tencent.mm.plugin.appbrand.jsapi.bluetooth.ble.sdk.a.a.d(str3, str4, bool3);
      paramJSONObject.Zq = bool4;
      paramJSONObject.fLy = bool5;
      paramJSONObject.fLA = bool6;
      localb.a(str1, paramJSONObject, new l.1(this, paraml, paramInt));
      return;
      bool1 = false;
      break;
    }
    label791:
    if (bool2)
    {
      paramJSONObject = new com.tencent.mm.plugin.appbrand.jsapi.bluetooth.ble.sdk.a.a.c(str3, str4, bool3);
      paramJSONObject.Zq = bool4;
      paramJSONObject.fLy = bool5;
      paramJSONObject.fLA = bool6;
      localb.a(str1, paramJSONObject, new l.2(this, str2, paraml, paramInt));
      return;
    }
    x.i("MicroMsg.JsApiNotifyBLECharacteristicValueChanged", "not support notify and not support indicate...");
    paramJSONObject = new HashMap();
    paramJSONObject.put("errCode", Integer.valueOf(10007));
    paraml.E(paramInt, f("fail", paramJSONObject));
    c.bK(73, 82);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/bluetooth/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */