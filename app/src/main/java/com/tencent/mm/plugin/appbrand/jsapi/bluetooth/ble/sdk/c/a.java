package com.tencent.mm.plugin.appbrand.jsapi.bluetooth.ble.sdk.c;

import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.os.Handler;
import android.os.Looper;
import com.tencent.mm.plugin.appbrand.jsapi.bluetooth.ble.sdk.a.d;
import com.tencent.mm.plugin.appbrand.jsapi.bluetooth.ble.sdk.a.e;
import java.util.List;
import junit.framework.Assert;

public abstract class a
  implements e
{
  public boolean Zq = com.tencent.mm.plugin.appbrand.jsapi.bluetooth.ble.sdk.a.fLt.Zq;
  public boolean anR = false;
  public boolean fLA = com.tencent.mm.plugin.appbrand.jsapi.bluetooth.ble.sdk.a.fLt.fLA;
  private final Handler fLN = new Handler(Looper.getMainLooper());
  public boolean fLy = com.tencent.mm.plugin.appbrand.jsapi.bluetooth.ble.sdk.a.fLt.fLy;
  public d fMb;
  protected com.tencent.mm.plugin.appbrand.jsapi.bluetooth.ble.sdk.a.b fMc;
  public b fMd;
  private Runnable fMe = new a.1(this);
  public long fMf = com.tencent.mm.plugin.appbrand.jsapi.bluetooth.ble.sdk.a.fLt.fLv;
  public long fMg = com.tencent.mm.plugin.appbrand.jsapi.bluetooth.ble.sdk.a.fLt.fLE;
  public j fMh;
  
  public final void a(com.tencent.mm.plugin.appbrand.jsapi.bluetooth.ble.sdk.a.b paramb)
  {
    this.fMc = paramb;
  }
  
  public final void a(j paramj)
  {
    this.fMh = paramj;
    if (this.fLy)
    {
      this.fLN.post(new a.2(this, paramj));
      return;
    }
    this.fMd.a(paramj);
  }
  
  public abstract void aiu();
  
  public final void aiv()
  {
    Assert.assertNotNull(this.fMb);
    Assert.assertNotNull(this.fMc);
    Assert.assertNotNull(this.fMd);
    this.fLN.postDelayed(this.fMe, this.fMf);
    aiu();
  }
  
  public void b(j paramj) {}
  
  public final void done()
  {
    this.fLN.removeCallbacks(this.fMe);
    this.anR = true;
    b(this.fMh);
    com.tencent.mm.plugin.appbrand.jsapi.bluetooth.ble.sdk.a.b localb = this.fMc;
    Object localObject = this.fMh;
    if (localObject != null) {}
    for (;;)
    {
      com.tencent.mm.plugin.appbrand.jsapi.bluetooth.ble.sdk.d.a.i("MicroMsg.Ble.BleConnectDispatcher", "actionCompleteCallback action:%s result:%s", new Object[] { this, localObject });
      if (this != null)
      {
        if (!this.fLA) {
          break;
        }
        localb.ait();
      }
      return;
      localObject = "";
    }
    localb.fLM.remove(this);
  }
  
  public abstract String getName();
  
  public final void onCharacteristicChanged(BluetoothGatt paramBluetoothGatt, BluetoothGattCharacteristic paramBluetoothGattCharacteristic) {}
  
  public void onCharacteristicRead(BluetoothGatt paramBluetoothGatt, BluetoothGattCharacteristic paramBluetoothGattCharacteristic, int paramInt) {}
  
  public void onCharacteristicWrite(BluetoothGatt paramBluetoothGatt, BluetoothGattCharacteristic paramBluetoothGattCharacteristic, int paramInt) {}
  
  public void onConnectionStateChange(BluetoothGatt paramBluetoothGatt, int paramInt1, int paramInt2) {}
  
  public final void onDescriptorRead(BluetoothGatt paramBluetoothGatt, BluetoothGattDescriptor paramBluetoothGattDescriptor, int paramInt) {}
  
  public void onDescriptorWrite(BluetoothGatt paramBluetoothGatt, BluetoothGattDescriptor paramBluetoothGattDescriptor, int paramInt) {}
  
  public final void onMtuChanged(BluetoothGatt paramBluetoothGatt, int paramInt1, int paramInt2) {}
  
  public final void onReadRemoteRssi(BluetoothGatt paramBluetoothGatt, int paramInt1, int paramInt2) {}
  
  public final void onReliableWriteCompleted(BluetoothGatt paramBluetoothGatt, int paramInt) {}
  
  public void onServicesDiscovered(BluetoothGatt paramBluetoothGatt, int paramInt) {}
  
  public String toString()
  {
    return "Action{action='" + getName() + '\'' + ", debug=" + this.Zq + ", mainThread=" + this.fLy + ", serial=" + this.fLA + '}';
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/bluetooth/ble/sdk/c/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */