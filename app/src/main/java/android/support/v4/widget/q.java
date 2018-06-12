package android.support.v4.widget;

import android.content.Context;
import android.os.Build.VERSION;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import android.widget.Scroller;

public final class q
{
  Object Bd;
  a Be;
  
  private q(int paramInt, Context paramContext, Interpolator paramInterpolator)
  {
    if (paramInt >= 14) {
      this.Be = new d();
    }
    for (;;)
    {
      this.Bd = this.Be.b(paramContext, paramInterpolator);
      return;
      if (paramInt >= 9) {
        this.Be = new c();
      } else {
        this.Be = new b();
      }
    }
  }
  
  public static q a(Context paramContext, Interpolator paramInterpolator)
  {
    return new q(Build.VERSION.SDK_INT, paramContext, paramInterpolator);
  }
  
  public final void abortAnimation()
  {
    this.Be.Q(this.Bd);
  }
  
  public final void b(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7)
  {
    this.Be.a(this.Bd, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7);
  }
  
  public final boolean computeScrollOffset()
  {
    return this.Be.P(this.Bd);
  }
  
  public final float getCurrVelocity()
  {
    return this.Be.O(this.Bd);
  }
  
  public final int getCurrX()
  {
    return this.Be.M(this.Bd);
  }
  
  public final int getCurrY()
  {
    return this.Be.N(this.Bd);
  }
  
  public final int getFinalX()
  {
    return this.Be.R(this.Bd);
  }
  
  public final int getFinalY()
  {
    return this.Be.S(this.Bd);
  }
  
  public final boolean i(int paramInt1, int paramInt2, int paramInt3)
  {
    return this.Be.b(this.Bd, paramInt1, paramInt2, paramInt3);
  }
  
  public final boolean isFinished()
  {
    return this.Be.J(this.Bd);
  }
  
  public final void startScroll(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    this.Be.a(this.Bd, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
  }
  
  static abstract interface a
  {
    public abstract boolean J(Object paramObject);
    
    public abstract int M(Object paramObject);
    
    public abstract int N(Object paramObject);
    
    public abstract float O(Object paramObject);
    
    public abstract boolean P(Object paramObject);
    
    public abstract void Q(Object paramObject);
    
    public abstract int R(Object paramObject);
    
    public abstract int S(Object paramObject);
    
    public abstract void a(Object paramObject, int paramInt1, int paramInt2, int paramInt3);
    
    public abstract void a(Object paramObject, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5);
    
    public abstract void a(Object paramObject, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7);
    
    public abstract Object b(Context paramContext, Interpolator paramInterpolator);
    
    public abstract void b(Object paramObject, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5);
    
    public abstract boolean b(Object paramObject, int paramInt1, int paramInt2, int paramInt3);
  }
  
  static final class b
    implements q.a
  {
    public final boolean J(Object paramObject)
    {
      return ((Scroller)paramObject).isFinished();
    }
    
    public final int M(Object paramObject)
    {
      return ((Scroller)paramObject).getCurrX();
    }
    
    public final int N(Object paramObject)
    {
      return ((Scroller)paramObject).getCurrY();
    }
    
    public final float O(Object paramObject)
    {
      return 0.0F;
    }
    
    public final boolean P(Object paramObject)
    {
      return ((Scroller)paramObject).computeScrollOffset();
    }
    
    public final void Q(Object paramObject)
    {
      ((Scroller)paramObject).abortAnimation();
    }
    
    public final int R(Object paramObject)
    {
      return ((Scroller)paramObject).getFinalX();
    }
    
    public final int S(Object paramObject)
    {
      return ((Scroller)paramObject).getFinalY();
    }
    
    public final void a(Object paramObject, int paramInt1, int paramInt2, int paramInt3)
    {
      ((Scroller)paramObject).startScroll(paramInt1, paramInt2, 0, paramInt3);
    }
    
    public final void a(Object paramObject, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
    {
      ((Scroller)paramObject).startScroll(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
    }
    
    public final void a(Object paramObject, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7)
    {
      ((Scroller)paramObject).fling(0, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7);
    }
    
    public final Object b(Context paramContext, Interpolator paramInterpolator)
    {
      if (paramInterpolator != null) {
        return new Scroller(paramContext, paramInterpolator);
      }
      return new Scroller(paramContext);
    }
    
    public final void b(Object paramObject, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
    {
      ((Scroller)paramObject).fling(paramInt1, paramInt2, 0, paramInt3, 0, 0, 0, paramInt4);
    }
    
    public final boolean b(Object paramObject, int paramInt1, int paramInt2, int paramInt3)
    {
      return false;
    }
  }
  
  static class c
    implements q.a
  {
    public final boolean J(Object paramObject)
    {
      return ((OverScroller)paramObject).isFinished();
    }
    
    public final int M(Object paramObject)
    {
      return ((OverScroller)paramObject).getCurrX();
    }
    
    public final int N(Object paramObject)
    {
      return ((OverScroller)paramObject).getCurrY();
    }
    
    public float O(Object paramObject)
    {
      return 0.0F;
    }
    
    public final boolean P(Object paramObject)
    {
      return ((OverScroller)paramObject).computeScrollOffset();
    }
    
    public final void Q(Object paramObject)
    {
      ((OverScroller)paramObject).abortAnimation();
    }
    
    public final int R(Object paramObject)
    {
      return ((OverScroller)paramObject).getFinalX();
    }
    
    public final int S(Object paramObject)
    {
      return ((OverScroller)paramObject).getFinalY();
    }
    
    public final void a(Object paramObject, int paramInt1, int paramInt2, int paramInt3)
    {
      ((OverScroller)paramObject).startScroll(paramInt1, paramInt2, 0, paramInt3);
    }
    
    public final void a(Object paramObject, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
    {
      ((OverScroller)paramObject).startScroll(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
    }
    
    public final void a(Object paramObject, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7)
    {
      ((OverScroller)paramObject).fling(0, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7);
    }
    
    public final Object b(Context paramContext, Interpolator paramInterpolator)
    {
      if (paramInterpolator != null) {
        return new OverScroller(paramContext, paramInterpolator);
      }
      return new OverScroller(paramContext);
    }
    
    public final void b(Object paramObject, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
    {
      ((OverScroller)paramObject).fling(paramInt1, paramInt2, 0, paramInt3, 0, 0, 0, paramInt4, 0, paramInt5);
    }
    
    public final boolean b(Object paramObject, int paramInt1, int paramInt2, int paramInt3)
    {
      return ((OverScroller)paramObject).springBack(paramInt1, paramInt2, 0, 0, 0, paramInt3);
    }
  }
  
  static final class d
    extends q.c
  {
    public final float O(Object paramObject)
    {
      return ((OverScroller)paramObject).getCurrVelocity();
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/android/support/v4/widget/q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */