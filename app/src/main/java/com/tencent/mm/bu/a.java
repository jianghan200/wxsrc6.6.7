package com.tencent.mm.bu;

import android.os.HandlerThread;
import android.os.Looper;
import com.tencent.mm.sdk.f.e;
import com.tencent.mm.sdk.platformtools.ag;

public class a
{
  private static volatile a tft;
  private ag mHandler;
  private HandlerThread mHandlerThread = e.Xs("WorkerThread#" + hashCode());
  private ag tfu;
  
  private a()
  {
    this.mHandlerThread.start();
    this.mHandler = new ag(this.mHandlerThread.getLooper());
    this.tfu = new ag(Looper.getMainLooper());
  }
  
  public static boolean ab(Runnable paramRunnable)
  {
    return cop().tfu.post(paramRunnable);
  }
  
  private static a cop()
  {
    if (tft == null) {}
    try
    {
      if (tft == null) {
        tft = new a();
      }
      return tft;
    }
    finally {}
  }
  
  public static HandlerThread coq()
  {
    return cop().mHandlerThread;
  }
  
  public static boolean j(Runnable paramRunnable, long paramLong)
  {
    return cop().tfu.postDelayed(paramRunnable, paramLong);
  }
  
  public static boolean post(Runnable paramRunnable)
  {
    return cop().mHandler.post(paramRunnable);
  }
  
  public static boolean postDelayed(Runnable paramRunnable, long paramLong)
  {
    return cop().mHandler.postDelayed(paramRunnable, paramLong);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/bu/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */