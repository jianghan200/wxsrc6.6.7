package com.tencent.mm.plugin.h.a.b;

import android.bluetooth.BluetoothGattCharacteristic;

public final class a
{
  private byte[] hfA = null;
  private int hfB = 0;
  private int hfC = 0;
  BluetoothGattCharacteristic hfD = null;
  private int hfz = 20;
  
  public final byte[] atL()
  {
    int i = this.hfC - this.hfB;
    if (i == 0) {
      return null;
    }
    if (i < this.hfz) {}
    for (;;)
    {
      byte[] arrayOfByte = new byte[i];
      System.arraycopy(this.hfA, this.hfB, arrayOfByte, 0, i);
      this.hfB = (i + this.hfB);
      return arrayOfByte;
      i = this.hfz;
    }
  }
  
  public final void setData(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte == null)
    {
      this.hfA = null;
      this.hfC = 0;
      this.hfB = 0;
      return;
    }
    this.hfA = new byte[paramArrayOfByte.length];
    System.arraycopy(paramArrayOfByte, 0, this.hfA, 0, paramArrayOfByte.length);
    this.hfC = paramArrayOfByte.length;
    this.hfB = 0;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/h/a/b/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */