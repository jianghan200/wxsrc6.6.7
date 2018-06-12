package com.tencent.mm.model;

import com.tencent.mm.ab.d;
import com.tencent.mm.ab.d.a;
import com.tencent.mm.ab.d.b;
import com.tencent.mm.platformtools.ab;
import com.tencent.mm.plugin.messenger.foundation.a.m;
import com.tencent.mm.plugin.messenger.foundation.a.n;
import com.tencent.mm.plugin.report.f;
import com.tencent.mm.protocal.c.by;
import com.tencent.mm.sdk.platformtools.ay;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.bl;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.bd;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class bv
  implements d
{
  private Map<String, List<a>> dDA = new HashMap();
  private Map<String, List<n>> dDB = new HashMap();
  private Map<String, m> dDC = new ConcurrentHashMap();
  private Map<String, List<a>> dDz = new HashMap();
  
  @Deprecated
  private void a(String paramString, d.a parama, boolean paramBoolean)
  {
    Map localMap;
    if (paramBoolean)
    {
      localMap = this.dDA;
      paramString = (List)localMap.get(paramString);
      if ((paramString != null) && (!paramString.isEmpty())) {
        break label52;
      }
      x.w("MicroMsg.SysCmdMsgExtension", "listener list is empty, return now");
    }
    for (;;)
    {
      return;
      localMap = this.dDz;
      break;
      label52:
      x.i("MicroMsg.SysCmdMsgExtension", "listener list size is %d", new Object[] { Integer.valueOf(paramString.size()) });
      paramString = paramString.iterator();
      while (paramString.hasNext()) {
        ((a)paramString.next()).a(parama);
      }
    }
  }
  
  @Deprecated
  public final void a(String paramString, a parama, boolean paramBoolean)
  {
    if ((bi.oW(paramString)) || (parama == null)) {
      return;
    }
    if (paramBoolean) {}
    for (Map localMap = this.dDA;; localMap = this.dDz)
    {
      List localList = (List)localMap.get(paramString);
      Object localObject = localList;
      if (localList == null)
      {
        localObject = new LinkedList();
        localMap.put(paramString, localObject);
      }
      if (((List)localObject).contains(parama)) {
        break;
      }
      ((List)localObject).add(parama);
      return;
    }
  }
  
  public final void a(String paramString, m paramm)
  {
    if ((bi.oW(paramString)) || (paramm == null)) {
      return;
    }
    if (this.dDC.containsKey(paramString)) {
      x.w("MicroMsg.SysCmdMsgExtension", "NewXmlConsumer for %s has exist! %s", new Object[] { paramString, bi.cjd() });
    }
    this.dDC.put(paramString, paramm);
  }
  
  public final void a(String paramString, n paramn)
  {
    if ((bi.oW(paramString)) || (paramn == null)) {
      return;
    }
    for (;;)
    {
      Object localObject;
      synchronized (this.dDB)
      {
        localObject = (List)this.dDB.get(paramString);
        if (localObject == null)
        {
          localObject = new LinkedList();
          this.dDB.put(paramString, localObject);
          paramString = (String)localObject;
          try
          {
            if (!paramString.contains(paramn)) {
              paramString.add(paramn);
            }
            return;
          }
          finally {}
        }
      }
      paramString = (String)localObject;
    }
  }
  
  public final d.b b(d.a parama)
  {
    Object localObject1 = parama.dIN;
    String str;
    switch (((by)localObject1).jQd)
    {
    default: 
      x.w("MicroMsg.SysCmdMsgExtension", "cmdAM msgType is %d, ignore, return now", new Object[] { Integer.valueOf(((by)localObject1).jQd) });
      return null;
    case 10001: 
      str = ab.a(((by)localObject1).rcj);
      ab.a(((by)localObject1).rcl);
      a(str, parama, false);
      f.mDy.k(10395, String.valueOf(((by)localObject1).rcq));
      return null;
    }
    Object localObject2 = ab.a(((by)localObject1).rcl);
    if (bi.oW((String)localObject2))
    {
      x.e("MicroMsg.SysCmdMsgExtension", "null msg content");
      return null;
    }
    if (((String)localObject2).startsWith("~SEMI_XML~"))
    {
      localObject1 = ay.WA((String)localObject2);
      if (localObject1 == null)
      {
        x.e("MicroMsg.SysCmdMsgExtension", "SemiXml values is null, msgContent %s", new Object[] { localObject2 });
        return null;
      }
      str = "brand_service";
      x.d("MicroMsg.SysCmdMsgExtension", "recieve a syscmd_newxml %s subType %s", new Object[] { localObject2, str });
      if (str != null) {
        a(str, parama, true);
      }
    }
    else
    {
      for (;;)
      {
        synchronized (this.dDB)
        {
          localObject2 = (List)this.dDB.get(str);
          if ((localObject2 == null) || (((List)localObject2).isEmpty()))
          {
            x.w("MicroMsg.SysCmdMsgExtension", "listener list is empty, return now");
            localObject2 = (m)this.dDC.get(str);
            if (localObject2 == null) {
              break;
            }
            return ((m)localObject2).a(str, (Map)localObject1, parama);
            int i = ((String)localObject2).indexOf("<sysmsg");
            if (i == -1)
            {
              x.e("MicroMsg.SysCmdMsgExtension", "msgContent not start with <sysmsg");
              return null;
            }
            localObject1 = ((String)localObject2).substring(i);
            x.d("MicroMsg.SysCmdMsgExtension", "oneliang, msg content:%s,sub content:%s", new Object[] { localObject2, localObject1 });
            localObject1 = bl.z((String)localObject1, "sysmsg");
            if (localObject1 == null)
            {
              x.e("MicroMsg.SysCmdMsgExtension", "XmlParser values is null, msgContent %s", new Object[] { localObject2 });
              return null;
            }
            str = (String)((Map)localObject1).get(".sysmsg.$type");
          }
        }
        x.i("MicroMsg.SysCmdMsgExtension", "listener list size is %d", new Object[] { Integer.valueOf(((List)localObject2).size()) });
        try
        {
          ??? = ((List)localObject2).iterator();
          while (((Iterator)???).hasNext()) {
            ((n)((Iterator)???).next()).onNewXmlReceived(str, (Map)localObject1, parama);
          }
        }
        finally {}
      }
      x.e("MicroMsg.SysCmdMsgExtension", "no NewXmlConsumer to consume cmd %s!!", new Object[] { str });
    }
    return null;
  }
  
  @Deprecated
  public final void b(String paramString, a parama, boolean paramBoolean)
  {
    if ((bi.oW(paramString)) || (parama == null)) {
      return;
    }
    if (paramBoolean) {}
    for (Map localMap = this.dDA;; localMap = this.dDz)
    {
      paramString = (List)localMap.get(paramString);
      if (paramString == null) {
        break;
      }
      paramString.remove(parama);
      return;
    }
  }
  
  public final void b(String paramString, m arg2)
  {
    if ((bi.oW(paramString)) || (??? == null)) {
      return;
    }
    synchronized (this.dDC)
    {
      this.dDC.remove(paramString);
      return;
    }
  }
  
  public final void b(String paramString, n paramn)
  {
    if ((bi.oW(paramString)) || (paramn == null)) {}
    for (;;)
    {
      return;
      synchronized (this.dDB)
      {
        paramString = (List)this.dDB.get(paramString);
        if (paramString == null) {
          continue;
        }
        try
        {
          paramString.remove(paramn);
          return;
        }
        finally {}
      }
    }
  }
  
  public final void h(bd parambd) {}
  
  public static abstract interface a
  {
    public abstract void a(d.a parama);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/model/bv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */