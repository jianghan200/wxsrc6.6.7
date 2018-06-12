package com.tencent.tencentmap.mapsdk.a;

import android.graphics.Point;
import android.graphics.Rect;
import com.tencent.mapsdk.raster.model.Circle;
import com.tencent.mapsdk.raster.model.CircleOptions;
import com.tencent.mapsdk.raster.model.LatLng;
import com.tencent.mapsdk.raster.model.Marker;
import com.tencent.mapsdk.raster.model.MarkerOptions;
import com.tencent.mapsdk.raster.model.Polygon;
import com.tencent.mapsdk.raster.model.PolygonOptions;
import com.tencent.mapsdk.raster.model.Polyline;
import com.tencent.mapsdk.raster.model.PolylineOptions;
import com.tencent.tencentmap.mapsdk.map.CameraUpdate;
import com.tencent.tencentmap.mapsdk.map.CancelableCallback;
import com.tencent.tencentmap.mapsdk.map.TencentMap;
import com.tencent.tencentmap.mapsdk.map.TencentMap.InfoWindowAdapter;
import com.tencent.tencentmap.mapsdk.map.TencentMap.OnErrorListener;
import com.tencent.tencentmap.mapsdk.map.TencentMap.OnInfoWindowClickListener;
import com.tencent.tencentmap.mapsdk.map.TencentMap.OnMapCameraChangeListener;
import com.tencent.tencentmap.mapsdk.map.TencentMap.OnMapClickListener;
import com.tencent.tencentmap.mapsdk.map.TencentMap.OnMapLoadedListener;
import com.tencent.tencentmap.mapsdk.map.TencentMap.OnMapLongClickListener;
import com.tencent.tencentmap.mapsdk.map.TencentMap.OnMarkerClickListener;
import com.tencent.tencentmap.mapsdk.map.TencentMap.OnMarkerDraggedListener;
import com.tencent.tencentmap.mapsdk.map.TencentMap.OnScreenShotListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class qn
  implements TencentMap
{
  private ac a;
  private HashMap<Integer, qj> b = new HashMap();
  private List<pa> c = new ArrayList();
  private boolean d = false;
  
  public qn(ac paramac)
  {
    this.a = paramac;
  }
  
  private qj a(pa parampa)
  {
    if (parampa == null) {
      return null;
    }
    return (qj)this.b.get(Integer.valueOf(parampa.g().hashCode()));
  }
  
  protected List<pa> a()
  {
    return this.c;
  }
  
  public Circle addCircle(CircleOptions paramCircleOptions)
  {
    if (this.a == null) {}
    while (paramCircleOptions == null) {
      return null;
    }
    return new qh(this.a.a(qo.a(paramCircleOptions)));
  }
  
  public Marker addMarker(MarkerOptions paramMarkerOptions)
  {
    if (this.a == null) {}
    while (paramMarkerOptions == null) {
      return null;
    }
    paramMarkerOptions = new qj(this, this.a.a(qo.a(paramMarkerOptions)));
    this.b.put(Integer.valueOf(paramMarkerOptions.getId().hashCode()), paramMarkerOptions);
    return paramMarkerOptions;
  }
  
  public Polygon addPolygon(PolygonOptions paramPolygonOptions)
  {
    if (this.a == null) {}
    while (paramPolygonOptions == null) {
      return null;
    }
    return new ql(this.a.a(qo.a(paramPolygonOptions)));
  }
  
  public Polyline addPolyline(PolylineOptions paramPolylineOptions)
  {
    if (this.a == null) {}
    while (paramPolylineOptions == null) {
      return null;
    }
    return new qk(this.a.a(qo.a(paramPolylineOptions)));
  }
  
  public void animateCamera(CameraUpdate paramCameraUpdate)
  {
    if (this.a == null) {}
    while (paramCameraUpdate == null) {
      return;
    }
    this.a.b(qo.a(paramCameraUpdate, this.a.t()));
  }
  
  public void animateCamera(CameraUpdate paramCameraUpdate, long paramLong, CancelableCallback paramCancelableCallback)
  {
    if (this.a == null) {}
    while (paramCameraUpdate == null) {
      return;
    }
    this.a.a(qo.a(paramCameraUpdate, this.a.t()), paramLong, new qn.8(this, paramCancelableCallback));
  }
  
  public void animateTo(LatLng paramLatLng)
  {
    if (this.a == null) {}
    while (paramLatLng == null) {
      return;
    }
    this.a.b(y.a(qo.a(paramLatLng)));
  }
  
  public void animateTo(LatLng paramLatLng, long paramLong, CancelableCallback paramCancelableCallback)
  {
    if (this.a == null) {
      return;
    }
    this.a.a(y.a(qo.a(paramLatLng)), paramLong, new qn.7(this, paramCancelableCallback));
  }
  
  @Deprecated
  public void animateTo(LatLng paramLatLng, final Runnable paramRunnable)
  {
    if (this.a == null) {}
    while (paramLatLng == null) {
      return;
    }
    this.a.a(y.a(qo.a(paramLatLng)), new ac.a()
    {
      public void a()
      {
        if (paramRunnable != null) {
          paramRunnable.run();
        }
      }
      
      public void b()
      {
        if (paramRunnable != null) {
          paramRunnable.run();
        }
      }
    });
  }
  
  public void clearAllOverlays()
  {
    if (this.a != null) {
      this.a.h();
    }
  }
  
  public boolean clearCache()
  {
    return false;
  }
  
  public LatLng getMapCenter()
  {
    if (this.a == null) {
      return null;
    }
    this.a.d();
    return qo.a(this.a.d().a);
  }
  
  public int getMaxZoomLevel()
  {
    if (this.a == null) {
      return 19;
    }
    return (int)this.a.e();
  }
  
  public int getMinZoomLevel()
  {
    if (this.a == null) {
      return 4;
    }
    return (int)this.a.f();
  }
  
  public void getScreenShot(TencentMap.OnScreenShotListener paramOnScreenShotListener)
  {
    if (this.a == null) {
      return;
    }
    this.a.a(new qn.5(this, paramOnScreenShotListener));
  }
  
  @Deprecated
  public void getScreenShot(TencentMap.OnScreenShotListener paramOnScreenShotListener, Rect paramRect)
  {
    if (this.a == null) {
      return;
    }
    this.a.a(new qn.6(this, paramOnScreenShotListener));
  }
  
  public String getVersion()
  {
    if (this.a == null) {
      return null;
    }
    return this.a.u();
  }
  
  public int getZoomLevel()
  {
    if (this.a == null) {
      return -1;
    }
    return (int)this.a.d().b + qo.a;
  }
  
  public boolean isAppKeyAvailable()
  {
    return true;
  }
  
  public boolean isHandDrawMapEnable()
  {
    if (this.a == null) {
      return false;
    }
    return this.a.v();
  }
  
  public boolean isSatelliteEnabled()
  {
    return this.d;
  }
  
  public boolean isTrafficEnabled()
  {
    if (this.a == null) {
      return false;
    }
    return this.a.i();
  }
  
  public void moveCamera(CameraUpdate paramCameraUpdate)
  {
    if (this.a == null) {}
    while (paramCameraUpdate == null) {
      return;
    }
    this.a.a(qo.a(paramCameraUpdate, this.a.t()));
  }
  
  public void scrollBy(float paramFloat1, float paramFloat2)
  {
    if (this.a == null) {
      return;
    }
    this.a.b(y.a(paramFloat1, paramFloat2));
  }
  
  public void scrollBy(float paramFloat1, float paramFloat2, long paramLong, CancelableCallback paramCancelableCallback)
  {
    if (this.a == null) {
      return;
    }
    this.a.a(y.a(paramFloat1, paramFloat2), new qn.9(this, paramCancelableCallback));
  }
  
  public void set3DEnable(boolean paramBoolean)
  {
    if (this.a == null) {
      return;
    }
    this.a.e(paramBoolean);
  }
  
  public void setCenter(LatLng paramLatLng)
  {
    if (this.a == null) {}
    while (paramLatLng == null) {
      return;
    }
    this.a.a(y.a(new ox(paramLatLng.getLatitude(), paramLatLng.getLongitude())));
  }
  
  @Deprecated
  public void setErrorListener(TencentMap.OnErrorListener paramOnErrorListener)
  {
    if (this.a == null) {}
  }
  
  public void setHandDrawMapEnable(boolean paramBoolean)
  {
    if (this.a == null) {
      return;
    }
    this.a.f(paramBoolean);
  }
  
  public void setInfoWindowAdapter(TencentMap.InfoWindowAdapter paramInfoWindowAdapter)
  {
    if (this.a == null) {
      return;
    }
    this.a.a(new qn.10(this, paramInfoWindowAdapter));
  }
  
  public void setMapAnchor(float paramFloat1, float paramFloat2)
  {
    if (this.a == null) {
      return;
    }
    this.a.a(paramFloat1, paramFloat2, false);
  }
  
  public void setOnInfoWindowClickListener(TencentMap.OnInfoWindowClickListener paramOnInfoWindowClickListener)
  {
    if (this.a == null) {
      return;
    }
    this.a.a(new qn.13(this, paramOnInfoWindowClickListener));
  }
  
  public void setOnMapCameraChangeListener(TencentMap.OnMapCameraChangeListener paramOnMapCameraChangeListener)
  {
    if (this.a == null) {
      return;
    }
    this.a.a(new qn.2(this, paramOnMapCameraChangeListener));
  }
  
  public void setOnMapClickListener(TencentMap.OnMapClickListener paramOnMapClickListener)
  {
    if (this.a == null) {
      return;
    }
    this.a.a(new qn.3(this, paramOnMapClickListener));
  }
  
  public void setOnMapLoadedListener(TencentMap.OnMapLoadedListener paramOnMapLoadedListener)
  {
    if (this.a == null) {
      return;
    }
    this.a.a(new qn.12(this, paramOnMapLoadedListener));
  }
  
  public void setOnMapLongClickListener(TencentMap.OnMapLongClickListener paramOnMapLongClickListener)
  {
    if (this.a == null) {
      return;
    }
    this.a.a(new qn.4(this, paramOnMapLongClickListener));
  }
  
  public void setOnMarkerClickListener(TencentMap.OnMarkerClickListener paramOnMarkerClickListener)
  {
    if (this.a == null) {
      return;
    }
    this.a.a(new qn.14(this, paramOnMarkerClickListener));
  }
  
  public void setOnMarkerDraggedListener(TencentMap.OnMarkerDraggedListener paramOnMarkerDraggedListener)
  {
    if (this.a == null) {
      return;
    }
    this.a.a(new qn.11(this, paramOnMarkerDraggedListener));
  }
  
  public void setSatelliteEnabled(boolean paramBoolean)
  {
    if (this.a == null) {
      return;
    }
    this.d = paramBoolean;
    this.a.b(paramBoolean);
  }
  
  public void setTrafficEnabled(boolean paramBoolean)
  {
    if (this.a == null) {
      return;
    }
    this.a.a(paramBoolean);
  }
  
  public void setZoom(int paramInt)
  {
    if (this.a == null) {
      return;
    }
    this.a.a(y.a(paramInt - qo.a));
  }
  
  public void stopAnimation()
  {
    if (this.a == null) {
      return;
    }
    this.a.g();
  }
  
  public void zoomIn()
  {
    if (this.a == null) {
      return;
    }
    this.a.b(y.a());
  }
  
  public void zoomInFixing(int paramInt1, int paramInt2)
  {
    if (this.a == null) {
      return;
    }
    this.a.a(y.a(1.0F, new Point(paramInt1, paramInt2)));
  }
  
  public void zoomOut()
  {
    if (this.a == null) {
      return;
    }
    this.a.b(y.b());
  }
  
  public void zoomOutFixing(int paramInt1, int paramInt2)
  {
    if (this.a == null) {
      return;
    }
    this.a.a(y.a(-1.0F, new Point(paramInt1, paramInt2)));
  }
  
  public void zoomToSpan(double paramDouble1, double paramDouble2)
  {
    zoomToSpan(new LatLng(getMapCenter().getLatitude() - paramDouble1 / 2.0D, getMapCenter().getLongitude() + paramDouble2 / 2.0D), new LatLng(getMapCenter().getLatitude() + paramDouble1 / 2.0D, getMapCenter().getLongitude() - paramDouble2 / 2.0D));
  }
  
  public void zoomToSpan(LatLng paramLatLng1, LatLng paramLatLng2)
  {
    if (this.a == null) {
      return;
    }
    this.a.a(y.a(new oy(qo.a(paramLatLng1), qo.a(paramLatLng2)), 0));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/qn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */