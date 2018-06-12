package com.tencent.tencentmap.mapsdk.a;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public class bv
  implements ThreadFactory
{
  private String a;
  private AtomicInteger b;
  
  public bv(String paramString)
  {
    this.a = paramString;
    this.b = new AtomicInteger(1);
  }
  
  public Thread newThread(Runnable paramRunnable)
  {
    return new Thread(paramRunnable, this.a + "_" + this.b.getAndIncrement());
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/bv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */