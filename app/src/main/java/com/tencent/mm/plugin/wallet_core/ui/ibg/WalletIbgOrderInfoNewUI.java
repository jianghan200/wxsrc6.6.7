package com.tencent.mm.plugin.wallet_core.ui.ibg;

import android.os.Bundle;
import com.tencent.mm.ab.o;
import com.tencent.mm.kernel.b;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.wallet_core.model.Orders;
import com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoNewUI;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.wallet_core.c.j;
import java.util.Iterator;
import java.util.Set;

public class WalletIbgOrderInfoNewUI
  extends WalletOrderInfoNewUI
{
  private Orders pfb;
  
  protected final void bQb() {}
  
  protected final Orders bQo()
  {
    return this.pfb;
  }
  
  public final void done()
  {
    x.i("MicroMsg.WalletIbgOrderInfoNewUI", "hy: result is not set manly. set to OK");
    Iterator localIterator = this.pvK.iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      if (!bi.oW(str))
      {
        x.d("MicroMsg.WalletIbgOrderInfoNewUI", "hy: doing netscene subscribe...appName: %s", new Object[] { str });
        g.Ek();
        g.Eh().dpP.a(new j(str), 0);
      }
    }
    setResult(-1);
    finish();
  }
  
  public void onCreate(Bundle paramBundle)
  {
    this.pfb = WalletIbgOrderInfoUI.pfb;
    super.onCreate(paramBundle);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/wallet_core/ui/ibg/WalletIbgOrderInfoNewUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */