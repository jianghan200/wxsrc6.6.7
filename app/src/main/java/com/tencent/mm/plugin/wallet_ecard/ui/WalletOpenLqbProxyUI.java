package com.tencent.mm.plugin.wallet_ecard.ui;

import android.os.Bundle;
import com.tencent.mm.ab.l;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.wallet_core.c;
import com.tencent.mm.wallet_core.d.g;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;

@com.tencent.mm.ui.base.a(3)
public class WalletOpenLqbProxyUI
  extends WalletBaseUI
{
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
    super.onCreate(paramBundle);
    ux(4);
    paramBundle = cDK();
    if (paramBundle != null)
    {
      int i = this.sy.getInt(com.tencent.mm.plugin.wallet_ecard.a.a.pBy, 0);
      String str = this.sy.getString(com.tencent.mm.plugin.wallet_ecard.a.a.pBE);
      x.i("MicroMsg.WalletOpenLqbProxyUI", "WalletOpenLqbProxyUI onCreate, openScene: %s, extraData: %s", new Object[] { Integer.valueOf(i), str });
      if (i == 3) {
        cDL().m(new Object[] { Integer.valueOf(i), str });
      }
    }
    else
    {
      return;
    }
    paramBundle.b(this, this.sy);
    finish();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/wallet_ecard/ui/WalletOpenLqbProxyUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */