package com.tencent.mm.plugin.appbrand.compat;

import com.tencent.mm.plugin.appbrand.compat.a.b.f;
import com.tencent.mm.plugin.appbrand.compat.a.b.q;
import com.tencent.mm.plugin.appbrand.compat.a.b.r;
import com.tencent.tencentmap.mapsdk.map.Projection;

final class j
  implements b.q
{
  final Projection foH;
  
  j(Projection paramProjection)
  {
    this.foH = paramProjection;
  }
  
  public final double a(b.f paramf1, b.f paramf2)
  {
    return this.foH.distanceBetween(f.a(paramf1), f.a(paramf2));
  }
  
  public final b.r adK()
  {
    return new l(this.foH.getVisibleRegion());
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/compat/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */