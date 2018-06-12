package com.tencent.mm.plugin.wallet_payu.remittance.a;

import android.app.Activity;
import android.os.Bundle;
import com.tencent.mm.plugin.remittance.a.a;
import com.tencent.mm.plugin.wallet_payu.remittance.ui.PayURemittanceAdapterUI;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.wallet_core.c;

public class i
  extends a
{
  public final c a(Activity paramActivity, Bundle paramBundle)
  {
    x.d("MicroMsg.PayURemittanceProcess", "start Process : PayURemittanceProcess");
    c(paramActivity, PayURemittanceAdapterUI.class, paramBundle);
    return this;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/wallet_payu/remittance/a/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */