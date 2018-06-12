package com.tencent.mm.booter;

import com.tencent.mm.ab.l;
import com.tencent.mm.ab.o;
import com.tencent.mm.ar.k;
import com.tencent.mm.aw.d;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.au;
import com.tencent.mm.model.c;
import com.tencent.mm.platformtools.ai;
import com.tencent.mm.storage.x;

public final class n
{
  private static long cXx = 86400000L;
  
  public static void run()
  {
    au.HU();
    if (ai.bG(Long.valueOf(ai.c((Long)c.DT().get(81944, null))).longValue()) * 1000L > cXx) {}
    for (int i = 1;; i = 0)
    {
      if (i != 0)
      {
        Object localObject = d.RI();
        d.RJ();
        if (!((d)localObject).dFt)
        {
          g.Ek();
          if (g.Ei().isSDCardAvailable())
          {
            ((d)localObject).release();
            ((d)localObject).dFt = true;
            g.DF().a(159, (com.tencent.mm.ab.e)localObject);
            localObject = new k(9);
            g.DF().a((l)localObject, 0);
          }
        }
      }
      return;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/booter/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */