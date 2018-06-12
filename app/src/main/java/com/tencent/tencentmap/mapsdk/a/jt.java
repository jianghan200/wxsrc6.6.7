package com.tencent.tencentmap.mapsdk.a;

public final class jt
  extends mf
{
  static byte[] h;
  public String a = "";
  public int b = 0;
  public int c = 0;
  public int d = 0;
  public int e = 0;
  public byte[] f = null;
  public String g = "";
  
  static
  {
    byte[] arrayOfByte = (byte[])new byte[1];
    h = arrayOfByte;
    ((byte[])arrayOfByte)[0] = 0;
  }
  
  public final void readFrom(md parammd)
  {
    this.a = parammd.a(0, true);
    this.b = parammd.a(this.b, 1, true);
    this.c = parammd.a(this.c, 2, false);
    this.d = parammd.a(this.d, 3, false);
    this.e = parammd.a(this.e, 4, false);
    this.f = ((byte[])parammd.a(h, 5, false));
    this.g = parammd.a(6, false);
  }
  
  public final void writeTo(me paramme)
  {
    paramme.a(this.a, 0);
    paramme.a(this.b, 1);
    paramme.a(this.c, 2);
    paramme.a(this.d, 3);
    paramme.a(this.e, 4);
    if (this.f != null) {
      paramme.a(this.f, 5);
    }
    if (this.g != null) {
      paramme.a(this.g, 6);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/jt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */