package com.tencent.tencentmap.mapsdk.a;

import java.util.Locale;

public final class ct
{
  public static boolean a = false;
  public static boolean b = false;
  
  private static void a(String paramString1, String paramString2, Object... paramVarArgs)
  {
    if (a) {}
    for (int i = 1; (i == 0) || (paramString2 == null) || (paramVarArgs == null) || (paramVarArgs.length == 0); i = 0) {
      return;
    }
    String.format(Locale.US, paramString2, paramVarArgs);
  }
  
  public static void a(String paramString, Object... paramVarArgs)
  {
    if (a) {}
    for (int i = 1; (i == 0) || (paramString == null) || (paramVarArgs == null) || (paramVarArgs.length == 0); i = 0) {
      return;
    }
    String.format(Locale.US, paramString, paramVarArgs);
  }
  
  public static void a(Throwable paramThrowable)
  {
    if ((paramThrowable != null) && ((paramThrowable instanceof Throwable))) {
      if (!a) {
        break label24;
      }
    }
    label24:
    for (int i = 1; i != 0; i = 0) {
      return;
    }
    d(paramThrowable.getMessage(), new Object[0]);
  }
  
  public static void b(String paramString, Object... paramVarArgs)
  {
    if (a) {}
    for (int i = 1; (i == 0) || (paramString == null) || (paramVarArgs == null) || (paramVarArgs.length == 0); i = 0) {
      return;
    }
    String.format(Locale.US, paramString, paramVarArgs);
  }
  
  public static void c(String paramString, Object... paramVarArgs)
  {
    if ((paramString == null) || (paramVarArgs == null) || (paramVarArgs.length == 0)) {
      return;
    }
    String.format(Locale.US, paramString, paramVarArgs);
  }
  
  public static void d(String paramString, Object... paramVarArgs)
  {
    if ((paramString == null) || (paramVarArgs == null) || (paramVarArgs.length == 0)) {
      return;
    }
    String.format(Locale.US, paramString, paramVarArgs);
  }
  
  public static void e(String paramString, Object... paramVarArgs)
  {
    a("beacon_step_api", paramString, paramVarArgs);
  }
  
  public static void f(String paramString, Object... paramVarArgs)
  {
    a("beacon_step_buffer", paramString, paramVarArgs);
  }
  
  public static void g(String paramString, Object... paramVarArgs)
  {
    a("beacon_step_db", paramString, paramVarArgs);
  }
  
  public static void h(String paramString, Object... paramVarArgs)
  {
    a("beacon_step_upload", paramString, paramVarArgs);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/ct.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */