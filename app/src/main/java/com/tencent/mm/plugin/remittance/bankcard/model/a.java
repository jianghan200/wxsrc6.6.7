package com.tencent.mm.plugin.remittance.bankcard.model;

import com.tencent.mm.platformtools.SpellMap;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.math.BigDecimal;

public final class a
{
  public static char Kv(String paramString)
  {
    paramString = SpellMap.g(paramString.charAt(0));
    x.d("MicroMsg.BankRemitUtil", "pinyin: %s", new Object[] { paramString });
    if (!bi.oW(paramString)) {
      return paramString.toUpperCase().charAt(0);
    }
    return '#';
  }
  
  public static long ek(String paramString1, String paramString2)
  {
    try
    {
      if (bi.getDouble(paramString1.trim(), 0.0D) == 0.0D) {}
      for (paramString1 = "0";; paramString1 = paramString1.trim()) {
        return new BigDecimal(paramString1).divide(new BigDecimal(paramString2.trim()), 0, 4).longValue();
      }
      return 0L;
    }
    catch (Exception paramString1)
    {
      x.printErrStackTrace("MicroMsg.BankRemitUtil", paramString1, "", new Object[0]);
    }
  }
  
  public static double el(String paramString1, String paramString2)
  {
    try
    {
      if (bi.getDouble(paramString1.trim(), 0.0D) == 0.0D) {}
      for (paramString1 = "0";; paramString1 = paramString1.trim()) {
        return new BigDecimal(paramString1).divide(new BigDecimal(paramString2.trim()), 2, 4).doubleValue();
      }
      return 0.0D;
    }
    catch (Exception paramString1)
    {
      x.printErrStackTrace("MicroMsg.BankRemitUtil", paramString1, "", new Object[0]);
    }
  }
  
  public static double em(String paramString1, String paramString2)
  {
    try
    {
      double d1 = bi.getDouble(paramString1, 0.0D);
      double d2 = bi.getDouble(paramString2, 0.0D);
      if (d1 == 0.0D) {
        paramString1 = "0";
      }
      paramString1 = new BigDecimal(paramString1);
      if (d2 == 0.0D) {
        paramString2 = "0";
      }
      d1 = paramString1.multiply(new BigDecimal(paramString2)).doubleValue();
      return d1;
    }
    catch (Exception paramString1)
    {
      x.printErrStackTrace("MicroMsg.BankRemitUtil", paramString1, "", new Object[0]);
    }
    return 0.0D;
  }
  
  public static double vp(int paramInt)
  {
    return el(String.valueOf(paramInt), "100");
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/remittance/bankcard/model/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */