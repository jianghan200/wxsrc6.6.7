package com.tencent.mm.plugin.honey_pay.ui;

import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import com.tencent.mm.ab.l;
import com.tencent.mm.plugin.honey_pay.model.c;
import com.tencent.mm.plugin.wallet_core.ui.m.a;
import com.tencent.mm.plugin.wallet_core.ui.view.a;
import com.tencent.mm.plugin.wxpay.a.a;
import com.tencent.mm.plugin.wxpay.a.c;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.pluginsdk.ui.applet.CdnImageView;
import com.tencent.mm.pluginsdk.ui.d.j;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.s;
import com.tencent.mm.wallet_core.c.v;
import com.tencent.mm.wallet_core.ui.e;
import com.tencent.mm.wallet_core.ui.formview.WalletFormView;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class HoneyPayGiveCardUI
  extends HoneyPayBaseUI
{
  private String gtX;
  private ImageView hVP;
  private String hYh;
  private String iAb;
  private long kkP = 100000L;
  private long kkQ = 0L;
  private String kla;
  private int klc;
  private ScrollView klj;
  private WalletFormView klk;
  private TextView kll;
  private TextView klm;
  private TextView kln;
  private TextView klo;
  private TextView klp;
  private TextView klq;
  private CdnImageView klr;
  
  private void aWi()
  {
    SpannableStringBuilder localSpannableStringBuilder = new SpannableStringBuilder();
    String str = getString(a.i.honey_pay_modify_word_text);
    SpannableString localSpannableString = j.a(this.mController.tml, this.kla, this.klp.getTextSize());
    localSpannableStringBuilder.append(localSpannableString);
    localSpannableStringBuilder.append(" ");
    localSpannableStringBuilder.append(str);
    localSpannableStringBuilder.setSpan(new com.tencent.mm.plugin.wallet_core.ui.m(new m.a()
    {
      public final void aCb()
      {
        HoneyPayGiveCardUI.this.Wq();
        a.a(HoneyPayGiveCardUI.this, HoneyPayGiveCardUI.this.getString(a.i.honey_pay_modify_wishing_title), HoneyPayGiveCardUI.i(HoneyPayGiveCardUI.this), "", 20, new HoneyPayGiveCardUI.7.1(this), new HoneyPayGiveCardUI.7.2(this));
      }
    }), localSpannableString.length() + 1, localSpannableStringBuilder.length(), 34);
    this.klp.setText(localSpannableStringBuilder);
  }
  
  private void fF(boolean paramBoolean)
  {
    if ((paramBoolean) && (!this.klm.isShown()))
    {
      str = v.cDm() + e.a(new StringBuilder().append(this.kkQ).toString(), "100", RoundingMode.HALF_UP);
      this.klm.setText(getString(a.i.honey_pay_min_quota_alert_text, new Object[] { str }));
      this.klm.startAnimation(AnimationUtils.loadAnimation(this, a.a.in_from_up));
      this.klm.setVisibility(0);
    }
    while ((paramBoolean) || (!this.klm.isShown()))
    {
      String str;
      return;
    }
    this.klm.startAnimation(AnimationUtils.loadAnimation(this, a.a.out_to_up));
    this.klm.setVisibility(8);
  }
  
  private void fG(boolean paramBoolean)
  {
    if ((paramBoolean) && (!this.klm.isShown()))
    {
      str = v.cDm() + e.b(new StringBuilder().append(this.kkP).toString(), "100", RoundingMode.HALF_UP).toString();
      this.klm.setText(getString(a.i.honey_pay_max_quota_alert_text, new Object[] { str }));
      this.klm.startAnimation(AnimationUtils.loadAnimation(this, a.a.in_from_up));
      this.klm.setVisibility(0);
    }
    while ((paramBoolean) || (!this.klm.isShown()))
    {
      String str;
      return;
    }
    this.klm.startAnimation(AnimationUtils.loadAnimation(this, a.a.out_to_up));
    this.klm.setVisibility(8);
  }
  
  private void fH(boolean paramBoolean)
  {
    this.kln.setEnabled(paramBoolean);
  }
  
  public final boolean d(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    return false;
  }
  
  protected final int getLayoutId()
  {
    return a.g.honey_pay_give_card_ui;
  }
  
  protected final void initView()
  {
    this.klj = ((ScrollView)findViewById(a.f.hpgc_scroll_view));
    this.klk = ((WalletFormView)findViewById(a.f.hpgc_max_limit_et));
    this.kll = ((TextView)findViewById(a.f.hpgc_display_name_tv));
    this.klm = ((TextView)findViewById(a.f.hpgc_top_alert_tv));
    this.hVP = ((ImageView)findViewById(a.f.hpgc_avatar_iv));
    this.kln = ((TextView)findViewById(a.f.hpgc_give_btn));
    this.klo = ((TextView)findViewById(a.f.hpgc_limit_hint_tv));
    this.klp = ((TextView)findViewById(a.f.hpgc_wishing_tv));
    this.klq = ((TextView)findViewById(a.f.hpgc_modify_wishing_tv));
    this.klq.setVisibility(8);
    a.b.a(this.hVP, this.gtX, 0.06F, false);
    String str2 = e.dy(this.gtX, 10);
    String str1 = str2;
    if (!bi.oW(this.hYh)) {
      str1 = String.format("%s(%s)", new Object[] { str2, this.hYh });
    }
    this.kll.setText(j.a(this.mController.tml, str1, this.kll.getTextSize()));
    this.klk.cDS();
    this.klk.getTitleTv().setText(v.cDm());
    this.klk.a(new HoneyPayGiveCardUI.1(this));
    this.klk.setOnClickListener(new HoneyPayGiveCardUI.2(this));
    this.klo.setOnClickListener(new HoneyPayGiveCardUI.3(this));
    this.kln.setClickable(true);
    this.kln.setOnClickListener(new HoneyPayGiveCardUI.4(this));
    this.klp.setClickable(true);
    this.klp.setOnTouchListener(new com.tencent.mm.pluginsdk.ui.d.m(this));
    aWi();
    this.kTx = new HoneyPayGiveCardUI.5(this);
    d(this.klk, 2, false);
    this.klk.postDelayed(new Runnable()
    {
      public final void run()
      {
        HoneyPayGiveCardUI.b(HoneyPayGiveCardUI.this).d(HoneyPayGiveCardUI.this);
      }
    }, 100L);
    this.klr = ((CdnImageView)findViewById(a.f.hpgc_quota_logo_2_iv));
    if (!bi.oW(this.iAb))
    {
      this.klr.cS(this.iAb, c.aWc());
      return;
    }
    this.klr.setImageResource(c.aWc());
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    this.kjV = a.c.honey_pay_grey_bg_1;
    super.onCreate(paramBundle);
    this.kkP = getIntent().getLongExtra("key_max_credit_line", 0L);
    this.kkQ = getIntent().getLongExtra("key_min_credit_line", 0L);
    this.hYh = getIntent().getStringExtra("key_true_name");
    this.gtX = getIntent().getStringExtra("key_username");
    this.kla = getIntent().getStringExtra("key_wishing");
    this.iAb = getIntent().getStringExtra("key_icon_url");
    this.klc = getIntent().getIntExtra("key_cardtype", 0);
    if (this.klc == 0)
    {
      x.w(this.TAG, "error card type!!");
      finish();
    }
    initView();
    setMMTitle(a.i.honey_pay_give_card_title);
  }
  
  public void onDestroy()
  {
    super.onDestroy();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/honey_pay/ui/HoneyPayGiveCardUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */