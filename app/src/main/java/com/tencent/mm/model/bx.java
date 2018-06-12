package com.tencent.mm.model;

import com.tencent.mm.kernel.a;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.aa.a;

public final class bx
{
  public static long IR()
  {
    if (ad.cic())
    {
      g.Ek();
      if (g.Eg().Dx()) {
        break label21;
      }
    }
    for (;;)
    {
      return 0L;
      label21:
      long l1 = System.currentTimeMillis();
      try
      {
        g.Ek();
        Object localObject = g.Ei().DT().get(aa.a.sWU, null);
        if (localObject != null)
        {
          long l2 = bi.getLong(localObject.toString(), 0L);
          return l1 - l2;
        }
      }
      catch (Throwable localThrowable)
      {
        com.tencent.mm.sdk.platformtools.x.e("MicroMsg.TimeHelper", localThrowable.getMessage());
      }
    }
    return 0L;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/model/bx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */