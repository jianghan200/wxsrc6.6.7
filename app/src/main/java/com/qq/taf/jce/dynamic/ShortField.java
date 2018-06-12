package com.qq.taf.jce.dynamic;

public final class ShortField
  extends NumberField
{
  private short data;
  
  ShortField(short paramShort, int paramInt)
  {
    super(paramInt);
    this.data = paramShort;
  }
  
  public final short get()
  {
    return this.data;
  }
  
  public final Number getNumber()
  {
    return Short.valueOf(this.data);
  }
  
  public final void set(short paramShort)
  {
    this.data = paramShort;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/qq/taf/jce/dynamic/ShortField.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */