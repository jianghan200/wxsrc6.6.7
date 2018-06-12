package com.tencent.tencentmap.mapsdk.a;

import android.content.Context;
import android.os.Bundle;
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

public class pw
  implements IMapView
{
  private tw a;
  private Context b;
  private TencentMap c;
  private Projection d;
  private UiSettings e;
  
  public pw(Context paramContext, TencentMapOptions paramTencentMapOptions)
  {
    this.b = paramContext;
    ua localua = null;
    if (paramTencentMapOptions != null)
    {
      localua = new ua();
      if (paramTencentMapOptions.getExtSurface() != null) {
        localua.a(paramTencentMapOptions.getExtSurface());
      }
      localua.a(paramTencentMapOptions.isHandDrawMapEnable());
    }
    this.a = new tw(paramContext, localua);
    this.c = new qb(this.a.getMap());
    this.d = new qa(this.a.getProjection());
    this.e = new qd(this.a.getUiSettings());
  }
  
  public void addView(View paramView, MapView.LayoutParams paramLayoutParams)
  {
    if (paramLayoutParams == null) {
      return;
    }
    this.a.addView(paramView, new tw.a(paramLayoutParams.width, paramLayoutParams.height, qc.a(paramLayoutParams.point), paramLayoutParams.alignment));
  }
  
  public boolean dispatchTouchEvent(MotionEvent paramMotionEvent)
  {
    return this.a.dispatchTouchEvent(paramMotionEvent);
  }
  
  public TencentMap getMap()
  {
    return this.c;
  }
  
  public MapController getMapController()
  {
    return this.c;
  }
  
  public View getMapView()
  {
    return this.a;
  }
  
  public Projection getProjection()
  {
    return this.d;
  }
  
  public UiSettings getUiSettings()
  {
    return this.e;
  }
  
  public void onCreate(Bundle paramBundle) {}
  
  public void onDestroy()
  {
    this.a.e();
  }
  
  public void onDestroyView() {}
  
  public void onLowMemory() {}
  
  public void onPause()
  {
    this.a.b();
  }
  
  public void onRestart()
  {
    this.a.d();
  }
  
  public void onResume()
  {
    this.a.a();
  }
  
  public void onSaveInstanceState(Bundle paramBundle) {}
  
  public void onStart() {}
  
  public void onStop()
  {
    this.a.c();
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


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/pw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */