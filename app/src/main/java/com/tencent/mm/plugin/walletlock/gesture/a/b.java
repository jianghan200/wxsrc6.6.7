package com.tencent.mm.plugin.walletlock.gesture.a;

import com.tencent.mm.storage.aa.a;

public final class b
{
  public static boolean bRE()
  {
    return ((Boolean)com.tencent.mm.kernel.g.Ei().DT().get(aa.a.sYC, Boolean.valueOf(false))).booleanValue();
  }
  
  public static boolean bRF()
  {
    g localg = d.bRG();
    com.tencent.mm.sdk.platformtools.x.v("MicroMsg.GestureUtil", "alvinluo timeInfo: %d, %d", new Object[] { Long.valueOf(localg.pGZ), Long.valueOf(localg.pHa) });
    if (localg.pGZ != -1L)
    {
      e.a(localg);
      if (localg.pHa / 1000L < 600L)
      {
        d.H(localg.pGZ, localg.pHa);
        return true;
      }
      d.bRH();
    }
    return false;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/walletlock/gesture/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */