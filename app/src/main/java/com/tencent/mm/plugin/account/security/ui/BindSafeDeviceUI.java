package com.tencent.mm.plugin.account.security.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.mm.plugin.account.a.f;
import com.tencent.mm.plugin.account.a.g;
import com.tencent.mm.plugin.account.a.i;
import com.tencent.mm.plugin.account.a.j;
import com.tencent.mm.ui.MMWizardActivity;

public class BindSafeDeviceUI
  extends MMWizardActivity
{
  protected final int getLayoutId()
  {
    return a.g.security_account_normal;
  }
  
  protected final void initView()
  {
    setMMTitle(a.j.safe_device_account_protect);
    setBackBtn(new BindSafeDeviceUI.1(this));
    ((ImageView)findViewById(a.f.security_account_state_icon)).setImageResource(a.i.accounts_saftphone_icon);
    ((TextView)findViewById(a.f.security_account_tips)).setText(a.j.safe_device_bind__hit);
    ((TextView)findViewById(a.f.tip_title)).setText(a.j.safe_device_bind_mobile);
    findViewById(a.f.tip_title).setOnClickListener(new BindSafeDeviceUI.2(this));
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    initView();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/account/security/ui/BindSafeDeviceUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */