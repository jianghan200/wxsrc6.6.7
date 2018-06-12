package com.tencent.mm.plugin.appbrand.dynamic;

import android.os.HandlerThread;
import android.os.Looper;
import com.tencent.mm.sdk.f.e;
import com.tencent.mm.sdk.platformtools.ag;

public final class b
{
  private static ag fun;
  private static ag fuo;
  private static ag fup = new ag(Looper.getMainLooper());
  
  static
  {
    HandlerThread localHandlerThread = e.Xs("DynamicPage#WorkerThread");
    localHandlerThread.start();
    fun = new ag(localHandlerThread.getLooper());
    localHandlerThread = e.Xs("DynamicPage#IPCThread");
    localHandlerThread.start();
    fuo = new ag(localHandlerThread.getLooper());
  }
  
  public static ag aeO()
  {
    return fun;
  }
  
  public static boolean e(Runnable paramRunnable, long paramLong)
  {
    if (paramRunnable == null) {
      return false;
    }
    return fun.postDelayed(paramRunnable, paramLong);
  }
  
  public static boolean n(Runnable paramRunnable)
  {
    if (paramRunnable == null) {
      return false;
    }
    return fun.post(paramRunnable);
  }
  
  public static boolean o(Runnable paramRunnable)
  {
    return fup.post(paramRunnable);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/appbrand/dynamic/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */