package com.google.android.exoplayer2;

import java.util.HashSet;

public final class j
{
  private static final HashSet<String> adR = new HashSet();
  private static String adS = "goog.exo.core";
  
  public static void ae(String paramString)
  {
    try
    {
      if (adR.add(paramString)) {
        adS = adS + ", " + paramString;
      }
      return;
    }
    finally
    {
      paramString = finally;
      throw paramString;
    }
  }
  
  public static String iO()
  {
    try
    {
      String str = adS;
      return str;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/google/android/exoplayer2/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */