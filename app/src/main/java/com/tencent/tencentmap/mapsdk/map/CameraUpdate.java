package com.tencent.tencentmap.mapsdk.map;

public class CameraUpdate
{
  private final CameraParameter camerPara;
  
  CameraUpdate(CameraParameter paramCameraParameter)
  {
    this.camerPara = paramCameraParameter;
  }
  
  public CameraParameter getParams()
  {
    return this.camerPara;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/tencentmap/mapsdk/map/CameraUpdate.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */