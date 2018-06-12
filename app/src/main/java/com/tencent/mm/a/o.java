package com.tencent.mm.a;

public final class o
  extends Number
{
  private int uin = 0;
  
  public o(int paramInt)
  {
    this.uin = paramInt;
  }
  
  public o(long paramLong)
  {
    this.uin = ((int)(0xFFFFFFFFFFFFFFFF & paramLong));
  }
  
  public static int cx(String paramString)
  {
    try
    {
      int i = new o(Long.valueOf(paramString).longValue()).intValue();
      return i;
    }
    catch (Exception paramString) {}
    return 0;
  }
  
  public static String getString(int paramInt)
  {
    return new o(paramInt).toString();
  }
  
  public final double doubleValue()
  {
    return (this.uin | 0L) + 0.0D;
  }
  
  public final float floatValue()
  {
    return (float)((this.uin | 0L) + 0.0D);
  }
  
  public final int intValue()
  {
    return this.uin;
  }
  
  public final long longValue()
  {
    return this.uin & 0xFFFFFFFF;
  }
  
  public final String toString()
  {
    return String.valueOf(this.uin & 0xFFFFFFFF);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/a/o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */