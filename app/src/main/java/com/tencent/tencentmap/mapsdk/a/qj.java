package com.tencent.tencentmap.mapsdk.a;

import android.view.View;
import android.view.animation.Animation;
import com.tencent.mapsdk.raster.model.BitmapDescriptor;
import com.tencent.mapsdk.raster.model.LatLng;
import com.tencent.mapsdk.raster.model.Marker;
import java.util.Iterator;
import java.util.List;

public class qj
  implements Marker
{
  private pa a;
  private qn b;
  
  public qj(qn paramqn, pa parampa)
  {
    this.b = paramqn;
    this.a = parampa;
    if ((this.b != null) && (this.b.a() != null)) {
      try
      {
        this.b.a().add(this.a);
        return;
      }
      finally {}
    }
  }
  
  public float getAlpha()
  {
    if (this.a != null) {
      return this.a.l();
    }
    return 0.0F;
  }
  
  public String getId()
  {
    if (this.a != null) {
      return this.a.g();
    }
    return null;
  }
  
  public View getMarkerView()
  {
    return null;
  }
  
  public LatLng getPosition()
  {
    if (this.a != null) {
      return qo.a(this.a.i());
    }
    return null;
  }
  
  public float getRotation()
  {
    if (this.a != null) {
      return this.a.q();
    }
    return 0.0F;
  }
  
  public String getSnippet()
  {
    if (this.a != null) {
      return this.a.k();
    }
    return null;
  }
  
  public Object getTag()
  {
    if (this.a != null) {
      return this.a.z();
    }
    return null;
  }
  
  public String getTitle()
  {
    if (this.a != null) {
      return this.a.j();
    }
    return null;
  }
  
  public float getZIndex()
  {
    if (this.a != null) {
      return this.a.t();
    }
    return 0.0F;
  }
  
  public void hideInfoWindow()
  {
    if (this.a != null) {
      this.a.o();
    }
  }
  
  public boolean isDraggable()
  {
    if (this.a != null) {
      return this.a.m();
    }
    return false;
  }
  
  public boolean isInfoWindowShown()
  {
    if (this.a != null) {
      return this.a.p();
    }
    return false;
  }
  
  public boolean isVisible()
  {
    if (this.a != null) {
      return this.a.r();
    }
    return false;
  }
  
  public void remove()
  {
    if (this.a != null) {}
    try
    {
      if ((this.b != null) && (this.b.a() != null)) {
        this.b.a().remove(this.a);
      }
      this.a.f();
      return;
    }
    finally {}
  }
  
  public void set2Top()
  {
    if ((this.b == null) || (this.b.a() == null)) {
      return;
    }
    for (;;)
    {
      try
      {
        int i = this.b.a().size();
        Object localObject1 = this.b.a().iterator();
        if (((Iterator)localObject1).hasNext())
        {
          pa localpa = (pa)((Iterator)localObject1).next();
          if (localpa.t() <= i) {
            break label128;
          }
          i = (int)localpa.t();
          break;
        }
        localObject1 = this.a;
        if (i < Integer.MAX_VALUE)
        {
          f = i + 1;
          ((pa)localObject1).c(f);
          return;
        }
      }
      finally {}
      float f = 2.14748365E9F;
    }
    label128:
    for (;;)
    {
      break;
    }
  }
  
  public void setAlpha(float paramFloat)
  {
    if (this.a != null) {
      this.a.b(paramFloat);
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
      this.a.a(oo.a(paramBitmapDescriptor.getBitmap()));
    }
  }
  
  public void setInfoWindowHideAnimation(Animation paramAnimation) {}
  
  public void setInfoWindowShowAnimation(Animation paramAnimation) {}
  
  public void setMarkerView(View paramView)
  {
    if (this.a != null) {
      this.a.a(oo.a(paramView));
    }
  }
  
  public void setPosition(LatLng paramLatLng)
  {
    if (this.a != null) {
      this.a.a(qo.a(paramLatLng));
    }
  }
  
  public void setRotation(float paramFloat)
  {
    if (this.a != null) {
      this.a.a(paramFloat);
    }
  }
  
  public void setSnippet(String paramString)
  {
    if (this.a != null) {
      this.a.b(paramString);
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
      this.a.a(paramString);
    }
  }
  
  public void setVisible(boolean paramBoolean)
  {
    if (this.a != null) {
      this.a.b(paramBoolean);
    }
  }
  
  public void setZIndex(float paramFloat)
  {
    if (this.a != null) {
      this.a.c(paramFloat);
    }
  }
  
  public void showInfoWindow()
  {
    if (this.a != null) {
      this.a.n();
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/qj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */