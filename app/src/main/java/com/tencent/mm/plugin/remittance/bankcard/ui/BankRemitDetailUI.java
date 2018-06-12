package com.tencent.mm.plugin.remittance.bankcard.ui;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.mm.plugin.wxpay.a.c;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.protocal.c.bdt;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.a;
import com.tencent.mm.ui.s;
import com.tencent.mm.wallet_core.c.h;
import com.tencent.mm.wallet_core.c.h.a;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;

@a(19)
public class BankRemitDetailUI
  extends BankRemitBaseUI
{
  private int eEZ;
  private Button klJ;
  private LinearLayout klz;
  private int mState;
  private View mvA;
  private ViewGroup mvB;
  private String mvC;
  private ImageView mvq;
  private ImageView mvr;
  private ImageView mvs;
  private TextView mvt;
  private TextView mvu;
  private TextView mvv;
  private TextView mvw;
  private TextView mvx;
  private TextView mvy;
  private View mvz;
  
  protected final void aWd()
  {
    getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(a.c.white)));
    Object localObject = getSupportActionBar().getCustomView();
    if (localObject != null)
    {
      View localView = ((View)localObject).findViewById(a.f.divider);
      if (localView != null) {
        localView.setBackgroundColor(getResources().getColor(a.c.half_alpha_white));
      }
      localObject = ((View)localObject).findViewById(16908308);
      if ((localObject != null) && ((localObject instanceof TextView))) {
        ((TextView)localObject).setTextColor(getResources().getColor(a.c.black));
      }
    }
    if (Build.VERSION.SDK_INT >= 21)
    {
      localObject = getWindow();
      ((Window)localObject).addFlags(Integer.MIN_VALUE);
      ((Window)localObject).setStatusBarColor(getResources().getColor(a.c.white));
    }
    BankRemitBaseUI.E(this);
    this.mController.contentView.setFitsSystemWindows(true);
  }
  
  public final boolean d(int paramInt1, int paramInt2, final String paramString, com.tencent.mm.ab.l paraml)
  {
    if ((paraml instanceof com.tencent.mm.plugin.remittance.bankcard.a.l))
    {
      paramString = (com.tencent.mm.plugin.remittance.bankcard.a.l)paraml;
      paramString.a(new BankRemitDetailUI.5(this, paramString)).b(new h.a()
      {
        public final void g(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, com.tencent.mm.ab.l paramAnonymousl)
        {
          x.e("MicroMsg.BankRemitDetailUI", "detail reponse error: %s, %s", new Object[] { Integer.valueOf(paramString.mud.hUm), paramString.mud.hUn });
          if (!bi.oW(paramString.mud.hUn))
          {
            Toast.makeText(BankRemitDetailUI.this, paramString.mud.hUn, 1).show();
            return;
          }
          Toast.makeText(BankRemitDetailUI.this, a.i.bank_remit_detail_fetch_fail_text, 1).show();
        }
      }).c(new BankRemitDetailUI.3(this));
    }
    return true;
  }
  
  protected final int getLayoutId()
  {
    return a.g.bank_remit_detail_ui;
  }
  
  public final void initView()
  {
    this.mvq = ((ImageView)findViewById(a.f.brdu_state_iv_1));
    this.mvr = ((ImageView)findViewById(a.f.brdu_state_iv_2));
    this.mvs = ((ImageView)findViewById(a.f.brdu_state_iv_3));
    this.mvt = ((TextView)findViewById(a.f.brdu_state_title_tv_1));
    this.mvu = ((TextView)findViewById(a.f.brdu_state_title_tv_2));
    this.mvv = ((TextView)findViewById(a.f.brdu_state_title_tv_3));
    this.mvw = ((TextView)findViewById(a.f.brdu_state_desc_tv_1));
    this.mvx = ((TextView)findViewById(a.f.brdu_state_desc_tv_2));
    this.mvy = ((TextView)findViewById(a.f.brdu_state_desc_tv_3));
    this.mvz = findViewById(a.f.brdu_state_line_1);
    this.mvA = findViewById(a.f.brdu_state_line_2);
    this.klz = ((LinearLayout)findViewById(a.f.brdu_content_layout));
    this.mvB = ((ViewGroup)findViewById(a.f.brdu_root_layout));
    if (this.eEZ == 1)
    {
      findViewById(a.f.brdu_finish_layout).setVisibility(8);
      return;
    }
    this.klJ = ((Button)findViewById(a.f.brdu_finish_btn));
    this.klJ.setOnClickListener(new BankRemitDetailUI.2(this));
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    jr(1579);
    this.mvC = getIntent().getStringExtra("key_transfer_bill_id");
    this.eEZ = getIntent().getIntExtra("key_enter_scene", 0);
    x.i("MicroMsg.BankRemitDetailUI", "billId: %s, enterScene: %s", new Object[] { this.mvC, Integer.valueOf(this.eEZ) });
    initView();
    x.i("MicroMsg.BankRemitDetailUI", "do query detail");
    a(new com.tencent.mm.plugin.remittance.bankcard.a.l(this.mvC), true, true);
    if (this.eEZ == 0)
    {
      showHomeBtn(false);
      enableBackMenu(false);
      setMMTitle(a.i.bank_remit_detail_title_2);
    }
    for (;;)
    {
      setBackBtn(new BankRemitDetailUI.1(this));
      return;
      showHomeBtn(true);
      enableBackMenu(true);
      setMMTitle(a.i.bank_remit_detail_title_1);
    }
  }
  
  public void onDestroy()
  {
    super.onDestroy();
    js(1579);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/remittance/bankcard/ui/BankRemitDetailUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */