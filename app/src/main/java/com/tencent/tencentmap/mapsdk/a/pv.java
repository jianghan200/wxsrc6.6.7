package com.tencent.tencentmap.mapsdk.a;

import android.graphics.DashPathEffect;
import com.tencent.mapsdk.raster.model.Circle;
import com.tencent.mapsdk.raster.model.LatLng;

public class pv
  implements Circle
{
  private qt a;
  
  public pv(qt paramqt)
  {
    this.a = paramqt;
  }
  
  public boolean contains(LatLng paramLatLng)
  {
    if (this.a != null) {
      return this.a.b(qc.a(paramLatLng));
    }
    return false;
  }
  
  public LatLng getCenter()
  {
    if (this.a != null) {
      return qc.a(this.a.c());
    }
    return null;
  }
  
  public int getFillColor()
  {
    if (this.a != null) {
      return this.a.g();
    }
    return 0;
  }
  
  public String getId()
  {
    if (this.a != null) {
      return this.a.b();
    }
    return null;
  }
  
  public double getRadius()
  {
    if (this.a != null) {
      return this.a.d();
    }
    return 0.0D;
  }
  
  public int getStrokeColor()
  {
    if (this.a != null) {
      return this.a.f();
    }
    return 0;
  }
  
  public boolean getStrokeDash()
  {
    if (this.a != null) {
      return this.a.j();
    }
    return false;
  }
  
  public DashPathEffect getStrokeDashPathEffect()
  {
    if (this.a != null) {
      return this.a.k();
    }
    return null;
  }
  
  public float getStrokeWidth()
  {
    if (this.a != null) {
      return this.a.e();
    }
    return 0.0F;
  }
  
  public float getZIndex()
  {
    if (this.a != null) {
      return (int)this.a.h();
    }
    return 0.0F;
  }
  
  public boolean isVisible()
  {
    if (this.a != null) {
      return this.a.i();
    }
    return false;
  }
  
  public void remove()
  {
    if (this.a != null) {
      this.a.a();
    }
  }
  
  public void setCenter(LatLng paramLatLng)
  {
    if (this.a != null) {
      this.a.a(qc.a(paramLatLng));
    }
  }
  
  public void setFillColor(int paramInt)
  {
    if (this.a != null) {
      this.a.b(paramInt);
    }
  }
  
  public void setRadius(double paramDouble)
  {
    if (this.a != null) {
      this.a.a(paramDouble);
    }
  }
  
  public void setStrokeColor(int paramInt)
  {
    if (this.a != null) {
      this.a.a(paramInt);
    }
  }
  
  public void setStrokeDash(boolean paramBoolean)
  {
    if (this.a != null) {
      this.a.b(paramBoolean);
    }
  }
  
  public void setStrokeWidth(float paramFloat)
  {
    if (this.a != null)
    {
      qt localqt = this.a;
      float f = paramFloat;
      if (paramFloat < 0.0F) {
        f = 0.0F;
      }
      localqt.a(f);
    }
  }
  
  public void setVisible(boolean paramBoolean)
  {
    if (this.a != null) {
      this.a.a(paramBoolean);
    }
  }
  
  public void setZIndex(float paramFloat)
  {
    if (this.a != null) {
      this.a.b((int)paramFloat);
    }
  }
  
  public void strokeDashPathEffect(DashPathEffect paramDashPathEffect)
  {
    if (this.a != null) {
      this.a.a(paramDashPathEffect);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/pv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */