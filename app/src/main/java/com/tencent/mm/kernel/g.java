package com.tencent.mm.kernel;

import android.os.SystemClock;
import com.tencent.mm.ab.o.a;
import com.tencent.mm.by.a.a;
import com.tencent.mm.kernel.a.c.b;
import com.tencent.mm.kernel.a.c.c;
import com.tencent.mm.kernel.a.c.d;
import com.tencent.mm.model.by;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ah.b;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.ao;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.tinker.loader.app.ApplicationLifeCycle;
import java.util.concurrent.ConcurrentHashMap;
import junit.framework.Assert;

public final class g
{
  private static g dqK;
  public final b.a dpO = new b.a();
  public h<com.tencent.mm.kernel.b.h> dqL;
  private ah dqM;
  private by dqN = null;
  public e dqO;
  public a dqP;
  public b dqQ;
  public com.tencent.mm.bs.b dqR;
  public final a dqS = new a((byte)0);
  private final boolean dqT;
  private ConcurrentHashMap dqU = new ConcurrentHashMap();
  public volatile boolean dqV = false;
  
  private g(final com.tencent.mm.kernel.b.h paramh)
  {
    this.dqL = h.c(paramh);
    this.dqT = ((com.tencent.mm.kernel.b.h)this.dqL.Ef().DM()).ES();
    if (this.dqT)
    {
      this.dqN = new by();
      this.dqM = new ah("worker");
      this.dqM.H(new Runnable()
      {
        public final void run()
        {
          ao.fL(ad.getContext());
        }
      });
    }
    this.dqL.Ee().dqf = new c.a()
    {
      public final void b(com.tencent.mm.kernel.b.f paramAnonymousf)
      {
        g.this.a(paramh, paramAnonymousf);
      }
      
      public final void b(com.tencent.mm.kernel.c.a paramAnonymousa)
      {
        g.this.a(paramh, paramAnonymousa);
        com.tencent.mm.kernel.a.c.Et().aG(paramAnonymousa);
      }
      
      public final void c(com.tencent.mm.kernel.b.f paramAnonymousf)
      {
        com.tencent.mm.kernel.a.c localc = com.tencent.mm.kernel.a.c.Et();
        if (paramAnonymousf != null) {
          localc.aH(paramAnonymousf);
        }
      }
      
      public final void c(com.tencent.mm.kernel.c.a paramAnonymousa)
      {
        g localg = g.this;
        com.tencent.mm.kernel.b.h localh = paramh;
        Object localObject = com.tencent.mm.kernel.a.c.Et();
        if ((paramAnonymousa instanceof com.tencent.mm.kernel.api.c)) {
          ((com.tencent.mm.kernel.a.c)localObject).drw.remove((com.tencent.mm.kernel.api.c)paramAnonymousa);
        }
        if ((paramAnonymousa instanceof com.tencent.mm.kernel.api.e)) {
          ((com.tencent.mm.kernel.a.c)localObject).drx.remove((com.tencent.mm.kernel.api.e)paramAnonymousa);
        }
        if ((paramAnonymousa instanceof com.tencent.mm.kernel.api.b)) {
          ((com.tencent.mm.kernel.a.c)localObject).dry.remove((com.tencent.mm.kernel.api.b)paramAnonymousa);
        }
        if ((paramAnonymousa instanceof com.tencent.mm.kernel.api.f)) {
          ((com.tencent.mm.kernel.a.c)localObject).drz.remove((com.tencent.mm.kernel.api.f)paramAnonymousa);
        }
        if ((paramAnonymousa instanceof ApplicationLifeCycle))
        {
          localObject = (ApplicationLifeCycle)paramAnonymousa;
          localh.dsT.remove(localObject);
        }
        if ((paramAnonymousa instanceof com.tencent.mm.kernel.api.d)) {
          localg.dpO.remove((com.tencent.mm.kernel.api.d)paramAnonymousa);
        }
        if ((paramAnonymousa instanceof com.tencent.mm.kernel.api.g)) {
          localg.dqL.b((com.tencent.mm.kernel.api.g)paramAnonymousa);
        }
      }
      
      public final void d(com.tencent.mm.kernel.c.a paramAnonymousa)
      {
        com.tencent.mm.kernel.a.c localc = com.tencent.mm.kernel.a.c.Et();
        if (paramAnonymousa != null) {
          localc.aH(paramAnonymousa);
        }
      }
    };
  }
  
  public static com.tencent.mm.ab.o DF()
  {
    Ek();
    return Eh().dpP;
  }
  
  public static c Ee()
  {
    Assert.assertNotNull("mCorePlugins not initialized!", Ek().dqL.Ee());
    return Ek().dqL.Ee();
  }
  
  public static d<com.tencent.mm.kernel.b.h> Ef()
  {
    Assert.assertNotNull("mCoreProcess not initialized!", Ek().dqL.Ef());
    return Ek().dqL.Ef();
  }
  
  public static a Eg()
  {
    Assert.assertNotNull("mCoreAccount not initialized!", Ek().dqP);
    return Ek().dqP;
  }
  
  public static b Eh()
  {
    Assert.assertNotNull("mCoreNetwork not initialized!", Ek().dqQ);
    return Ek().dqQ;
  }
  
  public static e Ei()
  {
    Assert.assertNotNull("mCoreStorage not initialized!", Ek().dqO);
    return Ek().dqO;
  }
  
  public static com.tencent.mm.bs.b Ej()
  {
    Assert.assertNotNull("mCoreStatus not initialized!", Ek().dqR);
    return Ek().dqR;
  }
  
  public static g Ek()
  {
    Assert.assertNotNull("Kernel not initialized by MMApplication!", dqK);
    return dqK;
  }
  
  public static by El()
  {
    Assert.assertTrue(Ek().dqT);
    return Ek().dqN;
  }
  
  public static ah Em()
  {
    Assert.assertTrue(Ek().dqT);
    return Ek().dqM;
  }
  
  /* Error */
  public static void a(com.tencent.mm.kernel.b.h paramh)
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: getstatic 182	com/tencent/mm/kernel/g:dqK	Lcom/tencent/mm/kernel/g;
    //   6: ifnull +48 -> 54
    //   9: getstatic 182	com/tencent/mm/kernel/g:dqK	Lcom/tencent/mm/kernel/g;
    //   12: getfield 77	com/tencent/mm/kernel/g:dqL	Lcom/tencent/mm/kernel/h;
    //   15: invokevirtual 81	com/tencent/mm/kernel/h:Ef	()Lcom/tencent/mm/kernel/d;
    //   18: invokevirtual 87	com/tencent/mm/kernel/d:DM	()Lcom/tencent/mm/kernel/b/g;
    //   21: checkcast 89	com/tencent/mm/kernel/b/h
    //   24: astore_1
    //   25: aload_0
    //   26: getfield 196	com/tencent/mm/kernel/b/g:dsQ	Landroid/app/Application;
    //   29: astore_2
    //   30: aload_1
    //   31: aload_0
    //   32: getfield 200	com/tencent/mm/kernel/b/h:dsS	Lcom/tencent/tinker/loader/app/ApplicationLike;
    //   35: putfield 200	com/tencent/mm/kernel/b/h:dsS	Lcom/tencent/tinker/loader/app/ApplicationLike;
    //   38: aload_1
    //   39: aload_2
    //   40: putfield 196	com/tencent/mm/kernel/b/g:dsQ	Landroid/app/Application;
    //   43: ldc -54
    //   45: ldc -52
    //   47: invokestatic 210	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   50: ldc 2
    //   52: monitorexit
    //   53: return
    //   54: new 10	com/tencent/mm/kernel/g$3
    //   57: dup
    //   58: invokespecial 211	com/tencent/mm/kernel/g$3:<init>	()V
    //   61: invokestatic 216	com/tencent/mm/kernel/j:a	(Lcom/tencent/mm/kernel/j$a;)V
    //   64: ldc -54
    //   66: ldc -38
    //   68: invokestatic 210	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   71: new 2	com/tencent/mm/kernel/g
    //   74: dup
    //   75: aload_0
    //   76: invokespecial 220	com/tencent/mm/kernel/g:<init>	(Lcom/tencent/mm/kernel/b/h;)V
    //   79: putstatic 182	com/tencent/mm/kernel/g:dqK	Lcom/tencent/mm/kernel/g;
    //   82: goto -32 -> 50
    //   85: astore_0
    //   86: ldc 2
    //   88: monitorexit
    //   89: aload_0
    //   90: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	91	0	paramh	com.tencent.mm.kernel.b.h
    //   24	15	1	localh	com.tencent.mm.kernel.b.h
    //   29	11	2	localApplication	android.app.Application
    // Exception table:
    //   from	to	target	type
    //   3	50	85	finally
    //   54	82	85	finally
  }
  
  public static <T extends com.tencent.mm.kernel.c.a, N extends T> void a(Class<T> paramClass, N paramN)
  {
    Ek();
    Ee().a(paramClass, new com.tencent.mm.kernel.c.e(paramN));
  }
  
  public static <T extends com.tencent.mm.kernel.c.a, N extends T> void a(Class<T> paramClass, com.tencent.mm.kernel.c.c<N> paramc)
  {
    Ek();
    Ee().a(paramClass, paramc);
  }
  
  public static void gJ(int paramInt)
  {
    a locala = Eg();
    if ((a.gG(paramInt)) && (a.b.a(a.dpp) == paramInt) && (locala.Dx()))
    {
      com.tencent.mm.sdk.platformtools.x.w("MMKernel.CoreAccount", "loginUin, uin not changed, return :%d", new Object[] { Integer.valueOf(paramInt) });
      return;
    }
    synchronized (locala.dpo)
    {
      a.b.a(a.dpp, paramInt);
      locala.Dm();
      locala.dpB = SystemClock.elapsedRealtime();
      locala.bs(true);
      return;
    }
  }
  
  public static <T extends com.tencent.mm.kernel.c.a> T l(Class<T> paramClass)
  {
    Ek();
    return Ee().l(paramClass);
  }
  
  public static void m(Class<? extends com.tencent.mm.kernel.c.a> paramClass)
  {
    Ek();
    Ee().m(paramClass);
  }
  
  public static <T extends com.tencent.mm.kernel.b.a> T n(Class<T> paramClass)
  {
    Ek();
    return Ee().n(paramClass);
  }
  
  public final void a(com.tencent.mm.kernel.api.g paramg)
  {
    this.dqL.a(paramg);
  }
  
  public final void a(com.tencent.mm.kernel.b.h paramh, Object paramObject)
  {
    if (!this.dqU.containsKey(paramObject))
    {
      if (this.dqU.putIfAbsent(paramObject, this.dqU) == null) {
        break label60;
      }
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.MMKernel", "Already add, skip[%s].", new Object[] { paramObject });
    }
    label60:
    do
    {
      return;
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.MMKernel", "Already add, skip it[%s].", new Object[] { paramObject });
      return;
      com.tencent.mm.kernel.a.c.Et().add(paramObject);
      if ((paramObject instanceof ApplicationLifeCycle))
      {
        ApplicationLifeCycle localApplicationLifeCycle = (ApplicationLifeCycle)paramObject;
        paramh.dsT.aI(localApplicationLifeCycle);
      }
      if ((paramObject instanceof com.tencent.mm.kernel.api.d)) {
        this.dpO.aI((com.tencent.mm.kernel.api.d)paramObject);
      }
    } while (!(paramObject instanceof com.tencent.mm.kernel.api.g));
    this.dqL.a((com.tencent.mm.kernel.api.g)paramObject);
  }
  
  public final void b(com.tencent.mm.kernel.api.g paramg)
  {
    this.dqL.b(paramg);
  }
  
  public final void gi(String paramString)
  {
    com.tencent.mm.sdk.platformtools.x.w("MicroMsg.MMKernel", "logoutAccount uin:%s info:%s stack:%s", new Object[] { com.tencent.mm.a.o.getString(a.Df()), paramString, bi.cjd() });
    a.gc(bi.cjd().toString() + paramString);
    this.dqP.Dp().bc(a.Df());
    releaseAll();
    a.Dk();
    a.bt(false);
  }
  
  public final void releaseAll()
  {
    if (this.dqP != null) {}
    for (String str = com.tencent.mm.a.o.getString(a.Df());; str = "-1")
    {
      com.tencent.mm.sdk.platformtools.x.w("MicroMsg.MMKernel", "release uin:%s ", new Object[] { str });
      if (this.dqQ.dpP != null) {
        this.dqQ.dpP.reset();
      }
      if (this.dqM != null) {
        this.dqM.a(new ah.b()
        {
          public final void En()
          {
            if (g.this.dqP != null) {
              g.this.dqP.release();
            }
          }
        });
      }
      return;
    }
  }
  
  private static final class a
    extends com.tencent.mm.by.a<o.a>
    implements o.a
  {
    public final void a(final com.tencent.mm.ab.o paramo)
    {
      a(new a.a() {});
    }
    
    public final void a(final com.tencent.mm.ab.o paramo, final boolean paramBoolean)
    {
      a(new a.a() {});
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/kernel/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */