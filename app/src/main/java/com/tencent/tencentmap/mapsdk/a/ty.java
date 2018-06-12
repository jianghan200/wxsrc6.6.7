package com.tencent.tencentmap.mapsdk.a;

import android.graphics.Point;
import android.graphics.PointF;

public class ty
{
  private sl a;
  private si b;
  
  public ty(sl paramsl)
  {
    this.a = paramsl;
    this.b = paramsl.b();
  }
  
  public double a(qw paramqw1, qw paramqw2)
  {
    return rv.a(paramqw1, paramqw2);
  }
  
  public float a(double paramDouble1, double paramDouble2)
  {
    return this.b.a(paramDouble1, paramDouble2);
  }
  
  public float a(float paramFloat)
  {
    return this.b.a(paramFloat);
  }
  
  public Point a(qw paramqw)
  {
    paramqw = this.b.a(paramqw);
    return new Point((int)paramqw.x, (int)paramqw.y);
  }
  
  public qw a(Point paramPoint)
  {
    return this.b.a(paramPoint.x, paramPoint.y);
  }
  
  public rj a()
  {
    int i = this.a.c().getWidth();
    int j = this.a.c().getHeight();
    qw localqw1 = a(new Point(0, 0));
    qw localqw2 = a(new Point(i, 0));
    qw localqw3 = a(new Point(0, j));
    qw localqw4 = a(new Point(i, j));
    return new rj(localqw3, localqw4, localqw1, localqw2, qx.a().a(localqw3).a(localqw4).a(localqw1).a(localqw2).a());
  }
  
  public int b()
  {
    qx localqx = a().e();
    qw localqw = localqx.b();
    return (int)(localqx.c().b() * 1000000.0D - localqw.b() * 1000000.0D);
  }
  
  public int c()
  {
    qx localqx = a().e();
    qw localqw = localqx.b();
    return (int)(localqx.c().c() * 1000000.0D - localqw.c() * 1000000.0D);
  }
  
  public float d()
  {
    return this.b.f();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/ty.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */