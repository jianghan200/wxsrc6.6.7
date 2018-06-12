package com.tencent.tencentmap.mapsdk.a;

import android.graphics.PointF;
import android.graphics.Rect;
import com.tencent.map.lib.e;
import java.lang.ref.WeakReference;

public class hx
  extends ij
{
  private gy a;
  private boolean b;
  private float c;
  private e d;
  private boolean e = false;
  private final float f;
  private WeakReference<hp> g;
  
  public hx(gy paramgy)
  {
    this.a = paramgy;
    this.g = paramgy.b();
    if ((this.g != null) && (this.g.get() != null)) {
      ((hp)this.g.get()).a(this);
    }
    this.d = new e();
    this.f = (paramgy.h() * 2.5F);
  }
  
  private static float b(float paramFloat)
  {
    if (paramFloat < 5.0F) {
      return 0.2F + 0.8F * paramFloat / 5.0F;
    }
    return 1.0F + (paramFloat - 5.0F) * 4.0F / 5.0F;
  }
  
  private void l(float paramFloat1, float paramFloat2)
  {
    this.e = true;
    if (this.b) {}
    float f1;
    float f2;
    do
    {
      return;
      f1 = paramFloat1 / 64.0F;
      f2 = paramFloat2 / 64.0F;
    } while ((Math.abs(f1) < this.f) && (Math.abs(f2) < this.f));
    long l1 = Math.min(250L, Math.max(Math.abs(paramFloat1), Math.abs(paramFloat2)) >> 3);
    Object localObject = new PointF(f1, f2);
    long l2 = System.currentTimeMillis();
    this.b = true;
    localObject = new hx.4(this, 3, new double[] { 0.0D, 0.0D }, l2, l1, (PointF)localObject);
    this.a.a().b((hi)localObject);
  }
  
  private boolean m(float paramFloat1, float paramFloat2)
  {
    return this.a.c().a(this.a.d(), paramFloat1, paramFloat2);
  }
  
  public void a(e parame)
  {
    this.d = parame;
    boolean bool = parame.a();
    if ((this.g == null) || (this.g.get() != null)) {
      return;
    }
    if (bool)
    {
      ((hp)this.g.get()).b(this);
      return;
    }
    ((hp)this.g.get()).a(this);
  }
  
  public boolean a()
  {
    if (this.d.h())
    {
      ht localht = this.a.a();
      localht.b(new hx.2(this, localht));
    }
    return false;
  }
  
  public boolean a(float paramFloat)
  {
    if ((!this.d.d()) || (!this.a.a().B())) {
      return false;
    }
    double d1 = paramFloat / 8.0F * 2.0F;
    this.a.a().i(d1);
    return true;
  }
  
  public boolean a(float paramFloat1, float paramFloat2)
  {
    if (this.d.f())
    {
      ht localht = this.a.a();
      localht.a(paramFloat1, paramFloat2, new hx.1(this, localht));
    }
    return false;
  }
  
  public boolean a(PointF paramPointF1, PointF paramPointF2, double paramDouble1, double paramDouble2)
  {
    if (this.d.i())
    {
      paramDouble1 = paramDouble2 / paramDouble1;
      ht localht = this.a.a();
      localht.a(paramDouble1, paramPointF1.x, paramPointF1.y, paramPointF2.x, paramPointF2.y, new hx.3(this, localht));
    }
    return false;
  }
  
  public boolean a(PointF paramPointF1, PointF paramPointF2, float paramFloat)
  {
    if (this.d.e())
    {
      if (!this.a.a().B()) {
        return false;
      }
      this.a.a().a(paramFloat, paramPointF1.x, paramPointF1.y, paramPointF2.x, paramPointF2.y);
    }
    return false;
  }
  
  public boolean b()
  {
    if (this.b)
    {
      this.a.a().A();
      this.b = false;
    }
    return false;
  }
  
  public boolean b(float paramFloat1, float paramFloat2)
  {
    if (this.d.g()) {
      return m(paramFloat1, paramFloat2);
    }
    return false;
  }
  
  public boolean c()
  {
    return false;
  }
  
  public boolean c(float paramFloat1, float paramFloat2)
  {
    if ((this.d.b()) && (this.d.c())) {
      l(paramFloat1, paramFloat2);
    }
    return false;
  }
  
  public boolean d(float paramFloat1, float paramFloat2)
  {
    if (this.d.b()) {
      this.a.a().a(paramFloat1, paramFloat2);
    }
    return false;
  }
  
  public boolean e(float paramFloat1, float paramFloat2)
  {
    return false;
  }
  
  public boolean f(float paramFloat1, float paramFloat2)
  {
    if (this.d.f()) {
      this.c = this.a.a().l();
    }
    return false;
  }
  
  public boolean g(float paramFloat1, float paramFloat2)
  {
    if (this.d.f()) {
      this.a.a().j(b((1.0F - paramFloat2 / this.a.g().height()) * 10.0F) * this.c);
    }
    return true;
  }
  
  public boolean h(float paramFloat1, float paramFloat2)
  {
    return false;
  }
  
  public boolean i(float paramFloat1, float paramFloat2)
  {
    if (this.b)
    {
      this.a.a().A();
      this.b = false;
    }
    return false;
  }
  
  public boolean j(float paramFloat1, float paramFloat2)
  {
    return false;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/hx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */