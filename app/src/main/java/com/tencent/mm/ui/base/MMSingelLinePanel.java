package com.tencent.mm.ui.base;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.widget.TextView;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.w.a.d;
import com.tencent.mm.w.a.m;
import java.util.LinkedList;

public class MMSingelLinePanel
  extends MMTagPanel
{
  private int tsr = 0;
  private int tss = 0;
  private LinkedList<Integer> tst = new LinkedList();
  private boolean txi = true;
  private TextView txj;
  private int txk = 0;
  private int txl = 0;
  
  static
  {
    if (!MMSingelLinePanel.class.desiredAssertionStatus()) {}
    for (boolean bool = true;; bool = false)
    {
      $assertionsDisabled = bool;
      return;
    }
  }
  
  public MMSingelLinePanel(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public MMSingelLinePanel(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
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
  
  public final void crI()
  {
    super.crI();
    this.txj = new TextView(getContext());
    this.txj.setText("...");
    this.txj.setTextColor(getResources().getColor(a.d.wechat_green));
    this.txj.setLayoutParams(generateDefaultLayoutParams());
    addView(this.txj);
  }
  
  public boolean dispatchTouchEvent(MotionEvent paramMotionEvent)
  {
    return false;
  }
  
  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    return true;
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int n;
    int i1;
    int i;
    int k;
    int m;
    int j;
    View localView;
    if (this.txi)
    {
      n = getChildCount();
      i1 = this.txk;
      i = getPaddingLeft();
      paramInt2 = getPaddingTop();
      k = 0;
      m = 0;
      paramInt4 = 0;
      j = 0;
      if (j < n)
      {
        localView = getChildAt(j);
        if ((localView.getVisibility() == 8) || (localView == this.txj)) {
          break label487;
        }
        int i2 = localView.getMeasuredWidth();
        int i3 = localView.getMeasuredHeight();
        if (i + i2 + getPaddingRight() <= paramInt3 - paramInt1 - i1) {
          break label484;
        }
        i = getPaddingLeft();
        paramInt2 += ((Integer)this.tst.get(paramInt4)).intValue() + this.tss;
        paramInt4 += 1;
        label145:
        if (paramInt4 > 0) {
          break label481;
        }
        localView.layout(i, paramInt2 + 0, i + i2, paramInt2 + 0 + i3);
        i = this.tsr + i2 + i;
        m = paramInt2;
        k = i;
      }
    }
    label272:
    label478:
    label481:
    label484:
    label487:
    for (;;)
    {
      j += 1;
      break;
      if (this.txj != null)
      {
        if (paramInt4 > 0) {
          this.txj.layout(k, m, this.txk + k, this.txl + m);
        }
      }
      else {
        return;
      }
      this.txj.layout(0, 0, 0, 0);
      return;
      i1 = getChildCount();
      i = getPaddingLeft();
      paramInt2 = getPaddingTop();
      paramInt4 = 0;
      j = 0;
      if (j < i1)
      {
        localView = getChildAt(j);
        n = i;
        m = paramInt4;
        k = paramInt2;
        if (localView.getVisibility() != 8)
        {
          n = i;
          m = paramInt4;
          k = paramInt2;
          if (localView != this.txj)
          {
            k = localView.getMeasuredWidth();
            m = localView.getMeasuredHeight();
            if (i + k + getPaddingRight() <= paramInt3 - paramInt1) {
              break label478;
            }
            i = getPaddingLeft();
            paramInt2 += ((Integer)this.tst.get(paramInt4)).intValue() + this.tss;
            paramInt4 += 1;
          }
        }
      }
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
        break label272;
        break;
      }
      continue;
      break label145;
    }
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    assert (View.MeasureSpec.getMode(paramInt1) != 0);
    int m = View.MeasureSpec.getSize(paramInt1) - getPaddingLeft() - getPaddingRight();
    int i7 = View.MeasureSpec.getSize(paramInt2) - getPaddingTop() - getPaddingBottom();
    int i8 = getChildCount();
    this.tst.clear();
    int k = 0;
    int j = 0;
    int i = 0;
    if (View.MeasureSpec.getMode(paramInt2) == Integer.MIN_VALUE) {}
    for (int n = View.MeasureSpec.makeMeasureSpec(i7, Integer.MIN_VALUE);; n = View.MeasureSpec.makeMeasureSpec(0, 0))
    {
      if ((this.txi) && (this.txj != null))
      {
        this.txj.measure(View.MeasureSpec.makeMeasureSpec(m, Integer.MIN_VALUE), n);
        this.txk = this.txj.getMeasuredWidth();
        this.txl = this.txj.getMeasuredHeight();
        x.d("MicroMsg.MMTagContactPanel", "mEllipsisWidth %d", new Object[] { Integer.valueOf(this.txk) });
      }
      int i1 = m;
      if (this.txi) {
        i1 = m - this.txk;
      }
      m = 0;
      int i2 = 0;
      while (i2 < i8)
      {
        View localView = getChildAt(i2);
        int i6 = i;
        int i5 = j;
        int i3 = k;
        int i4 = m;
        if (localView.getVisibility() != 8)
        {
          localView.measure(View.MeasureSpec.makeMeasureSpec(i1, Integer.MIN_VALUE), n);
          int i9 = localView.getMeasuredWidth();
          i5 = localView.getMeasuredHeight();
          i4 = i;
          m = j;
          i3 = k;
          if (k + i9 > i1)
          {
            i3 = 0;
            m = j + (this.tss + i);
            this.tst.add(Integer.valueOf(i));
            i4 = 0;
          }
          i6 = Math.max(i4, localView.getMeasuredHeight());
          i3 += this.tsr + i9;
          i4 = i5;
          i5 = m;
        }
        i2 += 1;
        i = i6;
        j = i5;
        k = i3;
        m = i4;
      }
    }
    this.tst.add(Integer.valueOf(i));
    if (this.txi)
    {
      getPaddingTop();
      getPaddingBottom();
    }
    for (;;)
    {
      setMeasuredDimension(View.MeasureSpec.getSize(paramInt1), m);
      return;
      if (View.MeasureSpec.getMode(paramInt2) == 0)
      {
        getPaddingTop();
        getPaddingBottom();
      }
      else if ((View.MeasureSpec.getMode(paramInt2) == Integer.MIN_VALUE) && (j + i < i7))
      {
        getPaddingTop();
        getPaddingBottom();
      }
    }
  }
  
  public void setSingleLine(boolean paramBoolean)
  {
    this.txi = paramBoolean;
    this.txj = new TextView(getContext());
    this.txj.setText("...");
    this.txj.setLayoutParams(generateDefaultLayoutParams());
    addView(this.txj);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/ui/base/MMSingelLinePanel.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */