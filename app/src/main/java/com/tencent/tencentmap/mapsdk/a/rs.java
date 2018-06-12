package com.tencent.tencentmap.mapsdk.a;

public final class rs
{
  public static int a = 5;
  private static double b = Math.log(2.0D);
  private int c;
  private double d;
  private double e;
  
  public rs(double paramDouble)
  {
    this.e = paramDouble;
    f();
  }
  
  public rs(int paramInt, double paramDouble)
  {
    this.c = paramInt;
    this.d = paramDouble;
    e();
  }
  
  public static double c(double paramDouble)
  {
    return 156543.0339D / Math.pow(2.0D, paramDouble);
  }
  
  private void e()
  {
    this.e = (Math.log(this.d) / b + this.c);
    new StringBuilder("refreshZoom--zoom=").append(this.e).append(";level=").append(this.c).append(";scale=").append(this.d);
  }
  
  private void f()
  {
    this.c = ((int)this.e);
    this.d = Math.pow(2.0D, this.e - this.c);
    new StringBuilder("refreshLevel--zoom=").append(this.e).append(";level=").append(this.c).append(";scale=").append(this.d);
  }
  
  public final int a()
  {
    return this.c;
  }
  
  public final void a(double paramDouble)
  {
    this.d = paramDouble;
    e();
    f();
  }
  
  public final double b()
  {
    return this.d;
  }
  
  public final void b(double paramDouble)
  {
    this.e = paramDouble;
    f();
  }
  
  public final double c()
  {
    return this.e;
  }
  
  public final double d()
  {
    return c(this.e);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/rs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */