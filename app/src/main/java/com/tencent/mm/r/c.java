package com.tencent.mm.r;

import com.tencent.mm.platformtools.ab;
import com.tencent.mm.protocal.c.by;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.ao;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

public final class c
{
  private volatile boolean diA = false;
  public List<Map<String, String>> diB = new CopyOnWriteArrayList();
  volatile boolean diz = false;
  
  private static by a(by paramby)
  {
    boolean bool = true;
    if (paramby == null)
    {
      localObject = null;
      return (by)localObject;
    }
    Object localObject = paramby.rcj;
    int i = paramby.jQd;
    if (paramby.rcl == null) {}
    for (;;)
    {
      x.i("MicroMsg.FunctionMsgFetcher", "processAddMsg, fromUser: %s, msgType: %s, content==null: %s", new Object[] { localObject, Integer.valueOf(i), Boolean.valueOf(bool) });
      String str = bi.oV(ab.a(paramby.rcj));
      if ("readerapp".equals(str))
      {
        paramby.rcj = ab.oT("newsapp");
        paramby.jQd = 12399999;
      }
      if (!"blogapp".equals(str))
      {
        localObject = paramby;
        if (!"newsapp".equals(str)) {
          break;
        }
      }
      paramby.jQd = 12399999;
      return paramby;
      bool = false;
    }
  }
  
  static void b(List<d> paramList, boolean paramBoolean)
  {
    Object localObject2;
    if (paramList != null)
    {
      try
      {
        if (paramList.size() <= 0) {
          break label100;
        }
        localObject1 = new ArrayList();
        paramList = paramList.iterator();
        while (paramList.hasNext())
        {
          localObject2 = (d)paramList.next();
          if (((d)localObject2).field_needShow)
          {
            ((d)localObject2).b(a(((d)localObject2).field_addMsg));
            ((List)localObject1).add(localObject2);
          }
        }
        return;
      }
      catch (Exception paramList)
      {
        x.e("MicroMsg.FunctionMsgFetcher", "callbackToUpdate error: %s", new Object[] { paramList.getMessage() });
      }
      break label148;
    }
    label100:
    x.d("MicroMsg.FunctionMsgFetcher", "callbackToUpdate, msgList.size: %s, isShow: %s", new Object[] { Integer.valueOf(((List)localObject1).size()), Boolean.valueOf(paramBoolean) });
    paramList = c((Collection)localObject1);
    Object localObject1 = paramList.keySet().iterator();
    for (;;)
    {
      label148:
      if (!((Iterator)localObject1).hasNext()) {
        break label100;
      }
      int i = ((Integer)((Iterator)localObject1).next()).intValue();
      Object localObject3 = (List)paramList.get(Integer.valueOf(i));
      localObject2 = new HashMap();
      localObject3 = ((List)localObject3).iterator();
      while (((Iterator)localObject3).hasNext())
      {
        d locald = (d)((Iterator)localObject3).next();
        ((Map)localObject2).put(locald.field_functionmsgid, locald.field_addMsg);
      }
      localObject3 = (List)i.Cf().diQ.get(Integer.valueOf(i));
      if (localObject3 == null) {
        break;
      }
      localObject3 = ((List)localObject3).iterator();
      while (((Iterator)localObject3).hasNext()) {
        ((f)((Iterator)localObject3).next()).a(0, (Map)localObject2, paramBoolean);
      }
    }
  }
  
  private static Map<Integer, List<d>> c(Collection<d> paramCollection)
  {
    HashMap localHashMap = new HashMap();
    Iterator localIterator = paramCollection.iterator();
    while (localIterator.hasNext())
    {
      d locald = (d)localIterator.next();
      if (locald.field_addMsg != null)
      {
        List localList = (List)localHashMap.get(Integer.valueOf(locald.field_addMsg.jQd));
        paramCollection = localList;
        if (localList == null) {
          paramCollection = new ArrayList();
        }
        paramCollection.add(locald);
        localHashMap.put(Integer.valueOf(locald.field_addMsg.jQd), paramCollection);
      }
    }
    return localHashMap;
  }
  
  public final boolean BX()
  {
    boolean bool;
    Object localObject3;
    int j;
    long l1;
    int i;
    Object localObject2;
    try
    {
      if (this.diB.size() <= 0) {
        x.i("MicroMsg.FunctionMsgFetcher", "processNextNewXml, all process finished");
      }
      for (bool = false;; bool = false)
      {
        return bool;
        if (!this.diA) {
          break;
        }
        x.i("MicroMsg.FunctionMsgFetcher", "processNextNewXml, processing new xml");
      }
      this.diA = true;
      Object localObject1 = (Map)this.diB.remove(0);
      localObject3 = (String)((Map)localObject1).get(".sysmsg.functionmsg.cgi");
      j = bi.getInt((String)((Map)localObject1).get(".sysmsg.functionmsg.cmdid"), 0);
      String str1 = (String)((Map)localObject1).get(".sysmsg.functionmsg.functionmsgid");
      l1 = bi.getLong((String)((Map)localObject1).get(".sysmsg.functionmsg.version"), 0L);
      i = bi.getInt((String)((Map)localObject1).get(".sysmsg.functionmsg.op"), 0);
      int k = bi.getInt((String)((Map)localObject1).get(".sysmsg.functionmsg.retryinterval"), 0);
      int m = bi.getInt((String)((Map)localObject1).get(".sysmsg.functionmsg.reportid"), 0);
      int n = bi.getInt((String)((Map)localObject1).get(".sysmsg.functionmsg.successkey"), 0);
      int i1 = bi.getInt((String)((Map)localObject1).get(".sysmsg.functionmsg.failkey"), 0);
      int i2 = bi.getInt((String)((Map)localObject1).get(".sysmsg.functionmsg.finalfailkey"), 0);
      String str2 = (String)((Map)localObject1).get(".sysmsg.functionmsg.custombuff");
      x.d("MicroMsg.FunctionMsgFetcher", "processNextNewXml, cgi: %s, cmdId: %s, functionMsgId: %s, version: %s, op: %s, retryInterval: %s, reportId: %s, successKey: %s, failKey: %s, finalKey: %s, customBuff: %s", new Object[] { localObject3, Integer.valueOf(j), str1, Long.valueOf(l1), Integer.valueOf(i), Integer.valueOf(k), Integer.valueOf(m), Integer.valueOf(n), Integer.valueOf(i1), Integer.valueOf(i2), str2 });
      localObject2 = new d();
      if (!bi.oW((String)localObject3)) {
        ((d)localObject2).field_cgi = ((String)localObject3);
      }
      ((d)localObject2).field_cmdid = j;
      if (!bi.oW(str1)) {
        ((d)localObject2).field_functionmsgid = str1;
      }
      ((d)localObject2).field_version = l1;
      ((d)localObject2).field_retryinterval = k;
      ((d)localObject2).field_reportid = m;
      ((d)localObject2).field_successkey = n;
      ((d)localObject2).field_failkey = i1;
      ((d)localObject2).field_finalfailkey = i2;
      if (!bi.oW(str2)) {
        ((d)localObject2).field_custombuff = str2;
      }
      ((d)localObject2).field_status = -1;
      ((d)localObject2).b(null);
      j = Integer.valueOf((String)((Map)localObject1).get("FUNCTION_MSG_ADD_MSG_CREATE_TIME_KEY")).intValue();
      localObject1 = i.Cg().fw(((d)localObject2).field_functionmsgid);
      if (localObject1 != null) {
        x.i("MicroMsg.FunctionMsgFetcher", "fetchInternal, functionMsgItem.status: %s, version: %s, preVersion: %s", new Object[] { Integer.valueOf(((d)localObject1).field_status), Long.valueOf(((d)localObject1).field_version), Long.valueOf(((d)localObject1).field_preVersion) });
      }
      x.d("MicroMsg.FunctionMsgFetcher", "fetchInternal, functionMsgItem: %s", new Object[] { localObject1 });
      if (i == 0)
      {
        ((d)localObject2).field_needShow = true;
        if (localObject1 == null)
        {
          x.i("MicroMsg.FunctionMsgFetcher", "fetchInternal, functionMsgId: %s, op update, insert a new one", new Object[] { ((d)localObject2).field_functionmsgid });
          i.Cg().b((com.tencent.mm.sdk.e.c)localObject2);
        }
        for (;;)
        {
          BZ();
          break;
          if (((d)localObject1).field_version < ((d)localObject2).field_version)
          {
            x.i("MicroMsg.FunctionMsgFetcher", "fetchInternal, functionMsgId: %s, op update, update the exist one", new Object[] { ((d)localObject2).field_functionmsgid });
            ((d)localObject1).field_preVersion = ((d)localObject1).field_version;
            ((d)localObject2).field_preVersion = ((d)localObject1).field_version;
            i.Cg().a(((d)localObject1).field_functionmsgid, (d)localObject2);
          }
        }
      }
      if (i != 1) {
        break label972;
      }
    }
    finally {}
    x.i("MicroMsg.FunctionMsgFetcher", "fetchInternal, op delete");
    if (localc != null)
    {
      x.i("MicroMsg.FunctionMsgFetcher", "fetchInternal, functionMsgId: %s, op delete, newFunctionMsgItem.version: %s, functionMsgItem.version: %s", new Object[] { localc.field_functionmsgid, Long.valueOf(((d)localObject2).field_version), Long.valueOf(localc.field_version) });
      if (((d)localObject2).field_version != localc.field_version)
      {
        l1 = ((d)localObject2).field_version;
        if (l1 != 0L) {}
      }
      else if (localc == null) {}
    }
    for (;;)
    {
      try
      {
        localObject3 = a(localc.field_addMsg);
        if (localObject3 != null) {
          break label1322;
        }
        bool = true;
        x.d("MicroMsg.FunctionMsgFetcher", "callbackToDelete, msgContent==null: %s", new Object[] { Boolean.valueOf(bool) });
        if (localObject3 != null)
        {
          localObject2 = Collections.singletonMap(localc.field_functionmsgid, localc.field_addMsg);
          localObject3 = (List)i.Cf().diQ.get(Integer.valueOf(((by)localObject3).jQd));
          if (localObject3 != null)
          {
            localObject3 = ((List)localObject3).iterator();
            if (((Iterator)localObject3).hasNext())
            {
              ((f)((Iterator)localObject3).next()).a(1, (Map)localObject2, false);
              continue;
            }
          }
        }
        i.Cg().a(localc, new String[0]);
      }
      catch (Exception localException)
      {
        x.e("MicroMsg.FunctionMsgFetcher", "callbackToDelete error: %s", new Object[] { localException.getMessage() });
      }
      for (;;)
      {
        Ca();
        break;
        x.i("MicroMsg.FunctionMsgFetcher", "fetchInternal, functionMsgId: %s, op delete, the origin one not exist", new Object[] { localException.field_functionmsgid });
      }
      label972:
      if (i == 2)
      {
        localException.field_needShow = false;
        if (localc == null)
        {
          x.i("MicroMsg.FunctionMsgFetcher", "fetchInternal, functionMsgId: %s, op update but no show, insert a new one", new Object[] { localException.field_functionmsgid });
          i.Cg().b(localException);
        }
        for (;;)
        {
          BZ();
          break;
          if (localc.field_version < localException.field_version)
          {
            x.i("MicroMsg.FunctionMsgFetcher", "fetchInternal, functionMsgId: %s, op update but no show, update the exist one, preVersion: %s", new Object[] { localException.field_functionmsgid, Long.valueOf(localc.field_preVersion) });
            localc.field_preVersion = localc.field_version;
            localException.field_preVersion = localc.field_version;
            i.Cg().a(localc.field_functionmsgid, localException);
          }
        }
      }
      long l2;
      if (i == 3)
      {
        x.i("MicroMsg.FunctionMsgFetcher", "fetchInternal, functionMsgId: %s, op show, functionMsgItem: %s", new Object[] { localException.field_functionmsgid, localc });
        localException.field_needShow = true;
        if (localc != null)
        {
          l1 = localException.field_version;
          l2 = localc.field_version;
          if (localc.field_addMsg != null) {
            break label1310;
          }
        }
      }
      label1310:
      for (bool = true;; bool = false)
      {
        x.i("MicroMsg.FunctionMsgFetcher", "fetchInternal, op show, newFunctionMsgItem.version: %s, functionMsgItem.version: %s, functionMsgItem.msgContent == null: %s", new Object[] { Long.valueOf(l1), Long.valueOf(l2), Boolean.valueOf(bool) });
        if ((localc.field_version >= localException.field_version) || (localException.field_version == 0L))
        {
          localc.field_needShow = true;
          if (localc.field_addMsg != null)
          {
            x.i("MicroMsg.FunctionMsgFetcher", "show, update create time to: %s", new Object[] { Integer.valueOf(j) });
            localc.field_addMsg.lOH = j;
          }
          i.Cg().a(localc.field_functionmsgid, localc);
          if (localc.field_addMsg != null) {
            b(Collections.singletonList(localc), true);
          }
        }
        Ca();
        break;
      }
      bool = true;
      break;
      label1322:
      bool = false;
    }
  }
  
  public final boolean BY()
  {
    try
    {
      boolean bool = this.diz;
      return bool;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final void BZ()
  {
    for (;;)
    {
      try
      {
        if (this.diz)
        {
          x.l("MicroMsg.FunctionMsgFetcher", "fetchAllIfNeed, isFetching, ignore this", new Object[0]);
          Ca();
          return;
        }
        if (!ao.isNetworkConnected(ad.getContext()))
        {
          x.l("MicroMsg.FunctionMsgFetcher", "fetchAllIfNeed network not connected, ignore this", new Object[0]);
          Ca();
          continue;
        }
        this.diz = true;
      }
      finally {}
      List localList = i.Cg().Cb();
      x.d("MicroMsg.FunctionMsgFetcher", "fetchAllIfNeed, fetchItems: %s", new Object[] { localList });
      if ((localList != null) && (localList.size() > 0))
      {
        x.i("MicroMsg.FunctionMsgFetcher", "fetchAllIfNeed, fetchItem.size: %s", new Object[] { Integer.valueOf(localList.size()) });
        new b(localList, new c.1(this)).start();
      }
      else
      {
        this.diz = false;
        Ca();
      }
    }
  }
  
  final void Ca()
  {
    x.l("MicroMsg.FunctionMsgFetcher", "loopToNextNewXml", new Object[0]);
    this.diA = false;
    BX();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/r/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */