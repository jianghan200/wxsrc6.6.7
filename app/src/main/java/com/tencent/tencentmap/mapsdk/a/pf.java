package com.tencent.tencentmap.mapsdk.a;

import java.util.List;

public final class pf
  implements ou
{
  private pg a = null;
  private String b = "";
  private na c = null;
  
  public pf(pg parampg, na paramna, String paramString)
  {
    this.b = paramString;
    this.a = parampg;
    this.c = paramna;
  }
  
  public final List<iw> a()
  {
    return this.c.b(this.b);
  }
  
  public final void a(float paramFloat)
  {
    float f = paramFloat;
    if (paramFloat < 0.0F) {
      f = 1.0F;
    }
    this.c.a(this.b, f);
    this.a.a(f);
  }
  
  public final void a(int paramInt)
  {
    this.c.a(this.b, paramInt);
    this.a.a(paramInt);
  }
  
  public final void a(List<ox> paramList)
  {
    this.c.a(this.b, paramList);
    this.a.a(paramList);
  }
  
  public final void a(boolean paramBoolean)
  {
    this.c.a(this.b, paramBoolean);
    this.a.a(paramBoolean);
  }
  
  public final void b()
  {
    if (this.c == null) {
      return;
    }
    this.c.a(this.b);
  }
  
  public final void b(int paramInt)
  {
    this.c.b(this.b, Math.max(0, paramInt));
    this.a.c(Math.max(0, paramInt));
  }
  
  public final String c()
  {
    return this.b;
  }
  
  public final List<ox> d()
  {
    return this.a.d();
  }
  
  public final float e()
  {
    return this.a.e();
  }
  
  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof pf)) {
      return false;
    }
    paramObject = (pf)paramObject;
    return this.b.equals(((pf)paramObject).b);
  }
  
  public final int f()
  {
    return this.a.f();
  }
  
  public final int g()
  {
    return this.a.h();
  }
  
  public final boolean h()
  {
    return this.a.i();
  }
  
  public final int hashCode()
  {
    return this.b.hashCode();
  }
  
  public final boolean i()
  {
    if (this.a != null) {
      return this.a.t();
    }
    return false;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/pf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */