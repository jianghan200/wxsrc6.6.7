package com.tencent.mm.plugin.welab;

import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.v;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.protocal.c.uj;
import com.tencent.mm.protocal.c.yq;
import com.tencent.mm.protocal.c.yr;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.aa.a;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public final class f
{
  private static boolean DEBUG = false;
  private static boolean Sx = false;
  
  private static void Js()
  {
    long l = System.currentTimeMillis() / 1000L;
    g.Ei().DT().a(aa.a.sXf, Long.valueOf(l));
  }
  
  private static void Jt()
  {
    g.Ei().DT().lm(true);
  }
  
  static void P(boolean paramBoolean1, boolean paramBoolean2)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.WelabUpdater", "tryToUpdate isUpgrade %s, isManualAuth %s ", new Object[] { Boolean.valueOf(paramBoolean1), Boolean.valueOf(paramBoolean2) });
    if (!g.Eg().Dx())
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.WelabUpdater", "Update aborted, Account not ready.");
      return;
    }
    if ((!DEBUG) && (!paramBoolean1) && (!paramBoolean2))
    {
      localObject = (Long)g.Ei().DT().get(aa.a.sXf, null);
      long l1;
      if (localObject == null)
      {
        l1 = 0L;
        if (l1 != 0L) {
          break label154;
        }
        i = new Random().nextInt(86400);
        hk(i);
        Js();
        Jt();
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.WelabUpdater", "First update ignored. Next update: %d", new Object[] { Integer.valueOf(i) });
        i = 1;
      }
      for (;;)
      {
        if (i != 0) {
          break label291;
        }
        com.tencent.mm.sdk.platformtools.x.v("MicroMsg.WelabUpdater", "No need to update");
        return;
        l1 = ((Long)localObject).longValue();
        break;
        label154:
        localObject = (Integer)g.Ei().DT().get(aa.a.sXg, null);
        label188:
        long l2;
        long l3;
        if ((localObject == null) || (((Integer)localObject).intValue() == 0))
        {
          i = 86400;
          l2 = i;
          l3 = System.currentTimeMillis() / 1000L;
          if (l3 <= l1 + l2) {
            break label281;
          }
        }
        label281:
        for (boolean bool = true;; bool = false)
        {
          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.WelabUpdater", "Need Update: %b, Last Update Time: %d, Update Interval: %d, Current Time: %d", new Object[] { Boolean.valueOf(bool), Long.valueOf(l1), Long.valueOf(l2), Long.valueOf(l3) });
          if (l3 <= l1 + l2) {
            break label286;
          }
          i = 1;
          break;
          i = ((Integer)localObject).intValue();
          break label188;
        }
        label286:
        i = 0;
      }
    }
    label291:
    if (Sx)
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.WelabUpdater", "Updating");
      return;
    }
    Sx = true;
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new yq();
    ((b.a)localObject).dIH = new yr();
    ((b.a)localObject).uri = "/cgi-bin/mmux-bin/getlabsinfo";
    ((b.a)localObject).dIF = 1816;
    localObject = ((b.a)localObject).KT();
    yq localyq = (yq)((com.tencent.mm.ab.b)localObject).dID.dIL;
    Integer localInteger = (Integer)g.Ei().DT().get(aa.a.sXh, null);
    if (localInteger == null) {}
    for (int i = 0;; i = localInteger.intValue())
    {
      localyq.rEQ = i;
      localyq.rER = bYK();
      localyq.rES = ((int)bi.VE());
      if (paramBoolean1) {
        localyq.bWA |= 0x1;
      }
      if (paramBoolean2) {
        localyq.bWA |= 0x2;
      }
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.WelabUpdater", "update abtest: %s", new Object[] { ao(localyq.rER) });
      v.a((com.tencent.mm.ab.b)localObject, new f.1());
      return;
    }
  }
  
  private static String ao(LinkedList<uj> paramLinkedList)
  {
    Iterator localIterator = paramLinkedList.iterator();
    uj localuj;
    for (paramLinkedList = ""; localIterator.hasNext(); paramLinkedList = paramLinkedList + localuj.rvu + ":" + localuj.priority + "|") {
      localuj = (uj)localIterator.next();
    }
    return paramLinkedList;
  }
  
  private static LinkedList<uj> bYK()
  {
    localLinkedList = new LinkedList();
    try
    {
      Iterator localIterator = b.bYI().qmM.bYS().iterator();
      while (localIterator.hasNext())
      {
        com.tencent.mm.plugin.welab.c.a.a locala = (com.tencent.mm.plugin.welab.c.a.a)localIterator.next();
        uj localuj = new uj();
        localuj.rvu = bi.getInt(locala.field_expId, 0);
        localuj.priority = locala.field_prioritylevel;
        localLinkedList.add(localuj);
      }
      return localLinkedList;
    }
    catch (Exception localException)
    {
      com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.WelabUpdater", localException, "", new Object[0]);
    }
  }
  
  private static void hk(int paramInt)
  {
    int i = 0;
    if (paramInt == 0) {}
    for (i = 86400;; i = new Random().nextInt(126000) + 3600) {
      do
      {
        g.Ei().DT().a(aa.a.sXg, Integer.valueOf(i));
        return;
      } while ((paramInt >= 3600) && (paramInt <= 129600));
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/welab/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */