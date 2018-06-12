package com.tencent.mm.plugin.wallet.pay.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.mm.ab.l;
import com.tencent.mm.plugin.wallet_core.c.w;
import com.tencent.mm.plugin.wallet_core.ui.n;
import com.tencent.mm.protocal.c.btd;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.base.a;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;

@a(7)
public class WalletPayCustomUI
  extends WalletBaseUI
{
  private String cZH = "";
  private int fdx = 0;
  private btd kkd;
  protected n pfQ;
  private String pfR = "";
  private boolean pfS = false;
  
  public final boolean d(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    x.i("MicroMsg.WalletPayCustomUI", "errorType %s errCode %s, errmsg %s, scene %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString, paraml });
    if ((paraml instanceof w))
    {
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        paramString = (w)paraml;
        paraml = new Intent();
        paraml.putExtra("INTENT_RESULT_TOKEN", paramString.pjE);
        setResult(-1, paraml);
      }
      finish();
    }
    return false;
  }
  
  protected final int getLayoutId()
  {
    return -1;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    ux(8);
    this.pfR = getIntent().getStringExtra("INTENT_PAYFEE");
    this.cZH = getIntent().getStringExtra("INTENT_TITLE");
    boolean bool;
    if (getIntent().getIntExtra("INTENT_CAN_TOUCH", 0) == 1) {
      bool = true;
    }
    for (;;)
    {
      this.pfS = bool;
      paramBundle = getIntent().getByteArrayExtra("INTENT_TOKENMESS");
      this.kkd = new btd();
      try
      {
        this.kkd.aG(paramBundle);
        x.i("MicroMsg.WalletPayCustomUI", "mTokeMess packageex:%s busi_id:%s sign:%s can_use_touch %s mPayFee %s mTitle %s", new Object[] { this.kkd.sqy, this.kkd.rFf, this.kkd.sign, Boolean.valueOf(this.pfS), this.pfR, this.cZH });
        this.pfQ = n.a(this, this.cZH, this.pfR, "", this.pfS, new WalletPayCustomUI.1(this), new DialogInterface.OnCancelListener()new WalletPayCustomUI.3
        {
          public final void onCancel(DialogInterface paramAnonymousDialogInterface)
          {
            WalletPayCustomUI.this.finish();
          }
        }, new WalletPayCustomUI.3(this));
        return;
        bool = false;
      }
      catch (Exception paramBundle)
      {
        for (;;)
        {
          x.printErrStackTrace("MicroMsg.WalletPayCustomUI", paramBundle, "", new Object[0]);
        }
      }
    }
  }
  
  public void onDestroy()
  {
    super.onDestroy();
  }
  
  public void onPause()
  {
    super.onPause();
  }
  
  public void onResume()
  {
    super.onResume();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/wallet/pay/ui/WalletPayCustomUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */