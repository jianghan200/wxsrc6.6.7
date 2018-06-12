package com.tencent.mm.plugin.appbrand.ui.recents;

import android.content.Context;
import android.os.Build.VERSION;
import android.support.v7.widget.RecyclerView.e;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.tencent.mm.plugin.appbrand.widget.recyclerview.LoadMoreRecyclerView;

class RecentsRecyclerView
  extends LoadMoreRecyclerView
{
  private View gBa;
  
  public RecentsRecyclerView(Context paramContext)
  {
    super(paramContext);
    setChildrenDrawingOrderEnabled(true);
  }
  
  public RecentsRecyclerView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    setChildrenDrawingOrderEnabled(true);
  }
  
  public RecentsRecyclerView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    setChildrenDrawingOrderEnabled(true);
  }
  
  final void bP(View paramView)
  {
    if (paramView.getParent() != this) {
      return;
    }
    if (Build.VERSION.SDK_INT >= 21)
    {
      paramView.setZ(1.0F);
      return;
    }
    this.gBa = paramView;
  }
  
  final void bQ(View paramView)
  {
    if (paramView.getParent() != this) {}
    do
    {
      return;
      if (Build.VERSION.SDK_INT >= 21)
      {
        paramView.setZ(0.0F);
        return;
      }
    } while (this.gBa != paramView);
    this.gBa = null;
  }
  
  public boolean dispatchTouchEvent(MotionEvent paramMotionEvent)
  {
    if ((getItemAnimator() != null) && (getItemAnimator().isRunning())) {
      return false;
    }
    return super.dispatchTouchEvent(paramMotionEvent);
  }
  
  protected int getChildDrawingOrder(int paramInt1, int paramInt2)
  {
    int i;
    if (this.gBa == null) {
      i = super.getChildDrawingOrder(paramInt1, paramInt2);
    }
    int j;
    do
    {
      return i;
      j = indexOfChild(this.gBa);
      if (j < 0) {
        return super.getChildDrawingOrder(paramInt1, paramInt2);
      }
      i = j;
    } while (paramInt2 == paramInt1 - 1);
    if (paramInt2 == j) {
      return paramInt1 - 1;
    }
    return super.getChildDrawingOrder(paramInt1, paramInt2);
  }
  
  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    if ((getItemAnimator() != null) && (getItemAnimator().isRunning())) {
      return false;
    }
    return super.onInterceptTouchEvent(paramMotionEvent);
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    if ((getItemAnimator() != null) && (getItemAnimator().isRunning())) {
      return false;
    }
    return super.onTouchEvent(paramMotionEvent);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/appbrand/ui/recents/RecentsRecyclerView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */