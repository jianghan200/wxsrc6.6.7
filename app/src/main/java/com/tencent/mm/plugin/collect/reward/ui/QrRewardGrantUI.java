package com.tencent.mm.plugin.collect.reward.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import com.tencent.mm.ab.l;
import com.tencent.mm.g.a.fp;
import com.tencent.mm.plugin.collect.reward.a.a;
import com.tencent.mm.plugin.collect.reward.a.d;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.pluginsdk.ui.d.j;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.widget.MMEditText;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import com.tencent.mm.wallet_core.ui.WalletTextView;
import com.tencent.mm.wallet_core.ui.formview.WalletFormView;

public class QrRewardGrantUI
  extends QrRewardBaseUI
{
  private RadioButton HP;
  private String bOd;
  private int bVU;
  private String fIb;
  private String hTI;
  private String hVA;
  private String hVB;
  private String hVC;
  private String hVD;
  private int hVE;
  private c<fp> hVF = new QrRewardGrantUI.8(this);
  private ImageView hVl;
  private TextView hVm;
  private TextView hVn;
  private WalletTextView hVo;
  private LinearLayout hVp;
  private WalletFormView hVq;
  private MMEditText hVr;
  private Button hVs;
  private int hVt;
  private int hVu;
  private String hVv;
  private String hVw;
  private String hVx;
  private String hVy;
  private String hVz;
  
  private void cm(String paramString1, String paramString2)
  {
    x.i("MicroMsg.QrRewardGrantUI", "do pay check");
    if (bi.oW(this.bOd)) {
      this.bOd = paramString1;
    }
    if (bi.oW(this.hTI)) {
      this.hTI = paramString2;
    }
    a(new d(this.bOd, this.hVw, this.hTI, this.hVt, this.hVx, this.hVy), false, false);
  }
  
  public final boolean d(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    if ((paraml instanceof com.tencent.mm.plugin.collect.reward.a.e))
    {
      paramString = (com.tencent.mm.plugin.collect.reward.a.e)paraml;
      paramString.a(new QrRewardGrantUI.7(this, paramString)).b(new QrRewardGrantUI.6(this, paramString)).c(new QrRewardGrantUI.5(this));
    }
    return true;
  }
  
  protected final int getLayoutId()
  {
    return a.g.qr_reward_grant_ui;
  }
  
  public final void initView()
  {
    this.hVl = ((ImageView)findViewById(a.f.qrgu_avatar_iv));
    this.hVm = ((TextView)findViewById(a.f.qrgu_desc_tv));
    this.hVo = ((WalletTextView)findViewById(a.f.qrgu_fixed_money_tv));
    this.hVp = ((LinearLayout)findViewById(a.f.qrgu_fixed_layout));
    this.hVq = ((WalletFormView)findViewById(a.f.qrgu_edit_money_et));
    this.hVr = ((MMEditText)findViewById(a.f.qrgu_edit_word_et));
    this.hVs = ((Button)findViewById(a.f.qrgu_grant_btn));
    this.hVn = ((TextView)findViewById(a.f.qrgu_alert_tv));
    this.HP = ((RadioButton)findViewById(a.f.radio_check));
    this.HP.setChecked(true);
    this.hVn.setText(getString(a.i.qr_reward_set_money_exceed_text, new Object[] { Math.round(this.hVE / 100.0F) }));
    a.b.a(this.hVl, this.hVz, 0.03F, false);
    String str = com.tencent.mm.wallet_core.ui.e.dx(com.tencent.mm.wallet_core.ui.e.gT(this.hVz), 10);
    this.hVm.setText(j.a(this, getString(a.i.qr_reward_grant_username_wrap_text, new Object[] { str })));
    if (this.hVu == 2)
    {
      x.i("MicroMsg.QrRewardGrantUI", "edit layout");
      d(this.hVq, 2, false);
      this.hVq.a(new QrRewardGrantUI.1(this));
      this.hVq.setVisibility(0);
      this.hVp.setVisibility(8);
      this.hVq.cDV();
      this.hVs.setEnabled(false);
    }
    for (;;)
    {
      this.hVs.setOnClickListener(new QrRewardGrantUI.2(this));
      findViewById(a.f.radio_check_ll).setOnClickListener(new QrRewardGrantUI.3(this));
      this.HP.setOnCheckedChangeListener(new QrRewardGrantUI.4(this));
      return;
      this.hVo.setText(com.tencent.mm.wallet_core.ui.e.A(this.hVt / 100.0D));
      this.hVq.setVisibility(8);
      this.hVp.setVisibility(0);
    }
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    if (paramInt1 == 1)
    {
      if (paramInt2 == -1)
      {
        setResult(-1);
        if (paramIntent != null) {
          cm(paramIntent.getStringExtra("key_reqKey"), paramIntent.getStringExtra("key_trans_id"));
        }
        finish();
      }
      return;
    }
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    jr(1336);
    this.hVF.cht();
    setMMTitle(a.i.qr_reward_grant_title);
    this.hVt = getIntent().getIntExtra("key_money_amt", 20000);
    this.hVu = getIntent().getIntExtra("key_amt_type", 0);
    this.hVv = getIntent().getStringExtra("key_qrcode_desc");
    this.bVU = getIntent().getIntExtra("key_channel", 0);
    this.hVx = getIntent().getStringExtra("key_rcvr_open_id");
    this.hVz = getIntent().getStringExtra("key_rcvr_name");
    this.hVA = getIntent().getStringExtra("key_rcvr_true_name");
    this.hVB = getIntent().getStringExtra("key_scan_id");
    this.fIb = getIntent().getStringExtra("key_web_url");
    this.hVC = getIntent().getStringExtra("key_sxtend_1");
    this.hVD = getIntent().getStringExtra("key_sxtend_2");
    this.hVE = getIntent().getIntExtra("key_max_amt", 20000);
    x.i("MicroMsg.QrRewardGrantUI", "amtType: %s, channel: %s, maxAmt: %s", new Object[] { Integer.valueOf(this.hVu), Integer.valueOf(this.bVU), Integer.valueOf(this.hVE) });
    initView();
  }
  
  public void onDestroy()
  {
    super.onDestroy();
    js(1336);
    this.hVF.dead();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/collect/reward/ui/QrRewardGrantUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */