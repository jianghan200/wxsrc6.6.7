package com.tencent.tencentmap.mapsdk.a;

import android.graphics.Bitmap;
import android.graphics.Matrix;
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
import java.util.List;

public class qo
{
  public static int a = 1;
  
  public static CameraPosition a(or paramor)
  {
    if (paramor == null) {
      return null;
    }
    return new CameraPosition(a(paramor.a), c(paramor.b));
  }
  
  public static LatLng a(ox paramox)
  {
    if (paramox == null) {
      return null;
    }
    return new LatLng(paramox.a, paramox.b);
  }
  
  static LatLngBounds a(oy paramoy)
  {
    if ((paramoy == null) || (paramoy.b == null) || (paramoy.a == null)) {
      return null;
    }
    return new LatLngBounds(new LatLng(paramoy.a.a, paramoy.a.b), new LatLng(paramoy.b.a, paramoy.b.b));
  }
  
  public static VisibleRegion a(pj parampj)
  {
    if (parampj == null) {
      return null;
    }
    return new VisibleRegion(a(parampj.a), a(parampj.b), a(parampj.c), a(parampj.d), a(parampj.e));
  }
  
  public static or a(CameraPosition paramCameraPosition)
  {
    if (paramCameraPosition == null) {
      return null;
    }
    return new or(a(paramCameraPosition.getTarget()), b(paramCameraPosition.getZoom()), 0.0F, 0.0F);
  }
  
  public static ot a(CircleOptions paramCircleOptions)
  {
    if (paramCircleOptions == null) {
      return null;
    }
    ot localot = new ot();
    ox localox = a(paramCircleOptions.getCenter());
    if (localox != null) {
      localot.a(localox);
    }
    localot.a(a(paramCircleOptions.getCenter())).b(paramCircleOptions.getFillColor()).a(paramCircleOptions.getRadius()).a(paramCircleOptions.getStrokeColor()).a(paramCircleOptions.getStrokeWidth() / qi.a()).a(paramCircleOptions.isVisible()).c((int)paramCircleOptions.getZIndex());
    return localot;
  }
  
  public static ox a(LatLng paramLatLng)
  {
    if (paramLatLng == null) {
      return null;
    }
    return new ox(paramLatLng.getLatitude(), paramLatLng.getLongitude());
  }
  
  static oy a(LatLngBounds paramLatLngBounds)
  {
    if ((paramLatLngBounds == null) || (paramLatLngBounds.getNortheast() == null) || (paramLatLngBounds.getSouthwest() == null)) {
      return null;
    }
    return new oy(new ox(paramLatLngBounds.getSouthwest().getLatitude(), paramLatLngBounds.getSouthwest().getLongitude()), new ox(paramLatLngBounds.getNortheast().getLatitude(), paramLatLngBounds.getNortheast().getLongitude()));
  }
  
  public static pb a(MarkerOptions paramMarkerOptions)
  {
    Object localObject1 = null;
    if (paramMarkerOptions == null) {}
    Object localObject2;
    do
    {
      do
      {
        return (pb)localObject1;
        localObject2 = a(paramMarkerOptions.getPosition());
      } while (localObject2 == null);
      localObject2 = new pb((ox)localObject2);
      ((pb)localObject2).b(paramMarkerOptions.getAlpha()).b(paramMarkerOptions.isVisible()).a(paramMarkerOptions.isDraggable()).a(paramMarkerOptions.getAnchorU(), paramMarkerOptions.getAnchorV()).a(paramMarkerOptions.getRotation()).c(paramMarkerOptions.getZIndex());
      if (paramMarkerOptions.getIcon() != null) {
        ((pb)localObject2).a(oo.a(paramMarkerOptions.getIcon().getBitmap()));
      }
      if (paramMarkerOptions.getMarkerView() != null) {
        ((pb)localObject2).a(oo.a(paramMarkerOptions.getMarkerView()));
      }
      if (paramMarkerOptions.getSnippet() != null) {
        ((pb)localObject2).b(paramMarkerOptions.getSnippet());
      }
      if (paramMarkerOptions.getTitle() != null) {
        ((pb)localObject2).a(paramMarkerOptions.getTitle());
      }
      localObject1 = localObject2;
    } while (paramMarkerOptions.getTag() == null);
    ((pb)localObject2).a(paramMarkerOptions.getTag());
    return (pb)localObject2;
  }
  
  public static pe a(PolygonOptions paramPolygonOptions)
  {
    if (paramPolygonOptions == null) {}
    pe localpe;
    List localList;
    do
    {
      return null;
      localpe = new pe();
      localList = b(paramPolygonOptions.getPoints());
    } while ((localList == null) || (localList.size() <= 2));
    localpe.b(localList);
    localpe.a(paramPolygonOptions.isVisible()).c((int)paramPolygonOptions.getZIndex()).a(paramPolygonOptions.getStrokeWidth() / qi.a()).a(paramPolygonOptions.getStrokeColor()).b(paramPolygonOptions.getFillColor());
    return localpe;
  }
  
  public static pg a(PolylineOptions paramPolylineOptions)
  {
    if (paramPolylineOptions == null) {}
    pg localpg;
    Object localObject;
    do
    {
      return null;
      localpg = new pg();
      localObject = b(paramPolylineOptions.getPoints());
    } while ((localObject == null) || (((List)localObject).size() == 0));
    localpg.a((Iterable)localObject);
    float f = paramPolylineOptions.getWidth();
    localpg.c((int)paramPolylineOptions.getZIndex()).a(f).a(paramPolylineOptions.isVisible()).a(paramPolylineOptions.getColor()).b(paramPolylineOptions.getEdgeColor()).b(paramPolylineOptions.getEdgeWidth());
    if (paramPolylineOptions.getArrowTexture() != null)
    {
      localpg.b(true);
      localpg.d((int)paramPolylineOptions.getArrowGap());
      localObject = new Matrix();
      ((Matrix)localObject).postRotate(-90.0F);
      Bitmap localBitmap = paramPolylineOptions.getArrowTexture().getBitmap();
      localBitmap = Bitmap.createScaledBitmap(localBitmap, localBitmap.getWidth(), localBitmap.getHeight(), true);
      localpg.a(oo.a(Bitmap.createBitmap(localBitmap, 0, 0, localBitmap.getWidth(), localBitmap.getHeight(), (Matrix)localObject, true)));
    }
    if (paramPolylineOptions.isDottedLine())
    {
      localObject = new ArrayList();
      ((List)localObject).add(Integer.valueOf((int)(3.0F * paramPolylineOptions.getWidth())));
      ((List)localObject).add(Integer.valueOf((int)paramPolylineOptions.getWidth()));
      localpg.b((List)localObject);
    }
    return localpg;
  }
  
  static x a(CameraUpdate paramCameraUpdate, aa paramaa)
  {
    if ((paramCameraUpdate == null) || (paramCameraUpdate.getParams() == null)) {
      return null;
    }
    CameraParameter localCameraParameter = paramCameraUpdate.getParams();
    int j;
    int i;
    int m;
    int k;
    switch (paramCameraUpdate.getParams().cameraUpdate_type)
    {
    default: 
      return null;
    case 0: 
      return y.a();
    case 6: 
      return y.a(a(localCameraParameter.newCameraPosition));
    case 7: 
      return y.a(a(localCameraParameter.newLatLng));
    case 9: 
      return y.a(a(localCameraParameter.newLatLngBounds_bounds), localCameraParameter.newLatLngBounds_padding, localCameraParameter.newLatLngBounds_padding, localCameraParameter.newLatLngBounds_padding, localCameraParameter.newLatLngBounds_padding);
    case 10: 
      if ((paramaa != null) && (paramaa.getWidth() != 0) && (paramaa.getWidth() != 0)) {
        if (localCameraParameter.newLatLngBounds_dimension_width < paramaa.getWidth())
        {
          j = paramaa.getWidth() / 2 - (localCameraParameter.newLatLngBounds_dimension_width / 2 - localCameraParameter.newLatLngBounds_dimension_padding);
          i = j;
          if (localCameraParameter.newLatLngBounds_dimension_height < paramaa.getHeight())
          {
            m = paramaa.getHeight() / 2 - (localCameraParameter.newLatLngBounds_dimension_height / 2 - localCameraParameter.newLatLngBounds_dimension_padding);
            k = m;
          }
        }
      }
      break;
    }
    for (;;)
    {
      return y.a(a(localCameraParameter.newLatLngBounds_dimension_bounds), i, j, m, k);
      return y.a(a(localCameraParameter.newLatLngZoom_latlng), b(localCameraParameter.newLatLngZoom_zoom));
      return y.a(localCameraParameter.scrollBy_xPixel, localCameraParameter.scrollBy_yPixel);
      return y.a(localCameraParameter.zoomBy_Point_amount, localCameraParameter.zoomBy_Point_focus);
      return y.b(localCameraParameter.zoomBy_amount);
      return y.b();
      float f;
      if (localCameraParameter.zoomTo_zoom < paramaa.getMap().f()) {
        f = paramaa.getMap().f();
      }
      for (;;)
      {
        return y.a(b(f));
        if (localCameraParameter.zoomTo_zoom > paramaa.getMap().e()) {
          f = paramaa.getMap().e();
        } else {
          f = localCameraParameter.zoomTo_zoom;
        }
      }
      k = 0;
      m = 0;
      continue;
      i = 0;
      j = 0;
      break;
      k = 0;
      i = 0;
      m = 0;
      j = 0;
    }
  }
  
  public static List<LatLng> a(List<ox> paramList)
  {
    if (paramList == null) {
      return null;
    }
    paramList = (ox[])paramList.toArray(new ox[paramList.size()]);
    ArrayList localArrayList = new ArrayList();
    int j = paramList.length;
    int i = 0;
    while (i < j)
    {
      localArrayList.add(a(paramList[i]));
      i += 1;
    }
    return localArrayList;
  }
  
  public static void a(float paramFloat)
  {
    a = (int)(paramFloat / 2.0F + 0.5D);
  }
  
  public static float b(float paramFloat)
  {
    return paramFloat - a;
  }
  
  public static List<ox> b(List<LatLng> paramList)
  {
    if (paramList == null) {
      return null;
    }
    paramList = (LatLng[])paramList.toArray(new LatLng[paramList.size()]);
    ArrayList localArrayList = new ArrayList();
    int j = paramList.length;
    int i = 0;
    while (i < j)
    {
      localArrayList.add(a(paramList[i]));
      i += 1;
    }
    return localArrayList;
  }
  
  public static float c(float paramFloat)
  {
    return a + paramFloat;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/qo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */