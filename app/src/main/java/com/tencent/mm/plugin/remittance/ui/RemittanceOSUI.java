package com.tencent.mm.plugin.remittance.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.mm.aa.f;
import com.tencent.mm.aa.f.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.bg.d;
import com.tencent.mm.g.a.fo;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.remittance.model.aa;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.ay;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import com.tencent.mm.wallet_core.ui.e;
import com.tencent.mm.wallet_core.ui.formview.WalletFormView;

@com.tencent.mm.ui.base.a(19)
public class RemittanceOSUI
  extends RemittanceBaseUI
  implements f.c
{
  private c kZG = new RemittanceOSUI.1(this);
  private int mCR;
  private String mCS;
  private String mCT;
  private String mCU;
  private String mCV;
  private boolean mCW = false;
  
  protected final void KB(String paramString)
  {
    Intent localIntent = new Intent();
    localIntent.putExtra("rawUrl", paramString);
    localIntent.putExtra("showShare", false);
    d.b(this, "webview", ".ui.tools.WebViewUI", localIntent, 3);
    this.mCW = true;
  }
  
  protected final void KC(String paramString)
  {
    Intent localIntent = new Intent();
    localIntent.putExtra("rawUrl", paramString);
    localIntent.putExtra("showShare", false);
    d.b(this, "webview", ".ui.tools.WebViewUI", localIntent, 3);
    this.mCW = true;
  }
  
  public final void a(String paramString1, String paramString2, String paramString3, fo paramfo)
  {
    paramString3 = com.tencent.mm.model.q.GH();
    paramString2 = paramString3;
    if (bi.oW(paramString3)) {
      paramString2 = com.tencent.mm.model.q.GF();
    }
    g.Ek();
    paramfo = ((com.tencent.mm.plugin.messenger.foundation.a.i)g.l(com.tencent.mm.plugin.messenger.foundation.a.i.class)).FR().Yg(this.cYO);
    paramString3 = this.cYO;
    if ((int)paramfo.dhP != 0) {
      paramString3 = paramfo.BL();
    }
    paramString1 = new aa(this.myQ, paramString2, this.cYO, paramString3, paramString1, this.mCR);
    paramString1.dox = "RemittanceProcess";
    a(paramString1, true, true);
    com.tencent.mm.plugin.report.service.h.mEJ.h(13337, new Object[] { Integer.valueOf(1), Double.valueOf(this.myQ) });
  }
  
  public final void b(int paramInt1, int paramInt2, final String paramString, l paraml, boolean paramBoolean)
  {
    super.b(paramInt1, paramInt2, paramString, paraml, paramBoolean);
    if ((paramInt1 == 0) && (paramInt2 == 0) && ((paraml instanceof aa)))
    {
      paramString = (aa)paraml;
      if (paramString.mxB <= 0) {
        break label249;
      }
      if (paramString.myD != 0) {
        break label166;
      }
      com.tencent.mm.ui.base.h.a(this, getString(a.i.remittance_remind_desc_os, new Object[] { Integer.valueOf(paramString.mxB) }), getString(a.i.app_remind), getString(a.i.remittance_continue), getString(a.i.remittance_open_order_history_action), new RemittanceOSUI.2(this, paramString), new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          RemittanceOSUI.this.KC(paramString.myC);
        }
      });
      paramInt1 = 1;
    }
    for (;;)
    {
      if (paramInt1 == 0)
      {
        paramString = ((aa)paraml).mxv;
        paraml = new Intent();
        paraml.putExtra("rawUrl", paramString);
        paraml.putExtra("showShare", false);
        d.b(this, "webview", ".ui.tools.WebViewUI", paraml, 3);
      }
      return;
      label166:
      if (paramString.myD == 1)
      {
        com.tencent.mm.ui.base.h.a(this, getString(a.i.remittance_remind_desc_os, new Object[] { Integer.valueOf(paramString.mxB) }), getString(a.i.app_remind), getString(a.i.remittance_continue), getString(a.i.remittance_open_order_history_action), new RemittanceOSUI.4(this, paramString), new RemittanceOSUI.5(this, paramString));
        paramInt1 = 1;
      }
      else
      {
        paramInt1 = 0;
        continue;
        label249:
        paramInt1 = 0;
      }
    }
  }
  
  public final void brm() {}
  
  public final void bro()
  {
    com.tencent.mm.plugin.report.service.h.mEJ.h(13337, new Object[] { Integer.valueOf(2) });
  }
  
  public final void brp()
  {
    com.tencent.mm.ui.base.s.makeText(this.mController.tml, getString(a.i.remittance_os_amount_lowest_limit, new Object[] { this.mCS }), 0).show();
  }
  
  public final void brs()
  {
    if (!bi.oW(this.mCU))
    {
      e.a((TextView)findViewById(a.f.banner_tips), "", this.mCU, this.mCV);
      return;
    }
    x.i("MicroMsg.RemittanceOSUI", "no bulletin data");
  }
  
  protected final int getLayoutId()
  {
    return a.g.remittance_new_ui;
  }
  
  public final void jX(String paramString) {}
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    x.d("MicroMsg.RemittanceOSUI", "reqcode=" + paramInt1 + ", resultCode=" + paramInt2 + ", username=" + this.cYO);
    this.mCW = false;
    if ((paramInt1 == 3) && (paramInt2 == -1)) {
      finish();
    }
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    com.tencent.mm.sdk.b.a.sFg.a(this.kZG);
    this.uYO.jr(1622);
    this.uYO.jr(1574);
    initView();
    this.hXD.setTitleText("");
    com.tencent.mm.aa.q.Kp().a(this);
    this.mCR = getIntent().getIntExtra("os_currency", 0);
    this.mCS = getIntent().getStringExtra("os_currencyuint");
    this.mCT = getIntent().getStringExtra("os_currencywording");
    this.mCU = getIntent().getStringExtra("os_notice");
    this.mCV = getIntent().getStringExtra("os_notice_url");
    this.hXD.setTitleText(this.mCS);
    brs();
  }
  
  public void onDestroy()
  {
    super.onDestroy();
    com.tencent.mm.sdk.b.a.sFg.c(this.kZG);
    com.tencent.mm.aa.q.Kp().b(this);
    this.uYO.js(1622);
    this.uYO.js(1574);
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


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/remittance/ui/RemittanceOSUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */