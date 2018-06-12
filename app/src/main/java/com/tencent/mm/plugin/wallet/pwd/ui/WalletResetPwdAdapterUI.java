package com.tencent.mm.plugin.wallet.pwd.ui;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.mm.ab.l;
import com.tencent.mm.plugin.wallet.pwd.c;
import com.tencent.mm.pluginsdk.wallet.f;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;

@com.tencent.mm.ui.base.a(7)
public class WalletResetPwdAdapterUI
  extends WalletBaseUI
{
  protected String cYO = null;
  protected boolean myK = false;
  protected com.tencent.mm.plugin.wallet.a myL = null;
  protected String pij = "";
  
  public final boolean d(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      if ((paraml instanceof com.tencent.mm.plugin.wallet_core.c.a))
      {
        f.Ul(((com.tencent.mm.plugin.wallet_core.c.a)paraml).bOj());
        paramString = new Bundle();
        paramString.putString("kreq_token", this.pij);
        com.tencent.mm.wallet_core.a.a(this, c.class, paramString, null);
        return true;
      }
    }
    else
    {
      setResult(64536);
      h.bA(this, paramString);
      finish();
      return true;
    }
    return false;
  }
  
  protected final int getLayoutId()
  {
    return -1;
  }
  
  public void onBackPressed()
  {
    if (!this.myK)
    {
      x.d("MicroMsg.WalletResetPwdAdapterUI", "back press not lock");
      finish();
      return;
    }
    x.d("MicroMsg.WalletResetPwdAdapterUI", "back press but lock");
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    ux(8);
    this.pij = getIntent().getStringExtra("reset_pwd_token");
    x.i("MicroMsg.WalletResetPwdAdapterUI", "token_by_resetPwd %s", new Object[] { this.pij });
    jr(580);
    if (getIntent() == null)
    {
      x.d("MicroMsg.WalletResetPwdAdapterUI", "func[doCheckPayNetscene] intent null");
      setResult(0);
      finish();
      return;
    }
    paramBundle = new com.tencent.mm.plugin.wallet_core.c.a(getIntent().getStringExtra("appId"), getIntent().getStringExtra("timeStamp"), getIntent().getStringExtra("nonceStr"), getIntent().getStringExtra("packageExt"), getIntent().getStringExtra("signtype"), getIntent().getStringExtra("paySignature"), getIntent().getStringExtra("url"), 13, "setWCPayPassword", getIntent().getIntExtra("pay_channel", 0));
    paramBundle.dox = "RemittanceProcess";
    a(paramBundle, true, false);
  }
  
  public void onDestroy()
  {
    js(580);
    super.onDestroy();
  }
  
  protected void onNewIntent(Intent paramIntent)
  {
    x.v("MicroMsg.WalletResetPwdAdapterUI", "onNewIntent");
    int i = paramIntent.getIntExtra("RESET_PWD_USER_ACTION", 0);
    if (i == 1)
    {
      setResult(-1);
      finish();
      return;
    }
    if (i == 2)
    {
      setResult(64536);
      finish();
      return;
    }
    setResult(0);
    finish();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/wallet/pwd/ui/WalletResetPwdAdapterUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */