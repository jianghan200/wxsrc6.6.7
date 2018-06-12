package com.tencent.mm.plugin.offline;

import android.app.Activity;
import android.os.Bundle;
import com.tencent.mm.ab.o;
import com.tencent.mm.kernel.b;
import com.tencent.mm.kernel.e;
import com.tencent.mm.plugin.offline.c.a;
import com.tencent.mm.plugin.wallet_core.model.Orders;
import com.tencent.mm.plugin.wallet_core.model.Orders.Commodity;
import com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoUI;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.aa.a;
import com.tencent.mm.storage.x;
import com.tencent.mm.wallet_core.c;
import java.util.List;

public class j
  extends c
{
  public final c a(Activity paramActivity, Bundle paramBundle)
  {
    Object localObject;
    if (paramBundle != null) {
      if (!bi.oW(paramBundle.getString("key_trans_id"))) {
        localObject = "key_trans_id";
      }
    }
    for (;;)
    {
      com.tencent.mm.kernel.g.Ek();
      com.tencent.mm.kernel.g.Eh().dpP.a(new com.tencent.mm.plugin.offline.a.g("offlineshowpage", "push", (String)localObject), 0);
      c(paramActivity, WalletOrderInfoUI.class, paramBundle);
      com.tencent.mm.kernel.g.Ek();
      com.tencent.mm.kernel.g.Ei().DT().a(aa.a.sUp, Boolean.valueOf(true));
      return this;
      localObject = (Orders)paramBundle.getParcelable("key_orders");
      if ((localObject != null) && (((Orders)localObject).ppf != null) && (((Orders)localObject).ppf.size() > 0)) {
        localObject = ((Orders.Commodity)((Orders)localObject).ppf.get(0)).bOe;
      } else {
        localObject = "";
      }
    }
  }
  
  public final void a(Activity paramActivity, int paramInt, Bundle paramBundle)
  {
    if ((paramActivity instanceof WalletOrderInfoUI))
    {
      z(paramActivity);
      b(paramActivity, null);
    }
  }
  
  public final String aNK()
  {
    return "ShowOrderSuccessProcess";
  }
  
  public final void b(Activity paramActivity, Bundle paramBundle)
  {
    ag(paramActivity);
    if (this.jfZ.getInt("key_from_scene") == 8) {
      a.Jl(this.jfZ.getString("key_appid"));
    }
  }
  
  public final void c(Activity paramActivity, int paramInt)
  {
    z(paramActivity);
  }
  
  public final boolean c(Activity paramActivity, Bundle paramBundle)
  {
    return false;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/plugin/offline/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */