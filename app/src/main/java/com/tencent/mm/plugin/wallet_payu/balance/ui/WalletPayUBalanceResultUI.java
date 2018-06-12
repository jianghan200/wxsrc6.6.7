package com.tencent.mm.plugin.wallet_payu.balance.ui;

import android.widget.CheckBox;
import android.widget.TextView;
import com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceResultUI;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.plugin.wallet_core.model.Orders;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.wallet_core.ui.e;

public class WalletPayUBalanceResultUI
  extends WalletBalanceResultUI
{
  protected final void aL()
  {
    if (this.mCZ != null)
    {
      this.paF.setText(e.e(this.mCZ.mBj, this.mCZ.lNV));
      if ((this.paI != null) && (!bi.oW(this.paI.field_bankName)))
      {
        if (bi.oW(this.paI.field_bankcardTail)) {
          break label117;
        }
        this.muz.setText(this.paI.field_bankName + " " + getString(a.i.wallet_pay_bankcard_tail) + this.paI.field_bankcardTail);
      }
    }
    return;
    label117:
    this.muz.setText(this.paI.field_bankName);
  }
  
  protected final void initView()
  {
    super.initView();
    this.paH.setVisibility(8);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/wallet_payu/balance/ui/WalletPayUBalanceResultUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */