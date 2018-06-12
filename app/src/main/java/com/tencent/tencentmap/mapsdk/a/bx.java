package com.tencent.tencentmap.mapsdk.a;

import com.qq.sim.Millis100TimeProvider;
import java.io.PrintStream;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock;

public class bx<K, V>
{
  ReentrantReadWriteLock a = new ReentrantReadWriteLock();
  final ExecutorService b = Executors.newFixedThreadPool(2, new bv("TimeoutCacheWorker"));
  ca<K, V> c = new ca();
  private ConcurrentHashMap<K, bz<K, V>> d = null;
  private volatile ScheduledExecutorService e;
  
  public bx(int paramInt)
  {
    this.d = new ConcurrentHashMap(paramInt);
    this.e = Executors.newScheduledThreadPool(1, new bv("TimeoutCacheChecker"));
    this.e.scheduleWithFixedDelay(new Runnable()
    {
      public void run()
      {
        long l = Millis100TimeProvider.INSTANCE.currentTimeMillis();
        int i = bx.this.a();
        if (i > 0) {
          ax.a("cleanSize:" + i + " cost:" + (Millis100TimeProvider.INSTANCE.currentTimeMillis() - l));
        }
      }
    }, 500L, 500L, TimeUnit.MILLISECONDS);
  }
  
  private bz<K, V> b(bz<K, V> parambz)
  {
    this.a.writeLock().lock();
    try
    {
      bz localbz = (bz)this.d.put(parambz.a, parambz);
      this.c.b(parambz);
      if (localbz != null) {
        this.c.a(localbz);
      }
      return localbz;
    }
    finally
    {
      this.a.writeLock().unlock();
    }
  }
  
  public int a()
  {
    int j = 0;
    int i = 0;
    for (;;)
    {
      try
      {
        Iterator localIterator = this.d.entrySet().iterator();
        j = i;
        int k = i;
        if (localIterator.hasNext())
        {
          j = i;
          bz localbz = (bz)((Map.Entry)localIterator.next()).getValue();
          j = i;
          long l = Millis100TimeProvider.INSTANCE.currentTimeMillis() - localbz.e;
          j = i;
          if (l >= localbz.f)
          {
            j = i;
            a(localbz);
            j = i;
            this.b.submit(new bx.2(this, localbz, l));
            i += 1;
          }
        }
        else
        {
          return k;
        }
      }
      catch (Exception localException)
      {
        System.err.print("cleanTimeoutItem error" + localException);
        k = j;
      }
    }
  }
  
  V a(bz<K, V> parambz)
  {
    this.a.writeLock().lock();
    try
    {
      if ((bz)this.d.get(parambz.a) == parambz)
      {
        this.d.remove(parambz.a);
        this.c.a(parambz);
        parambz = parambz.b;
        return parambz;
      }
      return null;
    }
    finally
    {
      this.a.writeLock().unlock();
    }
  }
  
  public V a(K paramK, V paramV, by<K, V> paramby, long paramLong)
  {
    paramK = b(new bz(paramK, paramV, paramby, Millis100TimeProvider.INSTANCE.currentTimeMillis(), paramLong));
    if (paramK != null) {
      return (V)paramK.b;
    }
    return null;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/bx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */