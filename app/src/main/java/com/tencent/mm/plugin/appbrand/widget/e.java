package com.tencent.mm.plugin.appbrand.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;

public final class e
  extends FrameLayout
{
  public e(Context paramContext)
  {
    super(paramContext);
    setWillNotDraw(false);
  }
  
  protected final void dispatchDraw(Canvas paramCanvas)
  {
    if (willNotDraw()) {
      return;
    }
    super.dispatchDraw(paramCanvas);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/appbrand/widget/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */