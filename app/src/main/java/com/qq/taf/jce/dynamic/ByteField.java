package com.qq.taf.jce.dynamic;

public final class ByteField
  extends NumberField
{
  private byte data;
  
  ByteField(byte paramByte, int paramInt)
  {
    super(paramInt);
    this.data = paramByte;
  }
  
  public final byte get()
  {
    return this.data;
  }
  
  public final Number getNumber()
  {
    return Byte.valueOf(this.data);
  }
  
  public final void set(byte paramByte)
  {
    this.data = paramByte;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/qq/taf/jce/dynamic/ByteField.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */