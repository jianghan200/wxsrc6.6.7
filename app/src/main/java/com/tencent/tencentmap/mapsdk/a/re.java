package com.tencent.tencentmap.mapsdk.a;

public enum re
{
  private re() {}
  
  public static String a(re paramre)
  {
    if ((paramre == null) || (paramre.name() == null) || (paramre.name().indexOf("_") == -1)) {
      return "en";
    }
    return paramre.name().substring(paramre.name().indexOf("_") + 1);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/re.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */