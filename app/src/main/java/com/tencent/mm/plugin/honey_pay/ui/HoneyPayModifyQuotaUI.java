package com.tencent.mm.plugin.honey_pay.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;
import com.tencent.mm.ab.l;
import com.tencent.mm.plugin.wxpay.a.a;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.wallet_core.c.v;
import com.tencent.mm.wallet_core.ui.e;
import com.tencent.mm.wallet_core.ui.formview.WalletFormView;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class HoneyPayModifyQuotaUI
  extends HoneyPayBaseUI
{
  private long kkP;
  private long kkQ;
  private String kkc;
  private WalletFormView klI;
  private Button klJ;
  private TextView klm;
  
  private void fF(boolean paramBoolean)
  {
    if ((paramBoolean) && (!this.klm.isShown()))
    {
      str = v.cDm() + e.b(new StringBuilder().append(this.kkQ).toString(), "100", RoundingMode.HALF_UP).toString();
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
      str = v.cDm() + e.b(new StringBuilder().append(this.kkP).toString(), "100", RoundingMode.HALF_UP);
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
    this.klJ.setEnabled(paramBoolean);
  }
  
  public final boolean d(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    return false;
  }
  
  protected final int getLayoutId()
  {
    return a.g.honey_pay_modify_quota_ui;
  }
  
  protected final void initView()
  {
    this.klI = ((WalletFormView)findViewById(a.f.hpmq_quota_et));
    this.klJ = ((Button)findViewById(a.f.hpmq_finish_btn));
    this.klm = ((TextView)findViewById(a.f.hpmq_top_alert_tv));
    this.klI.cDS();
    this.klI.getTitleTv().setText(v.cDm());
    d(this.klI, 2, false);
    this.klI.a(new HoneyPayModifyQuotaUI.1(this));
    this.klJ.setOnClickListener(new HoneyPayModifyQuotaUI.2(this));
    this.klI.postDelayed(new HoneyPayModifyQuotaUI.3(this), 100L);
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    if ((paramInt1 == 1) && (paramInt2 == -1) && (paramIntent.getBooleanExtra("key_modify_create_line_succ", false)))
    {
      setResult(-1, paramIntent);
      finish();
    }
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.kkP = getIntent().getLongExtra("key_max_credit_line", 0L);
    this.kkQ = getIntent().getLongExtra("key_min_credit_line", 0L);
    this.kkc = getIntent().getStringExtra("key_card_no");
    initView();
    setMMTitle(a.i.honey_pay_modify_quota_title);
  }
  
  public void onDestroy()
  {
    super.onDestroy();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/honey_pay/ui/HoneyPayModifyQuotaUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */