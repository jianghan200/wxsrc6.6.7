package com.google.a.a;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

public final class b
{
  private final byte[] buffer;
  final int limit;
  int position;
  
  b(byte[] paramArrayOfByte, int paramInt)
  {
    this.buffer = paramArrayOfByte;
    this.position = 0;
    this.limit = (paramInt + 0);
  }
  
  public static int aG(int paramInt1, int paramInt2)
  {
    return ec(paramInt1) + ea(paramInt2);
  }
  
  public static int aH(int paramInt1, int paramInt2)
  {
    return ec(paramInt1) + ee(paramInt2);
  }
  
  private void aI(int paramInt1, int paramInt2)
  {
    ed(g.aJ(paramInt1, paramInt2));
  }
  
  private void ag(long paramLong)
  {
    for (;;)
    {
      if ((0xFFFFFFFFFFFFFF80 & paramLong) == 0L)
      {
        eb((int)paramLong);
        return;
      }
      eb((int)paramLong & 0x7F | 0x80);
      paramLong >>>= 7;
    }
  }
  
  private static int ah(long paramLong)
  {
    if ((0xFFFFFFFFFFFFFF80 & paramLong) == 0L) {
      return 1;
    }
    if ((0xFFFFFFFFFFFFC000 & paramLong) == 0L) {
      return 2;
    }
    if ((0xFFFFFFFFFFE00000 & paramLong) == 0L) {
      return 3;
    }
    if ((0xFFFFFFFFF0000000 & paramLong) == 0L) {
      return 4;
    }
    if ((0xFFFFFFF800000000 & paramLong) == 0L) {
      return 5;
    }
    if ((0xFFFFFC0000000000 & paramLong) == 0L) {
      return 6;
    }
    if ((0xFFFE000000000000 & paramLong) == 0L) {
      return 7;
    }
    if ((0xFF00000000000000 & paramLong) == 0L) {
      return 8;
    }
    if ((0x8000000000000000 & paramLong) == 0L) {
      return 9;
    }
    return 10;
  }
  
  public static int b(int paramInt, e parame)
  {
    paramInt = ec(paramInt);
    int i = parame.sk();
    return paramInt + (i + ee(i));
  }
  
  public static int bE(String paramString)
  {
    try
    {
      paramString = paramString.getBytes("UTF-8");
      int i = ee(paramString.length);
      int j = paramString.length;
      return j + i;
    }
    catch (UnsupportedEncodingException paramString)
    {
      throw new RuntimeException("UTF-8 not supported.");
    }
  }
  
  public static int c(int paramInt, byte[] paramArrayOfByte)
  {
    return ec(paramInt) + (ee(paramArrayOfByte.length) + paramArrayOfByte.length);
  }
  
  public static int ea(int paramInt)
  {
    if (paramInt >= 0) {
      return ee(paramInt);
    }
    return 10;
  }
  
  private void eb(int paramInt)
  {
    int i = (byte)paramInt;
    if (this.position == this.limit) {
      throw new a(this.position, this.limit);
    }
    byte[] arrayOfByte = this.buffer;
    paramInt = this.position;
    this.position = (paramInt + 1);
    arrayOfByte[paramInt] = i;
  }
  
  private static int ec(int paramInt)
  {
    return ee(g.aJ(paramInt, 0));
  }
  
  private void ed(int paramInt)
  {
    for (;;)
    {
      if ((paramInt & 0xFFFFFF80) == 0)
      {
        eb(paramInt);
        return;
      }
      eb(paramInt & 0x7F | 0x80);
      paramInt >>>= 7;
    }
  }
  
  public static int ee(int paramInt)
  {
    if ((paramInt & 0xFFFFFF80) == 0) {
      return 1;
    }
    if ((paramInt & 0xC000) == 0) {
      return 2;
    }
    if ((0xFFE00000 & paramInt) == 0) {
      return 3;
    }
    if ((0xF0000000 & paramInt) == 0) {
      return 4;
    }
    return 5;
  }
  
  public static int h(int paramInt, String paramString)
  {
    return ec(paramInt) + bE(paramString);
  }
  
  public static int k(int paramInt, long paramLong)
  {
    return ec(paramInt) + ah(paramLong);
  }
  
  public static int l(int paramInt, long paramLong)
  {
    return ec(paramInt) + ah(paramLong);
  }
  
  private void p(byte[] paramArrayOfByte)
  {
    int i = paramArrayOfByte.length;
    if (this.limit - this.position >= i)
    {
      System.arraycopy(paramArrayOfByte, 0, this.buffer, this.position, i);
      this.position = (i + this.position);
      return;
    }
    throw new a(this.position, this.limit);
  }
  
  public final void a(int paramInt, e parame)
  {
    aI(paramInt, 2);
    if (parame.bfP < 0) {
      parame.sk();
    }
    ed(parame.bfP);
    parame.a(this);
  }
  
  public final void aE(int paramInt1, int paramInt2)
  {
    aI(paramInt1, 0);
    if (paramInt2 >= 0)
    {
      ed(paramInt2);
      return;
    }
    ag(paramInt2);
  }
  
  public final void aF(int paramInt1, int paramInt2)
  {
    aI(paramInt1, 0);
    ed(paramInt2);
  }
  
  public final void b(int paramInt, byte[] paramArrayOfByte)
  {
    aI(paramInt, 2);
    ed(paramArrayOfByte.length);
    p(paramArrayOfByte);
  }
  
  public final void g(int paramInt, String paramString)
  {
    aI(paramInt, 2);
    paramString = paramString.getBytes("UTF-8");
    ed(paramString.length);
    p(paramString);
  }
  
  public final void i(int paramInt, long paramLong)
  {
    aI(paramInt, 0);
    ag(paramLong);
  }
  
  public final void j(int paramInt, long paramLong)
  {
    aI(paramInt, 0);
    ag(paramLong);
  }
  
  public static final class a
    extends IOException
  {
    a(int paramInt1, int paramInt2)
    {
      super();
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/google/a/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */