package com.tencent.mm.kernel;

import com.tencent.mm.by.a.a;
import com.tencent.mm.vending.g.d.b;
import junit.framework.Assert;

public final class h<_Profile extends com.tencent.mm.kernel.b.g>
{
  private static h drb;
  private c drc = new c();
  private d<_Profile> drd;
  public byte[] dre = new byte[0];
  public volatile boolean drf = false;
  public long drg;
  public a drh = new a();
  
  private h(_Profile param_Profile)
  {
    this.drd = new d(param_Profile);
  }
  
  public static <_Profile extends com.tencent.mm.kernel.b.g> h<_Profile> Eo()
  {
    Assert.assertNotNull("Skeleton not initialized!", drb);
    return drb;
  }
  
  /* Error */
  public static <_Profile extends com.tencent.mm.kernel.b.g> h<_Profile> c(_Profile param_Profile)
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: getstatic 65	com/tencent/mm/kernel/h:drb	Lcom/tencent/mm/kernel/h;
    //   6: ifnull +23 -> 29
    //   9: ldc 76
    //   11: ldc 78
    //   13: iconst_0
    //   14: anewarray 5	java/lang/Object
    //   17: invokestatic 84	com/tencent/mm/kernel/j:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   20: getstatic 65	com/tencent/mm/kernel/h:drb	Lcom/tencent/mm/kernel/h;
    //   23: astore_0
    //   24: ldc 2
    //   26: monitorexit
    //   27: aload_0
    //   28: areturn
    //   29: ldc 76
    //   31: ldc 86
    //   33: iconst_0
    //   34: anewarray 5	java/lang/Object
    //   37: invokestatic 84	com/tencent/mm/kernel/j:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   40: new 2	com/tencent/mm/kernel/h
    //   43: dup
    //   44: aload_0
    //   45: invokespecial 87	com/tencent/mm/kernel/h:<init>	(Lcom/tencent/mm/kernel/b/g;)V
    //   48: astore_0
    //   49: aload_0
    //   50: putstatic 65	com/tencent/mm/kernel/h:drb	Lcom/tencent/mm/kernel/h;
    //   53: goto -29 -> 24
    //   56: astore_0
    //   57: ldc 2
    //   59: monitorexit
    //   60: aload_0
    //   61: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	62	0	param_Profile	_Profile
    // Exception table:
    //   from	to	target	type
    //   3	24	56	finally
    //   29	53	56	finally
  }
  
  public final c Ee()
  {
    Assert.assertNotNull("mCorePlugins not initialized!", this.drc);
    return this.drc;
  }
  
  public final d<_Profile> Ef()
  {
    Assert.assertNotNull("mCoreProcess not initialized!", this.drd);
    return this.drd;
  }
  
  public final void a(com.tencent.mm.kernel.api.g paramg)
  {
    int i = 0;
    synchronized (this.dre)
    {
      if (this.drf) {
        i = 1;
      }
      if (i != 0)
      {
        paramg.vk();
        return;
      }
    }
    this.drh.aI(paramg);
  }
  
  public final void b(com.tencent.mm.kernel.api.g paramg)
  {
    this.drh.remove(paramg);
  }
  
  private static final class a
    extends com.tencent.mm.by.a<com.tencent.mm.kernel.api.g>
    implements com.tencent.mm.kernel.api.g
  {
    public a()
    {
      super();
    }
    
    public final void aF(final boolean paramBoolean)
    {
      a(new a.a() {});
    }
    
    public final void vk()
    {
      a(new a.a() {});
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/kernel/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */