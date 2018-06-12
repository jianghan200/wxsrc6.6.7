package com.tencent.mm.plugin.r;

import android.graphics.Point;
import android.view.View;
import android.view.View.OnTouchListener;
import java.util.Collection;
import java.util.Set;

public abstract interface d
{
  public abstract void addPinView(View paramView, double paramDouble1, double paramDouble2);
  
  public abstract void addView(Object paramObject, double paramDouble1, double paramDouble2, String paramString);
  
  public abstract void clean();
  
  public abstract void destroy();
  
  public abstract Collection<Object> getChilds();
  
  public abstract b getIController();
  
  public abstract int getMapCenterX();
  
  public abstract int getMapCenterY();
  
  public abstract Point getPointByGeoPoint(double paramDouble1, double paramDouble2);
  
  public abstract Set<String> getTags();
  
  public abstract Object getViewByItag(String paramString);
  
  public abstract e getViewManager();
  
  public abstract int getZoom();
  
  public abstract int getZoomLevel();
  
  public abstract void invalidate();
  
  public abstract void removeView(View paramView);
  
  public abstract Object removeViewByTag(String paramString);
  
  public abstract void setBuiltInZoomControls(boolean paramBoolean);
  
  public abstract void setMapViewOnTouchListener(View.OnTouchListener paramOnTouchListener);
  
  public abstract void updateLocaitonPinLayout(View paramView, double paramDouble1, double paramDouble2);
  
  public abstract void zoomToSpan(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4);
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/r/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */