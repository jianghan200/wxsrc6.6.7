package com.tencent.mm.sdk.e;

import android.os.Looper;
import com.tencent.mm.sdk.platformtools.ag;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Vector;

public abstract class k<T, E>
{
  public int sKF = 0;
  private final Hashtable<T, Object> sKG = new Hashtable();
  private final HashSet<E> sKH = new HashSet();
  
  private Vector<T> cju()
  {
    try
    {
      Vector localVector = new Vector();
      localVector.addAll(this.sKG.keySet());
      return localVector;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  private void cjv()
  {
    Object localObject1 = cju();
    if (((Vector)localObject1).size() <= 0)
    {
      this.sKH.clear();
      return;
    }
    for (;;)
    {
      final Object localObject4;
      final Object localObject6;
      synchronized (this.sKH)
      {
        ArrayList localArrayList = new ArrayList(this.sKH);
        this.sKH.clear();
        cY(localArrayList);
        HashMap localHashMap = new HashMap();
        Iterator localIterator1 = ((Vector)localObject1).iterator();
        continue;
        if (!localIterator1.hasNext()) {
          break;
        }
        localObject4 = localIterator1.next();
        Object localObject5 = this.sKG.get(localObject4);
        Iterator localIterator2 = localArrayList.iterator();
        if (!localIterator2.hasNext()) {
          continue;
        }
        localObject6 = localIterator2.next();
        if ((localObject6 == null) || (localObject5 == null)) {
          continue;
        }
        if ((localObject5 instanceof Looper))
        {
          Looper localLooper = (Looper)localObject5;
          ??? = (ag)localHashMap.get(localLooper);
          localObject1 = ???;
          if (??? == null)
          {
            localObject1 = new ag(localLooper);
            localHashMap.put(localLooper, localObject1);
          }
          ((ag)localObject1).post(new Runnable()
          {
            public final void run()
            {
              k.this.q(localObject4, localObject6);
            }
          });
        }
      }
      q(localObject4, localObject6);
    }
  }
  
  /* Error */
  public void a(T paramT, Looper paramLooper)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 26	com/tencent/mm/sdk/e/k:sKG	Ljava/util/Hashtable;
    //   6: aload_1
    //   7: invokevirtual 119	java/util/Hashtable:containsKey	(Ljava/lang/Object;)Z
    //   10: ifne +17 -> 27
    //   13: aload_2
    //   14: ifnull +16 -> 30
    //   17: aload_0
    //   18: getfield 26	com/tencent/mm/sdk/e/k:sKG	Ljava/util/Hashtable;
    //   21: aload_1
    //   22: aload_2
    //   23: invokevirtual 120	java/util/Hashtable:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   26: pop
    //   27: aload_0
    //   28: monitorexit
    //   29: return
    //   30: aload_0
    //   31: getfield 26	com/tencent/mm/sdk/e/k:sKG	Ljava/util/Hashtable;
    //   34: aload_1
    //   35: new 5	java/lang/Object
    //   38: dup
    //   39: invokespecial 19	java/lang/Object:<init>	()V
    //   42: invokevirtual 120	java/util/Hashtable:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   45: pop
    //   46: goto -19 -> 27
    //   49: astore_1
    //   50: aload_0
    //   51: monitorexit
    //   52: aload_1
    //   53: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	54	0	this	k
    //   0	54	1	paramT	T
    //   0	54	2	paramLooper	Looper
    // Exception table:
    //   from	to	target	type
    //   2	13	49	finally
    //   17	27	49	finally
    //   30	46	49	finally
  }
  
  public void cY(List<E> paramList) {}
  
  public final boolean ci(E paramE)
  {
    synchronized (this.sKH)
    {
      boolean bool = this.sKH.add(paramE);
      return bool;
    }
  }
  
  public final void doNotify()
  {
    if (!isLocked()) {
      cjv();
    }
  }
  
  public final boolean isLocked()
  {
    return this.sKF > 0;
  }
  
  public final void lock()
  {
    this.sKF += 1;
  }
  
  public abstract void q(T paramT, E paramE);
  
  public final void remove(T paramT)
  {
    try
    {
      this.sKG.remove(paramT);
      return;
    }
    finally
    {
      paramT = finally;
      throw paramT;
    }
  }
  
  public final void removeAll()
  {
    try
    {
      this.sKG.clear();
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final void unlock()
  {
    this.sKF -= 1;
    if (this.sKF <= 0)
    {
      this.sKF = 0;
      cjv();
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/sdk/e/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */