package com.tencent.tencentmap.mapsdk.map;

public abstract interface UiSettings
{
  public static final int LOGO_POSITION_CENTER_BOTTOM = 4;
  public static final int LOGO_POSITION_CENTER_TOP = 5;
  public static final int LOGO_POSITION_LEFT_BOTTOM = 0;
  public static final int LOGO_POSITION_LEFT_TOP = 3;
  public static final int LOGO_POSITION_RIGHT_BOTTOM = 1;
  public static final int LOGO_POSITION_RIGHT_TOP = 2;
  public static final int SCALEVIEW_POSITION_CENTER_BOTTOM = 1;
  public static final int SCALEVIEW_POSITION_LEFT_BOTTOM = 0;
  public static final int SCALEVIEW_POSITION_RIGHT_BOTTOM = 2;
  
  public abstract boolean isAnimationEnabled();
  
  public abstract boolean isRotateGesturesEnabled();
  
  public abstract boolean isScaleControlsEnabled();
  
  public abstract boolean isTiltGesturesEnabled();
  
  public abstract void setAllGesturesEnabled(boolean paramBoolean);
  
  public abstract void setAnimationEnabled(boolean paramBoolean);
  
  public abstract void setLogoPosition(int paramInt);
  
  public abstract void setRotateGesturesEnabled(boolean paramBoolean);
  
  public abstract void setScaleControlsEnabled(boolean paramBoolean);
  
  public abstract void setScaleViewPosition(int paramInt);
  
  public abstract void setScrollGesturesEnabled(boolean paramBoolean);
  
  public abstract void setTiltGesturesEnabled(boolean paramBoolean);
  
  public abstract void setZoomGesturesEnabled(boolean paramBoolean);
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/tencentmap/mapsdk/map/UiSettings.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */