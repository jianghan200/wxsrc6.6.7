package com.tencent.mapsdk.raster.model;

import android.view.View;
import android.view.animation.Animation;

public abstract interface Marker
  extends IOverlay
{
  public abstract boolean equals(Object paramObject);
  
  public abstract float getAlpha();
  
  public abstract String getId();
  
  public abstract View getMarkerView();
  
  public abstract LatLng getPosition();
  
  public abstract float getRotation();
  
  public abstract String getSnippet();
  
  public abstract Object getTag();
  
  public abstract String getTitle();
  
  public abstract float getZIndex();
  
  public abstract int hashCode();
  
  public abstract void hideInfoWindow();
  
  public abstract boolean isDraggable();
  
  public abstract boolean isInfoWindowShown();
  
  public abstract boolean isVisible();
  
  public abstract void remove();
  
  public abstract void set2Top();
  
  public abstract void setAlpha(float paramFloat);
  
  public abstract void setAnchor(float paramFloat1, float paramFloat2);
  
  public abstract void setDraggable(boolean paramBoolean);
  
  public abstract void setIcon(BitmapDescriptor paramBitmapDescriptor);
  
  public abstract void setInfoWindowHideAnimation(Animation paramAnimation);
  
  public abstract void setInfoWindowShowAnimation(Animation paramAnimation);
  
  public abstract void setMarkerView(View paramView);
  
  public abstract void setPosition(LatLng paramLatLng);
  
  public abstract void setRotation(float paramFloat);
  
  public abstract void setSnippet(String paramString);
  
  public abstract void setTag(Object paramObject);
  
  public abstract void setTitle(String paramString);
  
  public abstract void setVisible(boolean paramBoolean);
  
  public abstract void setZIndex(float paramFloat);
  
  public abstract void showInfoWindow();
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mapsdk/raster/model/Marker.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */