package com.qq.taf.jce.dynamic;

public final class ZeroField
  extends NumberField
{
  ZeroField(int paramInt)
  {
    super(paramInt);
  }
  
  public final byte byteValue()
  {
    return 0;
  }
  
  public final double doubleValue()
  {
    return 0.0D;
  }
  
  public final float floatValue()
  {
    return 0.0F;
  }
  
  public final Number getNumber()
  {
    return Integer.valueOf(0);
  }
  
  public final int intValue()
  {
    return 0;
  }
  
  public final long longValue()
  {
    return 0L;
  }
  
  public final short shortValue()
  {
    return 0;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/qq/taf/jce/dynamic/ZeroField.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */