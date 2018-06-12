package com.tencent.mm.vending.h;

import android.os.Handler;
import android.os.Looper;

public final class b
  implements a
{
  public Handler mHandler;
  
  public b(Handler paramHandler)
  {
    this.mHandler = paramHandler;
  }
  
  public final void cA()
  {
    this.mHandler.removeCallbacksAndMessages(null);
  }
  
  public final Looper getLooper()
  {
    return this.mHandler.getLooper();
  }
  
  public final void j(Runnable paramRunnable)
  {
    this.mHandler.post(paramRunnable);
  }
  
  public final void k(Runnable paramRunnable, long paramLong)
  {
    this.mHandler.postDelayed(paramRunnable, paramLong);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/vending/h/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */