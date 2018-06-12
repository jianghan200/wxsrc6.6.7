package com.tencent.tencentmap.mapsdk.a;

import com.tencent.tencentmap.mapsdk.map.UiSettings;

public class qd
  implements UiSettings
{
  private ub a;
  
  public qd(ub paramub)
  {
    this.a = paramub;
  }
  
  public boolean isAnimationEnabled()
  {
    if (this.a != null) {
      return this.a.a();
    }
    return false;
  }
  
  public boolean isRotateGesturesEnabled()
  {
    return false;
  }
  
  public boolean isScaleControlsEnabled()
  {
    if (this.a != null) {
      return this.a.b();
    }
    return false;
  }
  
  public boolean isTiltGesturesEnabled()
  {
    return false;
  }
  
  public void setAllGesturesEnabled(boolean paramBoolean)
  {
    if (this.a != null)
    {
      this.a.c(paramBoolean);
      this.a.d(paramBoolean);
    }
  }
  
  public void setAnimationEnabled(boolean paramBoolean)
  {
    if (this.a != null) {
      this.a.a(paramBoolean);
    }
  }
  
  public void setLogoPosition(int paramInt)
  {
    if (this.a != null) {
      this.a.a(paramInt);
    }
  }
  
  public void setRotateGesturesEnabled(boolean paramBoolean) {}
  
  public void setScaleControlsEnabled(boolean paramBoolean)
  {
    if (this.a != null) {
      this.a.b(paramBoolean);
    }
  }
  
  public void setScaleViewPosition(int paramInt)
  {
    if (this.a != null) {
      this.a.b(paramInt);
    }
  }
  
  public void setScrollGesturesEnabled(boolean paramBoolean)
  {
    if (this.a != null) {
      this.a.c(paramBoolean);
    }
  }
  
  public void setTiltGesturesEnabled(boolean paramBoolean) {}
  
  public void setZoomGesturesEnabled(boolean paramBoolean)
  {
    if (this.a != null) {
      this.a.d(paramBoolean);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/qd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */