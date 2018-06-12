package com.tencent.mm.plugin.wear.model.g;

import com.tencent.mm.ab.d;
import com.tencent.mm.ab.d.a;
import com.tencent.mm.ab.d.b;
import com.tencent.mm.g.a.ts;
import com.tencent.mm.g.a.ts.b;
import com.tencent.mm.model.au;
import com.tencent.mm.model.c;
import com.tencent.mm.platformtools.ab;
import com.tencent.mm.protocal.c.by;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.bd;
import java.util.LinkedHashMap;

public final class b
  implements d
{
  public final d.b b(d.a parama)
  {
    ??? = parama.dIN;
    au.HU();
    if (bi.oW((String)c.DT().get(2, ""))) {
      return null;
    }
    parama = ab.a(((by)???).rcj);
    Object localObject2 = ab.a(((by)???).rck);
    if ((bi.oW(parama)) || (bi.oW((String)localObject2)))
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.YoExtension", "neither from-user nor to-user can be empty");
      return null;
    }
    Object localObject3 = ab.a(((by)???).rcl);
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.YoExtension", "from  " + parama + "content " + (String)localObject3);
    localObject2 = com.tencent.mm.plugin.wear.model.a.bSl().pIT;
    synchronized (((a)localObject2).pKi)
    {
      ts localts = a.PR(parama);
      if ((!((a)localObject2).pKi.containsKey(parama)) && (localts.cft.cfu != 1))
      {
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.wear.WearYoLogic", "Can add Yo Message %s", new Object[] { parama });
        localObject3 = new a.a((a)localObject2, parama, (String)localObject3);
        ((a)localObject2).pKi.put(parama, localObject3);
        com.tencent.mm.plugin.wear.model.a.bSl().pIT.bSB();
        return null;
      }
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.wear.WearYoLogic", "Can not add Yo Message %s", new Object[] { parama });
      localObject2 = new ts();
      ((ts)localObject2).cfs.bIH = 2;
      ((ts)localObject2).cfs.username = parama;
      com.tencent.mm.sdk.b.a.sFg.m((com.tencent.mm.sdk.b.b)localObject2);
    }
  }
  
  public final void h(bd parambd) {}
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/wear/model/g/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */