package com.tencent.mm.sdk.platformtools;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class au
{
  private static final ConcurrentLinkedQueue<Runnable> sIq = new ConcurrentLinkedQueue();
  private static ExecutorService sIr = null;
  
  public static void O(Runnable paramRunnable)
  {
    sIq.add(paramRunnable);
  }
  
  public static void P(Runnable paramRunnable)
  {
    sIq.remove(paramRunnable);
  }
  
  public static ExecutorService ciA()
  {
    try
    {
      if (sIr == null) {
        sIr = Executors.newSingleThreadExecutor();
      }
      ExecutorService localExecutorService = sIr;
      return localExecutorService;
    }
    finally {}
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/sdk/platformtools/au.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */