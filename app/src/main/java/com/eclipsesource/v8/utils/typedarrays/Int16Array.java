package com.eclipsesource.v8.utils.typedarrays;

import java.nio.ByteBuffer;
import java.nio.ShortBuffer;

public class Int16Array
  extends TypedArray
{
  public Int16Array(ArrayBuffer paramArrayBuffer)
  {
    this(paramArrayBuffer.getByteBuffer());
  }
  
  public Int16Array(ByteBuffer paramByteBuffer)
  {
    super(paramByteBuffer);
  }
  
  public short get(int paramInt)
  {
    return this.buffer.asShortBuffer().get(paramInt);
  }
  
  public int getType()
  {
    return 13;
  }
  
  public int length()
  {
    return this.buffer.asShortBuffer().limit();
  }
  
  public void put(int paramInt, short paramShort)
  {
    this.buffer.asShortBuffer().put(paramInt, paramShort);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/eclipsesource/v8/utils/typedarrays/Int16Array.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */