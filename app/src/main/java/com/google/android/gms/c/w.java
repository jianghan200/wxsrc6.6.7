package com.google.android.gms.c;

import android.os.SystemClock;

public final class w
  implements v
{
  private static w aXM;
  
  public static v qf()
  {
    try
    {
      if (aXM == null) {
        aXM = new w();
      }
      w localw = aXM;
      return localw;
    }
    finally {}
  }
  
  public final long currentTimeMillis()
  {
    return System.currentTimeMillis();
  }
  
  public final long elapsedRealtime()
  {
    return SystemClock.elapsedRealtime();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/google/android/gms/c/w.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */