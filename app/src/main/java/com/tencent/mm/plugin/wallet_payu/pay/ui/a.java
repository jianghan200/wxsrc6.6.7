package com.tencent.mm.plugin.wallet_payu.pay.ui;

import android.content.Context;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.plugin.wallet_core.model.Orders;
import com.tencent.mm.plugin.wallet_core.ui.g;
import java.util.ArrayList;

public final class a
  extends g
{
  public a(Context paramContext, ArrayList<Bankcard> paramArrayList, int paramInt, Orders paramOrders)
  {
    super(paramContext, paramArrayList, paramInt, paramOrders);
  }
  
  public final int getCount()
  {
    if ((this.oZG != null) && (this.oZG.size() != 0)) {
      return this.oZG.size();
    }
    return 1;
  }
  
  public final Bankcard ze(int paramInt)
  {
    if ((this.oZG != null) && (this.oZG.size() != 0)) {
      return (Bankcard)this.oZG.get(paramInt);
    }
    if (paramInt != getCount() - 1) {
      return (Bankcard)this.oZG.get(paramInt);
    }
    return null;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/wallet_payu/pay/ui/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */