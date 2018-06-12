package com.tencent.tencentmap.mapsdk.a;

import com.tencent.mapsdk.raster.model.LatLng;
import com.tencent.mapsdk.raster.model.Polyline;
import java.util.List;

public class py
  implements Polyline
{
  private rc a;
  
  public py(rc paramrc)
  {
    this.a = paramrc;
  }
  
  public int getColor()
  {
    if (this.a != null) {
      return this.a.e();
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
  
  public List<LatLng> getPoints()
  {
    if (this.a != null) {
      return qc.a(this.a.c());
    }
    return null;
  }
  
  public float getWidth()
  {
    if (this.a != null) {
      return this.a.d();
    }
    return 0.0F;
  }
  
  public float getZIndex()
  {
    if (this.a != null) {
      return this.a.f();
    }
    return 0.0F;
  }
  
  public boolean isDottedLine()
  {
    if (this.a != null) {
      return this.a.i();
    }
    return false;
  }
  
  public boolean isGeodesic()
  {
    if (this.a != null) {
      return this.a.h();
    }
    return false;
  }
  
  public boolean isVisible()
  {
    if (this.a != null) {
      return this.a.g();
    }
    return false;
  }
  
  public void remove()
  {
    if (this.a != null) {
      this.a.a();
    }
  }
  
  public void setColor(int paramInt)
  {
    if (this.a != null) {
      this.a.a(paramInt);
    }
  }
  
  public void setDottedLine(boolean paramBoolean)
  {
    if (this.a != null) {
      this.a.c(paramBoolean);
    }
  }
  
  public void setGeodesic(boolean paramBoolean)
  {
    if (this.a != null) {
      this.a.b(paramBoolean);
    }
  }
  
  public void setPoints(List<LatLng> paramList)
  {
    if (this.a != null) {
      this.a.a(qc.b(paramList));
    }
  }
  
  public void setVisible(boolean paramBoolean)
  {
    if (this.a != null) {
      this.a.a(paramBoolean);
    }
  }
  
  public void setWidth(float paramFloat)
  {
    if (this.a != null)
    {
      rc localrc = this.a;
      float f = paramFloat;
      if (paramFloat < 0.0F) {
        f = 0.0F;
      }
      localrc.a(f);
    }
  }
  
  public void setZIndex(float paramFloat)
  {
    if (this.a != null) {
      this.a.b((int)paramFloat);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/py.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */