package com.tencent.mm.modelsfs;

import com.tencent.mm.sdk.platformtools.bi;

public final class f
{
  public static boolean mP(String paramString)
  {
    return paramString.lastIndexOf(";?enc=") > 0;
  }
  
  public static String mQ(String paramString)
  {
    int i = paramString.lastIndexOf(";?enc=");
    String str = paramString;
    if (i > 0) {
      str = paramString.substring(0, i);
    }
    return str;
  }
  
  public static long mR(String paramString)
  {
    int i = paramString.lastIndexOf(";?enc=");
    if (i > 0) {
      return bi.WV(paramString.substring(i + 6));
    }
    return 0L;
  }
  
  public static String mS(String paramString)
  {
    int i = paramString.lastIndexOf(";?enc=");
    if (i > 0) {
      return paramString.substring(i + 6).trim();
    }
    return "";
  }
  
  public static String q(String paramString, long paramLong)
  {
    if (paramLong == 0L) {
      return String.format(paramString + ";?enc=%d", new Object[] { Long.valueOf(314159265L) });
    }
    return String.format(paramString + ";?enc=%d", new Object[] { Long.valueOf(paramLong) });
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/modelsfs/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */