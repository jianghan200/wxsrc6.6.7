package com.google.android.gms.c;

import java.util.Arrays;

final class bg
{
  final byte[] bak;
  final int tag;
  
  bg(int paramInt, byte[] paramArrayOfByte)
  {
    this.tag = paramInt;
    this.bak = paramArrayOfByte;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (paramObject == this) {}
    do
    {
      return true;
      if (!(paramObject instanceof bg)) {
        return false;
      }
      paramObject = (bg)paramObject;
    } while ((this.tag == ((bg)paramObject).tag) && (Arrays.equals(this.bak, ((bg)paramObject).bak)));
    return false;
  }
  
  public final int hashCode()
  {
    return (this.tag + 527) * 31 + Arrays.hashCode(this.bak);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/google/android/gms/c/bg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */