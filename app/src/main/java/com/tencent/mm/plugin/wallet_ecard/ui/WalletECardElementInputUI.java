package com.tencent.mm.plugin.wallet_ecard.ui;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import com.tencent.mm.ab.l;
import com.tencent.mm.plugin.wallet_core.model.ElementQuery;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.wallet_core.ui.formview.WalletFormView;

public class WalletECardElementInputUI
  extends WalletECardBaseUI
{
  private Button eUb;
  private ElementQuery pkA;
  private WalletFormView pui;
  
  private void aL()
  {
    if (this.pkA == null) {
      this.pkA = new ElementQuery();
    }
    if (bi.oW(this.pkA.knE))
    {
      this.pui.setText("");
      return;
    }
    if (!bi.oW(this.pkA.pnu))
    {
      this.pui.setText(this.pkA.knE + " " + this.pkA.pnu);
      return;
    }
    if (2 == this.pkA.pnt)
    {
      this.pui.setText(this.pkA.knE + " " + getString(a.i.wallet_credit_card));
      return;
    }
    this.pui.setText(this.pkA.knE + " " + getString(a.i.wallet_deposit_card));
  }
  
  public final boolean d(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    return false;
  }
  
  protected final int getLayoutId()
  {
    return a.g.ecard_element_input_ui;
  }
  
  protected final void initView()
  {
    this.pui = ((WalletFormView)findViewById(a.f.wallet_card_type));
    this.pui.setOnClickListener(new WalletECardElementInputUI.1(this));
    this.eUb = ((Button)findViewById(a.f.next_btn));
    this.eUb.setOnClickListener(new WalletECardElementInputUI.2(this));
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    x.i("MicroMsg.WalletECardElementInputUI", "onAcvityResult requestCode:" + paramInt1);
    if (paramInt2 != -1) {
      return;
    }
    switch (paramInt1)
    {
    default: 
      super.onActivityResult(paramInt1, paramInt2, paramIntent);
      return;
    }
    this.pkA = ((ElementQuery)paramIntent.getParcelableExtra("elemt_query"));
    aL();
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setMMTitle(a.i.ecard_element_input_title);
    initView();
    aL();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/wallet_ecard/ui/WalletECardElementInputUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */