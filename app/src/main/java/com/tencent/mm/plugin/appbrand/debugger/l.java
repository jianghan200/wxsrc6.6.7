package com.tencent.mm.plugin.appbrand.debugger;

import android.content.Context;
import android.webkit.ValueCallback;
import com.tencent.mm.bk.b;
import com.tencent.mm.plugin.appbrand.jsapi.d;
import com.tencent.mm.plugin.appbrand.page.n;
import com.tencent.mm.plugin.appbrand.r.c;
import com.tencent.mm.protocal.c.cba;
import com.tencent.mm.protocal.c.cbb;
import com.tencent.mm.protocal.c.cbc;
import com.tencent.mm.protocal.c.cbd;
import com.tencent.mm.protocal.c.cbe;
import com.tencent.mm.protocal.c.cbh;
import com.tencent.mm.protocal.c.cbj;
import com.tencent.mm.protocal.c.cbl;
import com.tencent.mm.protocal.c.cbn;
import com.tencent.mm.protocal.c.cbo;
import com.tencent.mm.protocal.c.cbr;
import com.tencent.mm.protocal.c.cbu;
import com.tencent.mm.protocal.c.cca;
import com.tencent.mm.protocal.c.ccb;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;

public final class l
{
  Timer bno;
  d fdP;
  h ftb;
  o fte;
  q ftg;
  private aa<Integer, Long> ftt = new aa(100);
  boolean ftu = false;
  private long ftv;
  LinkedList<k> ftw = new LinkedList();
  private final int ftx = 5000;
  private int fty = 0;
  private long ftz = 0L;
  Context mContext;
  
  private void a(LinkedList<k> paramLinkedList, boolean paramBoolean1, boolean paramBoolean2)
  {
    Object localObject;
    try
    {
      boolean bool = bi.cX(paramLinkedList);
      if (bool) {
        return;
      }
      localObject = new cbr();
      ((cbr)localObject).sxM = this.ftb.fsx;
      ((cbr)localObject).sxN = this.ftb.aev();
      Iterator localIterator = paramLinkedList.iterator();
      while (localIterator.hasNext())
      {
        k localk = (k)localIterator.next();
        ((cbr)localObject).sxB.add(localk.ftk);
      }
      localObject = p.a(1006, (com.tencent.mm.bk.a)localObject);
    }
    finally {}
    if ((!this.ftb.isBusy()) || (paramBoolean2))
    {
      x.d("MicroMsg.RemoteDebugMsgMrg", "sendMsg size %d", new Object[] { Integer.valueOf(paramLinkedList.size()) });
      this.fte.a((cbd)localObject);
    }
    for (;;)
    {
      if (paramBoolean1) {
        t(paramLinkedList);
      }
      int i = ((cbd)localObject).nc;
      paramLinkedList = this.ftb;
      paramLinkedList.fsE = System.currentTimeMillis();
      paramLinkedList.fsG = System.currentTimeMillis();
      if (!this.ftb.isBusy()) {
        this.fty = 0;
      }
      paramLinkedList = new g();
      paramLinkedList.size = ((cbd)localObject).boi();
      paramLinkedList.fsv = System.currentTimeMillis();
      this.ftb.fsP.put(((cbd)localObject).fMk, paramLinkedList);
      break;
      x.d("MicroMsg.RemoteDebugMsgMrg", "sendMsg busy");
    }
  }
  
  private void aeB()
  {
    int i = 0;
    for (;;)
    {
      try
      {
        if (i < this.ftb.fsQ.size())
        {
          int j;
          if (i == 0)
          {
            j = this.ftb.aev();
            int k = ((cbe)this.ftb.fsQ.get(i)).egS;
            if (j - k != 1) {
              bF(j + 1, k - 1);
            }
          }
          else
          {
            j = ((cbe)this.ftb.fsQ.get(i - 1)).egS;
            continue;
          }
        }
        else
        {
          return;
        }
      }
      finally {}
      i += 1;
    }
  }
  
  private LinkedList<cbe> s(LinkedList<cbe> paramLinkedList)
  {
    if (paramLinkedList == null) {}
    LinkedList localLinkedList1;
    for (paramLinkedList = null;; paramLinkedList = localLinkedList1)
    {
      return paramLinkedList;
      LinkedList localLinkedList2;
      int i;
      for (;;)
      {
        cbe localcbe;
        try
        {
          localLinkedList1 = new LinkedList();
          localLinkedList2 = new LinkedList();
          this.ftb.fsQ.addAll(paramLinkedList);
          Collections.sort(this.ftb.fsQ, new Comparator() {});
          i = this.ftb.aev();
          paramLinkedList = this.ftb.fsQ.iterator();
          if (!paramLinkedList.hasNext()) {
            break;
          }
          localcbe = (cbe)paramLinkedList.next();
          if (localcbe == null) {
            continue;
          }
          if (localcbe.egS <= i)
          {
            localLinkedList2.add(localcbe);
            continue;
          }
          if (localcbe.egS - i != 1) {
            break;
          }
        }
        finally {}
        localLinkedList1.add(localcbe);
        i = localcbe.egS;
      }
      this.ftb.jX(i);
      this.ftb.fsQ.removeAll(localLinkedList1);
      this.ftb.fsQ.removeAll(localLinkedList2);
      x.d("MicroMsg.RemoteDebugMsgMrg", "getHandleMsgList size: %d", new Object[] { Integer.valueOf(localLinkedList1.size()) });
    }
  }
  
  /* Error */
  private void t(LinkedList<k> paramLinkedList)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: ldc 127
    //   4: ldc -9
    //   6: invokestatic 202	com/tencent/mm/sdk/platformtools/x:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   9: aload_1
    //   10: invokestatic 69	com/tencent/mm/sdk/platformtools/bi:cX	(Ljava/util/List;)Z
    //   13: istore_2
    //   14: iload_2
    //   15: ifeq +6 -> 21
    //   18: aload_0
    //   19: monitorexit
    //   20: return
    //   21: aload_0
    //   22: getfield 74	com/tencent/mm/plugin/appbrand/debugger/l:ftb	Lcom/tencent/mm/plugin/appbrand/debugger/h;
    //   25: getfield 250	com/tencent/mm/plugin/appbrand/debugger/h:fsO	Ljava/util/LinkedList;
    //   28: aload_1
    //   29: invokevirtual 227	java/util/LinkedList:addAll	(Ljava/util/Collection;)Z
    //   32: pop
    //   33: goto -15 -> 18
    //   36: astore_1
    //   37: aload_0
    //   38: monitorexit
    //   39: aload_1
    //   40: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	41	0	this	l
    //   0	41	1	paramLinkedList	LinkedList<k>
    //   13	2	2	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   2	14	36	finally
    //   21	33	36	finally
  }
  
  public final void D(int paramInt, String paramString)
  {
    cbc localcbc = new cbc();
    localcbc.sxn = paramInt;
    localcbc.bPu = paramString;
    a(p.a(localcbc, this.ftb, "callInterfaceResult"));
  }
  
  public final void a(k arg1)
  {
    int i;
    if (!this.ftb.aez())
    {
      synchronized (this.ftb.mLock)
      {
        if ((System.currentTimeMillis() - this.ftb.fsE > 16L) && (!this.ftu)) {
          break label177;
        }
        this.ftw.add(???);
        long l = System.currentTimeMillis();
        synchronized (this.ftb.mLock)
        {
          if ((this.ftu) && (l - this.ftv < 32L)) {
            return;
          }
          this.ftv = l;
          if (!bi.cX(this.ftw)) {}
        }
      }
      this.ftu = true;
      i = (int)(16L - (System.currentTimeMillis() - this.ftb.fsE));
      if (i <= 0) {
        break label204;
      }
    }
    for (;;)
    {
      c.Em().h(new Runnable()
      {
        public final void run()
        {
          LinkedList localLinkedList = new LinkedList();
          synchronized (l.this.ftb.mLock)
          {
            localLinkedList.addAll(l.this.ftw);
            l.this.ftw.clear();
            l.this.ftu = false;
            l.this.a(localLinkedList, true);
            return;
          }
        }
      }, i);
      break;
      label177:
      ??? = new LinkedList();
      ((LinkedList)???).add(???);
      a((LinkedList)???, true);
      return;
      label204:
      i = 16;
    }
  }
  
  final void a(LinkedList<k> paramLinkedList, boolean paramBoolean)
  {
    try
    {
      a(paramLinkedList, paramBoolean, false);
      return;
    }
    finally
    {
      paramLinkedList = finally;
      throw paramLinkedList;
    }
  }
  
  public final void aeC()
  {
    int i = 0;
    try
    {
      boolean bool = this.ftb.isBusy();
      if (bool) {
        return;
      }
      long l = System.currentTimeMillis();
      LinkedList localLinkedList = new LinkedList();
      Iterator localIterator = this.ftb.fsO.iterator();
      for (;;)
      {
        if (localIterator.hasNext())
        {
          k localk = (k)localIterator.next();
          if (l - localk.fsv > 5000L)
          {
            localk.fsv = System.currentTimeMillis();
            localLinkedList.add(localk);
            i = localk.ftl + i;
            if ((i >= 65536L) || (localLinkedList.size() > 800))
            {
              x.i("MicroMsg.RemoteDebugMsgMrg", "try2ReSendMsg size %d", new Object[] { Integer.valueOf(localLinkedList.size()) });
              a(localLinkedList, false);
              localLinkedList.clear();
            }
          }
        }
        else
        {
          if (bi.cX(localLinkedList)) {
            break;
          }
          x.i("MicroMsg.RemoteDebugMsgMrg", "try2ReSendMsg size %d", new Object[] { Integer.valueOf(localLinkedList.size()) });
          a(localLinkedList, false);
          break;
        }
      }
    }
    finally {}
  }
  
  public final boolean aeD()
  {
    for (;;)
    {
      try
      {
        long l1 = System.currentTimeMillis();
        long l2 = this.ftz;
        int i = this.fty;
        if (l1 - l2 < i)
        {
          bool = false;
          return bool;
        }
        this.ftz = l1;
        if (this.fty < 5000)
        {
          this.fty += 1000;
          LinkedList localLinkedList1 = new LinkedList();
          localObject = this.ftb.fsO.iterator();
          if (((Iterator)localObject).hasNext())
          {
            k localk = (k)((Iterator)localObject).next();
            if (l1 - localk.fsv <= 5000L) {
              continue;
            }
            localk.fsv = System.currentTimeMillis();
            localLinkedList1.add(localk);
            a(localLinkedList1, false, true);
            bool = true;
          }
        }
        else
        {
          this.fty = 2000;
          continue;
        }
        if (this.ftb.fsO.size() <= 0) {
          break label225;
        }
      }
      finally {}
      Object localObject = (k)this.ftb.fsO.get(0);
      ((k)localObject).fsv = System.currentTimeMillis();
      localLinkedList2.add(localObject);
      a(localLinkedList2, false, true);
      boolean bool = true;
      continue;
      label225:
      bool = false;
    }
  }
  
  public final void aeE()
  {
    for (;;)
    {
      k localk;
      try
      {
        x.d("MicroMsg.RemoteDebugMsgMrg", "removeSendingMsg");
        LinkedList localLinkedList = new LinkedList();
        Iterator localIterator = this.ftb.fsO.iterator();
        if (!localIterator.hasNext()) {
          break;
        }
        localk = (k)localIterator.next();
        if (localk.ftk == null)
        {
          localLinkedList.add(localk);
          continue;
        }
        if (localk.ftk.egS > this.ftb.aew()) {
          continue;
        }
      }
      finally {}
      localCollection.add(localk);
    }
    this.ftb.fsO.removeAll(localCollection);
  }
  
  public final void aeF()
  {
    x.i("MicroMsg.RemoteDebugMsgMrg", "onClose");
    if (this.bno != null) {
      this.bno.cancel();
    }
  }
  
  public final void bF(int paramInt1, int paramInt2)
  {
    x.i("MicroMsg.RemoteDebugMsgMrg", "sync minSeq %d, maxSeq %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if (paramInt1 > paramInt2) {
      return;
    }
    long l = System.currentTimeMillis();
    if ((this.ftt.get(Integer.valueOf(paramInt1)) != null) && (l - ((Long)this.ftt.get(Integer.valueOf(paramInt1))).longValue() < 3000L))
    {
      x.i("MicroMsg.RemoteDebugMsgMrg", "sync too fast!");
      return;
    }
    this.ftt.put(Integer.valueOf(paramInt1), Long.valueOf(l));
    Object localObject = new ccb();
    ((ccb)localObject).sxM = this.ftb.fsx;
    ((ccb)localObject).sxZ = paramInt1;
    ((ccb)localObject).sya = paramInt2;
    localObject = p.a(1005, (com.tencent.mm.bk.a)localObject);
    this.fte.a((cbd)localObject);
    this.ftb.fsH = System.currentTimeMillis();
  }
  
  public final void bG(int paramInt1, int paramInt2)
  {
    for (;;)
    {
      k localk;
      try
      {
        x.d("MicroMsg.RemoteDebugMsgMrg", "removeSendingMsg with min max");
        LinkedList localLinkedList = new LinkedList();
        Iterator localIterator = this.ftb.fsO.iterator();
        if (!localIterator.hasNext()) {
          break;
        }
        localk = (k)localIterator.next();
        if (localk.ftk == null)
        {
          localLinkedList.add(localk);
          continue;
        }
        if (localk.ftk.egS < paramInt1) {
          continue;
        }
      }
      finally {}
      if (localk.ftk.egS <= paramInt2) {
        localCollection.add(localk);
      }
    }
    this.ftb.fsO.removeAll(localCollection);
  }
  
  public final void quit()
  {
    x.i("MicroMsg.RemoteDebugMsgMrg", "quit");
    Object localObject = new cca();
    ((cca)localObject).sxM = this.ftb.fsx;
    localObject = p.a(1004, (com.tencent.mm.bk.a)localObject);
    this.fte.a((cbd)localObject);
  }
  
  final void r(LinkedList<cbe> paramLinkedList)
  {
    if (bi.cX(paramLinkedList))
    {
      x.w("MicroMsg.RemoteDebugMsgMrg", "handleMsg list is null");
      return;
    }
    Iterator localIterator = s(paramLinkedList).iterator();
    Object localObject2;
    Object localObject1;
    label72:
    int i;
    Object localObject3;
    Object localObject4;
    label363:
    Object localObject5;
    long l;
    for (;;)
    {
      if (localIterator.hasNext())
      {
        localObject2 = (cbe)localIterator.next();
        if (p.jZ(((cbe)localObject2).sjO))
        {
          localObject1 = com.tencent.mm.a.q.x(((cbe)localObject2).rwb.lR);
          localObject2 = ((cbe)localObject2).category;
          i = -1;
          switch (((String)localObject2).hashCode())
          {
          }
        }
        for (;;)
        {
          switch (i)
          {
          default: 
            break;
          case 0: 
            localObject2 = (cbb)new cbb().aG((byte[])localObject1);
            x.i("MicroMsg.RemoteDebugMsgMrg", "onCallInterface, method: %s, call_id %d", new Object[] { ((cbb)localObject2).sxl, Integer.valueOf(((cbb)localObject2).sxn) });
            localObject3 = ((cbb)localObject2).sxl;
            localObject4 = ((cbb)localObject2).sxm;
            localObject1 = (cbl)this.ftb.fsM.get(localObject3);
            if (localObject1 != null) {
              break label363;
            }
            x.w("MicroMsg.RemoteDebugMsgMrg", "onCallInterface, methodWithArgs is null");
            break;
            localObject1 = ((cbe)localObject2).rwb.lR;
            break label72;
            if (((String)localObject2).equals("callInterface"))
            {
              i = 0;
              continue;
              if (((String)localObject2).equals("evaluateJavascriptResult"))
              {
                i = 1;
                continue;
                if (((String)localObject2).equals("ping"))
                {
                  i = 2;
                  continue;
                  if (((String)localObject2).equals("breakpoint"))
                  {
                    i = 3;
                    continue;
                    if (((String)localObject2).equals("domOp")) {
                      i = 4;
                    }
                  }
                }
              }
            }
            break;
          }
        }
        localObject5 = ((cbl)localObject1).sxm;
        if (((LinkedList)localObject4).size() < ((LinkedList)localObject5).size())
        {
          x.w("MicroMsg.RemoteDebugMsgMrg", "onCallInterface, methodArgValueList.size() < methodArgList.size()");
        }
        else
        {
          localObject1 = new LinkedList();
          i = 0;
          if (i < ((LinkedList)localObject5).size())
          {
            if ("Number".equals(((LinkedList)localObject5).get(i))) {
              ((LinkedList)localObject1).add(Integer.valueOf((String)((LinkedList)localObject4).get(i)));
            }
            for (;;)
            {
              i += 1;
              break;
              if ("Boolean".equals(((LinkedList)localObject5).get(i))) {
                ((LinkedList)localObject1).add(Boolean.valueOf((String)((LinkedList)localObject4).get(i)));
              } else {
                ((LinkedList)localObject1).add(((LinkedList)localObject4).get(i));
              }
            }
          }
          l = System.currentTimeMillis();
          localObject5 = (Method)this.ftb.fsL.get(localObject3);
          if (localObject5 != null) {
            if (((LinkedList)localObject1).size() == 0) {
              localObject1 = ((Method)localObject5).invoke(this.fdP, new Object[0]);
            }
          }
        }
      }
    }
    for (;;)
    {
      label555:
      localObject1 = String.valueOf(localObject1);
      if (!bi.oW((String)localObject1)) {
        D(((cbb)localObject2).sxn, (String)localObject1);
      }
      int j = ((cbb)localObject2).boi();
      if (localObject1 == null) {}
      for (i = 0;; i = ((String)localObject1).length())
      {
        m.a((String)localObject3, (LinkedList)localObject4, l, j, i);
        break;
        if (((LinkedList)localObject1).size() == 1)
        {
          localObject1 = ((Method)localObject5).invoke(this.fdP, new Object[] { ((LinkedList)localObject1).get(0) });
          break label555;
        }
        if (((LinkedList)localObject1).size() == 2)
        {
          localObject1 = ((Method)localObject5).invoke(this.fdP, new Object[] { ((LinkedList)localObject1).get(0), ((LinkedList)localObject1).get(1) });
          break label555;
        }
        if (((LinkedList)localObject1).size() == 3)
        {
          localObject1 = ((Method)localObject5).invoke(this.fdP, new Object[] { ((LinkedList)localObject1).get(0), ((LinkedList)localObject1).get(1), ((LinkedList)localObject1).get(2) });
          break label555;
        }
        if (((LinkedList)localObject1).size() == 4)
        {
          localObject1 = ((Method)localObject5).invoke(this.fdP, new Object[] { ((LinkedList)localObject1).get(0), ((LinkedList)localObject1).get(1), ((LinkedList)localObject1).get(2), ((LinkedList)localObject1).get(3) });
          break label555;
        }
        if (((LinkedList)localObject1).size() != 5) {
          break label1380;
        }
        localObject1 = ((Method)localObject5).invoke(this.fdP, new Object[] { ((LinkedList)localObject1).get(0), ((LinkedList)localObject1).get(1), ((LinkedList)localObject1).get(2), ((LinkedList)localObject1).get(3), ((LinkedList)localObject1).get(4) });
        break label555;
        x.w("MicroMsg.RemoteDebugMsgMrg", "onCallInterface callMethod is null");
        break;
      }
      localObject1 = (cbj)new cbj().aG((byte[])localObject1);
      x.i("MicroMsg.RemoteDebugMsgMrg", "onEvaluateCallback %d", new Object[] { Integer.valueOf(((cbj)localObject1).sxA) });
      i = ((cbj)localObject1).sxA;
      localObject2 = ((cbj)localObject1).bPu;
      localObject3 = (a)this.ftb.fsR.remove(Integer.valueOf(i));
      if (localObject3 == null) {
        break;
      }
      localObject4 = ((a)localObject3).fsu;
      if (localObject4 != null) {
        ((ValueCallback)localObject4).onReceiveValue(localObject2);
      }
      x.d("MicroMsg.RemoteDebugMsgMrg", "onEvaluateCallback, callback id: " + i + " ret: " + (String)localObject2);
      m.a((a)localObject3, ((cbj)localObject1).boi());
      break;
      localObject1 = (cbn)new cbn().aG((byte[])localObject1);
      localObject2 = new cbo();
      ((cbo)localObject2).sxD = ((cbn)localObject1).sxD;
      ((cbo)localObject2).sxE = m.aeH();
      x.i("MicroMsg.RemoteDebugMsgMrg", "onPing netType %d", new Object[] { Integer.valueOf(((cbo)localObject2).sxE) });
      a(p.a((com.tencent.mm.bk.a)localObject2, this.ftb, "pong"));
      break;
      localObject1 = (cba)new cba().aG((byte[])localObject1);
      if (this.ftb.aex() == ((cba)localObject1).sxj) {
        break;
      }
      if (((cba)localObject1).sxj) {
        this.ftb.cA(true);
      }
      for (;;)
      {
        this.ftg.aeJ();
        this.ftg.aeM();
        break;
        this.ftb.cA(false);
      }
      localObject1 = (cbh)new cbh().aG((byte[])localObject1);
      x.d("MicroMsg.RemoteDebugMsgMrg", "onDomOp");
      i = this.ftb.fsw.fdO.fcz.getCurrentPage().getCurrentPageView().hashCode();
      if (((cbh)localObject1).sxz != i)
      {
        x.w("MicroMsg.RemoteDebugMsgMrg", "onDomOp id not current webViewId %d/%d", new Object[] { Integer.valueOf(((cbh)localObject1).sxz), Integer.valueOf(i) });
        break;
      }
      this.ftb.fsw.a("remoteDebugCommand", ((cbh)localObject1).sxy, null);
      break;
      x.i("MicroMsg.RemoteDebugMsgMrg", "handleMsg size %d, ack %d", new Object[] { Integer.valueOf(paramLinkedList.size()), Integer.valueOf(this.ftb.aev()) });
      localObject1 = this.ftb;
      i = paramLinkedList.size();
      ((h)localObject1).fsT += i;
      aeB();
      return;
      label1380:
      localObject1 = null;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/appbrand/debugger/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */