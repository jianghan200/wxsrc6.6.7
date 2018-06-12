package com.tencent.mm.plugin.appbrand.collector;

import android.os.Bundle;
import com.tencent.mm.sdk.platformtools.x;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

public final class h
  implements b
{
  private Map<String, CollectSession> dmW = new a();
  private Map<String, Set<CollectSession>> foi = new a();
  
  private boolean a(String paramString, CollectSession paramCollectSession)
  {
    if ((paramString == null) || (paramString.length() == 0) || (paramCollectSession == null)) {
      return false;
    }
    Set localSet = (Set)this.foi.get(paramString);
    Object localObject = localSet;
    if (localSet == null)
    {
      localObject = new LinkedHashSet();
      this.foi.put(paramString, localObject);
    }
    return ((Set)localObject).add(paramCollectSession);
  }
  
  private Set<CollectSession> rD(String paramString)
  {
    if ((paramString == null) || (paramString.length() == 0)) {
      return null;
    }
    return (Set)this.foi.get(paramString);
  }
  
  private CollectSession rE(String paramString)
  {
    CollectSession localCollectSession2 = (CollectSession)this.dmW.get(paramString);
    CollectSession localCollectSession1 = localCollectSession2;
    if (localCollectSession2 == null)
    {
      localCollectSession1 = new CollectSession(paramString);
      this.dmW.put(paramString, localCollectSession1);
    }
    return localCollectSession1;
  }
  
  public final void a(CollectSession paramCollectSession)
  {
    String str = paramCollectSession.id;
    CollectSession localCollectSession = (CollectSession)this.dmW.get(str);
    if (localCollectSession == null)
    {
      this.dmW.put(str, paramCollectSession);
      a(paramCollectSession.groupId, paramCollectSession);
      return;
    }
    Object localObject = paramCollectSession.fnY;
    paramCollectSession = (CollectSession)localObject;
    if (localCollectSession.fnY == null)
    {
      localCollectSession.fnY = ((TimePoint)localObject);
      return;
    }
    label76:
    long l;
    if (paramCollectSession != null)
    {
      localObject = paramCollectSession.name;
      l = paramCollectSession.fok.get();
      if ((str != null) && (str.length() != 0)) {
        break label121;
      }
    }
    for (;;)
    {
      paramCollectSession = (TimePoint)paramCollectSession.fol.get();
      break label76;
      break;
      label121:
      localCollectSession = rE(str);
      if (localCollectSession.fnY == null)
      {
        localCollectSession.rt((String)localObject);
        localCollectSession.fnY.fok.set(l);
      }
      else
      {
        TimePoint localTimePoint = (TimePoint)localCollectSession.foa.get(localObject);
        if (localTimePoint == null)
        {
          localCollectSession.ru((String)localObject);
          localCollectSession.fnZ.fok.set(l);
        }
        else
        {
          localTimePoint.fok.set((l + localTimePoint.fok.get() * localTimePoint.foj.get()) / (localTimePoint.foj.get() + 1));
          localTimePoint.foj.getAndIncrement();
        }
      }
    }
  }
  
  public final CollectSession aZ(String paramString1, String paramString2)
  {
    if ((paramString1 == null) || (paramString1.length() == 0))
    {
      x.i("MicroMsg.SumCostTimeCollector", "join(%s) failed, sessionId is null or nil.", new Object[] { paramString2 });
      return null;
    }
    paramString1 = rE(paramString1);
    if (paramString1.fnY == null)
    {
      paramString1.rt(paramString2);
      return paramString1;
    }
    paramString1.ru(paramString2);
    return paramString1;
  }
  
  public final void ba(String paramString1, String paramString2)
  {
    if ((paramString1 == null) || (paramString1.length() == 0) || (paramString2 == null) || (paramString2.length() == 0))
    {
      x.i("MicroMsg.SumCostTimeCollector", "setLastPointName(%s, %s) failed, sessionId is null or nil.", new Object[] { paramString1, paramString2 });
      return;
    }
    CollectSession localCollectSession = (CollectSession)this.dmW.get(paramString1);
    if (localCollectSession == null)
    {
      x.i("MicroMsg.SumCostTimeCollector", "setLastPointName(%s, %s) failed,", new Object[] { paramString1, paramString2 });
      return;
    }
    localCollectSession.fob = paramString2;
  }
  
  public final int bb(String paramString1, String paramString2)
  {
    Set localSet = rD(paramString1);
    if ((localSet == null) || (localSet.isEmpty())) {
      x.i("MicroMsg.SumCostTimeCollector", "printAverage failed, set(%s) is empty.", new Object[] { paramString1 });
    }
    int i;
    int j;
    do
    {
      return 0;
      paramString1 = new LinkedHashSet(localSet).iterator();
      i = 0;
      j = 0;
      while (paramString1.hasNext())
      {
        int k = ((CollectSession)paramString1.next()).bQf.getInt(paramString2);
        if (k != 0)
        {
          j += k;
          i += 1;
        }
      }
    } while (i == 0);
    return j / i;
  }
  
  public final void c(String paramString1, String paramString2, String paramString3, boolean paramBoolean)
  {
    if (!paramBoolean) {
      return;
    }
    if ((paramString2 == null) || (paramString2.length() == 0))
    {
      x.i("MicroMsg.SumCostTimeCollector", "tryToJoin(%s) failed, sessionId is null or nil.", new Object[] { paramString3 });
      return;
    }
    if ((paramString1 == null) || (paramString1.length() == 0))
    {
      x.i("MicroMsg.SumCostTimeCollector", "tryToJoin(%s) failed, groupId is null or nil.", new Object[] { paramString3 });
      return;
    }
    paramString2 = rE(paramString2);
    if (paramString2.fnY == null)
    {
      paramString2.groupId = paramString1;
      a(paramString1, paramString2);
      paramString2.rt(paramString3);
      return;
    }
    paramString2.ru(paramString3);
  }
  
  public final void c(String paramString1, String paramString2, boolean paramBoolean)
  {
    if (!paramBoolean) {
      return;
    }
    if ((paramString1 == null) || (paramString1.length() == 0))
    {
      x.i("MicroMsg.SumCostTimeCollector", "tryToJoin(%s) failed, sessionId is null or nil.", new Object[] { paramString2 });
      return;
    }
    paramString1 = rE(paramString1);
    if (paramString1.fnY == null)
    {
      paramString1.rt(paramString2);
      return;
    }
    paramString1.ru(paramString2);
  }
  
  public final void clear()
  {
    this.dmW.clear();
    this.foi.clear();
  }
  
  public final void print(String paramString)
  {
    CollectSession localCollectSession = (CollectSession)this.dmW.get(paramString);
    if (localCollectSession == null)
    {
      x.i("MicroMsg.SumCostTimeCollector", "print failed, session(%s) is null", new Object[] { paramString });
      return;
    }
    TimePoint localTimePoint = localCollectSession.fnY;
    if (localTimePoint == null)
    {
      x.i("MicroMsg.SumCostTimeCollector", "print failed, the session(%s) do not have any point.", new Object[] { paramString });
      return;
    }
    paramString = e.a(localTimePoint);
    paramString.insert(0, String.format("session : %s\n", new Object[] { localCollectSession.id }));
    x.i("MicroMsg.SumCostTimeCollector", "%s", new Object[] { paramString.toString() });
  }
  
  public final CollectSession rv(String paramString)
  {
    if ((paramString == null) || (paramString.length() == 0)) {
      return null;
    }
    return (CollectSession)this.dmW.get(paramString);
  }
  
  public final CollectSession rw(String paramString)
  {
    if ((paramString == null) || (paramString.length() == 0)) {
      return null;
    }
    return (CollectSession)this.dmW.remove(paramString);
  }
  
  public final StringBuilder rx(String paramString)
  {
    Object localObject = rD(paramString);
    if ((localObject == null) || (((Set)localObject).isEmpty()))
    {
      x.i("MicroMsg.SumCostTimeCollector", "printAverage failed, set(%s) is empty.", new Object[] { paramString });
      return new StringBuilder().append(String.format("GroupId : %s, size : 0\n", new Object[] { paramString }));
    }
    LinkedHashSet localLinkedHashSet = new LinkedHashSet((Collection)localObject);
    TimePoint localTimePoint2 = new TimePoint();
    Iterator localIterator = localLinkedHashSet.iterator();
    while (localIterator.hasNext())
    {
      localObject = (CollectSession)localIterator.next();
      if ((((CollectSession)localObject).fnZ == null) || ((((CollectSession)localObject).fob != null) && (!((CollectSession)localObject).fnZ.name.equals(((CollectSession)localObject).fob))))
      {
        x.e("MicroMsg.SumCostTimeCollector", "error(%s), incorrect point count", new Object[] { ((CollectSession)localObject).id });
      }
      else
      {
        TimePoint localTimePoint1 = ((CollectSession)localObject).fnY;
        for (localObject = localTimePoint2; localTimePoint1 != null; localObject = (TimePoint)((TimePoint)localObject).fol.get())
        {
          ((TimePoint)localObject).fok.set((((TimePoint)localObject).fok.get() * ((TimePoint)localObject).foj.get() + localTimePoint1.fok.get()) / ((TimePoint)localObject).foj.incrementAndGet());
          ((TimePoint)localObject).name = localTimePoint1.name;
          localTimePoint1 = (TimePoint)localTimePoint1.fol.get();
          if ((((TimePoint)localObject).fol.get() == null) && (localTimePoint1 != null)) {
            ((TimePoint)localObject).fol.set(new TimePoint());
          }
        }
      }
    }
    localObject = e.a(localTimePoint2);
    ((StringBuilder)localObject).insert(0, String.format("GroupId : %s, size : %d\n", new Object[] { paramString, Integer.valueOf(localLinkedHashSet.size()) }));
    return (StringBuilder)localObject;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/collector/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */