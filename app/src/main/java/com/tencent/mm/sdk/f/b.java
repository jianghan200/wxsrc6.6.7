package com.tencent.mm.sdk.f;

import java.util.concurrent.atomic.AtomicInteger;
import junit.framework.Assert;

final class b
{
  private ThreadGroup dWZ;
  private final AtomicInteger sKP = new AtomicInteger(1);
  private e.b sKQ;
  
  b(e.b paramb)
  {
    this.sKQ = paramb;
    this.dWZ = new ThreadGroup("MM_FREE_THREAD_GROUP");
  }
  
  final Thread a(Runnable paramRunnable, String paramString, int paramInt)
  {
    Assert.assertNotNull("newThread arg name is null!", paramString);
    if (paramRunnable != null)
    {
      paramRunnable = new g(paramRunnable, paramString, paramInt, false, this.sKQ);
      paramRunnable = new a(this.dWZ, paramRunnable, "mmt_f" + paramString);
      paramRunnable.setPriority(paramInt);
      return paramRunnable;
    }
    paramRunnable = new a(this.dWZ, null, "mmt_f" + paramString);
    paramRunnable.setPriority(paramInt);
    return paramRunnable;
  }
  
  static final class a
    extends Thread
  {
    private g sKR;
    
    a(ThreadGroup paramThreadGroup, g paramg, String paramString)
    {
      super(paramg, paramString);
      this.sKR = paramg;
    }
    
    public final void run()
    {
      super.run();
    }
    
    public final void start()
    {
      super.start();
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/sdk/f/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */