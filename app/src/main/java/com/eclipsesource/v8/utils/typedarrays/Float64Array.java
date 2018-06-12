package com.eclipsesource.v8.utils.typedarrays;

import java.nio.ByteBuffer;
import java.nio.DoubleBuffer;

public class Float64Array
  extends TypedArray
{
  public Float64Array(ArrayBuffer paramArrayBuffer)
  {
    this(paramArrayBuffer.getByteBuffer());
  }
  
  public Float64Array(ByteBuffer paramByteBuffer)
  {
    super(paramByteBuffer);
  }
  
  public double get(int paramInt)
  {
    return this.buffer.asDoubleBuffer().get(paramInt);
  }
  
  public int getType()
  {
    return 2;
  }
  
  public int length()
  {
    return this.buffer.asDoubleBuffer().limit();
  }
  
  public void put(int paramInt, double paramDouble)
  {
    this.buffer.asDoubleBuffer().put(paramInt, paramDouble);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/eclipsesource/v8/utils/typedarrays/Float64Array.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */