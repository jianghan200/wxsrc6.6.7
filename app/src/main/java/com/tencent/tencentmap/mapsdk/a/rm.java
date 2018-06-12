package com.tencent.tencentmap.mapsdk.a;

public final class rm
  extends rl
{
  private ru d;
  private ru e;
  private double f;
  private double g;
  
  public rm(sl paramsl, ru paramru, long paramLong, tt paramtt)
  {
    super(paramsl, paramLong, paramtt);
    this.e = paramru;
  }
  
  protected final void a(float paramFloat)
  {
    double d1 = this.f;
    double d2 = paramFloat;
    double d3 = this.g;
    double d4 = paramFloat;
    this.d.b(d1 * d2 + this.d.b());
    this.d.a(d3 * d4 + this.d.a());
    this.b.b(this.d);
  }
  
  protected final void c()
  {
    this.d = this.b.b();
    this.f = (this.e.b() - this.d.b());
    this.g = (this.e.a() - this.d.a());
  }
  
  protected final void d()
  {
    this.b.b(this.e);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/rm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */