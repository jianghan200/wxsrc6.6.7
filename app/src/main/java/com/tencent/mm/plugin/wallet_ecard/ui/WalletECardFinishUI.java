package com.tencent.mm.plugin.wallet_ecard.ui;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import com.tencent.mm.ab.l;
import com.tencent.mm.g.a.lf;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.s;
import com.tencent.mm.wallet_core.c;

@com.tencent.mm.ui.base.a(19)
public class WalletECardFinishUI
  extends WalletECardBaseUI
{
  private Button klJ;
  
  public final boolean d(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    return false;
  }
  
  protected final int getLayoutId()
  {
    return a.g.ecard_finish_ui;
  }
  
  protected final void initView()
  {
    this.klJ = ((Button)findViewById(a.f.finish_btn));
    this.klJ.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        x.i("MicroMsg.WalletECardFinishUI", "click finish");
        paramAnonymousView = new lf();
        com.tencent.mm.sdk.b.a.sFg.m(paramAnonymousView);
        paramAnonymousView = WalletECardFinishUI.this.cDK();
        if (paramAnonymousView != null)
        {
          Bundle localBundle = new Bundle();
          paramAnonymousView.b(WalletECardFinishUI.this.mController.tml, localBundle);
          return;
        }
        x.w("MicroMsg.WalletECardFinishUI", "process is null");
        WalletECardFinishUI.this.finish();
      }
    });
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setMMTitle(a.i.ecard_finish_title);
    enableBackMenu(false);
    setBackBtn(new WalletECardFinishUI.1(this));
    showHomeBtn(false);
    initView();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/wallet_ecard/ui/WalletECardFinishUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */