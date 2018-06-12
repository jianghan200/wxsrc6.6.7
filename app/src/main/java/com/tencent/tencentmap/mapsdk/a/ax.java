package com.tencent.tencentmap.mapsdk.a;

import com.qq.jutil.j4log.Logger;

public class ax
{
  static final Logger a = Logger.getLogger("jceClient");
  static int b = 15;
  
  public static void a(String paramString)
  {
    a.info(paramString);
  }
  
  public static void a(String paramString, Throwable paramThrowable)
  {
    a.info(paramString, paramThrowable);
  }
  
  public static void b(String paramString)
  {
    a.error(paramString);
  }
  
  public static void b(String paramString, Throwable paramThrowable)
  {
    a.error(paramString, paramThrowable);
  }
  
  public static void c(String paramString)
  {
    a.debug(paramString);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/ax.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */