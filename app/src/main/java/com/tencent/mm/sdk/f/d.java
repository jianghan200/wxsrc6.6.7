package com.tencent.mm.sdk.f;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

final class d
  implements ThreadFactory
{
  private ThreadGroup dWZ = new ThreadGroup("MM_THREAD_POOL_GROUP");
  private final AtomicInteger sKP = new AtomicInteger(1);
  
  public final Thread newThread(Runnable paramRunnable)
  {
    paramRunnable = new Thread(this.dWZ, paramRunnable, "MM_Thread_Pool_Thread#" + this.sKP.getAndIncrement());
    if (paramRunnable.isDaemon()) {
      paramRunnable.setDaemon(false);
    }
    if (paramRunnable.getPriority() != 5) {
      paramRunnable.setPriority(5);
    }
    return paramRunnable;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/sdk/f/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */