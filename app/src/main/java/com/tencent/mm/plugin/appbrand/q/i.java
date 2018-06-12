package com.tencent.mm.plugin.appbrand.q;

import com.tencent.mm.bk.a;
import com.tencent.mm.sdk.platformtools.bi;

public final class i
{
  public static <T extends a> boolean a(T paramT1, T paramT2)
  {
    if ((paramT1 == null) && (paramT2 == null)) {
      throw new IllegalArgumentException("both null!!!");
    }
    if (paramT1 == null) {}
    while (paramT2 == null) {
      return false;
    }
    try
    {
      boolean bool = bi.isEqual(paramT1.toByteArray(), paramT2.toByteArray());
      return bool;
    }
    catch (Exception paramT1) {}
    return false;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/appbrand/q/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */