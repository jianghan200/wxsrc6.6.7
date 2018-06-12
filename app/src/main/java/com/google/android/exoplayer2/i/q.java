package com.google.android.exoplayer2.i;

public final class q
{
  private long aCF;
  public volatile long aCG = -9223372036854775807L;
  public long amH;
  
  public q(long paramLong)
  {
    S(paramLong);
  }
  
  public static long V(long paramLong)
  {
    return 1000000L * paramLong / 90000L;
  }
  
  public static long W(long paramLong)
  {
    return 90000L * paramLong / 1000000L;
  }
  
  /* Error */
  public final void S(long paramLong)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 17	com/google/android/exoplayer2/i/q:aCG	J
    //   6: ldc2_w 14
    //   9: lcmp
    //   10: ifne +17 -> 27
    //   13: iconst_1
    //   14: istore_3
    //   15: iload_3
    //   16: invokestatic 34	com/google/android/exoplayer2/i/a:ap	(Z)V
    //   19: aload_0
    //   20: lload_1
    //   21: putfield 36	com/google/android/exoplayer2/i/q:amH	J
    //   24: aload_0
    //   25: monitorexit
    //   26: return
    //   27: iconst_0
    //   28: istore_3
    //   29: goto -14 -> 15
    //   32: astore 4
    //   34: aload_0
    //   35: monitorexit
    //   36: aload 4
    //   38: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	39	0	this	q
    //   0	39	1	paramLong	long
    //   14	15	3	bool	boolean
    //   32	5	4	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	13	32	finally
    //   15	24	32	finally
  }
  
  public final long T(long paramLong)
  {
    if (paramLong == -9223372036854775807L) {
      return -9223372036854775807L;
    }
    if (this.aCG != -9223372036854775807L)
    {
      long l2 = W(this.aCG);
      long l3 = (4294967296L + l2) / 8589934592L;
      long l1 = (l3 - 1L) * 8589934592L + paramLong;
      paramLong = l3 * 8589934592L + paramLong;
      if (Math.abs(l1 - l2) < Math.abs(paramLong - l2)) {
        paramLong = l1;
      }
    }
    for (;;)
    {
      return U(V(paramLong));
    }
  }
  
  public final long U(long paramLong)
  {
    if (paramLong == -9223372036854775807L) {
      return -9223372036854775807L;
    }
    if (this.aCG != -9223372036854775807L) {
      this.aCG = paramLong;
    }
    for (;;)
    {
      return this.aCF + paramLong;
      if (this.amH != Long.MAX_VALUE) {
        this.aCF = (this.amH - paramLong);
      }
      try
      {
        this.aCG = paramLong;
        notifyAll();
      }
      finally {}
    }
  }
  
  public final long mp()
  {
    long l = -9223372036854775807L;
    if (this.amH == Long.MAX_VALUE) {
      l = 0L;
    }
    while (this.aCG == -9223372036854775807L) {
      return l;
    }
    return this.aCF;
  }
  
  /* Error */
  public final void mq()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 17	com/google/android/exoplayer2/i/q:aCG	J
    //   6: ldc2_w 14
    //   9: lcmp
    //   10: ifne +15 -> 25
    //   13: aload_0
    //   14: invokevirtual 66	java/lang/Object:wait	()V
    //   17: goto -15 -> 2
    //   20: astore_1
    //   21: aload_0
    //   22: monitorexit
    //   23: aload_1
    //   24: athrow
    //   25: aload_0
    //   26: monitorexit
    //   27: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	28	0	this	q
    //   20	4	1	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	17	20	finally
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/google/android/exoplayer2/i/q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */