package com.tencent.map.lib.thread;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor.DiscardOldestPolicy;
import java.util.concurrent.TimeUnit;

public class LowThreadExecutor
  implements Executor
{
  private final ThreadFactory a = new LowThreadExecutor.1(this);
  private final BlockingQueue<Runnable> b = new LinkedBlockingQueue(20);
  public final Executor mExecutor = new ThreadPoolExecutor(5, 128, 1L, TimeUnit.SECONDS, this.b, this.a, new ThreadPoolExecutor.DiscardOldestPolicy());
  
  public void execute(Runnable paramRunnable)
  {
    this.mExecutor.execute(paramRunnable);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/map/lib/thread/LowThreadExecutor.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */