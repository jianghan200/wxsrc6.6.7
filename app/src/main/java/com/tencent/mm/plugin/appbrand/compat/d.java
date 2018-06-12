package com.tencent.mm.plugin.appbrand.compat;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import com.tencent.mapsdk.raster.model.CameraPosition;
import com.tencent.mapsdk.raster.model.LatLng;
import com.tencent.mapsdk.raster.model.LatLngBounds.Builder;
import com.tencent.mapsdk.raster.model.Marker;
import com.tencent.mm.R.h;
import com.tencent.mm.plugin.appbrand.compat.a.b.b;
import com.tencent.mm.plugin.appbrand.compat.a.b.c;
import com.tencent.mm.plugin.appbrand.compat.a.b.e;
import com.tencent.mm.plugin.appbrand.compat.a.b.f;
import com.tencent.mm.plugin.appbrand.compat.a.b.h;
import com.tencent.mm.plugin.appbrand.compat.a.b.i;
import com.tencent.mm.plugin.appbrand.compat.a.b.j;
import com.tencent.mm.plugin.appbrand.compat.a.b.k;
import com.tencent.mm.plugin.appbrand.compat.a.b.l;
import com.tencent.mm.plugin.appbrand.compat.a.b.m;
import com.tencent.mm.plugin.appbrand.compat.a.b.n;
import com.tencent.mm.plugin.appbrand.compat.a.b.o;
import com.tencent.mm.plugin.appbrand.compat.a.b.p;
import com.tencent.mm.plugin.appbrand.compat.a.b.q;
import com.tencent.mm.plugin.location_soso.api.SoSoMapView;
import com.tencent.tencentmap.mapsdk.map.CameraUpdateFactory;
import com.tencent.tencentmap.mapsdk.map.TencentMap;
import com.tencent.tencentmap.mapsdk.map.TencentMap.OnMapCameraChangeListener;
import com.tencent.tencentmap.mapsdk.map.TencentMap.OnMapClickListener;
import com.tencent.tencentmap.mapsdk.map.TencentMap.OnMarkerClickListener;
import com.tencent.tencentmap.mapsdk.map.TencentMapOptions;
import com.tencent.tencentmap.mapsdk.map.UiSettings;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import junit.framework.Assert;

final class d
  implements com.tencent.mm.plugin.appbrand.compat.a.b
{
  final FrameLayout fos;
  final SoSoMapView fot;
  
  d(Context paramContext, boolean paramBoolean)
  {
    this.fos = new FrameLayout(paramContext);
    Object localObject = new FrameLayout.LayoutParams(-1, -1);
    this.fos.setBackgroundColor(0);
    this.fos.setLayoutParams((ViewGroup.LayoutParams)localObject);
    localObject = new TencentMapOptions();
    ((TencentMapOptions)localObject).setMapType(0);
    ((TencentMapOptions)localObject).enableHandDrawMap(paramBoolean);
    ((TencentMapOptions)localObject).setMapType(0);
    this.fot = new SoSoMapView(paramContext, (TencentMapOptions)localObject);
    this.fos.addView(this.fot, new FrameLayout.LayoutParams(-1, -1));
    this.fos.setTag(R.h.app_brand_map_view_controller, this);
  }
  
  public final b.b a(b.c paramc)
  {
    if ((paramc instanceof c)) {
      paramc = this.fot.getMap().addCircle(((c)paramc).jdField_for);
    }
    for (;;)
    {
      return new m.a(paramc);
      paramc = null;
      Assert.assertTrue("Should use IAppBrandMapView.createMarkersOptions to initiate CircleOptions!", true);
    }
  }
  
  public final b.h a(b.i parami)
  {
    if ((parami instanceof h)) {
      parami = this.fot.getMap().addMarker(((h)parami).foF);
    }
    for (;;)
    {
      return new g(parami);
      parami = null;
      Assert.assertTrue("Should use IAppBrandMapView.createMarkersOptions to initiate MarkerOptions!", true);
    }
  }
  
  public final b.o a(b.p paramp)
  {
    if ((paramp instanceof i)) {
      paramp = this.fot.getMap().addPolyline(((i)paramp).foG);
    }
    for (;;)
    {
      return new m.b(paramp);
      paramp = null;
      Assert.assertTrue("Should use IAppBrandMapView.createPolylineOptions to initiate PolylineOptions!", true);
    }
  }
  
  public final void a(b.e parame)
  {
    TencentMap localTencentMap = this.fot.getMap();
    if (parame == null) {}
    for (parame = null;; parame = new d.6(this, parame))
    {
      localTencentMap.setInfoWindowAdapter(parame);
      return;
    }
  }
  
  public final void a(b.j paramj)
  {
    this.fot.getMap().setOnInfoWindowClickListener(new d.4(this, paramj));
  }
  
  public final void a(final b.k paramk)
  {
    this.fot.getMap().setOnMapCameraChangeListener(new TencentMap.OnMapCameraChangeListener()
    {
      public final void onCameraChange(CameraPosition paramAnonymousCameraPosition)
      {
        if (paramk != null)
        {
          b.k localk = paramk;
          k.b(paramAnonymousCameraPosition);
          localk.adM();
        }
      }
      
      public final void onCameraChangeFinish(CameraPosition paramAnonymousCameraPosition)
      {
        if (paramk != null)
        {
          b.k localk = paramk;
          k.b(paramAnonymousCameraPosition);
          localk.adN();
        }
      }
    });
  }
  
  public final void a(final b.l paraml)
  {
    this.fot.getMap().setOnMapClickListener(new TencentMap.OnMapClickListener()
    {
      public final void onMapClick(LatLng paramAnonymousLatLng)
      {
        if (paraml != null)
        {
          b.l locall = paraml;
          k.b(paramAnonymousLatLng);
          locall.adO();
        }
      }
    });
  }
  
  public final void a(b.m paramm)
  {
    this.fot.getMap().setOnMapLoadedListener(new d.1(this, paramm));
  }
  
  public final void a(final b.n paramn)
  {
    this.fot.getMap().setOnMarkerClickListener(new TencentMap.OnMarkerClickListener()
    {
      public final boolean onMarkerClick(Marker paramAnonymousMarker)
      {
        return (paramn != null) && (paramn.c(new g(paramAnonymousMarker)));
      }
    });
  }
  
  public final b.p adA()
  {
    return new i();
  }
  
  public final void adB()
  {
    this.fot.getUiSettings().setTiltGesturesEnabled(false);
  }
  
  public final void adC()
  {
    this.fot.getUiSettings().setRotateGesturesEnabled(false);
  }
  
  public final void adD()
  {
    this.fot.getMap().setMapAnchor(0.5F, 0.5F);
  }
  
  public final void adv()
  {
    this.fot.onCreate(null);
  }
  
  public final b.f adw()
  {
    LatLng localLatLng = this.fot.getMap().getMapCenter();
    return new f(localLatLng.getLatitude(), localLatLng.getLongitude());
  }
  
  public final b.q adx()
  {
    return new j(this.fot.getProjection());
  }
  
  public final b.i ady()
  {
    return new h();
  }
  
  public final b.c adz()
  {
    return new c();
  }
  
  public final void animateTo(double paramDouble1, double paramDouble2)
  {
    this.fot.getIController().animateTo(paramDouble1, paramDouble2);
  }
  
  public final void b(double paramDouble1, double paramDouble2, int paramInt)
  {
    TencentMap localTencentMap = this.fot.getMap();
    if (localTencentMap != null) {
      localTencentMap.moveCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(paramDouble1, paramDouble2), paramInt));
    }
  }
  
  public final void clean()
  {
    this.fot.clean();
  }
  
  public final void d(List<b.f> paramList, int paramInt)
  {
    LatLngBounds.Builder localBuilder = new LatLngBounds.Builder();
    LinkedList localLinkedList = new LinkedList();
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      b.f localf = (b.f)paramList.next();
      if ((localf instanceof f)) {
        localLinkedList.add(((f)localf).foC);
      } else {
        localLinkedList.add(new LatLng(localf.adG(), localf.adH()));
      }
    }
    localBuilder.include(localLinkedList);
    this.fot.getMap().animateCamera(CameraUpdateFactory.newLatLngBounds(localBuilder.build(), paramInt));
  }
  
  public final b.f g(double paramDouble1, double paramDouble2)
  {
    return new f(paramDouble1, paramDouble2);
  }
  
  public final View getView()
  {
    return this.fos;
  }
  
  public final int getZoomLevel()
  {
    return this.fot.getMap().getZoomLevel();
  }
  
  public final void jS(int paramInt)
  {
    TencentMap localTencentMap = this.fot.getMap();
    if (localTencentMap != null) {
      localTencentMap.animateCamera(CameraUpdateFactory.zoomTo(paramInt));
    }
  }
  
  public final void onDestroy()
  {
    this.fot.onDestroy();
  }
  
  public final void onPause()
  {
    this.fot.onPause();
  }
  
  public final void onResume()
  {
    this.fot.onResume();
  }
  
  public final void setCenter(double paramDouble1, double paramDouble2)
  {
    this.fot.getIController().setCenter(paramDouble1, paramDouble2);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/appbrand/compat/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */