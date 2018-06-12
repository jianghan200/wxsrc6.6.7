package com.tencent.mm.booter;

import com.tencent.mm.model.au;
import com.tencent.mm.model.c;
import com.tencent.mm.platformtools.ai;

public final class h
{
  public static boolean xG()
  {
    try
    {
      au.HU();
      ai.d((Long)c.DT().get(66817, null));
      if (ai.bG(0L) * 1000L > 1800000L) {
        return true;
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.PostTaskMediaNoteStat", localException, "", new Object[0]);
      }
    }
    return false;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/booter/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */