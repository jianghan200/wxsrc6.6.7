package com.tencent.mm.plugin.appbrand.ui;

import android.support.v7.app.ActionBar;
import android.view.View;
import android.view.ViewGroup.MarginLayoutParams;
import com.tencent.mm.plugin.appbrand.compat.n.a;
import com.tencent.mm.ui.MMActivity;

final class k
{
  static void c(MMActivity paramMMActivity)
  {
    if ((paramMMActivity == null) || (paramMMActivity.getSupportActionBar() == null)) {}
    do
    {
      return;
      paramMMActivity = paramMMActivity.getSupportActionBar().getCustomView().findViewById(n.a.actionbar_up_indicator);
    } while ((paramMMActivity == null) || (paramMMActivity.getLayoutParams() == null) || (!(paramMMActivity.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)));
    ((ViewGroup.MarginLayoutParams)paramMMActivity.getLayoutParams()).rightMargin = 0;
    paramMMActivity.requestLayout();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/appbrand/ui/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */