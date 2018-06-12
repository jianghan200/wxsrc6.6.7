package com.tencent.mm.plugin.appbrand.jsapi.bluetooth.ble.sdk.a;

import android.annotation.TargetApi;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCallback;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;

@TargetApi(18)
public final class a
  extends BluetoothGattCallback
{
  public e fLJ;
  
  public a(e parame)
  {
    this.fLJ = parame;
  }
  
  public final void onCharacteristicChanged(BluetoothGatt paramBluetoothGatt, BluetoothGattCharacteristic paramBluetoothGattCharacteristic)
  {
    this.fLJ.onCharacteristicChanged(paramBluetoothGatt, paramBluetoothGattCharacteristic);
  }
  
  public final void onCharacteristicRead(BluetoothGatt paramBluetoothGatt, BluetoothGattCharacteristic paramBluetoothGattCharacteristic, int paramInt)
  {
    this.fLJ.onCharacteristicRead(paramBluetoothGatt, paramBluetoothGattCharacteristic, paramInt);
  }
  
  public final void onCharacteristicWrite(BluetoothGatt paramBluetoothGatt, BluetoothGattCharacteristic paramBluetoothGattCharacteristic, int paramInt)
  {
    this.fLJ.onCharacteristicWrite(paramBluetoothGatt, paramBluetoothGattCharacteristic, paramInt);
  }
  
  public final void onConnectionStateChange(BluetoothGatt paramBluetoothGatt, int paramInt1, int paramInt2)
  {
    this.fLJ.onConnectionStateChange(paramBluetoothGatt, paramInt1, paramInt2);
  }
  
  public final void onDescriptorRead(BluetoothGatt paramBluetoothGatt, BluetoothGattDescriptor paramBluetoothGattDescriptor, int paramInt)
  {
    this.fLJ.onDescriptorRead(paramBluetoothGatt, paramBluetoothGattDescriptor, paramInt);
  }
  
  public final void onDescriptorWrite(BluetoothGatt paramBluetoothGatt, BluetoothGattDescriptor paramBluetoothGattDescriptor, int paramInt)
  {
    this.fLJ.onDescriptorWrite(paramBluetoothGatt, paramBluetoothGattDescriptor, paramInt);
  }
  
  public final void onMtuChanged(BluetoothGatt paramBluetoothGatt, int paramInt1, int paramInt2)
  {
    this.fLJ.onMtuChanged(paramBluetoothGatt, paramInt1, paramInt2);
  }
  
  public final void onReadRemoteRssi(BluetoothGatt paramBluetoothGatt, int paramInt1, int paramInt2)
  {
    this.fLJ.onReadRemoteRssi(paramBluetoothGatt, paramInt1, paramInt2);
  }
  
  public final void onReliableWriteCompleted(BluetoothGatt paramBluetoothGatt, int paramInt)
  {
    this.fLJ.onReliableWriteCompleted(paramBluetoothGatt, paramInt);
  }
  
  public final void onServicesDiscovered(BluetoothGatt paramBluetoothGatt, int paramInt)
  {
    this.fLJ.onServicesDiscovered(paramBluetoothGatt, paramInt);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/bluetooth/ble/sdk/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */