package com.tencent.mm.wallet_core.c;

import android.content.Context;
import com.tencent.mm.model.q;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.i;

public final class v
{
  public static int cDl()
  {
    if (q.GS()) {
      return a.i.wallet_power_by_payu;
    }
    return a.i.wallet_power_by_tenpay;
  }
  
  public static String cDm()
  {
    if (q.GS()) {
      return "R";
    }
    if (q.GT()) {
      return "HK$";
    }
    return "¥";
  }
  
  public static int cDn()
  {
    if (q.GS()) {
      return a.g.wallet_payu_date_illustration_dialog;
    }
    return a.g.wallet_date_illustration_dialog;
  }
  
  public static int cDo()
  {
    if (q.GS()) {
      return a.i.wallet_card_date_illustraction_payu;
    }
    return a.i.wallet_card_date_illustraction;
  }
  
  public static int cDp()
  {
    if (q.GS()) {
      return a.g.cvv_payu_dialog;
    }
    return a.g.cvv_dialog;
  }
  
  public static String hg(Context paramContext)
  {
    if (q.GS()) {
      return paramContext.getString(a.i.wallet_pwd_dialog_titile_payu);
    }
    return paramContext.getString(a.i.wallet_pwd_dialog_titile);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/wallet_core/c/v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */