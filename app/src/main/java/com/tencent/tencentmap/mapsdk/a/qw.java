package com.tencent.tencentmap.mapsdk.a;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public final class qw
  implements Cloneable
{
  private static DecimalFormat a = new DecimalFormat("0.000000", new DecimalFormatSymbols(Locale.US));
  private final double b;
  private final double c;
  
  public qw(double paramDouble1, double paramDouble2)
  {
    if ((-180.0D <= paramDouble2) && (paramDouble2 < 180.0D)) {}
    for (this.b = a(paramDouble2);; this.b = a(((paramDouble2 - 180.0D) % 360.0D + 360.0D) % 360.0D - 180.0D))
    {
      this.c = a(Math.max(-85.0D, Math.min(85.0D, paramDouble1)));
      return;
    }
  }
  
  private static double a(double paramDouble)
  {
    return Double.parseDouble(a.format(paramDouble));
  }
  
  public final qw a()
  {
    return new qw(this.c, this.b);
  }
  
  public final double b()
  {
    return this.c;
  }
  
  public final double c()
  {
    return this.b;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {}
    do
    {
      return true;
      if (!(paramObject instanceof qw)) {
        return false;
      }
      paramObject = (qw)paramObject;
    } while ((Double.doubleToLongBits(this.c) == Double.doubleToLongBits(((qw)paramObject).c)) && (Double.doubleToLongBits(this.b) == Double.doubleToLongBits(((qw)paramObject).b)));
    return false;
  }
  
  public final int hashCode()
  {
    long l = Double.doubleToLongBits(this.c);
    int i = (int)(l ^ l >>> 32);
    l = Double.doubleToLongBits(this.b);
    return (i + 31) * 31 + (int)(l ^ l >>> 32);
  }
  
  public final String toString()
  {
    return "lat/lng: (" + this.c + "," + this.b + ")";
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/qw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */