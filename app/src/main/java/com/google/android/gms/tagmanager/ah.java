package com.google.android.gms.tagmanager;

final class ah
  extends Number
  implements Comparable<ah>
{
  private double bcC;
  private long bcD = 0L;
  boolean bcE = true;
  
  private int a(ah paramah)
  {
    if ((this.bcE) && (paramah.bcE)) {
      return new Long(this.bcD).compareTo(Long.valueOf(paramah.bcD));
    }
    return Double.compare(doubleValue(), paramah.doubleValue());
  }
  
  public static ah rB()
  {
    return new ah();
  }
  
  public final byte byteValue()
  {
    return (byte)(int)longValue();
  }
  
  public final double doubleValue()
  {
    if (this.bcE) {
      return this.bcD;
    }
    return this.bcC;
  }
  
  public final boolean equals(Object paramObject)
  {
    return ((paramObject instanceof ah)) && (a((ah)paramObject) == 0);
  }
  
  public final float floatValue()
  {
    return (float)doubleValue();
  }
  
  public final int hashCode()
  {
    return new Long(longValue()).hashCode();
  }
  
  public final int intValue()
  {
    return (int)longValue();
  }
  
  public final long longValue()
  {
    if (this.bcE) {
      return this.bcD;
    }
    return this.bcC;
  }
  
  public final short shortValue()
  {
    return (short)(int)longValue();
  }
  
  public final String toString()
  {
    if (this.bcE) {
      return Long.toString(this.bcD);
    }
    return Double.toString(this.bcC);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/google/android/gms/tagmanager/ah.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */