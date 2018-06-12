package com.tencent.mm.plugin.webview.ui.tools.fts;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewTreeObserver;
import org.xwalk.core.Log;

public final class d
  extends a
{
  public d(Context paramContext, View paramView1, View paramView2, View paramView3, View paramView4, View paramView5, View paramView6, View paramView7, View paramView8, View paramView9)
  {
    super(paramContext, paramView1, paramView2, paramView3, paramView4, paramView5, paramView6, paramView7, paramView8, paramView9);
    paramView2.getViewTreeObserver().addOnPreDrawListener(new d.1(this, paramView2));
    paramView6.getViewTreeObserver().addOnPreDrawListener(new d.2(this, paramView6));
  }
  
  protected final void bXC()
  {
    Log.i("MicroMsg.FTS.SosAnimatorController", "search to init");
    ValueAnimator localValueAnimator = ValueAnimator.ofFloat(new float[] { 0.0F, 1.0F });
    if (this.qff[0][0] - this.qeU >= 0.0F) {
      localValueAnimator.addUpdateListener(this.qfk);
    }
    for (;;)
    {
      ObjectAnimator localObjectAnimator1 = ObjectAnimator.ofFloat(this.qeY, "alpha", new float[] { 0.0F, 1.0F });
      ObjectAnimator localObjectAnimator2 = ObjectAnimator.ofFloat(this.qfa, "alpha", new float[] { 0.0F, 1.0F });
      this.qfb.setVisibility(8);
      AnimatorSet localAnimatorSet = new AnimatorSet();
      localAnimatorSet.playTogether(new Animator[] { localValueAnimator, localObjectAnimator1, localObjectAnimator2 });
      localAnimatorSet.setDuration(300L);
      localAnimatorSet.addListener(new Animator.AnimatorListener()
      {
        public final void onAnimationCancel(Animator paramAnonymousAnimator)
        {
          d.this.isAnimating = false;
        }
        
        public final void onAnimationEnd(Animator paramAnonymousAnimator)
        {
          d.this.isAnimating = false;
          if (d.this.qfh != null) {
            d.this.qfh.onAnimationEnd();
          }
          d.this.qeZ.setVisibility(0);
          d.this.qeX.setPadding(0, 0, 0, 0);
          d.this.qfb.setAlpha(1.0F);
          d.this.qfb.setVisibility(8);
        }
        
        public final void onAnimationRepeat(Animator paramAnonymousAnimator) {}
        
        public final void onAnimationStart(Animator paramAnonymousAnimator)
        {
          d.this.isAnimating = true;
          if (d.this.qfh != null) {
            d.this.qfh.onAnimationStart();
          }
          d.this.qfa.setVisibility(0);
          d.this.qeY.setVisibility(0);
          d.this.qfc.setVisibility(8);
        }
      });
      localAnimatorSet.start();
      return;
      localValueAnimator.addUpdateListener(this.qfl);
    }
  }
  
  protected final void bXD()
  {
    Log.i("MicroMsg.FTS.SosAnimatorController", "init to search");
    ValueAnimator localValueAnimator = ValueAnimator.ofFloat(new float[] { 0.0F, 1.0F });
    if (this.qff[0][0] - this.qeU >= 0.0F) {
      localValueAnimator.addUpdateListener(this.qfi);
    }
    for (;;)
    {
      ObjectAnimator localObjectAnimator1 = ObjectAnimator.ofFloat(this.qeY, "alpha", new float[] { 1.0F, 0.0F });
      ObjectAnimator localObjectAnimator2 = ObjectAnimator.ofFloat(this.qfa, "alpha", new float[] { 1.0F, 0.0F });
      ObjectAnimator localObjectAnimator3 = ObjectAnimator.ofFloat(this.qfb, "alpha", new float[] { 0.0F, 1.0F });
      AnimatorSet localAnimatorSet = new AnimatorSet();
      localAnimatorSet.playTogether(new Animator[] { localValueAnimator, localObjectAnimator1, localObjectAnimator2, localObjectAnimator3 });
      localAnimatorSet.setDuration(300L);
      localAnimatorSet.addListener(new d.4(this));
      localAnimatorSet.start();
      return;
      localValueAnimator.addUpdateListener(this.qfj);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/webview/ui/tools/fts/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */