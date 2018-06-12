package com.tencent.mm.plugin.appbrand.compat;

import com.tencent.mapsdk.raster.model.LatLng;
import com.tencent.mm.plugin.appbrand.compat.a.b.f;

final class f
  implements b.f
{
  final LatLng foC;
  
  f(double paramDouble1, double paramDouble2)
  {
    this.foC = new LatLng(paramDouble1, paramDouble2);
  }
  
  f(LatLng paramLatLng)
  {
    if (paramLatLng != null)
    {
      this.foC = paramLatLng;
      return;
    }
    this.foC = new LatLng(0.0D, 0.0D);
  }
  
  static LatLng a(b.f paramf)
  {
    if ((paramf instanceof f)) {
      return ((f)paramf).foC;
    }
    return new LatLng(paramf.adG(), paramf.adH());
  }
  
  public final double adG()
  {
    return this.foC.getLatitude();
  }
  
  public final double adH()
  {
    return this.foC.getLongitude();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/appbrand/compat/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */