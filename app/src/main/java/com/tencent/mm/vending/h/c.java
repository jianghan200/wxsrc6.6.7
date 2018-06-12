package com.tencent.mm.vending.h;

import com.tencent.mm.vending.f.a;

public final class c
  extends d
{
  public c()
  {
    a.printErrStackTrace("Vending.NoLooperScheduler", new Exception("This is not a handler thread!"), "This is not a handler thread!", new Object[0]);
  }
  
  public final void cancel() {}
  
  public final void g(Runnable paramRunnable)
  {
    a.w("Vending.NoLooperScheduler", "This is not a handler thread!", new Object[0]);
    paramRunnable.run();
  }
  
  public final void g(Runnable paramRunnable, long paramLong)
  {
    a.w("Vending.NoLooperScheduler", "This is not a handler thread!", new Object[0]);
    paramRunnable.run();
  }
  
  public final String getType()
  {
    return Thread.currentThread().toString();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/vending/h/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */