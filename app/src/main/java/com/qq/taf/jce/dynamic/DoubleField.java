package com.qq.taf.jce.dynamic;

public class DoubleField
  extends NumberField
{
  private double data;
  
  DoubleField(double paramDouble, int paramInt)
  {
    super(paramInt);
    this.data = paramDouble;
  }
  
  public double get()
  {
    return this.data;
  }
  
  public Number getNumber()
  {
    return Double.valueOf(this.data);
  }
  
  public void set(double paramDouble)
  {
    this.data = paramDouble;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/qq/taf/jce/dynamic/DoubleField.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */