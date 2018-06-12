package com.tencent.mm.plugin.offline;

import android.app.Activity;
import android.os.Bundle;
import com.tencent.mm.g.a.kr;
import com.tencent.mm.plugin.offline.ui.WalletOfflineEntranceUI;
import com.tencent.mm.plugin.wallet_core.b.b;
import com.tencent.mm.plugin.wallet_core.ui.WalletPwdConfirmUI;
import com.tencent.mm.plugin.wallet_core.ui.WalletVerifyCodeUI;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.wallet_core.d.g;
import com.tencent.mm.wallet_core.d.i;

public class d
  extends b
{
  public final g a(MMActivity paramMMActivity, i parami)
  {
    if ((paramMMActivity instanceof WalletVerifyCodeUI)) {
      return new d.1(this, paramMMActivity, parami);
    }
    if ((paramMMActivity instanceof WalletPwdConfirmUI)) {
      return new d.2(this, paramMMActivity, parami);
    }
    return super.a(paramMMActivity, parami);
  }
  
  public final String aNK()
  {
    return "OfflineBindCardRegProcess";
  }
  
  public final void b(Activity paramActivity, Bundle paramBundle)
  {
    a.sFg.m(new kr());
    c(paramActivity, WalletOfflineEntranceUI.class);
    if (paramActivity != null) {
      paramActivity.finish();
    }
  }
  
  public final void c(Activity paramActivity, int paramInt)
  {
    super.c(paramActivity, paramInt);
  }
  
  public final boolean c(Activity paramActivity, Bundle paramBundle)
  {
    return super.c(paramActivity, paramBundle);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/offline/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */