package com.tencent.mm.plugin.webview.ui.tools.fts;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import org.xwalk.core.Log;

public final class c
  extends a
{
  public c(Context paramContext, View paramView1, View paramView2, View paramView3, View paramView4, View paramView5, View paramView6, View paramView7, View paramView8, View paramView9)
  {
    super(paramContext, paramView1, paramView2, paramView3, paramView4, paramView5, paramView6, paramView7, paramView8, paramView9);
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
      ObjectAnimator localObjectAnimator1 = ObjectAnimator.ofFloat(this.qfd, "alpha", new float[] { 0.0F, 1.0F });
      ObjectAnimator localObjectAnimator2 = ObjectAnimator.ofFloat(this.qeY, "alpha", new float[] { 0.0F, 1.0F });
      AnimatorSet localAnimatorSet = new AnimatorSet();
      localAnimatorSet.playTogether(new Animator[] { localValueAnimator, localObjectAnimator1, localObjectAnimator2 });
      localAnimatorSet.setDuration(300L);
      localAnimatorSet.addListener(new c.1(this));
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
      ObjectAnimator localObjectAnimator1 = ObjectAnimator.ofFloat(this.qfd, "alpha", new float[] { 1.0F, 0.0F });
      ObjectAnimator localObjectAnimator2 = ObjectAnimator.ofFloat(this.qeY, "alpha", new float[] { 1.0F, 0.0F });
      AnimatorSet localAnimatorSet = new AnimatorSet();
      localAnimatorSet.playTogether(new Animator[] { localValueAnimator, localObjectAnimator1, localObjectAnimator2 });
      localAnimatorSet.setDuration(300L);
      localAnimatorSet.addListener(new c.2(this));
      localAnimatorSet.start();
      return;
      localValueAnimator.addUpdateListener(this.qfj);
    }
  }
  
  protected final boolean bXE()
  {
    return false;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/webview/ui/tools/fts/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */