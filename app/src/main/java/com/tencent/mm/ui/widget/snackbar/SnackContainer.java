package com.tencent.mm.ui.widget.snackbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.tencent.mm.bw.a.a;
import com.tencent.mm.bw.a.f;
import java.util.LinkedList;
import java.util.Queue;

public class SnackContainer
  extends FrameLayout
{
  private final Runnable iFN = new Runnable()
  {
    public final void run()
    {
      if (SnackContainer.this.getVisibility() == 0) {
        SnackContainer.this.startAnimation(SnackContainer.a(SnackContainer.this));
      }
    }
  };
  private AnimationSet tPN;
  Queue<a> uMK = new LinkedList();
  private AnimationSet uML;
  
  public SnackContainer(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    init();
  }
  
  SnackContainer(ViewGroup paramViewGroup)
  {
    super(paramViewGroup.getContext());
    paramViewGroup.addView(this, new ViewGroup.LayoutParams(-1, -1));
    setVisibility(8);
    setId(a.f.snackContainer);
    init();
  }
  
  private static void b(a parama)
  {
    if (parama.uMS != null)
    {
      b.mH(false);
      parama.uMS.onHide();
    }
  }
  
  private void init()
  {
    this.tPN = new AnimationSet(false);
    TranslateAnimation localTranslateAnimation = new TranslateAnimation(2, 0.0F, 2, 0.0F, 1, 1.0F, 1, 0.0F);
    AlphaAnimation localAlphaAnimation = new AlphaAnimation(0.0F, 1.0F);
    this.tPN.setInterpolator(new DecelerateInterpolator(1.5F));
    this.tPN.addAnimation(localTranslateAnimation);
    this.tPN.addAnimation(localAlphaAnimation);
    this.uML = new AnimationSet(false);
    localTranslateAnimation = new TranslateAnimation(2, 0.0F, 2, 0.0F, 1, 0.0F, 1, 1.0F);
    localAlphaAnimation = new AlphaAnimation(1.0F, 0.0F);
    this.uML.addAnimation(localTranslateAnimation);
    this.uML.addAnimation(localAlphaAnimation);
    this.uML.setDuration(300L);
    this.uML.setAnimationListener(new Animation.AnimationListener()
    {
      public final void onAnimationEnd(Animation paramAnonymousAnimation)
      {
        SnackContainer.this.removeAllViews();
        if (!SnackContainer.b(SnackContainer.this).isEmpty()) {
          SnackContainer.c((SnackContainer.a)SnackContainer.b(SnackContainer.this).poll());
        }
        if (!SnackContainer.this.isEmpty())
        {
          SnackContainer.a(SnackContainer.this, (SnackContainer.a)SnackContainer.b(SnackContainer.this).peek());
          return;
        }
        SnackContainer.this.setVisibility(8);
      }
      
      public final void onAnimationRepeat(Animation paramAnonymousAnimation) {}
      
      public final void onAnimationStart(Animation paramAnonymousAnimation)
      {
        if ((!SnackContainer.this.isEmpty()) && (SnackContainer.b(SnackContainer.this).peek() != null) && (((SnackContainer.a)SnackContainer.b(SnackContainer.this).peek()).uMS != null))
        {
          b.mH(false);
          ((SnackContainer.a)SnackContainer.b(SnackContainer.this).peek()).uMS.aSx();
        }
      }
    });
  }
  
  final void a(final a parama)
  {
    setVisibility(0);
    if (parama.uMS != null)
    {
      b.mH(true);
      parama.uMS.onShow();
    }
    addView(parama.uMO);
    parama.uMP.setText(parama.uMR.kjg);
    if (parama.uMR.uMv != null)
    {
      parama.uMQ.setVisibility(0);
      parama.uMQ.setText(parama.uMR.uMv);
    }
    for (;;)
    {
      this.tPN.setDuration(500L);
      Animation localAnimation = AnimationUtils.loadAnimation(getContext(), a.a.fast_faded_in);
      localAnimation.setDuration(500L);
      startAnimation(this.tPN);
      localAnimation.setStartOffset(200L);
      parama.uMQ.startAnimation(localAnimation);
      parama.uMP.startAnimation(localAnimation);
      if (parama.uMR.uMy > 0) {
        postDelayed(this.iFN, parama.uMR.uMy);
      }
      parama.uMO.setOnTouchListener(new View.OnTouchListener()
      {
        public final boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
        {
          switch (paramAnonymousMotionEvent.getAction())
          {
          }
          for (;;)
          {
            return true;
            SnackContainer.this.removeCallbacks(SnackContainer.c(SnackContainer.this));
            SnackContainer.c(parama);
            SnackContainer.this.startAnimation(SnackContainer.a(SnackContainer.this));
            if (!SnackContainer.b(SnackContainer.this).isEmpty()) {
              SnackContainer.b(SnackContainer.this).clear();
            }
          }
        }
      });
      return;
      parama.uMQ.setVisibility(8);
    }
  }
  
  public final void hide()
  {
    removeCallbacks(this.iFN);
    this.iFN.run();
  }
  
  public final boolean isEmpty()
  {
    return this.uMK.isEmpty();
  }
  
  public final boolean isShowing()
  {
    return !this.uMK.isEmpty();
  }
  
  protected void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    this.tPN.cancel();
    this.uML.cancel();
    removeCallbacks(this.iFN);
    this.uMK.clear();
  }
  
  protected void onVisibilityChanged(View paramView, int paramInt)
  {
    super.onVisibilityChanged(paramView, paramInt);
    if (((paramInt == 0) && (b.aKp())) || (8 == paramInt))
    {
      removeAllViews();
      if (!this.uMK.isEmpty()) {
        b((a)this.uMK.poll());
      }
      if (isEmpty()) {
        break label81;
      }
      a((a)this.uMK.peek());
    }
    for (;;)
    {
      b.mH(false);
      return;
      label81:
      setVisibility(8);
    }
  }
  
  private static final class a
  {
    final View uMO;
    final TextView uMP;
    final TextView uMQ;
    final Snack uMR;
    final a.c uMS;
    
    private a(Snack paramSnack, View paramView, a.c paramc)
    {
      this.uMO = paramView;
      this.uMQ = ((TextView)paramView.findViewById(a.f.snackButton));
      this.uMP = ((TextView)paramView.findViewById(a.f.snackMessage));
      this.uMR = paramSnack;
      this.uMS = paramc;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/ui/widget/snackbar/SnackContainer.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */