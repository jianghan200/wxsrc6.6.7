package com.tencent.mm.kernel.a;

import android.os.Looper;
import com.tencent.mm.kernel.a.b.e.b;
import com.tencent.mm.kernel.a.b.f.a;
import com.tencent.mm.kernel.e.c;
import com.tencent.mm.sdk.platformtools.x;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

public final class c
  implements com.tencent.mm.kernel.api.c, com.tencent.mm.kernel.api.e, com.tencent.mm.kernel.api.f
{
  private static c drA = new c();
  public static com.tencent.mm.vending.c.a<Void, f.a> drD = new com.tencent.mm.vending.c.a() {};
  public static com.tencent.mm.vending.c.a<Void, f.a> drE = new com.tencent.mm.vending.c.a() {};
  public static com.tencent.mm.vending.c.a<Void, f.a> drF = new com.tencent.mm.vending.c.a() {};
  private static Map<Integer, Map> drG = new ConcurrentHashMap();
  public volatile boolean drB = false;
  private AtomicBoolean drC = new AtomicBoolean(false);
  private Set<Looper> drH = new HashSet();
  private ConcurrentHashMap<Object, e> drI = new ConcurrentHashMap();
  public ConcurrentHashMap drJ = new ConcurrentHashMap();
  private boolean drs = true;
  public final com.tencent.mm.kernel.a.b.g drt = new com.tencent.mm.kernel.a.b.g();
  public final com.tencent.mm.kernel.a.b.g dru = new com.tencent.mm.kernel.a.b.g();
  public final com.tencent.mm.kernel.a.b.g drv = new com.tencent.mm.kernel.a.b.g();
  public final b drw = new b((byte)0);
  public final c drx = new c();
  public final a dry = new a();
  public final d drz = new d();
  
  public static c Et()
  {
    return drA;
  }
  
  private static void a(com.tencent.mm.kernel.a.b.g paramg)
  {
    Object localObject1 = new HashMap();
    Object localObject2 = paramg.dsG.values().iterator();
    Object localObject3;
    Object localObject4;
    while (((Iterator)localObject2).hasNext())
    {
      localObject3 = (com.tencent.mm.kernel.a.b.f)((Iterator)localObject2).next();
      localObject4 = ((com.tencent.mm.kernel.a.b.f)localObject3).EK();
      if (((List)localObject4).size() > 0) {
        ((Map)localObject1).put(localObject3, localObject4);
      }
    }
    if (((Map)localObject1).size() > 0) {}
    for (boolean bool = true;; bool = false)
    {
      x.i("MicroMsg.CallbacksProxy", "do parallels result check, %s for %s", new Object[] { Boolean.valueOf(bool), paramg });
      if (((Map)localObject1).size() <= 0) {
        return;
      }
      com.tencent.mm.blink.a.j(0L, 1L);
      paramg = new HashMap();
      localObject2 = new StringBuilder();
      localObject3 = ((Map)localObject1).keySet().iterator();
      while (((Iterator)localObject3).hasNext())
      {
        localObject4 = (com.tencent.mm.kernel.a.b.f)((Iterator)localObject3).next();
        List localList = (List)((Map)localObject1).get(localObject4);
        ((StringBuilder)localObject2).append(((com.tencent.mm.kernel.a.b.f)localObject4).dsv);
        ((StringBuilder)localObject2).append(" : ");
        ((StringBuilder)localObject2).append(localList.toString());
        ((StringBuilder)localObject2).append("\n");
      }
    }
    localObject1 = ((StringBuilder)localObject2).toString();
    x.e("MicroMsg.CallbacksProxy", "unconsumed message %s", new Object[] { localObject1 });
    x.e("MicroMsg.CallbacksProxy", "maybe cycle dependencies");
    com.tencent.mm.plugin.report.f.mDy.c("BlinkStartup", (String)localObject1, paramg);
  }
  
  public static boolean a(com.tencent.mm.kernel.a.b.g paramg, Class paramClass, Object paramObject)
  {
    paramg = (f.a)paramg.s(paramClass).aK(paramObject);
    if (paramg == null) {
      return false;
    }
    return paramg.dsc;
  }
  
  public final void Ep()
  {
    this.drz.Ep();
  }
  
  public final void Eu()
  {
    com.tencent.mm.blink.a.ey("initializePendingPlugins");
    Object localObject1;
    if (this.drC.compareAndSet(false, true))
    {
      x.i("MicroMsg.CallbacksProxy", "initialize pending plugins.");
      localObject1 = drA;
      Object localObject2 = com.tencent.mm.kernel.g.Ee().DL().iterator();
      while (((Iterator)localObject2).hasNext()) {
        ((c)localObject1).aG((com.tencent.mm.kernel.b.f)((Iterator)localObject2).next());
      }
      com.tencent.mm.blink.a.ey("makePluginsParallelsDependency");
      localObject1 = this.drJ.keySet().iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = ((Iterator)localObject1).next();
        com.tencent.mm.kernel.g.Ek().a((com.tencent.mm.kernel.b.h)com.tencent.mm.kernel.g.Ef().DM(), localObject2);
        drA.aG(localObject2);
      }
      com.tencent.mm.blink.a.ey("configureAndExecutePendingPlugins");
      this.dru.b(com.tencent.mm.kernel.b.b.class, false);
      com.tencent.mm.kernel.a.b.e.EE().a(new e.b(), drD, this.dru, "configure-functional from pending plugins");
      this.drt.b(com.tencent.mm.kernel.a.c.b.class, false);
      com.tencent.mm.kernel.a.b.e.EE().a(new e.b(), drE, this.drt, "task-functional from pending plugins");
      com.tencent.mm.blink.a.ey("configureAndExecutePendingPlugins done");
      if ((((com.tencent.mm.kernel.b.h)com.tencent.mm.kernel.g.Ef().DM()).ES()) && (com.tencent.mm.kernel.g.Eg().Dx())) {
        break label328;
      }
    }
    for (;;)
    {
      this.drB = true;
      if (((com.tencent.mm.kernel.b.h)com.tencent.mm.kernel.g.Ef().DM()).ES()) {
        com.tencent.mm.kernel.g.Eg().Do();
      }
      com.tencent.mm.blink.a.ey("initializePendingPlugins done");
      if (((com.tencent.mm.protocal.d.qVQ) || (com.tencent.mm.protocal.d.qVP)) && (((com.tencent.mm.kernel.b.h)com.tencent.mm.kernel.g.Ef().DM()).ES()) && (com.tencent.mm.kernel.g.Eg().Dx()))
      {
        a(this.drt);
        a(this.dru);
        a(this.drv);
      }
      com.tencent.mm.blink.a.ey("checkAllUnConsumed done");
      return;
      label328:
      this.drv.b(com.tencent.mm.kernel.api.h.class, false);
      localObject1 = com.tencent.mm.kernel.a.b.e.EE();
      ((com.tencent.mm.kernel.a.b.e)localObject1).a(new e.b(), drF, this.drv);
      this.drv.EQ();
      ((com.tencent.mm.kernel.a.b.e)localObject1).start("account-init from pending plugins");
      ((com.tencent.mm.kernel.a.b.e)localObject1).EG();
    }
  }
  
  public final void aG(Object paramObject)
  {
    if (!((com.tencent.mm.kernel.b.h)com.tencent.mm.kernel.g.Ef().DM()).ES())
    {
      x.d("MicroMsg.CallbacksProxy", "Not main process, skip making parallels dependencies.");
      return;
    }
    if (com.tencent.mm.kernel.f.aE(paramObject))
    {
      x.printErrStackTrace("MicroMsg.CallbacksProxy", new RuntimeException(), "Found dummy subject!", new Object[0]);
      return;
    }
    this.drv.aP(paramObject);
  }
  
  /* Error */
  public final void aH(Object paramObject)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 136	com/tencent/mm/kernel/a/c:drC	Ljava/util/concurrent/atomic/AtomicBoolean;
    //   4: invokevirtual 498	java/util/concurrent/atomic/AtomicBoolean:get	()Z
    //   7: ifeq +10 -> 17
    //   10: aload_0
    //   11: getfield 129	com/tencent/mm/kernel/a/c:drB	Z
    //   14: ifeq +4 -> 18
    //   17: return
    //   18: invokestatic 393	com/tencent/mm/kernel/g:Ef	()Lcom/tencent/mm/kernel/d;
    //   21: invokevirtual 399	com/tencent/mm/kernel/d:DM	()Lcom/tencent/mm/kernel/b/g;
    //   24: checkcast 401	com/tencent/mm/kernel/b/h
    //   27: invokevirtual 432	com/tencent/mm/kernel/b/h:ES	()Z
    //   30: ifne +26 -> 56
    //   33: iconst_0
    //   34: istore_2
    //   35: iload_2
    //   36: ifne +88 -> 124
    //   39: ldc -61
    //   41: ldc_w 500
    //   44: iconst_1
    //   45: anewarray 4	java/lang/Object
    //   48: dup
    //   49: iconst_0
    //   50: aload_1
    //   51: aastore
    //   52: invokestatic 502	com/tencent/mm/sdk/platformtools/x:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   55: return
    //   56: aload_0
    //   57: getfield 141	com/tencent/mm/kernel/a/c:drH	Ljava/util/Set;
    //   60: invokestatic 508	android/os/Looper:myLooper	()Landroid/os/Looper;
    //   63: invokeinterface 511 2 0
    //   68: ifeq +26 -> 94
    //   71: ldc -61
    //   73: ldc_w 513
    //   76: iconst_1
    //   77: anewarray 4	java/lang/Object
    //   80: dup
    //   81: iconst_0
    //   82: invokestatic 508	android/os/Looper:myLooper	()Landroid/os/Looper;
    //   85: aastore
    //   86: invokestatic 502	com/tencent/mm/sdk/platformtools/x:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   89: iconst_0
    //   90: istore_2
    //   91: goto -56 -> 35
    //   94: invokestatic 389	com/tencent/mm/kernel/g:Ek	()Lcom/tencent/mm/kernel/g;
    //   97: getfield 517	com/tencent/mm/kernel/g:dqL	Lcom/tencent/mm/kernel/h;
    //   100: getfield 522	com/tencent/mm/kernel/h:drf	Z
    //   103: ifne +16 -> 119
    //   106: ldc -61
    //   108: ldc_w 524
    //   111: invokestatic 258	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   114: iconst_0
    //   115: istore_2
    //   116: goto -81 -> 35
    //   119: iconst_1
    //   120: istore_2
    //   121: goto -86 -> 35
    //   124: aload_0
    //   125: getfield 143	com/tencent/mm/kernel/a/c:drI	Ljava/util/concurrent/ConcurrentHashMap;
    //   128: aload_1
    //   129: invokevirtual 525	java/util/concurrent/ConcurrentHashMap:containsKey	(Ljava/lang/Object;)Z
    //   132: ifne +19 -> 151
    //   135: aload_0
    //   136: getfield 143	com/tencent/mm/kernel/a/c:drI	Ljava/util/concurrent/ConcurrentHashMap;
    //   139: aload_1
    //   140: new 44	com/tencent/mm/kernel/a/c$e
    //   143: dup
    //   144: invokespecial 526	com/tencent/mm/kernel/a/c$e:<init>	()V
    //   147: invokevirtual 529	java/util/concurrent/ConcurrentHashMap:putIfAbsent	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   150: pop
    //   151: aload_0
    //   152: getfield 143	com/tencent/mm/kernel/a/c:drI	Ljava/util/concurrent/ConcurrentHashMap;
    //   155: aload_1
    //   156: invokevirtual 530	java/util/concurrent/ConcurrentHashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   159: checkcast 44	com/tencent/mm/kernel/a/c$e
    //   162: astore 5
    //   164: aload 5
    //   166: invokevirtual 533	com/tencent/mm/kernel/a/c$e:Ev	()Z
    //   169: ifeq -152 -> 17
    //   172: invokestatic 539	java/lang/System:currentTimeMillis	()J
    //   175: lstore_3
    //   176: ldc -61
    //   178: ldc_w 541
    //   181: iconst_1
    //   182: anewarray 4	java/lang/Object
    //   185: dup
    //   186: iconst_0
    //   187: aload_1
    //   188: aastore
    //   189: invokestatic 209	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   192: ldc -61
    //   194: new 485	java/lang/RuntimeException
    //   197: dup
    //   198: invokespecial 486	java/lang/RuntimeException:<init>	()V
    //   201: ldc_w 543
    //   204: iconst_0
    //   205: anewarray 4	java/lang/Object
    //   208: invokestatic 492	com/tencent/mm/sdk/platformtools/x:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   211: aload_0
    //   212: getfield 113	com/tencent/mm/kernel/a/c:drv	Lcom/tencent/mm/kernel/a/b/g;
    //   215: getfield 546	com/tencent/mm/kernel/a/b/g:dsM	Ljava/util/concurrent/ConcurrentHashMap;
    //   218: aload_1
    //   219: invokevirtual 530	java/util/concurrent/ConcurrentHashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   222: checkcast 548	com/tencent/mm/kernel/a/b/g$a
    //   225: astore 6
    //   227: aload 6
    //   229: ifnull +171 -> 400
    //   232: aload 6
    //   234: invokevirtual 551	com/tencent/mm/kernel/a/b/g$a:ER	()Z
    //   237: ifeq +163 -> 400
    //   240: iconst_1
    //   241: istore_2
    //   242: iload_2
    //   243: ifne +19 -> 262
    //   246: ldc -61
    //   248: ldc_w 553
    //   251: invokestatic 258	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   254: aload_0
    //   255: getfield 113	com/tencent/mm/kernel/a/c:drv	Lcom/tencent/mm/kernel/a/b/g;
    //   258: aload_1
    //   259: invokevirtual 495	com/tencent/mm/kernel/a/b/g:aP	(Ljava/lang/Object;)V
    //   262: aload 5
    //   264: iconst_1
    //   265: invokevirtual 557	com/tencent/mm/kernel/a/c$e:gK	(I)V
    //   268: aload_1
    //   269: instanceof 378
    //   272: ifeq +77 -> 349
    //   275: aload_1
    //   276: checkcast 378	com/tencent/mm/kernel/b/f
    //   279: invokevirtual 560	com/tencent/mm/kernel/b/f:isConfigured	()Z
    //   282: ifne +35 -> 317
    //   285: aload_0
    //   286: getfield 111	com/tencent/mm/kernel/a/c:dru	Lcom/tencent/mm/kernel/a/b/g;
    //   289: ldc_w 408
    //   292: invokevirtual 333	com/tencent/mm/kernel/a/b/g:s	(Ljava/lang/Class;)Lcom/tencent/mm/kernel/a/b/f;
    //   295: aload_1
    //   296: checkcast 408	com/tencent/mm/kernel/b/b
    //   299: invokevirtual 564	com/tencent/mm/kernel/a/b/f:aO	(Ljava/lang/Object;)Lcom/tencent/mm/kernel/a/b/f$a;
    //   302: astore 6
    //   304: aload 6
    //   306: invokestatic 569	junit/framework/Assert:assertNotNull	(Ljava/lang/Object;)V
    //   309: aload 6
    //   311: getstatic 89	com/tencent/mm/kernel/a/c:drD	Lcom/tencent/mm/vending/c/a;
    //   314: invokevirtual 572	com/tencent/mm/kernel/a/b/f$a:a	(Lcom/tencent/mm/vending/c/a;)V
    //   317: aload_0
    //   318: getfield 109	com/tencent/mm/kernel/a/c:drt	Lcom/tencent/mm/kernel/a/b/g;
    //   321: ldc_w 284
    //   324: invokevirtual 333	com/tencent/mm/kernel/a/b/g:s	(Ljava/lang/Class;)Lcom/tencent/mm/kernel/a/b/f;
    //   327: aload_1
    //   328: checkcast 284	com/tencent/mm/kernel/a/c/b
    //   331: invokevirtual 564	com/tencent/mm/kernel/a/b/f:aO	(Ljava/lang/Object;)Lcom/tencent/mm/kernel/a/b/f$a;
    //   334: astore 6
    //   336: aload 6
    //   338: invokestatic 569	junit/framework/Assert:assertNotNull	(Ljava/lang/Object;)V
    //   341: aload 6
    //   343: getstatic 92	com/tencent/mm/kernel/a/c:drE	Lcom/tencent/mm/vending/c/a;
    //   346: invokevirtual 572	com/tencent/mm/kernel/a/b/f$a:a	(Lcom/tencent/mm/vending/c/a;)V
    //   349: invokestatic 436	com/tencent/mm/kernel/g:Eg	()Lcom/tencent/mm/kernel/a;
    //   352: invokevirtual 441	com/tencent/mm/kernel/a:Dx	()Z
    //   355: ifne +50 -> 405
    //   358: ldc -61
    //   360: ldc_w 574
    //   363: invokestatic 366	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   366: aload 5
    //   368: iconst_2
    //   369: invokevirtual 557	com/tencent/mm/kernel/a/c$e:gK	(I)V
    //   372: ldc -61
    //   374: ldc_w 576
    //   377: iconst_2
    //   378: anewarray 4	java/lang/Object
    //   381: dup
    //   382: iconst_0
    //   383: aload_1
    //   384: aastore
    //   385: dup
    //   386: iconst_1
    //   387: invokestatic 539	java/lang/System:currentTimeMillis	()J
    //   390: lload_3
    //   391: lsub
    //   392: invokestatic 581	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   395: aastore
    //   396: invokestatic 209	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   399: return
    //   400: iconst_0
    //   401: istore_2
    //   402: goto -160 -> 242
    //   405: aload_1
    //   406: instanceof 460
    //   409: ifeq +35 -> 444
    //   412: aload_0
    //   413: getfield 113	com/tencent/mm/kernel/a/c:drv	Lcom/tencent/mm/kernel/a/b/g;
    //   416: ldc_w 460
    //   419: invokevirtual 333	com/tencent/mm/kernel/a/b/g:s	(Ljava/lang/Class;)Lcom/tencent/mm/kernel/a/b/f;
    //   422: aload_1
    //   423: checkcast 460	com/tencent/mm/kernel/api/h
    //   426: invokevirtual 564	com/tencent/mm/kernel/a/b/f:aO	(Ljava/lang/Object;)Lcom/tencent/mm/kernel/a/b/f$a;
    //   429: astore 6
    //   431: aload 6
    //   433: invokestatic 569	junit/framework/Assert:assertNotNull	(Ljava/lang/Object;)V
    //   436: aload 6
    //   438: getstatic 95	com/tencent/mm/kernel/a/c:drF	Lcom/tencent/mm/vending/c/a;
    //   441: invokevirtual 572	com/tencent/mm/kernel/a/b/f$a:a	(Lcom/tencent/mm/vending/c/a;)V
    //   444: aload_1
    //   445: instanceof 321
    //   448: ifeq +35 -> 483
    //   451: aload_0
    //   452: getfield 113	com/tencent/mm/kernel/a/c:drv	Lcom/tencent/mm/kernel/a/b/g;
    //   455: ldc_w 321
    //   458: invokevirtual 333	com/tencent/mm/kernel/a/b/g:s	(Ljava/lang/Class;)Lcom/tencent/mm/kernel/a/b/f;
    //   461: aload_1
    //   462: checkcast 321	com/tencent/mm/kernel/api/a
    //   465: invokevirtual 564	com/tencent/mm/kernel/a/b/f:aO	(Ljava/lang/Object;)Lcom/tencent/mm/kernel/a/b/f$a;
    //   468: astore 6
    //   470: aload 6
    //   472: invokestatic 569	junit/framework/Assert:assertNotNull	(Ljava/lang/Object;)V
    //   475: aload 6
    //   477: getstatic 95	com/tencent/mm/kernel/a/c:drF	Lcom/tencent/mm/vending/c/a;
    //   480: invokevirtual 572	com/tencent/mm/kernel/a/b/f$a:a	(Lcom/tencent/mm/vending/c/a;)V
    //   483: aload_1
    //   484: instanceof 583
    //   487: ifeq +35 -> 522
    //   490: aload_0
    //   491: getfield 113	com/tencent/mm/kernel/a/c:drv	Lcom/tencent/mm/kernel/a/b/g;
    //   494: ldc_w 583
    //   497: invokevirtual 333	com/tencent/mm/kernel/a/b/g:s	(Ljava/lang/Class;)Lcom/tencent/mm/kernel/a/b/f;
    //   500: aload_1
    //   501: checkcast 583	com/tencent/mm/model/ai
    //   504: invokevirtual 564	com/tencent/mm/kernel/a/b/f:aO	(Ljava/lang/Object;)Lcom/tencent/mm/kernel/a/b/f$a;
    //   507: astore 6
    //   509: aload 6
    //   511: invokestatic 569	junit/framework/Assert:assertNotNull	(Ljava/lang/Object;)V
    //   514: aload 6
    //   516: getstatic 95	com/tencent/mm/kernel/a/c:drF	Lcom/tencent/mm/vending/c/a;
    //   519: invokevirtual 572	com/tencent/mm/kernel/a/b/f$a:a	(Lcom/tencent/mm/vending/c/a;)V
    //   522: aload_1
    //   523: instanceof 8
    //   526: ifeq +34 -> 560
    //   529: aload_0
    //   530: getfield 113	com/tencent/mm/kernel/a/c:drv	Lcom/tencent/mm/kernel/a/b/g;
    //   533: ldc 8
    //   535: invokevirtual 333	com/tencent/mm/kernel/a/b/g:s	(Ljava/lang/Class;)Lcom/tencent/mm/kernel/a/b/f;
    //   538: aload_1
    //   539: checkcast 8	com/tencent/mm/kernel/api/e
    //   542: invokevirtual 564	com/tencent/mm/kernel/a/b/f:aO	(Ljava/lang/Object;)Lcom/tencent/mm/kernel/a/b/f$a;
    //   545: astore 6
    //   547: aload 6
    //   549: invokestatic 569	junit/framework/Assert:assertNotNull	(Ljava/lang/Object;)V
    //   552: aload 6
    //   554: getstatic 95	com/tencent/mm/kernel/a/c:drF	Lcom/tencent/mm/vending/c/a;
    //   557: invokevirtual 572	com/tencent/mm/kernel/a/b/f$a:a	(Lcom/tencent/mm/vending/c/a;)V
    //   560: aload_1
    //   561: instanceof 6
    //   564: ifeq +34 -> 598
    //   567: aload_0
    //   568: getfield 113	com/tencent/mm/kernel/a/c:drv	Lcom/tencent/mm/kernel/a/b/g;
    //   571: ldc 6
    //   573: invokevirtual 333	com/tencent/mm/kernel/a/b/g:s	(Ljava/lang/Class;)Lcom/tencent/mm/kernel/a/b/f;
    //   576: aload_1
    //   577: checkcast 6	com/tencent/mm/kernel/api/c
    //   580: invokevirtual 564	com/tencent/mm/kernel/a/b/f:aO	(Ljava/lang/Object;)Lcom/tencent/mm/kernel/a/b/f$a;
    //   583: astore 6
    //   585: aload 6
    //   587: invokestatic 569	junit/framework/Assert:assertNotNull	(Ljava/lang/Object;)V
    //   590: aload 6
    //   592: getstatic 95	com/tencent/mm/kernel/a/c:drF	Lcom/tencent/mm/vending/c/a;
    //   595: invokevirtual 572	com/tencent/mm/kernel/a/b/f$a:a	(Lcom/tencent/mm/vending/c/a;)V
    //   598: aload 5
    //   600: iconst_2
    //   601: invokevirtual 557	com/tencent/mm/kernel/a/c$e:gK	(I)V
    //   604: ldc -61
    //   606: ldc_w 576
    //   609: iconst_2
    //   610: anewarray 4	java/lang/Object
    //   613: dup
    //   614: iconst_0
    //   615: aload_1
    //   616: aastore
    //   617: dup
    //   618: iconst_1
    //   619: invokestatic 539	java/lang/System:currentTimeMillis	()J
    //   622: lload_3
    //   623: lsub
    //   624: invokestatic 581	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   627: aastore
    //   628: invokestatic 209	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   631: return
    //   632: astore 6
    //   634: aload 5
    //   636: iconst_2
    //   637: invokevirtual 557	com/tencent/mm/kernel/a/c$e:gK	(I)V
    //   640: ldc -61
    //   642: ldc_w 576
    //   645: iconst_2
    //   646: anewarray 4	java/lang/Object
    //   649: dup
    //   650: iconst_0
    //   651: aload_1
    //   652: aastore
    //   653: dup
    //   654: iconst_1
    //   655: invokestatic 539	java/lang/System:currentTimeMillis	()J
    //   658: lload_3
    //   659: lsub
    //   660: invokestatic 581	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   663: aastore
    //   664: invokestatic 209	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   667: aload 6
    //   669: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	670	0	this	c
    //   0	670	1	paramObject	Object
    //   34	368	2	i	int
    //   175	484	3	l	long
    //   162	473	5	locale	e
    //   225	366	6	localObject1	Object
    //   632	36	6	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   262	317	632	finally
    //   317	349	632	finally
    //   349	366	632	finally
    //   405	444	632	finally
    //   444	483	632	finally
    //   483	522	632	finally
    //   522	560	632	finally
    //   560	598	632	finally
  }
  
  public final void add(Object paramObject)
  {
    if ((paramObject instanceof com.tencent.mm.kernel.api.c)) {
      this.drw.aI((com.tencent.mm.kernel.api.c)paramObject);
    }
    if ((paramObject instanceof com.tencent.mm.kernel.api.e)) {
      this.drx.aI((com.tencent.mm.kernel.api.e)paramObject);
    }
    if ((paramObject instanceof com.tencent.mm.kernel.api.b)) {
      this.dry.a((com.tencent.mm.kernel.api.b)paramObject);
    }
    if ((paramObject instanceof com.tencent.mm.kernel.api.f)) {
      this.drz.a((com.tencent.mm.kernel.api.f)paramObject);
    }
  }
  
  public final void b(Looper paramLooper)
  {
    x.i("MicroMsg.CallbacksProxy", "Thread(%s) not allow load-alone.", new Object[] { paramLooper });
    this.drH.add(paramLooper);
  }
  
  public final void gj(String paramString)
  {
    this.dry.gk(paramString);
    this.drz.gj(paramString);
  }
  
  public final void onAccountInitialized(e.c paramc)
  {
    if (this.drs)
    {
      com.tencent.mm.blink.a.ey("beforeAccountInit");
      this.drv.b(com.tencent.mm.kernel.api.c.class, true);
      paramc = com.tencent.mm.kernel.a.b.e.EE();
      paramc.a(new e.b(), drF, this.drv);
      this.drv.EQ();
      paramc.start("account-init from onAccountInitialized");
      paramc.EG();
      return;
    }
    this.drw.onAccountInitialized(paramc);
  }
  
  public final void onAccountRelease()
  {
    this.drw.onAccountRelease();
    this.drv.b(com.tencent.mm.kernel.api.h.class, true);
  }
  
  public final void onDataBaseClosed(com.tencent.mm.bt.h paramh1, com.tencent.mm.bt.h paramh2)
  {
    this.drx.onDataBaseClosed(paramh1, paramh2);
  }
  
  public final void onDataBaseOpened(com.tencent.mm.bt.h paramh1, com.tencent.mm.bt.h paramh2)
  {
    if (!this.drs) {
      this.drx.onDataBaseOpened(paramh1, paramh2);
    }
  }
  
  public static final class a
    extends com.tencent.mm.by.a<com.tencent.mm.kernel.api.b>
    implements com.tencent.mm.kernel.api.b
  {
    private boolean drL = false;
    
    private static void b(List<String> paramList, String paramString)
    {
      String[] arrayOfString = new String[paramList.size() + 1];
      arrayOfString[0] = paramString;
      int i = 0;
      while (i < paramList.size())
      {
        arrayOfString[(i + 1)] = (paramString + (String)paramList.get(i));
        i += 1;
      }
      com.tencent.mm.a.e.d(arrayOfString);
    }
    
    public final com.tencent.mm.vending.b.b<com.tencent.mm.kernel.api.b> a(com.tencent.mm.kernel.api.b paramb)
    {
      try
      {
        com.tencent.mm.vending.b.b localb = super.aI(paramb);
        if (this.drL)
        {
          List localList = paramb.collectStoragePaths();
          if ((localList != null) && (localList.size() > 0)) {
            b(localList, com.tencent.mm.kernel.g.Ei().dqp);
          }
          x.i("MicroMsg.CallbacksProxy", "collectStoragePaths has been called. cb %s", new Object[] { paramb });
        }
        return localb;
      }
      finally {}
    }
    
    public final List<String> collectStoragePaths()
    {
      Object localObject1 = cBB();
      LinkedList localLinkedList = new LinkedList();
      localObject1 = ((LinkedList)localObject1).iterator();
      while (((Iterator)localObject1).hasNext())
      {
        Object localObject2 = (com.tencent.mm.vending.b.b)((Iterator)localObject1).next();
        if (localObject2 != null)
        {
          localObject2 = ((com.tencent.mm.kernel.api.b)((com.tencent.mm.vending.b.b)localObject2).uQB).collectStoragePaths();
          if (localObject2 != null) {
            localLinkedList.addAll((Collection)localObject2);
          }
        }
      }
      return localLinkedList;
    }
    
    public final void gk(String paramString)
    {
      try
      {
        List localList = collectStoragePaths();
        this.drL = true;
        x.i("MicroMsg.CallbacksProxy", "all account storage folder %s", new Object[] { localList.toString() });
        b(localList, paramString);
        return;
      }
      finally
      {
        paramString = finally;
        throw paramString;
      }
    }
  }
  
  private static final class b
    extends com.tencent.mm.by.a<com.tencent.mm.kernel.api.c>
    implements com.tencent.mm.kernel.api.c
  {
    public final void onAccountInitialized(final e.c paramc)
    {
      a(new com.tencent.mm.by.a.a() {});
    }
    
    public final void onAccountRelease()
    {
      a(new com.tencent.mm.by.a.a() {});
    }
  }
  
  public static final class c
    extends com.tencent.mm.by.a<com.tencent.mm.kernel.api.e>
    implements com.tencent.mm.kernel.api.e
  {
    public final void onDataBaseClosed(final com.tencent.mm.bt.h paramh1, final com.tencent.mm.bt.h paramh2)
    {
      a(new com.tencent.mm.by.a.a() {});
    }
    
    public final void onDataBaseOpened(final com.tencent.mm.bt.h paramh1, final com.tencent.mm.bt.h paramh2)
    {
      a(new com.tencent.mm.by.a.a() {});
    }
  }
  
  public static final class d
    extends com.tencent.mm.by.a<com.tencent.mm.kernel.api.f>
    implements com.tencent.mm.kernel.api.f
  {
    private boolean drR = false;
    private String drS;
    
    public final void Ep()
    {
      a(new com.tencent.mm.by.a.a() {});
    }
    
    public final com.tencent.mm.vending.b.b<com.tencent.mm.kernel.api.f> a(com.tencent.mm.kernel.api.f paramf)
    {
      try
      {
        com.tencent.mm.vending.b.b localb = super.aI(paramf);
        if (this.drR)
        {
          paramf.gj(this.drS);
          x.i("MicroMsg.CallbacksProxy", "onAccountPathChanged has been called. cb %s", new Object[] { paramf });
        }
        return localb;
      }
      finally
      {
        paramf = finally;
        throw paramf;
      }
    }
    
    public final void gj(final String paramString)
    {
      try
      {
        a(new com.tencent.mm.by.a.a() {});
        this.drR = true;
        this.drS = paramString;
        return;
      }
      finally
      {
        paramString = finally;
        throw paramString;
      }
    }
  }
  
  private static final class e
  {
    private long drV = 0L;
    private int mStatus = 0;
    
    /* Error */
    public final boolean Ev()
    {
      // Byte code:
      //   0: iconst_0
      //   1: istore_2
      //   2: aload_0
      //   3: monitorenter
      //   4: aload_0
      //   5: getfield 19	com/tencent/mm/kernel/a/c$e:mStatus	I
      //   8: iconst_1
      //   9: if_icmpne +27 -> 36
      //   12: aload_0
      //   13: getfield 17	com/tencent/mm/kernel/a/c$e:drV	J
      //   16: lstore_3
      //   17: invokestatic 25	java/lang/Thread:currentThread	()Ljava/lang/Thread;
      //   20: invokevirtual 29	java/lang/Thread:getId	()J
      //   23: lstore 5
      //   25: lload_3
      //   26: lload 5
      //   28: lcmp
      //   29: ifne +7 -> 36
      //   32: aload_0
      //   33: monitorexit
      //   34: iload_2
      //   35: ireturn
      //   36: aload_0
      //   37: getfield 19	com/tencent/mm/kernel/a/c$e:mStatus	I
      //   40: istore_1
      //   41: iload_1
      //   42: iconst_2
      //   43: if_icmpeq -11 -> 32
      //   46: iconst_1
      //   47: istore_2
      //   48: goto -16 -> 32
      //   51: astore 7
      //   53: aload_0
      //   54: monitorexit
      //   55: aload 7
      //   57: athrow
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	58	0	this	e
      //   40	4	1	i	int
      //   1	47	2	bool	boolean
      //   16	10	3	l1	long
      //   23	4	5	l2	long
      //   51	5	7	localObject	Object
      // Exception table:
      //   from	to	target	type
      //   4	25	51	finally
      //   36	41	51	finally
    }
    
    public final void gK(int paramInt)
    {
      try
      {
        if (paramInt > this.mStatus) {
          this.mStatus = paramInt;
        }
        return;
      }
      finally
      {
        localObject = finally;
        throw ((Throwable)localObject);
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/kernel/a/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */