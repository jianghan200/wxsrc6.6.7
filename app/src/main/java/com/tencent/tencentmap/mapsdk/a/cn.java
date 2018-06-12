package com.tencent.tencentmap.mapsdk.a;

public final class cn
  extends cx
{
  private static byte[] m;
  public byte a = 0;
  public String b = "";
  public String c = "";
  public String d = "";
  public String e = "";
  public int f = 0;
  public byte[] g = null;
  public byte h = 0;
  public byte i = 0;
  public String j = "";
  public String k = "";
  public String l = "";
  
  public final void a(cv paramcv)
  {
    this.a = paramcv.a(this.a, 0, true);
    this.b = paramcv.a(1, true);
    this.c = paramcv.a(2, true);
    this.d = paramcv.a(3, true);
    this.e = paramcv.a(4, true);
    this.f = paramcv.a(this.f, 5, true);
    if (m == null)
    {
      byte[] arrayOfByte = (byte[])new byte[1];
      m = arrayOfByte;
      ((byte[])arrayOfByte)[0] = 0;
    }
    this.g = ((byte[])paramcv.b(6, true));
    this.h = paramcv.a(this.h, 7, true);
    this.i = paramcv.a(this.i, 8, true);
    this.j = paramcv.a(9, false);
    this.k = paramcv.a(10, false);
    this.l = paramcv.a(11, false);
  }
  
  public final void a(cw paramcw)
  {
    paramcw.a(this.a, 0);
    paramcw.a(this.b, 1);
    paramcw.a(this.c, 2);
    paramcw.a(this.d, 3);
    paramcw.a(this.e, 4);
    paramcw.a(this.f, 5);
    paramcw.a(this.g, 6);
    paramcw.a(this.h, 7);
    paramcw.a(this.i, 8);
    if (this.j != null) {
      paramcw.a(this.j, 9);
    }
    if (this.k != null) {
      paramcw.a(this.k, 10);
    }
    if (this.l != null) {
      paramcw.a(this.l, 11);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/cn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */