package com.tencent.mm.model.c;

import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.v;
import com.tencent.mm.kernel.a;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.protocal.c.uj;
import com.tencent.mm.protocal.c.yq;
import com.tencent.mm.protocal.c.yr;
import com.tencent.mm.storage.aa.a;
import com.tencent.mm.storage.d;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;

public final class b
{
  private static boolean Sx = false;
  
  static void Jq()
  {
    int j = 1;
    if (!g.Eg().Dx())
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ABTestUpdater", "Update aborted, Account not ready.");
      return;
    }
    Object localObject = (Long)g.Ei().DT().get(aa.a.sQz, null);
    if (localObject == null) {}
    int i;
    for (long l1 = 0L; l1 == 0L; l1 = ((Long)localObject).longValue())
    {
      i = new Random().nextInt(86400);
      hk(i);
      Js();
      Jt();
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ABTestUpdater", "First update ignored. Next update: %d", new Object[] { Integer.valueOf(i) });
      i = j;
      if (i != 0) {
        break label248;
      }
      com.tencent.mm.sdk.platformtools.x.v("MicroMsg.ABTestUpdater", "No need to update");
      return;
    }
    localObject = (Integer)g.Ei().DT().get(aa.a.sQA, null);
    label148:
    long l2;
    long l3;
    if ((localObject == null) || (((Integer)localObject).intValue() == 0))
    {
      i = 86400;
      l2 = i;
      l3 = System.currentTimeMillis() / 1000L;
      if (l3 <= l1 + l2) {
        break label242;
      }
    }
    label242:
    for (boolean bool = true;; bool = false)
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ABTestUpdater", "Need Update: %b, Last Update Time: %d, Update Interval: %d, Current Time: %d", new Object[] { Boolean.valueOf(bool), Long.valueOf(l1), Long.valueOf(l2), Long.valueOf(l3) });
      i = j;
      if (l3 > l1 + l2) {
        break;
      }
      i = 0;
      break;
      i = ((Integer)localObject).intValue();
      break label148;
    }
    label248:
    if (Sx)
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ABTestUpdater", "Updating");
      return;
    }
    update();
  }
  
  static void Jr()
  {
    if (!g.Eg().Dx())
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ABTestUpdater", "UpdateWithoutIntervalLimit aborted, Account not ready.");
      return;
    }
    if (Sx)
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ABTestUpdater", "UpdateWithoutIntervalLimit, Already Updating");
      return;
    }
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ABTestUpdater", "UpdateWithoutIntervalLimit, before do update");
    update();
  }
  
  private static void Js()
  {
    long l = System.currentTimeMillis() / 1000L;
    g.Ei().DT().a(aa.a.sQz, Long.valueOf(l));
  }
  
  private static void Jt()
  {
    g.Ei().DT().lm(true);
  }
  
  private static void hk(int paramInt)
  {
    int i = 0;
    if (paramInt == 0) {}
    for (i = 86400;; i = new Random().nextInt(126000) + 3600) {
      do
      {
        g.Ei().DT().a(aa.a.sQA, Integer.valueOf(i));
        return;
      } while ((paramInt >= 3600) && (paramInt <= 129600));
    }
  }
  
  private static void update()
  {
    Sx = true;
    Object localObject1 = new b.a();
    ((b.a)localObject1).dIG = new yq();
    ((b.a)localObject1).dIH = new yr();
    ((b.a)localObject1).uri = "/cgi-bin/mmux-bin/getabtest";
    ((b.a)localObject1).dIF = 1801;
    com.tencent.mm.ab.b localb = ((b.a)localObject1).KT();
    localObject1 = (yq)localb.dID.dIL;
    Object localObject2 = (Integer)g.Ei().DT().get(aa.a.sQy, null);
    if (localObject2 == null) {}
    for (int i = 0;; i = ((Integer)localObject2).intValue())
    {
      ((yq)localObject1).rEQ = i;
      ((yq)localObject1).rER = c.Jx().cko();
      ((yq)localObject1).rER.addAll(c.Jy().cko());
      localObject2 = ((yq)localObject1).rER.iterator();
      uj localuj;
      for (localObject1 = ""; ((Iterator)localObject2).hasNext(); localObject1 = (String)localObject1 + localuj.rvu + ":" + localuj.priority + "|") {
        localuj = (uj)((Iterator)localObject2).next();
      }
    }
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ABTestUpdater", "update abtest: %s", new Object[] { localObject1 });
    v.a(localb, new b.1(), true);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/model/c/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */