package com.tencent.tencentmap.mapsdk.a;

import android.graphics.Point;
import com.tencent.mapsdk.raster.model.GeoPoint;
import com.tencent.mapsdk.raster.model.LatLng;
import com.tencent.mapsdk.raster.model.VisibleRegion;
import com.tencent.tencentmap.mapsdk.map.Projection;

public class qa
  implements Projection
{
  private ty a;
  
  public qa(ty paramty)
  {
    this.a = paramty;
  }
  
  public double distanceBetween(LatLng paramLatLng1, LatLng paramLatLng2)
  {
    if (this.a != null) {
      return this.a.a(qc.a(paramLatLng1), qc.a(paramLatLng2));
    }
    return -1.0D;
  }
  
  public LatLng fromScreenLocation(Point paramPoint)
  {
    if (this.a != null) {
      return qc.a(this.a.a(paramPoint));
    }
    return null;
  }
  
  public double getLatitudeSpan()
  {
    if (this.a != null) {
      return this.a.b() / 1000000.0D;
    }
    return -1.0D;
  }
  
  public double getLongitudeSpan()
  {
    if (this.a != null) {
      return this.a.c() / 1000000.0D;
    }
    return -1.0D;
  }
  
  public float getScalePerPixel()
  {
    if (this.a != null) {
      return this.a.d();
    }
    return -1.0F;
  }
  
  public VisibleRegion getVisibleRegion()
  {
    if (this.a != null) {
      return qc.a(this.a.a());
    }
    return null;
  }
  
  public float metersToEquatorPixels(float paramFloat)
  {
    if (this.a != null) {
      return this.a.a(paramFloat);
    }
    return -1.0F;
  }
  
  public float metersToPixels(double paramDouble1, double paramDouble2)
  {
    if (this.a != null) {
      return this.a.a(paramDouble1, paramDouble2);
    }
    return -1.0F;
  }
  
  public Point toPixels(GeoPoint paramGeoPoint, Point paramPoint)
  {
    paramGeoPoint = GeoPoint.g2l(paramGeoPoint);
    if (paramGeoPoint == null) {
      return null;
    }
    return toScreenLocation(paramGeoPoint);
  }
  
  public Point toScreenLocation(LatLng paramLatLng)
  {
    if (this.a != null) {
      return this.a.a(qc.a(paramLatLng));
    }
    return null;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/qa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */