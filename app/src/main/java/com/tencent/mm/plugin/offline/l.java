package com.tencent.mm.plugin.offline;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI;
import com.tencent.mm.plugin.wallet_core.ui.WalletVerifyCodeUI;
import com.tencent.mm.wallet_core.c;

public class l
  extends c
{
  public final c a(Activity paramActivity, Bundle paramBundle)
  {
    c(paramActivity, WalletVerifyCodeUI.class, paramBundle);
    return this;
  }
  
  public final void a(Activity paramActivity, int paramInt, Bundle paramBundle)
  {
    if ((paramActivity instanceof WalletVerifyCodeUI)) {
      b(paramActivity, paramBundle);
    }
  }
  
  public final String aNK()
  {
    return "VerifyProcess";
  }
  
  public final void b(Activity paramActivity, Bundle paramBundle)
  {
    paramBundle = new Intent(paramActivity, WalletOfflineCoinPurseUI.class);
    paramBundle.addFlags(67108864);
    paramActivity.startActivity(paramBundle);
  }
  
  public final void c(Activity paramActivity, int paramInt) {}
  
  public final boolean c(Activity paramActivity, Bundle paramBundle)
  {
    return false;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/offline/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */