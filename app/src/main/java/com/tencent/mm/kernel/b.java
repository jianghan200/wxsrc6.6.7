package com.tencent.mm.kernel;

import com.tencent.mm.ab.o;
import com.tencent.mm.ab.o.a;
import com.tencent.mm.ab.v.b;
import com.tencent.mm.by.a.a;
import com.tencent.mm.g.a.kd;
import com.tencent.mm.kernel.api.d;
import com.tencent.mm.model.aj;
import com.tencent.mm.model.bg.a;
import com.tencent.mm.model.by;
import com.tencent.mm.model.by.a;
import com.tencent.mm.network.c;
import com.tencent.mm.network.h.a;
import com.tencent.mm.network.n;
import com.tencent.mm.network.n.a;
import com.tencent.mm.protocal.w.a;
import com.tencent.mm.protocal.w.b;
import com.tencent.mm.protocal.x.a;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public final class b
{
  public static String dpN = "wechatnetwork";
  private static aj dpS = null;
  public final a dpO;
  public final o dpP;
  private HashSet<n> dpQ = new HashSet();
  public n dpR = new n.a()
  {
    /* Error */
    public final void ev(int paramAnonymousInt)
    {
      // Byte code:
      //   0: new 24	java/util/HashSet
      //   3: dup
      //   4: invokespecial 25	java/util/HashSet:<init>	()V
      //   7: astore_3
      //   8: aload_0
      //   9: getfield 14	com/tencent/mm/kernel/b$2:dpT	Lcom/tencent/mm/kernel/b;
      //   12: invokestatic 29	com/tencent/mm/kernel/b:b	(Lcom/tencent/mm/kernel/b;)Ljava/util/HashSet;
      //   15: astore_2
      //   16: aload_2
      //   17: monitorenter
      //   18: aload_3
      //   19: aload_0
      //   20: getfield 14	com/tencent/mm/kernel/b$2:dpT	Lcom/tencent/mm/kernel/b;
      //   23: invokestatic 29	com/tencent/mm/kernel/b:b	(Lcom/tencent/mm/kernel/b;)Ljava/util/HashSet;
      //   26: invokevirtual 33	java/util/HashSet:addAll	(Ljava/util/Collection;)Z
      //   29: pop
      //   30: aload_2
      //   31: monitorexit
      //   32: aload_3
      //   33: invokevirtual 37	java/util/HashSet:iterator	()Ljava/util/Iterator;
      //   36: astore_2
      //   37: aload_2
      //   38: invokeinterface 43 1 0
      //   43: ifeq +54 -> 97
      //   46: aload_2
      //   47: invokeinterface 47 1 0
      //   52: checkcast 49	com/tencent/mm/network/n
      //   55: iload_1
      //   56: invokeinterface 51 2 0
      //   61: goto -24 -> 37
      //   64: astore_2
      //   65: ldc 53
      //   67: aload_2
      //   68: ldc 55
      //   70: iconst_0
      //   71: anewarray 57	java/lang/Object
      //   74: invokestatic 63	com/tencent/mm/sdk/platformtools/x:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
      //   77: new 65	com/tencent/mm/sdk/platformtools/ag
      //   80: dup
      //   81: invokespecial 66	com/tencent/mm/sdk/platformtools/ag:<init>	()V
      //   84: new 8	com/tencent/mm/kernel/b$2$1
      //   87: dup
      //   88: aload_0
      //   89: aload_2
      //   90: invokespecial 69	com/tencent/mm/kernel/b$2$1:<init>	(Lcom/tencent/mm/kernel/b$2;Ljava/lang/Exception;)V
      //   93: invokevirtual 73	com/tencent/mm/sdk/platformtools/ag:post	(Ljava/lang/Runnable;)Z
      //   96: pop
      //   97: return
      //   98: astore_3
      //   99: aload_2
      //   100: monitorexit
      //   101: aload_3
      //   102: athrow
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	103	0	this	2
      //   0	103	1	paramAnonymousInt	int
      //   64	36	2	localException	Exception
      //   7	26	3	localHashSet	HashSet
      //   98	4	3	localObject2	Object
      // Exception table:
      //   from	to	target	type
      //   0	18	64	java/lang/Exception
      //   32	37	64	java/lang/Exception
      //   37	61	64	java/lang/Exception
      //   101	103	64	java/lang/Exception
      //   18	32	98	finally
      //   99	101	98	finally
    }
  };
  
  public b(o.a parama, a parama1)
  {
    this.dpP = o.a(parama);
    this.dpP.dJt = g.Em();
    com.tencent.mm.ab.v.dKi = new v.b()
    {
      public final o DG()
      {
        return b.a(b.this);
      }
    };
    this.dpO = parama1;
  }
  
  public static aj DD()
  {
    return dpS;
  }
  
  public static void a(aj paramaj)
  {
    dpS = paramaj;
  }
  
  public static void b(int paramInt1, int paramInt2, boolean paramBoolean, String paramString)
  {
    kd localkd = new kd();
    localkd.bUv.status = paramInt1;
    localkd.bUv.bUw = paramInt2;
    localkd.bUv.bUx = paramBoolean;
    localkd.bUv.bUy = paramString;
    com.tencent.mm.sdk.b.a.sFg.m(localkd);
  }
  
  public final byte[] DE()
  {
    try
    {
      if ((this.dpP != null) && (this.dpP.dJs != null))
      {
        if (this.dpP.dJs.Lr() == null) {
          return null;
        }
        byte[] arrayOfByte = this.dpP.dJs.Lr().DE();
        return arrayOfByte;
      }
    }
    catch (Exception localException)
    {
      com.tencent.mm.sdk.platformtools.x.w("MMKernel.CoreNetwork", "get session key error, %s", new Object[] { localException.getMessage() });
      com.tencent.mm.sdk.platformtools.x.e("MMKernel.CoreNetwork", "exception:%s", new Object[] { bi.i(localException) });
    }
    return null;
  }
  
  public final o DF()
  {
    return this.dpP;
  }
  
  public final void a(n paramn)
  {
    synchronized (this.dpQ)
    {
      this.dpQ.add(paramn);
      return;
    }
  }
  
  public final void b(n paramn)
  {
    synchronized (this.dpQ)
    {
      this.dpQ.remove(paramn);
      return;
    }
  }
  
  public static final class a
    extends com.tencent.mm.by.a<d>
    implements d
  {
    public final void b(final com.tencent.mm.network.e parame)
    {
      a(new a.a() {});
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/kernel/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */