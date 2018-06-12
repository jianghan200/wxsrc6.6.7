package com.tencent.mm.plugin.fingerprint.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.mm.plugin.wallet_core.ui.WalletCheckPwdUI;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.wallet_core.c;
import com.tencent.mm.wallet_core.d.g;
import com.tencent.mm.wallet_core.d.i;

public class a
  extends c
{
  public final c a(Activity paramActivity, Bundle paramBundle)
  {
    x.i("MicroMsg.FingerPrintAuthProcess", "FingerPrintAuthProcess start,forward to WalletCheckPwdUI");
    c(paramActivity, WalletCheckPwdUI.class, paramBundle);
    return this;
  }
  
  public final g a(MMActivity paramMMActivity, i parami)
  {
    if ((paramMMActivity instanceof WalletCheckPwdUI)) {
      return new a.1(this, paramMMActivity, parami);
    }
    return super.a(paramMMActivity, parami);
  }
  
  public final void a(Activity paramActivity, int paramInt, Bundle paramBundle)
  {
    if ((paramActivity instanceof WalletCheckPwdUI))
    {
      x.i("MicroMsg.FingerPrintAuthProcess", "forward to FingerPrintAuthUI");
      c(paramActivity, FingerPrintAuthUI.class, paramBundle);
    }
    while (!(paramActivity instanceof FingerPrintAuthUI)) {
      return;
    }
    b(paramActivity, paramBundle);
  }
  
  public final String aNK()
  {
    return "FingerprintAuth";
  }
  
  public final void b(Activity paramActivity, Bundle paramBundle)
  {
    paramBundle = new Intent();
    x.i("MicroMsg.FingerPrintAuthProcess", "FingerPrintAuthProcess end");
    a(paramActivity, "wallet", ".pwd.ui.WalletPasswordSettingUI", 0, paramBundle, true);
  }
  
  public final void c(Activity paramActivity, int paramInt)
  {
    b(paramActivity, new Bundle());
  }
  
  public final boolean c(Activity paramActivity, Bundle paramBundle)
  {
    return false;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/fingerprint/ui/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */