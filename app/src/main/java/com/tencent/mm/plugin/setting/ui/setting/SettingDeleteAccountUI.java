package com.tencent.mm.plugin.setting.ui.setting;

import android.os.Bundle;
import android.widget.TextView;
import com.tencent.mm.plugin.setting.a.f;
import com.tencent.mm.plugin.setting.a.g;
import com.tencent.mm.plugin.setting.a.i;
import com.tencent.mm.ui.MMActivity;

public class SettingDeleteAccountUI
  extends MMActivity
{
  protected final int getLayoutId()
  {
    return a.g.setting_delete_account;
  }
  
  protected final void initView()
  {
    setBackBtn(new SettingDeleteAccountUI.1(this));
    ((TextView)findViewById(a.f.delete_account_btn)).setOnClickListener(new SettingDeleteAccountUI.2(this));
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setMMTitle(a.i.setting_del_account_title);
    initView();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/setting/ui/setting/SettingDeleteAccountUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */