package com.tencent.mm.plugin.traceroute.b;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor.CallerRunsPolicy;
import java.util.concurrent.TimeUnit;

public final class c
  extends ThreadPoolExecutor
{
  public c()
  {
    super(10, 20, 3000L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(200), new ThreadPoolExecutor.CallerRunsPolicy());
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/traceroute/b/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */