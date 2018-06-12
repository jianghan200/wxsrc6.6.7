package com.tencent.tencentmap.mapsdk.a;

import android.view.View;
import android.view.animation.Animation;
import com.tencent.mapsdk.raster.model.BitmapDescriptor;
import com.tencent.mapsdk.raster.model.LatLng;
import com.tencent.mapsdk.raster.model.Marker;

public class px
  implements Marker
{
  private qy a;
  
  public px(qy paramqy)
  {
    this.a = paramqy;
  }
  
  public float getAlpha()
  {
    if (this.a != null) {
      return this.a.a();
    }
    return 0.0F;
  }
  
  public String getId()
  {
    if (this.a != null) {
      return this.a.b();
    }
    return null;
  }
  
  public View getMarkerView()
  {
    if (this.a != null) {
      return this.a.n();
    }
    return null;
  }
  
  public LatLng getPosition()
  {
    if (this.a != null) {
      return qc.a(this.a.c());
    }
    return null;
  }
  
  public float getRotation()
  {
    if (this.a != null) {
      return this.a.d();
    }
    return 0.0F;
  }
  
  public String getSnippet()
  {
    if (this.a != null) {
      return this.a.e();
    }
    return null;
  }
  
  public Object getTag()
  {
    if (this.a != null) {
      return this.a.o();
    }
    return null;
  }
  
  public String getTitle()
  {
    if (this.a != null) {
      return this.a.f();
    }
    return null;
  }
  
  public float getZIndex()
  {
    return 0.0F;
  }
  
  public void hideInfoWindow()
  {
    if (this.a != null) {
      this.a.g();
    }
  }
  
  public boolean isDraggable()
  {
    if (this.a != null) {
      return this.a.h();
    }
    return false;
  }
  
  public boolean isInfoWindowShown()
  {
    if (this.a != null) {
      return this.a.i();
    }
    return false;
  }
  
  public boolean isVisible()
  {
    if (this.a != null) {
      return this.a.j();
    }
    return false;
  }
  
  public void remove()
  {
    if (this.a != null) {
      this.a.k();
    }
  }
  
  public void set2Top()
  {
    if (this.a != null) {
      this.a.m();
    }
  }
  
  public void setAlpha(float paramFloat)
  {
    if (this.a != null) {
      this.a.a(paramFloat);
    }
  }
  
  public void setAnchor(float paramFloat1, float paramFloat2)
  {
    if (this.a != null) {
      this.a.a(paramFloat1, paramFloat2);
    }
  }
  
  public void setDraggable(boolean paramBoolean)
  {
    if (this.a != null) {
      this.a.a(paramBoolean);
    }
  }
  
  public void setIcon(BitmapDescriptor paramBitmapDescriptor)
  {
    if ((this.a != null) && (paramBitmapDescriptor != null)) {
      this.a.a(qr.a(paramBitmapDescriptor.getBitmap()));
    }
  }
  
  public void setInfoWindowHideAnimation(Animation paramAnimation)
  {
    if (this.a != null) {
      this.a.a(paramAnimation);
    }
  }
  
  public void setInfoWindowShowAnimation(Animation paramAnimation)
  {
    if (this.a != null) {
      this.a.b(paramAnimation);
    }
  }
  
  public void setMarkerView(View paramView)
  {
    if (this.a != null) {
      this.a.a(paramView);
    }
  }
  
  public void setPosition(LatLng paramLatLng)
  {
    if (this.a != null) {
      this.a.a(qc.a(paramLatLng));
    }
  }
  
  public void setRotation(float paramFloat)
  {
    if (this.a != null) {
      this.a.b(paramFloat);
    }
  }
  
  public void setSnippet(String paramString)
  {
    if (this.a != null) {
      this.a.a(paramString);
    }
  }
  
  public void setTag(Object paramObject)
  {
    if (this.a != null) {
      this.a.a(paramObject);
    }
  }
  
  public void setTitle(String paramString)
  {
    if (this.a != null) {
      this.a.b(paramString);
    }
  }
  
  public void setVisible(boolean paramBoolean)
  {
    if (this.a != null) {
      this.a.b(paramBoolean);
    }
  }
  
  public void setZIndex(float paramFloat) {}
  
  public void showInfoWindow()
  {
    if (this.a != null) {
      this.a.l();
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/px.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */