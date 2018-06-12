package com.google.android.exoplayer2.d;

public final class b
{
  public static boolean DEBUG = true;
  private static a apo = null;
  
  public static void a(a parama)
  {
    apo = parama;
  }
  
  public static void e(String paramString1, String paramString2, Object... paramVarArgs)
  {
    if (apo != null) {
      apo.e(paramString1, paramString2, paramVarArgs);
    }
  }
  
  public static void i(String paramString1, String paramString2, Object... paramVarArgs)
  {
    if (apo != null) {
      apo.i(paramString1, paramString2, paramVarArgs);
    }
  }
  
  public static void w(String paramString1, String paramString2, Object... paramVarArgs)
  {
    if (apo != null) {
      apo.w(paramString1, paramString2, paramVarArgs);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/google/android/exoplayer2/d/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */