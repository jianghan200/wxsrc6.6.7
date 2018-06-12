package com.tencent.mm.ui;

import android.util.Log;

public final class ao
{
  private static a tqO;
  private static a tqP;
  
  static
  {
    a local1 = new a() {};
    tqO = local1;
    tqP = local1;
  }
  
  public static void a(Throwable paramThrowable, String paramString, Object... paramVarArgs)
  {
    if (tqP != null)
    {
      paramVarArgs = String.format(paramString, paramVarArgs);
      paramString = paramVarArgs;
      if (paramVarArgs == null) {
        paramString = "";
      }
      new StringBuilder().append(paramString).append("  ").append(Log.getStackTraceString(paramThrowable));
    }
  }
  
  public static void r(String paramString, Object... paramVarArgs)
  {
    if (tqP != null) {
      String.format(paramString, paramVarArgs);
    }
  }
  
  public static void s(String paramString, Object... paramVarArgs)
  {
    if (tqP != null) {
      String.format(paramString, paramVarArgs);
    }
  }
  
  public static void t(String paramString, Object... paramVarArgs)
  {
    if (tqP != null) {
      String.format(paramString, paramVarArgs);
    }
  }
  
  public static void u(String paramString, Object... paramVarArgs)
  {
    if (tqP != null) {
      String.format(paramString, paramVarArgs);
    }
  }
  
  public static void v(String paramString, Object... paramVarArgs)
  {
    if (tqP != null) {
      String.format(paramString, paramVarArgs);
    }
  }
  
  public static abstract interface a {}
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/ui/ao.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */