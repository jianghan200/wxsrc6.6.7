package com.tencent.mm.plugin.appbrand.widget.c;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.graphics.drawable.ColorDrawable;
import android.view.View;

public final class g
{
  private int gGb;
  public ValueAnimator gGc;
  View view;
  
  public g(View paramView)
  {
    this.view = paramView;
  }
  
  public final void c(int paramInt, final Runnable paramRunnable)
  {
    if (this.view == null) {}
    do
    {
      return;
      this.gGb = paramInt;
      if ((!(this.view.getBackground() instanceof ColorDrawable)) || (((ColorDrawable)this.view.getBackground()).getColor() != paramInt)) {
        break;
      }
      if (paramRunnable != null) {
        paramRunnable.run();
      }
    } while (this.gGc == null);
    this.gGc.cancel();
    return;
    paramRunnable = new AnimatorListenerAdapter()
    {
      public final void onAnimationCancel(Animator paramAnonymousAnimator)
      {
        g.this.gGc = null;
      }
      
      public final void onAnimationEnd(Animator paramAnonymousAnimator)
      {
        if (paramRunnable != null) {
          paramRunnable.run();
        }
        g.this.gGc = null;
      }
    };
    if ((this.gGc != null) && (this.gGc.isStarted()) && (this.gGc.isRunning()) && (this.gGb == paramInt))
    {
      this.gGc.addListener(paramRunnable);
      return;
    }
    if (this.gGc != null) {
      this.gGc.cancel();
    }
    if ((this.view.getBackground() instanceof ColorDrawable)) {}
    for (paramInt = ((ColorDrawable)this.view.getBackground()).getColor();; paramInt = 0)
    {
      this.gGc = ValueAnimator.ofObject(new ArgbEvaluator(), new Object[] { Integer.valueOf(paramInt), Integer.valueOf(this.gGb) });
      this.gGc.addListener(paramRunnable);
      this.gGc.addUpdateListener(new g.2(this));
      this.gGc.start();
      return;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/appbrand/widget/c/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */