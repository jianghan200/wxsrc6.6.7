package com.tencent.mm.plugin.product.b;

import android.content.Context;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.protocal.c.um;
import com.tencent.mm.sdk.platformtools.bi;

public final class b
{
  public static String a(Context paramContext, um paramum)
  {
    if (paramum.rlz > 0) {
      return paramum.jPe + " " + d(paramum.rlz, paramum.rxc);
    }
    return paramContext.getString(a.i.mall_product_submit_price_express_free);
  }
  
  public static String d(double paramDouble, String paramString)
  {
    if (("CNY".equals(paramString)) || ("1".equals(paramString)) || (bi.oW(paramString))) {
      return String.format("¥%.2f", new Object[] { Double.valueOf(paramDouble / 100.0D) });
    }
    return String.format("%s%.2f", new Object[] { paramString, Double.valueOf(paramDouble / 100.0D) });
  }
  
  public static String l(int paramInt1, int paramInt2, String paramString)
  {
    if (paramInt1 == paramInt2) {
      return d(paramInt1, paramString);
    }
    return String.format("%s~%s", new Object[] { d(paramInt2, paramString), d(paramInt1, paramString) });
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/product/b/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */