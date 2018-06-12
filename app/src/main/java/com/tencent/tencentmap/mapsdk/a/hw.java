package com.tencent.tencentmap.mapsdk.a;

import android.os.Build;

public class hw
{
  private static String[] a = new String[0];
  
  public static boolean a()
  {
    boolean bool2 = false;
    String str = Build.MODEL;
    int j = a.length;
    int i = 0;
    for (;;)
    {
      boolean bool1 = bool2;
      if (i < j)
      {
        if (str.equalsIgnoreCase(a[i])) {
          bool1 = true;
        }
      }
      else {
        return bool1;
      }
      i += 1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/hw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */