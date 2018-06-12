package com.tencent.tencentmap.mapsdk.a;

import android.graphics.Bitmap;
import android.graphics.Rect;
import com.tencent.map.lib.basemap.data.DoublePoint;
import com.tencent.map.lib.basemap.data.GeoPoint;
import com.tencent.map.lib.gl.model.GLIcon;
import com.tencent.map.lib.mapstructure.TappedElement;

public class iy
  implements iw
{
  protected iz a;
  protected GLIcon b;
  protected ja c;
  protected DoublePoint d = new DoublePoint();
  private gy e;
  private boolean f;
  private gf g = null;
  
  public iy()
  {
    this.f = true;
  }
  
  public iy(iz paramiz)
  {
    this.a = paramiz;
    this.b = new GLIcon(this.a.c(), this.a.a(), this.a.f(), this.a.g(), this.a.k(), this.a.l(), this.a.b());
    this.b.setFixPos(paramiz.n());
    this.b.setFastLoad(paramiz.o());
    this.b.setRotateAngle(paramiz.h());
    this.b.setAvoidAnno(paramiz.j());
    this.b.setAlpha(paramiz.e());
    this.f = true;
  }
  
  public Rect a(hh paramhh)
  {
    if ((this.b == null) || (this.a == null) || (this.a.a() == null)) {
      return null;
    }
    Object localObject1;
    Object localObject2;
    if (d())
    {
      localObject1 = a();
      localObject2 = new DoublePoint(0.0D, 0.0D);
      if (localObject1 != null)
      {
        ((DoublePoint)localObject2).x = ((GeoPoint)localObject1).getLongitudeE6();
        ((DoublePoint)localObject2).y = ((GeoPoint)localObject1).getLatitudeE6();
      }
    }
    for (this.d = ((DoublePoint)localObject2);; this.d = paramhh.b(a()))
    {
      localObject2 = new DoublePoint();
      localObject1 = new DoublePoint();
      Bitmap localBitmap = this.b.getTextureBm(this.b.getState());
      int j = localBitmap.getWidth();
      int i = localBitmap.getHeight();
      ((DoublePoint)localObject2).x = this.d.x;
      ((DoublePoint)localObject1).x = (this.d.x + j);
      ((DoublePoint)localObject2).y = this.d.y;
      ((DoublePoint)localObject1).y = (this.d.y + i);
      float f1 = this.a.f();
      j = (int)(j * f1);
      f1 = this.a.g();
      i = (int)(i * f1);
      ((DoublePoint)localObject2).x -= j;
      ((DoublePoint)localObject1).x -= j;
      ((DoublePoint)localObject2).y -= i;
      ((DoublePoint)localObject1).y -= i;
      i = this.a.k();
      j = this.a.l();
      ((DoublePoint)localObject2).x += i;
      ((DoublePoint)localObject1).x += i;
      ((DoublePoint)localObject2).y += j;
      double d1 = ((DoublePoint)localObject1).y;
      ((DoublePoint)localObject1).y = (j + d1);
      localObject2 = paramhh.a((DoublePoint)localObject2);
      paramhh = paramhh.a((DoublePoint)localObject1);
      return new Rect(((GeoPoint)localObject2).getLongitudeE6(), paramhh.getLatitudeE6(), paramhh.getLongitudeE6(), ((GeoPoint)localObject2).getLatitudeE6());
    }
  }
  
  public GeoPoint a()
  {
    return this.a.a();
  }
  
  public void a(float paramFloat)
  {
    this.a = this.a.a(paramFloat);
    if (this.b != null)
    {
      this.b.setAlpha(paramFloat);
      this.b.setDirty(true);
    }
  }
  
  public void a(float paramFloat1, float paramFloat2)
  {
    this.a = this.a.a(paramFloat1, paramFloat2);
    if (this.b != null)
    {
      this.b.setAnchor(paramFloat1, paramFloat2);
      this.b.setDirty(true);
    }
  }
  
  public void a(int paramInt)
  {
    this.a = this.a.a(paramInt);
    if (this.b != null)
    {
      this.b.setRotateAngle(paramInt);
      this.b.setDirty(true);
    }
  }
  
  public void a(GeoPoint paramGeoPoint)
  {
    this.a = this.a.a(paramGeoPoint);
    if (this.b != null)
    {
      this.b.setPosition(paramGeoPoint);
      this.b.setDirty(true);
    }
  }
  
  public void a(iz paramiz)
  {
    if (paramiz == null) {
      return;
    }
    if (this.a == null) {
      this.a = paramiz;
    }
    for (;;)
    {
      if (this.b == null) {
        this.b = new GLIcon(this.a.c(), this.a.a(), this.a.f(), this.a.g(), this.a.k(), this.a.l(), this.a.b());
      }
      this.b.setAlpha(this.a.e());
      this.b.setAnchor(this.a.f(), this.a.g());
      this.b.setRotateAngle(paramiz.h());
      this.b.setFixPos(paramiz.n());
      this.b.setFastLoad(paramiz.o());
      this.b.setAvoidAnno(paramiz.j());
      return;
      this.a.a(paramiz.e());
      this.a.a(paramiz.f(), paramiz.g());
      this.a.b(paramiz.d());
      this.a.a(paramiz.h());
      this.a.b(paramiz.m());
      this.a.c(paramiz.j());
    }
  }
  
  public void a(String paramString, Bitmap... paramVarArgs)
  {
    this.a = this.a.a(paramString, paramVarArgs);
    if (this.b != null)
    {
      this.b.update(paramString, paramVarArgs);
      this.b.setDirty(true);
    }
  }
  
  public void a(boolean paramBoolean)
  {
    this.f = paramBoolean;
  }
  
  public boolean a(hh paramhh, float paramFloat1, float paramFloat2)
  {
    boolean bool2;
    if ((!c()) || (this.a.a() == null) || (this.e == null))
    {
      bool2 = false;
      return bool2;
    }
    paramhh = this.e.f().a(paramFloat1, paramFloat2);
    if ((paramhh != null) && (paramhh.param1 == e())) {}
    for (boolean bool1 = true;; bool1 = false)
    {
      if (bool1) {
        this.b.setState(1);
      }
      for (;;)
      {
        bool2 = bool1;
        if (!bool1) {
          break;
        }
        bool2 = bool1;
        if (this.c == null) {
          break;
        }
        this.c.a(this);
        return bool1;
        this.b.setState(0);
      }
    }
  }
  
  public float b()
  {
    return this.a.g();
  }
  
  public Rect b(hh paramhh)
  {
    if ((this.b == null) || (this.a == null) || (this.a.a() == null)) {
      return null;
    }
    DoublePoint localDoublePoint;
    int j;
    int i;
    if (d())
    {
      paramhh = a();
      localDoublePoint = new DoublePoint(0.0D, 0.0D);
      if (paramhh != null)
      {
        localDoublePoint.x = paramhh.getLongitudeE6();
        localDoublePoint.y = paramhh.getLatitudeE6();
      }
      this.d = localDoublePoint;
      paramhh = new DoublePoint();
      localDoublePoint = new DoublePoint();
      Bitmap localBitmap = this.b.getTextureBm(this.b.getState());
      if (localBitmap == null) {
        break label388;
      }
      j = localBitmap.getWidth();
      i = localBitmap.getHeight();
    }
    for (;;)
    {
      paramhh.x = this.d.x;
      localDoublePoint.x = (this.d.x + j);
      paramhh.y = this.d.y;
      localDoublePoint.y = (this.d.y + i);
      j = (int)(this.a.f() * j);
      float f1 = this.a.g();
      i = (int)(i * f1);
      paramhh.x -= j;
      localDoublePoint.x -= j;
      paramhh.y -= i;
      localDoublePoint.y -= i;
      i = this.a.k();
      j = this.a.l();
      paramhh.x += i;
      localDoublePoint.x += i;
      paramhh.y += j;
      double d1 = localDoublePoint.y;
      localDoublePoint.y = (j + d1);
      return new Rect((int)paramhh.x, (int)paramhh.y, (int)localDoublePoint.x, (int)localDoublePoint.y);
      this.d = paramhh.b(a());
      break;
      label388:
      i = 0;
      j = 0;
    }
  }
  
  public void b(int paramInt)
  {
    this.a = this.a.b(paramInt);
    if (this.b != null) {
      this.b.setDirty(true);
    }
  }
  
  public void b(hs paramhs, hh paramhh)
  {
    if (!c()) {
      if (this.b != null) {
        this.b.mDisplayId = -1;
      }
    }
    for (;;)
    {
      return;
      this.e = paramhs.b();
      if (this.g != null)
      {
        if (this.g.b()) {
          break label113;
        }
        this.g.a();
      }
      while (this.b != null)
      {
        paramhs.a(this.a.a(), this.b, this.a.d(), this.a.h(), this.a.i(), this.a.p(), this.a.m());
        return;
        label113:
        this.g = null;
      }
    }
  }
  
  public void b(boolean paramBoolean)
  {
    if (this.b != null)
    {
      this.b.setFixPos(paramBoolean);
      this.b.setDirty(true);
    }
  }
  
  public boolean c()
  {
    return this.f;
  }
  
  public boolean d()
  {
    if (this.b != null) {
      return this.b.isFixPos();
    }
    return false;
  }
  
  public int e()
  {
    if (this.b != null) {
      return this.b.mDisplayId;
    }
    return -1;
  }
  
  public float f()
  {
    if (this.b != null) {
      return this.b.getLeft();
    }
    return 0.0F;
  }
  
  public float g()
  {
    if (this.b != null) {
      return this.b.getRight();
    }
    return 0.0F;
  }
  
  public float h()
  {
    if (this.b != null) {
      return this.b.getTop();
    }
    return 0.0F;
  }
  
  public float i()
  {
    if (this.b != null) {
      return this.b.getBottom();
    }
    return 0.0F;
  }
  
  public void j()
  {
    if (this.b != null) {
      this.b.mDisplayId = 0;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/iy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */