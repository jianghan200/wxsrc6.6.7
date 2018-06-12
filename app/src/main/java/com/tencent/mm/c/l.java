package com.tencent.mm.c;

public final class l
  implements Cloneable
{
  public int value;
  
  public l(int paramInt)
  {
    this.value = paramInt;
  }
  
  public l(byte[] paramArrayOfByte)
  {
    this(paramArrayOfByte, (byte)0);
  }
  
  private l(byte[] paramArrayOfByte, byte paramByte)
  {
    this.value = (paramArrayOfByte[1] << 8 & 0xFF00);
    this.value += (paramArrayOfByte[0] & 0xFF);
  }
  
  public final boolean equals(Object paramObject)
  {
    if ((paramObject == null) || (!(paramObject instanceof l))) {}
    while (this.value != ((l)paramObject).value) {
      return false;
    }
    return true;
  }
  
  public final byte[] getBytes()
  {
    return new byte[] { (byte)(this.value & 0xFF), (byte)((this.value & 0xFF00) >> 8) };
  }
  
  public final int hashCode()
  {
    return this.value;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/c/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */