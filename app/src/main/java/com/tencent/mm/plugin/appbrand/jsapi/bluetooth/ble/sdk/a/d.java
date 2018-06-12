package com.tencent.mm.plugin.appbrand.jsapi.bluetooth.ble.sdk.a;

import android.annotation.TargetApi;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.bluetooth.BluetoothGattService;
import android.content.Context;
import android.util.Base64;
import com.tencent.mm.plugin.appbrand.jsapi.bluetooth.ble.sdk.c.c;
import com.tencent.mm.plugin.appbrand.jsapi.bluetooth.ble.sdk.c.f;
import com.tencent.mm.plugin.appbrand.jsapi.bluetooth.ble.sdk.c.g;
import com.tencent.mm.plugin.appbrand.jsapi.bluetooth.ble.sdk.c.h;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@TargetApi(18)
public final class d
  implements e
{
  public String byN;
  public Context context;
  public h fLR;
  public g fLS;
  public b fLU;
  public BluetoothGatt fLV;
  public List<com.tencent.mm.plugin.appbrand.jsapi.bluetooth.ble.sdk.c.e> fLW;
  public Map<String, List<c>> fLX;
  
  public d(Context paramContext, String paramString)
  {
    this.context = paramContext;
    this.byN = paramString;
  }
  
  private void X(String paramString, boolean paramBoolean)
  {
    if (this.fLR != null) {
      this.fLR.W(paramString, paramBoolean);
    }
  }
  
  public final void cM(boolean paramBoolean)
  {
    try
    {
      if (this.fLV != null)
      {
        com.tencent.mm.plugin.appbrand.jsapi.bluetooth.ble.sdk.d.a.i("MicroMsg.Ble.BleConnectWorker", "deviceId:%s closeMyself", new Object[] { this.byN });
        if (paramBoolean) {
          X(this.byN, false);
        }
        if (com.tencent.mm.plugin.appbrand.jsapi.bluetooth.ble.sdk.a.fLt.fLF) {
          com.tencent.mm.plugin.appbrand.jsapi.bluetooth.ble.sdk.d.b.a(this.fLV);
        }
        this.fLV.close();
        this.fLV = null;
      }
      return;
    }
    finally {}
  }
  
  public final void onCharacteristicChanged(BluetoothGatt paramBluetoothGatt, BluetoothGattCharacteristic paramBluetoothGattCharacteristic)
  {
    String str1;
    if (paramBluetoothGatt != null)
    {
      str1 = paramBluetoothGatt.getDevice().getAddress();
      if (paramBluetoothGattCharacteristic == null) {
        break label163;
      }
    }
    label163:
    for (String str2 = paramBluetoothGattCharacteristic.getUuid().toString().toUpperCase();; str2 = "")
    {
      com.tencent.mm.plugin.appbrand.jsapi.bluetooth.ble.sdk.d.a.i("MicroMsg.Ble.BleConnectWorker", "[onCharacteristicChanged]gatt deviceId:%s characteristicId:%s", new Object[] { str1, str2 });
      this.fLU.onCharacteristicChanged(paramBluetoothGatt, paramBluetoothGattCharacteristic);
      if (this.fLS != null)
      {
        str1 = new String(Base64.encode(paramBluetoothGattCharacteristic.getValue(), 2));
        paramBluetoothGatt = paramBluetoothGatt.getDevice().getAddress();
        str2 = paramBluetoothGattCharacteristic.getService().getUuid().toString().toUpperCase();
        paramBluetoothGattCharacteristic = paramBluetoothGattCharacteristic.getUuid().toString().toUpperCase();
        com.tencent.mm.plugin.appbrand.jsapi.bluetooth.ble.sdk.d.a.i("MicroMsg.Ble.BleConnectWorker", "[change]deviceId %s, serviceId %s, characteristicId %s, value %s", new Object[] { paramBluetoothGatt, str2, paramBluetoothGattCharacteristic, str1 });
        this.fLS.g(paramBluetoothGatt, str2, paramBluetoothGattCharacteristic, str1);
      }
      return;
      str1 = "";
      break;
    }
  }
  
  public final void onCharacteristicRead(BluetoothGatt paramBluetoothGatt, BluetoothGattCharacteristic paramBluetoothGattCharacteristic, int paramInt)
  {
    String str1;
    if (paramBluetoothGatt != null)
    {
      str1 = paramBluetoothGatt.getDevice().getAddress();
      if (paramBluetoothGattCharacteristic == null) {
        break label174;
      }
    }
    label174:
    for (String str2 = paramBluetoothGattCharacteristic.getUuid().toString().toUpperCase();; str2 = "")
    {
      com.tencent.mm.plugin.appbrand.jsapi.bluetooth.ble.sdk.d.a.i("MicroMsg.Ble.BleConnectWorker", "[onCharacteristicRead]gatt deviceId:%s characteristicId:%s status:%s", new Object[] { str1, str2, f.kC(paramInt) });
      this.fLU.onCharacteristicRead(paramBluetoothGatt, paramBluetoothGattCharacteristic, paramInt);
      if (paramInt == 0)
      {
        str1 = new String(Base64.encode(paramBluetoothGattCharacteristic.getValue(), 2));
        paramBluetoothGatt = paramBluetoothGatt.getDevice().getAddress();
        str2 = paramBluetoothGattCharacteristic.getService().getUuid().toString().toUpperCase();
        paramBluetoothGattCharacteristic = paramBluetoothGattCharacteristic.getUuid().toString().toUpperCase();
        com.tencent.mm.plugin.appbrand.jsapi.bluetooth.ble.sdk.d.a.i("MicroMsg.Ble.BleConnectWorker", "[read]deviceId %s, serviceId %s, characteristicId %s, value %s", new Object[] { paramBluetoothGatt, str2, paramBluetoothGattCharacteristic, str1 });
        this.fLS.g(paramBluetoothGatt, str2, paramBluetoothGattCharacteristic, str1);
      }
      return;
      str1 = "";
      break;
    }
  }
  
  public final void onCharacteristicWrite(BluetoothGatt paramBluetoothGatt, BluetoothGattCharacteristic paramBluetoothGattCharacteristic, int paramInt)
  {
    String str1;
    String str2;
    if (paramBluetoothGatt != null)
    {
      str1 = paramBluetoothGatt.getDevice().getAddress();
      if (paramBluetoothGattCharacteristic == null) {
        break label100;
      }
      str2 = paramBluetoothGattCharacteristic.getUuid().toString().toUpperCase();
      label29:
      if (paramBluetoothGattCharacteristic == null) {
        break label107;
      }
    }
    label100:
    label107:
    for (Object localObject = Arrays.asList(new byte[][] { paramBluetoothGattCharacteristic.getValue() });; localObject = "")
    {
      com.tencent.mm.plugin.appbrand.jsapi.bluetooth.ble.sdk.d.a.i("MicroMsg.Ble.BleConnectWorker", "[onCharacteristicWrite]gatt deviceId:%s characteristicId:%s value:%s, status:%s", new Object[] { str1, str2, localObject, f.kC(paramInt) });
      this.fLU.onCharacteristicWrite(paramBluetoothGatt, paramBluetoothGattCharacteristic, paramInt);
      return;
      str1 = "";
      break;
      str2 = "";
      break label29;
    }
  }
  
  public final void onConnectionStateChange(BluetoothGatt paramBluetoothGatt, int paramInt1, int paramInt2)
  {
    String str1;
    String str2;
    if (paramBluetoothGatt != null)
    {
      str1 = paramBluetoothGatt.getDevice().getAddress();
      String str3 = f.kC(paramInt1);
      if (paramInt2 != 2) {
        break label95;
      }
      str2 = "CONNECTED";
      label28:
      com.tencent.mm.plugin.appbrand.jsapi.bluetooth.ble.sdk.d.a.i("MicroMsg.Ble.BleConnectWorker", "[onConnectionStateChange]gatt deviceId:%s gattStatus:%s, newState:%s", new Object[] { str1, str3, str2 });
      this.fLU.onConnectionStateChange(paramBluetoothGatt, paramInt1, paramInt2);
      paramBluetoothGatt = paramBluetoothGatt.getDevice().getAddress();
      if (paramInt1 != 0) {
        break label106;
      }
      if (paramInt2 != 2) {
        break label102;
      }
      X(paramBluetoothGatt, true);
    }
    label95:
    label102:
    while (paramInt2 != 0)
    {
      return;
      str1 = "";
      break;
      str2 = "DISCONNECTED";
      break label28;
    }
    label106:
    cM(true);
  }
  
  public final void onDescriptorRead(BluetoothGatt paramBluetoothGatt, BluetoothGattDescriptor paramBluetoothGattDescriptor, int paramInt)
  {
    String str1;
    if (paramBluetoothGatt != null)
    {
      str1 = paramBluetoothGatt.getDevice().getAddress();
      if (paramBluetoothGattDescriptor == null) {
        break label68;
      }
    }
    label68:
    for (String str2 = paramBluetoothGattDescriptor.getUuid().toString().toUpperCase();; str2 = "")
    {
      com.tencent.mm.plugin.appbrand.jsapi.bluetooth.ble.sdk.d.a.i("MicroMsg.Ble.BleConnectWorker", "[onDescriptorRead]gatt deviceId:%s descriptorId:%s", new Object[] { str1, str2 });
      this.fLU.onDescriptorRead(paramBluetoothGatt, paramBluetoothGattDescriptor, paramInt);
      return;
      str1 = "";
      break;
    }
  }
  
  public final void onDescriptorWrite(BluetoothGatt paramBluetoothGatt, BluetoothGattDescriptor paramBluetoothGattDescriptor, int paramInt)
  {
    String str1;
    if (paramBluetoothGatt != null)
    {
      str1 = paramBluetoothGatt.getDevice().getAddress();
      if (paramBluetoothGattDescriptor == null) {
        break label68;
      }
    }
    label68:
    for (String str2 = paramBluetoothGattDescriptor.getUuid().toString().toUpperCase();; str2 = "")
    {
      com.tencent.mm.plugin.appbrand.jsapi.bluetooth.ble.sdk.d.a.i("MicroMsg.Ble.BleConnectWorker", "[onDescriptorWrite]gatt deviceId:%s descriptorId:%s", new Object[] { str1, str2 });
      this.fLU.onDescriptorWrite(paramBluetoothGatt, paramBluetoothGattDescriptor, paramInt);
      return;
      str1 = "";
      break;
    }
  }
  
  public final void onMtuChanged(BluetoothGatt paramBluetoothGatt, int paramInt1, int paramInt2)
  {
    if (paramBluetoothGatt != null) {}
    for (String str = paramBluetoothGatt.getDevice().getAddress();; str = "")
    {
      com.tencent.mm.plugin.appbrand.jsapi.bluetooth.ble.sdk.d.a.i("MicroMsg.Ble.BleConnectWorker", "[onMtuChanged]gatt deviceId:%s mtu:%d status:%s", new Object[] { str, Integer.valueOf(paramInt1), f.kC(paramInt2) });
      this.fLU.onMtuChanged(paramBluetoothGatt, paramInt1, paramInt2);
      return;
    }
  }
  
  public final void onReadRemoteRssi(BluetoothGatt paramBluetoothGatt, int paramInt1, int paramInt2)
  {
    if (paramBluetoothGatt != null) {}
    for (String str = paramBluetoothGatt.getDevice().getAddress();; str = "")
    {
      com.tencent.mm.plugin.appbrand.jsapi.bluetooth.ble.sdk.d.a.i("MicroMsg.Ble.BleConnectWorker", "[onReadRemoteRssi]gatt deviceId:%s rssi:%d status:%s", new Object[] { str, Integer.valueOf(paramInt1), f.kC(paramInt2) });
      this.fLU.onReadRemoteRssi(paramBluetoothGatt, paramInt1, paramInt2);
      return;
    }
  }
  
  public final void onReliableWriteCompleted(BluetoothGatt paramBluetoothGatt, int paramInt)
  {
    if (paramBluetoothGatt != null) {}
    for (String str = paramBluetoothGatt.getDevice().getAddress();; str = "")
    {
      com.tencent.mm.plugin.appbrand.jsapi.bluetooth.ble.sdk.d.a.i("MicroMsg.Ble.BleConnectWorker", "[onReliableWriteCompleted]gatt deviceId:%s status:%s", new Object[] { str, f.kC(paramInt) });
      this.fLU.onReliableWriteCompleted(paramBluetoothGatt, paramInt);
      return;
    }
  }
  
  public final void onServicesDiscovered(BluetoothGatt paramBluetoothGatt, int paramInt)
  {
    if (paramBluetoothGatt != null) {}
    for (String str = paramBluetoothGatt.getDevice().getAddress();; str = "")
    {
      com.tencent.mm.plugin.appbrand.jsapi.bluetooth.ble.sdk.d.a.i("MicroMsg.Ble.BleConnectWorker", "[onServicesDiscovered]gatt deviceId:%s status:%s", new Object[] { str, f.kC(paramInt) });
      this.fLU.onServicesDiscovered(paramBluetoothGatt, paramInt);
      return;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/bluetooth/ble/sdk/a/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */