package com.tencent.tencentmap.mapsdk.a;

import android.graphics.Rect;
import android.view.View;
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
import java.util.HashMap;

public class qb
  implements TencentMap
{
  private tz a;
  private HashMap<Integer, px> b = new HashMap();
  
  public qb(tz paramtz)
  {
    this.a = paramtz;
  }
  
  private px a(qy paramqy)
  {
    if (paramqy == null) {
      return null;
    }
    return (px)this.b.get(Integer.valueOf(paramqy.b().hashCode()));
  }
  
  public Circle addCircle(CircleOptions paramCircleOptions)
  {
    if (paramCircleOptions == null) {
      return null;
    }
    return new pv(this.a.a(qc.a(paramCircleOptions)));
  }
  
  public Marker addMarker(MarkerOptions paramMarkerOptions)
  {
    if (paramMarkerOptions == null) {
      return null;
    }
    paramMarkerOptions = new px(this.a.a(qc.a(paramMarkerOptions)));
    this.b.put(Integer.valueOf(paramMarkerOptions.getId().hashCode()), paramMarkerOptions);
    return paramMarkerOptions;
  }
  
  public Polygon addPolygon(PolygonOptions paramPolygonOptions)
  {
    if (paramPolygonOptions == null) {}
    do
    {
      return null;
      paramPolygonOptions = qc.a(paramPolygonOptions);
    } while (paramPolygonOptions == null);
    return new pz(this.a.a(paramPolygonOptions));
  }
  
  public Polyline addPolyline(PolylineOptions paramPolylineOptions)
  {
    if (paramPolylineOptions == null) {
      return null;
    }
    return new py(this.a.a(qc.a(paramPolylineOptions)));
  }
  
  public void animateCamera(CameraUpdate paramCameraUpdate)
  {
    this.a.b(qc.a(paramCameraUpdate));
  }
  
  public void animateCamera(CameraUpdate paramCameraUpdate, long paramLong, CancelableCallback paramCancelableCallback)
  {
    this.a.a(qc.a(paramCameraUpdate), paramLong, new qb.7(this, paramCancelableCallback));
  }
  
  public void animateTo(LatLng paramLatLng)
  {
    this.a.a(qc.a(paramLatLng));
  }
  
  public void animateTo(LatLng paramLatLng, long paramLong, CancelableCallback paramCancelableCallback)
  {
    this.a.a(qc.a(paramLatLng), paramLong, new qb.1(this, paramCancelableCallback));
  }
  
  public void animateTo(LatLng paramLatLng, Runnable paramRunnable)
  {
    this.a.a(qc.a(paramLatLng), paramRunnable);
  }
  
  public void clearAllOverlays()
  {
    this.a.a();
  }
  
  public boolean clearCache()
  {
    return this.a.b();
  }
  
  public LatLng getMapCenter()
  {
    return qc.a(this.a.c());
  }
  
  public int getMaxZoomLevel()
  {
    return this.a.e();
  }
  
  public int getMinZoomLevel()
  {
    return this.a.f();
  }
  
  public void getScreenShot(TencentMap.OnScreenShotListener paramOnScreenShotListener)
  {
    this.a.a(new qb.4(this, paramOnScreenShotListener));
  }
  
  public void getScreenShot(TencentMap.OnScreenShotListener paramOnScreenShotListener, Rect paramRect)
  {
    this.a.a(new qb.5(this, paramOnScreenShotListener), paramRect);
  }
  
  public String getVersion()
  {
    return this.a.g();
  }
  
  public int getZoomLevel()
  {
    return this.a.d();
  }
  
  public boolean isAppKeyAvailable()
  {
    return this.a.h();
  }
  
  public boolean isHandDrawMapEnable()
  {
    if (this.a == null) {
      return false;
    }
    return this.a.o();
  }
  
  public boolean isSatelliteEnabled()
  {
    return this.a.i();
  }
  
  public boolean isTrafficEnabled()
  {
    return this.a.m();
  }
  
  public void moveCamera(CameraUpdate paramCameraUpdate)
  {
    this.a.a(qc.a(paramCameraUpdate));
  }
  
  public void scrollBy(float paramFloat1, float paramFloat2)
  {
    this.a.a(paramFloat1, paramFloat2);
  }
  
  public void scrollBy(float paramFloat1, float paramFloat2, long paramLong, CancelableCallback paramCancelableCallback)
  {
    this.a.a(paramFloat1, paramFloat2, paramLong, new qb.8(this, paramCancelableCallback));
  }
  
  public void set3DEnable(boolean paramBoolean) {}
  
  public void setCenter(LatLng paramLatLng)
  {
    if (paramLatLng == null) {
      return;
    }
    this.a.b(new qw(paramLatLng.getLatitude(), paramLatLng.getLongitude()));
  }
  
  public void setErrorListener(TencentMap.OnErrorListener paramOnErrorListener)
  {
    tz.a(new qb.6(this, paramOnErrorListener));
  }
  
  public void setHandDrawMapEnable(boolean paramBoolean)
  {
    if (this.a == null) {
      return;
    }
    this.a.c(paramBoolean);
  }
  
  public void setInfoWindowAdapter(final TencentMap.InfoWindowAdapter paramInfoWindowAdapter)
  {
    this.a.a(new tz.a()
    {
      public View a(qy paramAnonymousqy)
      {
        if (paramInfoWindowAdapter != null) {
          return paramInfoWindowAdapter.getInfoWindow(qb.a(qb.this, paramAnonymousqy));
        }
        return null;
      }
      
      public void a(qy paramAnonymousqy, View paramAnonymousView)
      {
        if (paramInfoWindowAdapter != null) {
          paramInfoWindowAdapter.onInfoWindowDettached(qb.a(qb.this, paramAnonymousqy), paramAnonymousView);
        }
      }
    });
  }
  
  public void setMapAnchor(float paramFloat1, float paramFloat2) {}
  
  public void setOnInfoWindowClickListener(TencentMap.OnInfoWindowClickListener paramOnInfoWindowClickListener)
  {
    this.a.a(new qb.12(this, paramOnInfoWindowClickListener));
  }
  
  public void setOnMapCameraChangeListener(TencentMap.OnMapCameraChangeListener paramOnMapCameraChangeListener)
  {
    this.a.a(new qb.14(this, paramOnMapCameraChangeListener));
  }
  
  public void setOnMapClickListener(TencentMap.OnMapClickListener paramOnMapClickListener)
  {
    this.a.a(new qb.2(this, paramOnMapClickListener));
  }
  
  public void setOnMapLoadedListener(TencentMap.OnMapLoadedListener paramOnMapLoadedListener)
  {
    this.a.a(new qb.11(this, paramOnMapLoadedListener));
  }
  
  public void setOnMapLongClickListener(TencentMap.OnMapLongClickListener paramOnMapLongClickListener)
  {
    this.a.a(new qb.3(this, paramOnMapLongClickListener));
  }
  
  public void setOnMarkerClickListener(TencentMap.OnMarkerClickListener paramOnMarkerClickListener)
  {
    this.a.a(new qb.13(this, paramOnMarkerClickListener));
  }
  
  public void setOnMarkerDraggedListener(final TencentMap.OnMarkerDraggedListener paramOnMarkerDraggedListener)
  {
    this.a.a(new tz.i()
    {
      public void a(qy paramAnonymousqy)
      {
        if (paramOnMarkerDraggedListener != null) {
          paramOnMarkerDraggedListener.onMarkerDrag(qb.a(qb.this, paramAnonymousqy));
        }
      }
      
      public void b(qy paramAnonymousqy)
      {
        if (paramOnMarkerDraggedListener != null) {
          paramOnMarkerDraggedListener.onMarkerDragEnd(qb.a(qb.this, paramAnonymousqy));
        }
      }
      
      public void c(qy paramAnonymousqy)
      {
        if (paramOnMarkerDraggedListener != null) {
          paramOnMarkerDraggedListener.onMarkerDragStart(qb.a(qb.this, paramAnonymousqy));
        }
      }
    });
  }
  
  public void setSatelliteEnabled(boolean paramBoolean)
  {
    this.a.a(paramBoolean);
  }
  
  public void setTrafficEnabled(boolean paramBoolean)
  {
    this.a.b(paramBoolean);
  }
  
  public void setZoom(int paramInt)
  {
    this.a.a(paramInt);
  }
  
  public void stopAnimation()
  {
    this.a.l();
  }
  
  public void zoomIn()
  {
    this.a.j();
  }
  
  public void zoomInFixing(int paramInt1, int paramInt2)
  {
    this.a.a(paramInt1, paramInt2);
  }
  
  public void zoomOut()
  {
    this.a.k();
  }
  
  public void zoomOutFixing(int paramInt1, int paramInt2)
  {
    this.a.b(paramInt1, paramInt2);
  }
  
  public void zoomToSpan(double paramDouble1, double paramDouble2)
  {
    this.a.a(paramDouble1, paramDouble2);
  }
  
  public void zoomToSpan(LatLng paramLatLng1, LatLng paramLatLng2)
  {
    this.a.a(qc.a(paramLatLng1), qc.a(paramLatLng2));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/qb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */