package com.tencent.mm.plugin.appbrand.compat;

import com.tencent.mapsdk.raster.model.VisibleRegion;
import com.tencent.mm.plugin.appbrand.compat.a.b.g;
import com.tencent.mm.plugin.appbrand.compat.a.b.r;

final class l
  implements b.r
{
  final VisibleRegion foK;
  
  l(VisibleRegion paramVisibleRegion)
  {
    this.foK = paramVisibleRegion;
  }
  
  public final b.g adL()
  {
    return new e(this.foK.getLatLngBounds());
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/compat/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */