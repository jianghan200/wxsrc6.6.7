package com.tencent.mm.plugin.wallet_index.ui;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.mm.ab.e;
import com.tencent.mm.ab.l;
import com.tencent.mm.ab.o;
import com.tencent.mm.bg.d;
import com.tencent.mm.compatible.e.q;
import com.tencent.mm.compatible.e.s;
import com.tencent.mm.kernel.b;
import com.tencent.mm.plugin.wallet.a.p;
import com.tencent.mm.plugin.wallet.b.a;
import com.tencent.mm.plugin.wallet_core.c.y;
import com.tencent.mm.plugin.wallet_core.model.ag;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.pluginsdk.ui.AutoLoginActivity;
import com.tencent.mm.pluginsdk.ui.AutoLoginActivity.a;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.base.h;

public class WalletOpenFingerprintPayRedirectUI
  extends AutoLoginActivity
  implements e
{
  private boolean Fe = false;
  private Dialog eXG = null;
  
  private void b(int paramInt, boolean paramBoolean, String paramString)
  {
    x.e("MicroMsg.WalletOpenFingerprintPayRedirectUI", "hy: redirect to open fingerprint failed. errCode: %d", new Object[] { Integer.valueOf(paramInt) });
    if ((this.eXG != null) && (this.eXG.isShowing()))
    {
      this.eXG.dismiss();
      this.eXG = null;
    }
    if (paramBoolean)
    {
      h.a(this, paramString, "", false, new WalletOpenFingerprintPayRedirectUI.2(this));
      return;
    }
    finish();
  }
  
  protected final boolean A(Intent paramIntent)
  {
    return true;
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    if ((paraml instanceof y))
    {
      if (this.Fe) {
        break label164;
      }
      this.Fe = true;
      if ((paramInt1 != 0) || (paramInt2 != 0)) {
        break label143;
      }
      x.i("MicroMsg.WalletOpenFingerprintPayRedirectUI", "hy: bind query ok. start judge.");
      p.bNp();
      paramString = p.bNq();
      if ((paramString == null) || (!paramString.bPs()))
      {
        x.i("MicroMsg.WalletOpenFingerprintPayRedirectUI", "hy: not open wechat payment. hint bind bankcard");
        b(5, true, getString(a.i.wallet_fingerprint_redirect_not_open_fp_payment));
      }
    }
    else
    {
      return;
    }
    if ((!a.bOh()) || (q.deQ.dfa != 1))
    {
      x.e("MicroMsg.WalletOpenFingerprintPayRedirectUI", "hy: not support wechat fp pay or not allow");
      b(6, true, getString(a.i.wallet_fingerprint_support_not_fp_pay));
      return;
    }
    paramString = new Intent();
    paramString.putExtra("key_is_from_system", true);
    d.b(this, "wallet", ".pwd.ui.WalletPasswordSettingUI", paramString);
    finish();
    return;
    label143:
    x.e("MicroMsg.WalletOpenFingerprintPayRedirectUI", "hy: bind query failed. inform fail.");
    b(3, true, getString(a.i.wallet_app_err_system_busy_tip));
    return;
    label164:
    x.w("MicroMsg.WalletOpenFingerprintPayRedirectUI", "hy: is already handled");
  }
  
  protected final void a(AutoLoginActivity.a parama, Intent paramIntent)
  {
    x.i("MicroMsg.WalletOpenFingerprintPayRedirectUI", "postLogin, loginResult = " + parama);
    switch (3.hdM[parama.ordinal()])
    {
    default: 
      x.e("MicroMsg.WalletOpenFingerprintPayRedirectUI", "postLogin, unknown login result = " + parama);
    }
    for (;;)
    {
      b(2, true, getString(a.i.wallet_app_err_system_busy_tip));
      return;
      x.i("MicroMsg.WalletOpenFingerprintPayRedirectUI", "hy: login ok.");
      com.tencent.mm.kernel.g.Ek();
      com.tencent.mm.kernel.g.Eh().dpP.a(new y(null, 19), 0);
      if (this.eXG != null)
      {
        this.eXG.dismiss();
        this.eXG = null;
      }
      this.eXG = com.tencent.mm.wallet_core.ui.g.e(this, new WalletOpenFingerprintPayRedirectUI.1(this));
      return;
      x.e("MicroMsg.WalletOpenFingerprintPayRedirectUI", "postLogin fail, loginResult = " + parama);
      b(1, false, "");
    }
  }
  
  protected final int getLayoutId()
  {
    return -1;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    com.tencent.mm.kernel.g.Ek();
    com.tencent.mm.kernel.g.Eh().dpP.a(385, this);
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
    com.tencent.mm.kernel.g.Ek();
    com.tencent.mm.kernel.g.Eh().dpP.b(385, this);
  }
  
  protected void onStop()
  {
    super.onStop();
    if ((this.eXG != null) && (this.eXG.isShowing()))
    {
      this.eXG.dismiss();
      this.eXG = null;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/wallet_index/ui/WalletOpenFingerprintPayRedirectUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */