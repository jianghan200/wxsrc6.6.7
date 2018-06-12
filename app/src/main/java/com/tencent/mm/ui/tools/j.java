package com.tencent.mm.ui.tools;

import android.content.Context;
import android.view.GestureDetector;
import android.view.GestureDetector.OnGestureListener;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.x;

public final class j
  implements GestureDetector.OnGestureListener
{
  public final GestureDetector ZY;
  private final Context context;
  public a uAc;
  private final float uAd;
  private final float uAe;
  private final int uj;
  private final int uk;
  
  public j(Context paramContext)
  {
    this.context = paramContext;
    this.ZY = new GestureDetector(this.context, this);
    ViewConfiguration localViewConfiguration = ViewConfiguration.get(paramContext);
    this.uj = localViewConfiguration.getScaledMinimumFlingVelocity();
    this.uk = localViewConfiguration.getScaledMaximumFlingVelocity();
    this.uAd = BackwardSupportUtil.b.b(paramContext, 70.0F);
    this.uAe = BackwardSupportUtil.b.b(paramContext, 50.0F);
  }
  
  public final boolean onDown(MotionEvent paramMotionEvent)
  {
    return false;
  }
  
  public final boolean onFling(MotionEvent paramMotionEvent1, MotionEvent paramMotionEvent2, float paramFloat1, float paramFloat2)
  {
    if (this.uAc == null) {}
    float f1;
    float f2;
    do
    {
      return true;
      x.v("MicroMsg.MMGestureDetector", "lastX:%f, curX:%f, lastY:%f, curY:%f, vX:%f, vY:%f", new Object[] { Float.valueOf(paramMotionEvent1.getX()), Float.valueOf(paramMotionEvent2.getX()), Float.valueOf(paramMotionEvent1.getY()), Float.valueOf(paramMotionEvent2.getY()), Float.valueOf(paramFloat1), Float.valueOf(paramFloat2) });
      f1 = Math.abs(paramMotionEvent2.getY() - paramMotionEvent1.getY());
      f2 = Math.abs(paramMotionEvent2.getX() - paramMotionEvent1.getX());
    } while (((f1 < this.uAe) && (paramFloat1 > 800.0F) && (f2 > this.uAd)) || ((f1 < this.uAe) && (paramFloat1 < -800.0F) && (f2 < -this.uAd)) || ((f2 < this.uAe) && (paramFloat2 > 800.0F)) || ((f2 < this.uAe) && (paramFloat2 < -800.0F)));
    return false;
  }
  
  public final void onLongPress(MotionEvent paramMotionEvent) {}
  
  public final boolean onScroll(MotionEvent paramMotionEvent1, MotionEvent paramMotionEvent2, float paramFloat1, float paramFloat2)
  {
    return false;
  }
  
  public final void onShowPress(MotionEvent paramMotionEvent) {}
  
  public final boolean onSingleTapUp(MotionEvent paramMotionEvent)
  {
    return false;
  }
  
  public static abstract interface a {}
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/ui/tools/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */