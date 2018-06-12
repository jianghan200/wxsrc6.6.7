package com.tencent.mm.ui.base;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import com.tencent.mm.w.a.m;
import java.util.LinkedList;

public class FlowLayout
  extends ViewGroup
{
  private int tsr = 0;
  int tss = 0;
  LinkedList<Integer> tst = new LinkedList();
  
  static
  {
    if (!FlowLayout.class.desiredAssertionStatus()) {}
    for (boolean bool = true;; bool = false)
    {
      $assertionsDisabled = bool;
      return;
    }
  }
  
  public FlowLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    c(paramContext, paramAttributeSet);
  }
  
  public FlowLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    c(paramContext, paramAttributeSet);
  }
  
  private void c(Context paramContext, AttributeSet paramAttributeSet)
  {
    paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, a.m.FlowLayout);
    try
    {
      this.tsr = paramContext.getDimensionPixelSize(a.m.FlowLayout_horizontalSpacing, 0);
      this.tss = paramContext.getDimensionPixelSize(a.m.FlowLayout_verticalSpacing, 0);
      return;
    }
    finally
    {
      paramContext.recycle();
    }
  }
  
  protected boolean checkLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    return paramLayoutParams instanceof ViewGroup.LayoutParams;
  }
  
  protected ViewGroup.LayoutParams generateDefaultLayoutParams()
  {
    return new ViewGroup.LayoutParams(-2, -2);
  }
  
  public ViewGroup.LayoutParams generateLayoutParams(AttributeSet paramAttributeSet)
  {
    return new ViewGroup.LayoutParams(getContext(), paramAttributeSet);
  }
  
  protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    return new ViewGroup.LayoutParams(paramLayoutParams.width, paramLayoutParams.height);
  }
  
  public int getLineCount()
  {
    return this.tst.size();
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i1 = getChildCount();
    int i = getPaddingLeft();
    paramInt2 = getPaddingTop();
    paramInt4 = 0;
    int j = 0;
    View localView;
    int n;
    int m;
    int k;
    if (j < i1)
    {
      localView = getChildAt(j);
      n = i;
      m = paramInt4;
      k = paramInt2;
      if (localView.getVisibility() != 8)
      {
        k = localView.getMeasuredWidth();
        m = localView.getMeasuredHeight();
        if (i + k + getPaddingRight() <= paramInt3 - paramInt1) {
          break label210;
        }
        i = getPaddingLeft();
        paramInt2 += ((Integer)this.tst.get(paramInt4)).intValue() + this.tss;
        paramInt4 += 1;
      }
    }
    label210:
    for (;;)
    {
      n = (((Integer)this.tst.get(paramInt4)).intValue() - m) / 2;
      localView.layout(i, paramInt2 + n, i + k, n + paramInt2 + m);
      n = this.tsr + k + i;
      k = paramInt2;
      m = paramInt4;
      j += 1;
      i = n;
      paramInt4 = m;
      paramInt2 = k;
      break;
      return;
    }
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    assert (View.MeasureSpec.getMode(paramInt1) != 0);
    int i5 = View.MeasureSpec.getSize(paramInt1) - getPaddingLeft() - getPaddingRight();
    int i4 = View.MeasureSpec.getSize(paramInt2) - getPaddingTop() - getPaddingBottom();
    int i6 = getChildCount();
    this.tst.clear();
    if (View.MeasureSpec.getMode(paramInt2) == Integer.MIN_VALUE) {}
    int j;
    int k;
    for (int n = View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE);; n = View.MeasureSpec.makeMeasureSpec(0, 0))
    {
      int i1 = 0;
      j = 0;
      k = 0;
      int i2;
      for (int i = 0; i1 < i6; i = i2)
      {
        View localView = getChildAt(i1);
        int i3 = j;
        int m = k;
        i2 = i;
        if (localView.getVisibility() != 8)
        {
          localView.measure(View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE), n);
          int i7 = localView.getMeasuredWidth();
          i3 = j;
          m = k;
          i2 = i;
          if (i + i7 > i5)
          {
            m = k + (this.tss + j);
            this.tst.add(Integer.valueOf(j));
            i3 = 0;
            i2 = 0;
          }
          i3 = Math.max(i3, localView.getMeasuredHeight());
          i2 += this.tsr + i7;
        }
        i1 += 1;
        j = i3;
        k = m;
      }
    }
    this.tst.add(Integer.valueOf(j));
    if (View.MeasureSpec.getMode(paramInt2) == 0) {
      paramInt2 = k + j + getPaddingTop() + getPaddingBottom();
    }
    for (;;)
    {
      setMeasuredDimension(View.MeasureSpec.getSize(paramInt1), paramInt2);
      return;
      if ((View.MeasureSpec.getMode(paramInt2) == Integer.MIN_VALUE) && (k + j < i4)) {
        paramInt2 = k + j + getPaddingTop() + getPaddingBottom();
      } else {
        paramInt2 = i4;
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/ui/base/FlowLayout.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */