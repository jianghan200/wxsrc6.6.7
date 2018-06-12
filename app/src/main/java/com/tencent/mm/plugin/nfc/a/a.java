package com.tencent.mm.plugin.nfc.a;

import java.io.Serializable;
import java.util.Arrays;

public final class a
  implements Serializable
{
  private byte[] lEV;
  private transient int lEW;
  private transient int lEX;
  private transient int lEY;
  
  public a(String paramString)
  {
    this.lEV = com.tencent.mm.plugin.nfc.d.a.hexStringToByteArray(paramString);
    bjo();
  }
  
  public a(byte[] paramArrayOfByte)
  {
    this.lEV = ((byte[])paramArrayOfByte.clone());
    bjo();
  }
  
  private void bjo()
  {
    int j = 65536;
    int i = 256;
    if (this.lEV.length < 4) {
      throw new IllegalArgumentException("apdu must be at least 4 bytes long");
    }
    if (this.lEV.length == 4) {
      return;
    }
    int k = this.lEV[4] & 0xFF;
    if (this.lEV.length == 5)
    {
      if (k == 0) {}
      for (;;)
      {
        this.lEX = i;
        return;
        i = k;
      }
    }
    if (k != 0)
    {
      if (this.lEV.length == k + 5)
      {
        this.lEW = k;
        this.lEY = 5;
        return;
      }
      if (this.lEV.length == k + 6)
      {
        this.lEW = k;
        this.lEY = 5;
        j = this.lEV[(this.lEV.length - 1)] & 0xFF;
        if (j == 0) {}
        for (;;)
        {
          this.lEX = i;
          return;
          i = j;
        }
      }
      throw new IllegalArgumentException("Invalid APDU: length=" + this.lEV.length + ", b1=" + k);
    }
    if (this.lEV.length < 7) {
      throw new IllegalArgumentException("Invalid APDU: length=" + this.lEV.length + ", b1=" + k);
    }
    int m = (this.lEV[5] & 0xFF) << 8 | this.lEV[6] & 0xFF;
    if (this.lEV.length == 7)
    {
      i = m;
      if (m == 0) {
        i = 65536;
      }
      this.lEX = i;
      return;
    }
    if (m == 0) {
      throw new IllegalArgumentException("Invalid APDU: length=" + this.lEV.length + ", b1=" + k + ", b2||b3=" + m);
    }
    if (this.lEV.length == m + 7)
    {
      this.lEW = m;
      this.lEY = 7;
      return;
    }
    if (this.lEV.length == m + 9)
    {
      this.lEW = m;
      this.lEY = 7;
      i = this.lEV.length - 2;
      k = this.lEV[i];
      i = this.lEV[(i + 1)] & 0xFF | (k & 0xFF) << 8;
      if (i == 0) {
        i = j;
      }
      for (;;)
      {
        this.lEX = i;
        return;
      }
    }
    throw new IllegalArgumentException("Invalid APDU: length=" + this.lEV.length + ", b1=" + k + ", b2||b3=" + m);
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof a)) {
      return false;
    }
    paramObject = (a)paramObject;
    return Arrays.equals(this.lEV, ((a)paramObject).lEV);
  }
  
  public final byte[] getBytes()
  {
    return (byte[])this.lEV.clone();
  }
  
  public final int hashCode()
  {
    return Arrays.hashCode(this.lEV);
  }
  
  public final void tX(int paramInt)
  {
    this.lEX = paramInt;
    this.lEV[(this.lEV.length - 1)] = ((byte)paramInt);
  }
  
  public final String toString()
  {
    return com.tencent.mm.plugin.nfc.d.a.byteArrayToHexString(this.lEV);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/nfc/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */