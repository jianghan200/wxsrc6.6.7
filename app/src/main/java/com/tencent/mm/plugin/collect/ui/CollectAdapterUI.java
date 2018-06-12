package com.tencent.mm.plugin.collect.ui;

import android.os.Bundle;
import com.tencent.mm.ab.l;
import com.tencent.mm.bg.d;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.storage.aa.a;
import com.tencent.mm.ui.base.a;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;

@a(7)
public class CollectAdapterUI
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
    ux(8);
    g.Ek();
    int i = ((Integer)g.Ei().DT().get(aa.a.sTs, Integer.valueOf(0))).intValue();
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.CollectAdapterUI", "walletRegion: %s", new Object[] { Integer.valueOf(i) });
    if (i == 8) {
      d.b(this, "collect", ".ui.CollectHKMainUI", getIntent());
    }
    for (;;)
    {
      finish();
      return;
      d.b(this, "collect", ".ui.CollectMainUI", getIntent());
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/collect/ui/CollectAdapterUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */