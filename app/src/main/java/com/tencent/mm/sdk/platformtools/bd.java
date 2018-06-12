package com.tencent.mm.sdk.platformtools;

public abstract class bd<R>
{
  long dCL;
  private final long dJH;
  private Object lock = new Object();
  private R result;
  private Runnable sHb = new bd.1(this);
  long sJd;
  boolean sJe = false;
  
  public bd()
  {
    this(0L, null, (byte)0);
  }
  
  public bd(long paramLong, R paramR)
  {
    this.dJH = paramLong;
    this.result = paramR;
    this.sJe = true;
  }
  
  public bd(long paramLong, R paramR, byte paramByte)
  {
    this.dJH = paramLong;
    this.result = paramR;
  }
  
  /* Error */
  public final R a(ag paramag)
  {
    // Byte code:
    //   0: aload_1
    //   1: ifnonnull +15 -> 16
    //   4: ldc 50
    //   6: ldc 52
    //   8: invokestatic 58	com/tencent/mm/sdk/platformtools/x:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   11: aload_0
    //   12: invokevirtual 62	com/tencent/mm/sdk/platformtools/bd:run	()Ljava/lang/Object;
    //   15: areturn
    //   16: ldc 50
    //   18: ldc 64
    //   20: invokestatic 67	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   23: invokestatic 73	java/lang/Thread:currentThread	()Ljava/lang/Thread;
    //   26: invokevirtual 77	java/lang/Thread:getId	()J
    //   29: aload_1
    //   30: invokevirtual 83	com/tencent/mm/sdk/platformtools/ag:getLooper	()Landroid/os/Looper;
    //   33: invokevirtual 88	android/os/Looper:getThread	()Ljava/lang/Thread;
    //   36: invokevirtual 77	java/lang/Thread:getId	()J
    //   39: lcmp
    //   40: ifne +15 -> 55
    //   43: ldc 50
    //   45: ldc 90
    //   47: invokestatic 67	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   50: aload_0
    //   51: invokevirtual 62	com/tencent/mm/sdk/platformtools/bd:run	()Ljava/lang/Object;
    //   54: areturn
    //   55: aload_0
    //   56: invokestatic 95	com/tencent/mm/sdk/platformtools/bi:VG	()J
    //   59: putfield 97	com/tencent/mm/sdk/platformtools/bd:dCL	J
    //   62: aload_0
    //   63: getfield 28	com/tencent/mm/sdk/platformtools/bd:lock	Ljava/lang/Object;
    //   66: astore 4
    //   68: aload 4
    //   70: monitorenter
    //   71: ldc 50
    //   73: ldc 99
    //   75: invokestatic 67	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   78: aload_1
    //   79: aload_0
    //   80: getfield 37	com/tencent/mm/sdk/platformtools/bd:sHb	Ljava/lang/Runnable;
    //   83: invokevirtual 103	com/tencent/mm/sdk/platformtools/ag:post	(Ljava/lang/Runnable;)Z
    //   86: pop
    //   87: aload_0
    //   88: getfield 28	com/tencent/mm/sdk/platformtools/bd:lock	Ljava/lang/Object;
    //   91: aload_0
    //   92: getfield 39	com/tencent/mm/sdk/platformtools/bd:dJH	J
    //   95: invokevirtual 107	java/lang/Object:wait	(J)V
    //   98: aload 4
    //   100: monitorexit
    //   101: aload_0
    //   102: getfield 97	com/tencent/mm/sdk/platformtools/bd:dCL	J
    //   105: invokestatic 111	com/tencent/mm/sdk/platformtools/bi:bI	(J)J
    //   108: lstore_2
    //   109: ldc 50
    //   111: ldc 113
    //   113: iconst_4
    //   114: anewarray 5	java/lang/Object
    //   117: dup
    //   118: iconst_0
    //   119: new 115	java/lang/StringBuilder
    //   122: dup
    //   123: invokespecial 116	java/lang/StringBuilder:<init>	()V
    //   126: aload_0
    //   127: getfield 41	com/tencent/mm/sdk/platformtools/bd:result	Ljava/lang/Object;
    //   130: invokevirtual 120	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   133: invokevirtual 124	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   136: aastore
    //   137: dup
    //   138: iconst_1
    //   139: lload_2
    //   140: invokestatic 130	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   143: aastore
    //   144: dup
    //   145: iconst_2
    //   146: aload_0
    //   147: getfield 132	com/tencent/mm/sdk/platformtools/bd:sJd	J
    //   150: invokestatic 130	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   153: aastore
    //   154: dup
    //   155: iconst_3
    //   156: lload_2
    //   157: aload_0
    //   158: getfield 132	com/tencent/mm/sdk/platformtools/bd:sJd	J
    //   161: lsub
    //   162: invokestatic 130	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   165: aastore
    //   166: invokestatic 135	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   169: aload_0
    //   170: getfield 41	com/tencent/mm/sdk/platformtools/bd:result	Ljava/lang/Object;
    //   173: areturn
    //   174: astore_1
    //   175: aload 4
    //   177: monitorexit
    //   178: aload_1
    //   179: athrow
    //   180: astore_1
    //   181: ldc 50
    //   183: aload_1
    //   184: ldc -119
    //   186: iconst_0
    //   187: anewarray 5	java/lang/Object
    //   190: invokestatic 141	com/tencent/mm/sdk/platformtools/x:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   193: goto -92 -> 101
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	196	0	this	bd
    //   0	196	1	paramag	ag
    //   108	49	2	l	long
    // Exception table:
    //   from	to	target	type
    //   71	101	174	finally
    //   175	178	174	finally
    //   62	71	180	java/lang/InterruptedException
    //   178	180	180	java/lang/InterruptedException
  }
  
  public final void cf(R arg1)
  {
    x.i("MicroMsg.SDK.SyncTask", "setResultFinish ");
    this.result = ???;
    synchronized (this.lock)
    {
      x.i("MicroMsg.SDK.SyncTask", "setResultFinish synchronized");
      this.lock.notify();
      return;
    }
  }
  
  public abstract R run();
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/sdk/platformtools/bd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */