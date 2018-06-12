package com.tencent.mapsdk.raster.model;

import android.graphics.DashPathEffect;

public abstract interface Circle
  extends IOverlay
{
  public abstract boolean contains(LatLng paramLatLng);
  
  public abstract boolean equals(Object paramObject);
  
  public abstract LatLng getCenter();
  
  public abstract int getFillColor();
  
  public abstract String getId();
  
  public abstract double getRadius();
  
  public abstract int getStrokeColor();
  
  public abstract boolean getStrokeDash();
  
  public abstract DashPathEffect getStrokeDashPathEffect();
  
  public abstract float getStrokeWidth();
  
  public abstract float getZIndex();
  
  public abstract int hashCode();
  
  public abstract boolean isVisible();
  
  public abstract void remove();
  
  public abstract void setCenter(LatLng paramLatLng);
  
  public abstract void setFillColor(int paramInt);
  
  public abstract void setRadius(double paramDouble);
  
  public abstract void setStrokeColor(int paramInt);
  
  public abstract void setStrokeDash(boolean paramBoolean);
  
  public abstract void setStrokeWidth(float paramFloat);
  
  public abstract void setVisible(boolean paramBoolean);
  
  public abstract void setZIndex(float paramFloat);
  
  public abstract void strokeDashPathEffect(DashPathEffect paramDashPathEffect);
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mapsdk/raster/model/Circle.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */