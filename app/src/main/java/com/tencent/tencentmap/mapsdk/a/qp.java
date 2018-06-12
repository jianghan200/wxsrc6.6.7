package com.tencent.tencentmap.mapsdk.a;

import com.tencent.tencentmap.mapsdk.map.UiSettings;

public class qp
  implements UiSettings
{
  private ae a;
  
  public qp(ae paramae)
  {
    this.a = paramae;
  }
  
  public boolean isAnimationEnabled()
  {
    return false;
  }
  
  public boolean isRotateGesturesEnabled()
  {
    if (this.a == null) {
      return false;
    }
    return this.a.b();
  }
  
  public boolean isScaleControlsEnabled()
  {
    if (this.a != null) {
      return this.a.c();
    }
    return false;
  }
  
  public boolean isTiltGesturesEnabled()
  {
    if (this.a == null) {
      return false;
    }
    return this.a.a();
  }
  
  public void setAllGesturesEnabled(boolean paramBoolean)
  {
    if (this.a != null) {
      this.a.f(paramBoolean);
    }
  }
  
  public void setAnimationEnabled(boolean paramBoolean) {}
  
  public void setLogoPosition(int paramInt)
  {
    if (this.a != null) {
      this.a.b(paramInt);
    }
  }
  
  public void setRotateGesturesEnabled(boolean paramBoolean)
  {
    if (this.a == null) {
      return;
    }
    this.a.e(paramBoolean);
  }
  
  public void setScaleControlsEnabled(boolean paramBoolean)
  {
    if (this.a != null) {
      this.a.g(paramBoolean);
    }
  }
  
  public void setScaleViewPosition(int paramInt)
  {
    if (this.a != null) {
      switch (paramInt)
      {
      }
    }
    for (;;)
    {
      this.a.a(paramInt);
      return;
      paramInt = 4;
      continue;
      paramInt = 1;
    }
  }
  
  public void setScrollGesturesEnabled(boolean paramBoolean)
  {
    if (this.a != null) {
      this.a.b(paramBoolean);
    }
  }
  
  public void setTiltGesturesEnabled(boolean paramBoolean)
  {
    if (this.a == null) {
      return;
    }
    this.a.d(paramBoolean);
  }
  
  public void setZoomGesturesEnabled(boolean paramBoolean)
  {
    if (this.a != null) {
      this.a.c(paramBoolean);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/qp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */