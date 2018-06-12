package com.tencent.mm.plugin.wallet.loan;

import android.os.Bundle;
import com.tencent.mm.ab.l;
import com.tencent.mm.plugin.wallet_core.c.s;
import com.tencent.mm.plugin.wallet_core.ui.WalletCheckPwdUI;
import com.tencent.mm.ui.base.a;

@a(3)
public class WalletLoanCheckPwdUI
  extends WalletCheckPwdUI
{
  public final boolean d(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    if (((paraml instanceof s)) && ((paramInt1 != 0) || (paramInt2 != 0))) {
      return false;
    }
    return super.d(paramInt1, paramInt2, paramString, paraml);
  }
  
  protected final int getForceOrientation()
  {
    return 1;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    if (cDK() != null) {
      setBackBtn(new WalletLoanCheckPwdUI.1(this));
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/plugin/wallet/loan/WalletLoanCheckPwdUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */