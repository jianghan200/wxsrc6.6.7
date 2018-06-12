package com.tencent.tencentmap.mapsdk.a;

import android.content.Context;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class cf
{
  private static cf c = null;
  protected ch a = null;
  protected Context b = null;
  private boolean d = false;
  private int e = 0;
  private dr f = null;
  private Runnable g = null;
  private List<ce> h = new ArrayList(5);
  private SparseArray<ds> i = new SparseArray(5);
  private List<cj> j = new ArrayList(5);
  private SparseArray<ck> k = new SparseArray(2);
  private boolean l = false;
  private Runnable m = new cf.1(this);
  
  private cf(Context paramContext)
  {
    this.b = paramContext;
    this.a = ch.a();
    b.a().a(this.m);
    this.f = new dr(paramContext);
    this.g = new cg(paramContext);
    b.a().a(this.g);
  }
  
  public static cf a(Context paramContext)
  {
    try
    {
      if ((c == null) && (paramContext != null)) {
        c = new cf(paramContext);
      }
      paramContext = c;
      return paramContext;
    }
    finally {}
  }
  
  /* Error */
  public static ds c()
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: getstatic 34	com/tencent/tencentmap/mapsdk/a/cf:c	Lcom/tencent/tencentmap/mapsdk/a/cf;
    //   6: ifnull +15 -> 21
    //   9: getstatic 34	com/tencent/tencentmap/mapsdk/a/cf:c	Lcom/tencent/tencentmap/mapsdk/a/cf;
    //   12: invokespecial 101	com/tencent/tencentmap/mapsdk/a/cf:k	()Lcom/tencent/tencentmap/mapsdk/a/ds;
    //   15: astore_0
    //   16: ldc 2
    //   18: monitorexit
    //   19: aload_0
    //   20: areturn
    //   21: aconst_null
    //   22: astore_0
    //   23: goto -7 -> 16
    //   26: astore_0
    //   27: ldc 2
    //   29: monitorexit
    //   30: aload_0
    //   31: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   15	8	0	localds	ds
    //   26	5	0	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   3	16	26	finally
  }
  
  /* Error */
  private ds k()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 63	com/tencent/tencentmap/mapsdk/a/cf:i	Landroid/util/SparseArray;
    //   6: ifnull +29 -> 35
    //   9: aload_0
    //   10: getfield 63	com/tencent/tencentmap/mapsdk/a/cf:i	Landroid/util/SparseArray;
    //   13: invokevirtual 105	android/util/SparseArray:size	()I
    //   16: ifle +19 -> 35
    //   19: aload_0
    //   20: getfield 63	com/tencent/tencentmap/mapsdk/a/cf:i	Landroid/util/SparseArray;
    //   23: iconst_0
    //   24: invokevirtual 109	android/util/SparseArray:get	(I)Ljava/lang/Object;
    //   27: checkcast 111	com/tencent/tencentmap/mapsdk/a/ds
    //   30: astore_1
    //   31: aload_0
    //   32: monitorexit
    //   33: aload_1
    //   34: areturn
    //   35: aconst_null
    //   36: astore_1
    //   37: goto -6 -> 31
    //   40: astore_1
    //   41: aload_0
    //   42: monitorexit
    //   43: aload_1
    //   44: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	45	0	this	cf
    //   30	7	1	localds	ds
    //   40	4	1	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	31	40	finally
  }
  
  /* Error */
  private cj[] l()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 65	com/tencent/tencentmap/mapsdk/a/cf:j	Ljava/util/List;
    //   6: ifnull +36 -> 42
    //   9: aload_0
    //   10: getfield 65	com/tencent/tencentmap/mapsdk/a/cf:j	Ljava/util/List;
    //   13: invokeinterface 115 1 0
    //   18: ifle +24 -> 42
    //   21: aload_0
    //   22: getfield 65	com/tencent/tencentmap/mapsdk/a/cf:j	Ljava/util/List;
    //   25: iconst_0
    //   26: anewarray 117	com/tencent/tencentmap/mapsdk/a/cj
    //   29: invokeinterface 121 2 0
    //   34: checkcast 123	[Lcom/tencent/tencentmap/mapsdk/a/cj;
    //   37: astore_1
    //   38: aload_0
    //   39: monitorexit
    //   40: aload_1
    //   41: areturn
    //   42: aconst_null
    //   43: astore_1
    //   44: goto -6 -> 38
    //   47: astore_1
    //   48: aload_0
    //   49: monitorexit
    //   50: aload_1
    //   51: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	52	0	this	cf
    //   37	7	1	arrayOfcj	cj[]
    //   47	4	1	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	38	47	finally
  }
  
  private SparseArray<ck> m()
  {
    try
    {
      SparseArray localSparseArray = this.k;
      return localSparseArray;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final void a(int paramInt)
  {
    try
    {
      this.e = paramInt;
      ct.f("step:%d", new Object[] { Integer.valueOf(paramInt) });
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  /* Error */
  public final void a(int paramInt, ds paramds)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 63	com/tencent/tencentmap/mapsdk/a/cf:i	Landroid/util/SparseArray;
    //   6: ifnull +15 -> 21
    //   9: aload_2
    //   10: ifnonnull +14 -> 24
    //   13: aload_0
    //   14: getfield 63	com/tencent/tencentmap/mapsdk/a/cf:i	Landroid/util/SparseArray;
    //   17: iload_1
    //   18: invokevirtual 143	android/util/SparseArray:remove	(I)V
    //   21: aload_0
    //   22: monitorexit
    //   23: return
    //   24: aload_0
    //   25: getfield 63	com/tencent/tencentmap/mapsdk/a/cf:i	Landroid/util/SparseArray;
    //   28: iload_1
    //   29: aload_2
    //   30: invokevirtual 147	android/util/SparseArray:put	(ILjava/lang/Object;)V
    //   33: aload_2
    //   34: aload_0
    //   35: invokevirtual 150	com/tencent/tencentmap/mapsdk/a/cf:f	()Lcom/tencent/tencentmap/mapsdk/a/dr;
    //   38: invokeinterface 153 2 0
    //   43: pop
    //   44: goto -23 -> 21
    //   47: astore_2
    //   48: aload_0
    //   49: monitorexit
    //   50: aload_2
    //   51: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	52	0	this	cf
    //   0	52	1	paramInt	int
    //   0	52	2	paramds	ds
    // Exception table:
    //   from	to	target	type
    //   2	9	47	finally
    //   13	21	47	finally
    //   24	44	47	finally
  }
  
  public final void a(int paramInt, Map<String, String> paramMap)
  {
    Object localObject = m();
    if (localObject != null)
    {
      localObject = (ck)((SparseArray)localObject).get(paramInt);
      if (localObject != null) {
        ((ck)localObject).a(paramMap);
      }
    }
  }
  
  public final void a(ce paramce)
  {
    if (paramce == null) {}
    for (;;)
    {
      return;
      try
      {
        if (this.h == null) {
          this.h = new ArrayList();
        }
        if (this.h.contains(paramce)) {
          continue;
        }
        this.h.add(paramce);
        int n = j();
        if (g())
        {
          ct.e("add listener should notify app first run! %s", new Object[] { paramce.toString() });
          b.a().a(new cf.2(paramce));
        }
        if (n < 2) {
          continue;
        }
        ct.e("add listener should notify app start query! %s", new Object[] { paramce.toString() });
        b.a().a(new cf.3(paramce, n));
      }
      finally {}
    }
  }
  
  public final void a(ch paramch)
  {
    cj[] arrayOfcj = l();
    if (arrayOfcj != null)
    {
      int i1 = arrayOfcj.length;
      int n = 0;
      for (;;)
      {
        if (n < i1)
        {
          cj localcj = arrayOfcj[n];
          try
          {
            localcj.a(paramch);
            n += 1;
          }
          catch (Throwable localThrowable)
          {
            for (;;)
            {
              ct.a(localThrowable);
              ct.d("com strategy changed error %s", new Object[] { localThrowable.toString() });
            }
          }
        }
      }
    }
  }
  
  public final void a(cj paramcj)
  {
    if (paramcj != null) {}
    try
    {
      if ((this.j != null) && (!this.j.contains(paramcj))) {
        this.j.add(paramcj);
      }
      return;
    }
    finally
    {
      paramcj = finally;
      throw paramcj;
    }
  }
  
  public final void a(ck paramck)
  {
    if (paramck != null) {}
    try
    {
      if (this.k != null) {
        this.k.put(1, paramck);
      }
      return;
    }
    finally
    {
      paramck = finally;
      throw paramck;
    }
  }
  
  public final boolean a()
  {
    try
    {
      boolean bool = this.l;
      return bool;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final void b()
  {
    try
    {
      this.l = true;
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final Runnable d()
  {
    try
    {
      Runnable localRunnable = this.g;
      return localRunnable;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final ch e()
  {
    try
    {
      ch localch = this.a;
      return localch;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final dr f()
  {
    try
    {
      dr localdr = this.f;
      return localdr;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final boolean g()
  {
    try
    {
      boolean bool = this.d;
      return bool;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  protected final void h()
  {
    try
    {
      this.d = true;
      ct.f("isFirst }%b", new Object[] { Boolean.valueOf(true) });
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  /* Error */
  public final ce[] i()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 58	com/tencent/tencentmap/mapsdk/a/cf:h	Ljava/util/List;
    //   6: ifnull +36 -> 42
    //   9: aload_0
    //   10: getfield 58	com/tencent/tencentmap/mapsdk/a/cf:h	Ljava/util/List;
    //   13: invokeinterface 115 1 0
    //   18: ifle +24 -> 42
    //   21: aload_0
    //   22: getfield 58	com/tencent/tencentmap/mapsdk/a/cf:h	Ljava/util/List;
    //   25: iconst_0
    //   26: anewarray 223	com/tencent/tencentmap/mapsdk/a/ce
    //   29: invokeinterface 121 2 0
    //   34: checkcast 225	[Lcom/tencent/tencentmap/mapsdk/a/ce;
    //   37: astore_1
    //   38: aload_0
    //   39: monitorexit
    //   40: aload_1
    //   41: areturn
    //   42: aconst_null
    //   43: astore_1
    //   44: goto -6 -> 38
    //   47: astore_1
    //   48: aload_0
    //   49: monitorexit
    //   50: aload_1
    //   51: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	52	0	this	cf
    //   37	7	1	arrayOfce	ce[]
    //   47	4	1	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	38	47	finally
  }
  
  public final int j()
  {
    try
    {
      int n = this.e;
      return n;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/cf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */