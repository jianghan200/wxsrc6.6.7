package com.tencent.mm.sdk.platformtools;

import android.os.HandlerThread;
import android.os.Looper;
import android.os.Process;
import com.tencent.mm.sdk.f.e;

public class ah
{
  private static ag sGE = null;
  private ag iYd = null;
  public HandlerThread lnJ = null;
  private String threadName = null;
  
  public ah()
  {
    x.i("MicroMsg.MMHandlerThread", "init stack:%s", new Object[] { bi.cjd() });
    sW(null);
  }
  
  public ah(String paramString)
  {
    sW(paramString);
  }
  
  public static void A(Runnable paramRunnable)
  {
    if (paramRunnable == null) {
      return;
    }
    cim().post(paramRunnable);
  }
  
  public static void Db(int paramInt)
  {
    try
    {
      Process.setThreadPriority(paramInt);
      x.i("MicroMsg.MMHandlerThread", "setCurrentPriority to %d ok", new Object[] { Integer.valueOf(paramInt) });
      return;
    }
    catch (Exception localException)
    {
      x.i("MicroMsg.MMHandlerThread", "setCurrentPriority to %d fail, %s", new Object[] { Integer.valueOf(paramInt), localException.getMessage() });
      x.printErrStackTrace("MicroMsg.MMHandlerThread", localException, "", new Object[0]);
    }
  }
  
  public static void M(Runnable paramRunnable)
  {
    if (paramRunnable == null) {
      return;
    }
    cim().removeCallbacks(paramRunnable);
  }
  
  private static ag cim()
  {
    if (sGE == null) {
      sGE = new ag(Looper.getMainLooper());
    }
    return sGE;
  }
  
  public static void i(Runnable paramRunnable, long paramLong)
  {
    if (paramRunnable == null) {
      return;
    }
    cim().postDelayed(paramRunnable, paramLong);
  }
  
  public static boolean isMainThread()
  {
    return Thread.currentThread().getId() == Looper.getMainLooper().getThread().getId();
  }
  
  private void sW(String paramString)
  {
    this.iYd = null;
    String str = paramString;
    if (bi.oW(paramString)) {
      str = "MMHandlerThread";
    }
    this.threadName = str;
    this.lnJ = e.cZ(this.threadName, 0);
    this.lnJ.start();
  }
  
  public int H(Runnable paramRunnable)
  {
    if (paramRunnable == null) {
      return -1;
    }
    cil().post(paramRunnable);
    return 0;
  }
  
  public final int L(Runnable paramRunnable)
  {
    cil().postAtFrontOfQueueV2(paramRunnable);
    return 0;
  }
  
  public final int a(final a parama)
  {
    if (new ag(this.lnJ.getLooper()).postAtFrontOfQueueV2(new Runnable()
    {
      public final void run()
      {
        parama.Kr();
        ah.N(new Runnable()
        {
          public final void run()
          {
            ah.2.this.sGI.Ks();
          }
        });
      }
      
      public final String toString()
      {
        return super.toString() + "|" + parama.toString();
      }
    })) {
      return 0;
    }
    return -2;
  }
  
  /* Error */
  public final int a(final b paramb)
  {
    // Byte code:
    //   0: ldc 39
    //   2: ldc -86
    //   4: iconst_2
    //   5: anewarray 4	java/lang/Object
    //   8: dup
    //   9: iconst_0
    //   10: invokestatic 130	java/lang/Thread:currentThread	()Ljava/lang/Thread;
    //   13: invokevirtual 134	java/lang/Thread:getId	()J
    //   16: invokestatic 175	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   19: aastore
    //   20: dup
    //   21: iconst_1
    //   22: invokestatic 47	com/tencent/mm/sdk/platformtools/bi:cjd	()Lcom/tencent/mm/sdk/platformtools/aj;
    //   25: aastore
    //   26: invokestatic 53	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   29: ldc -79
    //   31: invokestatic 179	com/tencent/mm/sdk/platformtools/ah:isMainThread	()Z
    //   34: invokestatic 185	junit/framework/Assert:assertTrue	(Ljava/lang/String;Z)V
    //   37: aload_0
    //   38: getfield 33	com/tencent/mm/sdk/platformtools/ah:lnJ	Landroid/os/HandlerThread;
    //   41: invokevirtual 186	android/os/HandlerThread:getId	()J
    //   44: lstore_3
    //   45: iconst_0
    //   46: newarray <illegal type>
    //   48: astore 7
    //   50: new 6	com/tencent/mm/sdk/platformtools/ah$1
    //   53: dup
    //   54: aload_0
    //   55: aload_1
    //   56: aload_0
    //   57: getfield 37	com/tencent/mm/sdk/platformtools/ah:threadName	Ljava/lang/String;
    //   60: aload 7
    //   62: invokespecial 189	com/tencent/mm/sdk/platformtools/ah$1:<init>	(Lcom/tencent/mm/sdk/platformtools/ah;Lcom/tencent/mm/sdk/platformtools/ah$b;Ljava/lang/String;Ljava/lang/Object;)V
    //   65: astore_1
    //   66: aload 7
    //   68: monitorenter
    //   69: aload_0
    //   70: aload_1
    //   71: invokevirtual 191	com/tencent/mm/sdk/platformtools/ah:a	(Lcom/tencent/mm/sdk/platformtools/ah$a;)I
    //   74: istore_2
    //   75: aload_0
    //   76: getfield 33	com/tencent/mm/sdk/platformtools/ah:lnJ	Landroid/os/HandlerThread;
    //   79: invokevirtual 186	android/os/HandlerThread:getId	()J
    //   82: lstore 5
    //   84: ldc 39
    //   86: ldc -63
    //   88: iconst_3
    //   89: anewarray 4	java/lang/Object
    //   92: dup
    //   93: iconst_0
    //   94: iload_2
    //   95: invokestatic 86	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   98: aastore
    //   99: dup
    //   100: iconst_1
    //   101: lload_3
    //   102: invokestatic 175	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   105: aastore
    //   106: dup
    //   107: iconst_2
    //   108: lload 5
    //   110: invokestatic 175	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   113: aastore
    //   114: invokestatic 53	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   117: iload_2
    //   118: ifne +15 -> 133
    //   121: lload_3
    //   122: lload 5
    //   124: lcmp
    //   125: ifne +8 -> 133
    //   128: aload 7
    //   130: invokevirtual 196	java/lang/Object:wait	()V
    //   133: aload 7
    //   135: monitorexit
    //   136: iload_2
    //   137: ireturn
    //   138: astore_1
    //   139: ldc 39
    //   141: ldc -58
    //   143: iconst_1
    //   144: anewarray 4	java/lang/Object
    //   147: dup
    //   148: iconst_0
    //   149: aload_1
    //   150: invokevirtual 92	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   153: aastore
    //   154: invokestatic 201	com/tencent/mm/sdk/platformtools/x:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   157: goto -24 -> 133
    //   160: astore_1
    //   161: aload 7
    //   163: monitorexit
    //   164: aload_1
    //   165: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	166	0	this	ah
    //   0	166	1	paramb	b
    //   74	63	2	i	int
    //   44	78	3	l1	long
    //   82	41	5	l2	long
    //   48	114	7	arrayOfByte	byte[]
    // Exception table:
    //   from	to	target	type
    //   128	133	138	java/lang/Exception
    //   69	117	160	finally
    //   128	133	160	finally
    //   133	136	160	finally
    //   139	157	160	finally
    //   161	164	160	finally
  }
  
  public final void cii()
  {
    if ((this.lnJ == null) || (!this.lnJ.isAlive()))
    {
      x.e("MicroMsg.MMHandlerThread", "setLowestPriority failed thread is dead");
      return;
    }
    int i = this.lnJ.getThreadId();
    try
    {
      if (19 == Process.getThreadPriority(i))
      {
        x.w("MicroMsg.MMHandlerThread", "setLowestPriority No Need.");
        return;
      }
    }
    catch (Exception localException)
    {
      x.w("MicroMsg.MMHandlerThread", "thread:%d setLowestPriority failed", new Object[] { Integer.valueOf(i) });
      x.printErrStackTrace("MicroMsg.MMHandlerThread", localException, "", new Object[0]);
      return;
    }
    Process.setThreadPriority(i, 19);
    x.i("MicroMsg.MMHandlerThread", "thread:%d setLowestPriority to %d", new Object[] { Integer.valueOf(i), Integer.valueOf(Process.getThreadPriority(i)) });
  }
  
  public final int cij()
  {
    if (this.lnJ == null) {
      return -1;
    }
    return this.lnJ.getThreadId();
  }
  
  public final void cik()
  {
    if ((this.lnJ == null) || (!this.lnJ.isAlive()))
    {
      x.e("MicroMsg.MMHandlerThread", "setLowPriority failed thread is dead");
      return;
    }
    int i = this.lnJ.getThreadId();
    try
    {
      if (Process.getThreadPriority(i) == 0)
      {
        x.w("MicroMsg.MMHandlerThread", "setLowPriority No Need.");
        return;
      }
    }
    catch (Exception localException)
    {
      x.w("MicroMsg.MMHandlerThread", "thread:%d setLowPriority failed", new Object[] { Integer.valueOf(i) });
      x.printErrStackTrace("MicroMsg.MMHandlerThread", localException, "", new Object[0]);
      return;
    }
    Process.setThreadPriority(i, 0);
    x.i("MicroMsg.MMHandlerThread", "thread:%d setLowPriority to %d", new Object[] { Integer.valueOf(i), Integer.valueOf(Process.getThreadPriority(i)) });
  }
  
  public final ag cil()
  {
    if (this.iYd == null) {
      this.iYd = new ag(this.lnJ.getLooper());
    }
    return this.iYd;
  }
  
  public final int h(Runnable paramRunnable, long paramLong)
  {
    if (paramRunnable == null) {
      return -1;
    }
    cil().postDelayed(paramRunnable, paramLong);
    return 0;
  }
  
  public final void uW()
  {
    if ((this.lnJ == null) || (!this.lnJ.isAlive()))
    {
      x.e("MicroMsg.MMHandlerThread", "setHighPriority failed thread is dead");
      return;
    }
    int i = this.lnJ.getThreadId();
    try
    {
      if (-8 == Process.getThreadPriority(i))
      {
        x.w("MicroMsg.MMHandlerThread", "setHighPriority No Need.");
        return;
      }
    }
    catch (Exception localException)
    {
      x.w("MicroMsg.MMHandlerThread", "thread:%d setHighPriority failed", new Object[] { Integer.valueOf(i) });
      x.printErrStackTrace("MicroMsg.MMHandlerThread", localException, "", new Object[0]);
      return;
    }
    Process.setThreadPriority(i, -8);
    x.i("MicroMsg.MMHandlerThread", "thread:%d setHighPriority to %d", new Object[] { Integer.valueOf(i), Integer.valueOf(Process.getThreadPriority(i)) });
  }
  
  public static abstract interface a
  {
    public abstract boolean Kr();
    
    public abstract boolean Ks();
  }
  
  public static abstract interface b
  {
    public abstract void En();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/sdk/platformtools/ah.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */