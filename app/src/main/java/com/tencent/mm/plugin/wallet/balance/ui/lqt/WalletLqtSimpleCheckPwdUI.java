package com.tencent.mm.plugin.wallet.balance.ui.lqt;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import com.tencent.mm.ab.l;
import com.tencent.mm.model.q;
import com.tencent.mm.plugin.wallet_core.c.r;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import com.tencent.mm.wallet_core.ui.formview.EditHintPasswdView;

@com.tencent.mm.ui.base.a(1)
public class WalletLqtSimpleCheckPwdUI
  extends WalletBaseUI
{
  private EditHintPasswdView kkY;
  private r pco;
  
  public final boolean d(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    x.d("MicroMsg.WalletLqtSimpleCheckPwdUI", "scene end. errType: %d, errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    if ((paraml instanceof r))
    {
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        paramString = this.kkY.getText();
        paraml = new Intent();
        paraml.putExtra("lqt_enc_pwd", paramString);
        setResult(-1, paraml);
        finish();
        return true;
      }
      if (this.kkY != null) {
        this.kkY.bqn();
      }
    }
    return false;
  }
  
  protected final int getForceOrientation()
  {
    return 1;
  }
  
  protected final int getLayoutId()
  {
    return a.g.wallet_lqt_simple_check_pwd_ui;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    if (q.GS()) {}
    for (paramBundle = getString(a.i.wallet_check_pwd_title_payu);; paramBundle = getString(a.i.wallet_check_pwd_title))
    {
      setMMTitle(paramBundle);
      setBackBtn(new WalletLqtSimpleCheckPwdUI.1(this));
      ((TextView)findViewById(a.f.input_tip)).setText(a.i.wallet_check_pwd_tip);
      this.kkY = ((EditHintPasswdView)findViewById(a.f.input_et));
      com.tencent.mm.wallet_core.ui.formview.a.a(this.kkY);
      this.kkY.setOnInputValidListener(new WalletLqtSimpleCheckPwdUI.2(this));
      d(this.kkY, 0, false);
      return;
    }
  }
  
  public final void rj(int paramInt)
  {
    super.rj(paramInt);
    if (this.kkY != null) {
      this.kkY.bqn();
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtSimpleCheckPwdUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */