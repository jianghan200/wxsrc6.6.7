package com.tencent.mm.ipcinvoker.h;

public final class b
{
  private static com.tencent.mm.ipcinvoker.h.a.a dnj = new a();
  
  public static boolean b(com.tencent.mm.ipcinvoker.h.a.a parama)
  {
    if (parama == null) {
      return false;
    }
    dnj = parama;
    return true;
  }
  
  public static void d(String paramString1, String paramString2, Object... paramVarArgs)
  {
    dnj.a(3, paramString1, paramString2, paramVarArgs);
  }
  
  public static void e(String paramString1, String paramString2, Object... paramVarArgs)
  {
    dnj.a(6, paramString1, paramString2, paramVarArgs);
  }
  
  public static void i(String paramString1, String paramString2, Object... paramVarArgs)
  {
    dnj.a(4, paramString1, paramString2, paramVarArgs);
  }
  
  public static void w(String paramString1, String paramString2, Object... paramVarArgs)
  {
    dnj.a(5, paramString1, paramString2, paramVarArgs);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/ipcinvoker/h/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */