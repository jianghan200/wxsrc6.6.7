package com.tencent.matrix.d;

import android.util.Log;

public final class b
{
  private static a buV;
  private static a buW;
  
  static
  {
    a local1 = new a()
    {
      public final void d(String paramAnonymousString1, String paramAnonymousString2, Object... paramAnonymousVarArgs)
      {
        if ((paramAnonymousVarArgs == null) || (paramAnonymousVarArgs.length == 0)) {
          return;
        }
        String.format(paramAnonymousString2, paramAnonymousVarArgs);
      }
      
      public final void e(String paramAnonymousString1, String paramAnonymousString2, Object... paramAnonymousVarArgs)
      {
        if ((paramAnonymousVarArgs == null) || (paramAnonymousVarArgs.length == 0)) {
          return;
        }
        String.format(paramAnonymousString2, paramAnonymousVarArgs);
      }
      
      public final void i(String paramAnonymousString1, String paramAnonymousString2, Object... paramAnonymousVarArgs)
      {
        if ((paramAnonymousVarArgs == null) || (paramAnonymousVarArgs.length == 0)) {
          return;
        }
        String.format(paramAnonymousString2, paramAnonymousVarArgs);
      }
      
      public final void printErrStackTrace(String paramAnonymousString1, Throwable paramAnonymousThrowable, String paramAnonymousString2, Object... paramAnonymousVarArgs)
      {
        if ((paramAnonymousVarArgs == null) || (paramAnonymousVarArgs.length == 0)) {}
        for (paramAnonymousString1 = paramAnonymousString2;; paramAnonymousString1 = String.format(paramAnonymousString2, paramAnonymousVarArgs))
        {
          paramAnonymousString2 = paramAnonymousString1;
          if (paramAnonymousString1 == null) {
            paramAnonymousString2 = "";
          }
          new StringBuilder().append(paramAnonymousString2).append("  ").append(Log.getStackTraceString(paramAnonymousThrowable));
          return;
        }
      }
      
      public final void v(String paramAnonymousString1, String paramAnonymousString2, Object... paramAnonymousVarArgs)
      {
        if ((paramAnonymousVarArgs == null) || (paramAnonymousVarArgs.length == 0)) {
          return;
        }
        String.format(paramAnonymousString2, paramAnonymousVarArgs);
      }
      
      public final void w(String paramAnonymousString1, String paramAnonymousString2, Object... paramAnonymousVarArgs)
      {
        if ((paramAnonymousVarArgs == null) || (paramAnonymousVarArgs.length == 0)) {
          return;
        }
        String.format(paramAnonymousString2, paramAnonymousVarArgs);
      }
    };
    buV = local1;
    buW = local1;
  }
  
  public static void b(a parama)
  {
    buW = parama;
  }
  
  public static void d(String paramString1, String paramString2, Object... paramVarArgs)
  {
    if (buW != null) {
      buW.d(paramString1, paramString2, paramVarArgs);
    }
  }
  
  public static void e(String paramString1, String paramString2, Object... paramVarArgs)
  {
    if (buW != null) {
      buW.e(paramString1, paramString2, paramVarArgs);
    }
  }
  
  public static void i(String paramString1, String paramString2, Object... paramVarArgs)
  {
    if (buW != null) {
      buW.i(paramString1, paramString2, paramVarArgs);
    }
  }
  
  public static void printErrStackTrace(String paramString1, Throwable paramThrowable, String paramString2, Object... paramVarArgs)
  {
    if (buW != null) {
      buW.printErrStackTrace(paramString1, paramThrowable, paramString2, paramVarArgs);
    }
  }
  
  public static void v(String paramString1, String paramString2, Object... paramVarArgs)
  {
    if (buW != null) {
      buW.v(paramString1, paramString2, paramVarArgs);
    }
  }
  
  public static void w(String paramString1, String paramString2, Object... paramVarArgs)
  {
    if (buW != null) {
      buW.w(paramString1, paramString2, paramVarArgs);
    }
  }
  
  public static abstract interface a
  {
    public abstract void d(String paramString1, String paramString2, Object... paramVarArgs);
    
    public abstract void e(String paramString1, String paramString2, Object... paramVarArgs);
    
    public abstract void i(String paramString1, String paramString2, Object... paramVarArgs);
    
    public abstract void printErrStackTrace(String paramString1, Throwable paramThrowable, String paramString2, Object... paramVarArgs);
    
    public abstract void v(String paramString1, String paramString2, Object... paramVarArgs);
    
    public abstract void w(String paramString1, String paramString2, Object... paramVarArgs);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/matrix/d/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */