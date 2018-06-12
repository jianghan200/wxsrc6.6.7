package com.tencent.tencentmap.mapsdk.a;

import com.tencent.mapsdk.raster.model.BitmapDescriptor;
import com.tencent.mapsdk.raster.model.CameraPosition;
import com.tencent.mapsdk.raster.model.CircleOptions;
import com.tencent.mapsdk.raster.model.LatLng;
import com.tencent.mapsdk.raster.model.LatLngBounds;
import com.tencent.mapsdk.raster.model.MarkerOptions;
import com.tencent.mapsdk.raster.model.PolygonOptions;
import com.tencent.mapsdk.raster.model.PolylineOptions;
import com.tencent.mapsdk.raster.model.VisibleRegion;
import com.tencent.tencentmap.mapsdk.map.CameraParameter;
import com.tencent.tencentmap.mapsdk.map.CameraUpdate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class qc
{
  public static float a(float paramFloat)
  {
    return paramFloat;
  }
  
  public static CameraPosition a(qs paramqs)
  {
    if (paramqs == null) {
      return null;
    }
    return new CameraPosition(a(paramqs.b()), b(paramqs.c()));
  }
  
  public static LatLng a(qw paramqw)
  {
    if (paramqw == null) {
      return null;
    }
    return new LatLng(paramqw.b(), paramqw.c());
  }
  
  static LatLngBounds a(qx paramqx)
  {
    if ((paramqx == null) || (paramqx.c() == null) || (paramqx.b() == null)) {
      return null;
    }
    return new LatLngBounds(new LatLng(paramqx.b().b(), paramqx.b().c()), new LatLng(paramqx.c().b(), paramqx.c().c()));
  }
  
  public static VisibleRegion a(rj paramrj)
  {
    if (paramrj == null) {
      return null;
    }
    return new VisibleRegion(a(paramrj.a()), a(paramrj.b()), a(paramrj.c()), a(paramrj.d()), a(paramrj.e()));
  }
  
  public static qs a(CameraPosition paramCameraPosition)
  {
    if (paramCameraPosition == null) {
      return null;
    }
    return new qs(a(paramCameraPosition.getTarget()), a(paramCameraPosition.getZoom()));
  }
  
  public static qu a(CircleOptions paramCircleOptions)
  {
    Object localObject;
    if (paramCircleOptions == null) {
      localObject = null;
    }
    qu localqu;
    do
    {
      return (qu)localObject;
      localqu = new qu();
      localObject = a(paramCircleOptions.getCenter());
      if (localObject != null) {
        localqu.a((qw)localObject);
      }
      localqu.a(a(paramCircleOptions.getCenter())).b(paramCircleOptions.getFillColor()).a(paramCircleOptions.getRadius()).a(paramCircleOptions.getStrokeColor()).a(paramCircleOptions.getStrokeWidth()).a(paramCircleOptions.isVisible()).b((int)paramCircleOptions.getZIndex()).b(paramCircleOptions.getStrokeDash());
      localObject = localqu;
    } while (paramCircleOptions.getStrokeDashPathEffect() == null);
    localqu.a(paramCircleOptions.getStrokeDashPathEffect());
    return localqu;
  }
  
  public static qw a(LatLng paramLatLng)
  {
    if (paramLatLng == null) {
      return null;
    }
    return new qw(paramLatLng.getLatitude(), paramLatLng.getLongitude());
  }
  
  static qx a(LatLngBounds paramLatLngBounds)
  {
    if ((paramLatLngBounds == null) || (paramLatLngBounds.getNortheast() == null) || (paramLatLngBounds.getSouthwest() == null)) {
      return null;
    }
    return new qx(new qw(paramLatLngBounds.getSouthwest().getLatitude(), paramLatLngBounds.getSouthwest().getLongitude()), new qw(paramLatLngBounds.getNortheast().getLatitude(), paramLatLngBounds.getNortheast().getLongitude()));
  }
  
  public static qz a(MarkerOptions paramMarkerOptions)
  {
    Object localObject1 = null;
    if (paramMarkerOptions == null) {}
    Object localObject2;
    do
    {
      do
      {
        return (qz)localObject1;
        localObject2 = a(paramMarkerOptions.getPosition());
      } while (localObject2 == null);
      localObject2 = new qz().a((qw)localObject2);
      ((qz)localObject2).a(paramMarkerOptions.getAlpha()).b(paramMarkerOptions.isVisible()).a(paramMarkerOptions.isDraggable()).a(paramMarkerOptions.getAnchorU(), paramMarkerOptions.getAnchorV()).b(paramMarkerOptions.getRotation());
      if (paramMarkerOptions.getIcon() != null) {
        ((qz)localObject2).a(qr.a(paramMarkerOptions.getIcon().getBitmap()));
      }
      if (paramMarkerOptions.getMarkerView() != null) {
        ((qz)localObject2).a(paramMarkerOptions.getMarkerView());
      }
      if (paramMarkerOptions.getSnippet() != null) {
        ((qz)localObject2).b(paramMarkerOptions.getSnippet());
      }
      if (paramMarkerOptions.getTitle() != null) {
        ((qz)localObject2).a(paramMarkerOptions.getTitle());
      }
      if (paramMarkerOptions.getInfoWindowHideAnimation() != null) {
        ((qz)localObject2).d(paramMarkerOptions.getInfoWindowHideAnimation());
      }
      if (paramMarkerOptions.getInfoWindowShowAnimation() != null) {
        ((qz)localObject2).a(paramMarkerOptions.getInfoWindowShowAnimation());
      }
      if (paramMarkerOptions.getShowingAnination() != null) {
        ((qz)localObject2).b(paramMarkerOptions.getShowingAnination());
      }
      if (paramMarkerOptions.getHidingAnination() != null) {
        ((qz)localObject2).c(paramMarkerOptions.getHidingAnination());
      }
      localObject1 = localObject2;
    } while (paramMarkerOptions.getTag() == null);
    ((qz)localObject2).a(paramMarkerOptions.getTag());
    return (qz)localObject2;
  }
  
  public static rb a(PolygonOptions paramPolygonOptions)
  {
    if (paramPolygonOptions == null) {}
    rb localrb;
    List localList;
    do
    {
      return null;
      localrb = new rb();
      localList = b(paramPolygonOptions.getPoints());
    } while ((localList == null) || (localList.size() <= 2));
    localrb.a(localList);
    localrb.a(paramPolygonOptions.isVisible()).b((int)paramPolygonOptions.getZIndex()).a(paramPolygonOptions.getStrokeWidth()).a(paramPolygonOptions.getStrokeColor()).b(paramPolygonOptions.getFillColor());
    return localrb;
  }
  
  public static rd a(PolylineOptions paramPolylineOptions)
  {
    if (paramPolylineOptions == null) {}
    rd localrd;
    List localList;
    do
    {
      return null;
      localrd = new rd();
      localList = b(paramPolylineOptions.getPoints());
    } while ((localList == null) || (localList.size() == 0));
    localrd.a(localList);
    localrd.d((int)paramPolylineOptions.getZIndex()).c(paramPolylineOptions.getWidth()).a(paramPolylineOptions.isVisible()).b(paramPolylineOptions.getColor()).b(paramPolylineOptions.getEdgeWidth()).a(paramPolylineOptions.getEdgeColor()).b(paramPolylineOptions.isGeodesic()).c(paramPolylineOptions.isDottedLine());
    if (paramPolylineOptions.getArrowTexture() != null)
    {
      localrd.a(new qq(paramPolylineOptions.getArrowTexture().getBitmap()));
      localrd.a(paramPolylineOptions.getArrowGap());
    }
    return localrd;
  }
  
  static tr a(CameraUpdate paramCameraUpdate)
  {
    if ((paramCameraUpdate == null) || (paramCameraUpdate.getParams() == null)) {
      return null;
    }
    CameraParameter localCameraParameter = paramCameraUpdate.getParams();
    switch (paramCameraUpdate.getParams().cameraUpdate_type)
    {
    default: 
      return null;
    case 0: 
      return ts.a();
    case 6: 
      return ts.a(a(localCameraParameter.newCameraPosition));
    case 7: 
      return ts.a(a(localCameraParameter.newLatLng));
    case 9: 
      return ts.a(a(localCameraParameter.newLatLngBounds_bounds), localCameraParameter.newLatLngBounds_padding);
    case 10: 
      return ts.a(a(localCameraParameter.newLatLngBounds_dimension_bounds), localCameraParameter.newLatLngBounds_dimension_width, localCameraParameter.newLatLngBounds_dimension_height, localCameraParameter.newLatLngBounds_dimension_padding);
    case 8: 
      return ts.a(a(localCameraParameter.newLatLngZoom_latlng), a(localCameraParameter.newLatLngZoom_zoom));
    case 2: 
      return ts.a(localCameraParameter.scrollBy_xPixel, localCameraParameter.scrollBy_yPixel);
    case 5: 
      return ts.a(localCameraParameter.zoomBy_Point_amount, localCameraParameter.zoomBy_Point_focus);
    case 4: 
      return ts.b(localCameraParameter.zoomBy_amount);
    case 1: 
      return ts.b();
    }
    return ts.a(a(localCameraParameter.zoomTo_zoom));
  }
  
  public static List<LatLng> a(List<qw> paramList)
  {
    if (paramList == null) {
      return null;
    }
    ArrayList localArrayList = new ArrayList();
    paramList = paramList.iterator();
    while (paramList.hasNext()) {
      localArrayList.add(a((qw)paramList.next()));
    }
    return localArrayList;
  }
  
  public static float b(float paramFloat)
  {
    return paramFloat;
  }
  
  public static List<qw> b(List<LatLng> paramList)
  {
    if (paramList == null) {
      return null;
    }
    ArrayList localArrayList = new ArrayList();
    paramList = paramList.iterator();
    while (paramList.hasNext()) {
      localArrayList.add(a((LatLng)paramList.next()));
    }
    return localArrayList;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/qc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */