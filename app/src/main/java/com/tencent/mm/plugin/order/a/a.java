package com.tencent.mm.plugin.order.a;

import android.app.Activity;
import android.os.Bundle;
import com.tencent.mm.plugin.order.ui.MallOrderDetailInfoUI;
import com.tencent.mm.plugin.order.ui.MallOrderProductListUI;
import com.tencent.mm.plugin.order.ui.MallOrderRecordListUI;
import com.tencent.mm.plugin.order.ui.MallOrderTransactionInfoUI;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.wallet_core.c;

public class a
  extends c
{
  public c a(Activity paramActivity, Bundle paramBundle)
  {
    x.d("MicroMsg.ShowOrdersInfoProcess", "start Process : ShowOrdersInfo");
    c(paramActivity, MallOrderRecordListUI.class, paramBundle);
    return this;
  }
  
  public void a(Activity paramActivity, int paramInt, Bundle paramBundle)
  {
    if ((paramActivity instanceof MallOrderRecordListUI)) {
      c(paramActivity, MallOrderTransactionInfoUI.class, paramBundle);
    }
    do
    {
      do
      {
        return;
        if (!(paramActivity instanceof MallOrderDetailInfoUI)) {
          break;
        }
        paramInt = paramBundle.getInt("key_enter_id");
        if (paramInt == 0)
        {
          c(paramActivity, MallOrderProductListUI.class, paramBundle);
          return;
        }
      } while (paramInt != 1);
      c(paramActivity, MallOrderTransactionInfoUI.class, paramBundle);
      return;
    } while ((!(paramActivity instanceof MallOrderProductListUI)) && (!(paramActivity instanceof MallOrderTransactionInfoUI)));
    z(paramActivity);
  }
  
  public final String aNK()
  {
    return "ShowOrdersInfoProcess";
  }
  
  public final void b(Activity paramActivity, Bundle paramBundle)
  {
    super.ag(paramActivity);
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


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/order/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */