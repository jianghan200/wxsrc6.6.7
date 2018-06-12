package com.tencent.mm.ui.base;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.TranslateAnimation;
import android.widget.HorizontalScrollView;

public class MMSmoothHorizontalScrollView
  extends HorizontalScrollView
{
  private Rect cO = new Rect();
  private Interpolator cp = new DecelerateInterpolator();
  private TranslateAnimation mlt;
  private View txv;
  private float ww;
  
  public MMSmoothHorizontalScrollView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    setFadingEdgeLength(0);
  }
  
  protected void onFinishInflate()
  {
    if (getChildCount() > 0) {
      this.txv = getChildAt(0);
    }
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    int j = 1;
    int i = 0;
    if (this.txv == null) {
      return super.onTouchEvent(paramMotionEvent);
    }
    switch (paramMotionEvent.getAction())
    {
    }
    label407:
    for (;;)
    {
      return super.onTouchEvent(paramMotionEvent);
      this.ww = paramMotionEvent.getX();
      continue;
      float f = paramMotionEvent.getX();
      if (this.ww == 0.0F) {
        this.ww = f;
      }
      j = (int)(this.ww - f) / 2;
      scrollBy(j, 0);
      this.ww = f;
      int k = this.txv.getMeasuredWidth();
      int m = getWidth();
      int n = getPaddingLeft();
      int i1 = getPaddingRight();
      int i2 = getScrollX();
      if ((i2 == 0) || (i2 == k - (m - n - i1))) {
        i = 1;
      }
      if (i != 0)
      {
        if (this.cO.isEmpty()) {
          this.cO.set(this.txv.getLeft(), this.txv.getTop(), this.txv.getRight(), this.txv.getBottom());
        }
        this.txv.layout(this.txv.getLeft() - j, this.txv.getTop(), this.txv.getRight() - j, this.txv.getBottom());
        continue;
        this.ww = 0.0F;
        if (!this.cO.isEmpty()) {}
        for (i = j;; i = 0)
        {
          if (i == 0) {
            break label407;
          }
          this.mlt = new TranslateAnimation(this.txv.getLeft(), this.cO.left, 0.0F, 0.0F);
          this.mlt.setInterpolator(this.cp);
          this.mlt.setDuration(Math.abs(this.txv.getLeft() - this.cO.left));
          this.txv.startAnimation(this.mlt);
          this.txv.layout(this.cO.left, this.cO.top, this.cO.right, this.cO.bottom);
          this.cO.setEmpty();
          break;
        }
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/ui/base/MMSmoothHorizontalScrollView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */