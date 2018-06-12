package com.tencent.mm.plugin.appbrand.compat;

import android.view.View;
import com.tencent.mapsdk.raster.model.LatLng;
import com.tencent.mapsdk.raster.model.Marker;
import com.tencent.mm.plugin.appbrand.compat.a.b.f;
import com.tencent.mm.plugin.appbrand.compat.a.b.h;

final class g
  extends m<Marker>
  implements b.h
{
  final Marker foD;
  
  g(Marker paramMarker)
  {
    super(paramMarker);
    this.foD = paramMarker;
  }
  
  public final b.f adI()
  {
    if (this.foD == null) {
      return new g.1(this);
    }
    return new f(this.foD.getPosition());
  }
  
  public final void b(b.f paramf)
  {
    if (this.foD != null)
    {
      if ((paramf instanceof f)) {
        this.foD.setPosition(((f)paramf).foC);
      }
    }
    else {
      return;
    }
    this.foD.setPosition(new LatLng(paramf.adG(), paramf.adH()));
  }
  
  public final View getMarkerView()
  {
    if (this.foD == null) {
      return null;
    }
    return this.foD.getMarkerView();
  }
  
  public final float getRotation()
  {
    if (this.foD == null) {
      return 0.0F;
    }
    return this.foD.getRotation();
  }
  
  public final Object getTag()
  {
    if (this.foD == null) {
      return null;
    }
    return this.foD.getTag();
  }
  
  public final void hideInfoWindow()
  {
    if (this.foD != null) {
      this.foD.hideInfoWindow();
    }
  }
  
  public final boolean isInfoWindowShown()
  {
    return (this.foD != null) && (this.foD.isInfoWindowShown());
  }
  
  public final void set2Top()
  {
    if (this.foD != null) {
      this.foD.set2Top();
    }
  }
  
  public final void setRotation(float paramFloat)
  {
    if (this.foD != null) {
      this.foD.setRotation(paramFloat);
    }
  }
  
  public final void showInfoWindow()
  {
    if (this.foD != null) {
      this.foD.showInfoWindow();
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/appbrand/compat/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */