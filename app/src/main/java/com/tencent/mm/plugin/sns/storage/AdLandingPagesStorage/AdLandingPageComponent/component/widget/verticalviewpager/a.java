package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager;

import android.os.SystemClock;
import android.support.v4.view.u;
import android.support.v4.view.y;
import android.support.v4.view.z;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.View.OnTouchListener;
import java.util.ArrayList;

public final class a
  implements View.OnTouchListener
{
  private float ftp = Float.MIN_VALUE;
  private DummyViewPager nHe;
  private float nHf = Float.MIN_VALUE;
  
  public a(DummyViewPager paramDummyViewPager)
  {
    this.nHe = paramDummyViewPager;
  }
  
  private boolean a(View paramView, MotionEvent paramMotionEvent, float paramFloat)
  {
    boolean bool = false;
    float f1;
    float f2;
    int i;
    if (this.nHe.wC)
    {
      f1 = (int)(this.nHe.getScrollX() - paramFloat) - this.nHe.getBaseScrollX();
      f2 = this.nHe.getScrollX() - this.nHe.getBaseScrollX();
      if (Math.abs(f1 + f2) < Math.abs(f1 - f2))
      {
        i = 1;
        if (i == 0) {
          break label449;
        }
      }
    }
    label449:
    for (float f3 = this.nHe.getScrollX() - this.nHe.getBaseScrollX();; f3 = paramFloat)
    {
      DummyViewPager localDummyViewPager = this.nHe;
      if (!localDummyViewPager.wC)
      {
        throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
        i = 0;
        break;
      }
      localDummyViewPager.ww += f3;
      float f4 = localDummyViewPager.getScrollX() - f3;
      i = localDummyViewPager.getClientWidth();
      f1 = i;
      float f6 = localDummyViewPager.wm;
      f2 = i;
      float f5 = localDummyViewPager.wn;
      Object localObject = (AdLandingViewPager.b)localDummyViewPager.bA.get(0);
      AdLandingViewPager.b localb = (AdLandingViewPager.b)localDummyViewPager.bA.get(localDummyViewPager.bA.size() - 1);
      if (((AdLandingViewPager.b)localObject).position != 0) {}
      for (f1 = ((AdLandingViewPager.b)localObject).wW * i;; f1 *= f6)
      {
        if (localb.position != localDummyViewPager.wa.getCount() - 1) {}
        for (f2 = localb.wW * i;; f2 *= f5)
        {
          if (f4 < f1) {}
          for (;;)
          {
            localDummyViewPager.ww += f1 - (int)f1;
            localDummyViewPager.scrollTo((int)f1, localDummyViewPager.getScrollY());
            localDummyViewPager.an((int)f1);
            long l = SystemClock.uptimeMillis();
            localObject = MotionEvent.obtain(localDummyViewPager.nGV, l, 2, localDummyViewPager.ww, 0.0F, 0);
            localDummyViewPager.cE.addMovement((MotionEvent)localObject);
            ((MotionEvent)localObject).recycle();
            new StringBuilder("fake drag, diff ").append(paramFloat).append(",step ").append(f3).append(",scrollX ").append(this.nHe.getScrollX());
            c(paramView, paramMotionEvent);
            bool = true;
            return bool;
            if (f4 > f2) {
              f1 = f2;
            } else {
              f1 = f4;
            }
          }
        }
      }
    }
  }
  
  private static void c(View paramView, MotionEvent paramMotionEvent)
  {
    paramMotionEvent = MotionEvent.obtain(paramMotionEvent);
    paramMotionEvent.setAction(0);
    paramView.dispatchTouchEvent(paramMotionEvent);
  }
  
  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    new StringBuilder("onTouchEvent , action ").append(paramMotionEvent.getAction()).append(", e.rawY ").append(paramMotionEvent.getRawY()).append(",lastMotionY ").append(this.nHf).append(",downY ").append(this.ftp);
    label244:
    int i;
    label298:
    DummyViewPager localDummyViewPager;
    Object localObject;
    switch (paramMotionEvent.getAction())
    {
    default: 
    case 0: 
    case 2: 
      for (;;)
      {
        return paramView.onTouchEvent(paramMotionEvent);
        this.ftp = paramMotionEvent.getRawY();
        continue;
        if ((this.ftp != Float.MIN_VALUE) || (this.nHf != Float.MIN_VALUE)) {
          break;
        }
        this.ftp = paramMotionEvent.getRawY();
      }
      float f2 = paramMotionEvent.getRawY();
      if (this.nHf == Float.MIN_VALUE) {}
      for (float f1 = this.ftp;; f1 = this.nHf)
      {
        this.nHf = paramMotionEvent.getRawY();
        f1 = (f2 - f1) / 2.0F;
        new StringBuilder("scrollX ").append(this.nHe.getScrollX()).append(",basescrollX ").append(this.nHe.getBaseScrollX());
        if (this.nHe.getScrollX() == this.nHe.getBaseScrollX()) {
          break label244;
        }
        if (!a(paramView, paramMotionEvent, f1)) {
          break;
        }
        return false;
      }
      if (-f1 > 0.0F) {}
      for (i = 1;; i = -1)
      {
        if (!z.h(paramView, i)) {
          break label298;
        }
        new StringBuilder("scroll vertically  ").append(f1).append(", move.lastMotionY ").append(paramMotionEvent.getY());
        break;
      }
      localDummyViewPager = this.nHe;
      if (!localDummyViewPager.fU)
      {
        localDummyViewPager.wC = true;
        localDummyViewPager.setScrollState(1);
        localDummyViewPager.ww = 0.0F;
        localDummyViewPager.vm = 0.0F;
        if (localDummyViewPager.cE != null) {
          break label407;
        }
        localDummyViewPager.cE = VelocityTracker.obtain();
      }
      for (;;)
      {
        long l = SystemClock.uptimeMillis();
        localObject = MotionEvent.obtain(l, l, 0, 0.0F, 0.0F, 0);
        localDummyViewPager.cE.addMovement((MotionEvent)localObject);
        ((MotionEvent)localObject).recycle();
        localDummyViewPager.nGV = l;
        a(paramView, paramMotionEvent, f1);
        c(paramView, paramMotionEvent);
        return false;
        label407:
        localDummyViewPager.cE.clear();
      }
    }
    if (this.nHe.wC) {
      try
      {
        localDummyViewPager = this.nHe;
        if (!localDummyViewPager.wC) {
          throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
        }
      }
      catch (Exception localException) {}
    }
    for (;;)
    {
      this.ftp = Float.MIN_VALUE;
      this.nHf = Float.MIN_VALUE;
      break;
      localObject = localException.cE;
      ((VelocityTracker)localObject).computeCurrentVelocity(1000, localException.wz);
      i = (int)y.a((VelocityTracker)localObject, localException.cF);
      localException.wr = true;
      int j = localException.getClientWidth();
      int k = localException.getScrollX();
      localObject = localException.bAp();
      localException.a(localException.a(((AdLandingViewPager.b)localObject).position, (k / j - ((AdLandingViewPager.b)localObject).wW) / ((AdLandingViewPager.b)localObject).wV, i, (int)(localException.ww - localException.vm)), true, true, i);
      localException.cP();
      localException.wC = false;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/widget/verticalviewpager/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */