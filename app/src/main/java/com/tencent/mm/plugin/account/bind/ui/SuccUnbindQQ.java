package com.tencent.mm.plugin.account.bind.ui;

import android.os.Bundle;
import com.tencent.mm.plugin.account.a.g;
import com.tencent.mm.plugin.account.a.j;
import com.tencent.mm.ui.MMWizardActivity;

public class SuccUnbindQQ
  extends MMWizardActivity
{
  protected final int getLayoutId()
  {
    return a.g.succ_unbindqq;
  }
  
  protected final void initView()
  {
    setMMTitle(a.j.unbind_qq);
    addTextOptionMenu(0, getString(a.j.app_finish), new SuccUnbindQQ.1(this));
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
  }
  
  public void onDestroy()
  {
    super.onDestroy();
  }
  
  protected void onResume()
  {
    super.onResume();
    initView();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/account/bind/ui/SuccUnbindQQ.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */