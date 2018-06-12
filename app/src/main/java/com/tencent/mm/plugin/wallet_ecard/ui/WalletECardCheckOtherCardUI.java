package com.tencent.mm.plugin.wallet_ecard.ui;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import com.tencent.mm.ab.l;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.wallet_core.d.g;
import com.tencent.mm.wallet_core.d.i;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import com.tencent.mm.wallet_core.ui.formview.WalletFormView;
import com.tencent.mm.wallet_core.ui.formview.WalletFormView.a;

public class WalletECardCheckOtherCardUI
  extends WalletECardBaseUI
  implements WalletFormView.a
{
  private Button eWk;
  private String hYh;
  private WalletFormView muF;
  private WalletFormView pCr;
  
  public final boolean d(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    return false;
  }
  
  public final void fE(boolean paramBoolean)
  {
    x.d("MicroMsg.WalletECardCheckOtherCardUI", "is valid: %s", new Object[] { Boolean.valueOf(paramBoolean) });
    if ((this.muF.ZF()) && (this.pCr.ZF()))
    {
      this.eWk.setEnabled(true);
      this.eWk.setClickable(true);
      return;
    }
    this.eWk.setEnabled(false);
    this.eWk.setClickable(false);
  }
  
  protected final int getLayoutId()
  {
    return a.g.ecard_check_other_card_ui;
  }
  
  protected final void initView()
  {
    this.muF = ((WalletFormView)findViewById(a.f.check_other_card_input_et));
    this.pCr = ((WalletFormView)findViewById(a.f.check_other_card_mobile_input_et));
    this.eWk = ((Button)findViewById(a.f.check_other_card_next_btn));
    com.tencent.mm.wallet_core.ui.formview.a.b(this.muF);
    com.tencent.mm.wallet_core.ui.formview.a.c(this, this.pCr);
    if (!bi.oW(this.hYh)) {
      this.muF.setHint(getString(a.i.ecard_check_other_card_hint_text, new Object[] { this.hYh }));
    }
    for (;;)
    {
      this.pCr.setHint(getString(a.i.ecard_check_other_card_phone_hint_text));
      this.muF.setOnInputValidChangeListener(this);
      this.pCr.setOnInputValidChangeListener(this);
      d(this.muF, 0, false);
      d(this.pCr, 0, false);
      this.eWk.setEnabled(false);
      this.eWk.setClickable(false);
      this.eWk.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          x.i("MicroMsg.WalletECardCheckOtherCardUI", "do check card");
          if ((WalletECardCheckOtherCardUI.a(WalletECardCheckOtherCardUI.this).ZF()) && (WalletECardCheckOtherCardUI.b(WalletECardCheckOtherCardUI.this).ZF()))
          {
            paramAnonymousView = WalletECardCheckOtherCardUI.a(WalletECardCheckOtherCardUI.this).getText();
            String str = WalletECardCheckOtherCardUI.b(WalletECardCheckOtherCardUI.this).getText();
            WalletECardCheckOtherCardUI.this.cDL().m(new Object[] { paramAnonymousView, str });
            return;
          }
          x.w("MicroMsg.WalletECardCheckOtherCardUI", "input invalid");
        }
      });
      return;
      this.muF.setHint(getString(a.i.ecard_check_other_card_hint_without_name_text));
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.hYh = this.sy.getString(com.tencent.mm.plugin.wallet_ecard.a.a.pBP, "");
    setMMTitle(getString(a.i.ecard_check_other_card_title));
    this.uYO.jr(385);
    initView();
  }
  
  public void onDestroy()
  {
    super.onDestroy();
    this.uYO.js(385);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/wallet_ecard/ui/WalletECardCheckOtherCardUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */