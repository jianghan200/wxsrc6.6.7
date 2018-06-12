package com.tencent.mm.sdk.f;

import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.x;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import junit.framework.Assert;

public class e
  implements f.a
{
  private static e sLa;
  static int[] sLb = { 19, 16, 13, 10, 0, -2, -4, -5, -6, -8 };
  static long sLd = 0L;
  static long sLe = 0L;
  private static b sLf;
  private static a sLg;
  private static b sLh;
  private boolean bGv = false;
  volatile boolean bPd = false;
  Object lock = new Object();
  private f sKS = new f(this.sKT + 2, TimeUnit.SECONDS, this.sKU, this);
  private int sKT = cjx();
  private PriorityBlockingQueue<Runnable> sKU = new PriorityBlockingQueue(33);
  private LinkedList<g> sKV = new LinkedList();
  private ArrayList<g> sKW = new ArrayList();
  private HashMap<g, Thread> sKX = new HashMap();
  private ArrayList<c> sKY = new ArrayList();
  private c sKZ;
  
  private e()
  {
    HandlerThread localHandlerThread = Xs("THREAD_POOL_HANDLER");
    localHandlerThread.start();
    this.sKZ = new c(localHandlerThread.getLooper());
  }
  
  public static void S(Runnable paramRunnable)
  {
    e locale = cjw();
    synchronized (locale.lock)
    {
      Thread localThread = locale.T(paramRunnable);
      if (localThread != null)
      {
        localThread.interrupt();
        return;
      }
      locale.Z(paramRunnable);
    }
  }
  
  private Thread T(Runnable paramRunnable)
  {
    if (paramRunnable == null) {
      return null;
    }
    for (;;)
    {
      synchronized (this.lock)
      {
        Iterator localIterator = this.sKX.keySet().iterator();
        if (localIterator != null)
        {
          if (!localIterator.hasNext()) {
            break label99;
          }
          g localg = (g)localIterator.next();
          if ((localg == null) || (!localg.sHb.equals(paramRunnable))) {
            continue;
          }
          paramRunnable = localg;
          if (paramRunnable != null)
          {
            paramRunnable = (Thread)this.sKX.get(paramRunnable);
            return paramRunnable;
          }
        }
      }
      return null;
      label99:
      paramRunnable = null;
    }
  }
  
  public static void U(Runnable paramRunnable)
  {
    cjw().V(paramRunnable);
  }
  
  /* Error */
  private void V(Runnable paramRunnable)
  {
    // Byte code:
    //   0: ldc -64
    //   2: aload_1
    //   3: invokestatic 198	junit/framework/Assert:assertNotNull	(Ljava/lang/String;Ljava/lang/Object;)V
    //   6: aconst_null
    //   7: astore_2
    //   8: aload_0
    //   9: getfield 93	com/tencent/mm/sdk/f/e:lock	Ljava/lang/Object;
    //   12: astore_3
    //   13: aload_3
    //   14: monitorenter
    //   15: aload_0
    //   16: aload_1
    //   17: invokespecial 201	com/tencent/mm/sdk/f/e:Y	(Ljava/lang/Runnable;)Z
    //   20: ifeq +18 -> 38
    //   23: new 8	com/tencent/mm/sdk/f/e$a
    //   26: dup
    //   27: aload_0
    //   28: aload_1
    //   29: invokespecial 204	com/tencent/mm/sdk/f/e$a:<init>	(Lcom/tencent/mm/sdk/f/e;Ljava/lang/Runnable;)V
    //   32: astore_2
    //   33: aload_0
    //   34: aload_2
    //   35: invokespecial 207	com/tencent/mm/sdk/f/e:b	(Lcom/tencent/mm/sdk/f/c;)V
    //   38: aload_3
    //   39: monitorexit
    //   40: aload_2
    //   41: ifnull +22 -> 63
    //   44: aload_1
    //   45: monitorenter
    //   46: aload_0
    //   47: getfield 91	com/tencent/mm/sdk/f/e:sKY	Ljava/util/ArrayList;
    //   50: aload_2
    //   51: invokevirtual 210	java/util/ArrayList:contains	(Ljava/lang/Object;)Z
    //   54: ifeq +15 -> 69
    //   57: aload_1
    //   58: invokevirtual 213	java/lang/Object:wait	()V
    //   61: aload_1
    //   62: monitorexit
    //   63: return
    //   64: astore_1
    //   65: aload_3
    //   66: monitorexit
    //   67: aload_1
    //   68: athrow
    //   69: ldc -41
    //   71: ldc -39
    //   73: invokestatic 223	com/tencent/mm/sdk/platformtools/x:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   76: goto -15 -> 61
    //   79: astore_2
    //   80: aload_1
    //   81: monitorexit
    //   82: aload_2
    //   83: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	84	0	this	e
    //   0	84	1	paramRunnable	Runnable
    //   7	44	2	locala	a
    //   79	4	2	localObject1	Object
    //   12	54	3	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   15	38	64	finally
    //   38	40	64	finally
    //   65	67	64	finally
    //   46	61	79	finally
    //   61	63	79	finally
    //   69	76	79	finally
    //   80	82	79	finally
  }
  
  public static void W(Runnable paramRunnable)
  {
    int j = 1;
    e locale = cjw();
    Assert.assertNotNull("join arg runnable is null!", paramRunnable);
    if (5000L < 0L) {
      throw new IllegalArgumentException();
    }
    int i;
    if (5000L >= 9223372036854L)
    {
      i = 1;
      if (5000L != 0L) {
        break label67;
      }
    }
    for (;;)
    {
      if ((j | i) == 0) {
        break label72;
      }
      locale.V(paramRunnable);
      return;
      i = 0;
      break;
      label67:
      j = 0;
    }
    label72:
    a locala = null;
    for (;;)
    {
      synchronized (locale.lock)
      {
        if (locale.Y(paramRunnable))
        {
          locala = new a(locale, paramRunnable);
          cjw().b(locala);
        }
        if (locala == null) {
          break;
        }
        try
        {
          if (locale.sKY.contains(locala))
          {
            paramRunnable.wait(5000L, 0);
            return;
          }
        }
        finally {}
      }
      x.d("MicroMsg.ThreadPool", "|MMThreadPool joinTask runnable is not in observerList, just removed!");
    }
  }
  
  public static boolean X(Runnable paramRunnable)
  {
    return cjw().Y(paramRunnable);
  }
  
  public static HandlerThread Xs(String paramString)
  {
    cjB();
    return a.cY(paramString, 0);
  }
  
  private boolean Y(Runnable paramRunnable)
  {
    if (paramRunnable == null) {
      return false;
    }
    synchronized (this.lock)
    {
      Iterator localIterator = this.sKW.iterator();
      g localg;
      while ((localIterator != null) && (localIterator.hasNext()))
      {
        localg = (g)localIterator.next();
        if ((localg != null) && (localg.sHb.equals(paramRunnable))) {
          return true;
        }
      }
      localIterator = this.sKX.keySet().iterator();
      while ((localIterator != null) && (localIterator.hasNext()))
      {
        localg = (g)localIterator.next();
        if ((localg != null) && (localg.sHb.equals(paramRunnable))) {
          return true;
        }
      }
      return false;
    }
  }
  
  private boolean Z(Runnable paramRunnable)
  {
    if (paramRunnable == null) {
      return false;
    }
    for (;;)
    {
      synchronized (this.lock)
      {
        Iterator localIterator = this.sKW.iterator();
        if (localIterator != null)
        {
          if (!localIterator.hasNext()) {
            break label98;
          }
          g localg = (g)localIterator.next();
          if ((localg == null) || (!localg.sHb.equals(paramRunnable))) {
            continue;
          }
          localIterator.remove();
          paramRunnable = localg;
          if (paramRunnable != null)
          {
            this.sKS.remove(paramRunnable);
            return true;
          }
        }
      }
      return false;
      label98:
      paramRunnable = null;
    }
  }
  
  public static void a(c paramc)
  {
    cjw().b(paramc);
  }
  
  public static void a(Runnable paramRunnable, String paramString)
  {
    e locale = cjw();
    synchronized (locale.lock)
    {
      paramRunnable = new g(paramRunnable, paramString, Integer.MAX_VALUE, true, sLh);
      locale.sKW.add(paramRunnable);
      locale.sKS.execute(paramRunnable);
      if ((locale.sKS.getActiveCount() >= locale.sKT) && (locale.sKT < cjx() * 2))
      {
        locale.sKT += 1;
        locale.sKS.setCorePoolSize(locale.sKT);
        locale.sKS.setMaximumPoolSize(locale.sKT);
        x.i("MicroMsg.ThreadPool", "|MMThreadPool postAtFront expand core pool size=" + locale.sKT);
        paramString = new ArrayList(locale.sKY).iterator();
      }
      while (paramString.hasNext())
      {
        paramString.next();
        Runnable localRunnable = paramRunnable.sHb;
        continue;
        locale.cjy();
      }
    }
    locale.lk(false);
  }
  
  public static Thread b(Runnable paramRunnable, String paramString)
  {
    return cjA().a(paramRunnable, paramString, 5);
  }
  
  private void b(c paramc)
  {
    synchronized (this.lock)
    {
      if (!this.sKY.contains(paramc)) {
        this.sKY.add(paramc);
      }
      return;
    }
  }
  
  public static void b(Runnable paramRunnable, String paramString, int paramInt)
  {
    cjw().c(paramRunnable, paramString, paramInt);
  }
  
  public static void c(c paramc)
  {
    e locale = cjw();
    synchronized (locale.lock)
    {
      locale.sKY.remove(paramc);
      return;
    }
  }
  
  private void c(Runnable paramRunnable, String paramString, int paramInt)
  {
    synchronized (this.lock)
    {
      paramRunnable = new g(paramRunnable, paramString, paramInt, true, sLh);
      this.sKV.add(paramRunnable);
      this.sKW.add(paramRunnable);
      this.sKZ.sendEmptyMessage(1);
      lk(false);
      return;
    }
  }
  
  public static HandlerThread cZ(String paramString, int paramInt)
  {
    cjB();
    return a.cY(paramString, paramInt);
  }
  
  private static b cjA()
  {
    if (sLf == null) {
      sLf = new b(sLh);
    }
    return sLf;
  }
  
  private static a cjB()
  {
    if (sLg == null) {
      sLg = new a(sLh);
    }
    return sLg;
  }
  
  public static e cjw()
  {
    if (sLa == null) {}
    try
    {
      if (sLa == null) {
        sLa = new e();
      }
      return sLa;
    }
    finally {}
  }
  
  private static int cjx()
  {
    int i = Runtime.getRuntime().availableProcessors() * 4 + 2;
    if (i > 32) {
      return 32;
    }
    return i;
  }
  
  private void cjy()
  {
    if (this.sKS.getCorePoolSize() < this.sKT)
    {
      this.sKS.setCorePoolSize(this.sKT);
      this.sKS.setMaximumPoolSize(this.sKT);
    }
  }
  
  public static void cjz()
  {
    cjw().lk(true);
  }
  
  public static Thread d(Runnable paramRunnable, String paramString, int paramInt)
  {
    return cjA().a(paramRunnable, paramString, paramInt);
  }
  
  private void lk(boolean paramBoolean)
  {
    if (!paramBoolean) {
      return;
    }
    g localg;
    synchronized (this.lock)
    {
      x.i("MicroMsg.ThreadPool", "------------------------------------------");
      Iterator localIterator1 = this.sKV.iterator();
      if ((localIterator1 != null) && (localIterator1.hasNext()))
      {
        localg = (g)localIterator1.next();
        x.i("MicroMsg.ThreadPool", "|MMThreadPool adding task{" + localg + "}");
      }
    }
    x.i("MicroMsg.ThreadPool", "-----------");
    Iterator localIterator2 = this.sKW.iterator();
    if (localIterator2 != null) {
      while (localIterator2.hasNext())
      {
        localg = (g)localIterator2.next();
        x.i("MicroMsg.ThreadPool", "|MMThreadPool waiting task{" + localg + "}");
      }
    }
    x.i("MicroMsg.ThreadPool", "-----------");
    localIterator2 = this.sKX.keySet().iterator();
    if (localIterator2 != null) {
      while (localIterator2.hasNext())
      {
        localg = (g)localIterator2.next();
        x.i("MicroMsg.ThreadPool", "|MMThreadPool running task{" + localg + "}");
      }
    }
    x.i("MicroMsg.ThreadPool", "-----------");
    x.i("MicroMsg.ThreadPool", "|MMThreadPool poolSize=" + this.sKS.getPoolSize() + "|activeCount=" + this.sKS.getActiveCount() + "|corePoolSize=" + this.sKS.getPoolSize() + "|largestPoolSize=" + this.sKS.getLargestPoolSize() + "|maximuPoolSize=" + this.sKS.getMaximumPoolSize());
    x.i("MicroMsg.ThreadPool", "------------------------------------------");
  }
  
  public static void post(Runnable paramRunnable, String paramString)
  {
    cjw().c(paramRunnable, paramString, 5);
  }
  
  public static boolean remove(Runnable paramRunnable)
  {
    return cjw().Z(paramRunnable);
  }
  
  public final void R(Runnable paramRunnable)
  {
    for (;;)
    {
      synchronized (this.lock)
      {
        paramRunnable = (g)paramRunnable;
        Iterator localIterator = this.sKX.keySet().iterator();
        if (localIterator != null)
        {
          if (!localIterator.hasNext()) {
            break label251;
          }
          g localg = (g)localIterator.next();
          if ((localg == null) || (!localg.equals(paramRunnable))) {
            continue;
          }
          localIterator.remove();
          i = 1;
          if (i != 0)
          {
            localIterator = new ArrayList(this.sKY).iterator();
            if (localIterator.hasNext()) {
              ((c)localIterator.next()).B(paramRunnable.sHb);
            }
          }
        }
      }
      int i = this.sKS.getActiveCount();
      int j = this.sKS.getQueue().size();
      int k = this.sKS.getCorePoolSize();
      if ((i == 1) && (j == 0))
      {
        if (k > 0)
        {
          this.sKT = cjx();
          this.sKS.setCorePoolSize(0);
          this.sKS.setMaximumPoolSize(this.sKT + 2);
        }
        paramRunnable = new ArrayList(this.sKY).iterator();
        while (paramRunnable.hasNext()) {
          paramRunnable.next();
        }
        this.bGv = false;
      }
      return;
      label251:
      i = 0;
    }
  }
  
  public final void beforeExecute(Thread paramThread, Runnable paramRunnable)
  {
    int i = 10;
    for (;;)
    {
      Object localObject2;
      int j;
      synchronized (this.lock)
      {
        localObject2 = this.sKW.iterator();
        if (localObject2 == null) {
          break label216;
        }
        paramRunnable = (g)paramRunnable;
        j = paramRunnable.priority;
        if (j <= 0)
        {
          i = 1;
          paramThread.setPriority(i);
          paramThread.setName(paramRunnable.jGC);
          if (!((Iterator)localObject2).hasNext()) {
            break label220;
          }
          g localg = (g)((Iterator)localObject2).next();
          if ((localg == null) || (!localg.equals(paramRunnable))) {
            continue;
          }
          ((Iterator)localObject2).remove();
          i = 1;
          if (i == 0) {
            break label216;
          }
          this.sKX.put(paramRunnable, paramThread);
          paramThread = new ArrayList(this.sKY);
          if (this.bGv) {
            break label181;
          }
          localObject2 = paramThread.iterator();
          if (!((Iterator)localObject2).hasNext()) {
            break label181;
          }
          ((Iterator)localObject2).next();
        }
      }
      if (j <= 10)
      {
        i = j;
        continue;
        label181:
        this.bGv = true;
        paramThread = paramThread.iterator();
        while (paramThread.hasNext())
        {
          paramThread.next();
          localObject2 = paramRunnable.sHb;
        }
        label216:
        return;
        label220:
        i = 0;
      }
    }
  }
  
  final class a
    implements c
  {
    private final Runnable r;
    
    public a(Runnable paramRunnable)
    {
      this.r = paramRunnable;
    }
    
    public final void B(Runnable arg1)
    {
      if (???.equals(this.r)) {
        synchronized (this.r)
        {
          this.r.notifyAll();
          e.c(this);
          return;
        }
      }
    }
  }
  
  public static abstract interface b {}
  
  final class c
    extends ag
  {
    public c(Looper paramLooper)
    {
      super();
    }
    
    public final void handleMessage(Message arg1)
    {
      switch (???.what)
      {
      default: 
        return;
      }
      removeMessages(???.what);
      if (e.this.bPd)
      {
        long l = System.currentTimeMillis();
        e locale;
        if ((e.ty() > 0L) && (Math.abs(e.sLe - l) > e.ty()))
        {
          x.i("MicroMsg.ThreadPool", "|MMThreadPool thread pool is auto wakeup");
          locale = e.this;
        }
        synchronized (locale.lock)
        {
          locale.bPd = false;
          e.sLe = 0L;
          e.sLd = 0L;
          sendEmptyMessageDelayed(1, 1000L);
          return;
        }
      }
      e.a(e.this);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/sdk/f/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */