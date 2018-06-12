package com.tencent.mm.plugin.wallet.bind;

import android.app.Activity;
import android.os.Bundle;
import com.tencent.mm.plugin.wallet.bind.ui.WalletBankcardDetailUI;
import com.tencent.mm.plugin.wallet_core.ui.WalletCheckPwdUI;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.wallet_core.c;
import com.tencent.mm.wallet_core.d.g;
import com.tencent.mm.wallet_core.d.i;

public class a
  extends c
{
  public final c a(Activity paramActivity, Bundle paramBundle)
  {
    x.d("MicroMsg.ProcessManager", "start Process : UnbindProcess");
    if (paramBundle.getBoolean("key_is_show_detail", true))
    {
      d(paramActivity, paramBundle);
      return this;
    }
    c(paramActivity, WalletCheckPwdUI.class, paramBundle);
    return this;
  }
  
  public g a(MMActivity paramMMActivity, i parami)
  {
    if ((paramMMActivity instanceof WalletCheckPwdUI)) {
      return new a.1(this, paramMMActivity, parami);
    }
    return super.a(paramMMActivity, parami);
  }
  
  public void a(Activity paramActivity, int paramInt, Bundle paramBundle)
  {
    if ((paramActivity instanceof WalletBankcardDetailUI)) {
      c(paramActivity, WalletCheckPwdUI.class, paramBundle);
    }
    while (!(paramActivity instanceof WalletCheckPwdUI)) {
      return;
    }
    b(paramActivity, paramBundle);
  }
  
  public final String aNK()
  {
    return "UnbindProcess";
  }
  
  public void b(Activity paramActivity, Bundle paramBundle)
  {
    if (this.jfZ.getInt("scene", -1) == 1)
    {
      a(paramActivity, "wallet", ".bind.ui.WalletUnbindBankCardProxyUI", paramBundle.getInt("key_process_result_code", 0), false);
      return;
    }
    if (this.jfZ.getInt("scene", -1) == 2)
    {
      e(paramActivity, "wallet", ".balance.ui.WalletBalanceManagerUI");
      return;
    }
    e(paramActivity, "mall", ".ui.MallIndexUI");
  }
  
  public final void c(Activity paramActivity, int paramInt)
  {
    z(paramActivity);
  }
  
  public boolean c(Activity paramActivity, Bundle paramBundle)
  {
    return (paramActivity instanceof WalletCheckPwdUI);
  }
  
  public void d(Activity paramActivity, Bundle paramBundle)
  {
    c(paramActivity, WalletBankcardDetailUI.class, paramBundle);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/wallet/bind/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */