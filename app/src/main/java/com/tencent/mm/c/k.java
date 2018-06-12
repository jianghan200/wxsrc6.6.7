package com.tencent.mm.c;

public final class k
  implements Cloneable
{
  long value;
  
  public k(long paramLong)
  {
    this.value = paramLong;
  }
  
  public k(byte[] paramArrayOfByte)
  {
    this(paramArrayOfByte, (byte)0);
  }
  
  private k(byte[] paramArrayOfByte, byte paramByte)
  {
    this.value = (paramArrayOfByte[3] << 24 & 0xFF000000);
    this.value += (paramArrayOfByte[2] << 16 & 0xFF0000);
    this.value += (paramArrayOfByte[1] << 8 & 0xFF00);
    this.value += (paramArrayOfByte[0] & 0xFF);
  }
  
  public final boolean equals(Object paramObject)
  {
    if ((paramObject == null) || (!(paramObject instanceof k))) {}
    while (this.value != ((k)paramObject).value) {
      return false;
    }
    return true;
  }
  
  public final byte[] getBytes()
  {
    return new byte[] { (byte)(int)(this.value & 0xFF), (byte)(int)((this.value & 0xFF00) >> 8), (byte)(int)((this.value & 0xFF0000) >> 16), (byte)(int)((this.value & 0xFF000000) >> 24) };
  }
  
  public final int hashCode()
  {
    return (int)this.value;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/c/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */