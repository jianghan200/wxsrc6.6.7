package com.tencent.tencentmap.mapsdk.map;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup.LayoutParams;

public abstract interface IMapView
{
  public abstract void addView(View paramView, MapView.LayoutParams paramLayoutParams);
  
  public abstract boolean dispatchTouchEvent(MotionEvent paramMotionEvent);
  
  public abstract TencentMap getMap();
  
  @Deprecated
  public abstract MapController getMapController();
  
  public abstract View getMapView();
  
  public abstract Projection getProjection();
  
  public abstract UiSettings getUiSettings();
  
  public abstract void onCreate(Bundle paramBundle);
  
  public abstract void onDestroy();
  
  public abstract void onDestroyView();
  
  public abstract void onLowMemory();
  
  public abstract void onPause();
  
  public abstract void onRestart();
  
  public abstract void onResume();
  
  public abstract void onSaveInstanceState(Bundle paramBundle);
  
  public abstract void onStart();
  
  public abstract void onStop();
  
  public abstract boolean onTouchEvent(MotionEvent paramMotionEvent);
  
  public abstract void updateViewLayout(View paramView, ViewGroup.LayoutParams paramLayoutParams);
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/tencentmap/mapsdk/map/IMapView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */