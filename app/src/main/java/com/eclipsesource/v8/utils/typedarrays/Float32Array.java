package com.eclipsesource.v8.utils.typedarrays;

import java.nio.ByteBuffer;
import java.nio.FloatBuffer;

public class Float32Array
  extends TypedArray
{
  public Float32Array(ArrayBuffer paramArrayBuffer)
  {
    this(paramArrayBuffer.getByteBuffer());
  }
  
  public Float32Array(ByteBuffer paramByteBuffer)
  {
    super(paramByteBuffer);
  }
  
  public float get(int paramInt)
  {
    return this.buffer.asFloatBuffer().get(paramInt);
  }
  
  public int getType()
  {
    return 16;
  }
  
  public int length()
  {
    return this.buffer.asFloatBuffer().limit();
  }
  
  public void put(int paramInt, float paramFloat)
  {
    this.buffer.asFloatBuffer().put(paramInt, paramFloat);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/eclipsesource/v8/utils/typedarrays/Float32Array.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */