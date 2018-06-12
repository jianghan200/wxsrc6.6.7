package com.tencent.mm.plugin.wallet.balance;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.mm.plugin.wallet_core.b.b;
import com.tencent.mm.wallet_core.c;
import com.tencent.mm.wallet_core.c.p;

public class a
  extends b
{
  public static int oYw = 1;
  public static int oYx = 2;
  
  public final c a(Activity paramActivity, Bundle paramBundle)
  {
    p.GZ(14);
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
      Intent localIntent = new Intent();
      localIntent.putExtras(paramBundle);
      if (paramBundle.getInt("from_bind_ui", oYx) == oYw)
      {
        localIntent.putExtra("from_bind_ui", oYw);
        a(paramActivity, "wallet", ".balance.ui.WalletBalanceManagerUI", -1, localIntent, true);
        return;
      }
      localIntent.putExtra("from_bind_ui", oYx);
      a(paramActivity, "wallet", ".balance.ui.ltWalletLqtSaveFetchUI", -1, localIntent, true);
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


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/wallet/balance/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */