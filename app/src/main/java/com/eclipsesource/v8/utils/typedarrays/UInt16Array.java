package com.eclipsesource.v8.utils.typedarrays;

import java.nio.ByteBuffer;
import java.nio.ShortBuffer;

public class UInt16Array
  extends TypedArray
{
  public UInt16Array(ArrayBuffer paramArrayBuffer)
  {
    this(paramArrayBuffer.getByteBuffer());
  }
  
  public UInt16Array(ByteBuffer paramByteBuffer)
  {
    super(paramByteBuffer);
  }
  
  public int get(int paramInt)
  {
    return 0xFFFF & this.buffer.asShortBuffer().get(paramInt);
  }
  
  public int getType()
  {
    return 14;
  }
  
  public int length()
  {
    return this.buffer.asShortBuffer().limit();
  }
  
  public void put(int paramInt1, int paramInt2)
  {
    this.buffer.asShortBuffer().put(paramInt1, (short)(0xFFFF & paramInt2));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/eclipsesource/v8/utils/typedarrays/UInt16Array.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */