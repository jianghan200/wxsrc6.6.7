package com.tencent.mm.plugin.appbrand.ui.recents;

import com.tencent.mm.plugin.appbrand.appusage.k;
import com.tencent.mm.plugin.appbrand.q.e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import junit.framework.Assert;

final class i
  extends ArrayList<k>
{
  private final ArrayList<k> gAx = new ArrayList(10);
  private final ArrayList<k> gAy = new ArrayList(200);
  
  static i e(ArrayList<k> paramArrayList1, ArrayList<k> paramArrayList2)
  {
    i locali = new i();
    e.d(locali.gAx, paramArrayList1);
    e.d(locali.gAy, paramArrayList2);
    return locali;
  }
  
  /* Error */
  private k lK(int paramInt)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: iload_1
    //   3: aload_0
    //   4: getfield 17	com/tencent/mm/plugin/appbrand/ui/recents/i:gAx	Ljava/util/ArrayList;
    //   7: invokevirtual 37	java/util/ArrayList:size	()I
    //   10: if_icmpge +19 -> 29
    //   13: aload_0
    //   14: getfield 17	com/tencent/mm/plugin/appbrand/ui/recents/i:gAx	Ljava/util/ArrayList;
    //   17: iload_1
    //   18: invokevirtual 41	java/util/ArrayList:get	(I)Ljava/lang/Object;
    //   21: checkcast 43	com/tencent/mm/plugin/appbrand/appusage/k
    //   24: astore_2
    //   25: aload_0
    //   26: monitorexit
    //   27: aload_2
    //   28: areturn
    //   29: aload_0
    //   30: getfield 19	com/tencent/mm/plugin/appbrand/ui/recents/i:gAy	Ljava/util/ArrayList;
    //   33: iload_1
    //   34: aload_0
    //   35: getfield 17	com/tencent/mm/plugin/appbrand/ui/recents/i:gAx	Ljava/util/ArrayList;
    //   38: invokevirtual 37	java/util/ArrayList:size	()I
    //   41: isub
    //   42: invokevirtual 41	java/util/ArrayList:get	(I)Ljava/lang/Object;
    //   45: checkcast 43	com/tencent/mm/plugin/appbrand/appusage/k
    //   48: astore_2
    //   49: goto -24 -> 25
    //   52: astore_2
    //   53: aload_0
    //   54: monitorexit
    //   55: aload_2
    //   56: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	57	0	this	i
    //   0	57	1	paramInt	int
    //   24	25	2	localk	k
    //   52	4	2	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	25	52	finally
    //   29	49	52	finally
  }
  
  public final boolean addAll(Collection<? extends k> paramCollection)
  {
    if (i.class.isInstance(paramCollection)) {
      try
      {
        paramCollection = (i)paramCollection;
        this.gAx.addAll(paramCollection.gAx);
        this.gAy.addAll(paramCollection.gAy);
        return true;
      }
      finally {}
    }
    Assert.assertTrue("collection type mismatch!!", false);
    return false;
  }
  
  final ArrayList<k> aom()
  {
    try
    {
      ArrayList localArrayList = this.gAx;
      return localArrayList;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  final ArrayList<k> aon()
  {
    try
    {
      ArrayList localArrayList = this.gAy;
      return localArrayList;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final i aoo()
  {
    try
    {
      i locali = new i();
      locali.gAx.addAll(this.gAx);
      locali.gAy.addAll(this.gAy);
      return locali;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final void clear()
  {
    try
    {
      this.gAx.clear();
      this.gAy.clear();
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final Iterator<k> iterator()
  {
    Assert.assertTrue("Why you need this?? call @smoothieli fix it", false);
    return new i.1(this);
  }
  
  /* Error */
  public final k lL(int paramInt)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: iload_1
    //   3: aload_0
    //   4: getfield 17	com/tencent/mm/plugin/appbrand/ui/recents/i:gAx	Ljava/util/ArrayList;
    //   7: invokevirtual 37	java/util/ArrayList:size	()I
    //   10: if_icmpge +19 -> 29
    //   13: aload_0
    //   14: getfield 17	com/tencent/mm/plugin/appbrand/ui/recents/i:gAx	Ljava/util/ArrayList;
    //   17: iload_1
    //   18: invokevirtual 91	java/util/ArrayList:remove	(I)Ljava/lang/Object;
    //   21: checkcast 43	com/tencent/mm/plugin/appbrand/appusage/k
    //   24: astore_2
    //   25: aload_0
    //   26: monitorexit
    //   27: aload_2
    //   28: areturn
    //   29: aload_0
    //   30: getfield 19	com/tencent/mm/plugin/appbrand/ui/recents/i:gAy	Ljava/util/ArrayList;
    //   33: iload_1
    //   34: aload_0
    //   35: getfield 17	com/tencent/mm/plugin/appbrand/ui/recents/i:gAx	Ljava/util/ArrayList;
    //   38: invokevirtual 37	java/util/ArrayList:size	()I
    //   41: isub
    //   42: invokevirtual 91	java/util/ArrayList:remove	(I)Ljava/lang/Object;
    //   45: checkcast 43	com/tencent/mm/plugin/appbrand/appusage/k
    //   48: astore_2
    //   49: goto -24 -> 25
    //   52: astore_2
    //   53: aload_0
    //   54: monitorexit
    //   55: aload_2
    //   56: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	57	0	this	i
    //   0	57	1	paramInt	int
    //   24	25	2	localk	k
    //   52	4	2	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	25	52	finally
    //   29	49	52	finally
  }
  
  public final int size()
  {
    try
    {
      int i = this.gAx.size();
      int j = this.gAy.size();
      return i + j;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/plugin/appbrand/ui/recents/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */