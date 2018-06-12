package com.tencent.mm.plugin.wallet.balance.ui;

import android.content.res.Resources;
import android.os.Bundle;
import com.tencent.mm.ab.l;
import com.tencent.mm.plugin.wallet_core.model.Orders;
import com.tencent.mm.plugin.wallet_core.ui.o;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.a;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.s;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import com.tencent.mm.wallet_core.ui.e;

@a(3)
public class WalletBalanceFetchPwdInputUI
  extends WalletBaseUI
{
  private String cZH = "";
  private String oZC = "";
  private o oZD;
  
  private void showDialog()
  {
    if ((this.oZD != null) && (this.oZD.isShowing())) {
      this.oZD.dismiss();
    }
    Orders localOrders = (Orders)this.sy.getParcelable("key_orders");
    String str = "";
    if (localOrders.mxE > 0.0D) {
      str = getResources().getString(a.i.wallet_balance_additional_deduction_fee_tips_2, new Object[] { e.e(localOrders.mxE, localOrders.lNV) });
    }
    if (this.oZD == null)
    {
      this.oZD = o.a(this, this.cZH, this.oZC, str, new WalletBalanceFetchPwdInputUI.2(this), new WalletBalanceFetchPwdInputUI.3(this), new WalletBalanceFetchPwdInputUI.4(this));
      return;
    }
    this.oZD.bqn();
    this.oZD.show();
  }
  
  public final boolean d(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    return false;
  }
  
  protected final int getLayoutId()
  {
    return -1;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    int i = 1;
    super.onCreate(paramBundle);
    ux(4);
    this.cZH = this.sy.getString("key_pwd_cash_title");
    this.oZC = this.sy.getString("key_pwd_cash_money");
    x.i("MicroMsg.WalletBalanceFetchPwdInputUI", "hy: money : %s, title : %s", new Object[] { bi.oV(this.oZC), bi.oV(this.cZH) });
    if ((!bi.oW(this.cZH)) && (!bi.oW(this.oZC))) {}
    while (i == 0)
    {
      h.a(this.mController.tml, a.i.wallet_order_info_err, 0, new WalletBalanceFetchPwdInputUI.1(this));
      return;
      i = 0;
    }
    showDialog();
  }
  
  public final void rj(int paramInt)
  {
    if (paramInt == 0) {
      finish();
    }
    while (paramInt != 1) {
      return;
    }
    showDialog();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/wallet/balance/ui/WalletBalanceFetchPwdInputUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */