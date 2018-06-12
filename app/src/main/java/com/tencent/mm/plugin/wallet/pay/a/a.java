package com.tencent.mm.plugin.wallet.pay.a;

import com.tencent.mm.plugin.wallet.pay.a.a.b;
import com.tencent.mm.plugin.wallet.pay.a.a.h;
import com.tencent.mm.plugin.wallet.pay.a.d.c;
import com.tencent.mm.plugin.wallet_core.model.Authen;
import com.tencent.mm.plugin.wallet_core.model.Orders;
import com.tencent.mm.plugin.wallet_core.model.p;
import com.tencent.mm.pluginsdk.wallet.PayInfo;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;

public final class a
{
  public static b a(Authen paramAuthen, Orders paramOrders, boolean paramBoolean)
  {
    if ((paramAuthen == null) || (paramOrders == null))
    {
      x.i("MicroMsg.CgiManager", "empty authen or orders");
      return null;
    }
    PayInfo localPayInfo = paramAuthen.mpb;
    String str1 = "";
    if (localPayInfo != null)
    {
      x.i("MicroMsg.CgiManager", "get reqKey from payInfo");
      str1 = localPayInfo.bOd;
    }
    String str2 = str1;
    if (bi.oW(str1))
    {
      str2 = str1;
      if (paramOrders != null)
      {
        x.i("MicroMsg.CgiManager", "get reqKey from orders");
        str2 = paramOrders.bOd;
      }
    }
    if (bi.oW(str2))
    {
      x.i("MicroMsg.CgiManager", "empty reqKey!");
      return new b(paramAuthen, paramOrders, paramBoolean);
    }
    x.i("MicroMsg.CgiManager", "authen reqKey: %s", new Object[] { str2 });
    if ((localPayInfo != null) && (paramOrders != null)) {
      x.d("MicroMsg.CgiManager", "reqKey: %s, %s", new Object[] { localPayInfo.bOd, paramOrders.bOd });
    }
    x.i("MicroMsg.CgiManager", "authen go new split cgi");
    if (str2.startsWith("sns_aa_")) {
      return new com.tencent.mm.plugin.wallet.pay.a.a.a(paramAuthen, paramOrders, paramBoolean);
    }
    if (str2.startsWith("sns_tf_")) {
      return new h(paramAuthen, paramOrders, paramBoolean);
    }
    if (str2.startsWith("sns_ff_")) {
      return new com.tencent.mm.plugin.wallet.pay.a.a.d(paramAuthen, paramOrders, paramBoolean);
    }
    if (str2.startsWith("ts_")) {
      return new com.tencent.mm.plugin.wallet.pay.a.a.e(paramAuthen, paramOrders, paramBoolean);
    }
    if (str2.startsWith("sns_")) {
      return new com.tencent.mm.plugin.wallet.pay.a.a.g(paramAuthen, paramOrders, paramBoolean);
    }
    if (str2.startsWith("offline_")) {
      return new com.tencent.mm.plugin.wallet.pay.a.a.f(paramAuthen, paramOrders, paramBoolean);
    }
    return new b(paramAuthen, paramOrders, paramBoolean);
  }
  
  public static com.tencent.mm.plugin.wallet.pay.a.d.e a(p paramp, Orders paramOrders)
  {
    if ((paramp == null) || (paramOrders == null))
    {
      x.e("MicroMsg.CgiManager", "empty verify or orders");
      return null;
    }
    PayInfo localPayInfo = paramp.mpb;
    String str1 = "";
    if (localPayInfo != null)
    {
      x.i("MicroMsg.CgiManager", "get reqKey from payInfo");
      str1 = localPayInfo.bOd;
    }
    String str2 = str1;
    if (bi.oW(str1))
    {
      x.i("MicroMsg.CgiManager", "get reqKey from orders");
      str2 = paramOrders.bOd;
    }
    if (bi.oW(str2))
    {
      x.i("MicroMsg.CgiManager", "empty reqKey!");
      return new com.tencent.mm.plugin.wallet.pay.a.d.e(paramp, paramOrders);
    }
    if (localPayInfo != null) {
      x.d("MicroMsg.CgiManager", "reqKey: %s, %s", new Object[] { localPayInfo.bOd, paramOrders.bOd });
    }
    x.i("MicroMsg.CgiManager", "verify reqKey: %s", new Object[] { str2 });
    x.i("MicroMsg.CgiManager", "verify go new split cgi");
    if (str2.startsWith("sns_aa_")) {
      return new com.tencent.mm.plugin.wallet.pay.a.d.a(paramp, paramOrders);
    }
    if (str2.startsWith("sns_tf_")) {
      return new com.tencent.mm.plugin.wallet.pay.a.d.g(paramp, paramOrders);
    }
    if (str2.startsWith("sns_ff_")) {
      return new c(paramp, paramOrders);
    }
    if (str2.startsWith("ts_")) {
      return new com.tencent.mm.plugin.wallet.pay.a.d.d(paramp, paramOrders);
    }
    if (str2.startsWith("sns_")) {
      return new com.tencent.mm.plugin.wallet.pay.a.d.f(paramp, paramOrders);
    }
    return new com.tencent.mm.plugin.wallet.pay.a.d.e(paramp, paramOrders);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/wallet/pay/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */