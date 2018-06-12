package com.tencent.tencentmap.mapsdk.map;

import com.tencent.mapsdk.raster.model.LatLng;

@Deprecated
public abstract interface MapController
{
  @Deprecated
  public abstract void animateTo(LatLng paramLatLng);
  
  @Deprecated
  public abstract void animateTo(LatLng paramLatLng, long paramLong, CancelableCallback paramCancelableCallback);
  
  @Deprecated
  public abstract void animateTo(LatLng paramLatLng, Runnable paramRunnable);
  
  @Deprecated
  public abstract void setCenter(LatLng paramLatLng);
  
  @Deprecated
  public abstract void setZoom(int paramInt);
  
  public abstract void zoomToSpan(double paramDouble1, double paramDouble2);
  
  public abstract void zoomToSpan(LatLng paramLatLng1, LatLng paramLatLng2);
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/tencentmap/mapsdk/map/MapController.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */