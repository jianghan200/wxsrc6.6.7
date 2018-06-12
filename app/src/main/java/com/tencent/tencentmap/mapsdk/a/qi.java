package com.tencent.tencentmap.mapsdk.a;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import com.tencent.tencentmap.mapsdk.map.IMapView;
import com.tencent.tencentmap.mapsdk.map.MapController;
import com.tencent.tencentmap.mapsdk.map.MapView.LayoutParams;
import com.tencent.tencentmap.mapsdk.map.Projection;
import com.tencent.tencentmap.mapsdk.map.TencentMap;
import com.tencent.tencentmap.mapsdk.map.TencentMapOptions;
import com.tencent.tencentmap.mapsdk.map.UiSettings;

public class qi
  implements IMapView
{
  private static float c = 1.0F;
  private aa a;
  private TencentMap b;
  
  public qi(Context paramContext, TencentMapOptions paramTencentMapOptions)
  {
    qf.a("vector MapView construct function start");
    float f = paramContext.getResources().getDisplayMetrics().density;
    c = f;
    qo.a(f);
    ad localad = null;
    if (paramTencentMapOptions != null)
    {
      localad = new ad();
      if (paramTencentMapOptions.getExtSurface() != null) {
        localad.a(paramTencentMapOptions.getExtSurface());
      }
      localad.a(paramTencentMapOptions.isHandDrawMapEnable());
    }
    this.a = new aa(paramContext, localad);
    this.b = new qn(this.a.getMap());
    this.a.getMap().l().a(false);
  }
  
  public static float a()
  {
    return c;
  }
  
  public void addView(View paramView, MapView.LayoutParams paramLayoutParams)
  {
    if (this.a.getMap() != null) {
      this.a.getMap().a(new pb().a(oo.a(paramView)).a(qo.a(paramLayoutParams.point)));
    }
  }
  
  public boolean dispatchTouchEvent(MotionEvent paramMotionEvent)
  {
    if (this.a == null) {}
    while ((!this.a.dispatchTouchEvent(paramMotionEvent)) && (!this.a.onTouchEvent(paramMotionEvent))) {
      return false;
    }
    return true;
  }
  
  public TencentMap getMap()
  {
    return this.b;
  }
  
  public MapController getMapController()
  {
    return this.b;
  }
  
  public View getMapView()
  {
    return this.a;
  }
  
  public Projection getProjection()
  {
    if (this.a.getMap() != null) {
      return new qm(this.a.getMap());
    }
    return null;
  }
  
  public UiSettings getUiSettings()
  {
    if (this.a.getMap() != null) {
      return new qp(this.a.getMap().l());
    }
    return null;
  }
  
  public void onCreate(Bundle paramBundle) {}
  
  public void onDestroy()
  {
    this.a.c();
  }
  
  public void onDestroyView() {}
  
  public void onLowMemory() {}
  
  public void onPause()
  {
    this.a.e();
  }
  
  public void onRestart()
  {
    this.a.f();
  }
  
  public void onResume()
  {
    this.a.d();
  }
  
  public void onSaveInstanceState(Bundle paramBundle) {}
  
  public void onStart()
  {
    this.a.a();
  }
  
  public void onStop()
  {
    this.a.b();
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    return paramMotionEvent.getAction() == 0;
  }
  
  public void updateViewLayout(View paramView, ViewGroup.LayoutParams paramLayoutParams)
  {
    if (this.a != null) {
      this.a.updateViewLayout(paramView, paramLayoutParams);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/qi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */