package com.google.android.gms.analytics.internal;

import com.google.android.gms.analytics.b;

@Deprecated
public final class e
{
  private static volatile b aFi = new ad();
  
  public static void c(String paramString, Object paramObject)
  {
    int j = 0;
    f localf = f.mM();
    if (localf != null) {
      localf.g(paramString, paramObject);
    }
    for (;;)
    {
      paramString = aFi;
      return;
      int i = j;
      if (aFi != null)
      {
        i = j;
        if (aFi.getLogLevel() <= 3) {
          i = 1;
        }
      }
      if (i != 0)
      {
        if (paramObject != null) {
          new StringBuilder().append(paramString).append(":").append(paramObject);
        }
        aj.aHt.get();
      }
    }
  }
  
  public static b mL()
  {
    return aFi;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/google/android/gms/analytics/internal/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */