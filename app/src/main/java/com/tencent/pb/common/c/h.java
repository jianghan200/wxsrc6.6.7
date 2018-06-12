package com.tencent.pb.common.c;

import android.os.Handler;
import android.os.Looper;

public final class h
{
  public static Handler gA = new Handler(Looper.getMainLooper());
  
  public static void af(Runnable paramRunnable)
  {
    if (Looper.getMainLooper().getThread() == Thread.currentThread()) {}
    for (int i = 1; i != 0; i = 0)
    {
      paramRunnable.run();
      return;
    }
    gA.post(paramRunnable);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/pb/common/c/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */