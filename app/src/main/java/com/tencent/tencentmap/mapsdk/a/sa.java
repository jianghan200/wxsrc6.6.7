package com.tencent.tencentmap.mapsdk.a;

import android.graphics.Point;
import android.graphics.PointF;

public final class sa
  extends rw
{
  private float d;
  private Point e;
  
  public final void a(float paramFloat)
  {
    this.d = paramFloat;
  }
  
  public final void a(Point paramPoint)
  {
    this.e = paramPoint;
  }
  
  public final void a(sl paramsl)
  {
    if (this.e != null)
    {
      PointF localPointF = new PointF(this.e.x, this.e.y);
      paramsl.c().a(this.d, localPointF, this.a, this.c);
      return;
    }
    paramsl.c().a(this.d, this.a, this.c);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/sa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */