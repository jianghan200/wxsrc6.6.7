package com.tencent.mm.plugin.game.wepkg.downloader;

import com.tencent.mm.sdk.platformtools.x;
import java.util.HashMap;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class h
  extends ThreadPoolExecutor
{
  public h(TimeUnit paramTimeUnit, BlockingQueue<Runnable> paramBlockingQueue, ThreadFactory paramThreadFactory)
  {
    super(3, 3, 3000L, paramTimeUnit, paramBlockingQueue, paramThreadFactory);
  }
  
  protected final void afterExecute(Runnable paramRunnable, Throwable paramThrowable)
  {
    if ((paramRunnable instanceof e))
    {
      e locale = (e)paramRunnable;
      if ((locale.keu != null) && (locale.keu.kdY != null))
      {
        d.aVs().Ee(locale.keu.kdY.kev);
        x.i("MicroMsg.Wepkg.WePkgThreadPoolExecutor", "remove download task");
      }
    }
    x.i("MicroMsg.Wepkg.WePkgThreadPoolExecutor", "afterExecute");
    super.afterExecute(paramRunnable, paramThrowable);
  }
  
  protected final void beforeExecute(Thread paramThread, Runnable paramRunnable)
  {
    super.beforeExecute(paramThread, paramRunnable);
    x.i("MicroMsg.Wepkg.WePkgThreadPoolExecutor", "beforeExecute");
  }
  
  protected final <V> RunnableFuture<V> newTaskFor(Runnable paramRunnable, V paramV)
  {
    if ((paramRunnable instanceof c)) {
      return new e(paramRunnable, paramV, (c)paramRunnable);
    }
    return super.newTaskFor(paramRunnable, paramV);
  }
  
  protected final void terminated()
  {
    d locald = d.aVs();
    if (locald.kei != null) {
      locald.kei.clear();
    }
    super.terminated();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/game/wepkg/downloader/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */