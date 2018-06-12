package com.tencent.tencentmap.mapsdk.a;

public final class ru
{
  private double a = Double.MIN_VALUE;
  private double b = Double.MIN_VALUE;
  
  public ru(double paramDouble1, double paramDouble2)
  {
    b(paramDouble1);
    a(paramDouble2);
  }
  
  public final double a()
  {
    return this.a;
  }
  
  public final void a(double paramDouble)
  {
    this.a = Math.max(-2.003750834E7D, Math.min(2.003750834E7D, paramDouble));
  }
  
  public final double b()
  {
    return this.b;
  }
  
  public final void b(double paramDouble)
  {
    this.b = Math.max(-2.003750834E7D, Math.min(2.003750834E7D, paramDouble));
  }
  
  public final boolean equals(Object paramObject)
  {
    if (paramObject == this) {}
    do
    {
      return true;
      if (paramObject.hashCode() != hashCode()) {
        return false;
      }
      if (!(paramObject instanceof ru)) {
        return false;
      }
      paramObject = (ru)paramObject;
    } while ((Double.doubleToLongBits(((ru)paramObject).b) == Double.doubleToLongBits(this.b)) && (Double.doubleToLongBits(((ru)paramObject).a) == Double.doubleToLongBits(this.a)));
    return false;
  }
  
  public final int hashCode()
  {
    long l1 = Double.doubleToLongBits(this.b);
    long l2 = Double.doubleToLongBits(this.a);
    int i = (int)(l2 ^ l2 >>> 32);
    return (int)(l1 ^ l1 >>> 32) + (i + 31) * 31;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/ru.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */