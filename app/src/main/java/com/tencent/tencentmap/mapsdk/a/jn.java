package com.tencent.tencentmap.mapsdk.a;

import android.content.Context;

public class jn
{
  public static String a(Context paramContext)
  {
    if (paramContext == null) {
      paramContext = "";
    }
    for (;;)
    {
      return paramContext;
      try
      {
        String str = paramContext.getPackageName();
        if ((str != null) && (str.length() != 0))
        {
          paramContext = str;
          if (str.length() <= 255) {
            continue;
          }
          paramContext = str.substring(0, 254);
          return paramContext;
        }
      }
      catch (Exception paramContext)
      {
        return "";
      }
    }
    return "";
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/jn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */