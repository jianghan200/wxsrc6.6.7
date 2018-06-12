package com.tencent.mm.sdk.f;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor.CallerRunsPolicy;
import java.util.concurrent.TimeUnit;

final class f
  extends ThreadPoolExecutor
{
  private a sLj;
  
  public f(int paramInt, TimeUnit paramTimeUnit, BlockingQueue<Runnable> paramBlockingQueue, a parama)
  {
    super(0, paramInt, 120L, paramTimeUnit, paramBlockingQueue, new d(), new ThreadPoolExecutor.CallerRunsPolicy());
    this.sLj = parama;
  }
  
  protected final void afterExecute(Runnable paramRunnable, Throwable paramThrowable)
  {
    super.afterExecute(paramRunnable, paramThrowable);
    if (this.sLj != null) {
      this.sLj.R(paramRunnable);
    }
  }
  
  protected final void beforeExecute(Thread paramThread, Runnable paramRunnable)
  {
    if (this.sLj != null) {
      this.sLj.beforeExecute(paramThread, paramRunnable);
    }
    super.beforeExecute(paramThread, paramRunnable);
  }
  
  public final void execute(Runnable paramRunnable)
  {
    super.execute(paramRunnable);
  }
  
  static abstract interface a
  {
    public abstract void R(Runnable paramRunnable);
    
    public abstract void beforeExecute(Thread paramThread, Runnable paramRunnable);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/sdk/f/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */