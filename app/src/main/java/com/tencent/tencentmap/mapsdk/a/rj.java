package com.tencent.tencentmap.mapsdk.a;

public final class rj
{
  private final qx a;
  private final int b;
  private final qw c;
  private final qw d;
  private final qw e;
  private final qw f;
  
  protected rj(int paramInt, qw paramqw1, qw paramqw2, qw paramqw3, qw paramqw4, qx paramqx)
  {
    this.b = paramInt;
    this.d = paramqw1;
    this.c = paramqw2;
    this.f = paramqw3;
    this.e = paramqw4;
    this.a = paramqx;
  }
  
  public rj(qw paramqw1, qw paramqw2, qw paramqw3, qw paramqw4, qx paramqx)
  {
    this(1, paramqw1, paramqw2, paramqw3, paramqw4, paramqx);
  }
  
  public final qw a()
  {
    return this.d;
  }
  
  public final qw b()
  {
    return this.c;
  }
  
  public final qw c()
  {
    return this.f;
  }
  
  public final qw d()
  {
    return this.e;
  }
  
  public final qx e()
  {
    return this.a;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {}
    do
    {
      return true;
      if (!(paramObject instanceof rj)) {
        return false;
      }
      paramObject = (rj)paramObject;
    } while ((a().equals(((rj)paramObject).a())) && (b().equals(((rj)paramObject).b())) && (c().equals(((rj)paramObject).c())) && (d().equals(((rj)paramObject).d())) && (e().equals(((rj)paramObject).e())));
    return false;
  }
  
  public final int hashCode()
  {
    return sz.a(new Object[] { a(), b(), c(), d(), e() });
  }
  
  public final String toString()
  {
    return sz.a(new String[] { sz.a("nearLeft", a()), sz.a("nearRight", b()), sz.a("farLeft", c()), sz.a("farRight", d()), sz.a("latLngBounds", e()) });
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/rj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */