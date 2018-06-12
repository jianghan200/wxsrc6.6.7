package com.google.android.gms.analytics.internal;

public enum x
{
  private x() {}
  
  public static x aY(String paramString)
  {
    if ("BATCH_BY_SESSION".equalsIgnoreCase(paramString)) {
      return aGS;
    }
    if ("BATCH_BY_TIME".equalsIgnoreCase(paramString)) {
      return aGT;
    }
    if ("BATCH_BY_BRUTE_FORCE".equalsIgnoreCase(paramString)) {
      return aGU;
    }
    if ("BATCH_BY_COUNT".equalsIgnoreCase(paramString)) {
      return aGV;
    }
    if ("BATCH_BY_SIZE".equalsIgnoreCase(paramString)) {
      return aGW;
    }
    return aGR;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/google/android/gms/analytics/internal/x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */