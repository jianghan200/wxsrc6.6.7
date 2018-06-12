package com.tencent.tencentmap.mapsdk.a;

import android.graphics.Color;
import android.graphics.Point;
import com.tencent.map.lib.basemap.data.DoublePoint;
import com.tencent.map.lib.basemap.data.GeoPoint;
import com.tencent.map.lib.f;
import com.tencent.map.lib.mapstructure.Polygon2D;
import java.util.ArrayList;
import java.util.List;
import javax.microedition.khronos.opengles.GL10;

public class ka
  extends ke
{
  Polygon2D a;
  private GeoPoint b = new GeoPoint(39909230, 116397428);
  private double c = 1000.0D;
  private double d = -1.0D;
  private float e = 1.0F;
  private ks f = null;
  private List<GeoPoint> g = new ArrayList();
  private ot h;
  private os i;
  
  public ka(ks paramks)
  {
    this.f = paramks;
    this.a = new Polygon2D();
    this.a.polygonId = -1;
  }
  
  private int[] a(int paramInt)
  {
    return new int[] { Color.red(paramInt), Color.green(paramInt), Color.blue(paramInt), Color.alpha(paramInt) };
  }
  
  public void a(double paramDouble)
  {
    if (paramDouble < 0.0D) {}
    double d1;
    do
    {
      return;
      d1 = paramDouble;
      if (paramDouble == 0.0D) {
        d1 = 1.0E-10D;
      }
    } while ((this.h == null) || (this.h.a() == null));
    float f1 = (float)kh.a(d1, this.h.a().a);
    if (this.d == -1.0D) {
      this.d = f1;
    }
    for (this.e = 1.0F;; this.e = ((float)(f1 / this.d)))
    {
      this.c = f1;
      this.O = true;
      return;
      if (this.d == 0.0D) {
        this.d = 1.0E-10D;
      }
    }
  }
  
  public void a(GeoPoint paramGeoPoint)
  {
    if (paramGeoPoint == null) {
      return;
    }
    if (this.b == null) {
      this.b = new GeoPoint(paramGeoPoint.getLatitudeE6(), paramGeoPoint.getLongitudeE6());
    }
    for (;;)
    {
      this.O = true;
      return;
      this.b.setLatitudeE6(paramGeoPoint.getLatitudeE6());
      this.b.setLongitudeE6(paramGeoPoint.getLongitudeE6());
    }
  }
  
  public void a(os paramos)
  {
    this.i = paramos;
  }
  
  public void a(ot paramot)
  {
    if (paramot == null) {
      return;
    }
    this.h = paramot;
    ox localox = paramot.a();
    if (localox != null) {
      a(kh.a(localox));
    }
    a(paramot.b());
    d(paramot.c());
    b(paramot.d());
    c(paramot.e());
    c(paramot.f());
    a_(paramot.g());
    this.h = paramot;
    this.O = true;
  }
  
  public void a(GL10 paramGL10)
  {
    if (!a())
    {
      this.f.getMap().c(this.a.polygonId);
      this.a.polygonId = -1;
      return;
    }
    c();
  }
  
  public boolean a()
  {
    return this.N;
  }
  
  public boolean a(float paramFloat1, float paramFloat2)
  {
    if (this.b == null) {}
    GeoPoint localGeoPoint;
    do
    {
      return false;
      localGeoPoint = this.f.getMap().s().a(new DoublePoint(paramFloat1, paramFloat2));
    } while (Math.hypot(localGeoPoint.getLatitudeE6() - this.b.getLatitudeE6(), localGeoPoint.getLongitudeE6() - this.b.getLongitudeE6()) > this.c);
    return true;
  }
  
  public void a_(boolean paramBoolean)
  {
    this.N = paramBoolean;
  }
  
  public void b() {}
  
  public void c()
  {
    if ((this.a.polygonId >= 0) && (!this.O)) {
      return;
    }
    this.a.color = a(this.K);
    this.a.borderColor = a(this.L);
    this.a.borderWidth = this.J;
    this.a.pointsCount = 128;
    this.a.polygonMode = 1;
    this.a.originalRadius = ((float)this.d);
    this.a.scale = this.e;
    this.a.zIndex = this.M;
    if (this.b != null)
    {
      this.a.centerX = this.b.getLatitudeE6();
      this.a.centerY = this.b.getLongitudeE6();
    }
    this.a.points = new Point[0];
    if (-1 == this.a.polygonId) {
      this.a.polygonId = this.f.getMap().a(this.a);
    }
    for (;;)
    {
      this.O = false;
      return;
      if (this.O) {
        this.f.getMap().b(this.a);
      }
    }
  }
  
  public void d()
  {
    if (this.a != null) {
      this.f.getMap().c(this.a.polygonId);
    }
    this.d = -1.0D;
    this.b = null;
    this.i = null;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/ka.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */