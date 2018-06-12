package com.tencent.tencentmap.mapsdk.a;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CopyOnWriteArrayList;

public class ak
{
  private static ak e = new ak();
  private aj a = new aj();
  private ConcurrentHashMap<aq, aj> b = new ConcurrentHashMap();
  private ConcurrentHashMap<aq, ConcurrentLinkedQueue<li>> c = new ConcurrentHashMap();
  private CopyOnWriteArrayList<Integer> d = new CopyOnWriteArrayList();
  
  private ak()
  {
    this.d.addAll(aj.a);
  }
  
  public static ak a()
  {
    return e;
  }
  
  public aj a(aq paramaq)
  {
    aj localaj2 = (aj)this.b.get(paramaq);
    aj localaj1 = localaj2;
    if (localaj2 == null)
    {
      localaj1 = new aj();
      this.b.putIfAbsent(paramaq, localaj1);
    }
    return localaj1;
  }
  
  public void a(aq paramaq, String paramString1, String paramString2, am paramam)
  {
    if (paramam.a(8))
    {
      paramam = paramam.m;
      if (paramam != null)
      {
        paramam.f = paramString1;
        paramam.b = paramString2;
        this.c.putIfAbsent(paramaq, new ConcurrentLinkedQueue());
        if (((ConcurrentLinkedQueue)this.c.get(paramaq)).size() <= 1000) {
          break label98;
        }
        ax.b("can not add sample for" + paramaq.taf_proxyName() + ", queue size>1000");
      }
    }
    return;
    label98:
    ((ConcurrentLinkedQueue)this.c.get(paramaq)).add(paramam);
  }
  
  public aj b(aq paramaq)
  {
    aj localaj2 = (aj)this.b.get(paramaq);
    aj localaj1 = localaj2;
    if (localaj2 == null) {
      localaj1 = a(paramaq);
    }
    return localaj1;
  }
  
  public void c(aq paramaq)
  {
    paramaq = b(paramaq).a().entrySet().iterator();
    while (paramaq.hasNext()) {
      ((an)((Map.Entry)paramaq.next()).getValue()).a(this.d);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/ak.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */