package com.google.android.gms.analytics.internal;

import android.content.Context;
import android.os.Handler;
import com.google.android.gms.c.v;
import com.google.android.gms.common.internal.w;

abstract class ae
{
  private static volatile Handler aHj;
  final q aFn;
  final Runnable aHk;
  volatile long aHl;
  private boolean aHm;
  
  ae(q paramq)
  {
    w.ah(paramq);
    this.aFn = paramq;
    this.aHk = new ae.1(this);
  }
  
  public final void ac(long paramLong)
  {
    cancel();
    if (paramLong >= 0L)
    {
      this.aHl = this.aFn.aFC.currentTimeMillis();
      if (!getHandler().postDelayed(this.aHk, paramLong)) {
        this.aFn.nr().g("Failed to schedule delayed post. time", Long.valueOf(paramLong));
      }
    }
  }
  
  public final void cancel()
  {
    this.aHl = 0L;
    getHandler().removeCallbacks(this.aHk);
  }
  
  final Handler getHandler()
  {
    if (aHj != null) {
      return aHj;
    }
    try
    {
      if (aHj == null) {
        aHj = new Handler(this.aFn.mContext.getMainLooper());
      }
      Handler localHandler = aHj;
      return localHandler;
    }
    finally {}
  }
  
  public final boolean of()
  {
    return this.aHl != 0L;
  }
  
  public abstract void run();
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/google/android/gms/analytics/internal/ae.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */