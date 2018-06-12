package com.tencent.mm.plugin.appbrand.jsapi.bluetooth.ble.sdk.a.a;

import android.annotation.TargetApi;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.bluetooth.BluetoothGattService;
import com.tencent.mm.plugin.appbrand.jsapi.bluetooth.ble.sdk.a.d;
import com.tencent.mm.plugin.appbrand.jsapi.bluetooth.ble.sdk.c.f;
import com.tencent.mm.plugin.appbrand.jsapi.bluetooth.ble.sdk.c.j;
import com.tencent.mm.plugin.appbrand.jsapi.bluetooth.ble.sdk.d.b;
import java.util.UUID;

@TargetApi(18)
public final class c
  extends com.tencent.mm.plugin.appbrand.jsapi.bluetooth.ble.sdk.c.a
{
  private final boolean bKe;
  private final String fLY;
  private final String fLZ;
  
  public c(String paramString1, String paramString2, boolean paramBoolean)
  {
    this.fLY = paramString1;
    this.fLZ = paramString2;
    this.bKe = paramBoolean;
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
    if (!b.kI(((BluetoothGattCharacteristic)localObject).getProperties()))
    {
      com.tencent.mm.plugin.appbrand.jsapi.bluetooth.ble.sdk.d.a.e("MicroMsg.Ble.Action", "action:%s, not support indicate", new Object[] { this });
      a(j.fME);
      done();
      return;
    }
    if (!localBluetoothGatt.setCharacteristicNotification((BluetoothGattCharacteristic)localObject, this.bKe))
    {
      com.tencent.mm.plugin.appbrand.jsapi.bluetooth.ble.sdk.d.a.e("MicroMsg.Ble.Action", "action:%s bluetoothGatt.setCharacteristicNotification fail", new Object[] { this });
      a(j.fMF);
      done();
      return;
    }
    BluetoothGattDescriptor localBluetoothGattDescriptor = ((BluetoothGattCharacteristic)localObject).getDescriptor(com.tencent.mm.plugin.appbrand.jsapi.bluetooth.ble.sdk.b.a.fMa);
    if (localBluetoothGattDescriptor == null)
    {
      com.tencent.mm.plugin.appbrand.jsapi.bluetooth.ble.sdk.d.a.e("MicroMsg.Ble.Action", "action:%s gattCharacteristic.getDescriptor fail", new Object[] { this });
      a(j.fMH);
      done();
      return;
    }
    if (this.bKe) {}
    for (localObject = BluetoothGattDescriptor.ENABLE_INDICATION_VALUE; !localBluetoothGattDescriptor.setValue((byte[])localObject); localObject = BluetoothGattDescriptor.DISABLE_NOTIFICATION_VALUE)
    {
      com.tencent.mm.plugin.appbrand.jsapi.bluetooth.ble.sdk.d.a.e("MicroMsg.Ble.Action", "action:%s gattDescriptor.setValue fail", new Object[] { this });
      a(j.fMI);
      done();
      return;
    }
    if (!localBluetoothGatt.writeDescriptor(localBluetoothGattDescriptor))
    {
      com.tencent.mm.plugin.appbrand.jsapi.bluetooth.ble.sdk.d.a.e("MicroMsg.Ble.Action", "action:%s bluetoothGatt.writeDescriptor fail", new Object[] { this });
      a(j.fMJ);
      done();
      return;
    }
    a(j.fMv);
  }
  
  public final String getName()
  {
    return "IndicateCharacteristicAction";
  }
  
  public final void onDescriptorWrite(BluetoothGatt paramBluetoothGatt, BluetoothGattDescriptor paramBluetoothGattDescriptor, int paramInt)
  {
    com.tencent.mm.plugin.appbrand.jsapi.bluetooth.ble.sdk.d.a.i("MicroMsg.Ble.Action", "action:%s onDescriptorWrite status:%s", new Object[] { this, f.kC(paramInt) });
    done();
  }
  
  public final String toString()
  {
    return "IndicateCharacteristicAction{serviceId='" + this.fLY + '\'' + ", characteristicId='" + this.fLZ + '\'' + ", enable=" + this.bKe + ", debug=" + this.Zq + ", mainThread=" + this.fLy + ", serial=" + this.fLA + '}';
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/bluetooth/ble/sdk/a/a/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */