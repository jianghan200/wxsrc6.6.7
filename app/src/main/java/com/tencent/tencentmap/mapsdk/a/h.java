package com.tencent.tencentmap.mapsdk.a;

import java.util.Arrays;

public class h
{
  public static final double a = Double.longBitsToDouble(4368491638549381120L);
  public static final double b = Double.longBitsToDouble(4503599627370496L);
  private static final long c = Double.doubleToRawLongBits(0.0D);
  private static final long d = Double.doubleToRawLongBits(0.0D);
  private static final int e = Float.floatToRawIntBits(0.0F);
  private static final int f = Float.floatToRawIntBits(0.0F);
  
  public static int a(Object[] paramArrayOfObject)
  {
    return Arrays.hashCode(paramArrayOfObject);
  }
  
  public static String a(String paramString, Object paramObject)
  {
    return paramString + "=" + String.valueOf(paramObject);
  }
  
  public static String a(String... paramVarArgs)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    int k = paramVarArgs.length;
    int j = 0;
    int i = 0;
    while (j < k)
    {
      localStringBuilder.append(paramVarArgs[j]);
      if (i != paramVarArgs.length - 1) {
        localStringBuilder.append(",");
      }
      j += 1;
      i += 1;
    }
    return localStringBuilder.toString();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */