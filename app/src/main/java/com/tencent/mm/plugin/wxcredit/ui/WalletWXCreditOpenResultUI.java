package com.tencent.mm.plugin.wxcredit.ui;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import com.tencent.mm.ab.l;
import com.tencent.mm.kernel.e;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.plugin.wallet_core.model.o;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.x;
import com.tencent.mm.ui.base.a;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;

@a(19)
public class WalletWXCreditOpenResultUI
  extends WalletBaseUI
{
  private CheckBox qxw;
  
  private void YO()
  {
    cDL().m(new Object[] { Boolean.valueOf(this.qxw.isChecked()) });
  }
  
  public final boolean d(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    return false;
  }
  
  protected final int getLayoutId()
  {
    return a.g.wallet_wxcredit_open_result_ui;
  }
  
  protected final void initView()
  {
    setMMTitle(a.i.wallet_wxcredit_open_result_title);
    TextView localTextView = (TextView)findViewById(a.f.wallet_wxcredit_open_tips);
    this.qxw = ((CheckBox)findViewById(a.f.attention_cb));
    Bankcard localBankcard = (Bankcard)this.sy.getParcelable("key_bankcard");
    if (localBankcard != null)
    {
      this.qxw.setText(getString(a.i.wallet_wxcredit_open_result_wait_attention, new Object[] { localBankcard.field_bankName }));
      localTextView.setText(a.i.wallet_wxcredit_open_result_wait_tips);
    }
    ((Button)findViewById(a.f.next_btn)).setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        WalletWXCreditOpenResultUI.a(WalletWXCreditOpenResultUI.this);
      }
    });
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    com.tencent.mm.kernel.g.Ek();
    com.tencent.mm.kernel.g.Ei().DT().set(196658, Boolean.valueOf(true));
    o.bOW().prH = bi.VE();
    initView();
  }
  
  public boolean onKeyUp(int paramInt, KeyEvent paramKeyEvent)
  {
    if (paramInt == 4)
    {
      YO();
      return true;
    }
    return super.onKeyUp(paramInt, paramKeyEvent);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/wxcredit/ui/WalletWXCreditOpenResultUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */