package com.tencent.mm.plugin.webview.ui.tools.fts;

import android.content.res.Resources;
import android.view.View;
import android.widget.FrameLayout.LayoutParams;
import com.tencent.mm.R.e;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.s;
import com.tencent.mm.ui.statusbar.a;
import com.tencent.mm.ui.statusbar.b;
import com.tencent.mm.ui.widget.SwipeBackLayout;

public abstract class CustomStatusBarMMActivity
  extends MMActivity
{
  private b gue = null;
  
  protected int getStatusBarColor()
  {
    return getResources().getColor(R.e.status_bar_color);
  }
  
  public boolean initNavigationSwipeBack()
  {
    boolean bool = super.initNavigationSwipeBack();
    if (!isSupportNavigationSwipeBack()) {
      a.c(this.mController.contentView, getStatusBarColor(), true);
    }
    return bool;
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
    a.c(this.mController.contentView, getStatusBarColor(), true);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/webview/ui/tools/fts/CustomStatusBarMMActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */