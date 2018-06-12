package com.tencent.mm.plugin.messenger.foundation.a.a;

import com.tencent.mm.g.c.am;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.ai;

public final class a
{
  public static long a(ai paramai, int paramInt, long paramLong)
  {
    if (paramai == null) {
      return 0L;
    }
    if (paramLong != 0L) {}
    for (;;)
    {
      switch (paramInt)
      {
      default: 
        return a(paramai, paramLong);
        paramLong = bi.VF();
      }
    }
    return a(paramai, paramLong) | 0x4000000000000000;
    return a(paramai, paramLong) & 0xBFFFFFFFFFFFFFFF;
    return a(paramai, paramLong) & 0x4000000000000000;
    return a(paramai, paramLong) | 0x1000000000000000;
    return a(paramai, paramLong) & 0xEFFFFFFFFFFFFFFF;
    return a(paramai, paramLong) & 0x1000000000000000;
  }
  
  public static long a(ai paramai, long paramLong)
  {
    return paramai.field_flag & 0xFF00000000000000 | 0xFFFFFFFFFFFFFF & paramLong;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/messenger/foundation/a/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */