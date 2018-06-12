package com.tencent.mm.kernel;

import com.tencent.mm.kernel.b.g;
import com.tencent.mm.kernel.c.d.a;
import com.tencent.mm.sdk.platformtools.x;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import junit.framework.Assert;

public final class c
{
  private final ConcurrentHashMap<Class<? extends com.tencent.mm.kernel.b.a>, com.tencent.mm.kernel.b.f> dpZ = new ConcurrentHashMap();
  private final ArrayList<com.tencent.mm.kernel.b.f> dqa = new ArrayList();
  private final ConcurrentHashMap<Class<? extends com.tencent.mm.kernel.b.f>, ArrayList<Class<? extends com.tencent.mm.kernel.b.a>>> dqb = new ConcurrentHashMap();
  private final ConcurrentHashMap<Class<? extends com.tencent.mm.kernel.b.a>, Class<? extends com.tencent.mm.kernel.b.f>> dqc = new ConcurrentHashMap();
  public com.tencent.mm.kernel.a.a.a<Class<? extends com.tencent.mm.kernel.b.f>> dqd = new com.tencent.mm.kernel.a.a.a();
  private com.tencent.mm.kernel.c.d dqe = new com.tencent.mm.kernel.c.d();
  protected a dqf;
  public Class<? extends com.tencent.mm.kernel.b.a> dqg = null;
  private com.tencent.mm.kernel.a.a dqh;
  
  public c()
  {
    this.dqe.dsY = new d.a()
    {
      public final void a(com.tencent.mm.kernel.c.a paramAnonymousa)
      {
        if (c.this.dqf != null) {
          c.this.dqf.d(paramAnonymousa);
        }
      }
      
      public final void a(com.tencent.mm.kernel.c.c paramAnonymousc)
      {
        if (((paramAnonymousc instanceof com.tencent.mm.kernel.c.e)) && (c.this.dqf != null)) {
          c.this.dqf.b(paramAnonymousc.EV());
        }
      }
      
      public final void b(com.tencent.mm.kernel.c.c paramAnonymousc)
      {
        if (((paramAnonymousc instanceof com.tencent.mm.kernel.c.e)) && (c.this.dqf != null)) {
          c.this.dqf.c(paramAnonymousc.EV());
        }
      }
    };
  }
  
  private com.tencent.mm.kernel.b.f a(com.tencent.mm.kernel.b.f paramf)
  {
    for (;;)
    {
      try
      {
        if (k(paramf.getClass()))
        {
          j.w("MMSkeleton.CorePlugins", "Plugin %s has been installed.", new Object[] { paramf.getClass() });
          paramf = (com.tencent.mm.kernel.b.f)o(paramf.getClass());
          return paramf;
        }
        Assert.assertNotNull(paramf);
        String[] arrayOfString = paramf.ofProcesses();
        if ((arrayOfString != null) && (arrayOfString.length > 0))
        {
          g localg = h.Eo().Ef().DM();
          int j = arrayOfString.length;
          int i = 0;
          boolean bool1 = false;
          boolean bool2 = bool1;
          if (i < j)
          {
            bool1 = localg.gn(arrayOfString[i]);
            bool2 = bool1;
            if (!bool1)
            {
              i += 1;
              continue;
            }
          }
          if (!bool2) {
            throw new IllegalStateException(String.format("Plugin %s can't install in process %s. It only support process %s.", new Object[] { paramf, localg.dox, Arrays.asList(arrayOfString) }));
          }
        }
      }
      finally {}
      this.dpZ.put(paramf.getClass(), paramf);
      this.dqa.add(paramf);
      paramf.invokeInstalled();
      if (this.dqf != null) {
        this.dqf.b(paramf);
      }
    }
  }
  
  private com.tencent.mm.kernel.b.f a(Class<? extends com.tencent.mm.kernel.b.f> paramClass, boolean paramBoolean)
  {
    try
    {
      Assert.assertNotNull(paramClass);
      try
      {
        com.tencent.mm.kernel.b.f localf = (com.tencent.mm.kernel.b.f)paramClass.newInstance();
        if (paramBoolean) {
          localf.markAsPendingPlugin();
        }
        localf = a(localf);
        paramClass = localf;
      }
      catch (Exception localException)
      {
        for (;;)
        {
          j.printErrStackTrace("MMSkeleton.CorePlugins", localException, "Install plugin %s failed.", new Object[] { paramClass });
          paramClass = null;
        }
      }
      return paramClass;
    }
    finally {}
  }
  
  private <T extends com.tencent.mm.kernel.b.a> T o(Class<T> paramClass)
  {
    try
    {
      Assert.assertNotNull(paramClass);
      paramClass = (com.tencent.mm.kernel.b.a)this.dpZ.get(paramClass);
      return paramClass;
    }
    finally
    {
      paramClass = finally;
      throw paramClass;
    }
  }
  
  /* Error */
  private boolean p(Class<? extends com.tencent.mm.kernel.b.a> paramClass)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_2
    //   2: aload_0
    //   3: monitorenter
    //   4: aload_1
    //   5: invokestatic 100	junit/framework/Assert:assertNotNull	(Ljava/lang/Object;)V
    //   8: aload_0
    //   9: aload_1
    //   10: invokevirtual 78	com/tencent/mm/kernel/c:k	(Ljava/lang/Class;)Z
    //   13: ifne +37 -> 50
    //   16: ldc 80
    //   18: new 198	java/lang/StringBuilder
    //   21: dup
    //   22: ldc -56
    //   24: invokespecial 201	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   27: aload_1
    //   28: invokevirtual 205	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   31: ldc -49
    //   33: invokevirtual 210	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   36: invokevirtual 214	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   39: iconst_0
    //   40: anewarray 4	java/lang/Object
    //   43: invokestatic 88	com/tencent/mm/kernel/j:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   46: aload_0
    //   47: monitorexit
    //   48: iload_2
    //   49: ireturn
    //   50: iconst_1
    //   51: istore_2
    //   52: goto -6 -> 46
    //   55: astore_1
    //   56: aload_0
    //   57: monitorexit
    //   58: aload_1
    //   59: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	60	0	this	c
    //   0	60	1	paramClass	Class<? extends com.tencent.mm.kernel.b.a>
    //   1	51	2	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   4	46	55	finally
  }
  
  public final void DK()
  {
    for (;;)
    {
      com.tencent.mm.kernel.b.f localf;
      try
      {
        Iterator localIterator = this.dqa.iterator();
        if (!localIterator.hasNext()) {
          break;
        }
        localf = (com.tencent.mm.kernel.b.f)localIterator.next();
        if (!localf.isDependencyMade())
        {
          com.tencent.mm.kernel.a.a.j("make dependency for plugin %s...", new Object[] { localf });
          localf.invokeDependency();
          continue;
        }
      }
      finally {}
      tmp67_64[0] = localf;
      com.tencent.mm.kernel.a.a.j("skip make dependency for plugin %s.", tmp67_64);
    }
  }
  
  public final List<com.tencent.mm.kernel.b.f> DL()
  {
    try
    {
      ArrayList localArrayList = this.dqa;
      return localArrayList;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final <T extends com.tencent.mm.kernel.c.a, N extends T> void a(Class<T> paramClass, com.tencent.mm.kernel.c.c<N> paramc)
  {
    com.tencent.mm.kernel.c.d locald = this.dqe;
    locald.dsX.put(paramClass, paramc);
    if ((paramc instanceof com.tencent.mm.kernel.c.b)) {
      ((com.tencent.mm.kernel.c.b)paramc).ET();
    }
    if (locald.dsY != null) {
      locald.dsY.a(paramc);
    }
    x.i("MicroMsg.ServiceHub", "register service %s %s", new Object[] { paramClass, paramc });
  }
  
  public final void c(Class<? extends com.tencent.mm.kernel.b.f> paramClass, Class<? extends com.tencent.mm.kernel.b.a> paramClass1)
  {
    try
    {
      Assert.assertNotNull(paramClass);
      Assert.assertNotNull(paramClass1);
      com.tencent.mm.kernel.b.f localf = (com.tencent.mm.kernel.b.f)this.dpZ.get(paramClass);
      Assert.assertNotNull(localf);
      ArrayList localArrayList2 = (ArrayList)this.dqb.get(paramClass);
      ArrayList localArrayList1 = localArrayList2;
      if (localArrayList2 == null)
      {
        localArrayList1 = new ArrayList();
        this.dqb.put(paramClass, localArrayList1);
      }
      this.dqc.put(paramClass1, paramClass);
      localArrayList1.add(paramClass1);
      this.dpZ.put(paramClass1, localf);
      return;
    }
    finally {}
  }
  
  public final void d(Class<? extends com.tencent.mm.kernel.b.f> paramClass, Class<? extends com.tencent.mm.kernel.b.a> paramClass1)
  {
    Assert.assertNotNull(paramClass);
    Assert.assertNotNull(paramClass1);
    if (!p(paramClass1))
    {
      paramClass = String.format("depends plugin %s not install, plugin %s will not add in to dependency tree", new Object[] { paramClass1.getName(), paramClass.getName() });
      j.e("MMSkeleton.CorePlugins", paramClass, new Object[0]);
      throw new IllegalAccessError(paramClass);
    }
    Object localObject = paramClass1;
    if (this.dqc.containsKey(paramClass1)) {
      localObject = (Class)this.dqc.get(paramClass1);
    }
    this.dqd.p(paramClass, localObject);
    if (this.dqh == null) {
      this.dqh = h.Eo().Ef().DM().dqh;
    }
    paramClass = (com.tencent.mm.kernel.b.f)o(paramClass);
    paramClass1 = (com.tencent.mm.kernel.b.f)o((Class)localObject);
    this.dqh.dro.a(com.tencent.mm.kernel.b.b.class, paramClass, paramClass1);
    this.dqh.dro.a(com.tencent.mm.kernel.a.c.b.class, paramClass, paramClass1);
  }
  
  public final com.tencent.mm.kernel.b.f gf(String paramString)
  {
    try
    {
      paramString = r(paramString, false);
      return paramString;
    }
    finally
    {
      paramString = finally;
      throw paramString;
    }
  }
  
  public final com.tencent.mm.kernel.b.f j(Class<? extends com.tencent.mm.kernel.b.f> paramClass)
  {
    try
    {
      paramClass = a(paramClass, false);
      return paramClass;
    }
    finally
    {
      paramClass = finally;
      throw paramClass;
    }
  }
  
  public final boolean k(Class<? extends com.tencent.mm.kernel.b.a> paramClass)
  {
    try
    {
      boolean bool = this.dpZ.containsKey(paramClass);
      return bool;
    }
    finally
    {
      paramClass = finally;
      throw paramClass;
    }
  }
  
  public final <T extends com.tencent.mm.kernel.c.a> T l(Class<T> paramClass)
  {
    com.tencent.mm.kernel.c.a locala = this.dqe.l(paramClass);
    int i;
    if (locala == null) {
      if (paramClass != null)
      {
        Object localObject = (com.tencent.mm.kernel.b.e)paramClass.getAnnotation(com.tencent.mm.kernel.b.e.class);
        if ((localObject != null) && (((com.tencent.mm.kernel.b.e)localObject).value() != null))
        {
          localObject = n(((com.tencent.mm.kernel.b.e)localObject).value());
          if ((localObject != null) && (!f.aE(localObject)))
          {
            i = 1;
            if (i == 0) {
              break label135;
            }
            j.i("MMSkeleton.CorePlugins", "Try load OwnerPlugin for service(%s)...", new Object[] { paramClass });
            locala = this.dqe.l(paramClass);
          }
        }
      }
    }
    label135:
    for (;;)
    {
      if (locala != null)
      {
        return locala;
        i = 0;
        break;
        i = 0;
        break;
      }
      h.Eo().Ef().DM();
      return (com.tencent.mm.kernel.c.a)f.q(paramClass);
    }
  }
  
  public final void m(Class<? extends com.tencent.mm.kernel.c.a> paramClass)
  {
    com.tencent.mm.kernel.c.d locald = this.dqe;
    paramClass = (com.tencent.mm.kernel.c.c)locald.dsX.remove(paramClass);
    if ((paramClass instanceof com.tencent.mm.kernel.c.b)) {
      ((com.tencent.mm.kernel.c.b)paramClass).EU();
    }
    if (locald.dsY != null) {
      locald.dsY.b(paramClass);
    }
  }
  
  public final <T extends com.tencent.mm.kernel.b.a> T n(Class<T> paramClass)
  {
    for (;;)
    {
      com.tencent.mm.kernel.b.a locala;
      try
      {
        locala = o(paramClass);
        if (this.dqf != null) {
          this.dqf.c((com.tencent.mm.kernel.b.f)locala);
        }
        if (locala == null)
        {
          paramClass = (com.tencent.mm.kernel.b.a)f.q(paramClass);
          return paramClass;
        }
      }
      finally {}
      paramClass = locala;
    }
  }
  
  public final com.tencent.mm.kernel.b.f r(String paramString, boolean paramBoolean)
  {
    for (;;)
    {
      try
      {
        Object localObject = Class.forName(paramString);
        if (com.tencent.mm.kernel.b.f.class.isAssignableFrom((Class)localObject))
        {
          localObject = a((Class)localObject, paramBoolean);
          paramString = (String)localObject;
          return paramString;
        }
        j.e("MMSkeleton.CorePlugins", "class string %s, not a Plugin", new Object[] { paramString });
      }
      catch (ClassNotFoundException localClassNotFoundException)
      {
        j.e("MMSkeleton.CorePlugins", "plugin %s not found.", new Object[] { paramString });
        h.Eo().Ef().DM();
        continue;
      }
      finally {}
      paramString = null;
    }
  }
  
  public static abstract interface a
  {
    public abstract void b(com.tencent.mm.kernel.b.f paramf);
    
    public abstract void b(com.tencent.mm.kernel.c.a parama);
    
    public abstract void c(com.tencent.mm.kernel.b.f paramf);
    
    public abstract void c(com.tencent.mm.kernel.c.a parama);
    
    public abstract void d(com.tencent.mm.kernel.c.a parama);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/kernel/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */