package com.tencent.tencentmap.mapsdk.a;

public final class rz
  extends rw
{
  private float d;
  private float e;
  
  public final void a(float paramFloat)
  {
    this.d = paramFloat;
  }
  
  public final void a(sl paramsl)
  {
    paramsl = paramsl.c();
    if (this.a)
    {
      paramsl.a((int)-this.d, (int)-this.e, this.b, this.c);
      return;
    }
    paramsl.scrollBy((int)-this.d, (int)-this.e);
  }
  
  public final void b(float paramFloat)
  {
    this.e = paramFloat;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/rz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */