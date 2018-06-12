package com.tencent.b.a.a;

import android.content.Context;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class r
{
  private static r bvR = null;
  private Map<Integer, q> bvP = null;
  private int bvQ = 0;
  
  private r(Context paramContext)
  {
    this.bvP.put(Integer.valueOf(1), new o(paramContext));
    this.bvP.put(Integer.valueOf(2), new d(paramContext));
    this.bvP.put(Integer.valueOf(4), new k(paramContext));
  }
  
  private a A(List<Integer> paramList)
  {
    if (paramList.size() > 0) {
      paramList = paramList.iterator();
    }
    Object localObject;
    do
    {
      do
      {
        if (!paramList.hasNext()) {
          return new a();
        }
        localObject = (Integer)paramList.next();
        localObject = (q)this.bvP.get(localObject);
      } while (localObject == null);
      localObject = ((q)localObject).tU();
    } while (localObject == null);
    return (a)localObject;
  }
  
  static r aH(Context paramContext)
  {
    try
    {
      if (bvR == null) {
        bvR = new r(paramContext);
      }
      paramContext = bvR;
      return paramContext;
    }
    finally {}
  }
  
  final void b(a parama)
  {
    Iterator localIterator = this.bvP.entrySet().iterator();
    for (;;)
    {
      if (!localIterator.hasNext()) {
        return;
      }
      ((q)((Map.Entry)localIterator.next()).getValue()).b(parama);
    }
  }
  
  final void b(g paramg)
  {
    Iterator localIterator = this.bvP.entrySet().iterator();
    for (;;)
    {
      if (!localIterator.hasNext()) {
        return;
      }
      ((q)((Map.Entry)localIterator.next()).getValue()).b(paramg);
    }
  }
  
  final g tT()
  {
    return z(new ArrayList(Arrays.asList(new Integer[] { Integer.valueOf(1), Integer.valueOf(2), Integer.valueOf(4) })));
  }
  
  final a tU()
  {
    return A(new ArrayList(Arrays.asList(new Integer[] { Integer.valueOf(1), Integer.valueOf(4) })));
  }
  
  final g z(List<Integer> paramList)
  {
    if (paramList.size() >= 0) {
      paramList = paramList.iterator();
    }
    Object localObject;
    do
    {
      do
      {
        if (!paramList.hasNext()) {
          return new g();
        }
        localObject = (Integer)paramList.next();
        localObject = (q)this.bvP.get(localObject);
      } while (localObject == null);
      localObject = ((q)localObject).tT();
    } while ((localObject == null) || (!s.cj(((g)localObject).bvx)));
    return (g)localObject;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/b/a/a/r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */