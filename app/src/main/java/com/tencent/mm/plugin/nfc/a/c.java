package com.tencent.mm.plugin.nfc.a;

import com.tencent.mm.plugin.nfc.d.a;
import java.io.Serializable;
import java.util.Arrays;

public final class c
  implements Serializable
{
  public byte[] lEV;
  
  public c(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte == null) {
      throw new IllegalArgumentException("apdu is null");
    }
    paramArrayOfByte = (byte[])paramArrayOfByte.clone();
    if (paramArrayOfByte.length < 2) {
      throw new IllegalArgumentException("apdu must be at least 2 bytes long");
    }
    this.lEV = paramArrayOfByte;
  }
  
  public final void a(c paramc)
  {
    int j = this.lEV.length;
    this.lEV = Arrays.copyOf(this.lEV, this.lEV.length + paramc.lEV.length - 2);
    j -= 2;
    paramc = (byte[])paramc.lEV.clone();
    int m = paramc.length;
    int k = 0;
    while (k < m)
    {
      int i = paramc[k];
      this.lEV[j] = i;
      k += 1;
      j += 1;
    }
  }
  
  public final short bjp()
  {
    return (short)(this.lEV[(this.lEV.length - 2)] & 0xFF);
  }
  
  public final short bjq()
  {
    return (short)(this.lEV[(this.lEV.length - 1)] & 0xFF);
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof c)) {
      return false;
    }
    paramObject = (c)paramObject;
    return Arrays.equals(this.lEV, ((c)paramObject).lEV);
  }
  
  public final int hashCode()
  {
    return Arrays.hashCode(this.lEV);
  }
  
  public final String toString()
  {
    return a.byteArrayToHexString(this.lEV);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/nfc/a/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */