package com.tencent.mm.svg;

import android.os.Looper;
import java.util.HashMap;
import java.util.LinkedList;

final class a<T>
{
  private HashMap<Looper, LinkedList<T>> teC = new HashMap();
  private LinkedList<T> teD = new LinkedList();
  
  /* Error */
  protected final void a(Looper paramLooper, T paramT)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 20	com/tencent/mm/svg/a:teC	Ljava/util/HashMap;
    //   6: aload_1
    //   7: invokevirtual 32	java/util/HashMap:containsKey	(Ljava/lang/Object;)Z
    //   10: ifne +32 -> 42
    //   13: new 22	java/util/LinkedList
    //   16: dup
    //   17: invokespecial 23	java/util/LinkedList:<init>	()V
    //   20: astore_3
    //   21: aload_0
    //   22: getfield 20	com/tencent/mm/svg/a:teC	Ljava/util/HashMap;
    //   25: aload_1
    //   26: aload_3
    //   27: invokevirtual 36	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   30: pop
    //   31: aload_3
    //   32: astore_1
    //   33: aload_1
    //   34: aload_2
    //   35: invokevirtual 39	java/util/LinkedList:add	(Ljava/lang/Object;)Z
    //   38: pop
    //   39: aload_0
    //   40: monitorexit
    //   41: return
    //   42: aload_0
    //   43: getfield 20	com/tencent/mm/svg/a:teC	Ljava/util/HashMap;
    //   46: aload_1
    //   47: invokevirtual 43	java/util/HashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   50: checkcast 22	java/util/LinkedList
    //   53: astore_1
    //   54: goto -21 -> 33
    //   57: astore_1
    //   58: aload_0
    //   59: monitorexit
    //   60: aload_1
    //   61: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	62	0	this	a
    //   0	62	1	paramLooper	Looper
    //   0	62	2	paramT	T
    //   20	12	3	localLinkedList	LinkedList
    // Exception table:
    //   from	to	target	type
    //   2	31	57	finally
    //   33	39	57	finally
    //   42	54	57	finally
  }
  
  protected final void c(Looper paramLooper)
  {
    try
    {
      if (this.teC.containsKey(paramLooper))
      {
        paramLooper = (LinkedList)this.teC.remove(paramLooper);
        this.teD.addAll(paramLooper);
      }
      return;
    }
    finally
    {
      paramLooper = finally;
      throw paramLooper;
    }
  }
  
  protected final T cof()
  {
    Object localObject1 = null;
    try
    {
      if (this.teD.size() != 0) {
        localObject1 = this.teD.poll();
      }
      return (T)localObject1;
    }
    finally
    {
      localObject2 = finally;
      throw ((Throwable)localObject2);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/svg/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */