package com.tencent.mm.ar;

import com.tencent.mm.g.a.lw;
import com.tencent.mm.kernel.a;
import com.tencent.mm.model.br;
import com.tencent.mm.protocal.c.aqa;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.bi;
import java.util.Iterator;
import java.util.LinkedList;

public final class p
  extends c<lw>
{
  public p()
  {
    this.sFo = lw.class.getName().hashCode();
  }
  
  private static boolean Qn()
  {
    int i;
    if (com.tencent.mm.kernel.g.Eg().Dx())
    {
      com.tencent.mm.kernel.g.Eg();
      if (!a.Dr())
      {
        i = 1;
        if (i == 0) {
          break label336;
        }
        if (bi.bG(bi.a((Long)com.tencent.mm.kernel.g.Ei().DT().get(68097, null), 0L)) * 1000L <= 3600000L) {
          break label113;
        }
        i = 1;
      }
    }
    LinkedList localLinkedList;
    for (;;)
    {
      if (i != 0)
      {
        localLinkedList = new LinkedList();
        Object localObject = com.tencent.mm.a.e.f(com.tencent.mm.kernel.g.Ei().cachePath + "eggresult.rep", 0, -1);
        if (localObject == null)
        {
          return false;
          i = 0;
          break;
          label113:
          i = 0;
          continue;
        }
        try
        {
          localObject = ((h)new h().aG((byte[])localObject)).ecN.iterator();
          while (((Iterator)localObject).hasNext())
          {
            g localg = (g)((Iterator)localObject).next();
            aqa localaqa;
            if (localg.ecL != 0)
            {
              localaqa = new aqa();
              localaqa.mEb = 17;
              localaqa.mEl = (localg.ecA + "," + localg.ecL);
              localLinkedList.add(localaqa);
            }
            if (localg.ecM != 0)
            {
              localaqa = new aqa();
              localaqa.mEb = 18;
              localaqa.mEl = (localg.ecA + "," + localg.ecM);
              localLinkedList.add(localaqa);
            }
          }
          if (localLinkedList.isEmpty()) {}
        }
        catch (Exception localException)
        {
          com.tencent.mm.sdk.platformtools.x.e("MicroMsg.PostTaskReportEgg", "exception:%s", new Object[] { bi.i(localException) });
        }
      }
    }
    for (;;)
    {
      br.b(localLinkedList);
      com.tencent.mm.kernel.g.Ei().DT().set(68097, Long.valueOf(bi.VE()));
      label336:
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.PostTaskReportEgg", "report egg done");
      return false;
      com.tencent.mm.a.e.deleteFile(com.tencent.mm.kernel.g.Ei().cachePath + "eggresult.rep");
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/ar/p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */