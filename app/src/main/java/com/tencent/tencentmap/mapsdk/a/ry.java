package com.tencent.tencentmap.mapsdk.a;

public final class ry
  extends rw
{
  private qs d;
  
  public final void a(qs paramqs)
  {
    this.d = paramqs;
  }
  
  public final void a(sl paramsl)
  {
    paramsl = paramsl.c();
    if (this.a) {
      paramsl.a(rv.a(this.d.b()), this.b, this.c);
    }
    for (;;)
    {
      if (this.d.c() > 0.0F) {
        paramsl.b(this.d.c(), false, this.c);
      }
      return;
      paramsl.b(rv.a(this.d.b()));
    }
  }
  
  public final boolean a()
  {
    return false;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/ry.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */