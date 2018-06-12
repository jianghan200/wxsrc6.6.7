package com.tencent.mapsdk.raster.model;

public abstract interface IOverlay
{
  public abstract String getId();
  
  public abstract boolean isVisible();
  
  public abstract void remove();
  
  public abstract void setVisible(boolean paramBoolean);
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mapsdk/raster/model/IOverlay.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */