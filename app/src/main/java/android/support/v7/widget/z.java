package android.support.v7.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

public abstract class z
  extends RecyclerView.p
{
  protected final DecelerateInterpolator BS = new DecelerateInterpolator();
  protected final LinearInterpolator PD = new LinearInterpolator();
  protected PointF PE;
  private final float PF = a(paramContext.getResources().getDisplayMetrics());
  protected int PG = 0;
  protected int PH = 0;
  
  public z(Context paramContext) {}
  
  private static int R(int paramInt1, int paramInt2)
  {
    int i = paramInt1 - paramInt2;
    paramInt2 = i;
    if (paramInt1 * i <= 0) {
      paramInt2 = 0;
    }
    return paramInt2;
  }
  
  private static int e(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    switch (paramInt5)
    {
    default: 
      throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
    case -1: 
      paramInt1 = paramInt3 - paramInt1;
    }
    do
    {
      do
      {
        return paramInt1;
        return paramInt4 - paramInt2;
        paramInt3 -= paramInt1;
        paramInt1 = paramInt3;
      } while (paramInt3 > 0);
      paramInt2 = paramInt4 - paramInt2;
      paramInt1 = paramInt2;
    } while (paramInt2 < 0);
    return 0;
  }
  
  public float a(DisplayMetrics paramDisplayMetrics)
  {
    return 25.0F / paramDisplayMetrics.densityDpi;
  }
  
  protected final void a(int paramInt1, int paramInt2, RecyclerView.p.a parama)
  {
    if (this.Sa.QV.getChildCount() == 0) {
      stop();
    }
    do
    {
      return;
      this.PG = R(this.PG, paramInt1);
      this.PH = R(this.PH, paramInt2);
    } while ((this.PG != 0) || (this.PH != 0));
    PointF localPointF = bf(this.Sv);
    if ((localPointF == null) || ((localPointF.x == 0.0F) && (localPointF.y == 0.0F)))
    {
      parama.SC = this.Sv;
      stop();
      return;
    }
    double d = Math.sqrt(localPointF.x * localPointF.x + localPointF.y * localPointF.y);
    localPointF.x = ((float)(localPointF.x / d));
    localPointF.y = ((float)(localPointF.y / d));
    this.PE = localPointF;
    this.PG = ((int)(localPointF.x * 10000.0F));
    this.PH = ((int)(localPointF.y * 10000.0F));
    paramInt1 = bi(10000);
    parama.a((int)(this.PG * 1.2F), (int)(this.PH * 1.2F), (int)(paramInt1 * 1.2F), this.PD);
  }
  
  protected final void a(View paramView, RecyclerView.p.a parama)
  {
    int k = 0;
    int i = fm();
    RecyclerView.h localh = this.QG;
    int m;
    if ((localh == null) || (!localh.eZ()))
    {
      i = 0;
      m = fn();
      localh = this.QG;
      j = k;
      if (localh != null) {
        if (localh.fa()) {
          break label177;
        }
      }
    }
    RecyclerView.LayoutParams localLayoutParams;
    int n;
    for (int j = k;; j = e(j - k, localLayoutParams.bottomMargin + n, localh.getPaddingTop(), localh.mHeight - localh.getPaddingBottom(), m))
    {
      k = (int)Math.ceil(bi((int)Math.sqrt(i * i + j * j)) / 0.3356D);
      if (k > 0) {
        parama.a(-i, -j, k, this.BS);
      }
      return;
      localLayoutParams = (RecyclerView.LayoutParams)paramView.getLayoutParams();
      j = RecyclerView.h.bh(paramView);
      m = localLayoutParams.leftMargin;
      n = RecyclerView.h.bj(paramView);
      i = e(j - m, localLayoutParams.rightMargin + n, localh.getPaddingLeft(), localh.mWidth - localh.getPaddingRight(), i);
      break;
      label177:
      localLayoutParams = (RecyclerView.LayoutParams)paramView.getLayoutParams();
      j = RecyclerView.h.bi(paramView);
      k = localLayoutParams.topMargin;
      n = RecyclerView.h.bk(paramView);
    }
  }
  
  public abstract PointF bf(int paramInt);
  
  public int bi(int paramInt)
  {
    return (int)Math.ceil(Math.abs(paramInt) * this.PF);
  }
  
  public int fm()
  {
    if ((this.PE == null) || (this.PE.x == 0.0F)) {
      return 0;
    }
    if (this.PE.x > 0.0F) {
      return 1;
    }
    return -1;
  }
  
  public int fn()
  {
    if ((this.PE == null) || (this.PE.y == 0.0F)) {
      return 0;
    }
    if (this.PE.y > 0.0F) {
      return 1;
    }
    return -1;
  }
  
  protected final void onStop()
  {
    this.PH = 0;
    this.PG = 0;
    this.PE = null;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/android/support/v7/widget/z.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */