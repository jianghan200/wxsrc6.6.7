package com.tencent.mm.plugin.webview.ui.tools.fts;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;
import android.widget.RelativeLayout.LayoutParams;

public final class b
  extends a
{
  public b(Context paramContext, View paramView1, final View paramView2, View paramView3, View paramView4, View paramView5, final View paramView6, View paramView7, View paramView8, View paramView9)
  {
    super(paramContext, paramView1, paramView2, paramView3, paramView4, paramView5, paramView6, paramView7, paramView8, paramView9);
    paramView2.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener()
    {
      public final boolean onPreDraw()
      {
        paramView2.getViewTreeObserver().removeOnPreDrawListener(this);
        RelativeLayout.LayoutParams localLayoutParams = (RelativeLayout.LayoutParams)paramView2.getLayoutParams();
        b.this.qeW = (localLayoutParams.leftMargin - b.this.lvk);
        return true;
      }
    });
    paramView6.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener()
    {
      public final boolean onPreDraw()
      {
        paramView6.getViewTreeObserver().removeOnPreDrawListener(this);
        b.this.qeV = ((int)paramView6.getX());
        return true;
      }
    });
  }
  
  public final void AZ(int paramInt)
  {
    aa(paramInt, true);
  }
  
  public final void aa(int paramInt, boolean paramBoolean)
  {
    if (paramInt == this.qfg) {
      return;
    }
    switch (b.6.qfp[(paramInt - 1)])
    {
    default: 
      return;
    case 1: 
      bXC();
      return;
    }
    if (paramBoolean)
    {
      bXD();
      return;
    }
    this.qeY.setAlpha(0.0F);
    this.qfc.setVisibility(0);
    this.qfa.setAlpha(1.0F);
    this.qfa.setVisibility(8);
    this.qfb.setAlpha(1.0F);
    this.qeX.setPadding(this.qeW, 0, 0, 0);
    paramInt = this.qeT;
    RelativeLayout.LayoutParams localLayoutParams = (RelativeLayout.LayoutParams)this.qeX.getLayoutParams();
    localLayoutParams.leftMargin = (this.qeT - paramInt);
    localLayoutParams.rightMargin = (this.qeT - paramInt);
    localLayoutParams.width = (paramInt * 2 + (int)this.qff[2][0]);
    this.qeX.setLayoutParams(localLayoutParams);
    this.qeX.post(new b.4(this));
  }
  
  protected final void bXC()
  {
    ValueAnimator localValueAnimator = ValueAnimator.ofFloat(new float[] { 0.0F, 1.0F });
    if (this.qff[0][0] - this.qeU >= 0.0F) {
      localValueAnimator.addUpdateListener(this.qfk);
    }
    for (;;)
    {
      ObjectAnimator localObjectAnimator1 = ObjectAnimator.ofFloat(this.qfe, "alpha", new float[] { 0.0F, 1.0F });
      ObjectAnimator localObjectAnimator2 = ObjectAnimator.ofFloat(this.qeY, "alpha", new float[] { 0.0F, 1.0F });
      ObjectAnimator localObjectAnimator3 = ObjectAnimator.ofFloat(this.qfa, "alpha", new float[] { 0.0F, 1.0F });
      AnimatorSet localAnimatorSet = new AnimatorSet();
      localAnimatorSet.playTogether(new Animator[] { localValueAnimator, localObjectAnimator2, localObjectAnimator3, localObjectAnimator1 });
      localAnimatorSet.setDuration(300L);
      localAnimatorSet.addListener(new Animator.AnimatorListener()
      {
        public final void onAnimationCancel(Animator paramAnonymousAnimator)
        {
          b.this.isAnimating = false;
        }
        
        public final void onAnimationEnd(Animator paramAnonymousAnimator)
        {
          b.this.isAnimating = false;
          if (b.this.qfh != null) {
            b.this.qfh.onAnimationEnd();
          }
          b.this.qeZ.setVisibility(0);
          b.this.qeX.setPadding(0, 0, 0, 0);
          b.this.qfb.setAlpha(1.0F);
        }
        
        public final void onAnimationRepeat(Animator paramAnonymousAnimator) {}
        
        public final void onAnimationStart(Animator paramAnonymousAnimator)
        {
          b.this.isAnimating = true;
          if (b.this.qfh != null) {
            b.this.qfh.onAnimationStart();
          }
          b.this.qfa.setVisibility(0);
          b.this.qeY.setVisibility(0);
          b.this.qfc.setVisibility(8);
          b.this.qfb.setVisibility(8);
        }
      });
      localAnimatorSet.start();
      return;
      localValueAnimator.addUpdateListener(this.qfl);
    }
  }
  
  protected final void bXD()
  {
    ValueAnimator localValueAnimator = ValueAnimator.ofFloat(new float[] { 0.0F, 1.0F });
    if (this.qff[0][0] - this.qeU >= 0.0F) {
      localValueAnimator.addUpdateListener(this.qfi);
    }
    for (;;)
    {
      ObjectAnimator localObjectAnimator1 = ObjectAnimator.ofFloat(this.qfe, "alpha", new float[] { 1.0F, 0.0F });
      ObjectAnimator localObjectAnimator2 = ObjectAnimator.ofFloat(this.qeY, "alpha", new float[] { 1.0F, 0.0F });
      this.qfa.setVisibility(8);
      AnimatorSet localAnimatorSet = new AnimatorSet();
      localAnimatorSet.playTogether(new Animator[] { localValueAnimator, localObjectAnimator2, localObjectAnimator1 });
      localAnimatorSet.setDuration(300L);
      localAnimatorSet.addListener(new b.5(this));
      localAnimatorSet.start();
      return;
      localValueAnimator.addUpdateListener(this.qfj);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/webview/ui/tools/fts/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */