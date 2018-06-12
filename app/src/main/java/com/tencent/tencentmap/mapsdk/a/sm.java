package com.tencent.tencentmap.mapsdk.a;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.GestureDetector;
import android.view.GestureDetector.OnDoubleTapListener;
import android.view.GestureDetector.OnGestureListener;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnKeyListener;
import android.view.inputmethod.InputMethodManager;
import android.widget.Scroller;

public final class sm
  implements GestureDetector.OnDoubleTapListener, GestureDetector.OnGestureListener, View.OnKeyListener
{
  private long A = 0L;
  private Point B;
  private sl a;
  private sh b;
  private sf c;
  private GestureDetector d;
  private MotionEvent e;
  private tz.e f;
  private tz.g g;
  private tz.d h;
  private tz.c i;
  private tz.a j;
  private tz.i k;
  private tz.h l;
  private float m = 1.0F;
  private float n = 1.0F;
  private float o = 1.0F;
  private boolean p = false;
  private boolean q = false;
  private boolean r = false;
  private Scroller s;
  private int t = 0;
  private int u = 0;
  private long v;
  private float w;
  private float x;
  private float y;
  private float z;
  
  public sm(sl paramsl)
  {
    this.a = paramsl;
    this.b = paramsl.c();
    this.c = paramsl.e();
    this.d = new GestureDetector(sl.a().getApplicationContext(), this);
    this.s = new Scroller(sl.a());
    new DisplayMetrics();
    paramsl = sl.a().getApplicationContext().getResources().getDisplayMetrics();
    this.t = (paramsl.widthPixels / 2);
    this.u = (paramsl.heightPixels / 2);
  }
  
  private static float c(MotionEvent paramMotionEvent)
  {
    float f1 = paramMotionEvent.getX(0) - paramMotionEvent.getX(1);
    float f2 = paramMotionEvent.getY(0) - paramMotionEvent.getY(1);
    new StringBuilder("event0.x:").append(paramMotionEvent.getX(0)).append(",event0.y:").append(paramMotionEvent.getY(0)).append(";  event1.x:").append(paramMotionEvent.getX(1)).append(",event1.y:").append(paramMotionEvent.getY(1));
    return (float)Math.sqrt(f1 * f1 + f2 * f2);
  }
  
  public final void a()
  {
    int i1;
    int i2;
    if (this.s.computeScrollOffset())
    {
      i1 = this.s.getCurrX() - this.t;
      i2 = this.s.getCurrY() - this.u;
      this.t = this.s.getCurrX();
      this.u = this.s.getCurrY();
      this.b.scrollBy(i1, i2);
      if (this.s.isFinished())
      {
        if (this.h != null) {
          a(true);
        }
        this.a.a(false, false);
      }
    }
    else
    {
      return;
    }
    if (Math.abs(i1) < 6) {
      Math.abs(i2);
    }
    this.a.a(false, false);
  }
  
  public final void a(tz.a parama)
  {
    this.j = parama;
  }
  
  public final void a(tz.c paramc)
  {
    this.i = paramc;
  }
  
  public final void a(tz.d paramd)
  {
    this.h = paramd;
  }
  
  public final void a(tz.e parame)
  {
    this.f = parame;
  }
  
  public final void a(tz.g paramg)
  {
    this.g = paramg;
  }
  
  public final void a(tz.h paramh)
  {
    this.l = paramh;
  }
  
  public final void a(tz.i parami)
  {
    this.k = parami;
  }
  
  public final void a(boolean paramBoolean)
  {
    qs localqs;
    if (this.h != null)
    {
      localqs = this.a.b().d();
      if (paramBoolean)
      {
        this.h.b(localqs);
        this.r = false;
      }
    }
    else
    {
      return;
    }
    this.h.a(localqs);
    this.r = true;
  }
  
  public final boolean a(MotionEvent paramMotionEvent)
  {
    boolean bool = false;
    int i2 = 0;
    int i1 = i2;
    label180:
    Object localObject;
    switch (paramMotionEvent.getAction() & 0xFF)
    {
    default: 
      i1 = i2;
    case 3: 
    case 4: 
    case 0: 
      for (;;)
      {
        if (i1 != 0) {
          this.A = paramMotionEvent.getEventTime();
        }
        if ((i1 == 0) && (!this.q)) {
          this.d.onTouchEvent(paramMotionEvent);
        }
        if ((paramMotionEvent.getAction() == 1) && (!this.q) && (this.h != null) && (this.s.isFinished()) && ((this.p) || (this.r))) {
          a(true);
        }
        if (i1 != 0)
        {
          paramMotionEvent.setAction(3);
          this.d.onTouchEvent(paramMotionEvent);
        }
        this.c.a(paramMotionEvent);
        bool = true;
        return bool;
        new StringBuilder("event0.x:").append(paramMotionEvent.getX(0)).append(",event0.y:").append(paramMotionEvent.getY(0));
        this.a.d().g();
        i1 = i2;
        if (this.a.f().g())
        {
          this.a.j();
          i1 = i2;
        }
      }
    case 1: 
      this.A = paramMotionEvent.getEventTime();
      if (this.a.f().g()) {
        this.a.k();
      }
      if ((paramMotionEvent.getEventTime() - this.v < 200L) && (((Math.abs(paramMotionEvent.getX(0) - this.x) < 10.0F) && (Math.abs(paramMotionEvent.getY(0) - this.z) < 10.0F)) || ((Math.abs(paramMotionEvent.getX(0) - this.w) < 10.0F) && (Math.abs(paramMotionEvent.getY(0) - this.y) < 10.0F))))
      {
        localObject = this.b.d();
        if ((this.a.f().a() >= 3) && (this.a.f().b() > 1.0F))
        {
          i1 = 1;
          label420:
          if (i1 == 0) {
            break label492;
          }
          ((rs)localObject).a(1.3D);
          label433:
          if (this.a.f().i()) {
            this.b.b(true, null);
          }
        }
      }
      break;
    }
    for (i1 = 1;; i1 = 0)
    {
      this.v = 0L;
      this.w = 0.0F;
      this.y = 0.0F;
      this.p = false;
      this.o = 0.0F;
      break;
      i1 = 0;
      break label420;
      label492:
      ((rs)localObject).a(1.0D);
      break label433;
      i1 = i2;
      if (paramMotionEvent.getPointerCount() <= 1) {
        break;
      }
      this.v = paramMotionEvent.getEventTime();
      this.x = paramMotionEvent.getX(0);
      this.z = paramMotionEvent.getY(0);
      this.w = paramMotionEvent.getX(1);
      this.y = paramMotionEvent.getY(1);
      this.o = c(paramMotionEvent);
      i1 = i2;
      break;
      i1 = i2;
      if (paramMotionEvent.getPointerCount() != 2) {
        break;
      }
      new StringBuilder("event0.x:").append(paramMotionEvent.getX(0)).append(",event0.y:").append(paramMotionEvent.getY(0)).append(";  event1.x:").append(paramMotionEvent.getX(1)).append(",event1.y:").append(paramMotionEvent.getY(1));
      if (this.q)
      {
        double d1 = Math.sqrt(this.n * this.m);
        localObject = new PointF(this.b.getWidth() / 2, this.b.getHeight() / 2);
        this.b.a((d1 - 1.0D) * 1.5D + this.b.c(), (PointF)localObject, true, 200L, rl.a.b, new sm.1(this));
      }
      this.B = null;
      i1 = i2;
      break;
      i1 = i2;
      if (paramMotionEvent.getPointerCount() <= 1) {
        break;
      }
      if (!this.a.f().i()) {
        break label180;
      }
      float f1 = c(paramMotionEvent);
      i1 = i2;
      if (f1 < 10.0F) {
        break;
      }
      if (this.o < 10.0F)
      {
        this.o = f1;
        i1 = i2;
        break;
      }
      this.m = this.n;
      this.n = (f1 / this.o);
      new StringBuilder().append(this.n);
      i1 = i2;
      if (Math.abs(this.n - 1.0F) < 0.01D) {
        break;
      }
      localObject = new PointF(this.b.getWidth() / 2, this.b.getHeight() / 2);
      this.b.a(this.n, (PointF)localObject);
      a(false);
      this.o = f1;
      this.a.a(false, false);
      this.q = true;
      i1 = 1;
      break;
    }
  }
  
  public final void b()
  {
    this.s.abortAnimation();
  }
  
  public final void b(MotionEvent paramMotionEvent)
  {
    if (this.e != null) {
      this.e.recycle();
    }
    this.e = paramMotionEvent;
    if (this.e.getAction() == 0)
    {
      if (this.B == null) {
        this.B = new Point();
      }
      this.B.x = ((int)this.e.getX());
      this.B.y = ((int)this.e.getY());
    }
  }
  
  public final MotionEvent c()
  {
    return this.e;
  }
  
  public final tz.h d()
  {
    return this.l;
  }
  
  public final tz.i e()
  {
    return this.k;
  }
  
  public final tz.c f()
  {
    return this.i;
  }
  
  public final tz.a g()
  {
    return this.j;
  }
  
  public final boolean onDoubleTap(MotionEvent paramMotionEvent)
  {
    if (!this.a.f().i()) {}
    label122:
    label128:
    for (;;)
    {
      return true;
      rs localrs = this.b.d();
      int i1;
      if ((this.a.f().a() >= 3) && (this.a.f().b() > 1.0F))
      {
        i1 = 1;
        if (i1 == 0) {
          break label122;
        }
        localrs.a(1.3D);
      }
      for (;;)
      {
        if (this.b.d().a() >= this.a.b().i().a()) {
          break label128;
        }
        this.b.a(new PointF(paramMotionEvent.getX(), paramMotionEvent.getY()), true, null);
        return true;
        i1 = 0;
        break;
        localrs.a(1.0D);
      }
    }
  }
  
  public final boolean onDoubleTapEvent(MotionEvent paramMotionEvent)
  {
    return false;
  }
  
  public final boolean onDown(MotionEvent paramMotionEvent)
  {
    this.p = false;
    return false;
  }
  
  public final boolean onFling(MotionEvent paramMotionEvent1, MotionEvent paramMotionEvent2, float paramFloat1, float paramFloat2)
  {
    this.p = false;
    if (!this.a.f().h()) {
      return true;
    }
    this.s.fling(this.t, this.u, (int)(-paramFloat1 * 0.6D), (int)(-paramFloat2 * 0.6D), -2147483647, Integer.MAX_VALUE, -2147483647, Integer.MAX_VALUE);
    this.a.a(false, false);
    return true;
  }
  
  public final boolean onKey(View paramView, int paramInt, KeyEvent paramKeyEvent)
  {
    switch (paramInt)
    {
    default: 
      return false;
    case 21: 
      this.b.scrollBy(-10, 0);
      return true;
    case 22: 
      this.b.scrollBy(10, 0);
      return true;
    case 19: 
      this.b.scrollBy(0, -10);
      return true;
    }
    this.b.scrollBy(0, 10);
    return true;
  }
  
  public final void onLongPress(MotionEvent paramMotionEvent)
  {
    this.p = false;
    qw localqw = this.a.b().a((int)paramMotionEvent.getX(), (int)paramMotionEvent.getY());
    this.c.a(sz.a(localqw), paramMotionEvent);
    if (this.g != null) {
      this.g.a(localqw);
    }
  }
  
  public final boolean onScroll(MotionEvent paramMotionEvent1, MotionEvent paramMotionEvent2, float paramFloat1, float paramFloat2)
  {
    if (!this.a.f().h()) {
      this.p = false;
    }
    while ((this.q) || (paramMotionEvent2.getEventTime() - this.A < 30L)) {
      return true;
    }
    this.p = true;
    int i1 = (int)this.e.getX();
    int i2 = (int)this.e.getY();
    if (this.B == null)
    {
      this.B = new Point();
      this.B.x = i1;
      this.B.y = i2;
      return true;
    }
    int i3 = this.B.x;
    int i4 = this.B.y;
    this.b.scrollBy(i3 - i1, i4 - i2);
    this.B.x = i1;
    this.B.y = i2;
    a(false);
    return true;
  }
  
  public final void onShowPress(MotionEvent paramMotionEvent) {}
  
  public final boolean onSingleTapConfirmed(MotionEvent paramMotionEvent)
  {
    return false;
  }
  
  public final boolean onSingleTapUp(MotionEvent paramMotionEvent)
  {
    this.p = false;
    try
    {
      paramMotionEvent = this.a.b().a((int)paramMotionEvent.getX(), (int)paramMotionEvent.getY());
      if (this.c.a(sz.a(paramMotionEvent))) {
        return true;
      }
      if (this.f != null)
      {
        this.f.a(paramMotionEvent);
        this.a.d().setFocusable(true);
        this.a.d().setFocusableInTouchMode(true);
        this.a.d().requestFocus();
        paramMotionEvent = (InputMethodManager)sl.a().getSystemService("input_method");
        if (paramMotionEvent.isActive())
        {
          paramMotionEvent.hideSoftInputFromWindow(this.a.d().getWindowToken(), 0);
          return true;
        }
      }
    }
    catch (Exception paramMotionEvent) {}
    return true;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/sm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */