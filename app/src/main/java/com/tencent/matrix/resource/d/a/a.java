package com.tencent.matrix.resource.d.a;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

public final class a<T>
{
  public final AtomicReference<T> bsq = new AtomicReference();
  public final CountDownLatch bsr = new CountDownLatch(1);
  
  public final boolean c(TimeUnit paramTimeUnit)
  {
    try
    {
      boolean bool = this.bsr.await(5L, paramTimeUnit);
      return bool;
    }
    catch (InterruptedException paramTimeUnit)
    {
      throw new RuntimeException("Did not expect thread to be interrupted", paramTimeUnit);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/matrix/resource/d/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */