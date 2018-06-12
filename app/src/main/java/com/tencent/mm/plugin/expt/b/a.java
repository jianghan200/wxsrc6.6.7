package com.tencent.mm.plugin.expt.b;

import android.content.Context;
import android.content.Intent;
import com.tencent.mm.a.f;
import com.tencent.mm.ab.e;
import com.tencent.mm.g.a.es;
import com.tencent.mm.kernel.e.c;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.bv;
import com.tencent.mm.plugin.expt.a.a.a;
import com.tencent.mm.plugin.expt.c.d;
import com.tencent.mm.plugin.expt.ui.ExptDebugUI;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public final class a
  implements com.tencent.mm.kernel.api.c, com.tencent.mm.plugin.expt.a.a
{
  private static a iHP;
  private int dHP = 0;
  private int djl = 0;
  public d iHQ;
  public com.tencent.mm.plugin.expt.c.c iHR;
  private f<Integer, com.tencent.mm.plugin.expt.c.a> iHS = new f(20);
  private f<String, Integer> iHT = new f(20);
  private int iHU = 0;
  private com.tencent.mm.sdk.b.c iHV = new a.1(this);
  private com.tencent.mm.plugin.messenger.foundation.a.m iHW = new a.2(this);
  private e iHX = new a.3(this);
  
  private String a(a.a parama, String paramString)
  {
    if (parama == null) {
      return paramString;
    }
    long l = bi.VG();
    String str = parama.name();
    Object localObject1 = (Integer)this.iHT.get(str);
    int i;
    if (localObject1 != null) {
      i = ((Integer)localObject1).intValue();
    }
    for (;;)
    {
      localObject1 = new com.tencent.mm.g.b.a.m();
      Object localObject2 = a(i, true, (com.tencent.mm.g.b.a.m)localObject1);
      if ((localObject2 == null) || (((HashMap)localObject2).size() <= 0)) {
        break;
      }
      localObject2 = (String)((HashMap)localObject2).get(str);
      if (!bi.oW((String)localObject2))
      {
        ((com.tencent.mm.g.b.a.m)localObject1).ciE = str;
        ((com.tencent.mm.g.b.a.m)localObject1).ciF = ((String)localObject2);
        ((com.tencent.mm.g.b.a.m)localObject1).RD();
      }
      x.i("MicroMsg.ExptService", "API Got Expt result[%s] exptId[%d] key[%s %s] defStr[%s] cost[%d]", new Object[] { localObject2, Integer.valueOf(i), parama, str, paramString, Long.valueOf(bi.bI(l)) });
      if (bi.oW((String)localObject2)) {
        break;
      }
      return (String)localObject2;
      i = this.iHR.AD(str);
      if (i > 0) {
        this.iHT.put(str, Integer.valueOf(i));
      }
    }
  }
  
  public static a aIu()
  {
    if (iHP == null) {
      iHP = new a();
    }
    return iHP;
  }
  
  protected static void aIv()
  {
    com.tencent.mm.sdk.b.a.sFg.m(new es());
  }
  
  public static void aIw()
  {
    g.DF().a(new b(), 0);
  }
  
  public final void AB(String paramString)
  {
    if (bi.oW(paramString))
    {
      x.w("MicroMsg.ExptService", "receive expt xml but content is null");
      return;
    }
    com.tencent.mm.plugin.expt.c.a locala = new com.tencent.mm.plugin.expt.c.a();
    ArrayList localArrayList;
    boolean bool;
    if (locala.AC(paramString)) {
      if (locala.field_exptSeq < 0)
      {
        h.mEJ.a(863L, 3L, 1L, false);
        localArrayList = new ArrayList();
        localArrayList.add(Integer.valueOf(locala.field_exptId));
        if (aV(localArrayList) > 0)
        {
          bool = true;
          aIv();
        }
      }
    }
    for (;;)
    {
      x.i("MicroMsg.ExptService", "received expt xml dbFlag[%b] [%s] ", new Object[] { Boolean.valueOf(bool), paramString });
      return;
      bool = false;
      break;
      h.mEJ.a(863L, 4L, 1L, false);
      localArrayList = new ArrayList();
      localArrayList.add(locala);
      if (aU(localArrayList) > 0)
      {
        bool = true;
        break;
      }
      bool = false;
      break;
      bool = false;
    }
  }
  
  public final int a(a.a parama)
  {
    parama = a(parama, "");
    if (bi.oW(parama)) {
      return 10;
    }
    return bi.getInt(parama, 10);
  }
  
  public final HashMap<String, String> a(int paramInt, boolean paramBoolean, com.tencent.mm.g.b.a.m paramm)
  {
    if (this.iHQ == null)
    {
      x.e("MicroMsg.ExptService", "Expt service is not init here! exptId[%d]", new Object[] { Integer.valueOf(paramInt) });
      return null;
    }
    long l1 = bi.VG();
    Object localObject2 = null;
    Object localObject3 = null;
    com.tencent.mm.plugin.expt.c.a locala = pn(paramInt);
    Object localObject1;
    if ((locala == null) || (bi.oW(locala.field_exptContent)))
    {
      x.w("MicroMsg.ExptService", "expt item is null or expt content is null.");
      localObject1 = localObject2;
      paramm = (com.tencent.mm.g.b.a.m)localObject3;
      if (localObject1 == null) {
        break label356;
      }
    }
    label287:
    label356:
    for (localObject2 = localObject1;; localObject2 = Integer.valueOf(0))
    {
      x.i("MicroMsg.ExptService", "get expt [%d] map[%s] expt[%s] cost[%d]", new Object[] { Integer.valueOf(paramInt), localObject2, paramm, Long.valueOf(bi.bI(l1)) });
      return (HashMap<String, String>)localObject1;
      localObject1 = locala.field_exptContent;
      if (paramBoolean)
      {
        boolean bool = false;
        if (locala.field_exptSeq < 0) {
          paramBoolean = false;
        }
        for (;;)
        {
          x.d("MicroMsg.ExptItem", "expt item is ready[%b] [%s]", new Object[] { Boolean.valueOf(paramBoolean), locala.toString() });
          if (paramBoolean) {
            break label287;
          }
          x.w("MicroMsg.ExptService", "expt time is invalid time[%d %d] seq[%d]", new Object[] { Long.valueOf(locala.field_startTime), Long.valueOf(locala.field_endTime), Integer.valueOf(locala.field_exptSeq) });
          paramm = (com.tencent.mm.g.b.a.m)localObject1;
          localObject1 = localObject2;
          break;
          long l2 = bi.VE();
          paramBoolean = bool;
          if (l2 >= locala.field_startTime) {
            if (locala.field_endTime > 0L)
            {
              paramBoolean = bool;
              if (l2 > locala.field_endTime) {}
            }
            else
            {
              paramBoolean = true;
            }
          }
        }
      }
      localObject2 = locala.aIF();
      if (paramm != null)
      {
        paramm.ciA = locala.field_exptId;
        paramm.ciB = locala.field_groupId;
        paramm.ciC = locala.field_exptSeq;
        paramm.ap(locala.field_startTime).aq(locala.field_endTime);
      }
      paramm = (com.tencent.mm.g.b.a.m)localObject1;
      localObject1 = localObject2;
      break;
    }
  }
  
  public final boolean a(a.a parama, boolean paramBoolean)
  {
    parama = a(parama, "");
    if (bi.oW(parama)) {
      return paramBoolean;
    }
    if (paramBoolean) {}
    for (int i = 1; bi.getInt(parama, i) != 0; i = 0) {
      return true;
    }
    return false;
  }
  
  final void aIt()
  {
    try
    {
      this.iHS.clear();
      this.iHT.clear();
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final int aU(List<com.tencent.mm.plugin.expt.c.a> paramList)
  {
    if (paramList.size() <= 0) {
      return 0;
    }
    Object localObject = this.iHQ.aZ(paramList);
    LinkedList localLinkedList1 = new LinkedList();
    LinkedList localLinkedList2 = new LinkedList();
    int k;
    label126:
    label211:
    int j;
    int i;
    if (localObject != null)
    {
      k = ((List)localObject).size();
      Iterator localIterator1 = ((List)localObject).iterator();
      while (localIterator1.hasNext())
      {
        com.tencent.mm.plugin.expt.c.a locala = (com.tencent.mm.plugin.expt.c.a)localIterator1.next();
        this.iHS.put(Integer.valueOf(locala.field_exptId), locala);
        localObject = locala.aIF();
        if (localObject != null)
        {
          Iterator localIterator2 = ((HashMap)localObject).keySet().iterator();
          String str;
          if (localIterator2.hasNext())
          {
            str = (String)localIterator2.next();
            localObject = this.iHR.AE(str);
            if (localObject == null) {
              break label211;
            }
            if (((com.tencent.mm.plugin.expt.c.b)localObject).field_exptId == locala.field_exptId) {
              break label346;
            }
            localLinkedList1.add(localObject);
          }
          for (;;)
          {
            this.iHT.put(((com.tencent.mm.plugin.expt.c.b)localObject).field_exptKey, Integer.valueOf(((com.tencent.mm.plugin.expt.c.b)localObject).field_exptId));
            break label126;
            break;
            localObject = new com.tencent.mm.plugin.expt.c.b();
            ((com.tencent.mm.plugin.expt.c.b)localObject).field_exptId = locala.field_exptId;
            ((com.tencent.mm.plugin.expt.c.b)localObject).field_exptKey = str;
            localLinkedList2.add(localObject);
          }
        }
      }
      j = this.iHR.aW(localLinkedList2);
      i = this.iHR.aX(localLinkedList1);
    }
    for (;;)
    {
      x.i("MicroMsg.ExptService", "replace ExptIds args[%d] db[%d] exptMap insert[list:%d  db:%d], update[list:%d db:%d]", new Object[] { Integer.valueOf(paramList.size()), Integer.valueOf(k), Integer.valueOf(localLinkedList2.size()), Integer.valueOf(j), Integer.valueOf(localLinkedList1.size()), Integer.valueOf(i) });
      return k;
      label346:
      break;
      i = 0;
      j = 0;
      k = 0;
    }
  }
  
  public final int aV(List<Integer> paramList)
  {
    int i = this.iHQ.aV(paramList);
    x.i("MicroMsg.ExptService", "delete expt ids deleteCount[%d] deleteMapCount[%d]", new Object[] { Integer.valueOf(i), Integer.valueOf(this.iHR.aY(paramList)) });
    aIt();
    return i;
  }
  
  public final void onAccountInitialized(e.c paramc)
  {
    x.i("MicroMsg.ExptService", "onAccountInitialized, %d", new Object[] { Integer.valueOf(hashCode()) });
    x.v("MicroMsg.ExptService", "add listener ");
    if (ad.cic())
    {
      com.tencent.mm.sdk.b.a.sFg.a(this.iHV);
      g.DF().a(2738, this.iHX);
      ((com.tencent.mm.plugin.messenger.foundation.a.o)g.n(com.tencent.mm.plugin.messenger.foundation.a.o.class)).getSysCmdMsgExtension().a("expt", this.iHW);
    }
  }
  
  public final void onAccountRelease()
  {
    x.i("MicroMsg.ExptService", "onAccountRelease");
    aIt();
    com.tencent.mm.sdk.b.a.sFg.c(this.iHV);
    g.DF().b(2738, this.iHX);
    ((com.tencent.mm.plugin.messenger.foundation.a.o)g.n(com.tencent.mm.plugin.messenger.foundation.a.o.class)).getSysCmdMsgExtension().b("expt", this.iHW);
  }
  
  public final com.tencent.mm.plugin.expt.c.a pn(int paramInt)
  {
    Object localObject = (com.tencent.mm.plugin.expt.c.a)this.iHS.get(Integer.valueOf(paramInt));
    if (localObject != null) {}
    com.tencent.mm.plugin.expt.c.a locala;
    do
    {
      return (com.tencent.mm.plugin.expt.c.a)localObject;
      locala = this.iHQ.pp(paramInt);
      localObject = locala;
    } while (locala == null);
    this.iHS.put(Integer.valueOf(paramInt), locala);
    return locala;
  }
  
  public final void q(Context paramContext, Intent paramIntent)
  {
    paramIntent.setClass(paramContext, ExptDebugUI.class);
    paramContext.startActivity(paramIntent);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/expt/b/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */