package com.tencent.mm.plugin.wallet_payu.pay.a;

import com.tencent.mm.plugin.wallet_core.model.Orders;
import com.tencent.mm.plugin.wallet_core.model.Orders.Commodity;
import com.tencent.mm.sdk.platformtools.x;
import java.util.Iterator;
import java.util.List;

public final class d
{
  public static Orders a(Orders paramOrders, String paramString1, String paramString2, int paramInt, String paramString3)
  {
    if ((paramOrders == null) || (paramOrders.ppf == null) || (paramOrders.ppf.size() <= 0))
    {
      x.d("MicroMsg.OrdersWrapper", "hy: params error");
      return paramOrders;
    }
    Iterator localIterator = paramOrders.ppf.iterator();
    label43:
    Orders.Commodity localCommodity;
    if (localIterator.hasNext())
    {
      localCommodity = (Orders.Commodity)localIterator.next();
      localCommodity.lNR = paramInt;
      if (!paramString1.equals("1")) {
        break label107;
      }
    }
    label107:
    for (String str = "2";; str = "1")
    {
      localCommodity.lNO = str;
      localCommodity.lNP = paramString2;
      localCommodity.lNT = paramString3;
      break label43;
      break;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/wallet_payu/pay/a/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */