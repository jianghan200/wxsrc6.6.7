package com.tencent.smtt.utils;

import android.text.TextUtils;
import java.lang.reflect.Method;

public class p
{
  private static Class a;
  private static Method b;
  
  static
  {
    try
    {
      Class localClass = Class.forName("android.os.SystemProperties");
      a = localClass;
      b = localClass.getDeclaredMethod("get", new Class[] { String.class, String.class });
      return;
    }
    catch (Throwable localThrowable) {}
  }
  
  public static String a(String paramString1, String paramString2)
  {
    if (TextUtils.isEmpty(paramString1)) {
      return paramString2;
    }
    return b(paramString1, paramString2);
  }
  
  private static String b(String paramString1, String paramString2)
  {
    if ((a == null) || (b == null)) {
      return paramString2;
    }
    try
    {
      paramString1 = (String)b.invoke(a, new Object[] { paramString1, paramString2 });
      return paramString1;
    }
    catch (Throwable paramString1) {}
    return paramString2;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/smtt/utils/p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */