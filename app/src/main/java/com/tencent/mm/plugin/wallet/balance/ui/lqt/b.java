package com.tencent.mm.plugin.wallet.balance.ui.lqt;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.mm.wallet_core.c;

public class b
  extends com.tencent.mm.plugin.wallet_core.b.b
{
  public final c a(Activity paramActivity, Bundle paramBundle)
  {
    return super.a(paramActivity, paramBundle);
  }
  
  public final String aNK()
  {
    return "BalanceFetchCardProcess";
  }
  
  public final void b(Activity paramActivity, Bundle paramBundle)
  {
    if ((paramBundle != null) && (paramBundle.getBoolean("intent_bind_end", false)))
    {
      a(paramActivity, "wallet", ".balance.ui.lqt.WalletLqtSaveFetchUI", -1, new Intent(), true);
      return;
    }
    paramActivity.finish();
  }
  
  public final void c(Activity paramActivity, int paramInt)
  {
    if (paramActivity != null) {
      paramActivity.finish();
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/wallet/balance/ui/lqt/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */