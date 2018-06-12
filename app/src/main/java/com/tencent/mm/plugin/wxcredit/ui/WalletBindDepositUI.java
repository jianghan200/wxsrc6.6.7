package com.tencent.mm.plugin.wxcredit.ui;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import com.tencent.mm.ab.l;
import com.tencent.mm.plugin.wallet_core.c.t;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.plugin.wallet_core.model.ElementQuery;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.wallet_core.c;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import com.tencent.mm.wallet_core.ui.formview.WalletFormView;

public class WalletBindDepositUI
  extends WalletBaseUI
{
  private Button eUb;
  private boolean jVj = true;
  private ElementQuery pkA = new ElementQuery();
  private WalletFormView psQ;
  private WalletFormView pui;
  private WalletFormView qwL;
  
  private void aL()
  {
    if (bi.oW(this.pkA.knE))
    {
      this.pui.setText("");
      return;
    }
    if (2 == this.pkA.pnt)
    {
      this.pui.setText(this.pkA.knE + " " + getString(a.i.wallet_credit_card));
      return;
    }
    this.pui.setText(this.pkA.knE + " " + getString(a.i.wallet_deposit_card));
  }
  
  public final boolean d(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    boolean bool = false;
    if ((paramInt1 == 0) && (paramInt2 == 0) && ((paraml instanceof t)))
    {
      paramString = (t)paraml;
      if (paramString.pjz != null)
      {
        if (!paramString.pjz.bOE())
        {
          h.i(this, a.i.wallet_bind_deposit_bank_type_err, a.i.app_tip);
          return true;
        }
        this.pkA = paramString.pjz;
        aL();
        if ((this.pkA.pnr) && (this.pkA.isError()))
        {
          h.i(this, a.i.wallet_bank_broken, a.i.app_tip);
          return true;
        }
        paramString = com.tencent.mm.wallet_core.a.af(this);
        if (paramString != null)
        {
          paramInt1 = this.pkA.pjA;
          if (paramString == null)
          {
            if (bool) {
              break label224;
            }
            if (!paramString.bQH()) {
              break label203;
            }
            x.w("MicroMsg.WalletBindDepositUI", "Overseas user try to bind domestic card!");
            h.i(this, a.i.wallet_allow_international_bankcard, a.i.app_tip);
          }
          for (;;)
          {
            this.psQ.bqn();
            return true;
            if (!paramString.jfZ.containsKey("key_support_bankcard"))
            {
              bool = true;
              break;
            }
            paramInt2 = paramString.cCR();
            if (paramInt2 == 0)
            {
              bool = true;
              break;
            }
            bool = Bankcard.dY(paramInt2, paramInt1);
            break;
            label203:
            x.w("MicroMsg.WalletBindDepositUI", "Domestic user try to bind international card!");
            h.i(this, a.i.wallet_allow_domestic_bankcard, a.i.app_tip);
          }
        }
        label224:
        aL();
        return true;
      }
    }
    return false;
  }
  
  protected final int getForceOrientation()
  {
    return 1;
  }
  
  protected final int getLayoutId()
  {
    return a.g.walle_wxcredit_bind_deposit_ui;
  }
  
  public final void initView()
  {
    setMMTitle(a.i.wallet_bind_deposit_title);
    this.psQ = ((WalletFormView)findViewById(a.f.wallet_card_bankcard_id));
    com.tencent.mm.wallet_core.ui.formview.a.b(this.psQ);
    this.pui = ((WalletFormView)findViewById(a.f.wallet_card_type));
    this.qwL = ((WalletFormView)findViewById(a.f.mobile_et));
    com.tencent.mm.wallet_core.ui.formview.a.c(this, this.qwL);
    this.eUb = ((Button)findViewById(a.f.next_btn));
    d(this.psQ, 0, false);
    d(this.qwL, 0, false);
    this.pui.setOnClickListener(new WalletBindDepositUI.1(this));
    this.eUb.setOnClickListener(new WalletBindDepositUI.2(this));
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    x.i("MicroMsg.WalletBindDepositUI", "onAcvityResult requestCode:" + paramInt1);
    if (paramInt2 != -1) {
      return;
    }
    switch (paramInt1)
    {
    default: 
      return;
    }
    paramIntent = (ElementQuery)paramIntent.getParcelableExtra("elemt_query");
    if (paramIntent.bOE())
    {
      this.pkA = paramIntent;
      aL();
      return;
    }
    h.i(this, a.i.wallet_bind_deposit_bank_type_err, a.i.app_tip);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    initView();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/wxcredit/ui/WalletBindDepositUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */