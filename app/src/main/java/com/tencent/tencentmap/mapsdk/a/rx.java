package com.tencent.tencentmap.mapsdk.a;

public final class rx
  extends rw
{
  private int d;
  private int e;
  private qx f;
  private int g;
  
  public final void a(int paramInt)
  {
    this.d = paramInt;
  }
  
  public final void a(qx paramqx)
  {
    this.f = paramqx;
  }
  
  public final void a(sl paramsl)
  {
    sh localsh = paramsl.c();
    if (this.e == 0)
    {
      i = localsh.getHeight() - this.g * 2;
      this.e = i;
      if (this.d != 0) {
        break label91;
      }
    }
    label91:
    for (int i = localsh.getWidth() - this.g * 2;; i = this.d - this.g * 2)
    {
      this.d = i;
      if ((this.e != 0) && (this.d != 0)) {
        break label107;
      }
      return;
      i = this.e - this.g * 2;
      break;
    }
    label107:
    Object localObject2 = this.f.c();
    Object localObject1 = this.f.b();
    localObject2 = rv.a((qw)localObject2);
    localObject1 = rv.a((qw)localObject1);
    double d1 = ((ru)localObject2).a() - ((ru)localObject1).a();
    double d3 = ((ru)localObject2).b() - ((ru)localObject1).b();
    float f1;
    if (this.e * 1.0F / this.d < (float)(d1 / d3))
    {
      f1 = (float)(this.e * 156543.0339D / d1);
      paramsl = paramsl.b().a(new rs(0, f1));
      double d2 = ((ru)localObject1).b();
      d3 /= 2.0D;
      double d4 = ((ru)localObject1).a();
      localObject1 = new ru(d3 + d2, d1 / 2.0D + d4);
      if (!this.a) {
        break label321;
      }
      localsh.a((ru)localObject1, this.b, this.c);
    }
    for (;;)
    {
      localsh.b(paramsl.c(), this.a, this.c);
      return;
      f1 = (float)(this.d * 156543.0339D / d3);
      break;
      label321:
      localsh.b((ru)localObject1);
    }
  }
  
  public final void b(int paramInt)
  {
    this.e = paramInt;
  }
  
  public final void c(int paramInt)
  {
    this.g = paramInt;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/rx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */