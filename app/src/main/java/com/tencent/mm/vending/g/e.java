package com.tencent.mm.vending.g;

import android.os.Looper;
import android.util.Pair;
import com.tencent.mm.vending.h.f.a;
import com.tencent.mm.vending.h.g;
import com.tencent.mm.vending.h.h;
import com.tencent.mm.vending.j.k;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;
import junit.framework.Assert;

public class e<_Var>
  implements c<_Var>
{
  private int mRetryCount = 0;
  private volatile boolean uQM = false;
  volatile d uQN = d.uRs;
  boolean uQO = false;
  private Queue<a> uQP = new LinkedList();
  private volatile com.tencent.mm.vending.h.d uQQ = this.uQR;
  private volatile com.tencent.mm.vending.h.d uQR = g.cBM();
  volatile Object uQS;
  volatile boolean uQT;
  volatile Object uQU;
  a uQV;
  a uQW;
  private long uQX = -1L;
  private boolean uQY = false;
  private b uQZ = new b();
  com.tencent.mm.vending.h.f uQz = new com.tencent.mm.vending.h.f(this.uQR, this.uRb);
  private com.tencent.mm.vending.h.d uRa;
  private f.a uRb = new f.a()
  {
    public final void cBI()
    {
      f localf = f.cBJ();
      e locale = e.this;
      Stack localStack2 = (Stack)localf.uRA.get();
      Stack localStack1 = localStack2;
      if (localStack2 == null)
      {
        localStack1 = new Stack();
        localf.uRA.set(localStack1);
      }
      localStack1.push(locale);
    }
    
    public final void cw(Object paramAnonymousObject)
    {
      ((Stack)f.cBJ().uRA.get()).pop();
      synchronized (e.this)
      {
        e.this.uQV = e.this.uQW;
        e.this.uQW = null;
        if (!e.this.uQO)
        {
          e.this.uQS = paramAnonymousObject;
          if (e.this.uQN == e.d.uRw) {
            com.tencent.mm.vending.f.a.i("Vending.Pipeline", "interrupted, just return", new Object[0]);
          }
        }
        else
        {
          com.tencent.mm.vending.f.a.i("Vending.Pipeline", "gonna retry, do not store functional result.", new Object[0]);
        }
      }
      if (e.this.uQN == e.d.uRv)
      {
        com.tencent.mm.vending.f.a.i("Vending.Pipeline", "pausing, just return.", new Object[0]);
        return;
      }
      e.this.uQN = e.d.uRt;
      e.this.cv(e.this.cu(paramAnonymousObject));
    }
    
    public final void interrupt()
    {
      e.this.mJ(true);
    }
  };
  List<Pair<d.a, com.tencent.mm.vending.h.d>> uRc;
  private List<Pair<d.b, com.tencent.mm.vending.h.d>> uRd;
  private boolean uRe = false;
  boolean uRf = false;
  private boolean uRg = false;
  private Object uRh;
  Object uRi;
  
  /* Error */
  private <_Ret> c<_Ret> a(com.tencent.mm.vending.c.a<_Ret, _Var> parama, boolean paramBoolean)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: invokespecial 131	com/tencent/mm/vending/g/e:cBG	()V
    //   6: aload_0
    //   7: getfield 87	com/tencent/mm/vending/g/e:uQP	Ljava/util/Queue;
    //   10: new 19	com/tencent/mm/vending/g/e$a
    //   13: dup
    //   14: aload_1
    //   15: aload_0
    //   16: getfield 119	com/tencent/mm/vending/g/e:uQQ	Lcom/tencent/mm/vending/h/d;
    //   19: aload_0
    //   20: getfield 93	com/tencent/mm/vending/g/e:uQX	J
    //   23: iload_2
    //   24: invokespecial 134	com/tencent/mm/vending/g/e$a:<init>	(Lcom/tencent/mm/vending/c/a;Lcom/tencent/mm/vending/h/d;JZ)V
    //   27: invokeinterface 140 2 0
    //   32: pop
    //   33: aload_0
    //   34: ldc2_w 90
    //   37: putfield 93	com/tencent/mm/vending/g/e:uQX	J
    //   40: aload_0
    //   41: getfield 80	com/tencent/mm/vending/g/e:uQN	Lcom/tencent/mm/vending/g/e$d;
    //   44: astore_1
    //   45: getstatic 78	com/tencent/mm/vending/g/e$d:uRs	Lcom/tencent/mm/vending/g/e$d;
    //   48: astore_3
    //   49: aload_1
    //   50: aload_3
    //   51: if_acmpne +7 -> 58
    //   54: aload_0
    //   55: monitorexit
    //   56: aload_0
    //   57: areturn
    //   58: aload_0
    //   59: getfield 80	com/tencent/mm/vending/g/e:uQN	Lcom/tencent/mm/vending/g/e$d;
    //   62: getstatic 143	com/tencent/mm/vending/g/e$d:uRt	Lcom/tencent/mm/vending/g/e$d;
    //   65: if_acmpeq +6 -> 71
    //   68: goto -14 -> 54
    //   71: aload_0
    //   72: aload_0
    //   73: getfield 145	com/tencent/mm/vending/g/e:uQS	Ljava/lang/Object;
    //   76: invokevirtual 149	com/tencent/mm/vending/g/e:cv	(Ljava/lang/Object;)V
    //   79: goto -25 -> 54
    //   82: astore_1
    //   83: aload_0
    //   84: monitorexit
    //   85: aload_1
    //   86: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	87	0	this	e
    //   0	87	1	parama	com.tencent.mm.vending.c.a<_Ret, _Var>
    //   0	87	2	paramBoolean	boolean
    //   48	3	3	locald	d
    // Exception table:
    //   from	to	target	type
    //   2	49	82	finally
    //   58	68	82	finally
    //   71	79	82	finally
  }
  
  /* Error */
  private void a(d.a parama, com.tencent.mm.vending.h.d paramd)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: invokevirtual 156	com/tencent/mm/vending/g/e:cBH	()Lcom/tencent/mm/vending/g/d;
    //   6: pop
    //   7: aload_0
    //   8: getfield 158	com/tencent/mm/vending/g/e:uRc	Ljava/util/List;
    //   11: ifnonnull +14 -> 25
    //   14: aload_0
    //   15: new 84	java/util/LinkedList
    //   18: dup
    //   19: invokespecial 85	java/util/LinkedList:<init>	()V
    //   22: putfield 158	com/tencent/mm/vending/g/e:uRc	Ljava/util/List;
    //   25: new 160	android/util/Pair
    //   28: dup
    //   29: aload_1
    //   30: aload_2
    //   31: invokespecial 163	android/util/Pair:<init>	(Ljava/lang/Object;Ljava/lang/Object;)V
    //   34: astore_1
    //   35: aload_0
    //   36: getfield 107	com/tencent/mm/vending/g/e:uRf	Z
    //   39: ifeq +15 -> 54
    //   42: aload_0
    //   43: aload_1
    //   44: aload_0
    //   45: getfield 165	com/tencent/mm/vending/g/e:uRi	Ljava/lang/Object;
    //   48: invokevirtual 168	com/tencent/mm/vending/g/e:a	(Landroid/util/Pair;Ljava/lang/Object;)V
    //   51: aload_0
    //   52: monitorexit
    //   53: return
    //   54: aload_0
    //   55: getfield 158	com/tencent/mm/vending/g/e:uRc	Ljava/util/List;
    //   58: aload_1
    //   59: invokeinterface 171 2 0
    //   64: pop
    //   65: goto -14 -> 51
    //   68: astore_1
    //   69: aload_0
    //   70: monitorexit
    //   71: aload_1
    //   72: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	73	0	this	e
    //   0	73	1	parama	d.a
    //   0	73	2	paramd	com.tencent.mm.vending.h.d
    // Exception table:
    //   from	to	target	type
    //   2	25	68	finally
    //   25	51	68	finally
    //   54	65	68	finally
  }
  
  /* Error */
  private void a(d.b paramb, com.tencent.mm.vending.h.d paramd)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: invokevirtual 156	com/tencent/mm/vending/g/e:cBH	()Lcom/tencent/mm/vending/g/d;
    //   6: pop
    //   7: aload_0
    //   8: aload_0
    //   9: getfield 145	com/tencent/mm/vending/g/e:uQS	Ljava/lang/Object;
    //   12: invokevirtual 149	com/tencent/mm/vending/g/e:cv	(Ljava/lang/Object;)V
    //   15: aload_0
    //   16: getfield 174	com/tencent/mm/vending/g/e:uRd	Ljava/util/List;
    //   19: ifnonnull +14 -> 33
    //   22: aload_0
    //   23: new 84	java/util/LinkedList
    //   26: dup
    //   27: invokespecial 85	java/util/LinkedList:<init>	()V
    //   30: putfield 174	com/tencent/mm/vending/g/e:uRd	Ljava/util/List;
    //   33: new 160	android/util/Pair
    //   36: dup
    //   37: aload_1
    //   38: aload_2
    //   39: invokespecial 163	android/util/Pair:<init>	(Ljava/lang/Object;Ljava/lang/Object;)V
    //   42: astore_1
    //   43: aload_0
    //   44: getfield 105	com/tencent/mm/vending/g/e:uRe	Z
    //   47: ifeq +15 -> 62
    //   50: aload_0
    //   51: aload_1
    //   52: aload_0
    //   53: getfield 176	com/tencent/mm/vending/g/e:uRh	Ljava/lang/Object;
    //   56: invokespecial 178	com/tencent/mm/vending/g/e:b	(Landroid/util/Pair;Ljava/lang/Object;)V
    //   59: aload_0
    //   60: monitorexit
    //   61: return
    //   62: aload_0
    //   63: getfield 174	com/tencent/mm/vending/g/e:uRd	Ljava/util/List;
    //   66: aload_1
    //   67: invokeinterface 171 2 0
    //   72: pop
    //   73: goto -14 -> 59
    //   76: astore_1
    //   77: aload_0
    //   78: monitorexit
    //   79: aload_1
    //   80: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	81	0	this	e
    //   0	81	1	paramb	d.b
    //   0	81	2	paramd	com.tencent.mm.vending.h.d
    // Exception table:
    //   from	to	target	type
    //   2	33	76	finally
    //   33	59	76	finally
    //   62	73	76	finally
  }
  
  private void b(final Pair<d.b, com.tencent.mm.vending.h.d> paramPair, final Object paramObject)
  {
    try
    {
      final RuntimeException localRuntimeException = new RuntimeException("object is not right: " + paramObject);
      new com.tencent.mm.vending.h.f((com.tencent.mm.vending.h.d)paramPair.second, null).a(new com.tencent.mm.vending.c.a()
      {
        private Void acs()
        {
          try
          {
            ((d.b)paramPair.first).aF(paramObject);
            return uQG;
          }
          catch (ClassCastException localClassCastException)
          {
            if (localRuntimeException.getCause() == null) {
              localRuntimeException.initCause(localClassCastException);
            }
            throw localRuntimeException;
          }
        }
      }, null, this.uQY);
      return;
    }
    finally
    {
      paramPair = finally;
      throw paramPair;
    }
  }
  
  private void cBG()
  {
    try
    {
      if (this.uQM) {
        throw new c("This Pipeline(%s) has terminate and do not allow any next().", new Object[] { this });
      }
    }
    finally {}
  }
  
  public c<_Var> a(final c.a<_Var> parama)
  {
    try
    {
      w(new Object[0]);
      a(new com.tencent.mm.vending.c.a()
      {
        public final _Var call(_Var paramAnonymous_Var)
        {
          return (_Var)parama.call();
        }
      }, true);
      return this;
    }
    finally
    {
      parama = finally;
      throw parama;
    }
  }
  
  public c<_Var> a(com.tencent.mm.vending.h.d paramd)
  {
    if (paramd == null)
    {
      Assert.assertNotNull("scheduler should not be null!", paramd);
      return this;
    }
    this.uQQ = paramd;
    return this;
  }
  
  public final d<_Var> a(d.a parama)
  {
    try
    {
      a(parama, this.uQR);
      return this;
    }
    finally
    {
      parama = finally;
      throw parama;
    }
  }
  
  public final d<_Var> a(d.b<_Var> paramb)
  {
    try
    {
      a(paramb, this.uQR);
      return this;
    }
    finally
    {
      paramb = finally;
      throw paramb;
    }
  }
  
  public final d<_Var> a(com.tencent.mm.vending.h.d paramd, d.b<_Var> paramb)
  {
    try
    {
      a(paramb, paramd);
      return this;
    }
    finally
    {
      paramd = finally;
      throw paramd;
    }
  }
  
  final void a(final Pair<d.a, com.tencent.mm.vending.h.d> paramPair, final Object paramObject)
  {
    try
    {
      com.tencent.mm.vending.h.d locald = (com.tencent.mm.vending.h.d)paramPair.second;
      paramPair = new Runnable()
      {
        public final void run()
        {
          ((d.a)paramPair.first).bd(paramObject);
        }
      };
      if (locald == null) {
        com.tencent.mm.vending.f.a.e("Vending.Pipeline", "Default scheduler %s is not available!!!", new Object[] { this.uQR });
      }
      locald.g(paramPair);
      return;
    }
    finally {}
  }
  
  public c<_Var> abE(String paramString)
  {
    if (paramString == null)
    {
      Assert.assertNotNull("schedulerTypeString should not be null!", paramString);
      return this;
    }
    this.uQQ = g.abG(paramString);
    Assert.assertNotNull("mCurrentScheduler should not be null!", this.uQQ);
    return this;
  }
  
  public c<_Var> b(com.tencent.mm.vending.e.b paramb)
  {
    Assert.assertNotNull("keeper should not be null!", paramb);
    paramb.keep(this);
    return this;
  }
  
  public <_Ret> c<_Ret> c(com.tencent.mm.vending.c.a<_Ret, _Var> parama)
  {
    try
    {
      parama = a(parama, this.uQY);
      return parama;
    }
    finally
    {
      parama = finally;
      throw parama;
    }
  }
  
  public final b cBF()
  {
    return this.uQZ;
  }
  
  public final d<_Var> cBH()
  {
    try
    {
      this.uQM = true;
      return this;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  final Object cu(Object paramObject)
  {
    for (;;)
    {
      try
      {
        if (this.uQO)
        {
          this.mRetryCount += 1;
          com.tencent.mm.vending.f.a.i("Vending.Pipeline", "Functional %s, gonna retry %s.", new Object[] { this.uQV.dsn.toString(), Integer.valueOf(this.mRetryCount) });
          ((LinkedList)this.uQP).add(0, this.uQV);
          this.uQO = false;
          paramObject = this.uQS;
          return paramObject;
        }
        if (this.uQT)
        {
          this.uQS = this.uQU;
          this.uQU = null;
          this.uQT = false;
          this.mRetryCount = 0;
        }
        else
        {
          this.uQS = paramObject;
        }
      }
      finally {}
    }
  }
  
  final void cv(final Object paramObject)
  {
    final Object localObject2;
    label134:
    long l;
    final boolean bool;
    for (;;)
    {
      Object localObject1;
      try
      {
        localObject1 = this.uQN;
        localObject2 = d.uRt;
        if (localObject1 != localObject2) {
          return;
        }
        this.uQN = d.uRu;
        localObject1 = (a)this.uQP.peek();
        if (localObject1 != null) {
          break label134;
        }
        if (this.uQM)
        {
          this.uQN = d.uRx;
          this.uRe = true;
          this.uRh = paramObject;
          if (this.uRd == null) {
            continue;
          }
          paramObject = this.uRd.iterator();
          if (((Iterator)paramObject).hasNext())
          {
            b((Pair)((Iterator)paramObject).next(), this.uRh);
            continue;
          }
          continue;
        }
        this.uQN = d.uRt;
      }
      finally {}
      continue;
      localObject2 = ((a)localObject1).dsn;
      com.tencent.mm.vending.h.d locald = ((a)localObject1).byz;
      l = ((a)localObject1).mInterval;
      bool = ((a)localObject1).uRr;
      if (this.uQN == d.uRv)
      {
        com.tencent.mm.vending.f.a.i("Vending.Pipeline", "This pipeline is Pausing. We will stop dequeFunctionAndInvoke and waiting resume() call", new Object[0]);
      }
      else
      {
        this.uQW = ((a)this.uQP.poll());
        this.uQz.b(locald);
        if (l >= 0L) {
          break;
        }
        this.uQz.a((com.tencent.mm.vending.c.a)localObject2, paramObject, bool);
      }
    }
    if (Looper.myLooper() == null) {}
    for (this.uRa = new com.tencent.mm.vending.h.c();; this.uRa = new h(Looper.myLooper(), Looper.myLooper().toString()))
    {
      this.uRa.g(new Runnable()
      {
        public final void run()
        {
          e.this.uQz.a(localObject2, paramObject, bool);
        }
      }, l);
      break;
    }
  }
  
  public <_Ret> c<_Ret> d(com.tencent.mm.vending.c.a<_Ret, _Var> parama)
  {
    return abE("Vending.LOGIC").c(parama);
  }
  
  public void dead()
  {
    mJ(true);
  }
  
  public <_Ret> c<_Ret> e(com.tencent.mm.vending.c.a<_Ret, _Var> parama)
  {
    return abE("Vending.HEAVY_WORK").c(parama);
  }
  
  public <_Ret> c<_Ret> f(com.tencent.mm.vending.c.a<_Ret, _Var> parama)
  {
    return abE("Vending.UI").c(parama);
  }
  
  public c<_Var> gR(long paramLong)
  {
    try
    {
      this.uQX = paramLong;
      return this;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public c<_Var> mI(boolean paramBoolean)
  {
    this.uQY = paramBoolean;
    return this;
  }
  
  /* Error */
  final void mJ(boolean paramBoolean)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 80	com/tencent/mm/vending/g/e:uQN	Lcom/tencent/mm/vending/g/e$d;
    //   6: getstatic 413	com/tencent/mm/vending/g/e$d:uRw	Lcom/tencent/mm/vending/g/e$d;
    //   9: if_acmpeq +17 -> 26
    //   12: aload_0
    //   13: getfield 80	com/tencent/mm/vending/g/e:uQN	Lcom/tencent/mm/vending/g/e$d;
    //   16: astore_2
    //   17: getstatic 332	com/tencent/mm/vending/g/e$d:uRx	Lcom/tencent/mm/vending/g/e$d;
    //   20: astore_3
    //   21: aload_2
    //   22: aload_3
    //   23: if_acmpne +6 -> 29
    //   26: aload_0
    //   27: monitorexit
    //   28: return
    //   29: iload_1
    //   30: ifeq +43 -> 73
    //   33: aload_0
    //   34: getfield 87	com/tencent/mm/vending/g/e:uQP	Ljava/util/Queue;
    //   37: invokeinterface 417 1 0
    //   42: ifle +31 -> 73
    //   45: ldc_w 258
    //   48: ldc_w 419
    //   51: iconst_1
    //   52: anewarray 5	java/lang/Object
    //   55: dup
    //   56: iconst_0
    //   57: aload_0
    //   58: getfield 87	com/tencent/mm/vending/g/e:uQP	Ljava/util/Queue;
    //   61: invokeinterface 417 1 0
    //   66: invokestatic 312	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   69: aastore
    //   70: invokestatic 421	com/tencent/mm/vending/f/a:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   73: aload_0
    //   74: getstatic 413	com/tencent/mm/vending/g/e$d:uRw	Lcom/tencent/mm/vending/g/e$d;
    //   77: putfield 80	com/tencent/mm/vending/g/e:uQN	Lcom/tencent/mm/vending/g/e$d;
    //   80: aload_0
    //   81: getfield 87	com/tencent/mm/vending/g/e:uQP	Ljava/util/Queue;
    //   84: invokeinterface 424 1 0
    //   89: aload_0
    //   90: aconst_null
    //   91: putfield 145	com/tencent/mm/vending/g/e:uQS	Ljava/lang/Object;
    //   94: aload_0
    //   95: getfield 376	com/tencent/mm/vending/g/e:uRa	Lcom/tencent/mm/vending/h/d;
    //   98: ifnull -72 -> 26
    //   101: aload_0
    //   102: getfield 376	com/tencent/mm/vending/g/e:uRa	Lcom/tencent/mm/vending/h/d;
    //   105: invokevirtual 427	com/tencent/mm/vending/h/d:cancel	()V
    //   108: goto -82 -> 26
    //   111: astore_2
    //   112: aload_0
    //   113: monitorexit
    //   114: aload_2
    //   115: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	116	0	this	e
    //   0	116	1	paramBoolean	boolean
    //   16	6	2	locald1	d
    //   111	4	2	localObject	Object
    //   20	3	3	locald2	d
    // Exception table:
    //   from	to	target	type
    //   2	21	111	finally
    //   33	73	111	finally
    //   73	108	111	finally
  }
  
  /* Error */
  public c<_Var> w(Object... paramVarArgs)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 80	com/tencent/mm/vending/g/e:uQN	Lcom/tencent/mm/vending/g/e$d;
    //   6: astore_2
    //   7: getstatic 78	com/tencent/mm/vending/g/e$d:uRs	Lcom/tencent/mm/vending/g/e$d;
    //   10: astore_3
    //   11: aload_2
    //   12: aload_3
    //   13: if_acmpeq +7 -> 20
    //   16: aload_0
    //   17: monitorexit
    //   18: aload_0
    //   19: areturn
    //   20: aload_0
    //   21: getstatic 143	com/tencent/mm/vending/g/e$d:uRt	Lcom/tencent/mm/vending/g/e$d;
    //   24: putfield 80	com/tencent/mm/vending/g/e:uQN	Lcom/tencent/mm/vending/g/e$d;
    //   27: aload_1
    //   28: arraylength
    //   29: ifne +21 -> 50
    //   32: aconst_null
    //   33: astore_1
    //   34: aload_0
    //   35: aload_1
    //   36: putfield 145	com/tencent/mm/vending/g/e:uQS	Ljava/lang/Object;
    //   39: aload_0
    //   40: aload_0
    //   41: getfield 145	com/tencent/mm/vending/g/e:uQS	Ljava/lang/Object;
    //   44: invokevirtual 149	com/tencent/mm/vending/g/e:cv	(Ljava/lang/Object;)V
    //   47: goto -31 -> 16
    //   50: aload_1
    //   51: arraylength
    //   52: iconst_1
    //   53: if_icmpne +10 -> 63
    //   56: aload_1
    //   57: iconst_0
    //   58: aaload
    //   59: astore_1
    //   60: goto -26 -> 34
    //   63: aload_1
    //   64: invokestatic 433	com/tencent/mm/vending/j/k:x	([Ljava/lang/Object;)Lcom/tencent/mm/vending/j/k;
    //   67: astore_1
    //   68: goto -34 -> 34
    //   71: astore_1
    //   72: aload_0
    //   73: monitorexit
    //   74: aload_1
    //   75: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	76	0	this	e
    //   0	76	1	paramVarArgs	Object[]
    //   6	6	2	locald1	d
    //   10	3	3	locald2	d
    // Exception table:
    //   from	to	target	type
    //   2	11	71	finally
    //   20	32	71	finally
    //   34	47	71	finally
    //   50	56	71	finally
    //   63	68	71	finally
  }
  
  private static final class a
  {
    public com.tencent.mm.vending.h.d byz;
    public com.tencent.mm.vending.c.a dsn;
    public long mInterval;
    public boolean uRr;
    
    public a(com.tencent.mm.vending.c.a parama, com.tencent.mm.vending.h.d paramd, long paramLong, boolean paramBoolean)
    {
      this.dsn = parama;
      this.byz = paramd;
      this.mInterval = paramLong;
      this.uRr = paramBoolean;
    }
  }
  
  final class b
    implements b
  {
    b() {}
    
    public final void cBE()
    {
      for (;;)
      {
        synchronized (e.this)
        {
          synchronized (e.this)
          {
            if ((e.this.uQN == e.d.uRw) || (e.this.uQN == e.d.uRs))
            {
              com.tencent.mm.vending.f.a.w("Vending.Pipeline", "current is state(%s), ignore pause.", new Object[] { e.this.uQN });
              return;
            }
            if (!e.a(e.this)) {
              com.tencent.mm.vending.f.a.e("Vending.Pipeline", "you are using mario().pause() out of a functional scope on %s!", new Object[] { e.this });
            }
          }
        }
        if (!e.b(e.this)) {
          com.tencent.mm.vending.f.a.e("Vending.Pipeline", "you are using mario().pause() out of calling thread on %s!", new Object[] { e.this });
        } else {
          e.this.uQN = e.d.uRv;
        }
      }
    }
    
    public final void ct(Object paramObject)
    {
      synchronized (e.this)
      {
        if (e.this.uQN == e.d.uRw)
        {
          com.tencent.mm.vending.f.a.i("Vending.Pipeline", "interrupted, skip this interrupt.", new Object[0]);
          return;
        }
        if ((!e.a(e.this)) && (e.this.uQN != e.d.uRv))
        {
          com.tencent.mm.vending.f.a.i("Vending.Pipeline", "interrupt not in func scope or pending, skip this retryOrInterrupt.", new Object[0]);
          return;
        }
      }
      com.tencent.mm.vending.f.a.i("Vending.Pipeline", "interrupt Pipeline(%s)", new Object[] { e.this });
      e.this.mJ(false);
      e.this.uRf = true;
      e.this.uRi = paramObject;
      if (e.this.uRc != null)
      {
        Iterator localIterator = e.this.uRc.iterator();
        while (localIterator.hasNext())
        {
          Pair localPair = (Pair)localIterator.next();
          e.this.a(localPair, paramObject);
        }
      }
    }
    
    public final void resume()
    {
      for (;;)
      {
        synchronized (e.this)
        {
          if (e.this.uQN != e.d.uRv)
          {
            com.tencent.mm.vending.f.a.e("Vending.Pipeline", "this Pipeline(%s) is not pausing! why call resume?", new Object[] { e.this });
            return;
          }
          if (!e.a(e.this))
          {
            e.this.uQN = e.d.uRt;
            if (!e.b(e.this)) {
              e.this.cv(e.this.cu(e.this.uQS));
            }
            return;
          }
        }
        e.this.uQN = e.d.uRu;
      }
    }
    
    public final void v(Object... paramVarArgs)
    {
      for (;;)
      {
        synchronized (e.this)
        {
          if (e.this.uQN != e.d.uRv)
          {
            com.tencent.mm.vending.f.a.i("Vending.Pipeline", "state is not pausing %s, skip this wormhole", new Object[] { e.this.uQN });
            return;
          }
          e locale2 = e.this;
          if (paramVarArgs.length == 0)
          {
            paramVarArgs = null;
            locale2.uQU = paramVarArgs;
            e.this.uQT = true;
            com.tencent.mm.vending.f.a.i("Vending.Pipeline", "pipline(%s) wormhole().", new Object[] { e.this });
            resume();
            return;
          }
        }
        if (paramVarArgs.length == 1) {
          paramVarArgs = paramVarArgs[0];
        } else {
          paramVarArgs = k.x(paramVarArgs);
        }
      }
    }
  }
  
  public static final class c
    extends Error
  {
    public c(String paramString, Object... paramVarArgs)
    {
      super();
    }
  }
  
  private static enum d
  {
    private d() {}
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/vending/g/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */