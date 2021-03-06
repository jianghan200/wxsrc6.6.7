package com.tencent.tencentmap.mapsdk.a;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.PointF;
import android.os.Build.VERSION;
import android.util.DisplayMetrics;
import android.view.GestureDetector;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.widget.ImageView;

public final class sr
{
  private static int a = 0;
  private static qq b;
  private Animation A;
  private int B = 25;
  private Object C;
  private sl c;
  private Context d;
  private sm e;
  private tw f;
  private View g;
  private View h;
  private Animation i = null;
  private Animation j = null;
  private GestureDetector k;
  private qq l = null;
  private boolean m = false;
  private boolean n = false;
  private boolean o = false;
  private boolean p = false;
  private float q = 0.5F;
  private float r = 1.0F;
  private boolean s = true;
  private float t = 0.0F;
  private float u = 1.0F;
  private String v;
  private qw w;
  private String x;
  private String y;
  private Animation z;
  
  public sr(sl paramsl, qz paramqz)
  {
    this.c = paramsl;
    this.d = sl.a();
    this.f = paramsl.d();
    this.e = paramsl.h();
    this.n = paramqz.k();
    if ((paramqz.a() == null) || (this.n)) {}
    try
    {
      paramsl = st.a(paramqz.a().c(), paramqz.a().b());
      new qw(paramsl[1], paramsl[0]);
      this.w = paramqz.a();
      a(paramqz.d());
      this.g = paramqz.l();
      this.q = paramqz.e();
      this.r = paramqz.f();
      this.u = paramqz.h();
      this.t = paramqz.g();
      this.s = paramqz.j();
      this.v = paramqz.c();
      this.x = paramqz.b();
      this.m = paramqz.i();
      this.y = m();
      this.j = paramqz.p();
      this.i = paramqz.m();
      this.z = paramqz.n();
      this.A = paramqz.o();
      this.C = paramqz.q();
      this.B = ((int)(this.B * this.d.getResources().getDisplayMetrics().density));
      this.k = new GestureDetector(this.d, new sr.1(this));
      q();
      return;
    }
    catch (Exception paramsl)
    {
      for (;;)
      {
        paramqz.a();
      }
    }
  }
  
  private static boolean a(float paramFloat1, float paramFloat2, float paramFloat3)
  {
    return (paramFloat1 > paramFloat2) && (paramFloat1 <= paramFloat3);
  }
  
  private void q()
  {
    if (this.g == null)
    {
      if (this.l == null)
      {
        if (b == null) {
          b = qr.a();
        }
        this.l = b;
      }
      this.g = new ImageView(this.d);
      ((ImageView)this.g).setImageBitmap(this.l.b());
    }
    this.g.measure(0, 0);
    b(this.u);
    a(this.t);
    tw.a locala = s();
    this.f.addView(this.g, locala);
    if ((this.s) && (this.z != null))
    {
      this.g.clearAnimation();
      this.z.setAnimationListener(new sr.2(this));
      this.g.startAnimation(this.z);
      return;
    }
    r();
  }
  
  private void r()
  {
    this.g.setOnTouchListener(new sr.3(this));
  }
  
  private tw.a s()
  {
    PointF localPointF = t();
    return new tw.a(-2, -2, this.w, -(int)localPointF.x, -(int)localPointF.y, 0);
  }
  
  private PointF t()
  {
    PointF localPointF = new PointF();
    localPointF.x = (this.g.getMeasuredWidth() * this.q);
    localPointF.y = (this.g.getMeasuredHeight() * this.r);
    return localPointF;
  }
  
  private PointF u()
  {
    PointF localPointF2 = new PointF();
    PointF localPointF1;
    if (a(this.t, 45.0F, 135.0F)) {
      localPointF1 = new PointF(0.0F, this.g.getMeasuredHeight() * 0.5F);
    }
    for (;;)
    {
      PointF localPointF3 = t();
      float f1 = localPointF1.x - localPointF3.x;
      float f2 = -localPointF1.y + localPointF3.y;
      float f3 = (float)Math.sqrt(f1 * f1 + f2 * f2);
      double d2 = Math.atan(f1 / f2);
      double d1;
      if ((f1 <= 0.0F) || (f2 >= 0.0F))
      {
        d1 = d2;
        if (f1 < 0.0F)
        {
          d1 = d2;
          if (f2 >= 0.0F) {}
        }
      }
      else
      {
        d1 = d2 + 3.141592653589793D;
      }
      d1 += this.t / 180.0F * 3.141592653589793D;
      localPointF2.x = ((float)(f3 * Math.sin(d1)));
      d2 = f3;
      localPointF2.y = (-(float)(Math.cos(d1) * d2));
      return localPointF2;
      if (a(this.t, 135.0F, 225.0F)) {
        localPointF1 = new PointF(this.g.getMeasuredWidth() * 0.5F, this.g.getMeasuredHeight());
      } else if (a(this.t, 225.0F, 315.0F)) {
        localPointF1 = new PointF(this.g.getMeasuredWidth(), this.g.getMeasuredHeight() * 0.5F);
      } else {
        localPointF1 = new PointF(this.g.getMeasuredWidth() * 0.5F, 0.0F);
      }
    }
  }
  
  private void v()
  {
    if (e())
    {
      this.h.clearAnimation();
      this.f.removeView(this.h);
      Object localObject = u();
      localObject = new tw.a(-2, -2, this.w, (int)((PointF)localObject).x, (int)((PointF)localObject).y, 81);
      int i1 = this.f.indexOfChild(this.g);
      this.f.addView(this.h, i1 + 1, (ViewGroup.LayoutParams)localObject);
    }
  }
  
  private void w()
  {
    if ((e()) && ((this.h instanceof sq))) {
      ((sq)this.h).a(this.x, this.v);
    }
  }
  
  public final View a()
  {
    return this.g;
  }
  
  @SuppressLint({"NewApi"})
  public final void a(float paramFloat)
  {
    paramFloat = (paramFloat + 360.0F) % 360.0F;
    Object localObject;
    if (Build.VERSION.SDK_INT < 11)
    {
      localObject = new RotateAnimation(this.t, paramFloat, 1, this.q, 1, this.r);
      ((RotateAnimation)localObject).setFillAfter(true);
      ((RotateAnimation)localObject).setDuration(0L);
      this.g.clearAnimation();
      this.g.startAnimation((Animation)localObject);
    }
    for (;;)
    {
      this.t = paramFloat;
      v();
      return;
      localObject = t();
      this.g.setPivotX(((PointF)localObject).x);
      this.g.setPivotY(((PointF)localObject).y);
      this.g.setRotation(paramFloat);
    }
  }
  
  public final void a(float paramFloat1, float paramFloat2)
  {
    if ((this.q == paramFloat1) && (this.r == paramFloat2)) {
      return;
    }
    this.q = paramFloat1;
    this.r = paramFloat2;
    this.g.setLayoutParams(s());
    a(this.t);
    v();
  }
  
  public final void a(View paramView)
  {
    if (this.g != null)
    {
      if (this.A != null)
      {
        this.A.setAnimationListener(new sr.4(this, paramView));
        this.g.setOnTouchListener(null);
        this.g.startAnimation(this.A);
        return;
      }
      this.f.removeView(this.g);
    }
    this.g = paramView;
    q();
    v();
  }
  
  public final void a(Animation paramAnimation)
  {
    this.i = paramAnimation;
  }
  
  public final void a(qq paramqq)
  {
    this.l = paramqq;
    if ((this.g != null) && ((this.g instanceof ImageView)))
    {
      ((ImageView)this.g).setImageBitmap(this.l.b());
      this.g.measure(0, 0);
      paramqq = s();
      this.g.setLayoutParams(paramqq);
    }
  }
  
  public final void a(qw paramqw)
  {
    if (paramqw == null) {}
    do
    {
      return;
      this.w = paramqw;
      ((tw.a)this.g.getLayoutParams()).a(paramqw);
      this.f.a(this.g);
    } while (this.h == null);
    ((tw.a)this.h.getLayoutParams()).a(paramqw);
    this.f.a(this.h);
  }
  
  public final void a(Object paramObject)
  {
    this.C = paramObject;
  }
  
  public final void a(String paramString)
  {
    this.v = paramString;
    w();
  }
  
  public final void a(boolean paramBoolean)
  {
    View localView = this.g;
    if (paramBoolean) {}
    for (int i1 = 0;; i1 = 8)
    {
      localView.setVisibility(i1);
      if ((!paramBoolean) && (e())) {
        g();
      }
      this.s = paramBoolean;
      return;
    }
  }
  
  public final void b()
  {
    this.c.e().c(m());
  }
  
  public final void b(float paramFloat)
  {
    float f1;
    if (paramFloat < 0.0F)
    {
      f1 = 0.0F;
      if (Build.VERSION.SDK_INT >= 11) {
        break label73;
      }
      AlphaAnimation localAlphaAnimation = new AlphaAnimation(this.u, f1);
      localAlphaAnimation.setFillAfter(true);
      localAlphaAnimation.setDuration(0L);
      this.g.clearAnimation();
      this.g.startAnimation(localAlphaAnimation);
    }
    for (;;)
    {
      this.u = f1;
      return;
      f1 = paramFloat;
      if (paramFloat <= 1.0F) {
        break;
      }
      f1 = 1.0F;
      break;
      label73:
      this.g.setAlpha(f1);
    }
  }
  
  public final void b(Animation paramAnimation)
  {
    this.j = paramAnimation;
  }
  
  public final void b(String paramString)
  {
    this.x = paramString;
    w();
  }
  
  public final void b(boolean paramBoolean)
  {
    this.m = paramBoolean;
  }
  
  public final void c()
  {
    if (this.A != null)
    {
      this.A.setAnimationListener(new sr.5(this));
      this.g.setOnTouchListener(null);
      this.g.clearAnimation();
      this.g.startAnimation(this.A);
      return;
    }
    this.f.removeView(this.g);
    this.f.removeView(this.h);
  }
  
  public final boolean d()
  {
    return this.m;
  }
  
  public final boolean e()
  {
    return (this.h != null) && (this.h.getParent() != null);
  }
  
  public final boolean equals(Object paramObject)
  {
    if (paramObject == null) {}
    while ((!(paramObject instanceof sr)) || (paramObject.hashCode() != hashCode()) || (!((sr)paramObject).m().equals(m()))) {
      return false;
    }
    return true;
  }
  
  public final void f()
  {
    if ((e()) || (((this.e.g() == null) || (this.e.g().a(new qy(this)) == null)) && ((this.x == null) || (this.x.isEmpty())) && ((this.v == null) || (this.v.isEmpty())))) {
      return;
    }
    Object localObject;
    if (this.e.g() != null)
    {
      localObject = new qy(this);
      localObject = this.e.g().a((qy)localObject);
      if (localObject == null)
      {
        this.h = new sq(this.d, this.x, this.v);
        t();
        localObject = u();
        new StringBuilder().append(((PointF)localObject).x).append(", ").append(((PointF)localObject).y);
        localObject = new tw.a(-2, -2, this.w, (int)((PointF)localObject).x, (int)((PointF)localObject).y, 81);
        int i1 = this.f.indexOfChild(this.g);
        this.f.addView(this.h, i1 + 1, (ViewGroup.LayoutParams)localObject);
        if (this.i == null) {
          break label298;
        }
        localObject = this.i;
      }
    }
    for (;;)
    {
      this.h.startAnimation((Animation)localObject);
      this.h.setOnClickListener(new sr.6(this));
      return;
      this.h = ((View)localObject);
      break;
      this.h = new sq(this.d, this.x, this.v);
      break;
      label298:
      localObject = new AnimationSet(false);
      ScaleAnimation localScaleAnimation1 = new ScaleAnimation(0.0F, 1.1F, 0.0F, 1.1F, 1, 0.5F, 1, 1.0F);
      localScaleAnimation1.setDuration(150L);
      localScaleAnimation1.setInterpolator(new AccelerateInterpolator());
      ScaleAnimation localScaleAnimation2 = new ScaleAnimation(1.0F, 0.9F, 1.0F, 0.9F, 1, 0.5F, 1, 1.0F);
      localScaleAnimation2.setDuration(100L);
      localScaleAnimation2.setInterpolator(new DecelerateInterpolator());
      localScaleAnimation2.setStartOffset(150L);
      ((AnimationSet)localObject).addAnimation(localScaleAnimation1);
      ((AnimationSet)localObject).addAnimation(localScaleAnimation2);
    }
  }
  
  public final void g()
  {
    if (!e()) {
      return;
    }
    this.h.clearAnimation();
    Object localObject;
    if (this.j != null) {
      localObject = this.j;
    }
    for (;;)
    {
      ((Animation)localObject).setAnimationListener(new sr.7(this));
      this.h.startAnimation((Animation)localObject);
      return;
      localObject = new AnimationSet(true);
      ((AnimationSet)localObject).setInterpolator(new AccelerateInterpolator());
      ((AnimationSet)localObject).addAnimation(new AlphaAnimation(1.0F, 0.0F));
      ((AnimationSet)localObject).addAnimation(new ScaleAnimation(1.0F, 0.0F, 1.0F, 0.0F, 1, 0.5F, 1, 1.0F));
      ((AnimationSet)localObject).setDuration(100L);
    }
  }
  
  public final String h()
  {
    return this.x;
  }
  
  public final int hashCode()
  {
    return m().hashCode();
  }
  
  public final String i()
  {
    return this.v;
  }
  
  public final float j()
  {
    return this.t;
  }
  
  public final boolean k()
  {
    return this.s;
  }
  
  public final qw l()
  {
    return this.w;
  }
  
  public final String m()
  {
    if (this.y == null)
    {
      a += 1;
      this.y = ("Marker" + a);
    }
    return this.y;
  }
  
  public final void n()
  {
    if (Build.VERSION.SDK_INT < 11) {
      this.g.clearAnimation();
    }
    this.f.removeView(this.g);
    this.f.addView(this.g);
    v();
  }
  
  public final float o()
  {
    return this.u;
  }
  
  public final Object p()
  {
    return this.C;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/sr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */