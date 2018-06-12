package com.tencent.mm.plugin.wallet_payu.balance.ui;

import android.os.Bundle;
import com.tencent.mm.ab.l;
import com.tencent.mm.plugin.wallet.a.p;
import com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceManagerUI;
import com.tencent.mm.plugin.wallet_core.c.b.a;
import com.tencent.mm.plugin.wallet_core.model.ag;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;

public class WalletPayUBalanceManagerUI
  extends WalletBalanceManagerUI
{
  protected final void bMV()
  {
    p.bNp();
    if (p.bNq().paw == null) {}
    for (boolean bool = true;; bool = false)
    {
      a(new a(), bool, false);
      return;
    }
  }
  
  protected final void bMW()
  {
    L(WalletPayUBalanceSaveUI.class);
  }
  
  public final boolean d(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    if ((paramInt1 == 0) && (paramInt2 == 0) && ((paraml instanceof a))) {
      aL();
    }
    return false;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/plugin/wallet_payu/balance/ui/WalletPayUBalanceManagerUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */