package com.tencent.tencentmap.mapsdk.a;

public class jy
{
  public static String a()
  {
    String str = d();
    if (str.equals("didi"))
    {
      if (ac.a() == 1) {
        return "ddsdk.vectors.map.qq.com";
      }
      return "ddsdk.vectors2.map.qq.com";
    }
    if (str.equals("tencentmap")) {
      return "mapvectors.map.qq.com";
    }
    return "vectorsdk.map.qq.com";
  }
  
  public static String a(String paramString)
  {
    String str2 = d();
    String str1 = paramString;
    if (!str2.equals("didi"))
    {
      str1 = paramString;
      if (!str2.equals("tencentmap"))
      {
        str1 = paramString;
        if (paramString.contains("indoor_map"))
        {
          paramString = paramString.replace("http://vectorsdk.map.qq.com/indoor_map?", "http://mapvectors.map.qq.com/indoormap2?");
          str1 = paramString + "&apiKey=" + kh.a;
        }
      }
    }
    return str1;
  }
  
  public static String b()
  {
    if (d().equals("didi")) {
      return "/mobile_newmap";
    }
    return "/mvd_map";
  }
  
  public static String c()
  {
    if (d().equals("didi")) {
      return "1HV13IK65T1XH392";
    }
    return "0M3009PNO62FLOQC";
  }
  
  private static String d()
  {
    return "sdk";
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/jy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */