package com.tencent.tencentmap.mapsdk.a;

import android.graphics.PointF;

public final class si
{
  private static final rt a = new rt(new ru(-2.003750834E7D, -2.003750834E7D), new ru(2.003750834E7D, 2.003750834E7D));
  private sl b;
  private sh c;
  private rs d;
  private rs e;
  private boolean f = false;
  private rt g;
  private double h = 0.0D;
  private double i = 0.0D;
  
  public si(sl paramsl)
  {
    this.b = paramsl;
  }
  
  private double a(double paramDouble)
  {
    return this.c.d().d() * Math.cos(0.017453292519943295D * paramDouble);
  }
  
  private double a(boolean paramBoolean)
  {
    qx localqx = c();
    if (paramBoolean) {
      return Math.abs(localqx.c().c() - localqx.b().c());
    }
    return Math.abs(localqx.c().b() - localqx.b().b());
  }
  
  private ru[] k()
  {
    int j = this.c.getWidth();
    return new ru[] { rv.a(new PointF(0.0F, this.c.getHeight()), this.c.b(), this.c.a(), this.c.d()), rv.a(new PointF(j, 0.0F), this.c.b(), this.c.a(), this.c.d()) };
  }
  
  public final float a(double paramDouble1, double paramDouble2)
  {
    return (float)(paramDouble2 / a(paramDouble1));
  }
  
  public final float a(float paramFloat)
  {
    return (float)(paramFloat / a(0.0D));
  }
  
  public final PointF a(qw paramqw)
  {
    ru localru = this.c.b();
    PointF localPointF = this.c.a();
    rs localrs = this.c.d();
    paramqw = rv.a(paramqw);
    double d3 = paramqw.b();
    double d4 = localru.b();
    double d1 = paramqw.a();
    double d2 = localru.a();
    d3 = (d3 - d4) / localrs.d();
    d1 = (d1 - d2) / localrs.d();
    paramqw = new PointF();
    paramqw.x = ((float)(d3 + localPointF.x));
    paramqw.y = ((float)(localPointF.y - d1));
    return paramqw;
  }
  
  public final qw a(int paramInt1, int paramInt2)
  {
    return rv.a(rv.a(new PointF(paramInt1, paramInt2), this.c.b(), this.c.a(), this.c.d()));
  }
  
  public final rs a(rs paramrs)
  {
    int j;
    double d2;
    double d3;
    double d1;
    label67:
    rs localrs2;
    if ((this.b.f().a() >= 3) && (this.b.f().b() > 1.0F))
    {
      j = 1;
      d2 = paramrs.c();
      d3 = this.e.a();
      if (j == 0) {
        break label200;
      }
      d1 = Math.log(1.3D) / Math.log(2.0D);
      if (d2 >= d1 + d3) {
        break label210;
      }
      localrs2 = new rs(this.e.c());
      localrs1 = localrs2;
      if (j != 0) {
        localrs2.a(1.3D);
      }
    }
    label200:
    label210:
    for (rs localrs1 = localrs2;; localrs1 = paramrs)
    {
      d2 = paramrs.c();
      d3 = this.d.c();
      if (j != 0) {}
      for (d1 = Math.log(1.3D) / Math.log(2.0D);; d1 = 0.0D)
      {
        if (d2 > d1 + d3)
        {
          paramrs = new rs(this.d.c());
          localrs1 = paramrs;
          if (j != 0)
          {
            paramrs.a(1.3D);
            localrs1 = paramrs;
          }
        }
        return localrs1;
        j = 0;
        break;
        d1 = 0.0D;
        break label67;
      }
    }
  }
  
  public final void a()
  {
    this.g = a;
    this.d = new rs(19.0D);
    this.e = new rs(rs.a);
    this.c = this.b.c();
  }
  
  protected final void a(int paramInt)
  {
    this.h = 0.0D;
  }
  
  public final void a(ru paramru)
  {
    double d2 = 0.0D;
    if (this.g == null) {
      return;
    }
    ru[] arrayOfru = k();
    ru localru1 = this.g.a();
    ru localru2 = this.g.b();
    if (localru1.a() > arrayOfru[0].a()) {}
    for (double d1 = localru1.a() - arrayOfru[0].a();; d1 = 0.0D)
    {
      if (localru1.b() > arrayOfru[0].b()) {
        d2 = localru1.b() - arrayOfru[0].b();
      }
      if (localru2.a() < arrayOfru[1].a()) {
        d1 = localru2.a() - arrayOfru[1].a();
      }
      if (localru2.b() < arrayOfru[1].b()) {
        d2 = localru2.b() - arrayOfru[1].b();
      }
      paramru.a(d1 + paramru.a());
      paramru.b(paramru.b() + d2);
      return;
    }
  }
  
  protected final void b(double paramDouble1, double paramDouble2)
  {
    if ((paramDouble1 <= 0.0D) || (paramDouble2 <= 0.0D)) {
      return;
    }
    double d1 = a(true);
    double d2 = a(false);
    if ((d1 == 0.0D) && (d2 == 0.0D))
    {
      this.h = paramDouble1;
      this.i = paramDouble2;
      return;
    }
    paramDouble1 = Math.max(paramDouble1 / d2, paramDouble2 / d1);
    rs localrs = this.c.d();
    localrs.a(paramDouble1 * localrs.b());
    a(localrs);
    this.b.a(false, false);
  }
  
  protected final void b(int paramInt)
  {
    this.i = 0.0D;
  }
  
  public final ru[] b()
  {
    int j = 0;
    ru[] arrayOfru = new ru[8];
    float f1 = this.c.getWidth();
    float f2 = this.c.getHeight();
    PointF localPointF1 = new PointF(0.0F, 0.0F);
    PointF localPointF2 = new PointF(f1 / 2.0F, 0.0F);
    PointF localPointF3 = new PointF(f1, 0.0F);
    PointF localPointF4 = new PointF(f1, f2 / 2.0F);
    PointF localPointF5 = new PointF(f1, f2);
    PointF localPointF6 = new PointF(f1 / 2.0F, f2);
    PointF localPointF7 = new PointF(0.0F, f2);
    PointF localPointF8 = new PointF(0.0F, f2 / 2.0F);
    while (j < 8)
    {
      arrayOfru[j] = rv.a(new PointF[] { localPointF1, localPointF2, localPointF3, localPointF4, localPointF5, localPointF6, localPointF7, localPointF8 }[j], this.c.b(), this.c.a(), this.c.d());
      j += 1;
    }
    return arrayOfru;
  }
  
  public final qx c()
  {
    ru[] arrayOfru = k();
    return new qx(rv.a(arrayOfru[0]), rv.a(arrayOfru[1]));
  }
  
  public final void c(int paramInt)
  {
    int j = paramInt;
    if (this.f)
    {
      j = paramInt;
      if (paramInt <= this.e.c()) {
        j = this.e.a();
      }
    }
    paramInt = j;
    if (j <= rs.a) {
      paramInt = rs.a;
    }
    j = paramInt;
    if (paramInt >= this.d.c()) {
      j = this.d.a();
    }
    this.e.b(j);
    if (this.c.d().c() <= this.e.c()) {
      this.c.b(this.e.c(), true, null);
    }
  }
  
  public final qs d()
  {
    qw localqw = rv.a(this.c.b());
    float f1 = this.c.d().a();
    return qs.a().a(localqw).a(f1).a();
  }
  
  public final double e()
  {
    double d1 = 1.0D;
    if (this.c.d().a() < 7) {}
    for (;;)
    {
      return d1 * this.c.d().d();
      double d2 = 1.0D - Math.abs(this.c.b().a() / 2.003750834E7D);
      d1 = d2;
      if (d2 < 0.1D) {
        d1 = 0.1D;
      }
    }
  }
  
  public final float f()
  {
    int j = this.c.getWidth();
    return (float)(rv.a(a(0, 0), a(j, 0)) / j);
  }
  
  protected final double g()
  {
    return this.h;
  }
  
  protected final double h()
  {
    return this.i;
  }
  
  public final rs i()
  {
    return this.d;
  }
  
  public final rs j()
  {
    return this.e;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/si.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */