package com.google.android.gms.analytics.internal;

import com.google.android.gms.c.v;
import com.google.android.gms.common.internal.w;

final class j
{
  private final v aFC;
  long aFD;
  
  public j(v paramv)
  {
    w.ah(paramv);
    this.aFC = paramv;
  }
  
  public j(v paramv, long paramLong)
  {
    w.ah(paramv);
    this.aFC = paramv;
    this.aFD = paramLong;
  }
  
  public final boolean Y(long paramLong)
  {
    if (this.aFD == 0L) {}
    while (this.aFC.elapsedRealtime() - this.aFD > paramLong) {
      return true;
    }
    return false;
  }
  
  public final void start()
  {
    this.aFD = this.aFC.elapsedRealtime();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/google/android/gms/analytics/internal/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */