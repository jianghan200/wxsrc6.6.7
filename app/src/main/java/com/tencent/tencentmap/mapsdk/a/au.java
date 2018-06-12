package com.tencent.tencentmap.mapsdk.a;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock;
import java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock;

public class au
  implements mk
{
  Map<Integer, List<bb>> a = new HashMap();
  Map<Integer, List<bb>> b = new HashMap();
  List<bb> c = new ArrayList();
  List<bb> d = new ArrayList();
  List<bb> e = new ArrayList();
  List<bb> f = new ArrayList();
  ReentrantReadWriteLock g = new ReentrantReadWriteLock();
  ReentrantReadWriteLock.ReadLock h = this.g.readLock();
  ReentrantReadWriteLock.WriteLock i = this.g.writeLock();
  String j;
  private HashSet<String> k = new HashSet();
  
  public au(String paramString)
  {
    this.j = paramString;
  }
  
  private ArrayList<bb> a(ArrayList<fl> paramArrayList, boolean paramBoolean)
  {
    ArrayList localArrayList = new ArrayList(paramArrayList.size());
    int m = 0;
    while (m < paramArrayList.size())
    {
      bb localbb = new bb(this.j, (fl)paramArrayList.get(m));
      localbb.b(paramBoolean);
      localArrayList.add(localbb);
      m += 1;
    }
    Collections.sort(localArrayList);
    return localArrayList;
  }
  
  public bb a(int paramInt1, int paramInt2)
  {
    try
    {
      this.h.lock();
      Object localObject1 = (List)this.b.get(Integer.valueOf(paramInt1));
      if (localObject1 != null)
      {
        paramInt1 = ((List)localObject1).size();
        if (paramInt1 != 0) {}
      }
      else
      {
        return null;
      }
      localObject1 = (bb)((List)localObject1).get(Math.abs(paramInt2) % ((List)localObject1).size());
      return (bb)localObject1;
    }
    finally
    {
      this.h.unlock();
    }
  }
  
  public List<bb> a()
  {
    try
    {
      this.h.lock();
      List localList = this.d;
      return localList;
    }
    finally
    {
      this.h.unlock();
    }
  }
  
  public void a(bf parambf)
  {
    try
    {
      this.i.lock();
      Iterator localIterator = this.f.iterator();
      while (localIterator.hasNext())
      {
        bb localbb = (bb)localIterator.next();
        if (localbb.equals(parambf.d()))
        {
          localbb.a(true);
          this.d.remove(localbb);
          this.k.remove(localbb.a());
          if (!this.e.contains(localbb)) {
            this.e.add(localbb);
          }
          if (this.b.get(Integer.valueOf(localbb.e())) != null) {
            ((List)this.b.get(Integer.valueOf(localbb.e()))).remove(localbb);
          }
        }
      }
    }
    finally
    {
      this.i.unlock();
    }
    ax.c(this.j + " " + parambf.d() + " setServiceFail activeServices:" + this.d + " inactiveServices:" + this.e);
  }
  
  public void a(ArrayList<fl> paramArrayList1, ArrayList<fl> paramArrayList2)
  {
    b(a(paramArrayList1, true), a(paramArrayList2, false));
  }
  
  /* Error */
  public boolean a(int paramInt)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 66	com/tencent/tencentmap/mapsdk/a/au:h	Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;
    //   4: invokevirtual 115	java/util/concurrent/locks/ReentrantReadWriteLock$ReadLock:lock	()V
    //   7: aload_0
    //   8: getfield 37	com/tencent/tencentmap/mapsdk/a/au:a	Ljava/util/Map;
    //   11: iload_1
    //   12: invokestatic 121	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   15: invokeinterface 126 2 0
    //   20: checkcast 128	java/util/List
    //   23: astore_3
    //   24: aload_3
    //   25: ifnull +25 -> 50
    //   28: aload_3
    //   29: invokeinterface 216 1 0
    //   34: istore_2
    //   35: iload_2
    //   36: ifne +14 -> 50
    //   39: iconst_1
    //   40: istore_2
    //   41: aload_0
    //   42: getfield 66	com/tencent/tencentmap/mapsdk/a/au:h	Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;
    //   45: invokevirtual 132	java/util/concurrent/locks/ReentrantReadWriteLock$ReadLock:unlock	()V
    //   48: iload_2
    //   49: ireturn
    //   50: iconst_0
    //   51: istore_2
    //   52: goto -11 -> 41
    //   55: astore_3
    //   56: aload_0
    //   57: getfield 66	com/tencent/tencentmap/mapsdk/a/au:h	Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;
    //   60: invokevirtual 132	java/util/concurrent/locks/ReentrantReadWriteLock$ReadLock:unlock	()V
    //   63: aload_3
    //   64: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	65	0	this	au
    //   0	65	1	paramInt	int
    //   34	18	2	bool	boolean
    //   23	6	3	localList	List
    //   55	9	3	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   0	24	55	finally
    //   28	35	55	finally
  }
  
  public List<bb> b()
  {
    try
    {
      this.h.lock();
      List localList = this.e;
      return localList;
    }
    finally
    {
      this.h.unlock();
    }
  }
  
  public void b(bf parambf)
  {
    try
    {
      this.i.lock();
      Iterator localIterator = this.f.iterator();
      while (localIterator.hasNext())
      {
        bb localbb = (bb)localIterator.next();
        if (localbb.equals(parambf.d()))
        {
          localbb.a(false);
          if (!this.d.contains(localbb))
          {
            this.d.add(localbb);
            this.k.add(localbb.a());
          }
          if (this.b.get(Integer.valueOf(localbb.e())) == null) {
            this.b.put(Integer.valueOf(localbb.e()), new ArrayList());
          }
          if (!((List)this.b.get(Integer.valueOf(localbb.e()))).contains(localbb)) {
            ((List)this.b.get(Integer.valueOf(localbb.e()))).add(localbb);
          }
          this.e.remove(localbb);
        }
      }
    }
    finally
    {
      this.i.unlock();
    }
    ax.c(this.j + " " + parambf.d() + " setServiceActive activeServices:" + this.d + " inactiveServices:" + this.e);
  }
  
  void b(ArrayList<bb> paramArrayList1, ArrayList<bb> paramArrayList2)
  {
    Object localObject = new HashMap();
    HashMap localHashMap = new HashMap();
    ArrayList localArrayList1 = new ArrayList();
    HashSet localHashSet = new HashSet();
    ArrayList localArrayList2 = new ArrayList();
    ArrayList localArrayList3 = new ArrayList();
    ArrayList localArrayList4 = new ArrayList();
    paramArrayList1 = paramArrayList1.iterator();
    while (paramArrayList1.hasNext())
    {
      bb localbb = (bb)paramArrayList1.next();
      if (!((Map)localObject).containsKey(Integer.valueOf(localbb.e()))) {
        ((Map)localObject).put(Integer.valueOf(localbb.e()), new ArrayList());
      }
      if (!localHashMap.containsKey(Integer.valueOf(localbb.e()))) {
        localHashMap.put(Integer.valueOf(localbb.e()), new ArrayList());
      }
      ((List)((Map)localObject).get(Integer.valueOf(localbb.e()))).add(localbb);
      ((List)localHashMap.get(Integer.valueOf(localbb.e()))).add(localbb);
      localArrayList1.add(localbb);
      localHashSet.add(localbb.a());
      localArrayList3.add(localbb);
      localArrayList4.add(localbb);
    }
    paramArrayList1 = paramArrayList2.iterator();
    while (paramArrayList1.hasNext())
    {
      paramArrayList2 = (bb)paramArrayList1.next();
      if (!((Map)localObject).containsKey(Integer.valueOf(paramArrayList2.e()))) {
        ((Map)localObject).put(Integer.valueOf(paramArrayList2.e()), new ArrayList());
      }
      ((List)((Map)localObject).get(Integer.valueOf(paramArrayList2.e()))).add(paramArrayList2);
      localArrayList2.add(paramArrayList2);
      localArrayList3.add(paramArrayList2);
    }
    try
    {
      this.i.lock();
      this.c = localArrayList4;
      this.a = ((Map)localObject);
      this.b = localHashMap;
      this.d = localArrayList1;
      this.k = localHashSet;
      this.e = localArrayList2;
      this.f = localArrayList3;
      this.i.unlock();
      paramArrayList1 = new StringBuffer();
      paramArrayList1.append(this.j + " setServices gridServices:" + this.a + " gridActiveServices:" + this.b);
      paramArrayList1.append(" allServices: ");
      paramArrayList2 = this.f.iterator();
      if (paramArrayList2.hasNext())
      {
        localObject = (bb)paramArrayList2.next();
        paramArrayList1.append(localObject + ";");
      }
      return;
    }
    finally
    {
      this.i.unlock();
    }
  }
  
  public List<bb> c()
  {
    try
    {
      this.h.lock();
      List localList = this.f;
      return localList;
    }
    finally
    {
      this.h.unlock();
    }
  }
  
  public boolean c(bf parambf)
  {
    return this.k.contains(parambf.e());
  }
  
  /* Error */
  public boolean d()
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore_2
    //   2: aload_0
    //   3: getfield 66	com/tencent/tencentmap/mapsdk/a/au:h	Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;
    //   6: invokevirtual 115	java/util/concurrent/locks/ReentrantReadWriteLock$ReadLock:lock	()V
    //   9: aload_0
    //   10: getfield 37	com/tencent/tencentmap/mapsdk/a/au:a	Ljava/util/Map;
    //   13: invokeinterface 248 1 0
    //   18: istore_1
    //   19: iload_1
    //   20: iconst_1
    //   21: if_icmpne +12 -> 33
    //   24: aload_0
    //   25: getfield 66	com/tencent/tencentmap/mapsdk/a/au:h	Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;
    //   28: invokevirtual 132	java/util/concurrent/locks/ReentrantReadWriteLock$ReadLock:unlock	()V
    //   31: iload_2
    //   32: ireturn
    //   33: iconst_0
    //   34: istore_2
    //   35: goto -11 -> 24
    //   38: astore_3
    //   39: aload_0
    //   40: getfield 66	com/tencent/tencentmap/mapsdk/a/au:h	Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;
    //   43: invokevirtual 132	java/util/concurrent/locks/ReentrantReadWriteLock$ReadLock:unlock	()V
    //   46: aload_3
    //   47: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	48	0	this	au
    //   18	4	1	m	int
    //   1	34	2	bool	boolean
    //   38	9	3	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	19	38	finally
  }
  
  public String e()
  {
    return this.j;
  }
  
  public List<bb> f()
  {
    return this.c;
  }
  
  public String toString()
  {
    StringBuffer localStringBuffer = new StringBuffer();
    localStringBuffer.append(this.j);
    Iterator localIterator = this.f.iterator();
    while (localIterator.hasNext())
    {
      bb localbb = (bb)localIterator.next();
      localStringBuffer.append(";" + localbb.d());
    }
    return localStringBuffer.toString();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/au.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */