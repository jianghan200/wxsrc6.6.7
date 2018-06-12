package com.tencent.mm.plugin.appbrand.jsapi.bluetooth.ble.sdk.a;

import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.os.Handler;
import android.os.Looper;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;

public final class b
  implements e
{
  public Queue<com.tencent.mm.plugin.appbrand.jsapi.bluetooth.ble.sdk.c.a> fLK;
  com.tencent.mm.plugin.appbrand.jsapi.bluetooth.ble.sdk.c.a fLL;
  public List<com.tencent.mm.plugin.appbrand.jsapi.bluetooth.ble.sdk.c.a> fLM;
  public Handler fLN = new Handler(Looper.getMainLooper());
  
  public final void ait()
  {
    for (;;)
    {
      try
      {
        if (this.fLL != null)
        {
          boolean bool = this.fLL.anR;
          if (!bool) {
            return;
          }
        }
        if ((this.fLK == null) || (this.fLK.size() <= 0)) {
          continue;
        }
        this.fLL = ((com.tencent.mm.plugin.appbrand.jsapi.bluetooth.ble.sdk.c.a)this.fLK.poll());
        if (this.fLL == null)
        {
          com.tencent.mm.plugin.appbrand.jsapi.bluetooth.ble.sdk.d.a.w("MicroMsg.Ble.BleConnectDispatcher", "curSerialAction is null, err", new Object[0]);
          continue;
        }
        if (!this.fLL.fLy) {
          break label121;
        }
      }
      finally {}
      this.fLN.postDelayed(new b.2(this), this.fLL.fMg);
      continue;
      label121:
      this.fLL.aiv();
    }
  }
  
  public final void onCharacteristicChanged(BluetoothGatt paramBluetoothGatt, BluetoothGattCharacteristic paramBluetoothGattCharacteristic)
  {
    if (this.fLM != null)
    {
      paramBluetoothGatt = this.fLM.iterator();
      while (paramBluetoothGatt.hasNext()) {
        paramBluetoothGatt.next();
      }
    }
  }
  
  public final void onCharacteristicRead(BluetoothGatt paramBluetoothGatt, BluetoothGattCharacteristic paramBluetoothGattCharacteristic, int paramInt)
  {
    if (this.fLL != null) {
      this.fLL.onCharacteristicRead(paramBluetoothGatt, paramBluetoothGattCharacteristic, paramInt);
    }
    if (this.fLM != null)
    {
      paramBluetoothGattCharacteristic = this.fLM.iterator();
      while (paramBluetoothGattCharacteristic.hasNext())
      {
        com.tencent.mm.plugin.appbrand.jsapi.bluetooth.ble.sdk.c.a locala = (com.tencent.mm.plugin.appbrand.jsapi.bluetooth.ble.sdk.c.a)paramBluetoothGattCharacteristic.next();
        if (locala.anR) {
          locala.onServicesDiscovered(paramBluetoothGatt, paramInt);
        }
      }
    }
  }
  
  public final void onCharacteristicWrite(BluetoothGatt paramBluetoothGatt, BluetoothGattCharacteristic paramBluetoothGattCharacteristic, int paramInt)
  {
    if (this.fLL != null) {
      this.fLL.onCharacteristicWrite(paramBluetoothGatt, paramBluetoothGattCharacteristic, paramInt);
    }
    if (this.fLM != null)
    {
      Iterator localIterator = this.fLM.iterator();
      while (localIterator.hasNext())
      {
        com.tencent.mm.plugin.appbrand.jsapi.bluetooth.ble.sdk.c.a locala = (com.tencent.mm.plugin.appbrand.jsapi.bluetooth.ble.sdk.c.a)localIterator.next();
        if (locala.anR) {
          locala.onCharacteristicWrite(paramBluetoothGatt, paramBluetoothGattCharacteristic, paramInt);
        }
      }
    }
  }
  
  public final void onConnectionStateChange(BluetoothGatt paramBluetoothGatt, int paramInt1, int paramInt2)
  {
    if (this.fLL != null) {
      this.fLL.onConnectionStateChange(paramBluetoothGatt, paramInt1, paramInt2);
    }
    if (this.fLM != null)
    {
      Iterator localIterator = this.fLM.iterator();
      while (localIterator.hasNext())
      {
        com.tencent.mm.plugin.appbrand.jsapi.bluetooth.ble.sdk.c.a locala = (com.tencent.mm.plugin.appbrand.jsapi.bluetooth.ble.sdk.c.a)localIterator.next();
        if (locala.anR) {
          locala.onConnectionStateChange(paramBluetoothGatt, paramInt1, paramInt2);
        }
      }
    }
  }
  
  public final void onDescriptorRead(BluetoothGatt paramBluetoothGatt, BluetoothGattDescriptor paramBluetoothGattDescriptor, int paramInt)
  {
    if (this.fLM != null)
    {
      paramBluetoothGatt = this.fLM.iterator();
      while (paramBluetoothGatt.hasNext()) {
        paramBluetoothGatt.next();
      }
    }
  }
  
  public final void onDescriptorWrite(BluetoothGatt paramBluetoothGatt, BluetoothGattDescriptor paramBluetoothGattDescriptor, int paramInt)
  {
    if (this.fLL != null) {
      this.fLL.onDescriptorWrite(paramBluetoothGatt, paramBluetoothGattDescriptor, paramInt);
    }
    if (this.fLM != null)
    {
      Iterator localIterator = this.fLM.iterator();
      while (localIterator.hasNext())
      {
        com.tencent.mm.plugin.appbrand.jsapi.bluetooth.ble.sdk.c.a locala = (com.tencent.mm.plugin.appbrand.jsapi.bluetooth.ble.sdk.c.a)localIterator.next();
        if (locala.anR) {
          locala.onDescriptorWrite(paramBluetoothGatt, paramBluetoothGattDescriptor, paramInt);
        }
      }
    }
  }
  
  public final void onMtuChanged(BluetoothGatt paramBluetoothGatt, int paramInt1, int paramInt2)
  {
    if (this.fLM != null)
    {
      paramBluetoothGatt = this.fLM.iterator();
      while (paramBluetoothGatt.hasNext()) {
        paramBluetoothGatt.next();
      }
    }
  }
  
  public final void onReadRemoteRssi(BluetoothGatt paramBluetoothGatt, int paramInt1, int paramInt2)
  {
    if (this.fLM != null)
    {
      Iterator localIterator = this.fLM.iterator();
      while (localIterator.hasNext())
      {
        com.tencent.mm.plugin.appbrand.jsapi.bluetooth.ble.sdk.c.a locala = (com.tencent.mm.plugin.appbrand.jsapi.bluetooth.ble.sdk.c.a)localIterator.next();
        if (locala.anR) {
          locala.onServicesDiscovered(paramBluetoothGatt, paramInt2);
        }
      }
    }
  }
  
  public final void onReliableWriteCompleted(BluetoothGatt paramBluetoothGatt, int paramInt)
  {
    if (this.fLM != null)
    {
      paramBluetoothGatt = this.fLM.iterator();
      while (paramBluetoothGatt.hasNext()) {
        paramBluetoothGatt.next();
      }
    }
  }
  
  public final void onServicesDiscovered(BluetoothGatt paramBluetoothGatt, int paramInt)
  {
    if (this.fLL != null) {
      this.fLL.onServicesDiscovered(paramBluetoothGatt, paramInt);
    }
    if (this.fLM != null)
    {
      Iterator localIterator = this.fLM.iterator();
      while (localIterator.hasNext())
      {
        com.tencent.mm.plugin.appbrand.jsapi.bluetooth.ble.sdk.c.a locala = (com.tencent.mm.plugin.appbrand.jsapi.bluetooth.ble.sdk.c.a)localIterator.next();
        if (locala.anR) {
          locala.onServicesDiscovered(paramBluetoothGatt, paramInt);
        }
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/bluetooth/ble/sdk/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */