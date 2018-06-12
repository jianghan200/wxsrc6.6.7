package com.google.android.gms.analytics;

public final class e
{
  static String l(String paramString, int paramInt)
  {
    if (paramInt <= 0)
    {
      com.google.android.gms.analytics.internal.e.c("index out of range for prefix", paramString);
      return "";
    }
    return paramString + paramInt;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/google/android/gms/analytics/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */