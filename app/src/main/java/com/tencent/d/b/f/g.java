package com.tencent.d.b.f;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.tencent.d.a.c.c;

public class g
{
  private static volatile g vmA = null;
  private Handler vmB = null;
  private Handler vmC = null;
  
  private g()
  {
    HandlerThread localHandlerThread = new HandlerThread("SoterGenKeyHandlerThreadName");
    localHandlerThread.start();
    if (localHandlerThread.getLooper() != null) {}
    for (this.vmB = new Handler(localHandlerThread.getLooper());; this.vmB = new Handler(Looper.getMainLooper()))
    {
      this.vmC = new Handler(Looper.getMainLooper());
      return;
      c.e("Soter.SoterTaskThread", "soter: task looper is null! use main looper as the task looper", new Object[0]);
    }
  }
  
  public static g cGb()
  {
    if (vmA == null) {
      try
      {
        if (vmA == null) {
          vmA = new g();
        }
        g localg = vmA;
        return localg;
      }
      finally {}
    }
    return vmA;
  }
  
  public final void A(Runnable paramRunnable)
  {
    this.vmC.post(paramRunnable);
  }
  
  public final void C(Runnable paramRunnable)
  {
    this.vmB.post(paramRunnable);
  }
  
  public final void l(Runnable paramRunnable, long paramLong)
  {
    this.vmB.postDelayed(paramRunnable, paramLong);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/d/b/f/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */