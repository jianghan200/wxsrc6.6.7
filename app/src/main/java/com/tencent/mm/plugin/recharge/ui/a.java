package com.tencent.mm.plugin.recharge.ui;

import com.tencent.mm.plugin.recharge.model.MallRechargeProduct;
import com.tencent.mm.sdk.platformtools.x;
import java.util.Iterator;
import java.util.List;

public final class a
{
  public static MallRechargeProduct bQ(List<MallRechargeProduct> paramList)
  {
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
    {
      MallRechargeProduct localMallRechargeProduct = (MallRechargeProduct)localIterator.next();
      if ((localMallRechargeProduct.isDefault) && (localMallRechargeProduct.isValid()))
      {
        x.d("MicroMsg.MallRechargeLogic", "find the defaultProduct");
        return localMallRechargeProduct;
      }
    }
    x.d("MicroMsg.MallRechargeLogic", "products.get(0)");
    return (MallRechargeProduct)paramList.get(0);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/recharge/ui/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */