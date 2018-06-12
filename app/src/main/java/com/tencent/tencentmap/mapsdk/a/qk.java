package com.tencent.tencentmap.mapsdk.a;

import com.tencent.mapsdk.raster.model.LatLng;
import com.tencent.mapsdk.raster.model.Polyline;
import java.util.List;

public class qk
  implements Polyline
{
  private pf a;
  
  public qk(pf parampf)
  {
    this.a = parampf;
  }
  
  public int getColor()
  {
    if (this.a != null) {
      return this.a.f();
    }
    return 0;
  }
  
  public String getId()
  {
    if (this.a != null) {
      return this.a.c();
    }
    return null;
  }
  
  public List<LatLng> getPoints()
  {
    if (this.a != null) {
      return qo.a(this.a.d());
    }
    return null;
  }
  
  public float getWidth()
  {
    if (this.a != null) {
      return this.a.e();
    }
    return 0.0F;
  }
  
  public float getZIndex()
  {
    if (this.a != null) {
      return this.a.g();
    }
    return 0.0F;
  }
  
  public boolean isDottedLine()
  {
    return false;
  }
  
  public boolean isGeodesic()
  {
    return false;
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
      this.a.b();
    }
  }
  
  public void setColor(int paramInt)
  {
    if (this.a != null) {
      this.a.a(paramInt);
    }
  }
  
  public void setDottedLine(boolean paramBoolean) {}
  
  public void setGeodesic(boolean paramBoolean) {}
  
  public void setPoints(List<LatLng> paramList)
  {
    if (this.a != null) {
      this.a.a(qo.b(paramList));
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
      pf localpf = this.a;
      float f = paramFloat;
      if (paramFloat < 0.0F) {
        f = 0.0F;
      }
      localpf.a(f);
    }
  }
  
  public void setZIndex(float paramFloat)
  {
    if (this.a != null) {
      this.a.b((int)paramFloat);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/qk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */