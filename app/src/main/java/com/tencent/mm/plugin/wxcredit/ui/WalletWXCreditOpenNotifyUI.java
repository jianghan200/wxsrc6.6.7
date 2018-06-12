package com.tencent.mm.plugin.wxcredit.ui;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import com.tencent.mm.ab.l;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.storage.x;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;

public class WalletWXCreditOpenNotifyUI
  extends WalletBaseUI
{
  public final boolean d(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    return false;
  }
  
  protected final int getLayoutId()
  {
    return a.g.wallet_wxcredit_open_notify_ui;
  }
  
  protected final void initView()
  {
    int i = 0;
    setMMTitle(a.i.wallet_wxcredit_open_notify_title);
    showHomeBtn(false);
    enableBackMenu(false);
    addTextOptionMenu(0, getString(a.i.app_finish), new WalletWXCreditOpenNotifyUI.1(this));
    ((TextView)findViewById(a.f.wallet_wxcredit_amount)).setText(com.tencent.mm.wallet_core.ui.e.B(this.sy.getDouble("key_total_amount")));
    Button localButton = (Button)findViewById(a.f.next_btn);
    localButton.setOnClickListener(new WalletWXCreditOpenNotifyUI.2(this));
    if (this.sy.getBoolean("key_can_upgrade_amount", true)) {}
    for (;;)
    {
      localButton.setVisibility(i);
      return;
      i = 8;
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    g.Ek();
    g.Ei().DT().set(196658, Boolean.valueOf(false));
    initView();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/wxcredit/ui/WalletWXCreditOpenNotifyUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */