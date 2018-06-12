package com.tencent.mm.plugin.luckymoney.appbrand.ui.receive;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.mm.plugin.luckymoney.appbrand.ui.WxaLuckyMoneyBaseUI;
import com.tencent.mm.plugin.luckymoney.b.o;
import com.tencent.mm.plugin.wxpay.a.d;
import com.tencent.mm.plugin.wxpay.a.e;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.p;
import com.tencent.mm.ui.s;

@com.tencent.mm.ui.base.a(3)
public class WxaLuckyMoneyReceiveUI
  extends WxaLuckyMoneyBaseUI
  implements b
{
  private TextView hXT;
  private int isA = -1;
  private ImageView kLO;
  private int kMD = -1;
  private a kME;
  private TextView kMF;
  private Button kMG;
  private View kMH;
  private ImageView kMI;
  private TextView kMJ;
  private View kMK;
  private TextView klp;
  private p tipDialog = null;
  
  static
  {
    if (!WxaLuckyMoneyReceiveUI.class.desiredAssertionStatus()) {}
    for (boolean bool = true;; bool = false)
    {
      $assertionsDisabled = bool;
      return;
    }
  }
  
  private void baH()
  {
    o.a(this.kMK, null);
    this.mController.contentView.setVisibility(0);
  }
  
  private void baI()
  {
    if (this.kMG == null) {}
    String str;
    do
    {
      return;
      str = w.d(ad.getContext().getSharedPreferences(ad.chY(), 0));
    } while ((str != null) && (str.length() > 0) && ((str.equals("zh_CN")) || (str.equals("zh_TW")) || (str.equals("zh_HK"))));
    this.kMG.setBackgroundResource(a.e.lucky_money_send_btn);
    this.kMG.setText(a.i.lucky_money_open_title);
  }
  
  private void cL(int paramInt1, int paramInt2)
  {
    x.i("MicroMsg.WxaLuckyMoneyReceiveUI", "setBackResult cgiType:[%d],errCode:[%d]", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if (paramInt1 == 1) {
      setResult(0, new Intent().putExtra("result_error_code", 10001).putExtra("result_error_msg", "fail:no permission to receive the red packet"));
    }
    while (paramInt1 != 4) {
      return;
    }
    setResult(0, new Intent().putExtra("result_error_code", -1).putExtra("result_error_msg", "fail:system error {{user cancel}}"));
  }
  
  private void dA(String paramString1, String paramString2)
  {
    if (!bi.oW(paramString1))
    {
      this.hXT.setText(paramString1);
      this.hXT.setVisibility(0);
    }
    for (;;)
    {
      if (!bi.oW(paramString2))
      {
        o.a(this.mController.tml, this.klp, paramString2);
        this.klp.setVisibility(0);
      }
      return;
      this.hXT.setVisibility(8);
    }
  }
  
  private void dz(String paramString1, String paramString2)
  {
    o.a(this.kLO, paramString2, null);
    o.a(this.mController.tml, this.kMF, paramString1);
  }
  
  private void e(TextView paramTextView, int paramInt)
  {
    int i = (int)(com.tencent.mm.bp.a.ae(this.mController.tml, paramInt) * 1.125F);
    paramInt = com.tencent.mm.bp.a.ad(this.mController.tml, paramInt);
    if (paramInt > i) {
      paramInt = i;
    }
    for (;;)
    {
      paramTextView.setTextSize(0, paramInt);
      return;
    }
  }
  
  private void x(boolean paramBoolean1, boolean paramBoolean2)
  {
    if (paramBoolean1)
    {
      this.kMH.setVisibility(0);
      if (paramBoolean2) {
        this.kMJ.setText(a.i.lucky_money_detail_luck);
      }
      for (;;)
      {
        this.kMI.setVisibility(8);
        this.kMH.setOnClickListener(new WxaLuckyMoneyReceiveUI.2(this));
        return;
        this.kMJ.setText(a.i.lucky_money_check_detail);
      }
    }
    this.kMH.setVisibility(8);
    this.kMI.setVisibility(0);
  }
  
  public final void Ga(String paramString) {}
  
  public final void a(String paramString1, String paramString2, int paramInt, String paramString3, boolean paramBoolean1, boolean paramBoolean2)
  {
    this.isA = paramInt;
    this.kMD = 1;
    baB();
    dz(paramString1, paramString2);
    dA(null, paramString3);
    this.kMG.setOnClickListener(null);
    this.kMG.setVisibility(8);
    x(paramBoolean1, paramBoolean2);
    baH();
  }
  
  public final void a(String paramString1, String paramString2, String paramString3, String paramString4, boolean paramBoolean1, boolean paramBoolean2)
  {
    baB();
    dz(paramString1, paramString2);
    dA(paramString3, paramString4);
    this.kMG.setOnClickListener(new WxaLuckyMoneyReceiveUI.1(this));
    this.kMG.setVisibility(0);
    x(paramBoolean1, paramBoolean2);
    baH();
  }
  
  public final MMActivity baA()
  {
    return this;
  }
  
  public final void baB()
  {
    if ((this.tipDialog != null) && (this.tipDialog.isShowing())) {
      this.tipDialog.dismiss();
    }
  }
  
  public final void baG()
  {
    o.c(this.kMG);
  }
  
  protected final int getLayoutId()
  {
    return a.g.wxa_lucky_money_receive_ui;
  }
  
  protected final void initView()
  {
    this.kMK = findViewById(a.f.lucky_money_receive_ll);
    this.kLO = ((ImageView)findViewById(a.f.lucky_money_receive_sender_avatar));
    this.kMF = ((TextView)findViewById(a.f.lucky_money_receive_sender_nickname));
    this.hXT = ((TextView)findViewById(a.f.lucky_money_receive_tips));
    this.klp = ((TextView)findViewById(a.f.lucky_money_receive_wishing));
    this.kMG = ((Button)findViewById(a.f.lucky_money_recieve_open));
    this.kMJ = ((TextView)findViewById(a.f.lucky_money_recieve_check_detail));
    this.kMH = findViewById(a.f.lucky_money_recieve_check_detail_ll);
    this.kMI = ((ImageView)findViewById(a.f.lucky_money_bottom_decoration));
    ImageView localImageView = (ImageView)findViewById(a.f.lucky_money_recieve_close_btn);
    assert (localImageView != null);
    localImageView.setOnClickListener(new WxaLuckyMoneyReceiveUI.3(this));
    e(this.kMF, a.d.lucky_money_goldstyle_envelop_nickname_textsize);
    e(this.hXT, a.d.lucky_money_goldstyle_envelop_tips_textsize);
    e(this.klp, a.d.lucky_money_goldstyle_envelop_wishing_textsize);
    this.mController.contentView.setVisibility(8);
    this.tipDialog = h.a(this.mController.tml, getString(a.i.loading_tips), true, new WxaLuckyMoneyReceiveUI.4(this));
    this.tipDialog.show();
    baI();
  }
  
  public void onBackPressed()
  {
    cL(this.kMD, this.isA);
    finish();
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    x.i("MicroMsg.WxaLuckyMoneyReceiveUI", "WxaLuckyMoneyReceiveUI.onCreate ");
    initView();
    getIntent();
    this.kME = new c();
    this.kME.a(this, getIntent());
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
    x.i("MicroMsg.WxaLuckyMoneyReceiveUI", "WxaLuckyMoneyReceiveUI.onDestroy ");
    if ((this.tipDialog != null) && (this.tipDialog.isShowing())) {
      this.tipDialog.dismiss();
    }
    if (this.kME != null)
    {
      this.kME.onDestroy();
      this.kME = null;
    }
  }
  
  protected void onResume()
  {
    super.onResume();
    o.c(this.kMG);
    this.kMG.setBackgroundResource(a.e.festival_lucky_money_open_btn);
    baI();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/luckymoney/appbrand/ui/receive/WxaLuckyMoneyReceiveUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */