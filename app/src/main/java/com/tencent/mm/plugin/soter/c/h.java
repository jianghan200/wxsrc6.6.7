package com.tencent.mm.plugin.soter.c;

import com.tencent.mm.compatible.e.s;
import com.tencent.mm.k.e;
import com.tencent.mm.kernel.c;
import com.tencent.mm.sdk.platformtools.bi;

public final class h
{
  private static String TAG = "MicroMsg.SoterUtil";
  
  public static void bFi()
  {
    if (bi.getInt(((com.tencent.mm.plugin.zero.b.a)com.tencent.mm.kernel.g.Ee().l(com.tencent.mm.plugin.zero.b.a.class)).AT().getValue("SoterEntry"), 0) == 1) {}
    for (boolean bool = true;; bool = false)
    {
      com.tencent.mm.sdk.platformtools.x.i(TAG, "alvinluo dynamic config support soter: %b", new Object[] { Boolean.valueOf(bool) });
      if (bool)
      {
        com.tencent.mm.sdk.platformtools.x.d(TAG, "alvinluo set all soter support flag to true");
        com.tencent.mm.compatible.e.q.deS.cbY = true;
        com.tencent.mm.compatible.e.q.deQ.deZ = 1;
        com.tencent.mm.compatible.e.q.deQ.dfa = 1;
        com.tencent.mm.sdk.platformtools.x.d(TAG, "alvinluo deviceInfo soter support: %b, force status: %d, allow external: %d", new Object[] { Boolean.valueOf(com.tencent.mm.compatible.e.q.deS.cbY), Integer.valueOf(com.tencent.mm.compatible.e.q.deQ.deZ), Integer.valueOf(com.tencent.mm.compatible.e.q.deQ.dfa) });
      }
      return;
    }
  }
  
  public static String bFj()
  {
    try
    {
      String str = com.tencent.mm.a.g.u(com.tencent.mm.model.q.GI().getBytes());
      if (str != null)
      {
        str = str.substring(0, 8);
        return str;
      }
    }
    catch (Exception localException)
    {
      com.tencent.mm.sdk.platformtools.x.printErrStackTrace(TAG, localException, "alvinluo get md5 exception", new Object[0]);
    }
    return "";
  }
  
  public static String bFk()
  {
    return "WechatAuthKeyPay&" + com.tencent.mm.model.q.GI();
  }
  
  public static boolean bFl()
  {
    if (!com.tencent.mm.compatible.e.q.deS.cbY)
    {
      com.tencent.mm.sdk.platformtools.x.i(TAG, "hy: dynamic config is not support soter");
      return false;
    }
    return com.tencent.d.b.a.cFN();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/soter/c/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */