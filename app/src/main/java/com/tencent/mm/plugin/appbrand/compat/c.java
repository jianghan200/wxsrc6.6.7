package com.tencent.mm.plugin.appbrand.compat;

import com.tencent.mapsdk.raster.model.CircleOptions;
import com.tencent.mapsdk.raster.model.LatLng;
import com.tencent.mm.plugin.appbrand.compat.a.b.c;

final class c
  implements b.c
{
  final CircleOptions jdField_for = new CircleOptions();
  
  public final void f(double paramDouble1, double paramDouble2)
  {
    this.jdField_for.center(new LatLng(paramDouble1, paramDouble2));
  }
  
  public final void jO(int paramInt)
  {
    this.jdField_for.radius(paramInt);
  }
  
  public final void jP(int paramInt)
  {
    this.jdField_for.strokeColor(paramInt);
  }
  
  public final void jQ(int paramInt)
  {
    this.jdField_for.strokeWidth(paramInt);
  }
  
  public final void jR(int paramInt)
  {
    this.jdField_for.fillColor(paramInt);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/appbrand/compat/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */