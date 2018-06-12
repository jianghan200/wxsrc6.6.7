package com.tencent.mm.plugin.wallet_core.ui;

import com.tencent.mm.plugin.wallet_core.model.Orders;
import com.tencent.mm.plugin.wallet_core.model.Orders.Commodity;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public enum b
{
  private Map<String, WeakReference<a>> psC = new HashMap();
  
  private b() {}
  
  public final a a(Orders paramOrders)
  {
    Object localObject1;
    if ((paramOrders != null) && (paramOrders.ppf != null))
    {
      localObject1 = new StringBuilder();
      int i = 0;
      while (i < paramOrders.ppf.size())
      {
        ((StringBuilder)localObject1).append(((Orders.Commodity)paramOrders.ppf.get(i)).bOe);
        i += 1;
      }
      ((StringBuilder)localObject1).append("@");
      ((StringBuilder)localObject1).append(paramOrders.poN);
      localObject1 = ((StringBuilder)localObject1).toString();
      if (!bi.oW((String)localObject1)) {
        break label104;
      }
      x.w("MicroMsg.FavorLogicHelperPool", "get key null");
    }
    for (;;)
    {
      return null;
      localObject1 = null;
      break;
      label104:
      Object localObject2;
      if (this.psC.containsKey(localObject1))
      {
        x.i("MicroMsg.FavorLogicHelperPool", "hit cache, key:" + (String)localObject1);
        localObject2 = (WeakReference)this.psC.get(localObject1);
        if (localObject2 == null) {
          break label231;
        }
        localObject2 = (a)((WeakReference)localObject2).get();
        if (localObject2 != null) {
          return (a)localObject2;
        }
        x.i("MicroMsg.FavorLogicHelperPool", "helper null");
      }
      while ((paramOrders != null) && (paramOrders.ppg != null))
      {
        paramOrders = new a(paramOrders.ppg);
        localObject2 = new WeakReference(paramOrders);
        this.psC.put(localObject1, localObject2);
        return paramOrders;
        label231:
        x.i("MicroMsg.FavorLogicHelperPool", "weakHelper null");
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/wallet_core/ui/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */