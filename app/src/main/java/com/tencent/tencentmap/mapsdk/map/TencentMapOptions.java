package com.tencent.tencentmap.mapsdk.map;

import android.view.Surface;

public class TencentMapOptions
{
  public static final int MAPTYPE_RASTER = 0;
  public static final int MAPTYPE_VECTOR = 1;
  private boolean enableHandDrawMap = false;
  private Surface mExtSurface;
  private int mMapType = 1;
  
  public TencentMapOptions enableHandDrawMap(boolean paramBoolean)
  {
    this.enableHandDrawMap = paramBoolean;
    return this;
  }
  
  public Surface getExtSurface()
  {
    return this.mExtSurface;
  }
  
  public int getMapType()
  {
    return this.mMapType;
  }
  
  public boolean isHandDrawMapEnable()
  {
    return this.enableHandDrawMap;
  }
  
  public void setExtSurface(Surface paramSurface)
  {
    this.mExtSurface = paramSurface;
  }
  
  public void setMapType(int paramInt)
  {
    int i;
    if (paramInt >= 0)
    {
      i = paramInt;
      if (paramInt <= 1) {}
    }
    else
    {
      i = 1;
    }
    this.mMapType = i;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/tencentmap/mapsdk/map/TencentMapOptions.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */