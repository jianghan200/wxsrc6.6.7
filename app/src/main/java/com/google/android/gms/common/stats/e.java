package com.google.android.gms.common.stats;

import android.os.SystemClock;
import android.support.v4.e.j;

public final class e
{
  private final long aQc;
  private final int aQd;
  private final j<String, Long> aQe;
  
  public e()
  {
    this.aQc = 60000L;
    this.aQd = 10;
    this.aQe = new j(10);
  }
  
  public e(long paramLong)
  {
    this.aQc = paramLong;
    this.aQd = 1024;
    this.aQe = new j();
  }
  
  public final Long bk(String paramString)
  {
    long l2 = SystemClock.elapsedRealtime();
    long l1 = this.aQc;
    for (;;)
    {
      int i;
      try
      {
        if (this.aQe.size() >= this.aQd)
        {
          i = this.aQe.size() - 1;
          if (i >= 0)
          {
            if (l2 - ((Long)this.aQe.valueAt(i)).longValue() > l1) {
              this.aQe.removeAt(i);
            }
          }
          else
          {
            l1 /= 2L;
            new StringBuilder("The max capacity ").append(this.aQd).append(" is not enough. Current durationThreshold is: ").append(l1);
          }
        }
        else
        {
          paramString = (Long)this.aQe.put(paramString, Long.valueOf(l2));
          return paramString;
        }
      }
      finally {}
      i -= 1;
    }
  }
  
  public final boolean bl(String paramString)
  {
    for (;;)
    {
      try
      {
        if (this.aQe.remove(paramString) != null)
        {
          bool = true;
          return bool;
        }
      }
      finally {}
      boolean bool = false;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/google/android/gms/common/stats/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */