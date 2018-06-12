package com.tencent.mm.sdk.platformtools;

import java.util.HashMap;

public final class be
{
  private static final HashMap<String, String> sJg = new HashMap();
  
  public static String getProperty(String paramString)
  {
    return (String)sJg.get(paramString);
  }
  
  public static void setProperty(String paramString1, String paramString2)
  {
    sJg.put(paramString1, paramString2);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/sdk/platformtools/be.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */