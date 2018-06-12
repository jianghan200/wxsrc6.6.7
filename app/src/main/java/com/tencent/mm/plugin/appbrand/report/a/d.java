package com.tencent.mm.plugin.appbrand.report.a;

import android.util.Pair;
import android.util.SparseArray;
import com.tencent.mm.plugin.appbrand.page.aa;
import com.tencent.mm.plugin.appbrand.page.p;
import com.tencent.mm.sdk.platformtools.x;
import java.util.Deque;
import java.util.LinkedList;

final class d
  implements f, g
{
  private final String grk;
  private final SparseArray<g.a> grl = new SparseArray();
  private final Deque<g.a> grm = new LinkedList();
  private boolean grn = true;
  private String gro;
  private g.a grp;
  
  d(String paramString)
  {
    this.grk = paramString;
  }
  
  private void a(g.a parama)
  {
    try
    {
      this.grm.offerFirst(parama);
      this.grl.put(parama.grr, parama);
      return;
    }
    finally
    {
      parama = finally;
      throw parama;
    }
  }
  
  private void amH()
  {
    try
    {
      this.grp = null;
      this.gro = null;
      this.grn = false;
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  private g.a amI()
  {
    try
    {
      g.a locala = (g.a)this.grm.pollFirst();
      if (locala != null) {
        this.grl.remove(locala.grr);
      }
      return locala;
    }
    finally {}
  }
  
  private void b(p paramp1, p paramp2)
  {
    try
    {
      boolean bool = vr(paramp2.ahc());
      this.grp = f(paramp2);
      this.grp.grs = new g.c(1, paramp1.ahc());
      int i = paramp1.hashCode();
      while ((!isEmpty()) && (amJ().grr != i)) {
        amI();
      }
      if (!bool) {
        break label93;
      }
    }
    finally {}
    a(new g.a(paramp1));
    label93:
    f(paramp1).grt = new g.b(paramp2.ahc());
    f(paramp1).grs = null;
  }
  
  /* Error */
  private void e(p paramp)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: aload_1
    //   4: invokevirtual 82	com/tencent/mm/plugin/appbrand/page/p:ahc	()Ljava/lang/String;
    //   7: putfield 64	com/tencent/mm/plugin/appbrand/report/a/d:gro	Ljava/lang/String;
    //   10: aload_0
    //   11: iconst_0
    //   12: putfield 38	com/tencent/mm/plugin/appbrand/report/a/d:grn	Z
    //   15: aload_0
    //   16: new 51	com/tencent/mm/plugin/appbrand/report/a/g$a
    //   19: dup
    //   20: aload_1
    //   21: invokespecial 115	com/tencent/mm/plugin/appbrand/report/a/g$a:<init>	(Lcom/tencent/mm/plugin/appbrand/page/p;)V
    //   24: invokespecial 117	com/tencent/mm/plugin/appbrand/report/a/d:a	(Lcom/tencent/mm/plugin/appbrand/report/a/g$a;)V
    //   27: aload_0
    //   28: invokevirtual 110	com/tencent/mm/plugin/appbrand/report/a/d:amJ	()Lcom/tencent/mm/plugin/appbrand/report/a/g$a;
    //   31: astore_2
    //   32: aload_0
    //   33: getfield 40	com/tencent/mm/plugin/appbrand/report/a/d:grk	Ljava/lang/String;
    //   36: invokestatic 131	com/tencent/mm/sdk/platformtools/bi:oW	(Ljava/lang/String;)Z
    //   39: ifeq +13 -> 52
    //   42: aconst_null
    //   43: astore_1
    //   44: aload_2
    //   45: aload_1
    //   46: putfield 125	com/tencent/mm/plugin/appbrand/report/a/g$a:grt	Lcom/tencent/mm/plugin/appbrand/report/a/g$b;
    //   49: aload_0
    //   50: monitorexit
    //   51: return
    //   52: new 119	com/tencent/mm/plugin/appbrand/report/a/g$b
    //   55: dup
    //   56: aload_0
    //   57: getfield 40	com/tencent/mm/plugin/appbrand/report/a/d:grk	Ljava/lang/String;
    //   60: invokespecial 121	com/tencent/mm/plugin/appbrand/report/a/g$b:<init>	(Ljava/lang/String;)V
    //   63: astore_1
    //   64: goto -20 -> 44
    //   67: astore_1
    //   68: aload_0
    //   69: monitorexit
    //   70: aload_1
    //   71: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	72	0	this	d
    //   0	72	1	paramp	p
    //   31	14	2	locala	g.a
    // Exception table:
    //   from	to	target	type
    //   2	42	67	finally
    //   44	49	67	finally
    //   52	64	67	finally
  }
  
  private g.a f(p paramp)
  {
    g.a locala2 = amJ();
    g.a locala1;
    if (locala2 == null) {
      locala1 = new g.a(paramp);
    }
    do
    {
      return locala1;
      locala1 = locala2;
    } while (locala2.grr == paramp.hashCode());
    x.printErrStackTrace("MicroMsg.AppBrandPageVisitStack", new Throwable(), "mismatch stack order", new Object[0]);
    return locala2;
  }
  
  private boolean isEmpty()
  {
    try
    {
      boolean bool = this.grm.isEmpty();
      return bool;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final void a(p paramp1, p paramp2, aa paramaa)
  {
    try
    {
      if (this.grn)
      {
        e(paramp1);
        return;
      }
      if (paramaa == aa.gph)
      {
        b(paramp1, paramp2);
        return;
      }
    }
    finally {}
    if (this.grp != null) {
      amH();
    }
    if (paramp2 != null)
    {
      paramaa = f(paramp2);
      if (paramaa != null) {
        paramaa.grs = new g.c(2, paramp1.ahc());
      }
    }
    paramaa = new g.a(paramp1);
    if (paramp2 == null) {}
    for (paramp1 = null;; paramp1 = new g.b(paramp2.ahc()))
    {
      paramaa.grt = paramp1;
      a(paramaa);
      return;
    }
  }
  
  public final g.a amJ()
  {
    try
    {
      g.a locala = (g.a)this.grm.peekFirst();
      return locala;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final void c(p paramp)
  {
    try
    {
      g.a locala = f(paramp);
      if (locala == null) {
        return;
      }
      paramp = e.h(paramp);
      locala.grs = new g.c(((Integer)paramp.first).intValue(), (String)paramp.second);
      return;
    }
    finally {}
  }
  
  /* Error */
  public final void d(p paramp)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 38	com/tencent/mm/plugin/appbrand/report/a/d:grn	Z
    //   6: ifeq +11 -> 17
    //   9: aload_0
    //   10: aload_1
    //   11: invokespecial 148	com/tencent/mm/plugin/appbrand/report/a/d:e	(Lcom/tencent/mm/plugin/appbrand/page/p;)V
    //   14: aload_0
    //   15: monitorexit
    //   16: return
    //   17: aload_0
    //   18: invokespecial 158	com/tencent/mm/plugin/appbrand/report/a/d:amH	()V
    //   21: goto -7 -> 14
    //   24: astore_1
    //   25: aload_0
    //   26: monitorexit
    //   27: aload_1
    //   28: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	29	0	this	d
    //   0	29	1	paramp	p
    // Exception table:
    //   from	to	target	type
    //   2	14	24	finally
    //   17	21	24	finally
  }
  
  public final g.a g(p paramp)
  {
    try
    {
      g.a locala2 = (g.a)this.grl.get(paramp.hashCode());
      g.a locala1 = locala2;
      if (locala2 == null)
      {
        locala1 = locala2;
        if (this.grp != null)
        {
          locala1 = locala2;
          if (this.grp.grr == paramp.hashCode()) {
            locala1 = this.grp;
          }
        }
      }
      return locala1;
    }
    finally {}
  }
  
  /* Error */
  public final boolean vr(String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 64	com/tencent/mm/plugin/appbrand/report/a/d:gro	Ljava/lang/String;
    //   6: invokestatic 131	com/tencent/mm/sdk/platformtools/bi:oW	(Ljava/lang/String;)Z
    //   9: ifne +22 -> 31
    //   12: aload_0
    //   13: getfield 64	com/tencent/mm/plugin/appbrand/report/a/d:gro	Ljava/lang/String;
    //   16: aload_1
    //   17: invokevirtual 193	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   20: istore_2
    //   21: iload_2
    //   22: ifeq +9 -> 31
    //   25: iconst_1
    //   26: istore_2
    //   27: aload_0
    //   28: monitorexit
    //   29: iload_2
    //   30: ireturn
    //   31: iconst_0
    //   32: istore_2
    //   33: goto -6 -> 27
    //   36: astore_1
    //   37: aload_0
    //   38: monitorexit
    //   39: aload_1
    //   40: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	41	0	this	d
    //   0	41	1	paramString	String
    //   20	13	2	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   2	21	36	finally
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/appbrand/report/a/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */