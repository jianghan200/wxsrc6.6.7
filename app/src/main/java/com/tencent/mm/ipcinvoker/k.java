package com.tencent.mm.ipcinvoker;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import java.util.concurrent.ExecutorService;

public class k
{
  private static volatile k dmI;
  private Handler dmJ;
  private l dmK;
  private Handler mHandler;
  private HandlerThread mHandlerThread = new HandlerThread("ThreadCaller#Worker-" + hashCode());
  
  private k()
  {
    this.mHandlerThread.start();
    this.mHandler = new Handler(this.mHandlerThread.getLooper());
    this.dmJ = new Handler(Looper.getMainLooper());
    this.dmK = l.Cw();
  }
  
  private static k Cu()
  {
    if (dmI == null) {}
    try
    {
      if (dmI == null) {
        dmI = new k();
      }
      return dmI;
    }
    finally {}
  }
  
  public static boolean h(Runnable paramRunnable)
  {
    Cu().dmK.dmN.execute(paramRunnable);
    return true;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/ipcinvoker/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */