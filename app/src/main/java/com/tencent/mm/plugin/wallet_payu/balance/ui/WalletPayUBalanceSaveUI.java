package com.tencent.mm.plugin.wallet_payu.balance.ui;

import android.os.Bundle;
import android.widget.LinearLayout;
import com.tencent.mm.ab.l;
import com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceSaveUI;
import com.tencent.mm.plugin.wallet_payu.balance.a.a;
import com.tencent.mm.pluginsdk.wallet.h;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;

public class WalletPayUBalanceSaveUI
  extends WalletBalanceSaveUI
{
  protected final void bNa()
  {
    a(new a(this.myQ, "ZAR"), true, true);
  }
  
  public final boolean d(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    if ((paramInt1 == 0) && (paramInt2 == 0) && ((paraml instanceof a))) {
      h.a(this, ((a)paraml).bOd, "", 11, 1);
    }
    return false;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.oZK.setVisibility(8);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/wallet_payu/balance/ui/WalletPayUBalanceSaveUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */