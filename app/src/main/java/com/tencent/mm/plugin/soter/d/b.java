package com.tencent.mm.plugin.soter.d;

import com.tencent.mm.plugin.soter.c.e;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.vending.g.g;

public final class b
{
  public static void a(boolean paramBoolean1, boolean paramBoolean2, e parame)
  {
    x.v("MicroMsg.SoterInitManager", "alvinluo isNeedPrepareAsk: %b, isNeedSaveDeviceInfo: %b", new Object[] { Boolean.valueOf(paramBoolean1), Boolean.valueOf(paramBoolean2) });
    try
    {
      long l = System.currentTimeMillis();
      g.v(Boolean.valueOf(paramBoolean1), Boolean.valueOf(paramBoolean2)).d(new a()).d(new c()).d(new d()).a(new b.2(parame)).a(new b.1(l, parame));
      return;
    }
    catch (Exception localException)
    {
      do
      {
        x.printErrStackTrace("MicroMsg.SoterInitManager", localException, "alvinluo exception when init soter: %s", new Object[] { localException.getMessage() });
        com.tencent.mm.plugin.soter.c.a.dL(4, 1001);
      } while (parame == null);
      parame.xR(-1);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/soter/d/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */