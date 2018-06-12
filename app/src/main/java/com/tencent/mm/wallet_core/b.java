package com.tencent.mm.wallet_core;

import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.d;
import java.util.Map;

public final class b
{
  private static b uWS;
  
  public static b cCO()
  {
    if (uWS == null) {
      uWS = new b();
    }
    return uWS;
  }
  
  public static boolean cCP()
  {
    com.tencent.mm.storage.c localc = com.tencent.mm.model.c.c.Jx().fJ("100368");
    if ((localc.isValid()) && ("1".equals(localc.ckq().get("open")))) {}
    for (int i = 1;; i = 0)
    {
      x.d("MicroMsg.TenPaySdkAbTest", "isPwdOpen2048 %s", new Object[] { Integer.valueOf(i) });
      return i > 0;
    }
  }
  
  public static boolean cCQ()
  {
    com.tencent.mm.storage.c localc = com.tencent.mm.model.c.c.Jx().fJ("100370");
    if ((localc.isValid()) && ("1".equals(localc.ckq().get("open")))) {}
    for (int i = 1;; i = 0)
    {
      x.d("MicroMsg.TenPaySdkAbTest", "isOfflineOpen2048 %s", new Object[] { Integer.valueOf(i) });
      return i > 0;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/wallet_core/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */