package com.tencent.mm.ui.conversation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.widget.AbsListView.LayoutParams;
import android.widget.ListAdapter;
import android.widget.ListView;

public class EnterpriseFullHeightListView
  extends ListView
{
  private int hGJ = 0;
  public boolean uqD = true;
  private View uqE;
  
  public EnterpriseFullHeightListView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public EnterpriseFullHeightListView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i = 0;
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    if (this.uqD) {
      return;
    }
    label240:
    for (;;)
    {
      try
      {
        if (this.uqD) {
          break;
        }
        int j = getHeaderViewsCount();
        int k = getAdapter().getCount();
        paramInt4 = i;
        paramInt1 = k;
        paramInt3 = j;
        if (this.uqE != null)
        {
          paramInt1 = k - 1;
          paramInt3 = j;
          paramInt4 = i;
        }
        if (paramInt3 < paramInt1)
        {
          i = this.hGJ;
          if (i > 0) {}
        }
      }
      catch (Exception localException1)
      {
        View localView;
        return;
      }
      try
      {
        localView = getAdapter().getView(paramInt3, null, this);
        localView.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        this.hGJ = localView.getMeasuredHeight();
        i = paramInt4 + this.hGJ;
        paramInt4 = i;
        if (i <= paramInt2) {
          break label240;
        }
        if (this.uqE == null) {
          break;
        }
        removeFooterView(this.uqE);
        this.uqE = null;
        return;
      }
      catch (Exception localException2)
      {
        paramInt3 += 1;
      }
      if (paramInt4 >= paramInt2) {
        break;
      }
      if (this.uqE == null) {
        this.uqE = new View(getContext());
      }
      removeFooterView(this.uqE);
      this.uqE.setLayoutParams(new AbsListView.LayoutParams(-1, paramInt2 - paramInt4));
      addFooterView(this.uqE, null, false);
      return;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/ui/conversation/EnterpriseFullHeightListView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */