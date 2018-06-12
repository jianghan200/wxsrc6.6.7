package com.tencent.smtt.sdk;

import android.content.Context;

public class TbsVideoUtils
{
  private static bg a = null;
  
  private static void a(Context paramContext)
  {
    Object localObject = null;
    try
    {
      if (a == null)
      {
        o.a(true).a(paramContext, false, false, null);
        bi localbi = o.a(true).a();
        paramContext = (Context)localObject;
        if (localbi != null) {
          paramContext = localbi.b();
        }
        if (paramContext != null) {
          a = new bg(paramContext);
        }
      }
      return;
    }
    finally {}
  }
  
  public static void deleteVideoCache(Context paramContext, String paramString)
  {
    a(paramContext);
    if (a != null) {
      a.a(paramContext, paramString);
    }
  }
  
  public static String getCurWDPDecodeType(Context paramContext)
  {
    a(paramContext);
    if (a != null) {
      return a.a(paramContext);
    }
    return "";
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/smtt/sdk/TbsVideoUtils.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */