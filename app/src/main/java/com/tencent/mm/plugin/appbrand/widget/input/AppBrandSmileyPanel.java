package com.tencent.mm.plugin.appbrand.widget.input;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import com.tencent.mm.compatible.util.d;
import com.tencent.mm.compatible.util.j;
import com.tencent.mm.plugin.appbrand.s.e;
import com.tencent.mm.plugin.appbrand.widget.input.panel.AppBrandSmileyPanelBase;
import com.tencent.mm.plugin.appbrand.widget.input.panel.c;

final class AppBrandSmileyPanel
  extends AppBrandSmileyPanelBase
{
  private int gIc = 0;
  int gId = -1;
  private boolean mInLayout = false;
  
  public AppBrandSmileyPanel(Context paramContext)
  {
    super(paramContext);
  }
  
  public AppBrandSmileyPanel(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  protected final c apD()
  {
    return new ag();
  }
  
  final boolean apE()
  {
    if (d.fR(18)) {
      return super.isInLayout();
    }
    return this.mInLayout;
  }
  
  protected final void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.mInLayout = true;
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    this.mInLayout = false;
  }
  
  protected final void onMeasure(int paramInt1, int paramInt2)
  {
    if (!isShown())
    {
      bZ(paramInt1, View.MeasureSpec.makeMeasureSpec(0, Integer.MIN_VALUE));
      return;
    }
    int[] arrayOfInt;
    if (!j.fC(getContext()))
    {
      getManager();
      arrayOfInt = c.anG();
      paramInt2 = Math.min(arrayOfInt[0], arrayOfInt[1]) / 2 - getContext().getResources().getDimensionPixelSize(s.e.ChattingFootEditMinHeigh);
    }
    for (;;)
    {
      bZ(paramInt1, View.MeasureSpec.makeMeasureSpec(paramInt2, 1073741824));
      return;
      if (this.gId > 0)
      {
        paramInt2 = this.gId;
      }
      else if (this.gIc > 0)
      {
        paramInt2 = this.gIc;
      }
      else
      {
        getManager();
        arrayOfInt = c.anG();
        paramInt2 = Math.max(arrayOfInt[0], arrayOfInt[1]) / 2 - getContext().getResources().getDimensionPixelSize(s.e.ChattingFootEditMinHeigh);
        this.gIc = paramInt2;
      }
    }
  }
  
  public final void setVisibility(int paramInt)
  {
    md(paramInt);
    if (paramInt == 0) {
      initView();
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/appbrand/widget/input/AppBrandSmileyPanel.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */