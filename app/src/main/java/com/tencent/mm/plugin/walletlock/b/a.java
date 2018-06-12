package com.tencent.mm.plugin.walletlock.b;

import android.app.Activity;
import android.content.Intent;
import com.tencent.mm.plugin.walletlock.a.b.a;
import com.tencent.mm.plugin.walletlock.a.b.b;
import com.tencent.mm.plugin.walletlock.gesture.a.c;
import com.tencent.mm.plugin.walletlock.ui.WalletLockSettingUI;
import com.tencent.mm.sdk.platformtools.x;

public class a
  implements com.tencent.mm.plugin.walletlock.a.b
{
  public static int M(Activity paramActivity)
  {
    x.i("MicroMsg.BaseWalletLockImpl", "alvinluo activity %s", new Object[] { paramActivity.getClass().getSimpleName() });
    if (paramActivity.getClass().getSimpleName().equals("MallIndexUI")) {
      return 1;
    }
    if (paramActivity.getClass().getSimpleName().equals("WalletOfflineCoinPurseUI")) {
      return 2;
    }
    return -1;
  }
  
  public void K(Activity paramActivity) {}
  
  public void a(Activity paramActivity, b.b paramb) {}
  
  public void a(Activity paramActivity, b.b paramb, b.a parama) {}
  
  public void b(Activity paramActivity, int paramInt1, int paramInt2)
  {
    x.i("MicroMsg.BaseWalletLockImpl", "alvinluo enterNewWalletLockProcessForResult walletLockType: %d, requestCode: %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if (paramInt1 == 1) {
      new c().b(paramActivity, paramInt1, paramInt2);
    }
    while (paramInt1 != 2) {
      return;
    }
    new com.tencent.mm.plugin.walletlock.fingerprint.a.b().b(paramActivity, paramInt1, paramInt2);
  }
  
  public void b(Activity paramActivity, Intent paramIntent, int paramInt)
  {
    paramIntent.setClass(paramActivity, WalletLockSettingUI.class);
    paramActivity.startActivityForResult(paramIntent, paramInt);
  }
  
  public b.b bRo()
  {
    return null;
  }
  
  public boolean bRp()
  {
    return false;
  }
  
  public boolean bRq()
  {
    return false;
  }
  
  public void c(Activity paramActivity, Intent paramIntent)
  {
    paramIntent.setClass(paramActivity, WalletLockSettingUI.class);
    paramActivity.startActivity(paramIntent);
  }
  
  public void h(Activity paramActivity, int paramInt)
  {
    x.i("MicroMsg.BaseWalletLockImpl", "alvinluo enterNewWalletLockProcess walletLockType: %d", new Object[] { Integer.valueOf(paramInt) });
    if (paramInt == 1) {
      new c().h(paramActivity, paramInt);
    }
    while (paramInt != 2) {
      return;
    }
    new com.tencent.mm.plugin.walletlock.fingerprint.a.b().h(paramActivity, paramInt);
  }
  
  public void i(Activity paramActivity, int paramInt) {}
  
  public void init()
  {
    g.pIt.zB(0);
  }
  
  public void zw(int paramInt) {}
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/walletlock/b/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */