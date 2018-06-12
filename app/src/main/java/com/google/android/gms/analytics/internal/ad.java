package com.google.android.gms.analytics.internal;

import com.google.android.gms.analytics.b;

final class ad
  implements b
{
  private int aFG = 2;
  private boolean aHi;
  
  public final int getLogLevel()
  {
    return this.aFG;
  }
  
  public final void setLogLevel(int paramInt)
  {
    this.aFG = paramInt;
    if (!this.aHi)
    {
      aj.aHt.get();
      new StringBuilder("Logger is deprecated. To enable debug logging, please run:\nadb shell setprop log.tag.").append((String)aj.aHt.get()).append(" DEBUG");
      this.aHi = true;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/google/android/gms/analytics/internal/ad.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */