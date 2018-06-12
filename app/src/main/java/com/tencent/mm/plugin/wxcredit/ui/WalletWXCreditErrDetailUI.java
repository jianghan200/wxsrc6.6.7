package com.tencent.mm.plugin.wxcredit.ui;

import android.os.Bundle;
import android.widget.TextView;
import com.tencent.mm.ab.l;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;

public class WalletWXCreditErrDetailUI
  extends WalletBaseUI
{
  private Bankcard paI;
  private String qxr;
  private TextView qxs;
  private TextView qxt;
  
  public final boolean d(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    return false;
  }
  
  protected final int getLayoutId()
  {
    return a.g.wallet_wxcredit_err_detail_ui;
  }
  
  protected final void initView()
  {
    this.paI = ((Bankcard)this.sy.getParcelable("key_bankcard"));
    this.qxr = this.sy.getString("key_repayment_url");
    if (this.paI == null) {
      return;
    }
    this.qxs = ((TextView)findViewById(a.f.wallet_bankcard_detail_repayment));
    this.qxs.setOnClickListener(new WalletWXCreditErrDetailUI.1(this));
    this.qxt = ((TextView)findViewById(a.f.wallet_bankcard_detail_unbind));
    this.qxt.setOnClickListener(new WalletWXCreditErrDetailUI.2(this));
    boolean bool = this.sy.getBoolean("key_can_unbind", true);
    TextView localTextView = this.qxt;
    if (bool) {}
    for (int i = 0;; i = 8)
    {
      localTextView.setVisibility(i);
      return;
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setMMTitle(a.i.wallet_bankcard_detail_title);
    initView();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/wxcredit/ui/WalletWXCreditErrDetailUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */