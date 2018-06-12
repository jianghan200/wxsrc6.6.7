package com.tencent.mm.plugin.wallet_payu.pwd.ui;

import com.tencent.mm.plugin.wallet.pwd.ui.WalletPasswordSettingUI;
import com.tencent.mm.plugin.wallet_payu.pwd.a.g;
import com.tencent.mm.plugin.wxpay.a.l;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.wallet_core.a;

public class WalletPayUPasswordSettingUI
  extends WalletPasswordSettingUI
{
  protected final int bOd()
  {
    return a.l.wallet_payu_password_setting_pref;
  }
  
  protected final void bOe()
  {
    x.d("MicroMsg.WalletPayUPasswordSettingUI", "hy: start payu reset pwd");
    a.a(this, g.class, null);
  }
  
  protected final void bOf()
  {
    x.d("MicroMsg.WalletPayUPasswordSettingUI", "hy: start payu do forgot pwd");
    a.a(this, com.tencent.mm.plugin.wallet_payu.pwd.a.f.class, null);
  }
  
  protected final void bOg()
  {
    this.tCL.bw("wallet_modify_gesture_password", true);
    this.tCL.bw("wallet_open_gesture_password", true);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/wallet_payu/pwd/ui/WalletPayUPasswordSettingUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */