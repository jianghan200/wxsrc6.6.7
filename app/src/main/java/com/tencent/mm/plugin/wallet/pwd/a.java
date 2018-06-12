package com.tencent.mm.plugin.wallet.pwd;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.mm.plugin.wallet.a.p;
import com.tencent.mm.plugin.wallet.pwd.ui.WalletForgotPwdBindNewUI;
import com.tencent.mm.plugin.wallet.pwd.ui.WalletForgotPwdUI;
import com.tencent.mm.plugin.wallet_core.model.ag;
import com.tencent.mm.plugin.wallet_core.ui.WalletBankcardIdUI;
import com.tencent.mm.plugin.wallet_core.ui.WalletCardElementUI;
import com.tencent.mm.plugin.wallet_core.ui.WalletConfirmCardIDUI;
import com.tencent.mm.plugin.wallet_core.ui.WalletPwdConfirmUI;
import com.tencent.mm.plugin.wallet_core.ui.WalletSetPasswordUI;
import com.tencent.mm.plugin.wallet_core.ui.WalletVerifyCodeUI;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.wallet_core.c;
import com.tencent.mm.wallet_core.d.g;
import com.tencent.mm.wallet_core.d.i;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;

public class a
  extends com.tencent.mm.plugin.wallet_core.b.a
{
  public final int a(MMActivity paramMMActivity, int paramInt)
  {
    return a.i.wallet_forget_password_finish_confirm;
  }
  
  public final c a(Activity paramActivity, Bundle paramBundle)
  {
    x.d("MicroMsg.ProcessManager", "start Process : ForgotPwdProcess");
    Bundle localBundle = this.jfZ;
    p.bNp();
    boolean bool;
    if (!p.bNq().bPx())
    {
      bool = true;
      localBundle.putBoolean("key_is_oversea", bool);
      localBundle = this.jfZ;
      p.bNp();
      if (!p.bNq().bPx()) {
        break label93;
      }
    }
    label93:
    for (int i = 1;; i = 2)
    {
      localBundle.putInt("key_support_bankcard", i);
      this.jfZ.putBoolean("key_is_forgot_process", true);
      c(paramActivity, WalletForgotPwdUI.class, paramBundle);
      return this;
      bool = false;
      break;
    }
  }
  
  public final g a(MMActivity paramMMActivity, i parami)
  {
    if ((paramMMActivity instanceof WalletForgotPwdUI)) {
      return new a.1(this, paramMMActivity, parami);
    }
    if ((paramMMActivity instanceof WalletCardElementUI)) {
      return new a.2(this, paramMMActivity, parami);
    }
    if ((paramMMActivity instanceof WalletVerifyCodeUI)) {
      return new a.3(this, paramMMActivity, parami);
    }
    if ((paramMMActivity instanceof WalletPwdConfirmUI)) {
      return new a.4(this, paramMMActivity, parami);
    }
    return super.a(paramMMActivity, parami);
  }
  
  public final void a(Activity paramActivity, int paramInt, Bundle paramBundle)
  {
    if ((paramActivity instanceof WalletForgotPwdUI)) {
      if ((paramBundle.containsKey("key_is_force_bind")) && (paramBundle.getBoolean("key_is_force_bind"))) {
        c(paramActivity, WalletForgotPwdBindNewUI.class, paramBundle);
      }
    }
    do
    {
      return;
      c(paramActivity, WalletCardElementUI.class, paramBundle);
      return;
      if ((paramActivity instanceof WalletCardElementUI))
      {
        if (!bQH())
        {
          c(paramActivity, WalletVerifyCodeUI.class, paramBundle);
          return;
        }
        c(paramActivity, WalletSetPasswordUI.class, paramBundle);
        return;
      }
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
      if ((paramActivity instanceof WalletPwdConfirmUI))
      {
        b(paramActivity, paramBundle);
        return;
      }
    } while ((!(paramActivity instanceof WalletBankcardIdUI)) && (!(paramActivity instanceof WalletConfirmCardIDUI)));
    y(new Object[] { "startActivity2", paramActivity, WalletCardElementUI.class, paramBundle, "flag: 67108864" });
    Intent localIntent = new Intent(paramActivity, WalletCardElementUI.class);
    localIntent.putExtra("process_id", getClass().hashCode());
    localIntent.addFlags(67108864);
    paramActivity.startActivity(localIntent);
    if (paramBundle != null) {
      this.jfZ.putAll(paramBundle);
    }
    x.d("MicroMsg.ProcessManager", "bankcard tag :" + cCR());
  }
  
  public final boolean a(WalletBaseUI paramWalletBaseUI, int paramInt, String paramString)
  {
    switch (paramInt)
    {
    default: 
      return false;
    }
    h.a(paramWalletBaseUI, paramString, null, paramWalletBaseUI.getString(a.i.wallet_forget_password_finish_confirm), false, new a.5(this, paramWalletBaseUI));
    return true;
  }
  
  public final String aNK()
  {
    return "ForgotPwdProcess";
  }
  
  public final void b(Activity paramActivity, Bundle paramBundle)
  {
    a(paramActivity, WalletForgotPwdUI.class, -1, false);
  }
  
  public final boolean c(Activity paramActivity, Bundle paramBundle)
  {
    return paramActivity instanceof WalletPwdConfirmUI;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/wallet/pwd/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */