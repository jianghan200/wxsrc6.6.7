package com.tencent.mm.plugin.wallet_payu.bind.ui;

import android.os.Bundle;
import com.tencent.mm.ab.l;
import com.tencent.mm.plugin.wallet.bind.ui.WalletBankcardManageUI;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.plugin.wallet_payu.bind.model.c;
import com.tencent.mm.plugin.wallet_payu.bind.model.d;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;

@com.tencent.mm.ui.base.a(3)
public class WalletPayUBankcardManageUI
  extends WalletBankcardManageUI
{
  protected final com.tencent.mm.plugin.wallet.bind.ui.a bNi()
  {
    return new a(this, this.pcZ);
  }
  
  protected final void bNj()
  {
    com.tencent.mm.wallet_core.a.a(this, c.class, null);
  }
  
  protected final void c(Bankcard paramBankcard)
  {
    Bundle localBundle = new Bundle();
    localBundle.putParcelable("key_bankcard", paramBankcard);
    com.tencent.mm.wallet_core.a.a(this, d.class, localBundle);
  }
  
  public final boolean d(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    if ((paraml instanceof com.tencent.mm.plugin.wallet_core.c.b.a))
    {
      bNk();
      return true;
    }
    return false;
  }
  
  protected final void jk(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      a(new com.tencent.mm.plugin.wallet_core.c.b.a(), false, false);
      return;
    }
    a(new com.tencent.mm.plugin.wallet_core.c.b.a(), true, false);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/wallet_payu/bind/ui/WalletPayUBankcardManageUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */