package com.tencent.mm.plugin.wallet.pwd;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.mm.ab.l;
import com.tencent.mm.plugin.wallet.pwd.ui.WalletResetPwdAdapterUI;
import com.tencent.mm.plugin.wallet_core.model.p;
import com.tencent.mm.plugin.wallet_core.ui.WalletCheckPwdUI;
import com.tencent.mm.plugin.wallet_core.ui.WalletPwdConfirmUI;
import com.tencent.mm.plugin.wallet_core.ui.WalletSetPasswordUI;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.wallet_core.d.i;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;

public class c
  extends com.tencent.mm.wallet_core.c
{
  public final int a(MMActivity paramMMActivity, int paramInt)
  {
    return a.i.wallet_set_password_finish_confirm;
  }
  
  public final com.tencent.mm.wallet_core.c a(Activity paramActivity, Bundle paramBundle)
  {
    x.d("MicroMsg.ResetPwdProcessByToken", "start Process : ResetPwdProcessByToken");
    c(paramActivity, WalletSetPasswordUI.class, paramBundle);
    return this;
  }
  
  public final com.tencent.mm.wallet_core.d.g a(MMActivity paramMMActivity, i parami)
  {
    if ((paramMMActivity instanceof WalletCheckPwdUI)) {
      return new c.1(this, paramMMActivity, parami);
    }
    if ((paramMMActivity instanceof WalletPwdConfirmUI)) {
      new com.tencent.mm.wallet_core.d.g(paramMMActivity, parami)
      {
        public final boolean d(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, l paramAnonymousl)
        {
          if ((paramAnonymousInt1 == 0) && (paramAnonymousInt2 == 0))
          {
            if ((paramAnonymousl instanceof com.tencent.mm.plugin.wallet.pwd.a.g))
            {
              c.a(c.this).putInt("RESET_PWD_USER_ACTION", 1);
              c.this.a(this.fEY, 0, c.b(c.this));
              h.bA(this.fEY, this.fEY.getString(a.i.wallet_password_setting_success_tip));
            }
            return true;
          }
          if ((paramAnonymousl instanceof com.tencent.mm.plugin.wallet.pwd.a.g))
          {
            h.a(this.fEY, paramAnonymousString, "", false, new c.2.1(this));
            return true;
          }
          return false;
        }
        
        public final boolean m(Object... paramAnonymousVarArgs)
        {
          paramAnonymousVarArgs = (p)paramAnonymousVarArgs[0];
          c.e(c.this).getString("key_pwd1");
          this.uXK.a(new com.tencent.mm.plugin.wallet.pwd.a.g(paramAnonymousVarArgs.eJn, paramAnonymousVarArgs.token), true, 1);
          return true;
        }
      };
    }
    return super.a(paramMMActivity, parami);
  }
  
  public final void a(Activity paramActivity, int paramInt, Bundle paramBundle)
  {
    if ((paramActivity instanceof WalletSetPasswordUI)) {
      c(paramActivity, WalletPwdConfirmUI.class, paramBundle);
    }
    while (!(paramActivity instanceof WalletPwdConfirmUI)) {
      return;
    }
    b(paramActivity, paramBundle);
  }
  
  public final boolean a(WalletBaseUI paramWalletBaseUI, int paramInt, String paramString)
  {
    switch (paramInt)
    {
    default: 
      return false;
    }
    h.a(paramWalletBaseUI, paramString, null, paramWalletBaseUI.getString(a.i.wallet_set_password_finish_confirm), false, new c.3(this, paramWalletBaseUI));
    return true;
  }
  
  public final String aNK()
  {
    return "ResetPwdProcessByToken";
  }
  
  public final void b(Activity paramActivity, Bundle paramBundle)
  {
    Intent localIntent = new Intent(paramActivity, WalletResetPwdAdapterUI.class);
    localIntent.putExtra("RESET_PWD_USER_ACTION", paramBundle.getInt("RESET_PWD_USER_ACTION", 0));
    a(paramActivity, WalletResetPwdAdapterUI.class, -1, localIntent, false);
  }
  
  public final void c(Activity paramActivity, int paramInt)
  {
    if ((paramActivity instanceof WalletPwdConfirmUI)) {
      a(paramActivity, WalletSetPasswordUI.class, paramInt);
    }
  }
  
  public final boolean c(Activity paramActivity, Bundle paramBundle)
  {
    return false;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/wallet/pwd/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */