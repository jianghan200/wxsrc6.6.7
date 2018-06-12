package com.tencent.tencentmap.mapsdk.a;

import android.graphics.Point;
import com.tencent.mapsdk.raster.model.GeoPoint;
import com.tencent.mapsdk.raster.model.LatLng;
import com.tencent.mapsdk.raster.model.VisibleRegion;
import com.tencent.tencentmap.mapsdk.map.Projection;

public class qm
  implements Projection
{
  private ab a;
  private ac b;
  
  public qm(ac paramac)
  {
    this.a = paramac.m();
    this.b = paramac;
  }
  
  public double distanceBetween(LatLng paramLatLng1, LatLng paramLatLng2)
  {
    return qg.a(paramLatLng1, paramLatLng2);
  }
  
  public LatLng fromScreenLocation(Point paramPoint)
  {
    return qo.a(this.a.a(paramPoint));
  }
  
  public double getLatitudeSpan()
  {
    pj localpj = this.a.b();
    if (localpj == null) {
      return -1.0D;
    }
    return localpj.e.a.a - localpj.e.b.a;
  }
  
  public double getLongitudeSpan()
  {
    pj localpj = this.a.b();
    if (localpj == null) {
      return -1.0D;
    }
    return localpj.e.a.b - localpj.e.b.b;
  }
  
  public float getScalePerPixel()
  {
    return (float)this.a.a(this.b.d().a.a);
  }
  
  public VisibleRegion getVisibleRegion()
  {
    return qo.a(this.a.b());
  }
  
  public float metersToEquatorPixels(float paramFloat)
  {
    qf.a("call metersToEquatorPixels");
    return metersToPixels(0.0D, paramFloat);
  }
  
  public float metersToPixels(double paramDouble1, double paramDouble2)
  {
    qf.a("call metersToPixels");
    return (float)(paramDouble2 / this.a.a(paramDouble1));
  }
  
  @Deprecated
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
    return this.a.a(qo.a(paramLatLng));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/qm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */