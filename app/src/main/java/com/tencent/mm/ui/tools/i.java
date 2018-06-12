package com.tencent.mm.ui.tools;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorInflater;
import android.annotation.TargetApi;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.AccelerateInterpolator;
import com.tencent.mm.compatible.util.d;
import com.tencent.mm.w.a.b;
import com.tencent.mm.w.a.g;

public final class i
{
  @TargetApi(14)
  public static final void a(View paramView, long paramLong, float paramFloat1, float paramFloat2)
  {
    if ((paramView == null) || (d.fS(14))) {
      return;
    }
    Animator localAnimator = (Animator)paramView.getTag(a.g.property_anim);
    if (localAnimator != null) {
      localAnimator.cancel();
    }
    paramView.animate().cancel();
    paramView.animate().setListener(null);
    paramView.animate().setDuration(paramLong).translationX(paramFloat1).translationY(0.0F).setInterpolator(new AccelerateInterpolator(paramFloat2));
  }
  
  @TargetApi(14)
  public static final void a(View paramView, long paramLong, float paramFloat, a parama)
  {
    if ((paramView == null) || (d.fS(14))) {
      return;
    }
    Animator localAnimator = (Animator)paramView.getTag(a.g.property_anim);
    if (localAnimator != null) {
      localAnimator.cancel();
    }
    paramView.animate().cancel();
    if (parama == null)
    {
      paramView.animate().setDuration(paramLong).translationX(paramFloat).translationY(0.0F);
      return;
    }
    paramView.animate().setDuration(paramLong).translationX(paramFloat).translationY(0.0F).setListener(new Animator.AnimatorListener()
    {
      public final void onAnimationCancel(Animator paramAnonymousAnimator)
      {
        this.uAb.bWQ();
      }
      
      public final void onAnimationEnd(Animator paramAnonymousAnimator)
      {
        this.uAb.onAnimationEnd();
      }
      
      public final void onAnimationRepeat(Animator paramAnonymousAnimator) {}
      
      public final void onAnimationStart(Animator paramAnonymousAnimator) {}
    });
  }
  
  @TargetApi(11)
  public static void a(View paramView, Animator.AnimatorListener paramAnimatorListener)
  {
    if ((paramView == null) || (d.fS(11))) {
      return;
    }
    Animator localAnimator = (Animator)paramView.getTag(a.g.property_anim);
    if (localAnimator != null) {
      localAnimator.cancel();
    }
    localAnimator = AnimatorInflater.loadAnimator(paramView.getContext(), a.b.fade_in_property_anim);
    localAnimator.setTarget(paramView);
    if (paramAnimatorListener != null) {
      localAnimator.addListener(paramAnimatorListener);
    }
    localAnimator.start();
    paramView.setTag(a.g.property_anim, localAnimator);
  }
  
  @TargetApi(11)
  public static final void m(View paramView, float paramFloat)
  {
    if ((paramView == null) || (d.fS(11))) {
      return;
    }
    Animator localAnimator = (Animator)paramView.getTag(a.g.property_anim);
    if (localAnimator != null) {
      localAnimator.cancel();
    }
    paramView.setScaleX(paramFloat);
    paramView.setScaleY(paramFloat);
  }
  
  @TargetApi(14)
  public static final void n(View paramView, float paramFloat)
  {
    if ((paramView == null) || (d.fS(14))) {
      return;
    }
    Animator localAnimator = (Animator)paramView.getTag(a.g.property_anim);
    if (localAnimator != null) {
      localAnimator.cancel();
    }
    paramView.animate().cancel();
    paramView.setTranslationX(paramFloat);
    paramView.setTranslationY(0.0F);
  }
  
  public static abstract interface a
  {
    public abstract void bWQ();
    
    public abstract void onAnimationEnd();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/ui/tools/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */