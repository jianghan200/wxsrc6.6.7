package com.tencent.mm.kernel.a.b;

import com.tencent.mm.kernel.j;
import com.tencent.mm.sdk.platformtools.x;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;

public final class g
  implements com.tencent.mm.kernel.a.a.b, c<Object>, d<Object>
{
  public Map<Class<?>, f<Object>> dsG = new ConcurrentHashMap();
  private Class<?>[] dsH;
  public volatile Class<?>[] dsI;
  public Map<Class, Object> dsJ = new ConcurrentHashMap();
  private int dsK = 0;
  private Queue<f.a> dsL = new ConcurrentLinkedQueue();
  public ConcurrentHashMap<Object, a> dsM = new ConcurrentHashMap();
  
  private f.a a(Class paramClass, Object paramObject)
  {
    f localf = s(paramClass);
    f.a locala = (f.a)localf.aK(paramObject);
    x.d("MicroMsg.ParallelsManagement", "makeDependency on IDependency of type %s for %s with %s", new Object[] { paramClass, paramObject, localf });
    Object localObject = locala;
    if (locala == null)
    {
      localObject = this.dsJ.get(paramClass);
      paramClass = (Class)localObject;
      if (localObject == null) {
        paramClass = (Class)paramObject;
      }
      localf.p(paramObject, paramClass);
      localObject = (f.a)localf.aK(paramObject);
    }
    return (f.a)localObject;
  }
  
  public final f.a ED()
  {
    synchronized (this.dsL)
    {
      f.a locala = (f.a)this.dsL.poll();
      return locala;
    }
  }
  
  public final void EQ()
  {
    synchronized (this.dsH)
    {
      if (this.dsH.length <= this.dsK) {
        return;
      }
      prepare();
    }
  }
  
  public final void a(f.a parama)
  {
    x.i("MicroMsg.ParallelsManagement", "ParallelsManagement resolvedOne %s for type %s then next %s", new Object[] { parama, parama.dsC.dsf, parama.dsC.dsP });
    s(parama.dsC.dsf).a(parama);
    if (parama.dsC.dsP != null)
    {
      f localf = s(parama.dsC.dsP);
      f.a locala = (f.a)localf.drY.get(parama);
      if (locala.dsb != ((f.a)parama).dsb) {
        x.e("MMSkeleton.ParallelsDependencies", "not same!!!! %s, %s, %s, %s", new Object[] { locala, locala.dsb, parama, localf.drY.get(parama) });
      }
      if ((localf.dsw) && (locala.EM())) {
        localf.dsu.b(locala);
      }
    }
  }
  
  public final void a(Class paramClass, Object paramObject1, Object paramObject2)
  {
    if (this.dsI != null)
    {
      Class[] arrayOfClass = this.dsI;
      int j = arrayOfClass.length;
      i = 0;
      while (i < j)
      {
        if (arrayOfClass[i] == paramClass) {
          break label71;
        }
        i += 1;
      }
    }
    label71:
    for (int i = 0; i != 0; i = 1)
    {
      paramClass = s(paramClass);
      if (paramClass != null) {
        paramClass.p(paramObject1, paramObject2);
      }
      return;
    }
    j.w("MicroMsg.ParallelsManagement", "Not allow phase(%s) has dependency", new Object[] { paramClass });
  }
  
  public final void a(Class... paramVarArgs)
  {
    int i = 0;
    this.dsH = new Class[paramVarArgs.length];
    System.arraycopy(paramVarArgs, 0, this.dsH, 0, paramVarArgs.length);
    while (i < this.dsH.length)
    {
      this.dsG.put(this.dsH[i], new f(this.dsH[i], this, this));
      i += 1;
    }
  }
  
  public final void aP(Object arg1)
  {
    int j = 0;
    if (!this.dsM.containsKey(???)) {
      this.dsM.putIfAbsent(???, new a((byte)0));
    }
    a locala = (a)this.dsM.get(???);
    for (;;)
    {
      int i;
      synchronized (locala.dsN)
      {
        if (locala.dsN[0] == 2)
        {
          if (locala.ER()) {
            j.i("MicroMsg.ParallelsManagement", "%s Has done. return.", new Object[] { ??? });
          }
        }
        else
        {
          i = locala.dsN[0];
          if (i != 1) {}
        }
      }
      try
      {
        locala.dsN.wait();
        for (;;)
        {
          break;
          ??? = finally;
          throw ((Throwable)???);
          locala.dsN[0] = 1;
        }
        j.d("MicroMsg.ParallelsManagement", "Make dependency on subject(%s), hashcode(%s)", new Object[] { ???, Integer.valueOf(???.hashCode()) });
        if ((??? instanceof b))
        {
          a.start();
          ((b)???).parallelsDependency();
          ??? = a.EC();
          if (((a.b)???).dsh != null)
          {
            ??? = ((a.b)???).dsh.values().iterator();
            while (((Iterator)???).hasNext())
            {
              localObject3 = (a.a)((Iterator)???).next();
              localObject4 = ((a.a)localObject3).dsg.iterator();
              while (((Iterator)localObject4).hasNext())
              {
                localObject5 = ((Iterator)localObject4).next();
                if (s(((a.a)localObject3).dsf).aK(localObject5) == null)
                {
                  j.i("MicroMsg.ParallelsManagement", "Traversal make dependency for %s by subject(%s)", new Object[] { localObject5, ??? });
                  aP(localObject5);
                }
                a(((a.a)localObject3).dsf, ???, localObject5);
              }
            }
          }
        }
        ??? = new ArrayList();
        Object localObject3 = this.dsH;
        int k = localObject3.length;
        i = 0;
        while (i < k)
        {
          localObject4 = localObject3[i];
          if (((Class)localObject4).isInstance(???)) {
            ((ArrayList)???).add(localObject4);
          }
          i += 1;
        }
        Object localObject5 = (Class[])((ArrayList)???).toArray(new Class[0]);
        ??? = null;
        Object localObject4 = null;
        i = j;
        if (i < localObject5.length)
        {
          Class localClass = localObject5[i];
          if (i < localObject5.length - 1)
          {
            localObject3 = localObject5[(i + 1)];
            label429:
            if (??? == null) {
              break label525;
            }
            label434:
            if (localObject3 == null) {
              break label537;
            }
          }
          label525:
          label537:
          for (localObject3 = a((Class)localObject3, ???);; localObject3 = null)
          {
            ((f.a)???).dsA = ((f.a)localObject4);
            ((f.a)???).dsB = ((f.a)localObject3);
            if (localObject4 != null) {
              ((f.a)???).dsC.dsO = ((f.a)localObject4).dsC.dsf;
            }
            if (localObject3 != null) {
              ((f.a)???).dsC.dsP = ((f.a)localObject3).dsC.dsf;
            }
            i += 1;
            localObject4 = ???;
            ??? = localObject3;
            break;
            localObject3 = null;
            break label429;
            ??? = a(localClass, ???);
            break label434;
          }
        }
        synchronized (locala.dsN)
        {
          if (locala.dsN[0] == 1)
          {
            locala.dsN[0] = 2;
            locala.dsN.notifyAll();
          }
          return;
        }
      }
      catch (InterruptedException localInterruptedException)
      {
        for (;;) {}
      }
    }
  }
  
  public final void b(f.a<Object> parama)
  {
    synchronized (this.dsL)
    {
      this.dsL.offer(parama);
      x.d("MicroMsg.ParallelsManagement", "ParallelsManagement provideOne %s %s", new Object[] { parama, parama.dsC.dsf });
      return;
    }
  }
  
  public final void b(Class paramClass, boolean paramBoolean)
  {
    int i = 0;
    label21:
    int j;
    if (i < this.dsH.length) {
      if (this.dsH[i] == paramClass)
      {
        j = Math.min(i, this.dsH.length - 1);
        if ((j < 0) || (this.dsK <= j)) {
          return;
        }
        i = j;
      }
    }
    for (;;)
    {
      if (i >= this.dsK) {
        break label161;
      }
      Iterator localIterator = s(this.dsH[i]).drY.values().iterator();
      for (;;)
      {
        if (!localIterator.hasNext()) {
          break label154;
        }
        paramClass = (f.a)localIterator.next();
        if (paramBoolean) {
          paramClass.dsc = false;
        }
        try
        {
          paramClass.dsx = paramClass.Ey();
          paramClass.dsz = false;
        }
        finally {}
      }
      i += 1;
      break;
      i = -1;
      break label21;
      label154:
      i += 1;
    }
    label161:
    this.dsK = j;
  }
  
  public final void prepare()
  {
    j.i("MicroMsg.ParallelsManagement", "prepare()", new Object[0]);
    for (;;)
    {
      synchronized (this.dsH)
      {
        if (this.dsH.length > this.dsK)
        {
          i = this.dsK;
          this.dsK += 1;
          if (i != -1) {
            s(this.dsH[i]).prepare();
          }
          return;
        }
      }
      int i = -1;
    }
  }
  
  public final <T> f<T> s(Class<T> paramClass)
  {
    return (f)this.dsG.get(paramClass);
  }
  
  private static final class a
  {
    byte[] dsN = new byte[1];
    
    public final boolean ER()
    {
      boolean bool = false;
      synchronized (this.dsN)
      {
        if (this.dsN[0] == 2) {
          bool = true;
        }
        return bool;
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/kernel/a/b/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */