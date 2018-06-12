package com.tencent.mm.plugin.appbrand.jsapi.bluetooth.ble.sdk.a;

import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;

public abstract interface e
{
  public abstract void onCharacteristicChanged(BluetoothGatt paramBluetoothGatt, BluetoothGattCharacteristic paramBluetoothGattCharacteristic);
  
  public abstract void onCharacteristicRead(BluetoothGatt paramBluetoothGatt, BluetoothGattCharacteristic paramBluetoothGattCharacteristic, int paramInt);
  
  public abstract void onCharacteristicWrite(BluetoothGatt paramBluetoothGatt, BluetoothGattCharacteristic paramBluetoothGattCharacteristic, int paramInt);
  
  public abstract void onConnectionStateChange(BluetoothGatt paramBluetoothGatt, int paramInt1, int paramInt2);
  
  public abstract void onDescriptorRead(BluetoothGatt paramBluetoothGatt, BluetoothGattDescriptor paramBluetoothGattDescriptor, int paramInt);
  
  public abstract void onDescriptorWrite(BluetoothGatt paramBluetoothGatt, BluetoothGattDescriptor paramBluetoothGattDescriptor, int paramInt);
  
  public abstract void onMtuChanged(BluetoothGatt paramBluetoothGatt, int paramInt1, int paramInt2);
  
  public abstract void onReadRemoteRssi(BluetoothGatt paramBluetoothGatt, int paramInt1, int paramInt2);
  
  public abstract void onReliableWriteCompleted(BluetoothGatt paramBluetoothGatt, int paramInt);
  
  public abstract void onServicesDiscovered(BluetoothGatt paramBluetoothGatt, int paramInt);
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/bluetooth/ble/sdk/a/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */