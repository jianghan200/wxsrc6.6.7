package com.tencent.mm.plugin.wallet.pwd;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import com.tencent.mm.plugin.wallet.pwd.ui.WalletPasswordSettingUI;
import com.tencent.mm.plugin.wallet_core.ui.WalletCheckPwdUI;
import com.tencent.mm.plugin.wallet_core.ui.WalletPwdConfirmUI;
import com.tencent.mm.plugin.wallet_core.ui.WalletSetPasswordUI;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.wallet_core.c;
import com.tencent.mm.wallet_core.d.g;
import com.tencent.mm.wallet_core.d.i;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;

public class b
  extends c
{
  public final int a(MMActivity paramMMActivity, int paramInt)
  {
    return a.i.wallet_set_password_finish_confirm;
  }
  
  public final c a(Activity paramActivity, Bundle paramBundle)
  {
    x.d("MicroMsg.ProcessManager", "start Process : ModifyPwdProcess");
    c(paramActivity, WalletCheckPwdUI.class, paramBundle);
    return this;
  }
  
  public final g a(MMActivity paramMMActivity, i parami)
  {
    if ((paramMMActivity instanceof WalletCheckPwdUI)) {
      return new b.1(this, paramMMActivity, parami);
    }
    if ((paramMMActivity instanceof WalletPwdConfirmUI)) {
      return new b.2(this, paramMMActivity, parami);
    }
    return super.a(paramMMActivity, parami);
  }
  
  public final void a(Activity paramActivity, int paramInt, Bundle paramBundle)
  {
    if ((paramActivity instanceof WalletCheckPwdUI)) {
      c(paramActivity, WalletSetPasswordUI.class, paramBundle);
    }
    do
    {
      return;
      if ((paramActivity instanceof WalletSetPasswordUI))
      {
        c(paramActivity, WalletPwdConfirmUI.class, paramBundle);
        return;
      }
    } while (!(paramActivity instanceof WalletPwdConfirmUI));
    b(paramActivity, paramBundle);
  }
  
  public final boolean a(final WalletBaseUI paramWalletBaseUI, int paramInt, String paramString)
  {
    switch (paramInt)
    {
    default: 
      return false;
    }
    h.a(paramWalletBaseUI, paramString, null, paramWalletBaseUI.getString(a.i.wallet_set_password_finish_confirm), false, new DialogInterface.OnClickListener()
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        b.this.b(paramWalletBaseUI, b.c(b.this));
        if (paramWalletBaseUI.bbR()) {
          paramWalletBaseUI.finish();
        }
        WalletBaseUI.cDI();
      }
    });
    return true;
  }
  
  public final String aNK()
  {
    return "ModifyPwdProcess";
  }
  
  public final void b(Activity paramActivity, Bundle paramBundle)
  {
    a(paramActivity, WalletPasswordSettingUI.class, -1, false);
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


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/wallet/pwd/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */