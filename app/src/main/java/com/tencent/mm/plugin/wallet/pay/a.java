package com.tencent.mm.plugin.wallet.pay;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.mm.plugin.wallet_core.b.b;

public class a
  extends b
{
  public final String aNK()
  {
    return "BindCardForPayProcess";
  }
  
  public final void b(Activity paramActivity, Bundle paramBundle)
  {
    Intent localIntent = new Intent();
    localIntent.putExtras(paramBundle);
    a(paramActivity, "wallet", ".pay.ui.WalletPayUI", -1, localIntent, false);
  }
  
  public final void c(Activity paramActivity, int paramInt)
  {
    if (paramActivity != null) {
      paramActivity.finish();
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/wallet/pay/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */