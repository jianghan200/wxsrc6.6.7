package com.tencent.mm.plugin.appbrand.ui;

import android.content.Intent;
import com.tencent.mm.ui.MMFragmentActivity.a;
import com.tencent.mm.ui.base.a;

@a(1)
public class AppBrandPluginUI
  extends AppBrandUI
{
  private boolean guX = false;
  
  public final boolean Xf()
  {
    return true;
  }
  
  protected void initActivityCloseAnimation()
  {
    if (this.guX) {
      return;
    }
    super.overridePendingTransition(MMFragmentActivity.a.tnE, MMFragmentActivity.a.tnF);
  }
  
  protected void initActivityOpenAnimation(Intent paramIntent)
  {
    super.overridePendingTransition(MMFragmentActivity.a.tnC, MMFragmentActivity.a.tnD);
  }
  
  public void onSwipeBack()
  {
    super.onSwipeBack();
    this.guX = true;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/appbrand/ui/AppBrandPluginUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */