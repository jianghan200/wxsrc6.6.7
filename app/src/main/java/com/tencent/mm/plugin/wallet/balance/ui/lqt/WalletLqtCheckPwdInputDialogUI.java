package com.tencent.mm.plugin.wallet.balance.ui.lqt;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import com.tencent.mm.ab.l;
import com.tencent.mm.plugin.wallet_core.ui.o;
import com.tencent.mm.plugin.wallet_core.ui.o.a;
import com.tencent.mm.plugin.wxpay.a.c;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.a;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.s;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import com.tencent.mm.wallet_core.ui.e;

@a(3)
public class WalletLqtCheckPwdInputDialogUI
  extends WalletBaseUI
{
  private String cZH = "";
  private String oZC = "";
  private o oZD;
  
  private void showDialog()
  {
    if ((this.oZD != null) && (this.oZD.isShowing())) {
      this.oZD.dismiss();
    }
    if (this.oZD == null)
    {
      this.oZC = e.B(bi.getDouble(this.oZC, 0.0D));
      this.oZD = o.a(this, this.cZH, this.oZC, "", new WalletLqtCheckPwdInputDialogUI.2(this), new WalletLqtCheckPwdInputDialogUI.3(this), new o.a()
      {
        public final void blf()
        {
          x.i("MicroMsg.WalletLqtCheckPwdInputDialogUI", "hy: pwd cancel.finish");
          WalletLqtCheckPwdInputDialogUI.a(WalletLqtCheckPwdInputDialogUI.this).dismiss();
          WalletLqtCheckPwdInputDialogUI.this.finish();
        }
      });
      return;
    }
    this.oZD.bqn();
    this.oZD.show();
  }
  
  public final boolean d(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    return false;
  }
  
  protected final int getLayoutId()
  {
    return -1;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    int i = 1;
    super.onCreate(paramBundle);
    ux(4);
    this.cZH = getIntent().getStringExtra("lqt_fetch_pwd_title");
    this.oZC = getIntent().getStringExtra("lqt_fetch_pwd_money");
    x.i("MicroMsg.WalletLqtCheckPwdInputDialogUI", "hy: money : %s, title : %s", new Object[] { bi.oV(this.oZC), bi.oV(this.cZH) });
    if ((!bi.oW(this.cZH)) && (!bi.oW(this.oZC))) {}
    while (i == 0)
    {
      h.a(this.mController.tml, a.i.wallet_order_info_err, 0, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          WalletLqtCheckPwdInputDialogUI.this.finish();
        }
      });
      return;
      i = 0;
    }
    getWindow().setBackgroundDrawableResource(a.c.transparent);
    showDialog();
  }
  
  public final void rj(int paramInt)
  {
    if (paramInt == 0) {
      finish();
    }
    while (paramInt != 1) {
      return;
    }
    showDialog();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtCheckPwdInputDialogUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */