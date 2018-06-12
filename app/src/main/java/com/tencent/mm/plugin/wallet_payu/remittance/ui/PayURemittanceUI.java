package com.tencent.mm.plugin.wallet_payu.remittance.ui;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;
import com.tencent.mm.ab.l;
import com.tencent.mm.g.a.fo;
import com.tencent.mm.plugin.remittance.ui.RemittanceUI;
import com.tencent.mm.plugin.wallet_payu.remittance.a.d;
import com.tencent.mm.plugin.wallet_payu.remittance.a.g;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.pluginsdk.wallet.PayInfo;
import com.tencent.mm.pluginsdk.wallet.h;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;

public class PayURemittanceUI
  extends RemittanceUI
{
  private final String pGh = "ZAR";
  
  public final void a(String paramString1, String paramString2, String paramString3, fo paramfo)
  {
    a(new d(this.myQ, "ZAR", this.cYO, this.fdx), true, true);
  }
  
  public final void brn()
  {
    a(new g(this.cYO, this.myV), true, true);
  }
  
  public final boolean d(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      if ((paraml instanceof d))
      {
        paramString = (d)paraml;
        if (bi.oW(paramString.bST)) {
          com.tencent.mm.ui.base.s.makeText(this.mController.tml, a.i.walley_payu_remittance_gen_error, 0).show();
        }
      }
      else
      {
        return true;
      }
      Object localObject = paramString.bST;
      paramString = this.cYO;
      paraml = new PayInfo();
      paraml.bOd = ((String)localObject);
      paraml.bVY = this.myU;
      localObject = new Bundle();
      ((Bundle)localObject).putString("extinfo_key_1", paramString);
      ((Bundle)localObject).putString("extinfo_key_2", getIntent().getStringExtra("receiver_true_name"));
      ((Bundle)localObject).putString("extinfo_key_3", getIntent().getStringExtra("desc"));
      ((Bundle)localObject).putString("extinfo_key_4", getIntent().getStringExtra("scan_remittance_id"));
      ((Bundle)localObject).putString("fee_type", "ZAR");
      ((Bundle)localObject).putDouble("total_fee", this.myQ);
      paraml.qUL = ((Bundle)localObject);
      h.a(this, paraml, 1);
      return true;
    }
    return false;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/wallet_payu/remittance/ui/PayURemittanceUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */