package com.tencent.tencentmap.mapsdk.a;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.ViewGroup.LayoutParams;

public final class sl
  implements rv.a, se.a
{
  public static int a = 0;
  public static int b = 0;
  public static int c = 0;
  public static int d = 0;
  public static int e = 0;
  public static int f = 0;
  public static int g = 0;
  public static int h = 0;
  private static volatile Context i;
  private static boolean x = true;
  private static volatile String z = re.a(re.b);
  private boolean A = false;
  private boolean B = false;
  private rr C;
  private rk D;
  private tw j;
  private sf k;
  private sh l;
  private sm m;
  private td.1 n;
  private tq o;
  private sg p;
  private si q;
  private sf.1 r;
  private volatile tb s;
  private ta t;
  private int u = 1;
  private tz.j v = null;
  private boolean w = false;
  private Rect y = null;
  
  public sl(tw paramtw)
  {
    i = paramtw.getContext().getApplicationContext();
    te.a().a(i);
    sy.a().a(i);
    sk.a().a(i);
    sn.l();
    this.j = paramtw;
    this.r = new sf.1(this);
    this.s = new tb(this);
    this.p = new sg(this);
    this.q = new si(this);
    this.t = new ta(this);
    this.k = new sf(this);
    this.l = new sh(this);
    this.m = new sm(this);
    this.n = new td.1(this);
    this.o = new tq(this);
    this.q.a();
    ViewGroup.LayoutParams localLayoutParams = new ViewGroup.LayoutParams(-1, -1);
    paramtw.addView(this.l, localLayoutParams);
    paramtw.addView(this.t, localLayoutParams);
    paramtw.addView(this.s, localLayoutParams);
    this.r.b(1);
    this.r.a(true);
    this.r.c(0);
    this.D = new rk();
    this.D.a();
    new rv(i, this).a();
    new se(i, this).a();
  }
  
  public static Context a()
  {
    return i;
  }
  
  public static void e(boolean paramBoolean)
  {
    x = false;
  }
  
  public static void n() {}
  
  public static boolean p()
  {
    return x;
  }
  
  public static String q()
  {
    return z;
  }
  
  private rr s()
  {
    ru[] arrayOfru = this.q.b();
    ru localru = this.l.b();
    float f1 = this.q.d().c();
    if (this.C == null) {
      this.C = new rr(localru, arrayOfru, f1);
    }
    for (;;)
    {
      return this.C;
      this.C.a(localru, arrayOfru, f1);
    }
  }
  
  public final void a(int paramInt)
  {
    this.u = paramInt;
    a(false, false);
  }
  
  public final void a(Bitmap paramBitmap)
  {
    if (this.s != null)
    {
      this.s.a(paramBitmap);
      this.s.invalidate();
    }
  }
  
  public final void a(Bundle paramBundle)
  {
    if (paramBundle != null)
    {
      this.r.d(paramBundle.getBoolean("ANIMATION_ENABLED", true));
      this.r.b(paramBundle.getBoolean("SCROLL_ENABLED", true));
      this.r.c(paramBundle.getBoolean("ZOOM_ENABLED", true));
      this.r.b(paramBundle.getInt("LOGO_POSITION", 0));
      this.r.c(paramBundle.getInt("SCALEVIEW_POSITION", 0));
      this.r.a(paramBundle.getBoolean("SCALE_CONTROLL_ENABLED", true));
      this.l.b(paramBundle.getDouble("ZOOM", this.l.c()), false, null);
      Double localDouble = Double.valueOf(paramBundle.getDouble("CENTERX", NaN.0D));
      paramBundle = Double.valueOf(paramBundle.getDouble("CENTERY", NaN.0D));
      if ((!localDouble.isNaN()) && (!paramBundle.isNaN())) {
        this.l.a(new ru(localDouble.doubleValue(), paramBundle.doubleValue()));
      }
    }
  }
  
  public final void a(tz.j paramj)
  {
    a(paramj, null);
  }
  
  public final void a(tz.j paramj, Rect paramRect)
  {
    this.v = paramj;
    this.y = paramRect;
    sz.a(this.l, 1);
    if (this.w)
    {
      o();
      return;
    }
    this.l.a(true);
    a(false, false);
  }
  
  public final void a(boolean paramBoolean)
  {
    if (paramBoolean) {
      a(false, false);
    }
  }
  
  public final void a(boolean paramBoolean1, boolean paramBoolean2)
  {
    this.w = false;
    if (this.p != null) {
      this.p.a(s());
    }
    this.n.a(paramBoolean1, paramBoolean2);
    this.j.f();
    this.j.postInvalidate();
  }
  
  public final si b()
  {
    return this.q;
  }
  
  public final void b(int paramInt)
  {
    if (this.s != null)
    {
      this.s.a(paramInt);
      this.s.invalidate();
      if (this.t.getVisibility() == 0) {
        this.t.invalidate();
      }
    }
  }
  
  public final void b(Bitmap paramBitmap)
  {
    this.j.post(new sl.2(this, paramBitmap));
  }
  
  public final void b(Bundle paramBundle)
  {
    paramBundle.putBoolean("ANIMATION_ENABLED", this.r.k());
    paramBundle.putBoolean("SCROLL_ENABLED", this.r.h());
    paramBundle.putBoolean("ZOOM_ENABLED", this.r.i());
    paramBundle.putInt("LOGO_POSITION", this.r.j());
    paramBundle.putInt("SCALEVIEW_POSITION", this.r.f());
    paramBundle.putBoolean("SCALE_CONTROLL_ENABLED", this.r.g());
    paramBundle.putDouble("ZOOM", this.l.c());
    paramBundle.putDouble("CENTERX", this.l.b().b());
    paramBundle.putDouble("CENTERY", this.l.b().a());
  }
  
  public final void b(boolean paramBoolean)
  {
    if (paramBoolean) {
      this.p.a();
    }
    sg.a(sn.j());
    this.p.a(s());
    a(false, false);
  }
  
  public final sh c()
  {
    return this.l;
  }
  
  public final void c(int paramInt)
  {
    if ((this.t != null) && (this.t.getVisibility() == 0))
    {
      this.t.a(paramInt);
      this.t.invalidate();
    }
  }
  
  public final void c(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      this.t.setVisibility(0);
      this.t.d();
      return;
    }
    ta.b();
    ta.c();
    this.t.setVisibility(8);
  }
  
  public final tw d()
  {
    return this.j;
  }
  
  protected final void d(boolean paramBoolean)
  {
    this.w = paramBoolean;
  }
  
  public final sf e()
  {
    return this.k;
  }
  
  public final sf.1 f()
  {
    return this.r;
  }
  
  protected final void f(boolean paramBoolean)
  {
    this.A = paramBoolean;
  }
  
  public final td.1 g()
  {
    return this.n;
  }
  
  public final void g(boolean paramBoolean)
  {
    if (paramBoolean != this.B)
    {
      this.B = paramBoolean;
      a(false, false);
    }
  }
  
  public final sm h()
  {
    return this.m;
  }
  
  public final tq i()
  {
    return this.o;
  }
  
  public final void j()
  {
    this.t.e();
  }
  
  public final void k()
  {
    this.t.d();
  }
  
  public final int l()
  {
    return this.u;
  }
  
  public final void m()
  {
    this.t.a();
    this.s.a();
    this.k.b();
    this.j.g();
    this.j.removeAllViews();
    this.n.a();
    this.p.b();
    sk.a().b();
    te.a().c();
    new sl.1(this).start();
    System.gc();
  }
  
  protected final void o()
  {
    if (this.v != null)
    {
      this.j.setDrawingCacheEnabled(true);
      this.j.buildDrawingCache();
      if (this.y != null) {
        break label73;
      }
    }
    label73:
    for (Bitmap localBitmap = Bitmap.createBitmap(this.j.getDrawingCache());; localBitmap = Bitmap.createBitmap(this.j.getDrawingCache(), this.y.left, this.y.top, this.y.width(), this.y.height()))
    {
      this.j.destroyDrawingCache();
      this.v.a(localBitmap);
      if (this.A) {
        sz.a(this.l, 2);
      }
      return;
    }
  }
  
  public final boolean r()
  {
    return this.B;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/sl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */