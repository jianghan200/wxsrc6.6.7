package com.tencent.magicbrush;

import com.tencent.magicbrush.a.c.f;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;

public class a
{
  private static String bni = "";
  private static String bnj = null;
  
  public static void d(Closeable paramCloseable)
  {
    if (paramCloseable != null) {}
    try
    {
      paramCloseable.close();
      return;
    }
    catch (IOException paramCloseable) {}
  }
  
  public static void loadLibrary(String paramString)
  {
    String str = null;
    if (bnj != null) {
      str = bnj + "/lib" + paramString + ".so";
    }
    if ((str != null) && (new File(str).exists()))
    {
      c.f.d("MagicBrush.Utils", "System.load(%s)", new Object[] { str });
      try
      {
        paramString = a.class.getClassLoader();
        Runtime localRuntime = Runtime.getRuntime();
        Method localMethod = localRuntime.getClass().getDeclaredMethod("load", new Class[] { String.class, ClassLoader.class });
        localMethod.setAccessible(true);
        localMethod.invoke(localRuntime, new Object[] { str, paramString });
        return;
      }
      catch (Exception paramString)
      {
        c.f.e("MagicBrush.Utils", "loadLibrary Exception", new Object[] { paramString });
        return;
      }
    }
    c.f.d("MagicBrush.Utils", "System.loadLibrary(%s)", new Object[] { paramString });
    System.loadLibrary(paramString);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/magicbrush/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */