package com.tencent.tencentmap.mapsdk.a;

import android.graphics.Bitmap.Config;
import android.os.Handler;
import android.os.Looper;

public class nu
{
  private nz a = null;
  private ac.p b = null;
  private Handler c = new nu.1(this, Looper.getMainLooper());
  
  public nu(nz paramnz)
  {
    this.a = paramnz;
  }
  
  private void a(Handler paramHandler, Bitmap.Config paramConfig)
  {
    if (this.a == null) {
      return;
    }
    this.a.a(paramHandler, paramConfig);
  }
  
  public final int a(x paramx)
  {
    if (this.a == null) {
      return Integer.MIN_VALUE;
    }
    return this.a.a(paramx);
  }
  
  public final int a(x paramx, long paramLong, ac.a parama)
  {
    if (this.a == null) {
      return Integer.MIN_VALUE;
    }
    return this.a.a(paramx, paramLong, parama);
  }
  
  public void a()
  {
    if (this.a != null) {
      this.a = null;
    }
  }
  
  public void a(float paramFloat1, float paramFloat2, boolean paramBoolean)
  {
    if (this.a == null) {
      return;
    }
    this.a.a(paramFloat1, paramFloat2, paramBoolean);
  }
  
  public final void a(ac.c paramc)
  {
    if (this.a == null) {
      return;
    }
    this.a.a(paramc);
  }
  
  public final void a(ac.g paramg)
  {
    if (this.a == null) {
      return;
    }
    this.a.a(paramg);
  }
  
  public final void a(ac.h paramh)
  {
    if (this.a == null) {
      return;
    }
    this.a.a(paramh);
  }
  
  public void a(ac.i parami)
  {
    if (this.a != null) {
      this.a.a(parami);
    }
  }
  
  public final void a(ac.j paramj)
  {
    if (this.a == null) {
      return;
    }
    this.a.a(paramj);
  }
  
  public final void a(ac.l paraml)
  {
    if (this.a == null) {
      return;
    }
    this.a.a(paraml);
  }
  
  public void a(ac.p paramp, Bitmap.Config paramConfig)
  {
    if ((this.a == null) || (paramp == null)) {
      return;
    }
    this.b = paramp;
    a(this.c, paramConfig);
  }
  
  public final void a(boolean paramBoolean)
  {
    if (this.a == null) {
      return;
    }
    this.a.a(paramBoolean);
  }
  
  public or b()
  {
    if (this.a == null) {
      return null;
    }
    return this.a.d();
  }
  
  public final void b(boolean paramBoolean)
  {
    if (this.a == null) {
      return;
    }
    this.a.b(paramBoolean);
  }
  
  public final float c()
  {
    if (this.a == null) {
      return -1.0F;
    }
    return this.a.e();
  }
  
  public void c(boolean paramBoolean)
  {
    if (this.a != null) {
      this.a.d(paramBoolean);
    }
  }
  
  public final float d()
  {
    if (this.a == null) {
      return -1.0F;
    }
    return this.a.f();
  }
  
  public void d(boolean paramBoolean)
  {
    if (this.a == null) {
      return;
    }
    this.a.e(paramBoolean);
  }
  
  public final void e()
  {
    if (this.a == null) {
      return;
    }
    this.a.g();
  }
  
  public final boolean f()
  {
    if (this.a == null) {
      return false;
    }
    return this.a.h();
  }
  
  public void g()
  {
    if (this.a == null) {
      return;
    }
    this.a.j();
  }
  
  public void h()
  {
    if (this.a == null) {
      return;
    }
    this.a.k();
  }
  
  public void i()
  {
    if (this.a == null) {
      return;
    }
    this.a.p();
  }
  
  public void j()
  {
    if (this.a == null) {
      return;
    }
    this.a.q();
  }
  
  public void k()
  {
    if (this.a == null) {
      return;
    }
    this.a.l();
  }
  
  public void l()
  {
    if (this.a == null) {
      return;
    }
    this.a.m();
  }
  
  public String m()
  {
    if (this.a == null) {
      return "";
    }
    return this.a.n();
  }
  
  public boolean n()
  {
    if (this.a == null) {
      return false;
    }
    return this.a.t();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/nu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */