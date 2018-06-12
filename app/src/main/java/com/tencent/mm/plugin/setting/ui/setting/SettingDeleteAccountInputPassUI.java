package com.tencent.mm.plugin.setting.ui.setting;

import android.os.Bundle;
import com.tencent.mm.plugin.setting.a.g;
import com.tencent.mm.plugin.setting.a.i;
import com.tencent.mm.ui.MMActivity;

public class SettingDeleteAccountInputPassUI
  extends MMActivity
{
  protected final int getLayoutId()
  {
    return a.g.setting_delete_account_input_pass;
  }
  
  protected final void initView()
  {
    setBackBtn(new SettingDeleteAccountInputPassUI.1(this));
    addTextOptionMenu(0, getString(a.i.app_finish), new SettingDeleteAccountInputPassUI.2(this));
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setMMTitle(a.i.setting_del_account_title);
    initView();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/setting/ui/setting/SettingDeleteAccountInputPassUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */