package com.tencent.mm.plugin.appbrand.compat;

import android.graphics.Bitmap;
import android.view.View;
import android.view.animation.Animation;
import com.tencent.mapsdk.raster.model.BitmapDescriptor;
import com.tencent.mapsdk.raster.model.LatLng;
import com.tencent.mapsdk.raster.model.MarkerOptions;
import com.tencent.mm.plugin.appbrand.compat.a.b.i;

final class h
  implements b.i
{
  final MarkerOptions foF = new MarkerOptions();
  
  public final void A(float paramFloat1, float paramFloat2)
  {
    this.foF.anchor(paramFloat1, paramFloat2);
  }
  
  public final void Y(float paramFloat)
  {
    this.foF.rotation(paramFloat);
  }
  
  public final void Z(float paramFloat)
  {
    this.foF.alpha(paramFloat);
  }
  
  public final void adJ()
  {
    this.foF.visible(true);
  }
  
  public final void bF(View paramView)
  {
    this.foF.markerView(paramView);
  }
  
  public final void bg(Object paramObject)
  {
    this.foF.tag(paramObject);
  }
  
  public final void g(Animation paramAnimation)
  {
    this.foF.infoWindowShowAnimation(paramAnimation);
  }
  
  public final void h(double paramDouble1, double paramDouble2)
  {
    this.foF.position(new LatLng(paramDouble1, paramDouble2));
  }
  
  public final void h(Animation paramAnimation)
  {
    this.foF.infoWindowHideAnimation(paramAnimation);
  }
  
  public final void rF(String paramString)
  {
    this.foF.title(paramString);
  }
  
  public final void t(Bitmap paramBitmap)
  {
    this.foF.icon(new BitmapDescriptor(paramBitmap));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/appbrand/compat/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */