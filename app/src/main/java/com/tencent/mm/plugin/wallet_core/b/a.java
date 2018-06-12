package com.tencent.mm.plugin.wallet_core.b;

import android.app.Activity;
import android.os.Bundle;
import com.tencent.mm.plugin.wallet_core.ui.WalletBankcardIdUI;
import com.tencent.mm.plugin.wallet_core.ui.WalletCardElementUI;
import com.tencent.mm.plugin.wallet_core.ui.WalletConfirmCardIDUI;
import com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoUI;
import com.tencent.mm.plugin.wallet_core.ui.WalletPwdConfirmUI;
import com.tencent.mm.plugin.wallet_core.ui.WalletSetPasswordUI;
import com.tencent.mm.plugin.wallet_core.ui.WalletVerifyCodeUI;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.wallet_core.c;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;

public abstract class a
  extends c
{
  public int a(MMActivity paramMMActivity, int paramInt)
  {
    return a.i.wallet_input_card_finish_confirm;
  }
  
  public c a(Activity paramActivity, Bundle paramBundle)
  {
    y(new Object[] { "start", paramActivity, paramBundle });
    if (paramBundle != null) {
      paramBundle.putBoolean("key_is_bind_reg_process", true);
    }
    c(paramActivity, WalletBankcardIdUI.class, paramBundle);
    return this;
  }
  
  public void a(Activity paramActivity, int paramInt, Bundle paramBundle)
  {
    y(new Object[] { "forward", paramActivity, Integer.valueOf(paramInt), paramBundle });
    if (((paramActivity instanceof WalletBankcardIdUI)) || ((paramActivity instanceof WalletConfirmCardIDUI))) {
      c(paramActivity, WalletCardElementUI.class, paramBundle);
    }
    do
    {
      return;
      if ((paramActivity instanceof WalletVerifyCodeUI))
      {
        c(paramActivity, WalletSetPasswordUI.class, paramBundle);
        return;
      }
      if ((paramActivity instanceof WalletSetPasswordUI))
      {
        c(paramActivity, WalletPwdConfirmUI.class, paramBundle);
        return;
      }
    } while (!(paramActivity instanceof WalletOrderInfoUI));
    b(paramActivity, paramBundle);
  }
  
  public boolean a(WalletBaseUI paramWalletBaseUI, int paramInt, String paramString)
  {
    switch (paramInt)
    {
    default: 
      return false;
    }
    x.i("MicroMsg.ProcessManager", "404 bind error, cancel bind!");
    h.a(paramWalletBaseUI, paramString, null, paramWalletBaseUI.getString(a.i.wallet_cancel_bind), false, new a.1(this, paramWalletBaseUI));
    return true;
  }
  
  public void c(Activity paramActivity, int paramInt)
  {
    y(new Object[] { "back", paramActivity, Integer.valueOf(paramInt) });
    if ((paramActivity instanceof WalletPwdConfirmUI))
    {
      a(paramActivity, WalletSetPasswordUI.class, paramInt);
      return;
    }
    z(paramActivity);
  }
  
  public boolean c(Activity paramActivity, Bundle paramBundle)
  {
    return paramActivity instanceof WalletOrderInfoUI;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/wallet_core/b/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */