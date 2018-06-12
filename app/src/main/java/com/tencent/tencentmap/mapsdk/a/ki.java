package com.tencent.tencentmap.mapsdk.a;

public class ki
{
  public static double a(ox paramox1, ox paramox2, ox paramox3)
  {
    double d2 = b(paramox1, paramox2);
    double d3 = b(paramox1, paramox3);
    double d4 = b(paramox2, paramox3);
    if (d2 + d3 == d4) {
      d1 = 0.0D;
    }
    do
    {
      do
      {
        return d1;
        d1 = d2;
      } while (d4 <= 1.0E-6D);
      d1 = d2;
    } while (d3 * d3 >= d2 * d2 + d4 * d4);
    if (d2 * d2 >= d3 * d3 + d4 * d4) {
      return d3;
    }
    double d1 = (d2 + d3 + d4) / 2.0D;
    return Math.sqrt((d1 - d2) * d1 * (d1 - d3) * (d1 - d4)) * 2.0D / d4;
  }
  
  public static ox a(ox paramox1, ox paramox2, int paramInt)
  {
    double d1;
    if (paramox2.b > paramox1.b)
    {
      d1 = paramox1.b - paramInt;
      if (paramox2.a <= paramox1.a) {
        break label63;
      }
    }
    label63:
    for (double d2 = paramox1.a - paramInt;; d2 = paramox1.a + paramInt)
    {
      return new ox(d2, d1);
      d1 = paramox1.b + paramInt;
      break;
    }
  }
  
  public static boolean a(ox paramox1, double paramDouble, ox paramox2, ox paramox3)
  {
    if (a(paramox1, paramox2, paramox3) - paramDouble > 1.0E-6D) {
      return false;
    }
    return c(b(paramox1, paramox2, paramox3), paramox2, paramox3);
  }
  
  public static double[] a(ox paramox1, ox paramox2)
  {
    double d1;
    double d2;
    if (Math.abs(paramox1.b - paramox2.b) < 1.0E-6D)
    {
      d1 = NaN.0D;
      d2 = NaN.0D;
    }
    for (;;)
    {
      return new double[] { d2, d1 };
      if (Math.abs(paramox1.a - paramox2.a) < 1.0E-6D)
      {
        d1 = paramox1.a;
        d2 = 0.0D;
      }
      else
      {
        d2 = (paramox2.a - paramox1.a) / (paramox2.b - paramox1.b);
        d1 = (paramox2.b * paramox1.a - paramox1.b * paramox2.a) / (paramox2.b - paramox1.a);
      }
    }
  }
  
  public static double b(ox paramox1, ox paramox2)
  {
    double d1 = paramox1.b - paramox2.b;
    double d2 = paramox1.a - paramox2.a;
    return Math.sqrt(d1 * d1 + d2 * d2);
  }
  
  public static ox b(ox paramox1, ox paramox2, ox paramox3)
  {
    paramox3 = a(paramox2, paramox3);
    double d2;
    double d1;
    if (Double.isNaN(paramox3[0]))
    {
      d2 = paramox2.b;
      d1 = paramox1.a;
    }
    for (;;)
    {
      return new ox(d1, d2);
      if (paramox3[0] == 0.0D)
      {
        d2 = paramox1.b;
        d1 = paramox2.a;
      }
      else
      {
        d1 = paramox3[0];
        d2 = d1 * d1;
        d2 = (paramox2.b * d2 + (paramox1.a - paramox2.a) * d1 + paramox1.b) / (d2 + 1.0D);
        d1 = d1 * (d2 - paramox2.b) + paramox2.a;
      }
    }
  }
  
  public static double c(ox paramox1, ox paramox2)
  {
    double d4 = paramox1.b;
    double d3 = paramox1.a;
    double d2 = paramox2.b;
    double d1 = paramox2.a;
    double d5 = d4 * 0.01745329251994329D;
    double d6 = d3 * 0.01745329251994329D;
    d3 = d2 * 0.01745329251994329D;
    d4 = d1 * 0.01745329251994329D;
    d1 = Math.sin(d5);
    d2 = Math.sin(d6);
    d5 = Math.cos(d5);
    d6 = Math.cos(d6);
    double d7 = Math.sin(d3);
    double d8 = Math.sin(d4);
    d3 = Math.cos(d3);
    d4 = Math.cos(d4);
    paramox1 = new double[3];
    paramox2 = new double[3];
    paramox1[0] = (d5 * d6);
    paramox1[1] = (d6 * d1);
    paramox1[2] = d2;
    paramox2[0] = (d4 * d3);
    paramox2[1] = (d4 * d7);
    paramox2[2] = d8;
    return Math.asin(Math.sqrt((paramox1[0] - paramox2[0]) * (paramox1[0] - paramox2[0]) + (paramox1[1] - paramox2[1]) * (paramox1[1] - paramox2[1]) + (paramox1[2] - paramox2[2]) * (paramox1[2] - paramox2[2])) / 2.0D) * 1.27420015798544E7D;
  }
  
  public static boolean c(ox paramox1, ox paramox2, ox paramox3)
  {
    double d1 = b(paramox1, paramox2);
    double d2 = b(paramox1, paramox3);
    return b(paramox2, paramox3) - d1 - d2 < 1.0E-6D;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/ki.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */