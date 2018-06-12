package com.tencent.tencentmap.mapsdk.a;

import java.util.List;

public class rc
{
  private final sx a;
  
  public rc(sx paramsx)
  {
    this.a = paramsx;
  }
  
  public void a()
  {
    this.a.i();
  }
  
  public void a(float paramFloat)
  {
    this.a.a(paramFloat);
  }
  
  public void a(int paramInt)
  {
    this.a.a(paramInt);
  }
  
  public void a(List<qw> paramList)
  {
    this.a.a(paramList);
  }
  
  public void a(boolean paramBoolean)
  {
    this.a.b(paramBoolean);
  }
  
  public String b()
  {
    return this.a.j();
  }
  
  public void b(float paramFloat)
  {
    this.a.b(paramFloat);
  }
  
  public void b(boolean paramBoolean)
  {
    if (this.a.d() != paramBoolean)
    {
      List localList = c();
      this.a.c(paramBoolean);
      a(localList);
    }
  }
  
  public List<qw> c()
  {
    return this.a.a();
  }
  
  public void c(boolean paramBoolean)
  {
    this.a.a(paramBoolean);
  }
  
  public float d()
  {
    return this.a.b();
  }
  
  public int e()
  {
    return this.a.e();
  }
  
  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof rc)) {
      return false;
    }
    return this.a.a(((rc)paramObject).a);
  }
  
  public float f()
  {
    return this.a.k();
  }
  
  public boolean g()
  {
    return this.a.l();
  }
  
  public boolean h()
  {
    return this.a.d();
  }
  
  public final int hashCode()
  {
    return this.a.m();
  }
  
  public boolean i()
  {
    return this.a.c();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/rc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */