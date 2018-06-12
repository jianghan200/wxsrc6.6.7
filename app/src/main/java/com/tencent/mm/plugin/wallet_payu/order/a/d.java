package com.tencent.mm.plugin.wallet_payu.order.a;

import android.app.Activity;
import android.os.Bundle;
import com.tencent.mm.plugin.order.a.a;
import com.tencent.mm.plugin.wallet_payu.order.ui.PayUMallOrderDetailUI;
import com.tencent.mm.plugin.wallet_payu.order.ui.PayUMallOrderRecordListUI;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.wallet_core.c;

public class d
  extends a
{
  public final c a(Activity paramActivity, Bundle paramBundle)
  {
    x.d("MicroMsg.PayUShowOrdersInfoProcess", "start Process : ShowOrdersInfo");
    c(paramActivity, PayUMallOrderRecordListUI.class, paramBundle);
    return this;
  }
  
  public final void a(Activity paramActivity, int paramInt, Bundle paramBundle)
  {
    if ((paramActivity instanceof PayUMallOrderRecordListUI)) {
      c(paramActivity, PayUMallOrderDetailUI.class, paramBundle);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/wallet_payu/order/a/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */