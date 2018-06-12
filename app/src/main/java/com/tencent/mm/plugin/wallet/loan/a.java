package com.tencent.mm.plugin.wallet.loan;

import android.app.Activity;
import android.os.Bundle;
import com.tencent.mm.plugin.wallet.pay.ui.WalletLoanRepaymentUI;
import com.tencent.mm.plugin.wallet_core.b.b;
import com.tencent.mm.plugin.wallet_core.model.ag;
import com.tencent.mm.plugin.wallet_core.model.o;
import com.tencent.mm.wallet_core.c;

public class a
  extends b
{
  public final c a(Activity paramActivity, Bundle paramBundle)
  {
    if (o.bOW().bPs())
    {
      c(paramActivity, WalletLoanCheckPwdUI.class, paramBundle);
      return this;
    }
    super.a(paramActivity, paramBundle);
    return this;
  }
  
  public final void b(Activity paramActivity, Bundle paramBundle)
  {
    int i = 0;
    if (paramBundle.getBoolean("intent_bind_end", false)) {
      i = -1;
    }
    a(paramActivity, WalletLoanRepaymentUI.class, i, null, true);
  }
  
  public final void c(Activity paramActivity, int paramInt)
  {
    b(paramActivity, this.jfZ);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/wallet/loan/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */