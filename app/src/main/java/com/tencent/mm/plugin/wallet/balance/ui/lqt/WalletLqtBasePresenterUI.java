package com.tencent.mm.plugin.wallet.balance.ui.lqt;

import android.os.Bundle;
import com.tencent.mm.ab.l;
import com.tencent.mm.vending.app.a;
import com.tencent.mm.vending.app.c;
import com.tencent.mm.vending.c.b;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;

public abstract class WalletLqtBasePresenterUI
  extends WalletBaseUI
{
  private c dtb = new c();
  
  public boolean d(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    return false;
  }
  
  protected final int getForceOrientation()
  {
    return 1;
  }
  
  protected int getLayoutId()
  {
    return 0;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.dtb.A(getIntent(), this);
    this.uYS = true;
  }
  
  public void onDestroy()
  {
    super.onDestroy();
    this.dtb.onDestroy();
  }
  
  public void onPause()
  {
    super.onPause();
    this.dtb.GM(3);
  }
  
  public void onResume()
  {
    super.onResume();
    this.dtb.GM(2);
  }
  
  public final <T extends b<? extends a>> T t(Class<? extends b<? extends a>> paramClass)
  {
    return this.dtb.a(this, paramClass);
  }
  
  public final <T extends a> T w(Class<? extends a> paramClass)
  {
    return this.dtb.b(this, paramClass);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtBasePresenterUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */