package com.tencent.mm.kernel.a.b;

import com.tencent.mm.by.b;
import com.tencent.mm.kernel.a.a.a.a;
import com.tencent.mm.kernel.j;
import com.tencent.mm.sdk.platformtools.x;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import junit.framework.Assert;

public final class f<T>
  extends com.tencent.mm.kernel.a.a.a<T>
  implements c<T>
{
  private c<T> dso;
  d<T> dsu;
  public Class dsv;
  volatile boolean dsw = false;
  
  public f(Class paramClass, d<T> paramd, c paramc)
  {
    this.dsv = paramClass;
    this.dsu = paramd;
    paramClass = paramc;
    if (paramc == null) {
      paramClass = this;
    }
    this.dso = paramClass;
  }
  
  public final a<T> ED()
  {
    return this.dsu.ED();
  }
  
  public final List<a.a> EK()
  {
    ArrayList localArrayList = new ArrayList(1);
    Iterator localIterator = this.drY.values().iterator();
    while (localIterator.hasNext())
    {
      a.a locala = (a.a)localIterator.next();
      if (!((a)locala).dsc)
      {
        int i = ((a)locala).dsx;
        a locala1 = ((a)locala).dsA;
        if (((a)locala).dsA != null) {}
        for (Object localObject = Boolean.valueOf(((a)locala).dsA.dsc);; localObject = "")
        {
          x.e("MMSkeleton.ParallelsDependencies", "ParallelsDependencies node(%s) not consumed!!!! %s, %s, %s", new Object[] { locala, Integer.valueOf(i), locala1, localObject });
          localArrayList.add(locala);
          break;
        }
      }
    }
    return localArrayList;
  }
  
  public final void a(a<T> parama)
  {
    parama = parama.Ew();
    if (parama != null)
    {
      parama = parama.iterator();
      while (parama.hasNext())
      {
        a locala = (a)parama.next();
        if (locala.EP()) {
          this.dsu.b(locala);
        }
      }
    }
  }
  
  protected final a.a<T> aJ(T paramT)
  {
    if (!this.drY.containsKey(paramT)) {
      this.drY.putIfAbsent(paramT, new a(paramT, this.dsv, this.dso, (byte)0));
    }
    return (a.a)this.drY.get(paramT);
  }
  
  public final a<T> aO(T paramT)
  {
    return (a)this.drY.get(paramT);
  }
  
  public final void prepare()
  {
    x.i("MMSkeleton.ParallelsDependencies", "ParallelsDependencies for type %s", new Object[] { this.dsv });
    Assert.assertNotNull(this.dsu);
    this.dsw = true;
    Iterator localIterator = this.drY.values().iterator();
    while (localIterator.hasNext())
    {
      Object localObject = (a.a)localIterator.next();
      if (((a.a)localObject).Ez())
      {
        localObject = (a)localObject;
        x.d("MMSkeleton.ParallelsDependencies", "ParallelsDependencies prepare can provide %s", new Object[] { localObject });
        if (((a)localObject).EM()) {
          this.dsu.b((a)localObject);
        }
        x.d("MMSkeleton.ParallelsDependencies", "ParallelsDependencies prepare can provide %s done", new Object[] { localObject });
      }
    }
    x.d("MMSkeleton.ParallelsDependencies", "ParallelsDependencies prepare %s done", new Object[] { this.dsv });
  }
  
  public static final class a<T>
    extends a.a<T>
  {
    public volatile a dsA;
    public volatile a dsB;
    public h dsC = new h();
    private c dsD;
    public f.b dsE = new f.b();
    volatile int dsx = 0;
    private boolean dsy = false;
    volatile boolean dsz = false;
    
    private a(T paramT, Class paramClass, c paramc)
    {
      super();
      this.dsC.dsf = paramClass;
      this.dsD = paramc;
    }
    
    private boolean EL()
    {
      return (this.dsx == 0) && ((this.dsA == null) || (this.dsA.dsc));
    }
    
    /* Error */
    private boolean EN()
    {
      // Byte code:
      //   0: iconst_1
      //   1: istore_2
      //   2: aload_0
      //   3: monitorenter
      //   4: aload_0
      //   5: getfield 69	com/tencent/mm/kernel/a/a/a$a:dsb	Ljava/lang/Object;
      //   8: astore 5
      //   10: aload_0
      //   11: getfield 40	com/tencent/mm/kernel/a/b/f$a:dsC	Lcom/tencent/mm/kernel/a/b/h;
      //   14: getfield 49	com/tencent/mm/kernel/a/b/h:dsf	Ljava/lang/Class;
      //   17: astore 6
      //   19: aload_0
      //   20: getfield 33	com/tencent/mm/kernel/a/b/f$a:dsz	Z
      //   23: istore_3
      //   24: aload_0
      //   25: getfield 29	com/tencent/mm/kernel/a/b/f$a:dsx	I
      //   28: istore_1
      //   29: aload_0
      //   30: getfield 61	com/tencent/mm/kernel/a/b/f$a:dsA	Lcom/tencent/mm/kernel/a/b/f$a;
      //   33: astore 7
      //   35: aload_0
      //   36: getfield 61	com/tencent/mm/kernel/a/b/f$a:dsA	Lcom/tencent/mm/kernel/a/b/f$a;
      //   39: ifnull +85 -> 124
      //   42: aload_0
      //   43: getfield 61	com/tencent/mm/kernel/a/b/f$a:dsA	Lcom/tencent/mm/kernel/a/b/f$a;
      //   46: getfield 64	com/tencent/mm/kernel/a/a/a$a:dsc	Z
      //   49: invokestatic 75	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
      //   52: astore 4
      //   54: ldc 77
      //   56: ldc 79
      //   58: bipush 7
      //   60: anewarray 81	java/lang/Object
      //   63: dup
      //   64: iconst_0
      //   65: aload 5
      //   67: aastore
      //   68: dup
      //   69: iconst_1
      //   70: aload 6
      //   72: aastore
      //   73: dup
      //   74: iconst_2
      //   75: iload_3
      //   76: invokestatic 75	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
      //   79: aastore
      //   80: dup
      //   81: iconst_3
      //   82: iload_1
      //   83: invokestatic 86	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
      //   86: aastore
      //   87: dup
      //   88: iconst_4
      //   89: aload 7
      //   91: aastore
      //   92: dup
      //   93: iconst_5
      //   94: aload 4
      //   96: aastore
      //   97: dup
      //   98: bipush 6
      //   100: aload_0
      //   101: getfield 40	com/tencent/mm/kernel/a/b/f$a:dsC	Lcom/tencent/mm/kernel/a/b/h;
      //   104: getfield 89	com/tencent/mm/kernel/a/b/h:dsO	Ljava/lang/Class;
      //   107: aastore
      //   108: invokestatic 95	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
      //   111: aload_0
      //   112: getfield 33	com/tencent/mm/kernel/a/b/f$a:dsz	Z
      //   115: istore_3
      //   116: iload_3
      //   117: ifeq +14 -> 131
      //   120: aload_0
      //   121: monitorexit
      //   122: iload_2
      //   123: ireturn
      //   124: ldc 97
      //   126: astore 4
      //   128: goto -74 -> 54
      //   131: aload_0
      //   132: invokespecial 99	com/tencent/mm/kernel/a/b/f$a:EL	()Z
      //   135: istore_2
      //   136: goto -16 -> 120
      //   139: astore 4
      //   141: aload_0
      //   142: monitorexit
      //   143: aload 4
      //   145: athrow
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	146	0	this	a
      //   28	55	1	i	int
      //   1	135	2	bool1	boolean
      //   23	94	3	bool2	boolean
      //   52	75	4	localObject1	Object
      //   139	5	4	localObject2	Object
      //   8	58	5	localObject3	Object
      //   17	54	6	localClass	Class
      //   33	57	7	locala	a
      // Exception table:
      //   from	to	target	type
      //   4	54	139	finally
      //   54	116	139	finally
      //   131	136	139	finally
    }
    
    private void EO()
    {
      try
      {
        if (this.dsz) {
          x.d("MMSkeleton.ParallelsDependencies", "waitingResolved node %s, consumed %s, phase %s resolved!", new Object[] { this, Boolean.valueOf(this.dsc), this.dsC.dsf });
        }
        for (;;)
        {
          return;
          x.i("MMSkeleton.ParallelsDependencies", "waiting resolved");
          x.d("MMSkeleton.ParallelsDependencies", "waitingResolved node %s, consumed %s, phase %s", new Object[] { this, Boolean.valueOf(this.dsc), this.dsC.dsf });
          wait();
          x.d("MMSkeleton.ParallelsDependencies", "waitingResolved node %s, consumed %s, phase %s done", new Object[] { this, Boolean.valueOf(this.dsc), this.dsC.dsf });
        }
      }
      catch (InterruptedException localInterruptedException)
      {
        for (;;)
        {
          x.printErrStackTrace("MMSkeleton.ParallelsDependencies", localInterruptedException, "", new Object[0]);
        }
      }
      finally {}
    }
    
    /* Error */
    public final boolean EM()
    {
      // Byte code:
      //   0: iconst_0
      //   1: istore_2
      //   2: aload_0
      //   3: monitorenter
      //   4: aload_0
      //   5: getfield 69	com/tencent/mm/kernel/a/a/a$a:dsb	Ljava/lang/Object;
      //   8: astore 5
      //   10: aload_0
      //   11: getfield 40	com/tencent/mm/kernel/a/b/f$a:dsC	Lcom/tencent/mm/kernel/a/b/h;
      //   14: getfield 49	com/tencent/mm/kernel/a/b/h:dsf	Ljava/lang/Class;
      //   17: astore 6
      //   19: aload_0
      //   20: getfield 33	com/tencent/mm/kernel/a/b/f$a:dsz	Z
      //   23: istore_3
      //   24: aload_0
      //   25: getfield 29	com/tencent/mm/kernel/a/b/f$a:dsx	I
      //   28: istore_1
      //   29: aload_0
      //   30: getfield 61	com/tencent/mm/kernel/a/b/f$a:dsA	Lcom/tencent/mm/kernel/a/b/f$a;
      //   33: astore 7
      //   35: aload_0
      //   36: getfield 61	com/tencent/mm/kernel/a/b/f$a:dsA	Lcom/tencent/mm/kernel/a/b/f$a;
      //   39: ifnull +85 -> 124
      //   42: aload_0
      //   43: getfield 61	com/tencent/mm/kernel/a/b/f$a:dsA	Lcom/tencent/mm/kernel/a/b/f$a;
      //   46: getfield 64	com/tencent/mm/kernel/a/a/a$a:dsc	Z
      //   49: invokestatic 75	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
      //   52: astore 4
      //   54: ldc 77
      //   56: ldc 126
      //   58: bipush 7
      //   60: anewarray 81	java/lang/Object
      //   63: dup
      //   64: iconst_0
      //   65: aload 5
      //   67: aastore
      //   68: dup
      //   69: iconst_1
      //   70: aload 6
      //   72: aastore
      //   73: dup
      //   74: iconst_2
      //   75: iload_3
      //   76: invokestatic 75	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
      //   79: aastore
      //   80: dup
      //   81: iconst_3
      //   82: iload_1
      //   83: invokestatic 86	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
      //   86: aastore
      //   87: dup
      //   88: iconst_4
      //   89: aload 7
      //   91: aastore
      //   92: dup
      //   93: iconst_5
      //   94: aload 4
      //   96: aastore
      //   97: dup
      //   98: bipush 6
      //   100: aload_0
      //   101: getfield 40	com/tencent/mm/kernel/a/b/f$a:dsC	Lcom/tencent/mm/kernel/a/b/h;
      //   104: getfield 89	com/tencent/mm/kernel/a/b/h:dsO	Ljava/lang/Class;
      //   107: aastore
      //   108: invokestatic 107	com/tencent/mm/sdk/platformtools/x:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
      //   111: aload_0
      //   112: getfield 33	com/tencent/mm/kernel/a/b/f$a:dsz	Z
      //   115: istore_3
      //   116: iload_3
      //   117: ifeq +14 -> 131
      //   120: aload_0
      //   121: monitorexit
      //   122: iload_2
      //   123: ireturn
      //   124: ldc 97
      //   126: astore 4
      //   128: goto -74 -> 54
      //   131: aload_0
      //   132: invokespecial 99	com/tencent/mm/kernel/a/b/f$a:EL	()Z
      //   135: ifeq -15 -> 120
      //   138: ldc 77
      //   140: ldc -128
      //   142: iconst_3
      //   143: anewarray 81	java/lang/Object
      //   146: dup
      //   147: iconst_0
      //   148: aload_0
      //   149: aastore
      //   150: dup
      //   151: iconst_1
      //   152: aload_0
      //   153: getfield 64	com/tencent/mm/kernel/a/a/a$a:dsc	Z
      //   156: invokestatic 75	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
      //   159: aastore
      //   160: dup
      //   161: iconst_2
      //   162: aload_0
      //   163: getfield 40	com/tencent/mm/kernel/a/b/f$a:dsC	Lcom/tencent/mm/kernel/a/b/h;
      //   166: getfield 49	com/tencent/mm/kernel/a/b/h:dsf	Ljava/lang/Class;
      //   169: aastore
      //   170: invokestatic 95	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
      //   173: aload_0
      //   174: iconst_1
      //   175: putfield 33	com/tencent/mm/kernel/a/b/f$a:dsz	Z
      //   178: aload_0
      //   179: invokevirtual 131	java/lang/Object:notify	()V
      //   182: iconst_1
      //   183: istore_2
      //   184: goto -64 -> 120
      //   187: astore 4
      //   189: aload_0
      //   190: monitorexit
      //   191: aload 4
      //   193: athrow
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	194	0	this	a
      //   28	55	1	i	int
      //   1	183	2	bool1	boolean
      //   23	94	3	bool2	boolean
      //   52	75	4	localObject1	Object
      //   187	5	4	localObject2	Object
      //   8	58	5	localObject3	Object
      //   17	54	6	localClass	Class
      //   33	57	7	locala	a
      // Exception table:
      //   from	to	target	type
      //   4	54	187	finally
      //   54	116	187	finally
      //   131	182	187	finally
    }
    
    public final boolean EP()
    {
      try
      {
        this.dsx -= 1;
        boolean bool = EM();
        return bool;
      }
      finally
      {
        localObject = finally;
        throw ((Throwable)localObject);
      }
    }
    
    public final void a(a.a parama)
    {
      super.a(parama);
      try
      {
        this.dsx += 1;
        return;
      }
      finally {}
    }
    
    public final void a(com.tencent.mm.vending.c.a parama)
    {
      if (!this.dsc) {
        if (!EN())
        {
          Object localObject = Ex();
          Assert.assertNotNull(localObject);
          localObject = ((HashSet)localObject).iterator();
          while (((Iterator)localObject).hasNext())
          {
            a.a locala = (a.a)((Iterator)localObject).next();
            if (!((a)locala).dsc) {
              x.i("MMSkeleton.ParallelsDependencies", "ParallelsNode(%s) found it's depending node(%s) not consumed.", new Object[] { this, locala });
            }
          }
        }
      }
      for (int i = 1;; i = 0)
      {
        if (i != 0) {
          EO();
        }
        this.dsE.dsF.cDY();
        if (!this.dsc)
        {
          j.i("MMSkeleton.ParallelsDependencies", "Consume node(%s) on phase(%s) may after waiting resolved.", new Object[] { this, this.dsC.dsf });
          parama.call(this);
          this.dsc = true;
        }
        this.dsE.dsF.done();
        return;
      }
    }
    
    public final String toString()
    {
      return super.toString() + " - with type " + this.dsC.dsf;
    }
  }
  
  public static final class b
  {
    public b dsF = new b();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/kernel/a/b/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */