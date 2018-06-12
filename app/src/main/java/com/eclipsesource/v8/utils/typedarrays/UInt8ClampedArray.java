package com.eclipsesource.v8.utils.typedarrays;

import java.nio.ByteBuffer;

public class UInt8ClampedArray
  extends TypedArray
{
  public UInt8ClampedArray(ArrayBuffer paramArrayBuffer)
  {
    this(paramArrayBuffer.getByteBuffer());
  }
  
  public UInt8ClampedArray(ByteBuffer paramByteBuffer)
  {
    super(paramByteBuffer);
  }
  
  public short get(int paramInt)
  {
    return (short)(this.buffer.get(paramInt) & 0xFF);
  }
  
  public int getType()
  {
    return 12;
  }
  
  public int length()
  {
    return this.buffer.limit();
  }
  
  public void put(int paramInt, short paramShort)
  {
    if (paramShort > 255)
    {
      this.buffer.put(paramInt, (byte)-1);
      return;
    }
    if (paramShort < 0)
    {
      this.buffer.put(paramInt, (byte)0);
      return;
    }
    this.buffer.put(paramInt, (byte)paramShort);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/eclipsesource/v8/utils/typedarrays/UInt8ClampedArray.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */