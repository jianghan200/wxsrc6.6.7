package com.tencent.tencentmap.mapsdk.a;

public final class co
  extends cx
{
  private static byte[] j;
  public byte a = 0;
  public int b = 0;
  public byte[] c = null;
  public String d = "";
  public long e = 0L;
  private byte f = 0;
  private byte g = 0;
  private String h = "";
  private String i = "";
  
  public final void a(cv paramcv)
  {
    this.a = paramcv.a(this.a, 0, true);
    this.b = paramcv.a(this.b, 1, true);
    if (j == null)
    {
      byte[] arrayOfByte = (byte[])new byte[1];
      j = arrayOfByte;
      ((byte[])arrayOfByte)[0] = 0;
    }
    this.c = ((byte[])paramcv.b(2, true));
    this.d = paramcv.a(3, true);
    this.f = paramcv.a(this.f, 4, true);
    this.g = paramcv.a(this.g, 5, true);
    this.e = paramcv.a(this.e, 6, true);
    this.h = paramcv.a(7, false);
    this.i = paramcv.a(8, false);
  }
  
  public final void a(cw paramcw)
  {
    paramcw.a(this.a, 0);
    paramcw.a(this.b, 1);
    paramcw.a(this.c, 2);
    paramcw.a(this.d, 3);
    paramcw.a(this.f, 4);
    paramcw.a(this.g, 5);
    paramcw.a(this.e, 6);
    if (this.h != null) {
      paramcw.a(this.h, 7);
    }
    if (this.i != null) {
      paramcw.a(this.i, 8);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/co.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */