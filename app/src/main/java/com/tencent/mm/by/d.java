package com.tencent.mm.by;

import android.os.Looper;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.vending.h.a;

public final class d
  implements a
{
  private ag mHandler;
  
  public d(ag paramag)
  {
    this.mHandler = paramag;
  }
  
  public static d b(ag paramag)
  {
    return new d(paramag);
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


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/by/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */