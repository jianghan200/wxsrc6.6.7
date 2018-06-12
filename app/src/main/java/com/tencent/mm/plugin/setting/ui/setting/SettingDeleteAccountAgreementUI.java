package com.tencent.mm.plugin.setting.ui.setting;

import android.os.Bundle;
import android.widget.CheckedTextView;
import android.widget.TextView;
import com.tencent.mm.plugin.setting.a.f;
import com.tencent.mm.plugin.setting.a.g;
import com.tencent.mm.plugin.setting.a.i;
import com.tencent.mm.ui.MMActivity;

public class SettingDeleteAccountAgreementUI
  extends MMActivity
{
  protected final int getLayoutId()
  {
    return a.g.setting_delete_account_agreement_ui;
  }
  
  protected final void initView()
  {
    TextView localTextView = (TextView)findViewById(a.f.next_btn);
    localTextView.setOnClickListener(new SettingDeleteAccountAgreementUI.1(this));
    CheckedTextView localCheckedTextView = (CheckedTextView)findViewById(a.f.agreement_cb);
    localCheckedTextView.setOnClickListener(new SettingDeleteAccountAgreementUI.2(this, localTextView, localCheckedTextView));
    localTextView.setEnabled(localCheckedTextView.isChecked());
    setBackBtn(new SettingDeleteAccountAgreementUI.3(this));
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setMMTitle(a.i.setting_del_account_title);
    initView();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/setting/ui/setting/SettingDeleteAccountAgreementUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */