package com.tencent.mm.plugin.appbrand.jsapi.bluetooth.ble.sdk.a.a;

import android.annotation.TargetApi;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattService;
import com.tencent.mm.plugin.appbrand.jsapi.bluetooth.ble.sdk.a.d;
import com.tencent.mm.plugin.appbrand.jsapi.bluetooth.ble.sdk.c.f;
import com.tencent.mm.plugin.appbrand.jsapi.bluetooth.ble.sdk.c.j;
import com.tencent.mm.plugin.appbrand.jsapi.bluetooth.ble.sdk.d.b;
import java.util.UUID;

@TargetApi(18)
public final class e
  extends com.tencent.mm.plugin.appbrand.jsapi.bluetooth.ble.sdk.c.a
{
  private final String fLY;
  private final String fLZ;
  
  public e(String paramString1, String paramString2)
  {
    this.fLY = paramString1;
    this.fLZ = paramString2;
  }
  
  public final void aiu()
  {
    BluetoothGatt localBluetoothGatt = this.fMb.fLV;
    if (localBluetoothGatt == null)
    {
      com.tencent.mm.plugin.appbrand.jsapi.bluetooth.ble.sdk.d.a.e("MicroMsg.Ble.Action", "action:%s, bluetoothGatt is null", new Object[] { this });
      a(j.fMD);
      done();
      return;
    }
    if (!b.tv(this.fLY))
    {
      com.tencent.mm.plugin.appbrand.jsapi.bluetooth.ble.sdk.d.a.e("MicroMsg.Ble.Action", "action:%s, serviceId is illegal", new Object[] { this });
      a(j.fMB);
      done();
      return;
    }
    Object localObject = localBluetoothGatt.getService(UUID.fromString(this.fLY));
    if (localObject == null)
    {
      com.tencent.mm.plugin.appbrand.jsapi.bluetooth.ble.sdk.d.a.e("MicroMsg.Ble.Action", "action:%s, gattService is null", new Object[] { this });
      a(j.fMB);
      done();
      return;
    }
    if (!b.tv(this.fLZ))
    {
      com.tencent.mm.plugin.appbrand.jsapi.bluetooth.ble.sdk.d.a.e("MicroMsg.Ble.Action", "action:%s, characteristicId is illegal", new Object[] { this });
      a(j.fMC);
      done();
      return;
    }
    localObject = ((BluetoothGattService)localObject).getCharacteristic(UUID.fromString(this.fLZ));
    if (localObject == null)
    {
      com.tencent.mm.plugin.appbrand.jsapi.bluetooth.ble.sdk.d.a.e("MicroMsg.Ble.Action", "action:%s, gattCharacteristic is null", new Object[] { this });
      a(j.fMC);
      done();
      return;
    }
    if (!b.kE(((BluetoothGattCharacteristic)localObject).getProperties()))
    {
      com.tencent.mm.plugin.appbrand.jsapi.bluetooth.ble.sdk.d.a.e("MicroMsg.Ble.Action", "action:%s, not support read", new Object[] { this });
      a(j.fME);
      done();
      return;
    }
    if (!localBluetoothGatt.readCharacteristic((BluetoothGattCharacteristic)localObject))
    {
      com.tencent.mm.plugin.appbrand.jsapi.bluetooth.ble.sdk.d.a.e("MicroMsg.Ble.Action", "action:%s bluetoothGatt.readCharacteristic fail", new Object[] { this });
      a(j.fMF);
      done();
      return;
    }
    a(j.fMv);
  }
  
  public final String getName()
  {
    return "ReadCharacteristicAction";
  }
  
  public final void onCharacteristicRead(BluetoothGatt paramBluetoothGatt, BluetoothGattCharacteristic paramBluetoothGattCharacteristic, int paramInt)
  {
    com.tencent.mm.plugin.appbrand.jsapi.bluetooth.ble.sdk.d.a.i("MicroMsg.Ble.Action", "action:%s onCharacteristicRead status:%s", new Object[] { this, f.kC(paramInt) });
    done();
  }
  
  public final String toString()
  {
    return "ReadCharacteristicAction{serviceId='" + this.fLY + '\'' + ", characteristicId='" + this.fLZ + '\'' + ", debug=" + this.Zq + ", mainThread=" + this.fLy + ", serial=" + this.fLA + '}';
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/bluetooth/ble/sdk/a/a/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */