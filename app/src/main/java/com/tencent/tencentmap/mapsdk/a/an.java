package com.tencent.tencentmap.mapsdk.a;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class an
{
  AtomicInteger a = new AtomicInteger();
  AtomicInteger b = new AtomicInteger();
  AtomicInteger c = new AtomicInteger();
  AtomicLong d = new AtomicLong();
  AtomicInteger e = new AtomicInteger();
  AtomicInteger f = new AtomicInteger();
  public ConcurrentHashMap<Integer, AtomicInteger> g = new ConcurrentHashMap();
  ReentrantReadWriteLock h = new ReentrantReadWriteLock();
  CopyOnWriteArrayList<Integer> i = new CopyOnWriteArrayList();
  
  static
  {
    if (!an.class.desiredAssertionStatus()) {}
    for (boolean bool = true;; bool = false)
    {
      j = bool;
      return;
    }
  }
  
  public an(List<Integer> paramList)
  {
    a(paramList);
  }
  
  public void a(long paramLong, int paramInt)
  {
    if (paramInt == 0)
    {
      this.a.incrementAndGet();
      this.d.addAndGet(paramLong);
      if (this.e.get() < paramLong)
      {
        this.e.set((int)paramLong);
        paramInt = 0;
      }
    }
    for (;;)
    {
      if (paramInt < this.i.size())
      {
        if (paramLong <= ((Integer)this.i.get(paramInt)).intValue()) {
          ((AtomicInteger)this.g.get(this.i.get(paramInt))).incrementAndGet();
        }
      }
      else
      {
        return;
        if ((paramLong <= 0L) || (paramLong >= this.f.get())) {
          break;
        }
        this.f.set((int)paramLong);
        break;
        if (paramInt == 1)
        {
          this.b.incrementAndGet();
          break;
        }
        if (paramInt != 2) {
          break;
        }
        this.c.incrementAndGet();
        break;
      }
      paramInt += 1;
    }
  }
  
  public void a(List<Integer> paramList)
  {
    this.i.clear();
    this.i.addAll(paramList);
    paramList = this.i.iterator();
    while (paramList.hasNext())
    {
      Integer localInteger = (Integer)paramList.next();
      if (!this.g.containsKey(localInteger)) {
        this.g.put(localInteger, new AtomicInteger());
      }
    }
  }
  
  public Object clone()
  {
    Object localObject1 = null;
    try
    {
      Object localObject2 = super.clone();
      localObject1 = localObject2;
    }
    catch (CloneNotSupportedException localCloneNotSupportedException)
    {
      while (j) {}
      throw new AssertionError();
    }
    return localObject1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/an.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */