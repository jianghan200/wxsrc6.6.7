package com.tencent.mm.ui.statusbar;

import android.os.Build.VERSION;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout.LayoutParams;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.s;
import com.tencent.mm.ui.widget.SwipeBackLayout;

public abstract class DrawStatusBarActivity
  extends MMActivity
{
  private b gue = null;
  
  public int getStatusBarColor()
  {
    return this.mController.cqm();
  }
  
  protected void initSwipeBack()
  {
    super.initSwipeBack();
    if ((getSwipeBackLayout() != null) && (getSwipeBackLayout().getChildCount() > 0))
    {
      View localView = getSwipeBackLayout().getChildAt(0);
      getSwipeBackLayout().removeView(localView);
      this.gue = new b(this);
      this.gue.addView(localView, new FrameLayout.LayoutParams(-1, -1));
      getSwipeBackLayout().addView(this.gue);
      getSwipeBackLayout().setContentView(this.gue);
    }
  }
  
  public final void lF(int paramInt)
  {
    super.lF(paramInt);
    if ((Build.VERSION.SDK_INT >= 21) && (getWindow() != null)) {
      a.c(this.mController.contentView, getWindow().getStatusBarColor(), d.c(getWindow()));
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/ui/statusbar/DrawStatusBarActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */