package com.tencent.mm.opensdk.utils;

public final class d
{
  public static boolean a(String paramString)
  {
    return (paramString == null) || (paramString.length() <= 0);
  }
  
  public static int b(String paramString)
  {
    if (paramString != null) {
      try
      {
        if (paramString.length() <= 0) {
          return 0;
        }
        int i = Integer.parseInt(paramString);
        return i;
      }
      catch (Exception paramString) {}
    }
    return 0;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/opensdk/utils/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */