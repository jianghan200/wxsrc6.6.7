package com.tencent.mm.plugin.appbrand.page;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup.LayoutParams;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.xweb.WebView;

public class q
  extends FrameLayout
{
  View FU;
  private int fW;
  View gnV;
  FrameLayout gnW;
  FrameLayout gnX;
  public boolean gnY = true;
  private boolean gnZ = false;
  private boolean goa = false;
  private boolean gob = false;
  private boolean goc = false;
  private int god;
  private int goe;
  private int gof;
  private ObjectAnimator gog = null;
  
  public q(Context paramContext)
  {
    super(paramContext);
    setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
    this.fW = ViewConfiguration.get(paramContext).getScaledTouchSlop();
  }
  
  private boolean ama()
  {
    if ((this.FU instanceof WebView)) {
      return ((WebView)this.FU).isOverScrollStart();
    }
    return this.FU.getScrollY() == 0;
  }
  
  private int getMaxOverScrollDistance()
  {
    return getHeight();
  }
  
  private void lr(int paramInt)
  {
    int i = (int)this.gnX.getTranslationY();
    if (i == paramInt) {
      return;
    }
    x.i("MicroMsg.AppBrandPullDownView", "fastScrollTo from = %s, to = %s", new Object[] { Integer.valueOf(i), Integer.valueOf(paramInt) });
    if (this.gog != null) {
      this.gog.cancel();
    }
    long l = (Math.abs(i - paramInt) / getStayHeight() * 250.0F);
    ObjectAnimator localObjectAnimator = ObjectAnimator.ofFloat(this.gnX, "translationY", new float[] { i, paramInt });
    localObjectAnimator.setDuration(Math.min(l, 250L));
    localObjectAnimator.setInterpolator(new DecelerateInterpolator());
    localObjectAnimator.start();
    localObjectAnimator.addUpdateListener(new q.1(this));
    this.gog = localObjectAnimator;
  }
  
  protected final void alW()
  {
    lr(getStayHeight());
    if (!this.goa) {
      alY();
    }
    this.gob = true;
    this.goa = true;
    this.goc = true;
  }
  
  protected final void alX()
  {
    lr(0);
    if (this.goa) {
      alZ();
    }
    this.gob = false;
    this.goa = false;
    this.goc = false;
  }
  
  protected void alY() {}
  
  protected void alZ() {}
  
  protected int getOpenHeight()
  {
    return this.gnV.getHeight();
  }
  
  protected int getStayHeight()
  {
    return this.gnV.getHeight();
  }
  
  protected void lq(int paramInt) {}
  
  public final boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    boolean bool = true;
    if (this.gnY) {
      bool = this.goc;
    }
    int i;
    do
    {
      return bool;
      i = paramMotionEvent.getAction();
      if ((i == 3) || (i == 1)) {
        return false;
      }
    } while (this.gob);
    switch (i)
    {
    }
    int k;
    int j;
    do
    {
      do
      {
        for (;;)
        {
          return false;
          if (ama())
          {
            this.god = ((int)paramMotionEvent.getX());
            this.goe = ((int)paramMotionEvent.getY());
            this.gof = ((int)paramMotionEvent.getY());
          }
        }
      } while (!ama());
      i = (int)paramMotionEvent.getX();
      k = (int)paramMotionEvent.getY();
      j = this.god;
      k -= this.goe;
    } while ((Math.abs(k) <= this.fW) || (Math.abs(k) <= Math.abs(i - j)) || (k <= 0));
    this.gob = true;
    return true;
  }
  
  public final boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    if (this.gnY)
    {
      if (this.goc) {
        alX();
      }
      return this.goc;
    }
    switch (paramMotionEvent.getAction())
    {
    default: 
      return false;
    case 0: 
      this.gof = ((int)paramMotionEvent.getY());
      return true;
    case 2: 
      int k = (int)paramMotionEvent.getY() - this.gof;
      int i = k >> 1;
      int j = getMaxOverScrollDistance();
      if (i > j) {
        i = j;
      }
      for (;;)
      {
        j = i;
        if (this.goa) {
          j = i + getStayHeight();
        }
        i = Math.max(j, 0);
        x.d("MicroMsg.AppBrandPullDownView", "real diff: %d, calc diff: %d", new Object[] { Integer.valueOf(k), Integer.valueOf(i) });
        j = Math.min(getMaxOverScrollDistance(), i);
        this.gnX.setTranslationY(j);
        lq(i);
        return true;
      }
    }
    if ((this.gnX.getTranslationY() > getOpenHeight()) && (this.gnZ)) {
      alW();
    }
    for (;;)
    {
      return true;
      alX();
    }
  }
  
  public void setNeedStay(boolean paramBoolean)
  {
    this.gnZ = paramBoolean;
  }
  
  public void setPullDownBackgroundColor(int paramInt)
  {
    this.gnW.setBackgroundColor(paramInt);
  }
  
  public void setPullDownEnabled(boolean paramBoolean)
  {
    if (!paramBoolean) {}
    for (paramBoolean = true;; paramBoolean = false)
    {
      this.gnY = paramBoolean;
      return;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/appbrand/page/q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */