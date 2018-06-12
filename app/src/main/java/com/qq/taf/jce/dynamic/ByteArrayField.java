package com.qq.taf.jce.dynamic;

public class ByteArrayField
  extends JceField
{
  private byte[] data;
  
  ByteArrayField(byte[] paramArrayOfByte, int paramInt)
  {
    super(paramInt);
    this.data = paramArrayOfByte;
  }
  
  public byte[] get()
  {
    return this.data;
  }
  
  public void set(byte[] paramArrayOfByte)
  {
    this.data = paramArrayOfByte;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/qq/taf/jce/dynamic/ByteArrayField.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */