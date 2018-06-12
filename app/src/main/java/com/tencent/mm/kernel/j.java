package com.tencent.mm.kernel;

import com.tencent.mm.sdk.platformtools.x;

public final class j
{
  private static long drm;
  private static volatile a drn = null;
  
  public static void a(a parama)
  {
    drn = parama;
  }
  
  public static void aB(long paramLong)
  {
    drm = paramLong;
  }
  
  public static void d(String paramString1, String paramString2, Object... paramVarArgs)
  {
    if (drn != null) {
      drn.d(paramString1, paramString2, paramVarArgs);
    }
  }
  
  public static void e(String paramString1, String paramString2, Object... paramVarArgs)
  {
    if (drn != null) {
      drn.e(paramString1, paramString2, paramVarArgs);
    }
  }
  
  public static void ey(String paramString)
  {
    long l = System.currentTimeMillis() - drm;
    x.i("Blink-LOG", "since startup %s : %s", new Object[] { paramString, Long.valueOf(l) });
    String.format("since startup %s : %s", new Object[] { paramString, Long.valueOf(l) });
  }
  
  public static void i(String paramString, long paramLong)
  {
    x.i("Blink-LOG", "since the %s : %s", new Object[] { paramString, Long.valueOf(System.nanoTime() - paramLong) });
  }
  
  public static void i(String paramString1, String paramString2, Object... paramVarArgs)
  {
    if (drn != null) {
      drn.i(paramString1, paramString2, paramVarArgs);
    }
  }
  
  public static void printErrStackTrace(String paramString1, Throwable paramThrowable, String paramString2, Object... paramVarArgs)
  {
    if (drn != null) {
      drn.printErrStackTrace(paramString1, paramThrowable, paramString2, paramVarArgs);
    }
  }
  
  public static void w(String paramString1, String paramString2, Object... paramVarArgs)
  {
    if (drn != null) {
      drn.w(paramString1, paramString2, paramVarArgs);
    }
  }
  
  public static abstract interface a
  {
    public abstract void d(String paramString1, String paramString2, Object... paramVarArgs);
    
    public abstract void e(String paramString1, String paramString2, Object... paramVarArgs);
    
    public abstract void i(String paramString1, String paramString2, Object... paramVarArgs);
    
    public abstract void printErrStackTrace(String paramString1, Throwable paramThrowable, String paramString2, Object... paramVarArgs);
    
    public abstract void w(String paramString1, String paramString2, Object... paramVarArgs);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/kernel/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */