package com.tencent.mm.plugin.remittance.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.tencent.mm.ab.l;
import com.tencent.mm.plugin.remittance.model.y;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.a;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.s;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;

@a(7)
public class RemittanceResendMsgUI
  extends WalletBaseUI
{
  public boolean d(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    if ((paraml instanceof y))
    {
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        h.bA(this, getString(a.i.remittance_resended));
        finish();
        return true;
      }
      h.bA(this, paramString);
      finish();
      return true;
    }
    return false;
  }
  
  protected final int getLayoutId()
  {
    return -1;
  }
  
  public void j(String paramString1, String paramString2, int paramInt1, int paramInt2)
  {
    paramString1 = new y(paramString1, paramString2, paramInt1, paramInt2);
    paramString1.dox = "RemittanceProcess";
    a(paramString1, true, true);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.mController.contentView.setVisibility(8);
    setTitleVisibility(8);
    paramBundle = getIntent().getStringExtra("transaction_id");
    String str = getIntent().getStringExtra("receiver_name");
    int i = getIntent().getIntExtra("resend_msg_from_flag", 1);
    int j = getIntent().getIntExtra("invalid_time", 0);
    if (!bi.oW(str)) {
      j(paramBundle, str, j, i);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/remittance/ui/RemittanceResendMsgUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */