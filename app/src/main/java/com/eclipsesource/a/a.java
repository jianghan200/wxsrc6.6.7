package com.eclipsesource.a;

import java.io.IOException;

public final class a
{
  public static final h abw = new c("null");
  public static final h abx = new c("true");
  public static final h aby = new c("false");
  
  public static h R(float paramFloat)
  {
    if ((Float.isInfinite(paramFloat)) || (Float.isNaN(paramFloat))) {
      throw new IllegalArgumentException("Infinite and NaN values not permitted in JSON");
    }
    return new d(V(Float.toString(paramFloat)));
  }
  
  public static h T(String paramString)
  {
    if (paramString == null) {
      return abw;
    }
    return new g(paramString);
  }
  
  public static h U(String paramString)
  {
    if (paramString == null) {
      throw new NullPointerException("string is null");
    }
    h localh;
    try
    {
      paramString = new f(paramString);
      paramString.ia();
      paramString.hZ();
      localh = paramString.hW();
      paramString.hZ();
      if (!paramString.id()) {
        throw paramString.Y("Unexpected character");
      }
    }
    catch (IOException paramString)
    {
      throw new RuntimeException(paramString);
    }
    return localh;
  }
  
  private static String V(String paramString)
  {
    String str = paramString;
    if (paramString.endsWith(".0")) {
      str = paramString.substring(0, paramString.length() - 2);
    }
    return str;
  }
  
  public static h ac(boolean paramBoolean)
  {
    if (paramBoolean) {
      return abx;
    }
    return aby;
  }
  
  public static h bX(int paramInt)
  {
    return new d(Integer.toString(paramInt, 10));
  }
  
  public static h k(long paramLong)
  {
    return new d(Long.toString(paramLong, 10));
  }
  
  public static h l(double paramDouble)
  {
    if ((Double.isInfinite(paramDouble)) || (Double.isNaN(paramDouble))) {
      throw new IllegalArgumentException("Infinite and NaN values not permitted in JSON");
    }
    return new d(V(Double.toString(paramDouble)));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/eclipsesource/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */