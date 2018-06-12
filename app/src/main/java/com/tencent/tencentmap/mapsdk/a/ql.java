package com.tencent.tencentmap.mapsdk.a;

import com.tencent.mapsdk.raster.model.LatLng;
import com.tencent.mapsdk.raster.model.Polygon;
import java.util.List;

public class ql
  implements Polygon
{
  private pd a;
  
  public ql(pd parampd)
  {
    this.a = parampd;
  }
  
  public boolean contains(LatLng paramLatLng)
  {
    if (this.a != null) {
      return this.a.a(qo.a(paramLatLng));
    }
    return false;
  }
  
  public int getFillColor()
  {
    if (this.a != null) {
      return this.a.f();
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
      return qo.a(this.a.c());
    }
    return null;
  }
  
  public int getStrokeColor()
  {
    if (this.a != null) {
      return this.a.e();
    }
    return 0;
  }
  
  public float getStrokeWidth()
  {
    if (this.a != null) {
      return this.a.d() * qi.a();
    }
    return 0.0F;
  }
  
  public float getZIndex()
  {
    if (this.a != null) {
      return (int)this.a.g();
    }
    return 0.0F;
  }
  
  public boolean isVisible()
  {
    if (this.a != null) {
      return this.a.h();
    }
    return false;
  }
  
  public void remove()
  {
    if (this.a != null) {
      this.a.a();
    }
  }
  
  public void setFillColor(int paramInt)
  {
    if (this.a != null) {
      this.a.b(paramInt);
    }
  }
  
  public void setPoints(List<LatLng> paramList)
  {
    if (this.a != null) {
      this.a.a(qo.b(paramList));
    }
  }
  
  public void setStrokeColor(int paramInt)
  {
    if (this.a != null) {
      this.a.a(paramInt);
    }
  }
  
  public void setStrokeWidth(float paramFloat)
  {
    if (this.a != null)
    {
      pd localpd = this.a;
      float f = paramFloat;
      if (paramFloat < 0.0F) {
        f = 0.0F;
      }
      localpd.a(f / qi.a());
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
      this.a.c((int)paramFloat);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/ql.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */