package com.tencent.mm.model;

import com.tencent.mm.a.g;
import java.text.SimpleDateFormat;
import java.util.Date;

public final class o
{
  public static String l(String paramString, long paramLong)
  {
    String str = new SimpleDateFormat("ssHHmmMMddyy").format(new Date(paramLong));
    if ((paramString != null) && (paramString.length() > 1)) {}
    for (paramString = str + g.u(paramString.getBytes()).substring(0, 7);; paramString = str + "fffffff")
    {
      paramString = paramString + String.format("%04x", new Object[] { Long.valueOf(paramLong % 65535L) });
      return paramString + (paramLong % 7L + 100L);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/model/o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */