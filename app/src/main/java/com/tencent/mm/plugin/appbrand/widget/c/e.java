package com.tencent.mm.plugin.appbrand.widget.c;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import com.tencent.mm.plugin.appbrand.s.a;
import java.util.LinkedList;

public final class e
  extends FrameLayout
  implements i
{
  public final g gFU = new g(this);
  public final LinkedList<h> gFV = new LinkedList();
  private final Runnable gFW = new e.2(this);
  private h gFX;
  public h gFY;
  public final View.OnClickListener mOnClickListener = new e.1(this);
  
  public e(Context paramContext)
  {
    super(paramContext);
    setVisibility(4);
    setBackgroundColor(0);
    setOnClickListener(this.mOnClickListener);
  }
  
  public static void bT(View paramView)
  {
    if ((paramView == null) || (paramView.getParent() == null)) {
      return;
    }
    ((ViewGroup)paramView.getParent()).removeView(paramView);
  }
  
  public final void b(h paramh)
  {
    if (paramh.getContentView().getParent() != this) {}
    do
    {
      do
      {
        return;
      } while (this.gFX == paramh);
      this.gFX = paramh;
      View localView = paramh.getContentView();
      localView.animate().cancel();
      localView.clearAnimation();
      Object localObject = AnimationUtils.loadInterpolator(localView.getContext(), s.a.decelerate_quint_interpolator);
      Interpolator localInterpolator = AnimationUtils.loadInterpolator(localView.getContext(), s.a.decelerate_cubic_interpolator);
      AnimatorSet localAnimatorSet = new AnimatorSet();
      ObjectAnimator localObjectAnimator1 = ObjectAnimator.ofFloat(localView, "scaleX", new float[] { 1.0F, 0.9F }).setDuration(220L);
      localObjectAnimator1.setInterpolator((TimeInterpolator)localObject);
      ObjectAnimator localObjectAnimator2 = ObjectAnimator.ofFloat(localView, "scaleY", new float[] { 1.0F, 0.9F }).setDuration(220L);
      localObjectAnimator2.setInterpolator((TimeInterpolator)localObject);
      localObject = ObjectAnimator.ofFloat(localView, "alpha", new float[] { 1.0F, 0.0F }).setDuration(150L);
      ((Animator)localObject).setInterpolator(localInterpolator);
      localAnimatorSet.playTogether(new Animator[] { localObjectAnimator1, localObjectAnimator2, localObject });
      localAnimatorSet.addListener(new e.3(this, localView, paramh));
      localAnimatorSet.start();
    } while (this.gFV.size() > 1);
    this.gFU.c(0, this.gFW);
  }
  
  public final boolean dispatchTouchEvent(MotionEvent paramMotionEvent)
  {
    if (getChildCount() == 0) {
      return false;
    }
    return super.dispatchTouchEvent(paramMotionEvent);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/appbrand/widget/c/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */