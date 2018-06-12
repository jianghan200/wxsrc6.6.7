package com.tencent.mm.plugin.appbrand.widget.c;

import android.content.Context;
import android.view.View;
import android.view.View.MeasureSpec;
import android.widget.FrameLayout;
import com.tencent.mm.compatible.util.j;

final class a
  extends FrameLayout
{
  public a(Context paramContext, View paramView)
  {
    super(paramContext);
    addView(paramView);
  }
  
  protected final void onMeasure(int paramInt1, int paramInt2)
  {
    int i = paramInt2;
    Context localContext;
    if ((getParent() instanceof View))
    {
      i = paramInt2;
      if (((View)getParent()).getMeasuredHeight() > 0)
      {
        localContext = getContext();
        if (!j.fC(getContext())) {
          break label79;
        }
      }
    }
    label79:
    for (paramInt2 = 173;; paramInt2 = 24)
    {
      paramInt2 = com.tencent.mm.bp.a.fromDPToPix(localContext, paramInt2);
      i = View.MeasureSpec.makeMeasureSpec(((View)getParent()).getMeasuredHeight() - paramInt2, Integer.MIN_VALUE);
      super.onMeasure(paramInt1, i);
      return;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/appbrand/widget/c/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */