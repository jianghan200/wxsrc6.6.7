package com.tencent.tencentmap.mapsdk.a;

import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.location.Location;
import com.tencent.map.lib.basemap.data.DoublePoint;
import com.tencent.map.lib.basemap.data.GeoPoint;

public class ha
  implements hh
{
  private ic a;
  private hq b;
  private hv c;
  
  public ha(ic paramic, gy paramgy)
  {
    this.a = paramic;
    this.b = paramgy.f();
    if ((paramgy instanceof hv)) {
      this.c = ((hv)paramgy);
    }
  }
  
  public static DoublePoint a(ic paramic, GeoPoint paramGeoPoint)
  {
    if ((paramic == null) || (paramGeoPoint == null)) {
      return null;
    }
    double d2 = 0.0D;
    double d1 = 0.0D;
    int i = paramic.f() >> 1;
    double d4 = paramic.g();
    double d3 = paramic.h();
    if (paramGeoPoint != null)
    {
      d1 = Math.min(Math.max(Math.sin(paramGeoPoint.getLatitudeE6() / 1000000.0D * 0.017453292519943295D), -0.9999D), 0.9999D);
      d2 = i + d4 * (paramGeoPoint.getLongitudeE6() / 1000000.0D);
      d4 = i;
      d1 = Math.log((1.0D + d1) / (1.0D - d1)) * d3 * 0.5D + d4;
    }
    return new DoublePoint(d2, d1);
  }
  
  public double a(double paramDouble)
  {
    float f = this.a.j();
    double d = this.a.k();
    return 4.0076E7D / (Math.pow(2.0D, (float)(f + Math.log(d) / Math.log(2.0D))) * 256.0D) * Math.cos(3.141592653589793D * paramDouble / 180.0D);
  }
  
  public double a(Point paramPoint1, Point paramPoint2)
  {
    GeoPoint localGeoPoint1 = a(new DoublePoint(paramPoint1.x, paramPoint1.y));
    GeoPoint localGeoPoint2 = a(new DoublePoint(paramPoint2.x, paramPoint2.y));
    float[] arrayOfFloat = new float[1];
    Location.distanceBetween(localGeoPoint1.getLatitudeE6() / 1000000.0D, localGeoPoint1.getLongitudeE6() / 1000000.0D, localGeoPoint2.getLatitudeE6() / 1000000.0D, localGeoPoint2.getLongitudeE6() / 1000000.0D, arrayOfFloat);
    int i = (int)Math.sqrt(Math.pow(paramPoint1.x - paramPoint2.x, 2.0D) + Math.pow(paramPoint1.y - paramPoint2.y, 2.0D));
    return arrayOfFloat[0] / i;
  }
  
  public GeoPoint a(DoublePoint paramDoublePoint)
  {
    if (paramDoublePoint == null) {
      return null;
    }
    byte[] arrayOfByte = this.a.r();
    float f4 = (float)paramDoublePoint.x;
    float f3 = (float)paramDoublePoint.y;
    float f2 = f4;
    float f1 = f3;
    if (this.c != null)
    {
      paramDoublePoint = this.c.q();
      f2 = f4;
      f1 = f3;
      if (paramDoublePoint != null)
      {
        f2 = f4 - paramDoublePoint.left;
        f1 = f3 - paramDoublePoint.top;
      }
    }
    return this.b.a(arrayOfByte, f2, f1);
  }
  
  public DoublePoint b(GeoPoint paramGeoPoint)
  {
    if (paramGeoPoint == null) {
      return null;
    }
    double d1 = paramGeoPoint.getLatitudeE6() / 1000000.0D;
    double d2 = paramGeoPoint.getLongitudeE6() / 1000000.0D;
    paramGeoPoint = this.a.r();
    paramGeoPoint = this.b.a(paramGeoPoint, d1, d2);
    float f4 = paramGeoPoint.x;
    float f3 = paramGeoPoint.y;
    float f2 = f4;
    float f1 = f3;
    if (this.c != null)
    {
      paramGeoPoint = this.c.q();
      f2 = f4;
      f1 = f3;
      if (paramGeoPoint != null)
      {
        f2 = f4 + paramGeoPoint.left;
        f1 = f3 + paramGeoPoint.top;
      }
    }
    return new DoublePoint(f2, f1);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/ha.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */