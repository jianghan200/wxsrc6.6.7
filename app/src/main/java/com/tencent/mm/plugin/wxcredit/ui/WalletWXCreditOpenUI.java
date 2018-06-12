package com.tencent.mm.plugin.wxcredit.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import com.tencent.mm.ab.l;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;

public class WalletWXCreditOpenUI
  extends WalletBaseUI
{
  private Button eWk;
  private Bankcard pdJ;
  
  public final boolean d(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    return false;
  }
  
  protected final int getLayoutId()
  {
    return a.g.wallet_wxcredit_open_ui;
  }
  
  protected final void initView()
  {
    setMMTitle(a.i.wallet_wxcredit_open_title);
    ((CheckBox)findViewById(a.f.agree_wx_cb)).setOnCheckedChangeListener(new WalletWXCreditOpenUI.1(this));
    findViewById(a.f.agree_btn).setOnClickListener(new WalletWXCreditOpenUI.2(this));
    this.eWk = ((Button)findViewById(a.f.next_btn));
    this.eWk.setOnClickListener(new WalletWXCreditOpenUI.3(this));
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.pdJ = ((Bankcard)this.sy.getParcelable("key_bankcard"));
    initView();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/wxcredit/ui/WalletWXCreditOpenUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */