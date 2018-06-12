package com.tencent.mm.plugin.appbrand.compat;

import com.tencent.mapsdk.raster.model.LatLng;
import com.tencent.mapsdk.raster.model.LatLngBounds;
import com.tencent.mm.plugin.appbrand.compat.a.b.f;
import com.tencent.mm.plugin.appbrand.compat.a.b.g;

final class e
  implements b.g
{
  final LatLngBounds foB;
  
  e(LatLngBounds paramLatLngBounds)
  {
    this.foB = paramLatLngBounds;
  }
  
  public final b.f adE()
  {
    LatLng localLatLng = this.foB.getSouthwest();
    return new f(localLatLng.getLatitude(), localLatLng.getLongitude());
  }
  
  public final b.f adF()
  {
    LatLng localLatLng = this.foB.getNortheast();
    return new f(localLatLng.getLatitude(), localLatLng.getLongitude());
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/appbrand/compat/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */