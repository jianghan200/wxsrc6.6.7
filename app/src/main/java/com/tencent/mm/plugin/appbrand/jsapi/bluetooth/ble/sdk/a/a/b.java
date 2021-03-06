package com.tencent.mm.plugin.appbrand.jsapi.bluetooth.ble.sdk.a.a;

import android.annotation.TargetApi;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.os.Looper;
import com.tencent.mm.plugin.appbrand.jsapi.bluetooth.ble.sdk.a.d;
import com.tencent.mm.plugin.appbrand.jsapi.bluetooth.ble.sdk.c.f;
import com.tencent.mm.plugin.appbrand.jsapi.bluetooth.ble.sdk.c.j;

@TargetApi(18)
public final class b
  extends com.tencent.mm.plugin.appbrand.jsapi.bluetooth.ble.sdk.c.a
{
  public String byN;
  
  public b(String paramString)
  {
    this.byN = paramString;
  }
  
  public final void aiu()
  {
    boolean bool2 = false;
    boolean bool1 = false;
    Object localObject = com.tencent.mm.plugin.appbrand.jsapi.bluetooth.ble.sdk.d.b.aiA();
    if (localObject == null)
    {
      com.tencent.mm.plugin.appbrand.jsapi.bluetooth.ble.sdk.d.a.e("MicroMsg.Ble.ConnectAction", "action:%s, bluetoothGatt is null", new Object[] { this });
      a(j.fMD);
      done();
      return;
    }
    if ((this.byN == null) || (!BluetoothAdapter.checkBluetoothAddress(this.byN)))
    {
      com.tencent.mm.plugin.appbrand.jsapi.bluetooth.ble.sdk.d.a.w("MicroMsg.Ble.ConnectAction", "action:%s, unspecified deviceId", new Object[] { this });
      a(j.fMw);
      done();
      return;
    }
    if (!com.tencent.mm.plugin.appbrand.jsapi.bluetooth.ble.sdk.d.b.aiB())
    {
      com.tencent.mm.plugin.appbrand.jsapi.bluetooth.ble.sdk.d.a.e("MicroMsg.Ble.ConnectAction", "bluetooth is not enable.", new Object[0]);
      a(j.fMy);
      done();
      return;
    }
    if (this.fMb.fLV != null)
    {
      com.tencent.mm.plugin.appbrand.jsapi.bluetooth.ble.sdk.d.a.w("MicroMsg.Ble.ConnectAction", "already connect, please close", new Object[0]);
      a(j.fML);
      done();
      return;
    }
    localObject = ((BluetoothAdapter)localObject).getRemoteDevice(this.byN);
    if (localObject != null)
    {
      localObject = ((BluetoothDevice)localObject).connectGatt(this.fMb.context, false, new com.tencent.mm.plugin.appbrand.jsapi.bluetooth.ble.sdk.a.a(this.fMb));
      if (localObject != null)
      {
        String str = this.byN;
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
          bool1 = true;
        }
        com.tencent.mm.plugin.appbrand.jsapi.bluetooth.ble.sdk.d.a.i("MicroMsg.Ble.ConnectAction", "create a new connection deviceId=%s mainthread:%b", new Object[] { str, Boolean.valueOf(bool1) });
        this.fMb.fLV = ((BluetoothGatt)localObject);
        return;
      }
      localObject = this.byN;
      bool1 = bool2;
      if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
        bool1 = true;
      }
      com.tencent.mm.plugin.appbrand.jsapi.bluetooth.ble.sdk.d.a.e("MicroMsg.Ble.ConnectAction", "Get Gatt fail!, deviceId=%s mainthread:%b", new Object[] { localObject, Boolean.valueOf(bool1) });
    }
    for (;;)
    {
      a(j.fMw);
      done();
      return;
      com.tencent.mm.plugin.appbrand.jsapi.bluetooth.ble.sdk.d.a.e("MicroMsg.Ble.ConnectAction", "Device not found, deviceId=%s", new Object[] { this.byN });
    }
  }
  
  public final void b(j paramj)
  {
    switch (b.1.fLf[paramj.ordinal()])
    {
    default: 
      return;
    }
    this.fMb.cM(false);
  }
  
  public final String getName()
  {
    return "ConnectAction";
  }
  
  public final void onConnectionStateChange(BluetoothGatt paramBluetoothGatt, int paramInt1, int paramInt2)
  {
    String str1;
    String str2;
    if (paramBluetoothGatt != null)
    {
      str1 = paramBluetoothGatt.toString();
      String str3 = f.kC(paramInt1);
      if (paramInt2 != 2) {
        break label80;
      }
      str2 = "CONNECTED";
      label25:
      com.tencent.mm.plugin.appbrand.jsapi.bluetooth.ble.sdk.d.a.i("MicroMsg.Ble.ConnectAction", "[onConnectionStateChange]gatt:%s gattStatus:%s, newState:%s", new Object[] { str1, str3, str2 });
      if (paramInt2 != 2) {
        break label87;
      }
      com.tencent.mm.plugin.appbrand.jsapi.bluetooth.ble.sdk.d.a.i("MicroMsg.Ble.ConnectAction", "Attempting to start service discovery", new Object[0]);
      paramBluetoothGatt.discoverServices();
    }
    label80:
    label87:
    while (paramInt2 != 0)
    {
      return;
      str1 = "";
      break;
      str2 = "DISCONNECTED";
      break label25;
    }
    com.tencent.mm.plugin.appbrand.jsapi.bluetooth.ble.sdk.d.a.i("MicroMsg.Ble.ConnectAction", "close", new Object[0]);
    paramBluetoothGatt.close();
    a(j.fMD);
  }
  
  public final void onServicesDiscovered(BluetoothGatt paramBluetoothGatt, int paramInt)
  {
    com.tencent.mm.plugin.appbrand.jsapi.bluetooth.ble.sdk.d.a.i("MicroMsg.Ble.ConnectAction", "[onServicesDiscovered] status:%s", new Object[] { f.kC(paramInt) });
    if (paramInt == 0) {
      a(j.fMv);
    }
    for (;;)
    {
      done();
      return;
      a(j.fMD);
    }
  }
  
  public final String toString()
  {
    return "ConnectAction{deviceId='" + this.byN + '\'' + ", debug=" + this.Zq + ", mainThread=" + this.fLy + ", serial=" + this.fLA + '}';
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/bluetooth/ble/sdk/a/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */