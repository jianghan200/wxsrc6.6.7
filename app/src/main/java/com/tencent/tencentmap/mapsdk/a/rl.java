package com.tencent.tencentmap.mapsdk.a;

import android.os.Handler;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;

public abstract class rl
{
  protected sl a;
  protected sh b;
  protected tt c;
  private a d = a.c;
  private Handler e = new Handler();
  private Scroller f;
  private long g;
  private float h = 0.0F;
  private boolean i = false;
  private double j = 0.0D;
  private Runnable k = new rl.1(this);
  
  public rl(sl paramsl, long paramLong, tt paramtt)
  {
    this.a = paramsl;
    this.b = paramsl.c();
    this.g = paramLong;
    this.c = paramtt;
  }
  
  public final void a()
  {
    switch (rl.2.a[this.d.ordinal()])
    {
    default: 
      this.f = new Scroller(sl.a());
    }
    for (;;)
    {
      c();
      this.i = true;
      this.f.startScroll(0, 0, 10000, 0, (int)this.g);
      this.e.postDelayed(this.k, 5L);
      this.a.a(false, false);
      return;
      this.f = new Scroller(sl.a(), new AccelerateInterpolator());
      continue;
      this.f = new Scroller(sl.a(), new DecelerateInterpolator());
      continue;
      this.f = new Scroller(sl.a(), new AccelerateDecelerateInterpolator());
    }
  }
  
  protected abstract void a(float paramFloat);
  
  public final void a(a parama)
  {
    this.d = parama;
  }
  
  public final void b()
  {
    if (this.i)
    {
      this.i = false;
      if (this.c != null) {
        this.c.b();
      }
      this.a.h().a(true);
    }
  }
  
  protected abstract void c();
  
  protected abstract void d();
  
  public static enum a
  {
    private a() {}
    
    public static a[] a()
    {
      return (a[])d.clone();
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/rl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */