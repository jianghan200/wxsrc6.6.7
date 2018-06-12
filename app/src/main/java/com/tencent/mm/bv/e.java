package com.tencent.mm.bv;

public final class e
{
  public static byte[] bF(byte[] paramArrayOfByte)
  {
    int i = 0;
    while (i < paramArrayOfByte.length)
    {
      paramArrayOfByte[i] = ((byte)(paramArrayOfByte[i] ^ 0x12));
      i += 1;
    }
    return paramArrayOfByte;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/bv/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */