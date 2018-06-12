package com.tencent.mm.plugin.remittance.ui;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.mm.ab.l;
import com.tencent.mm.g.a.fo;
import com.tencent.mm.plugin.remittance.model.p;
import com.tencent.mm.plugin.remittance.model.q;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import com.tencent.mm.wallet_core.ui.e;
import com.tencent.mm.wallet_core.ui.formview.WalletFormView;

public class RemittanceHKUI
  extends RemittanceBaseUI
{
  private int mCL;
  private String mCM;
  private String mCN;
  private String mCO;
  
  public final void a(String paramString1, String paramString2, String paramString3, fo paramfo)
  {
    x.d("MicroMsg.RemittanceHKUI", "do scene gen pay");
    int i = 0;
    if (this.myU == 33) {
      i = 1;
    }
    a(new q(Math.round(this.myQ * 100.0D), this.cYO, this.myS, this.mzh, this.cZG, this.myV, this.mCL, i), true, false);
  }
  
  public final void b(int paramInt1, int paramInt2, String paramString, l paraml, boolean paramBoolean)
  {
    if ((paraml instanceof q))
    {
      paraml = (q)paraml;
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        if (!bi.oW(paraml.mxv))
        {
          e.r(this.mController.tml, paraml.mxv, 4);
          return;
        }
        x.e("MicroMsg.RemittanceHKUI", "empty payurl");
        return;
      }
      h.b(this.mController.tml, paramString, "", false);
      return;
    }
    super.b(paramInt1, paramInt2, paramString, paraml, paramBoolean);
  }
  
  public final void brm() {}
  
  public final void brn()
  {
    x.d("MicroMsg.RemittanceHKUI", "do scene cancel");
    if (this.myU == 33) {}
    for (int i = 1;; i = 0)
    {
      a(new p(this.cYO, this.myV, this.mCL, this.myQ * 100L, i), false, false);
      return;
    }
  }
  
  public final void brp()
  {
    com.tencent.mm.ui.base.s.makeText(this.mController.tml, getString(a.i.remittance_os_amount_lowest_limit, new Object[] { this.mCM }), 0).show();
  }
  
  public final void brs()
  {
    if (!bi.oW(this.mCN))
    {
      TextView localTextView = (TextView)findViewById(a.f.banner_tips);
      localTextView.setText(this.mCN);
      localTextView.setOnClickListener(new RemittanceHKUI.1(this));
    }
  }
  
  protected final void brw() {}
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    if ((paramInt1 == 4) && (paramInt2 == -1)) {
      finish();
    }
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    jr(1529);
    jr(1257);
    this.mCL = getIntent().getIntExtra("hk_currency", 0);
    this.mCM = getIntent().getStringExtra("hk_currencyuint");
    this.mCN = getIntent().getStringExtra("hk_notice");
    this.mCO = getIntent().getStringExtra("hk_notice_url");
    this.hXD.setTitleText(this.mCM);
    this.mze.setText(this.mCM);
  }
  
  public void onDestroy()
  {
    super.onDestroy();
    js(1529);
    js(1257);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/remittance/ui/RemittanceHKUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */