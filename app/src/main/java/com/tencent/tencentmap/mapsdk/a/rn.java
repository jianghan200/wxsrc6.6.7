package com.tencent.tencentmap.mapsdk.a;

import android.graphics.PointF;

public final class rn
  extends rl
{
  private PointF d;
  private double e;
  private double f;
  
  public rn(sl paramsl, double paramDouble, PointF paramPointF, long paramLong, tt paramtt)
  {
    super(paramsl, paramLong, paramtt);
    this.e = paramDouble;
    this.d = paramPointF;
  }
  
  protected final void a(float paramFloat)
  {
    this.b.a(this.f * paramFloat, this.d, false, null);
  }
  
  protected final void c()
  {
    double d1 = this.b.c();
    this.f = (this.e - d1);
    new StringBuilder("newZoom:").append(this.e).append(",oldZoom=").append(d1);
  }
  
  protected final void d()
  {
    this.b.a(this.e, this.d, false, 0L, null);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/rn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */