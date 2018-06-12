package com.tencent.mm.plugin.wxcredit.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.tencent.mm.ab.l;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import com.tencent.mm.wallet_core.ui.formview.WalletFormView;
import com.tencent.mm.wallet_core.ui.formview.a;

public class WalletCheckIdentityUI
  extends WalletBaseUI
{
  private WalletFormView phM;
  private WalletFormView psR;
  private String qwN;
  
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
    return a.g.wallet_wxcredit_check_indentity_ui;
  }
  
  public final void initView()
  {
    setMMTitle(a.i.wallet_check_indentity_title);
    this.psR = ((WalletFormView)findViewById(a.f.name_et));
    a.e(this, this.psR);
    this.phM = ((WalletFormView)findViewById(a.f.identity_et));
    a.c(this.phM);
    d(this.phM, 1, false);
    String str = this.sy.getString("key_pre_name");
    this.qwN = this.sy.getString("key_pre_indentity");
    if (!bi.oW(str))
    {
      this.psR.getPrefilledTv().setText(str);
      this.psR.setHint(getString(a.i.wallet_card_username_last_hint));
    }
    if (!bi.oW(this.qwN))
    {
      this.phM.setMaxInputLength(4);
      this.phM.getPrefilledTv().setText(this.qwN);
      this.phM.setHint(getString(a.i.wallet_card_identify_last_hint));
    }
    findViewById(a.f.next_btn).setOnClickListener(new WalletCheckIdentityUI.1(this));
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    initView();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/wxcredit/ui/WalletCheckIdentityUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */