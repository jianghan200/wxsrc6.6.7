package com.tencent.mm.plugin.wallet_payu.pwd.a;

import android.app.Activity;
import android.os.Bundle;
import com.tencent.mm.plugin.wallet_payu.pwd.ui.WalletPayUCheckPwdUI;
import com.tencent.mm.plugin.wallet_payu.pwd.ui.WalletPayUPwdConfirmUI;
import com.tencent.mm.plugin.wallet_payu.pwd.ui.WalletPayUSetPasswordUI;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.wallet_core.c;
import com.tencent.mm.wallet_core.d.i;

public class g
  extends e
{
  public final c a(Activity paramActivity, Bundle paramBundle)
  {
    c(paramActivity, WalletPayUCheckPwdUI.class, paramBundle);
    return this;
  }
  
  public final com.tencent.mm.wallet_core.d.g a(MMActivity paramMMActivity, i parami)
  {
    if ((paramMMActivity instanceof WalletPayUCheckPwdUI)) {
      return new g.1(this, paramMMActivity, parami, this.jfZ);
    }
    if ((paramMMActivity instanceof WalletPayUPwdConfirmUI)) {
      return new g.2(this, paramMMActivity, parami);
    }
    return super.a(paramMMActivity, parami);
  }
  
  public final void a(Activity paramActivity, int paramInt, Bundle paramBundle)
  {
    if ((paramActivity instanceof WalletPayUCheckPwdUI))
    {
      c(paramActivity, WalletPayUSetPasswordUI.class, paramBundle);
      return;
    }
    super.a(paramActivity, paramInt, paramBundle);
  }
  
  public final String aNK()
  {
    return "PayUModifyPasswordProcess";
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/wallet_payu/pwd/a/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */