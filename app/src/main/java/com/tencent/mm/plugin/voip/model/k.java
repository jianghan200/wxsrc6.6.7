package com.tencent.mm.plugin.voip.model;

import java.util.concurrent.locks.ReentrantLock;

public final class k
{
  private static k oKr = new k();
  private ReentrantLock bvV = new ReentrantLock();
  private j oKs;
  
  public static j bKc()
  {
    if (oKr.oKs == null) {
      oKr.bvV.lock();
    }
    try
    {
      if (oKr.oKs == null) {
        oKr.oKs = new j();
      }
      return oKr.oKs;
    }
    finally
    {
      oKr.bvV.unlock();
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/voip/model/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */