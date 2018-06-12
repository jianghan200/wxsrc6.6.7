package com.tencent.mm.plugin.luckymoney.sns;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.mm.plugin.wallet_core.ui.WalletCheckPwdUI;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.wallet_core.c;
import com.tencent.mm.wallet_core.d.g;
import com.tencent.mm.wallet_core.d.i;

public class a
  extends c
{
  public final c a(Activity paramActivity, Bundle paramBundle)
  {
    if ((paramActivity instanceof SnsLuckyMoneyFreePwdSetting)) {
      c(paramActivity, WalletCheckPwdUI.class, paramBundle);
    }
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
    b(paramActivity, paramBundle);
  }
  
  public final String aNK()
  {
    return "LuckyFreePwdProcess";
  }
  
  public final void b(Activity paramActivity, Bundle paramBundle)
  {
    Intent localIntent = new Intent();
    Bundle localBundle = paramBundle;
    if (paramBundle == null) {
      localBundle = new Bundle();
    }
    localIntent.putExtras(localBundle);
    a(paramActivity, "luckymoney", ".sns.SnsLuckyMoneyFreePwdSetting", -1, localIntent, true);
  }
  
  public final void c(Activity paramActivity, int paramInt)
  {
    b(paramActivity, null);
  }
  
  public final boolean c(Activity paramActivity, Bundle paramBundle)
  {
    return false;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/luckymoney/sns/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */