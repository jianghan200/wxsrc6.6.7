package com.tencent.mm.plugin.wallet_payu.remittance.ui;

import android.content.Intent;
import com.tencent.mm.ab.l;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.am.a;
import com.tencent.mm.model.am.b;
import com.tencent.mm.plugin.messenger.foundation.a.i;
import com.tencent.mm.plugin.remittance.ui.RemittanceAdapterUI;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.ay;
import com.tencent.mm.ui.base.a;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;

@a(7)
public class PayURemittanceAdapterUI
  extends RemittanceAdapterUI
{
  protected final void brl()
  {
    a(new com.tencent.mm.plugin.wallet_payu.remittance.a.e(this.cYO), false, false);
  }
  
  protected final void c(String paramString, int paramInt, Intent paramIntent)
  {
    x.i("MicroMsg.PayURemittanceAdapterUI", "startRemittanceUI scene=" + this.fdx + ", name=" + paramString);
    if (paramIntent != null) {}
    for (paramIntent = new Intent(paramIntent);; paramIntent = new Intent())
    {
      paramIntent.setClass(this, PayURemittanceUI.class);
      paramIntent.putExtra("receiver_name", paramString);
      paramIntent.putExtra("scene", this.fdx);
      paramIntent.putExtra("pay_scene", paramInt);
      startActivity(paramIntent);
      setResult(-1);
      finish();
      return;
    }
  }
  
  public final boolean d(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    boolean bool2 = false;
    super.d(paramInt1, paramInt2, paramString, paraml);
    if ((paraml instanceof com.tencent.mm.plugin.wallet_payu.remittance.a.e)) {
      this.myK = false;
    }
    boolean bool1 = bool2;
    if (paramInt1 == 0)
    {
      bool1 = bool2;
      if (paramInt2 == 0)
      {
        bool1 = bool2;
        if ((paraml instanceof com.tencent.mm.plugin.wallet_payu.remittance.a.e))
        {
          paramString = (com.tencent.mm.plugin.wallet_payu.remittance.a.e)paraml;
          this.cYO = paramString.username;
          if (!bi.oW(this.cYO)) {
            break label112;
          }
          x.d("MicroMsg.PayURemittanceAdapterUI", "Username empty & fishsh. scene=" + this.fdx);
          finish();
          bool1 = true;
        }
      }
    }
    return bool1;
    label112:
    paraml = new Intent();
    paraml.putExtra("fee", paramString.hUL);
    paraml.putExtra("desc", paramString.desc);
    paraml.putExtra("scan_remittance_id", paramString.myc);
    paraml.putExtra("receiver_true_name", com.tencent.mm.wallet_core.ui.e.abZ(paramString.myb));
    g.Ek();
    if (((i)g.l(i.class)).FR().Yf(this.cYO) != null) {
      c(this.cYO, paramString.scene, paraml);
    }
    for (;;)
    {
      return true;
      x.d("MicroMsg.PayURemittanceAdapterUI", "Receiver in contactStg and try to get contact");
      long l = bi.VF();
      am.a.dBr.a(this.cYO, "", new PayURemittanceAdapterUI.1(this, l, paramString, paraml));
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/wallet_payu/remittance/ui/PayURemittanceAdapterUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */