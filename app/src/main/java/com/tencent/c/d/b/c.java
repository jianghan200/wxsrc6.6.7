package com.tencent.c.d.b;

import android.os.Build.VERSION;
import java.lang.reflect.Method;

public final class c
{
  private static Object vjs = null;
  private static Method vjt = null;
  private static boolean vju = false;
  
  static
  {
    if (Build.VERSION.SDK_INT >= 14) {
      try
      {
        vjs = e.gs("libcore.io.Libcore", "os");
        vjt = e.a("libcore.io.Os", "stat", new Class[] { String.class });
        vju = true;
        return;
      }
      catch (Throwable localThrowable) {}
    }
  }
  
  public static int acr(String paramString)
  {
    if (!vju) {}
    do
    {
      return 0;
      paramString = vjt.invoke(vjs, new Object[] { paramString });
    } while (paramString == null);
    return ((Integer)e.a(paramString.getClass(), "st_mode", paramString)).intValue();
  }
  
  public static boolean isAvailable()
  {
    return vju;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/c/d/b/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */