package com.tencent.mm.plugin.bbom;

import com.tencent.mm.g.c.cm;
import com.tencent.mm.model.ao;
import com.tencent.mm.model.au;
import com.tencent.mm.model.c;
import com.tencent.mm.platformtools.ab;
import com.tencent.mm.plugin.messenger.foundation.a.a.i;
import com.tencent.mm.plugin.messenger.foundation.a.s;
import com.tencent.mm.pluginsdk.model.app.j;
import com.tencent.mm.protocal.c.by;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.bd;
import com.tencent.mm.storage.bl;
import com.tencent.mm.storage.bl.a;
import com.tencent.mm.y.g.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class r
  implements s
{
  private static List<ao> heC = new ArrayList();
  private boolean heD = false;
  private boolean heE = false;
  private List<bd> heF = new LinkedList();
  
  public r()
  {
    this(false);
  }
  
  public r(boolean paramBoolean)
  {
    this.heD = paramBoolean;
    this.heE = false;
    this.heF = new LinkedList();
  }
  
  public static void a(ao paramao)
  {
    synchronized (heC)
    {
      if (!heC.contains(paramao)) {
        heC.add(paramao);
      }
      return;
    }
  }
  
  public static void b(ao paramao)
  {
    synchronized (heC)
    {
      heC.remove(paramao);
      return;
    }
  }
  
  public final void a(final bd parambd, final by paramby)
  {
    if (this.heD) {
      x.i("MicroMsg.SyncMessageNotifier", "mDummy is true, do nothing and return.");
    }
    for (;;)
    {
      return;
      synchronized (heC)
      {
        if (heC.isEmpty())
        {
          x.i("MicroMsg.SyncMessageNotifier", "no notifiers, ignore");
          return;
        }
      }
      if ((parambd.field_isSend != 0) || (parambd.field_status == 4))
      {
        x.i("MicroMsg.SyncMessageNotifier", "not new msg, ignore");
        return;
      }
      ??? = ab.a(paramby.rcj);
      au.HU();
      ??? = c.FZ().Hg(new bl.a((String)???).Zk(""));
      if ((??? != null) && (!((bl)???).cmV()))
      {
        x.d("MicroMsg.SyncMessageNotifier", "account no notification");
        return;
      }
      if (this.heE) {
        break;
      }
      this.heE = true;
      final Object localObject2 = new ArrayList();
      synchronized (heC)
      {
        Iterator localIterator = heC.iterator();
        if (localIterator.hasNext()) {
          ((List)localObject2).add((ao)localIterator.next());
        }
      }
      ??? = ((List)localObject2).iterator();
      while (((Iterator)???).hasNext())
      {
        localObject2 = (ao)((Iterator)???).next();
        new ag(((ao)localObject2).getLooper()).post(new Runnable()
        {
          public final void run()
          {
            if (paramby.jQd == 49)
            {
              g.a locala = g.a.gp(j.c(paramby));
              if ((locala.dxQ == 1) && (!bi.oW(locala.dxR)) && (!bi.oW(locala.dxS)))
              {
                localObject2.a(39, locala.dxS, "", locala.dxR, null, null);
                return;
              }
              localObject2.a(parambd);
              return;
            }
            localObject2.a(parambd);
          }
        });
      }
    }
    this.heF.add(parambd);
  }
  
  public final void atH()
  {
    LinkedList localLinkedList = new LinkedList();
    localLinkedList.addAll(this.heF);
    this.heF.clear();
    if (localLinkedList.size() == 0) {}
    for (;;)
    {
      return;
      Object localObject2 = new ArrayList();
      synchronized (heC)
      {
        Iterator localIterator = heC.iterator();
        if (localIterator.hasNext()) {
          ((List)localObject2).add((ao)localIterator.next());
        }
      }
      ??? = ((List)localObject2).iterator();
      while (((Iterator)???).hasNext())
      {
        localObject2 = (ao)((Iterator)???).next();
        new ag(((ao)localObject2).getLooper()).post(new r.1(this, (ao)localObject2, localList));
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/bbom/r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */