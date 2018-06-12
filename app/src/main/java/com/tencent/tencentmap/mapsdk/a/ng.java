package com.tencent.tencentmap.mapsdk.a;

import java.util.Arrays;

public class ng
{
  private int a;
  private int b;
  private int c;
  private byte[] d = new byte[4];
  
  public int a()
  {
    return this.a;
  }
  
  public void a(byte[] paramArrayOfByte)
  {
    Arrays.fill(this.d, (byte)0);
    System.arraycopy(paramArrayOfByte, 0, this.d, 0, 4);
    this.a = jm.a(this.d);
    System.arraycopy(paramArrayOfByte, 4, this.d, 0, 4);
    this.b = jm.a(this.d);
    System.arraycopy(paramArrayOfByte, 8, this.d, 0, 4);
    this.c = jm.a(this.d);
  }
  
  public int b()
  {
    return this.b;
  }
  
  public int c()
  {
    return this.c;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/ng.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */