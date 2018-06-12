package com.tencent.mm.plugin.honey_pay.ui;

import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.mm.ab.l;
import com.tencent.mm.model.q;
import com.tencent.mm.plugin.honey_pay.model.c;
import com.tencent.mm.plugin.wxpay.a.c;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.pluginsdk.ui.applet.CdnImageView;
import com.tencent.mm.pluginsdk.ui.d.g;
import com.tencent.mm.pluginsdk.ui.d.j;
import com.tencent.mm.protocal.c.amp;
import com.tencent.mm.protocal.c.bdk;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.s;
import com.tencent.mm.wallet_core.c.h;
import com.tencent.mm.wallet_core.c.h.a;
import com.tencent.mm.wallet_core.c.v;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import com.tencent.mm.wallet_core.ui.WalletTextView;
import java.io.IOException;

public class HoneyPayReceiveCardUI
  extends HoneyPayBaseUI
{
  private int fdx;
  private String kkc;
  private ImageView klP;
  private TextView klQ;
  private WalletTextView klR;
  private TextView klS;
  private TextView klT;
  private TextView klU;
  private TextView klV;
  private TextView klW;
  private TextView klX;
  private TextView klY;
  private LinearLayout klZ;
  private CdnImageView kma;
  private g kmb = new HoneyPayReceiveCardUI.1(this);
  
  private void a(bdk parambdk)
  {
    if (parambdk.rIz == null) {
      return;
    }
    amp localamp = parambdk.rIz;
    this.klV.setText(localamp.rPn);
    this.klX.setText(j.a(this.mController.tml, localamp.kLf, this.klX.getTextSize()));
    Object localObject = new Bundle();
    ((Bundle)localObject).putBoolean("click_help", true);
    this.klY.setText(j.a(this.mController.tml, localamp.muD, (int)this.klY.getTextSize(), localObject));
    this.klY.setClickable(true);
    this.klY.setOnTouchListener(new com.tencent.mm.pluginsdk.ui.d.m(this));
    if (!bi.oW(parambdk.sda))
    {
      localObject = new com.tencent.mm.plugin.wallet_core.ui.m(new HoneyPayReceiveCardUI.9(this, parambdk));
      parambdk = new SpannableString(parambdk.sda);
      parambdk.setSpan(localObject, 0, parambdk.length(), 18);
      this.klT.setText(parambdk);
      this.klT.setOnTouchListener(new com.tencent.mm.pluginsdk.ui.d.m(this));
      this.klT.setClickable(true);
    }
    for (;;)
    {
      this.klR.setText(c.dK(localamp.rPl));
      a.b.a(this.klP, localamp.qYy, 0.06F, false);
      com.tencent.mm.wallet_core.ui.e.f(this.klQ, localamp.qYy);
      this.klW.setText(j.a(this, com.tencent.mm.wallet_core.ui.e.dx(q.GH(), 16), this.klW.getTextSize()));
      if (bi.oW(localamp.lMY)) {
        break;
      }
      parambdk = this.kma;
      localObject = localamp.lMY;
      i = localamp.huV;
      parambdk.cS((String)localObject, c.aWc());
      return;
      x.d(this.TAG, "no help url");
      this.klT.setVisibility(8);
    }
    parambdk = this.kma;
    int i = localamp.huV;
    parambdk.setImageResource(c.aWc());
  }
  
  private void aWf()
  {
    x.i(this.TAG, "qry user detail");
    com.tencent.mm.plugin.honey_pay.a.m localm = new com.tencent.mm.plugin.honey_pay.a.m(this.kkc);
    localm.m(this);
    a(localm, true, false);
  }
  
  public final boolean d(int paramInt1, int paramInt2, final String paramString, l paraml)
  {
    if ((paraml instanceof com.tencent.mm.plugin.honey_pay.a.m))
    {
      paramString = (com.tencent.mm.plugin.honey_pay.a.m)paraml;
      paramString.a(new h.a()
      {
        public final void g(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, l paramAnonymousl)
        {
          HoneyPayReceiveCardUI.a(HoneyPayReceiveCardUI.this, paramString.kjN);
        }
      }).b(new HoneyPayReceiveCardUI.4(this)).c(new HoneyPayReceiveCardUI.3(this));
    }
    for (;;)
    {
      return true;
      if ((paraml instanceof com.tencent.mm.plugin.honey_pay.a.e))
      {
        paramString = (com.tencent.mm.plugin.honey_pay.a.e)paraml;
        paramString.a(new HoneyPayReceiveCardUI.8(this, paramString)).b(new HoneyPayReceiveCardUI.7(this, paramString)).c(new HoneyPayReceiveCardUI.6(this));
      }
    }
  }
  
  protected final int getLayoutId()
  {
    return a.g.honey_pay_receive_card_ui;
  }
  
  protected final void initView()
  {
    this.klP = ((ImageView)findViewById(a.f.hprc_avatar_iv));
    this.klQ = ((TextView)findViewById(a.f.hprc_payer_name_tv));
    this.klW = ((TextView)findViewById(a.f.hprc_user_name_tv));
    this.klR = ((WalletTextView)findViewById(a.f.hprc_quota_tv));
    this.klS = ((TextView)findViewById(a.f.hprc_quota_desc_tv));
    this.klT = ((TextView)findViewById(a.f.hprc_check_payway_tv));
    this.klU = ((TextView)findViewById(a.f.hprc_receive_btn));
    this.klV = ((TextView)findViewById(a.f.hprc_receive_tip_tv));
    this.klZ = ((LinearLayout)findViewById(a.f.hprc_quota_layout));
    this.klX = ((TextView)findViewById(a.f.hprc_wishing_tv));
    this.klY = ((TextView)findViewById(a.f.hprc_explain_tv));
    this.kma = ((CdnImageView)findViewById(a.f.hprc_quota_logo_1_iv));
    this.klR.setPrefix(v.cDm());
    this.klU.setOnClickListener(new HoneyPayReceiveCardUI.2(this));
  }
  
  public void onCreate(Bundle paramBundle)
  {
    this.kjV = a.c.honey_pay_grey_bg_2;
    super.onCreate(paramBundle);
    j.a(this.kmb);
    jr(2613);
    jr(1983);
    this.kkc = getIntent().getStringExtra("key_card_no");
    this.fdx = getIntent().getIntExtra("key_scene", 0);
    initView();
    if (this.fdx == 1)
    {
      paramBundle = new bdk();
      try
      {
        paramBundle.aG(getIntent().getByteArrayExtra("key_qry_response"));
        a(paramBundle);
        if (paramBundle.rIz != null) {
          setMMTitle(paramBundle.rIz.hwg);
        }
        return;
      }
      catch (IOException paramBundle)
      {
        x.printErrStackTrace(this.TAG, paramBundle, "", new Object[0]);
        aWf();
        return;
      }
    }
    aWf();
  }
  
  public void onDestroy()
  {
    super.onDestroy();
    j.b(this.kmb);
    js(2613);
    js(1983);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/honey_pay/ui/HoneyPayReceiveCardUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */