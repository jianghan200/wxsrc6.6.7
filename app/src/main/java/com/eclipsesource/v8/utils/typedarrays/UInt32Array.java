package com.eclipsesource.v8.utils.typedarrays;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;

public class UInt32Array
  extends TypedArray
{
  public UInt32Array(ArrayBuffer paramArrayBuffer)
  {
    this(paramArrayBuffer.getByteBuffer());
  }
  
  public UInt32Array(ByteBuffer paramByteBuffer)
  {
    super(paramByteBuffer);
  }
  
  public long get(int paramInt)
  {
    return this.buffer.asIntBuffer().get(paramInt) & 0xFFFFFFFF;
  }
  
  public int getType()
  {
    return 15;
  }
  
  public int length()
  {
    return this.buffer.asIntBuffer().limit();
  }
  
  public void put(int paramInt, long paramLong)
  {
    this.buffer.asIntBuffer().put(paramInt, (int)(0xFFFFFFFFFFFFFFFF & paramLong));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/eclipsesource/v8/utils/typedarrays/UInt32Array.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */