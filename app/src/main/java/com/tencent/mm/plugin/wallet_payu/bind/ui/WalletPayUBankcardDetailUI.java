package com.tencent.mm.plugin.wallet_payu.bind.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.tencent.mm.plugin.wallet.bind.ui.WalletBankcardDetailUI;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.i;

public class WalletPayUBankcardDetailUI
  extends WalletBankcardDetailUI
{
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    if (1 == this.paI.field_bankcardState)
    {
      bNg();
      findViewById(a.f.wallet_bankcard_detail_expired_bankphone_title).setVisibility(8);
      findViewById(a.f.wallet_bankcard_detail_expired_bankphone).setVisibility(8);
    }
    for (;;)
    {
      findViewById(a.f.wallet_bankcard_detail_international_default).setVisibility(8);
      ((TextView)findViewById(a.f.wallet_bankcard_detail_international_wording)).setText(a.i.wallet_bankcard_detail_international_tips_payu);
      return;
      ji(false);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/wallet_payu/bind/ui/WalletPayUBankcardDetailUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */