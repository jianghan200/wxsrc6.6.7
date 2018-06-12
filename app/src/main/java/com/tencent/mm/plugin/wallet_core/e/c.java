package com.tencent.mm.plugin.wallet_core.e;

import android.app.Activity;
import android.os.Bundle;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.wallet_core.model.Orders;
import com.tencent.mm.plugin.wallet_core.model.ag;
import com.tencent.mm.plugin.wallet_core.model.o;
import com.tencent.mm.pluginsdk.wallet.PayInfo;
import com.tencent.mm.wallet_core.a;

public final class c
{
  public static long pBi = 0L;
  public static int pBj = 2;
  public static int pBk = 1;
  public static int pBl = 2;
  
  public static void a(PayInfo paramPayInfo, Orders paramOrders)
  {
    if ((!o.bOW().bPs()) && (paramPayInfo != null) && (paramOrders != null)) {
      h.mEJ.h(10725, new Object[] { Integer.valueOf(1), Integer.valueOf(paramPayInfo.bVY), Integer.valueOf((int)(paramOrders.mBj * 100.0D)), paramOrders.lNV });
    }
  }
  
  public static void b(Activity paramActivity, Bundle paramBundle, int paramInt)
  {
    paramActivity = a.af(paramActivity);
    if ((!o.bOW().bPs()) && (paramActivity != null) && (paramActivity.cCT()))
    {
      paramActivity = (PayInfo)paramBundle.getParcelable("key_pay_info");
      paramBundle = (Orders)paramBundle.getParcelable("key_orders");
      if ((paramActivity != null) && (paramBundle != null)) {
        h.mEJ.h(10725, new Object[] { Integer.valueOf(paramInt), Integer.valueOf(paramActivity.bVY), Integer.valueOf((int)(paramBundle.mBj * 100.0D)), paramBundle.lNV });
      }
    }
    while ((o.bOW().bPs()) || (paramBundle == null) || (!paramBundle.getBoolean("key_is_bind_reg_process", false))) {
      return;
    }
    h.mEJ.h(10932, new Object[] { Integer.valueOf(paramInt), Integer.valueOf(paramBundle.getInt("key_bind_scene", 0)) });
  }
  
  public static void bQW()
  {
    pBi = System.currentTimeMillis();
  }
  
  public static int bQX()
  {
    return (int)((System.currentTimeMillis() - pBi) / 1000L);
  }
  
  public static void ea(int paramInt1, int paramInt2)
  {
    h.mEJ.h(10932, new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt1) });
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/wallet_core/e/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */