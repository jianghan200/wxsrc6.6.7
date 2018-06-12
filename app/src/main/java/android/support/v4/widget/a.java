package android.support.v4.widget;

import android.content.res.Resources;
import android.support.v4.view.o;
import android.support.v4.view.z;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;

public abstract class a
  implements View.OnTouchListener
{
  private static final int yt = ;
  private Runnable mRunnable;
  private final View me;
  private final a ye = new a();
  private final Interpolator yf = new AccelerateInterpolator();
  private float[] yg = { 0.0F, 0.0F };
  private float[] yh = { Float.MAX_VALUE, Float.MAX_VALUE };
  private int yi;
  private int yj;
  private float[] yk = { 0.0F, 0.0F };
  private float[] yl = { 0.0F, 0.0F };
  private float[] ym = { Float.MAX_VALUE, Float.MAX_VALUE };
  private boolean yn;
  private boolean yo;
  private boolean yp;
  private boolean yq;
  private boolean yr;
  private boolean ys;
  
  public a(View paramView)
  {
    this.me = paramView;
    paramView = Resources.getSystem().getDisplayMetrics();
    int i = (int)(1575.0F * paramView.density + 0.5F);
    int j = (int)(paramView.density * 315.0F + 0.5F);
    float f = i;
    this.ym[0] = (f / 1000.0F);
    this.ym[1] = (f / 1000.0F);
    f = j;
    this.yl[0] = (f / 1000.0F);
    this.yl[1] = (f / 1000.0F);
    this.yi = 1;
    this.yh[0] = Float.MAX_VALUE;
    this.yh[1] = Float.MAX_VALUE;
    this.yg[0] = 0.2F;
    this.yg[1] = 0.2F;
    this.yk[0] = 0.001F;
    this.yk[1] = 0.001F;
    this.yj = yt;
    this.ye.yu = 500;
    this.ye.yv = 500;
  }
  
  private float a(int paramInt, float paramFloat1, float paramFloat2, float paramFloat3)
  {
    float f1 = d(this.yg[paramInt] * paramFloat2, 0.0F, this.yh[paramInt]);
    float f2 = r(paramFloat1, f1);
    paramFloat1 = r(paramFloat2 - paramFloat1, f1) - f2;
    if (paramFloat1 < 0.0F) {
      paramFloat1 = -this.yf.getInterpolation(-paramFloat1);
    }
    for (paramFloat1 = d(paramFloat1, -1.0F, 1.0F);; paramFloat1 = 0.0F)
    {
      if (paramFloat1 != 0.0F) {
        break label102;
      }
      return 0.0F;
      if (paramFloat1 > 0.0F)
      {
        paramFloat1 = this.yf.getInterpolation(paramFloat1);
        break;
      }
    }
    label102:
    f2 = this.yk[paramInt];
    paramFloat2 = this.yl[paramInt];
    f1 = this.ym[paramInt];
    paramFloat3 = f2 * paramFloat3;
    if (paramFloat1 > 0.0F) {
      return d(paramFloat1 * paramFloat3, paramFloat2, f1);
    }
    return -d(-paramFloat1 * paramFloat3, paramFloat2, f1);
  }
  
  private boolean aA()
  {
    a locala = this.ye;
    int i = (int)(locala.yx / Math.abs(locala.yx));
    int j = (int)(locala.yw / Math.abs(locala.yw));
    if ((i == 0) || (!ar(i)))
    {
      if (j != 0) {}
      return false;
    }
    return true;
  }
  
  private void cy()
  {
    if (this.yo)
    {
      this.yq = false;
      return;
    }
    a locala = this.ye;
    long l = AnimationUtils.currentAnimationTimeMillis();
    int i = (int)(l - locala.mStartTime);
    int j = locala.yv;
    if (i > j) {
      i = j;
    }
    for (;;)
    {
      locala.yD = i;
      locala.yC = locala.j(l);
      locala.yB = l;
      return;
      if (i < 0) {
        i = 0;
      }
    }
  }
  
  private static float d(float paramFloat1, float paramFloat2, float paramFloat3)
  {
    if (paramFloat1 > paramFloat3) {
      return paramFloat3;
    }
    if (paramFloat1 < paramFloat2) {
      return paramFloat2;
    }
    return paramFloat1;
  }
  
  private float r(float paramFloat1, float paramFloat2)
  {
    if (paramFloat2 == 0.0F) {}
    do
    {
      do
      {
        do
        {
          return 0.0F;
          switch (this.yi)
          {
          default: 
            return 0.0F;
          }
        } while (paramFloat1 >= paramFloat2);
        if (paramFloat1 >= 0.0F) {
          return 1.0F - paramFloat1 / paramFloat2;
        }
      } while ((!this.yq) || (this.yi != 1));
      return 1.0F;
    } while (paramFloat1 >= 0.0F);
    return paramFloat1 / -paramFloat2;
  }
  
  public abstract void aq(int paramInt);
  
  public abstract boolean ar(int paramInt);
  
  public boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    if (!this.yr) {}
    for (;;)
    {
      return false;
      switch (o.d(paramMotionEvent))
      {
      }
      while ((this.ys) && (this.yq))
      {
        return true;
        this.yp = true;
        this.yn = false;
        float f1 = a(0, paramMotionEvent.getX(), paramView.getWidth(), this.me.getWidth());
        float f2 = a(1, paramMotionEvent.getY(), paramView.getHeight(), this.me.getHeight());
        paramView = this.ye;
        paramView.yw = f1;
        paramView.yx = f2;
        if ((!this.yq) && (aA()))
        {
          if (this.mRunnable == null) {
            this.mRunnable = new b((byte)0);
          }
          this.yq = true;
          this.yo = true;
          if ((!this.yn) && (this.yj > 0)) {
            z.a(this.me, this.mRunnable, this.yj);
          }
          for (;;)
          {
            this.yn = true;
            break;
            this.mRunnable.run();
          }
          cy();
        }
      }
    }
  }
  
  public final a y(boolean paramBoolean)
  {
    if ((this.yr) && (!paramBoolean)) {
      cy();
    }
    this.yr = paramBoolean;
    return this;
  }
  
  private static final class a
  {
    long mStartTime = Long.MIN_VALUE;
    int yA = 0;
    long yB = -1L;
    float yC;
    int yD;
    int yu;
    int yv;
    float yw;
    float yx;
    long yy = 0L;
    int yz = 0;
    
    final float j(long paramLong)
    {
      if (paramLong < this.mStartTime) {
        return 0.0F;
      }
      if ((this.yB < 0L) || (paramLong < this.yB)) {
        return a.y((float)(paramLong - this.mStartTime) / this.yu) * 0.5F;
      }
      long l = this.yB;
      float f1 = this.yC;
      float f2 = this.yC;
      return a.y((float)(paramLong - l) / this.yD) * f2 + (1.0F - f1);
    }
  }
  
  private final class b
    implements Runnable
  {
    private b() {}
    
    public final void run()
    {
      int j = 0;
      if (!a.a(a.this)) {
        return;
      }
      if (a.b(a.this))
      {
        a.c(a.this);
        locala = a.d(a.this);
        locala.mStartTime = AnimationUtils.currentAnimationTimeMillis();
        locala.yB = -1L;
        locala.yy = locala.mStartTime;
        locala.yC = 0.5F;
        locala.yz = 0;
        locala.yA = 0;
      }
      a.a locala = a.d(a.this);
      int i = j;
      if (locala.yB > 0L)
      {
        i = j;
        if (AnimationUtils.currentAnimationTimeMillis() > locala.yB + locala.yD) {
          i = 1;
        }
      }
      if ((i != 0) || (!a.e(a.this)))
      {
        a.f(a.this);
        return;
      }
      if (a.g(a.this))
      {
        a.h(a.this);
        a.i(a.this);
      }
      if (locala.yy == 0L) {
        throw new RuntimeException("Cannot compute scroll delta before calling start()");
      }
      long l1 = AnimationUtils.currentAnimationTimeMillis();
      float f = locala.j(l1);
      f = f * 4.0F + -4.0F * f * f;
      long l2 = l1 - locala.yy;
      locala.yy = l1;
      locala.yz = ((int)((float)l2 * f * locala.yw));
      locala.yA = ((int)(f * (float)l2 * locala.yx));
      i = locala.yA;
      a.this.aq(i);
      z.a(a.j(a.this), this);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/android/support/v4/widget/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */