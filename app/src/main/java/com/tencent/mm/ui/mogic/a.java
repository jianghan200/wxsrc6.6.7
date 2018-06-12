package com.tencent.mm.ui.mogic;

import android.content.Context;
import android.content.res.Resources;
import android.support.v4.view.o;
import android.support.v4.view.y;
import android.support.v4.widget.q;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import com.tencent.mm.sdk.platformtools.x;
import java.util.Arrays;

public final class a
{
  private static final Interpolator vY = new Interpolator()
  {
    public final float getInterpolation(float paramAnonymousFloat)
    {
      paramAnonymousFloat -= 1.0F;
      return paramAnonymousFloat * (paramAnonymousFloat * paramAnonymousFloat * paramAnonymousFloat * paramAnonymousFloat) + 1.0F;
    }
  };
  private int[] CA;
  private int[] CB;
  public int CC;
  public float CD;
  public float CE;
  private int CF;
  public int CG;
  public View CI;
  public boolean CJ;
  public final ViewGroup CK;
  public final Runnable CL = new Runnable()
  {
    public final void run()
    {
      a.this.aB(0);
    }
  };
  public int Cu;
  public float[] Cv;
  public float[] Cw;
  public float[] Cx;
  public float[] Cy;
  public int[] Cz;
  public VelocityTracker cE;
  public int cF = -1;
  public q fT;
  private int fW;
  public final a uuI;
  
  private a(Context paramContext, ViewGroup paramViewGroup, a parama)
  {
    if (paramViewGroup == null) {
      throw new IllegalArgumentException("Parent view may not be null");
    }
    if (parama == null) {
      throw new IllegalArgumentException("Callback may not be null");
    }
    this.CK = paramViewGroup;
    this.uuI = parama;
    paramViewGroup = ViewConfiguration.get(paramContext);
    this.CF = ((int)(paramContext.getResources().getDisplayMetrics().density * 20.0F + 0.5F));
    this.fW = paramViewGroup.getScaledTouchSlop();
    this.CD = paramViewGroup.getScaledMaximumFlingVelocity();
    this.CE = paramViewGroup.getScaledMinimumFlingVelocity();
    this.fT = q.a(paramContext, vY);
  }
  
  public static a a(ViewGroup paramViewGroup, a parama)
  {
    return new a(paramViewGroup.getContext(), paramViewGroup, parama);
  }
  
  private boolean a(float paramFloat1, float paramFloat2, int paramInt1, int paramInt2)
  {
    paramFloat1 = Math.abs(paramFloat1);
    paramFloat2 = Math.abs(paramFloat2);
    if (((this.Cz[paramInt1] & paramInt2) != paramInt2) || ((this.CG & paramInt2) == 0) || ((this.CB[paramInt1] & paramInt2) == paramInt2) || ((this.CA[paramInt1] & paramInt2) == paramInt2) || ((paramFloat1 <= this.fW) && (paramFloat2 <= this.fW))) {}
    while (((this.CA[paramInt1] & paramInt2) != 0) || (paramFloat1 <= this.fW)) {
      return false;
    }
    return true;
  }
  
  private static float e(float paramFloat1, float paramFloat2, float paramFloat3)
  {
    float f = Math.abs(paramFloat1);
    if (f < paramFloat2) {
      paramFloat2 = 0.0F;
    }
    do
    {
      return paramFloat2;
      if (f <= paramFloat3) {
        break;
      }
      paramFloat2 = paramFloat3;
    } while (paramFloat1 > 0.0F);
    return -paramFloat3;
    return paramFloat1;
  }
  
  private int j(int paramInt1, int paramInt2, int paramInt3)
  {
    if (paramInt1 == 0) {
      return 0;
    }
    int i = this.CK.getWidth();
    int j = i / 2;
    float f3 = Math.min(1.0F, Math.abs(paramInt1) / i);
    float f1 = j;
    float f2 = j;
    f3 = (float)Math.sin((float)((f3 - 0.5F) * 0.4712389167638204D));
    paramInt2 = Math.abs(paramInt2);
    if (paramInt2 > 0) {}
    for (paramInt1 = Math.round(Math.abs((f3 * f2 + f1) / paramInt2) * 1000.0F) * 4;; paramInt1 = (int)((Math.abs(paramInt1) / paramInt3 + 1.0F) * 256.0F)) {
      return Math.min(paramInt1, 600);
    }
  }
  
  private static int k(int paramInt1, int paramInt2, int paramInt3)
  {
    int i = Math.abs(paramInt1);
    if (i < paramInt2) {
      paramInt2 = 0;
    }
    do
    {
      return paramInt2;
      if (i <= paramInt3) {
        break;
      }
      paramInt2 = paramInt3;
    } while (paramInt1 > 0);
    return -paramInt3;
    return paramInt1;
  }
  
  public final void a(float paramFloat1, float paramFloat2, int paramInt)
  {
    int j = 0;
    if ((this.Cv == null) || (this.Cv.length <= paramInt))
    {
      localObject = new float[paramInt + 1];
      float[] arrayOfFloat1 = new float[paramInt + 1];
      float[] arrayOfFloat2 = new float[paramInt + 1];
      float[] arrayOfFloat3 = new float[paramInt + 1];
      int[] arrayOfInt1 = new int[paramInt + 1];
      int[] arrayOfInt2 = new int[paramInt + 1];
      int[] arrayOfInt3 = new int[paramInt + 1];
      if (this.Cv != null)
      {
        System.arraycopy(this.Cv, 0, localObject, 0, this.Cv.length);
        System.arraycopy(this.Cw, 0, arrayOfFloat1, 0, this.Cw.length);
        System.arraycopy(this.Cx, 0, arrayOfFloat2, 0, this.Cx.length);
        System.arraycopy(this.Cy, 0, arrayOfFloat3, 0, this.Cy.length);
        System.arraycopy(this.Cz, 0, arrayOfInt1, 0, this.Cz.length);
        System.arraycopy(this.CA, 0, arrayOfInt2, 0, this.CA.length);
        System.arraycopy(this.CB, 0, arrayOfInt3, 0, this.CB.length);
      }
      this.Cv = ((float[])localObject);
      this.Cw = arrayOfFloat1;
      this.Cx = arrayOfFloat2;
      this.Cy = arrayOfFloat3;
      this.Cz = arrayOfInt1;
      this.CA = arrayOfInt2;
      this.CB = arrayOfInt3;
    }
    Object localObject = this.Cv;
    this.Cx[paramInt] = paramFloat1;
    localObject[paramInt] = paramFloat1;
    localObject = this.Cw;
    this.Cy[paramInt] = paramFloat2;
    localObject[paramInt] = paramFloat2;
    localObject = this.Cz;
    int m = (int)paramFloat1;
    int k = (int)paramFloat2;
    if (m < this.CK.getLeft() + this.CF) {
      j = 1;
    }
    int i = j;
    if (k < this.CK.getTop() + this.CF) {
      i = j | 0x4;
    }
    j = i;
    if (m > this.CK.getRight() - this.CF) {
      j = i | 0x2;
    }
    i = j;
    if (k > this.CK.getBottom() - this.CF) {
      i = j | 0x8;
    }
    localObject[paramInt] = i;
    this.CC |= 1 << paramInt;
  }
  
  final void aB(int paramInt)
  {
    if (this.Cu != paramInt)
    {
      this.Cu = paramInt;
      this.uuI.t(paramInt);
      if (paramInt == 0) {
        this.CI = null;
      }
    }
  }
  
  public final void az(int paramInt)
  {
    if (this.Cv == null) {
      return;
    }
    this.Cv[paramInt] = 0.0F;
    this.Cw[paramInt] = 0.0F;
    this.Cx[paramInt] = 0.0F;
    this.Cy[paramInt] = 0.0F;
    this.Cz[paramInt] = 0;
    this.CA[paramInt] = 0;
    this.CB[paramInt] = 0;
    this.CC &= (1 << paramInt ^ 0xFFFFFFFF);
  }
  
  public final void b(float paramFloat1, float paramFloat2, int paramInt)
  {
    int j = 1;
    if (a(paramFloat1, paramFloat2, paramInt, 1)) {}
    for (;;)
    {
      int i = j;
      if (a(paramFloat2, paramFloat1, paramInt, 4)) {
        i = j | 0x4;
      }
      j = i;
      if (a(paramFloat1, paramFloat2, paramInt, 2)) {
        j = i | 0x2;
      }
      i = j;
      if (a(paramFloat2, paramFloat1, paramInt, 8)) {
        i = j | 0x8;
      }
      if (i != 0)
      {
        int[] arrayOfInt = this.CA;
        arrayOfInt[paramInt] = (i | arrayOfInt[paramInt]);
      }
      return;
      j = 0;
    }
  }
  
  public final void cY()
  {
    this.cE.computeCurrentVelocity(1000, this.CD);
    t(e(y.a(this.cE, this.cF), this.CE, this.CD), e(y.b(this.cE, this.cF), this.CE, this.CD));
  }
  
  public final void cancel()
  {
    this.cF = -1;
    if (this.Cv != null)
    {
      Arrays.fill(this.Cv, 0.0F);
      Arrays.fill(this.Cw, 0.0F);
      Arrays.fill(this.Cx, 0.0F);
      Arrays.fill(this.Cy, 0.0F);
      Arrays.fill(this.Cz, 0);
      Arrays.fill(this.CA, 0);
      Arrays.fill(this.CB, 0);
      this.CC = 0;
    }
    if (this.cE != null)
    {
      this.cE.recycle();
      this.cE = null;
    }
  }
  
  public final boolean g(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i = this.CI.getLeft();
    int j = this.CI.getTop();
    paramInt1 -= i;
    paramInt2 -= j;
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      this.fT.abortAnimation();
      aB(0);
      return false;
    }
    int m = k(paramInt3, (int)this.CE, (int)this.CD);
    int k = k(paramInt4, (int)this.CE, (int)this.CD);
    int n = Math.abs(paramInt1);
    int i1 = Math.abs(paramInt2);
    int i2 = Math.abs(m);
    int i3 = Math.abs(k);
    int i4 = i2 + i3;
    int i5 = n + i1;
    float f1;
    if (m != 0)
    {
      f1 = i2 / i4;
      if (k == 0) {
        break label281;
      }
    }
    label281:
    for (float f2 = i3 / i4;; f2 = i1 / i5)
    {
      m = j(paramInt1, m, this.uuI.czp());
      k = j(paramInt2, k, 0);
      float f3 = m;
      k = (int)(f2 * k + f1 * f3);
      x.d("WxViewDragHelper", "ashutest:: xvel %d, yvel %d, dx %d, dy %d duration %d", new Object[] { Integer.valueOf(paramInt3), Integer.valueOf(paramInt4), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(k) });
      this.fT.startScroll(i, j, paramInt1, paramInt2, k);
      aB(2);
      return true;
      f1 = n / i5;
      break;
    }
  }
  
  public final void i(MotionEvent paramMotionEvent)
  {
    int j = o.f(paramMotionEvent);
    int i = 0;
    while (i < j)
    {
      int k = o.c(paramMotionEvent, i);
      float f1 = o.d(paramMotionEvent, i);
      float f2 = o.e(paramMotionEvent, i);
      this.Cx[k] = f1;
      this.Cy[k] = f2;
      i += 1;
    }
  }
  
  public final boolean l(View paramView, float paramFloat)
  {
    if (paramView == null) {}
    for (;;)
    {
      return false;
      if (this.uuI.czp() > 0) {}
      for (int i = 1; (i != 0) && (Math.abs(paramFloat) > this.fW); i = 0) {
        return true;
      }
    }
  }
  
  public final boolean o(View paramView, int paramInt)
  {
    if ((paramView == this.CI) && (this.cF == paramInt)) {
      return true;
    }
    if ((paramView != null) && (this.uuI.Gc(paramInt)))
    {
      this.cF = paramInt;
      if (paramView.getParent() != this.CK) {
        throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + this.CK + ")");
      }
      this.CI = paramView;
      this.cF = paramInt;
      aB(1);
      return true;
    }
    return false;
  }
  
  public final void t(float paramFloat1, float paramFloat2)
  {
    this.CJ = true;
    this.uuI.a(this.CI, paramFloat1, paramFloat2);
    this.CJ = false;
    if (this.Cu == 1) {
      aB(0);
    }
  }
  
  public final View x(int paramInt1, int paramInt2)
  {
    int i = this.CK.getChildCount() - 1;
    while (i >= 0)
    {
      View localView = this.CK.getChildAt(i);
      if ((paramInt1 >= localView.getLeft()) && (paramInt1 < localView.getRight()) && (paramInt2 >= localView.getTop()) && (paramInt2 < localView.getBottom())) {
        return localView;
      }
      i -= 1;
    }
    return null;
  }
  
  public static abstract class a
  {
    public abstract boolean Gc(int paramInt);
    
    public void a(View paramView, float paramFloat1, float paramFloat2) {}
    
    public int czp()
    {
      return 0;
    }
    
    public int d(View paramView, int paramInt)
    {
      return 0;
    }
    
    public void fd(int paramInt1, int paramInt2) {}
    
    public void t(int paramInt) {}
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/ui/mogic/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */