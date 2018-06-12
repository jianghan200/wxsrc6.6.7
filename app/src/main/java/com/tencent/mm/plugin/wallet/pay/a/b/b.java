package com.tencent.mm.plugin.wallet.pay.a.b;

import com.tencent.mm.ab.o;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;

public final class b
{
  private static long pfm = 0L;
  
  public static void ae(String paramString, int paramInt1, int paramInt2)
  {
    long l = System.currentTimeMillis();
    if (l - pfm > 1000L)
    {
      pfm = l;
      if (bi.oW(paramString)) {
        break label167;
      }
      if (!paramString.startsWith("sns_aa_")) {
        break label75;
      }
      paramString = new c(paramString, paramInt1, paramInt2);
    }
    for (;;)
    {
      if (paramString != null)
      {
        x.v("NetSceneCancelPayHelper", "start cancelPay request");
        com.tencent.mm.kernel.g.Ek();
        com.tencent.mm.kernel.g.Eh().dpP.a(paramString, 0);
      }
      return;
      label75:
      if (paramString.startsWith("sns_tf_")) {
        paramString = new f(paramString, paramInt1, paramInt2);
      } else if (paramString.startsWith("sns_ff_")) {
        paramString = new e(paramString, paramInt1, paramInt2);
      } else if (paramString.startsWith("sns_")) {
        paramString = new d(paramString, paramInt1, paramInt2);
      } else if (paramString.startsWith("ts_")) {
        paramString = new g(paramString, paramInt1, paramInt2);
      } else {
        label167:
        paramString = null;
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/wallet/pay/a/b/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */