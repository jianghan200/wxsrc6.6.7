package com.tencent.mm.plugin.wallet.balance.ui.lqt;

import android.app.Dialog;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.mm.plugin.wallet.balance.a.a.j;
import com.tencent.mm.plugin.wallet.balance.a.a.k;
import com.tencent.mm.plugin.wallet.balance.a.a.k.a;
import com.tencent.mm.plugin.wallet.balance.a.a.k.b;
import com.tencent.mm.plugin.wxpay.a.c;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.pluginsdk.ui.applet.CdnImageView;
import com.tencent.mm.protocal.c.bdo;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.vending.g.c;
import com.tencent.mm.wallet_core.ui.WalletTextView;

public class WalletLqtDetailUI
  extends WalletLqtBasePresenterUI
{
  private Dialog eBX;
  private ag handler = new ag(Looper.getMainLooper());
  private j paU = (j)w(j.class);
  private k paV = (k)t(k.class);
  private bdo paW;
  private ViewGroup paX;
  private TextView paY;
  private WalletTextView paZ;
  private ViewGroup pba;
  private TextView pbb;
  private TextView pbc;
  private ViewGroup pbd;
  private TextView pbe;
  private WalletTextView pbf;
  private Button pbg;
  private Button pbh;
  private LinearLayout pbi;
  private TextView pbj;
  private View pbk;
  private TextView pbl;
  private View pbm;
  private View pbn;
  private CdnImageView pbo;
  private TextView pbp;
  private TextView pbq;
  private boolean pbr = true;
  
  protected final int getLayoutId()
  {
    return a.g.wallet_lqt_detail_ui;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    if ((paramInt1 == 123) && (paramInt2 == -1))
    {
      this.pbr = false;
      paramIntent = paramIntent.getStringExtra("lqt_enc_pwd");
      if (this.eBX != null) {
        break label106;
      }
      this.eBX = com.tencent.mm.wallet_core.ui.g.b(this, false, null);
    }
    for (;;)
    {
      k.a locala = this.paV.oYV;
      com.tencent.mm.vending.g.g.v(paramIntent, Integer.valueOf(this.paW.rtK)).c(locala).f(new WalletLqtDetailUI.6(this)).a(new WalletLqtDetailUI.5(this));
      return;
      label106:
      this.eBX.show();
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    lF(getResources().getColor(a.c.wallet_lqt_detail_bg));
    cqh();
    setMMTitle(getString(a.i.wallet_lqt_title));
    x.i("MicroMsg.WalletLqtDetailUI", "inputAccountType: %s", new Object[] { Integer.valueOf(getIntent().getIntExtra("key_account_type", 1)) });
    this.paX = ((ViewGroup)findViewById(a.f.detail_container_ll));
    this.paY = ((TextView)findViewById(a.f.lqt_detail_title_tv));
    this.paZ = ((WalletTextView)findViewById(a.f.lqt_detail_balance_amount_tv));
    this.pba = ((ViewGroup)findViewById(a.f.detail_balance_layout));
    this.pbb = ((TextView)findViewById(a.f.lqt_detail_balance_rate_hint_tv));
    this.pbc = ((TextView)findViewById(a.f.lqt_detail_balance_rate_tv));
    this.pbd = ((ViewGroup)findViewById(a.f.detail_gain_balance_layout));
    this.pbe = ((TextView)findViewById(a.f.lqt_detail_gain_balance_hint_tv));
    this.pbf = ((WalletTextView)findViewById(a.f.lqt_detail_gain_balance_tv));
    this.pbg = ((Button)findViewById(a.f.lqt_detail_save_btn));
    this.pbh = ((Button)findViewById(a.f.lqt_detail_fetch_btn));
    this.pbi = ((LinearLayout)findViewById(a.f.lqt_detail_bottom_info_layout));
    this.pbj = ((TextView)findViewById(a.f.lqt_detail_faq_link_tv));
    this.pbk = findViewById(a.f.lqt_detail_banner_ll);
    this.pbl = ((TextView)findViewById(a.f.lqt_detail_banner_text));
    this.pbn = findViewById(a.f.lqt_detail_tiny_app_ll);
    this.pbo = ((CdnImageView)findViewById(a.f.tiny_app_logo));
    this.pbp = ((TextView)findViewById(a.f.tiny_app_name));
    this.pbq = ((TextView)findViewById(a.f.tiny_app_desc));
    this.pbm = findViewById(a.f.lqt_detail_tiny_app_gap);
    this.pbj.setVisibility(4);
  }
  
  public void onDestroy()
  {
    super.onDestroy();
    this.paU = null;
    this.paV = null;
  }
  
  public void onResume()
  {
    super.onResume();
    if (this.pbr)
    {
      this.paX.setVisibility(8);
      this.eBX = com.tencent.mm.wallet_core.ui.g.b(this, false, null);
      k.b localb = this.paV.oYU;
      com.tencent.mm.vending.g.g.cBK().c(localb).f(new WalletLqtDetailUI.7(this)).a(new WalletLqtDetailUI.1(this));
    }
    this.pbr = true;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtDetailUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */