package com.tencent.tencentmap.mapsdk.a;

public final class fg
  extends gc
{
  private static fm g;
  public int a = 0;
  public int b = 0;
  public int c = 0;
  public int d = 0;
  public int e = 0;
  public fm f = null;
  
  public final void a(ga paramga)
  {
    this.a = paramga.a(this.a, 0, false);
    this.b = paramga.a(this.b, 1, false);
    this.c = paramga.a(this.c, 2, false);
    this.d = paramga.a(this.d, 3, false);
    this.e = paramga.a(this.e, 4, false);
    if (g == null) {
      g = new fm();
    }
    this.f = ((fm)paramga.a(g, 5, false));
  }
  
  public final void a(gb paramgb)
  {
    paramgb.a(this.a, 0);
    paramgb.a(this.b, 1);
    paramgb.a(this.c, 2);
    paramgb.a(this.d, 3);
    paramgb.a(this.e, 4);
    if (this.f != null) {
      paramgb.a(this.f, 5);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/fg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */