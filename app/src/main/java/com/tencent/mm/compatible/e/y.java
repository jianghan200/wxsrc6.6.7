package com.tencent.mm.compatible.e;

import com.tencent.mm.sdk.platformtools.x;
import java.lang.reflect.Method;

public final class y
{
  private static Class<?> Yw = null;
  private static Method dfA;
  private static Method dfz = null;
  
  static
  {
    dfA = null;
    try
    {
      Class localClass = Class.forName("android.os.SystemProperties");
      Yw = localClass;
      dfz = localClass.getDeclaredMethod("get", new Class[] { String.class });
      dfA = Yw.getDeclaredMethod("getInt", new Class[] { String.class, Integer.TYPE });
      dfz.setAccessible(true);
      dfA.setAccessible(true);
      return;
    }
    catch (Exception localException)
    {
      x.printErrStackTrace("MicroMsg.SystemProperties", localException, "", new Object[0]);
    }
  }
  
  public static String get(String paramString)
  {
    try
    {
      paramString = (String)dfz.invoke(null, new Object[] { paramString });
      return paramString;
    }
    catch (Exception paramString)
    {
      x.printErrStackTrace("MicroMsg.SystemProperties", paramString, "", new Object[0]);
    }
    return null;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/compatible/e/y.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */