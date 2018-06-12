package com.tencent.mm.plugin.sport.c;

import com.tencent.mm.storage.w;

public final class h
  extends w
{
  public h(String paramString)
  {
    super(paramString);
  }
  
  public final void Og(String paramString)
  {
    try
    {
      set(2, paramString);
      return;
    }
    finally
    {
      paramString = finally;
      throw paramString;
    }
  }
  
  /* Error */
  public final String Oh(String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: iconst_2
    //   4: invokevirtual 20	com/tencent/mm/plugin/sport/c/h:get	(I)Ljava/lang/Object;
    //   7: astore_2
    //   8: aload_2
    //   9: instanceof 22
    //   12: ifeq +12 -> 24
    //   15: aload_2
    //   16: checkcast 22	java/lang/String
    //   19: astore_1
    //   20: aload_0
    //   21: monitorexit
    //   22: aload_1
    //   23: areturn
    //   24: goto -4 -> 20
    //   27: astore_1
    //   28: aload_0
    //   29: monitorexit
    //   30: aload_1
    //   31: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	32	0	this	h
    //   0	32	1	paramString	String
    //   7	9	2	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	20	27	finally
  }
  
  /* Error */
  public final long getLong(int paramInt, long paramLong)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: iload_1
    //   4: invokevirtual 20	com/tencent/mm/plugin/sport/c/h:get	(I)Ljava/lang/Object;
    //   7: astore 4
    //   9: aload 4
    //   11: instanceof 26
    //   14: ifeq +16 -> 30
    //   17: aload 4
    //   19: checkcast 26	java/lang/Long
    //   22: invokevirtual 30	java/lang/Long:longValue	()J
    //   25: lstore_2
    //   26: aload_0
    //   27: monitorexit
    //   28: lload_2
    //   29: lreturn
    //   30: aload 4
    //   32: instanceof 32
    //   35: ifeq -9 -> 26
    //   38: aload 4
    //   40: checkcast 32	java/lang/Integer
    //   43: invokevirtual 33	java/lang/Integer:longValue	()J
    //   46: lstore_2
    //   47: goto -21 -> 26
    //   50: astore 4
    //   52: aload_0
    //   53: monitorexit
    //   54: aload 4
    //   56: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	57	0	this	h
    //   0	57	1	paramInt	int
    //   0	57	2	paramLong	long
    //   7	32	4	localObject1	Object
    //   50	5	4	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   2	26	50	finally
    //   30	47	50	finally
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/sport/c/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */