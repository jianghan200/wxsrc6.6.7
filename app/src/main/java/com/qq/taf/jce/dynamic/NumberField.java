package com.qq.taf.jce.dynamic;

public abstract class NumberField
  extends JceField
{
  NumberField(int paramInt)
  {
    super(paramInt);
  }
  
  public byte byteValue()
  {
    return getNumber().byteValue();
  }
  
  public double doubleValue()
  {
    return getNumber().doubleValue();
  }
  
  public float floatValue()
  {
    return getNumber().floatValue();
  }
  
  public abstract Number getNumber();
  
  public int intValue()
  {
    return getNumber().intValue();
  }
  
  public long longValue()
  {
    return getNumber().longValue();
  }
  
  public short shortValue()
  {
    return getNumber().shortValue();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/qq/taf/jce/dynamic/NumberField.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */