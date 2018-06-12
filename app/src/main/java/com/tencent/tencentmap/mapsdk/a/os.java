package com.tencent.tencentmap.mapsdk.a;

public final class os
{
  private ot a = null;
  private String b = "";
  private ns c = null;
  
  public os(ot paramot, ns paramns, String paramString)
  {
    this.b = paramString;
    this.a = paramot;
    this.c = paramns;
  }
  
  public final void a()
  {
    if (this.c == null) {
      return;
    }
    this.c.a(this.b);
  }
  
  public final void a(double paramDouble)
  {
    if (paramDouble < 0.0D) {}
    while (this.c == null) {
      return;
    }
    this.c.a(this.b, paramDouble);
    this.a.a(paramDouble);
  }
  
  public final void a(float paramFloat)
  {
    if (paramFloat < 0.0F) {
      return;
    }
    this.c.a(this.b, paramFloat);
    this.a.a(paramFloat);
  }
  
  public final void a(int paramInt)
  {
    this.c.b(this.b, paramInt);
    this.a.a(paramInt);
  }
  
  public final void a(boolean paramBoolean)
  {
    this.c.a(this.b, paramBoolean);
    this.a.a(paramBoolean);
  }
  
  public final boolean a(ox paramox)
  {
    return ki.c(c(), paramox) < d();
  }
  
  public final String b()
  {
    return this.b;
  }
  
  public final void b(int paramInt)
  {
    this.c.a(this.b, paramInt);
    this.a.b(paramInt);
  }
  
  public final void b(ox paramox)
  {
    if (this.c == null) {
      return;
    }
    this.c.a(this.b, paramox);
    this.a.a(paramox);
  }
  
  public final ox c()
  {
    return new ox(this.a.a().a, this.a.a().b);
  }
  
  public final void c(int paramInt)
  {
    this.c.b(this.b, paramInt);
    this.a.c(paramInt);
  }
  
  public final double d()
  {
    return this.a.b();
  }
  
  public final float e()
  {
    return this.a.c();
  }
  
  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof os)) {
      return false;
    }
    paramObject = (os)paramObject;
    return this.b.equals(((os)paramObject).b);
  }
  
  public final int f()
  {
    return this.a.d();
  }
  
  public final int g()
  {
    return this.a.e();
  }
  
  public final float h()
  {
    return this.a.f();
  }
  
  public final int hashCode()
  {
    return 0;
  }
  
  public final boolean i()
  {
    return this.a.g();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/os.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */