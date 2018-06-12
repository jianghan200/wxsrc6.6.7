package com.tencent.mapsdk.raster.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public final class PolygonOptions
{
  private int fillColor = -16777216;
  private boolean isVisible = true;
  private final List<LatLng> points = new ArrayList();
  private int strokeColor = -16777216;
  private float strokeWidth = 10.0F;
  private float zIndex = 0.0F;
  
  public final PolygonOptions add(LatLng paramLatLng)
  {
    if (paramLatLng == null) {
      return this;
    }
    this.points.add(paramLatLng);
    return this;
  }
  
  public final PolygonOptions add(LatLng... paramVarArgs)
  {
    if (paramVarArgs == null) {
      return this;
    }
    this.points.addAll(Arrays.asList(paramVarArgs));
    return this;
  }
  
  public final PolygonOptions addAll(Iterable<LatLng> paramIterable)
  {
    if (paramIterable == null) {}
    for (;;)
    {
      return this;
      paramIterable = paramIterable.iterator();
      while (paramIterable.hasNext())
      {
        LatLng localLatLng = (LatLng)paramIterable.next();
        this.points.add(localLatLng);
      }
    }
  }
  
  public final PolygonOptions fillColor(int paramInt)
  {
    this.fillColor = paramInt;
    return this;
  }
  
  public final int getFillColor()
  {
    return this.fillColor;
  }
  
  public final List<LatLng> getPoints()
  {
    return this.points;
  }
  
  public final int getStrokeColor()
  {
    return this.strokeColor;
  }
  
  public final float getStrokeWidth()
  {
    return this.strokeWidth;
  }
  
  public final float getZIndex()
  {
    return this.zIndex;
  }
  
  public final boolean isVisible()
  {
    return this.isVisible;
  }
  
  public final PolygonOptions strokeColor(int paramInt)
  {
    this.strokeColor = paramInt;
    return this;
  }
  
  public final PolygonOptions strokeWidth(float paramFloat)
  {
    float f = paramFloat;
    if (paramFloat < 0.0F) {
      f = 0.0F;
    }
    this.strokeWidth = f;
    return this;
  }
  
  public final PolygonOptions visible(boolean paramBoolean)
  {
    this.isVisible = paramBoolean;
    return this;
  }
  
  public final PolygonOptions zIndex(float paramFloat)
  {
    this.zIndex = paramFloat;
    return this;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mapsdk/raster/model/PolygonOptions.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */