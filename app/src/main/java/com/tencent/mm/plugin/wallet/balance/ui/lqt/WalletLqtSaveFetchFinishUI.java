package com.tencent.mm.plugin.wallet.balance.ui.lqt;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import com.tencent.mm.ab.l;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.pluginsdk.ui.d.j;
import com.tencent.mm.pluginsdk.ui.d.m;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import com.tencent.mm.wallet_core.ui.WalletTextView;
import com.tencent.mm.wallet_core.ui.e;

public class WalletLqtSaveFetchFinishUI
  extends WalletBaseUI
{
  private Button lqN;
  private WalletTextView pbA;
  private TextView pbB;
  private TextView pbC;
  private TextView pbz;
  
  public final boolean d(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    return false;
  }
  
  protected final int getForceOrientation()
  {
    return 1;
  }
  
  protected final int getLayoutId()
  {
    return a.g.wallet_lqt_save_fetch_finish_ui;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.pbz = ((TextView)findViewById(a.f.succ_wording_tv));
    this.pbA = ((WalletTextView)findViewById(a.f.amount_tv));
    this.lqN = ((Button)findViewById(a.f.finish_button));
    this.pbB = ((TextView)findViewById(a.f.profile_wording_tv));
    this.pbC = ((TextView)findViewById(a.f.upgrade_wording_tv));
    int i = getIntent().getIntExtra("key_mode", 1);
    double d = getIntent().getDoubleExtra("key_amount", 0.0D);
    paramBundle = getIntent().getStringExtra("profile_date_wording");
    String str = getIntent().getStringExtra("profile_upgrade_wording");
    if (i == 1)
    {
      this.pbz.setText(getString(a.i.wallet_lqt_save_succ_wording));
      setMMTitle(getString(a.i.wallet_lqt_save_succ_wording));
    }
    for (;;)
    {
      this.pbA.setText(e.A(d));
      this.lqN.setOnClickListener(new WalletLqtSaveFetchFinishUI.1(this));
      if (!bi.oW(paramBundle))
      {
        this.pbB.setText(paramBundle);
        this.pbB.setVisibility(0);
      }
      if (!bi.oW(str))
      {
        this.pbC.setText(j.c(this, str, (int)this.pbC.getTextSize()));
        this.pbC.setClickable(true);
        this.pbC.setOnTouchListener(new m());
        this.pbC.setVisibility(0);
      }
      return;
      if (i == 2)
      {
        this.pbz.setText(getString(a.i.wallet_lqt_fetch_succ_wording));
        setMMTitle(getString(a.i.wallet_lqt_fetch_succ_wording));
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtSaveFetchFinishUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */