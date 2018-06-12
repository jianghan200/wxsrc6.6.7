package com.tencent.mm.plugin.clean.c.a;

import com.tencent.mm.sdk.f.e;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.x;
import java.util.HashMap;
import java.util.HashSet;

public final class b
  implements c
{
  public HashMap<Long, ag> hRt = new HashMap(5);
  private HashSet<Long> hRu = new HashSet(5);
  
  public b()
  {
    this((byte)0);
  }
  
  private b(byte paramByte)
  {
    paramByte = 0;
    while (paramByte <= 5)
    {
      e.d(new b.1(this), "ThreadController_handler", 1).start();
      paramByte += 1;
    }
  }
  
  private void e(Long paramLong)
  {
    try
    {
      if (this.hRu.remove(paramLong)) {
        x.d("MicroMsg.ThreadController", "thread is idle, id=%d", new Object[] { paramLong });
      }
      return;
    }
    finally
    {
      paramLong = finally;
      throw paramLong;
    }
  }
  
  /* Error */
  public final boolean b(a parama)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_1
    //   3: aload_0
    //   4: putfield 73	com/tencent/mm/plugin/clean/c/a/a:hRs	Lcom/tencent/mm/plugin/clean/c/a/c;
    //   7: ldc 58
    //   9: ldc 75
    //   11: iconst_1
    //   12: anewarray 4	java/lang/Object
    //   15: dup
    //   16: iconst_0
    //   17: aload_0
    //   18: getfield 27	com/tencent/mm/plugin/clean/c/a/b:hRu	Ljava/util/HashSet;
    //   21: invokevirtual 79	java/util/HashSet:toString	()Ljava/lang/String;
    //   24: aastore
    //   25: invokestatic 65	com/tencent/mm/sdk/platformtools/x:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   28: aload_0
    //   29: getfield 32	com/tencent/mm/plugin/clean/c/a/b:hRt	Ljava/util/HashMap;
    //   32: invokevirtual 83	java/util/HashMap:entrySet	()Ljava/util/Set;
    //   35: invokeinterface 89 1 0
    //   40: astore_3
    //   41: aload_3
    //   42: invokeinterface 95 1 0
    //   47: ifeq +67 -> 114
    //   50: aload_3
    //   51: invokeinterface 99 1 0
    //   56: checkcast 101	java/util/Map$Entry
    //   59: astore 4
    //   61: aload_0
    //   62: getfield 27	com/tencent/mm/plugin/clean/c/a/b:hRu	Ljava/util/HashSet;
    //   65: aload 4
    //   67: invokeinterface 104 1 0
    //   72: invokevirtual 107	java/util/HashSet:contains	(Ljava/lang/Object;)Z
    //   75: ifne -34 -> 41
    //   78: aload 4
    //   80: invokeinterface 110 1 0
    //   85: checkcast 112	com/tencent/mm/sdk/platformtools/ag
    //   88: aload_1
    //   89: invokevirtual 116	com/tencent/mm/sdk/platformtools/ag:post	(Ljava/lang/Runnable;)Z
    //   92: pop
    //   93: aload_0
    //   94: getfield 27	com/tencent/mm/plugin/clean/c/a/b:hRu	Ljava/util/HashSet;
    //   97: aload 4
    //   99: invokeinterface 104 1 0
    //   104: invokevirtual 119	java/util/HashSet:add	(Ljava/lang/Object;)Z
    //   107: pop
    //   108: iconst_1
    //   109: istore_2
    //   110: aload_0
    //   111: monitorexit
    //   112: iload_2
    //   113: ireturn
    //   114: iconst_0
    //   115: istore_2
    //   116: goto -6 -> 110
    //   119: astore_1
    //   120: aload_0
    //   121: monitorexit
    //   122: aload_1
    //   123: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	124	0	this	b
    //   0	124	1	parama	a
    //   109	7	2	bool	boolean
    //   40	11	3	localIterator	java.util.Iterator
    //   59	39	4	localEntry	java.util.Map.Entry
    // Exception table:
    //   from	to	target	type
    //   2	41	119	finally
    //   41	108	119	finally
  }
  
  public final void f(Long paramLong)
  {
    e(paramLong);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/clean/c/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */