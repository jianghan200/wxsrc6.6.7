package com.tencent.mm.plugin.wxcredit.ui;

import android.os.Bundle;
import android.widget.TextView;
import com.tencent.mm.ab.l;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import com.tencent.mm.wallet_core.ui.e;

public class WalletWXCreditChangeAmountResultUI
  extends WalletBaseUI
{
  public final boolean d(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    return false;
  }
  
  protected final int getLayoutId()
  {
    return a.g.wallet_wxcredit_change_amount_result_ui;
  }
  
  protected final void initView()
  {
    ((TextView)findViewById(a.f.wallet_wxcredit_amount)).setText(e.B(this.sy.getDouble("key_credit_amount")));
    showHomeBtn(false);
    enableBackMenu(false);
    addTextOptionMenu(0, getString(a.i.app_finish), new WalletWXCreditChangeAmountResultUI.1(this));
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    initView();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/wxcredit/ui/WalletWXCreditChangeAmountResultUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */