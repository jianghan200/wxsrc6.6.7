package com.tencent.mm.pluginsdk.g.a.c;

import com.tencent.mm.sdk.f.e;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public final class u
  implements ThreadFactory
{
  private static final AtomicInteger qDD = new AtomicInteger(1);
  private final AtomicInteger dXa = new AtomicInteger(1);
  private String dXb;
  
  public u()
  {
    this("ResDownloaderPool", "ResDownloaderThread");
  }
  
  public u(String paramString1, String paramString2)
  {
    this.dXb = String.format("%s-%d-%s-", new Object[] { paramString1, Integer.valueOf(qDD.getAndIncrement()), paramString2 });
  }
  
  public final Thread newThread(Runnable paramRunnable)
  {
    paramRunnable = e.d(paramRunnable, this.dXb + this.dXa.getAndIncrement(), 1);
    if (paramRunnable.isDaemon()) {
      paramRunnable.setDaemon(false);
    }
    return paramRunnable;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/pluginsdk/g/a/c/u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */