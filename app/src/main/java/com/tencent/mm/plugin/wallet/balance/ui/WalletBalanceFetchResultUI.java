package com.tencent.mm.plugin.wallet.balance.ui;

import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.mm.ab.l;
import com.tencent.mm.plugin.wallet_core.model.Orders;
import com.tencent.mm.plugin.wallet_core.model.Orders.Commodity;
import com.tencent.mm.plugin.wxpay.a.c;
import com.tencent.mm.plugin.wxpay.a.e;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.h;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.s;
import com.tencent.mm.wallet_core.d.g;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import com.tencent.mm.wallet_core.ui.e;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class WalletBalanceFetchResultUI
  extends WalletBaseUI
{
  private LinearLayout klz;
  private Orders mCZ;
  private ImageView mvq;
  private ImageView mvr;
  private ImageView mvs;
  private TextView mvt;
  private TextView mvu;
  private TextView mvv;
  private TextView mvw;
  private TextView mvx;
  private TextView mvy;
  
  public final boolean d(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    return false;
  }
  
  protected final int getLayoutId()
  {
    return a.g.bank_remit_detail_ui;
  }
  
  protected final void initView()
  {
    this.mvq = ((ImageView)findViewById(a.f.brdu_state_iv_1));
    this.mvr = ((ImageView)findViewById(a.f.brdu_state_iv_2));
    this.mvs = ((ImageView)findViewById(a.f.brdu_state_iv_3));
    this.mvq.setImageResource(a.e.bank_remit_detail_state_circle_succ);
    this.mvr.setScaleType(ImageView.ScaleType.CENTER_CROP);
    this.mvr.setImageResource(a.h.remittance_wait);
    this.mvs.setImageResource(a.e.bank_remit_detail_state_circle_unknown);
    this.mvt = ((TextView)findViewById(a.f.brdu_state_title_tv_1));
    this.mvu = ((TextView)findViewById(a.f.brdu_state_title_tv_2));
    this.mvv = ((TextView)findViewById(a.f.brdu_state_title_tv_3));
    this.mvt.setText(a.i.wallet_balance_launch_fetch_title);
    this.mvu.setText(a.i.wallet_balance_fetch_waiting_title);
    this.mvu.setTextColor(getResources().getColor(a.c.normal_text_color));
    this.mvv.setText(a.i.wallet_balance_fetch_success_title);
    this.mvw = ((TextView)findViewById(a.f.brdu_state_desc_tv_1));
    this.mvx = ((TextView)findViewById(a.f.brdu_state_desc_tv_2));
    this.mvy = ((TextView)findViewById(a.f.brdu_state_desc_tv_3));
    this.mvw.setVisibility(8);
    Object localObject1 = new SimpleDateFormat("yyyy-MM-dd HH:mm");
    this.mvx.setText(getString(a.i.wallet_balance_fetch_expect_arrive_time, new Object[] { ((SimpleDateFormat)localObject1).format(new Date(this.mCZ.poZ)) }));
    this.mvx.setVisibility(0);
    this.mvy.setVisibility(8);
    this.klz = ((LinearLayout)findViewById(a.f.brdu_content_layout));
    this.klz.setBackgroundResource(a.e.bank_remit_detail_desc_singleline_layout_bg);
    localObject1 = new WalletBalanceFetchResultItemView(this, true);
    ((WalletBalanceFetchResultItemView)localObject1).b(a.i.wallet_balance_result_total_fee_fetch, e.e(this.mCZ.mBj, this.mCZ.lNV));
    this.klz.addView((View)localObject1);
    if (this.mCZ.mxE > 0.0D)
    {
      localObject1 = new WalletBalanceFetchResultItemView(this, true);
      ((WalletBalanceFetchResultItemView)localObject1).b(a.i.wallet_balance_result_charge_fee, e.e(this.mCZ.mxE, this.mCZ.lNV));
      this.klz.addView((View)localObject1);
    }
    Object localObject2;
    if ((this.mCZ.ppf != null) && (this.mCZ.ppf.size() > 0))
    {
      localObject2 = (Orders.Commodity)this.mCZ.ppf.get(0);
      localObject1 = ((Orders.Commodity)localObject2).lNT;
      if (bi.oW(((Orders.Commodity)localObject2).ppy)) {
        break label574;
      }
      localObject1 = (String)localObject1 + " " + getString(a.i.wallet_pay_bankcard_tail) + ((Orders.Commodity)localObject2).ppy;
    }
    label574:
    for (;;)
    {
      localObject2 = new WalletBalanceFetchResultItemView(this);
      ((WalletBalanceFetchResultItemView)localObject2).b(a.i.wallet_balance_fetch_bankcard_title, (CharSequence)localObject1);
      this.klz.addView((View)localObject2);
      ((Button)findViewById(a.f.brdu_finish_btn)).setOnClickListener(new WalletBalanceFetchResultUI.2(this));
      findViewById(a.f.brdu_timeline_mask).setVisibility(8);
      findViewById(a.f.brdu_content_mask).setVisibility(8);
      return;
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(a.c.white)));
    paramBundle = getSupportActionBar().getCustomView();
    if (paramBundle != null)
    {
      View localView = paramBundle.findViewById(a.f.divider);
      if (localView != null) {
        localView.setBackgroundColor(getResources().getColor(a.c.half_alpha_white));
      }
      paramBundle = paramBundle.findViewById(16908308);
      if ((paramBundle != null) && ((paramBundle instanceof TextView))) {
        ((TextView)paramBundle).setTextColor(getResources().getColor(a.c.black));
      }
    }
    if (Build.VERSION.SDK_INT >= 21)
    {
      paramBundle = getWindow();
      paramBundle.addFlags(Integer.MIN_VALUE);
      paramBundle.setStatusBarColor(getResources().getColor(a.c.white));
      if (Build.VERSION.SDK_INT >= 23) {
        getWindow().getDecorView().setSystemUiVisibility(8192);
      }
    }
    this.mController.contentView.setFitsSystemWindows(true);
    this.mCZ = ((Orders)this.sy.getParcelable("key_orders"));
    initView();
    showHomeBtn(false);
    enableBackMenu(false);
    setMMTitle((String)cDL().ui(0));
    setBackBtn(new WalletBalanceFetchResultUI.1(this));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/wallet/balance/ui/WalletBalanceFetchResultUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */