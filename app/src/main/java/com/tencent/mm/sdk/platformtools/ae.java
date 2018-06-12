package com.tencent.mm.sdk.platformtools;

public final class ae
{
  public volatile boolean sGC;
  
  public ae()
  {
    this.sGC = false;
  }
  
  public ae(boolean paramBoolean)
  {
    this.sGC = paramBoolean;
  }
  
  public final void block()
  {
    try
    {
      for (;;)
      {
        boolean bool = this.sGC;
        if (bool) {
          break;
        }
        try
        {
          wait();
        }
        catch (InterruptedException localInterruptedException) {}
      }
      return;
    }
    finally {}
  }
  
  /* Error */
  public final boolean cih()
  {
    // Byte code:
    //   0: ldc2_w 23
    //   3: lconst_0
    //   4: lcmp
    //   5: ifeq +64 -> 69
    //   8: aload_0
    //   9: monitorenter
    //   10: invokestatic 30	java/lang/System:currentTimeMillis	()J
    //   13: lstore_1
    //   14: ldc2_w 23
    //   17: lload_1
    //   18: ladd
    //   19: lstore_3
    //   20: aload_0
    //   21: getfield 12	com/tencent/mm/sdk/platformtools/ae:sGC	Z
    //   24: istore 5
    //   26: iload 5
    //   28: ifne +23 -> 51
    //   31: lload_1
    //   32: lload_3
    //   33: lcmp
    //   34: ifge +17 -> 51
    //   37: aload_0
    //   38: lload_3
    //   39: lload_1
    //   40: lsub
    //   41: invokevirtual 33	java/lang/Object:wait	(J)V
    //   44: invokestatic 30	java/lang/System:currentTimeMillis	()J
    //   47: lstore_1
    //   48: goto -28 -> 20
    //   51: aload_0
    //   52: getfield 12	com/tencent/mm/sdk/platformtools/ae:sGC	Z
    //   55: istore 5
    //   57: aload_0
    //   58: monitorexit
    //   59: iload 5
    //   61: ireturn
    //   62: astore 6
    //   64: aload_0
    //   65: monitorexit
    //   66: aload 6
    //   68: athrow
    //   69: aload_0
    //   70: invokevirtual 35	com/tencent/mm/sdk/platformtools/ae:block	()V
    //   73: iconst_1
    //   74: ireturn
    //   75: astore 6
    //   77: goto -33 -> 44
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	80	0	this	ae
    //   13	35	1	l1	long
    //   19	20	3	l2	long
    //   24	36	5	bool	boolean
    //   62	5	6	localObject	Object
    //   75	1	6	localInterruptedException	InterruptedException
    // Exception table:
    //   from	to	target	type
    //   10	14	62	finally
    //   20	26	62	finally
    //   37	44	62	finally
    //   44	48	62	finally
    //   51	59	62	finally
    //   64	66	62	finally
    //   37	44	75	java/lang/InterruptedException
  }
  
  public final void close()
  {
    try
    {
      this.sGC = false;
      return;
    }
    finally {}
  }
  
  public final void open()
  {
    try
    {
      boolean bool = this.sGC;
      this.sGC = true;
      if (!bool) {
        notifyAll();
      }
      return;
    }
    finally {}
  }
  
  public final String toString()
  {
    return "MMConditionVariable[" + hashCode() + "," + this.sGC + "]";
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/sdk/platformtools/ae.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */