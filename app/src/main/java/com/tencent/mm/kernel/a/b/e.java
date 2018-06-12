package com.tencent.mm.kernel.a.b;

import android.os.Handler;
import android.os.HandlerThread;
import com.tencent.mm.by.b;
import com.tencent.mm.kernel.a.a.a.a;
import com.tencent.mm.kernel.j;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.vending.c.a;
import com.tencent.mm.vending.h.h;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import junit.framework.Assert;

public final class e<T>
{
  private static e dsp = null;
  private Queue<c> dsi = new LinkedList();
  private int dsj;
  private volatile a dsk;
  private volatile boolean dsl = false;
  private final byte[] dsm = new byte[0];
  private volatile a<Void, f.a> dsn;
  private volatile c<T> dso;
  
  public static e EE()
  {
    return dsp;
  }
  
  public static e EF()
  {
    if (dsp == null) {
      dsp = new e();
    }
    return dsp;
  }
  
  private c EI()
  {
    try
    {
      c localc = (c)this.dsi.poll();
      return localc;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  private void a(final c paramc, final f.a<T> parama)
  {
    paramc.dst.g(new Runnable()
    {
      public final void run()
      {
        f.a locala = parama;
        a locala1 = e.a(e.this);
        if (!locala.dsc)
        {
          locala.dsE.dsF.cDY();
          if (!locala.dsc)
          {
            locala1.call(locala);
            x.d("MMSkeleton.ParallelsDependencies", "consume call functional %s, node %s", new Object[] { locala1, locala });
            locala.dsc = true;
          }
          locala.dsE.dsF.done();
        }
        e.b(e.this).a(parama);
        locala = e.b(e.this).ED();
        if (locala == null)
        {
          e.a(e.this, paramc);
          return;
        }
        e.a(e.this, paramc, locala);
        e.c(e.this);
      }
    });
  }
  
  /* Error */
  private boolean a(c paramc)
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore 4
    //   3: aload_0
    //   4: monitorenter
    //   5: aload_0
    //   6: getfield 48	com/tencent/mm/kernel/a/b/e:dsi	Ljava/util/Queue;
    //   9: aload_1
    //   10: invokeinterface 95 2 0
    //   15: pop
    //   16: ldc 97
    //   18: ldc 99
    //   20: iconst_2
    //   21: anewarray 5	java/lang/Object
    //   24: dup
    //   25: iconst_0
    //   26: aload_0
    //   27: getfield 48	com/tencent/mm/kernel/a/b/e:dsi	Ljava/util/Queue;
    //   30: invokeinterface 103 1 0
    //   35: invokestatic 109	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   38: aastore
    //   39: dup
    //   40: iconst_1
    //   41: aload_0
    //   42: getfield 111	com/tencent/mm/kernel/a/b/e:dsj	I
    //   45: invokestatic 109	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   48: aastore
    //   49: invokestatic 117	com/tencent/mm/kernel/j:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   52: aload_0
    //   53: getfield 48	com/tencent/mm/kernel/a/b/e:dsi	Ljava/util/Queue;
    //   56: invokeinterface 103 1 0
    //   61: istore_2
    //   62: aload_0
    //   63: getfield 111	com/tencent/mm/kernel/a/b/e:dsj	I
    //   66: istore_3
    //   67: iload_2
    //   68: iload_3
    //   69: if_icmpne +8 -> 77
    //   72: aload_0
    //   73: monitorexit
    //   74: iload 4
    //   76: ireturn
    //   77: iconst_0
    //   78: istore 4
    //   80: goto -8 -> 72
    //   83: astore_1
    //   84: aload_0
    //   85: monitorexit
    //   86: aload_1
    //   87: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	88	0	this	e
    //   0	88	1	paramc	c
    //   61	9	2	i	int
    //   66	4	3	j	int
    //   1	78	4	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   5	67	83	finally
  }
  
  private void active()
  {
    c localc;
    for (;;)
    {
      localc = EI();
      if (localc == null) {
        return;
      }
      f.a locala = this.dso.ED();
      if (locala == null) {
        break;
      }
      a(localc, locala);
    }
    b(localc);
  }
  
  private void b(c arg1)
  {
    if (a(???)) {
      synchronized (this.dsm)
      {
        if (this.dsl) {
          j.i("MMSkeleton.Parallels", "Parallels notify done", new Object[0]);
        }
        this.dsl = false;
        this.dsk.EJ();
        return;
      }
    }
  }
  
  public final void EG()
  {
    this.dsk.EG();
  }
  
  public final List<c> EH()
  {
    try
    {
      LinkedList localLinkedList = new LinkedList(this.dsi);
      return localLinkedList;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final void a(a parama, a<Void, f.a> parama1, c<T> paramc, String paramString)
  {
    if (a(parama, parama1, paramc))
    {
      paramc.prepare();
      start(paramString);
      EG();
    }
  }
  
  public final boolean a(a parama, a<Void, f.a> parama1, c<T> paramc)
  {
    synchronized (this.dsm)
    {
      if (this.dsl)
      {
        x.w("MMSkeleton.Parallels", "Arrange parallels task failed. It's busy on working.");
        Assert.assertTrue(false);
        return false;
      }
      this.dsk = parama;
      this.dsn = parama1;
      this.dso = paramc;
      return true;
    }
  }
  
  public final void init(int paramInt)
  {
    int i = 0;
    for (;;)
    {
      if (i < paramInt) {}
      try
      {
        Queue localQueue = this.dsi;
        HandlerThread localHandlerThread = new HandlerThread("parallels-" + i, -8);
        localHandlerThread.start();
        c localc = new c();
        localc.byy = localHandlerThread;
        localQueue.add(localc);
        i += 1;
      }
      finally {}
    }
    this.dsj = paramInt;
  }
  
  public final void prepare()
  {
    int i = 0;
    try
    {
      while (i < this.dsj)
      {
        c localc = (c)((LinkedList)this.dsi).get(i);
        Handler localHandler = new Handler(localc.byy.getLooper());
        h localh = new h(localHandler, localc.byy.getName());
        localc.handler = localHandler;
        localc.dst = localh;
        i += 1;
      }
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final void start(String arg1)
  {
    j.i("MMSkeleton.Parallels", "Start working. For %s", new Object[] { ??? });
    synchronized (this.dsm)
    {
      this.dsl = true;
      active();
      return;
    }
  }
  
  public static abstract interface a
  {
    public abstract void EG();
    
    public abstract void EJ();
  }
  
  public static final class b
    implements e.a
  {
    private final byte[] dol = { 0 };
    
    public final void EG()
    {
      try
      {
        synchronized (this.dol)
        {
          if (this.dol[0] == 0)
          {
            j.i("MMSkeleton.Parallels", "Waiting for lock(%s)", new Object[] { this.dol });
            this.dol.wait();
            return;
          }
          j.i("MMSkeleton.Parallels", "Not need wait for lock(%s)", new Object[] { this.dol });
        }
        return;
      }
      catch (InterruptedException localInterruptedException)
      {
        x.printErrStackTrace("MMSkeleton.Parallels", localInterruptedException, "", new Object[0]);
      }
    }
    
    public final void EJ()
    {
      synchronized (this.dol)
      {
        this.dol[0] = 1;
        this.dol.notify();
        j.i("MMSkeleton.Parallels", "Lock(%s) notified", new Object[] { this.dol });
        return;
      }
    }
  }
  
  public static final class c
  {
    public HandlerThread byy;
    h dst;
    Handler handler;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/kernel/a/b/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */