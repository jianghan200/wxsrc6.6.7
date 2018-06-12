package android.support.design.widget;

import android.content.Context;
import android.support.v4.view.o;
import android.support.v4.view.y;
import android.support.v4.view.z;
import android.support.v4.widget.q;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;

abstract class HeaderBehavior<V extends View>
  extends ViewOffsetBehavior<V>
{
  private VelocityTracker cE;
  private int cF = -1;
  private Runnable fS;
  private q fT;
  private boolean fU;
  private int fV;
  private int fW = -1;
  
  public HeaderBehavior() {}
  
  public HeaderBehavior(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  private void av()
  {
    if (this.cE == null) {
      this.cE = VelocityTracker.obtain();
    }
  }
  
  int R()
  {
    return T();
  }
  
  boolean S()
  {
    return false;
  }
  
  int a(CoordinatorLayout paramCoordinatorLayout, V paramV, int paramInt1, int paramInt2, int paramInt3)
  {
    int k = T();
    int j = 0;
    int i = j;
    if (paramInt2 != 0)
    {
      i = j;
      if (k >= paramInt2)
      {
        i = j;
        if (k <= paramInt3)
        {
          paramInt1 = n.e(paramInt1, paramInt2, paramInt3);
          i = j;
          if (k != paramInt1)
          {
            p(paramInt1);
            i = k - paramInt1;
          }
        }
      }
    }
    return i;
  }
  
  void a(CoordinatorLayout paramCoordinatorLayout, V paramV) {}
  
  final boolean a(CoordinatorLayout paramCoordinatorLayout, V paramV, int paramInt, float paramFloat)
  {
    if (this.fS != null)
    {
      paramV.removeCallbacks(this.fS);
      this.fS = null;
    }
    if (this.fT == null) {
      this.fT = q.a(paramV.getContext(), null);
    }
    this.fT.b(T(), 0, Math.round(paramFloat), 0, 0, paramInt, 0);
    if (this.fT.computeScrollOffset())
    {
      this.fS = new a(paramCoordinatorLayout, paramV);
      z.a(paramV, this.fS);
      return true;
    }
    a(paramCoordinatorLayout, paramV);
    return false;
  }
  
  public final boolean a(CoordinatorLayout paramCoordinatorLayout, V paramV, MotionEvent paramMotionEvent)
  {
    if (this.fW < 0) {
      this.fW = ViewConfiguration.get(paramCoordinatorLayout.getContext()).getScaledTouchSlop();
    }
    if ((paramMotionEvent.getAction() == 2) && (this.fU)) {
      return true;
    }
    switch (o.d(paramMotionEvent))
    {
    }
    for (;;)
    {
      if (this.cE != null) {
        this.cE.addMovement(paramMotionEvent);
      }
      return this.fU;
      this.fU = false;
      int i = (int)paramMotionEvent.getX();
      int j = (int)paramMotionEvent.getY();
      if ((S()) && (paramCoordinatorLayout.b(paramV, i, j)))
      {
        this.fV = j;
        this.cF = o.c(paramMotionEvent, 0);
        av();
        continue;
        i = this.cF;
        if (i != -1)
        {
          i = o.b(paramMotionEvent, i);
          if (i != -1)
          {
            i = (int)o.e(paramMotionEvent, i);
            if (Math.abs(i - this.fV) > this.fW)
            {
              this.fU = true;
              this.fV = i;
              continue;
              this.fU = false;
              this.cF = -1;
              if (this.cE != null)
              {
                this.cE.recycle();
                this.cE = null;
              }
            }
          }
        }
      }
    }
  }
  
  final int b(CoordinatorLayout paramCoordinatorLayout, V paramV, int paramInt1, int paramInt2, int paramInt3)
  {
    return a(paramCoordinatorLayout, paramV, R() - paramInt1, paramInt2, paramInt3);
  }
  
  int b(V paramV)
  {
    return paramV.getHeight();
  }
  
  public final boolean b(CoordinatorLayout paramCoordinatorLayout, V paramV, MotionEvent paramMotionEvent)
  {
    boolean bool2 = false;
    if (this.fW < 0) {
      this.fW = ViewConfiguration.get(paramCoordinatorLayout.getContext()).getScaledTouchSlop();
    }
    switch (o.d(paramMotionEvent))
    {
    }
    for (;;)
    {
      if (this.cE != null) {
        this.cE.addMovement(paramMotionEvent);
      }
      boolean bool1 = true;
      do
      {
        do
        {
          do
          {
            return bool1;
            i = (int)paramMotionEvent.getX();
            j = (int)paramMotionEvent.getY();
            bool1 = bool2;
          } while (!paramCoordinatorLayout.b(paramV, i, j));
          bool1 = bool2;
        } while (!S());
        this.fV = j;
        this.cF = o.c(paramMotionEvent, 0);
        av();
        break;
        i = o.b(paramMotionEvent, this.cF);
        bool1 = bool2;
      } while (i == -1);
      int k = (int)o.e(paramMotionEvent, i);
      int j = this.fV - k;
      int i = j;
      if (!this.fU)
      {
        i = j;
        if (Math.abs(j) > this.fW)
        {
          this.fU = true;
          if (j <= 0) {
            break label259;
          }
        }
      }
      label259:
      for (i = j - this.fW; this.fU; i = j + this.fW)
      {
        this.fV = k;
        b(paramCoordinatorLayout, paramV, i, c(paramV), 0);
        break;
      }
      if (this.cE != null)
      {
        this.cE.addMovement(paramMotionEvent);
        this.cE.computeCurrentVelocity(1000);
        float f = y.b(this.cE, this.cF);
        a(paramCoordinatorLayout, paramV, -b(paramV), f);
      }
      this.fU = false;
      this.cF = -1;
      if (this.cE != null)
      {
        this.cE.recycle();
        this.cE = null;
      }
    }
  }
  
  final int c(CoordinatorLayout paramCoordinatorLayout, V paramV, int paramInt)
  {
    return a(paramCoordinatorLayout, paramV, paramInt, Integer.MIN_VALUE, Integer.MAX_VALUE);
  }
  
  int c(V paramV)
  {
    return -paramV.getHeight();
  }
  
  private final class a
    implements Runnable
  {
    private final CoordinatorLayout fX;
    private final V fY;
    
    a(V paramV)
    {
      this.fX = paramV;
      View localView;
      this.fY = localView;
    }
    
    public final void run()
    {
      if ((this.fY != null) && (HeaderBehavior.a(HeaderBehavior.this) != null))
      {
        if (HeaderBehavior.a(HeaderBehavior.this).computeScrollOffset())
        {
          HeaderBehavior.this.c(this.fX, this.fY, HeaderBehavior.a(HeaderBehavior.this).getCurrY());
          z.a(this.fY, this);
        }
      }
      else {
        return;
      }
      HeaderBehavior.this.a(this.fX, this.fY);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/android/support/design/widget/HeaderBehavior.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */