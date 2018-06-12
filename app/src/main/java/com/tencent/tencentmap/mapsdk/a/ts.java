package com.tencent.tencentmap.mapsdk.a;

import android.graphics.Point;

public final class ts
{
  public static tr a()
  {
    return new tr(new sb());
  }
  
  public static tr a(float paramFloat)
  {
    sd localsd = new sd();
    localsd.a(paramFloat);
    return new tr(localsd);
  }
  
  public static tr a(float paramFloat1, float paramFloat2)
  {
    rz localrz = new rz();
    localrz.a(paramFloat1);
    localrz.b(paramFloat2);
    return new tr(localrz);
  }
  
  public static tr a(float paramFloat, Point paramPoint)
  {
    return new tr(rv.a(paramFloat, paramPoint));
  }
  
  public static tr a(qs paramqs)
  {
    return new tr(rv.a(paramqs));
  }
  
  public static tr a(qw paramqw)
  {
    return new tr(rv.a(qs.a().a(paramqw).a()));
  }
  
  public static tr a(qw paramqw, float paramFloat)
  {
    return new tr(rv.a(qs.a().a(paramqw).a(paramFloat).a()));
  }
  
  public static tr a(qx paramqx, int paramInt)
  {
    return new tr(rv.a(paramqx, 0, 0, paramInt));
  }
  
  public static tr a(qx paramqx, int paramInt1, int paramInt2, int paramInt3)
  {
    return new tr(rv.a(paramqx, paramInt1, paramInt2, paramInt3));
  }
  
  public static tr b()
  {
    return new tr(new sc());
  }
  
  public static tr b(float paramFloat)
  {
    return new tr(rv.a(paramFloat, null));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/ts.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */