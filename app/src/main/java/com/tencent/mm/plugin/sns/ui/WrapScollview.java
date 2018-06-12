package com.tencent.mm.plugin.sns.ui;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ScrollView;

public class WrapScollview
  extends ScrollView
{
  private View contentView;
  private boolean oiC = true;
  
  public WrapScollview(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public WrapScollview(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  protected int computeScrollDeltaToGetChildRectOnScreen(Rect paramRect)
  {
    if (!this.oiC) {
      return 0;
    }
    return super.computeScrollDeltaToGetChildRectOnScreen(paramRect);
  }
  
  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    int i = 1;
    if (this.contentView != null)
    {
      View localView = this.contentView;
      float f1 = paramMotionEvent.getRawX();
      float f2 = paramMotionEvent.getRawY();
      int[] arrayOfInt = new int[2];
      localView.getLocationOnScreen(arrayOfInt);
      int j = arrayOfInt[0];
      int k = localView.getWidth();
      int m = arrayOfInt[1];
      int n = localView.getHeight();
      if ((j < f1) && (f1 < k + j) && (m < f2) && (f2 < n + m)) {}
      while (i != 0)
      {
        return false;
        i = 0;
      }
    }
    return super.onInterceptTouchEvent(paramMotionEvent);
  }
  
  public void setContentView(View paramView)
  {
    this.contentView = paramView;
  }
  
  public void setDoComputeScrollDeltaToGetChildRectOnScreen(boolean paramBoolean)
  {
    this.oiC = paramBoolean;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/sns/ui/WrapScollview.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */