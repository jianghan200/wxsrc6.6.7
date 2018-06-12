package com.tencent.mapsdk.raster.model;

import java.util.List;

public abstract interface Polyline
  extends IOverlay
{
  public abstract boolean equals(Object paramObject);
  
  public abstract int getColor();
  
  public abstract String getId();
  
  public abstract List<LatLng> getPoints();
  
  public abstract float getWidth();
  
  public abstract float getZIndex();
  
  public abstract int hashCode();
  
  public abstract boolean isDottedLine();
  
  public abstract boolean isGeodesic();
  
  public abstract boolean isVisible();
  
  public abstract void remove();
  
  public abstract void setColor(int paramInt);
  
  public abstract void setDottedLine(boolean paramBoolean);
  
  public abstract void setGeodesic(boolean paramBoolean);
  
  public abstract void setPoints(List<LatLng> paramList);
  
  public abstract void setVisible(boolean paramBoolean);
  
  public abstract void setWidth(float paramFloat);
  
  public abstract void setZIndex(float paramFloat);
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mapsdk/raster/model/Polyline.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */