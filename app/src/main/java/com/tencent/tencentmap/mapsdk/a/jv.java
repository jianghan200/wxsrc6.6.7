package com.tencent.tencentmap.mapsdk.a;

public final class jv
  extends mf
{
  public String a = "";
  public int b = 0;
  public int c = 0;
  public int d = 0;
  public String e = "";
  public String f = "";
  public int g = 0;
  
  public final void readFrom(md parammd)
  {
    this.a = parammd.a(0, true);
    this.b = parammd.a(this.b, 1, true);
    this.c = parammd.a(this.c, 2, true);
    this.d = parammd.a(this.d, 3, false);
    this.e = parammd.a(4, false);
    this.f = parammd.a(5, false);
    this.g = parammd.a(this.g, 6, false);
  }
  
  public final void writeTo(me paramme)
  {
    paramme.a(this.a, 0);
    paramme.a(this.b, 1);
    paramme.a(this.c, 2);
    paramme.a(this.d, 3);
    if (this.e != null) {
      paramme.a(this.e, 4);
    }
    if (this.f != null) {
      paramme.a(this.f, 5);
    }
    paramme.a(this.g, 6);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/jv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */