package com.tencent.mm.plugin.wallet_payu.remittance.ui;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.mm.ab.l;
import com.tencent.mm.plugin.remittance.ui.RemittanceResendMsgUI;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.ui.base.a;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;

@a(3)
public class PayURemittanceResendMsgUI
  extends RemittanceResendMsgUI
{
  public final boolean d(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    if ((paraml instanceof com.tencent.mm.plugin.wallet_payu.remittance.a.h))
    {
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        com.tencent.mm.ui.base.h.bA(this, getString(a.i.remittance_resended));
        finish();
        return true;
      }
      com.tencent.mm.ui.base.h.bA(this, paramString);
      finish();
      return true;
    }
    return false;
  }
  
  protected final void j(String paramString1, String paramString2, int paramInt1, int paramInt2)
  {
    a(new com.tencent.mm.plugin.wallet_payu.remittance.a.h(paramString1, getIntent().getIntExtra("total_fee", 0), getIntent().getStringExtra("fee_type"), paramString2, paramInt1), true, true);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/wallet_payu/remittance/ui/PayURemittanceResendMsgUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */