package com.tencent.mm.plugin.wxcredit;

import android.app.Activity;
import android.os.Bundle;
import com.tencent.mm.plugin.wallet_core.ui.WalletCheckPwdUI;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.wallet_core.c;
import com.tencent.mm.wallet_core.d.g;
import com.tencent.mm.wallet_core.d.i;

public class f
  extends c
{
  public final c a(Activity paramActivity, Bundle paramBundle)
  {
    x.d("MicroMsg.ProcessManager", "start Process : UnbindProcess");
    if (paramBundle.getBoolean("key_is_show_detail", true))
    {
      a(paramActivity, "wallet", ".bind.ui.WalletBankcardDetailUI", paramBundle);
      return this;
    }
    c(paramActivity, WalletCheckPwdUI.class, paramBundle);
    return this;
  }
  
  public final g a(MMActivity paramMMActivity, i parami)
  {
    if ((paramMMActivity instanceof WalletCheckPwdUI)) {
      return new f.1(this, paramMMActivity, parami);
    }
    return super.a(paramMMActivity, parami);
  }
  
  public final void a(Activity paramActivity, int paramInt, Bundle paramBundle)
  {
    if (paramActivity.getClass().getSimpleName().equalsIgnoreCase("WalletBankcardDetailUI")) {
      c(paramActivity, WalletCheckPwdUI.class, paramBundle);
    }
    while (!(paramActivity instanceof WalletCheckPwdUI)) {
      return;
    }
    b(paramActivity, paramBundle);
  }
  
  public final String aNK()
  {
    return "WXCreditUnbindProcess";
  }
  
  public final void b(Activity paramActivity, Bundle paramBundle)
  {
    e(paramActivity, "mall", ".ui.MallIndexUI");
  }
  
  public final void c(Activity paramActivity, int paramInt)
  {
    z(paramActivity);
  }
  
  public final boolean c(Activity paramActivity, Bundle paramBundle)
  {
    return false;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/wxcredit/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */