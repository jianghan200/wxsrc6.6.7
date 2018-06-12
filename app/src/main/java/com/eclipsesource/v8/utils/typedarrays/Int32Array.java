package com.eclipsesource.v8.utils.typedarrays;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;

public class Int32Array
  extends TypedArray
{
  public Int32Array(ArrayBuffer paramArrayBuffer)
  {
    this(paramArrayBuffer.getByteBuffer());
  }
  
  public Int32Array(ByteBuffer paramByteBuffer)
  {
    super(paramByteBuffer);
  }
  
  public int get(int paramInt)
  {
    return this.buffer.asIntBuffer().get(paramInt);
  }
  
  public int getType()
  {
    return 1;
  }
  
  public int length()
  {
    return this.buffer.asIntBuffer().limit();
  }
  
  public void put(int paramInt1, int paramInt2)
  {
    this.buffer.asIntBuffer().put(paramInt1, paramInt2);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/eclipsesource/v8/utils/typedarrays/Int32Array.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */