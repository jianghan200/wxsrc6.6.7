package com.tencent.mm.plugin.remittance.bankcard.ui;

import android.os.Bundle;
import com.tencent.mm.ab.l;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;

public class BankRemitSelectBankUI
  extends BankRemitBaseUI
{
  private BankRemitSortView mwt;
  
  public final boolean d(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    if ((paraml instanceof com.tencent.mm.plugin.remittance.bankcard.a.h))
    {
      paramString = (com.tencent.mm.plugin.remittance.bankcard.a.h)paraml;
      paramString.a(new BankRemitSelectBankUI.4(this, paramString)).b(new BankRemitSelectBankUI.3(this, paramString)).c(new BankRemitSelectBankUI.2(this, paramString));
    }
    return false;
  }
  
  protected final int getLayoutId()
  {
    return a.g.bank_remit_select_bank_ui;
  }
  
  protected final void initView()
  {
    this.mwt = ((BankRemitSortView)findViewById(a.f.brsb_sort_view));
    this.mwt.setOnItemClickListener(new BankRemitSelectBankUI.1(this));
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setMMTitle(a.i.bank_remit_select_bank_title);
    jr(1399);
    initView();
    x.i("MicroMsg.BankRemitSelectBankUI", "do fetch data");
    paramBundle = new com.tencent.mm.plugin.remittance.bankcard.a.h();
    paramBundle.m(this);
    a(paramBundle, true, true);
  }
  
  public void onDestroy()
  {
    super.onDestroy();
    js(1399);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/remittance/bankcard/ui/BankRemitSelectBankUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */