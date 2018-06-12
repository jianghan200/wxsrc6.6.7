package com.eclipsesource.v8.utils.typedarrays;

import com.eclipsesource.v8.V8TypedArray;
import java.nio.ByteBuffer;

public abstract class TypedArray
{
  protected ByteBuffer buffer;
  
  protected TypedArray(ByteBuffer paramByteBuffer)
  {
    if (!paramByteBuffer.isDirect()) {
      throw new IllegalArgumentException("ByteBuffer must be a allocated as a direct ByteBuffer");
    }
    if (paramByteBuffer.limit() % V8TypedArray.getStructureSize(getType()) != 0) {
      throw new IllegalArgumentException("ByteBuffer must be a allocated as a direct ByteBuffer");
    }
    this.buffer = paramByteBuffer;
  }
  
  public ByteBuffer getByteBuffer()
  {
    return this.buffer;
  }
  
  public abstract int getType();
  
  public abstract int length();
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/eclipsesource/v8/utils/typedarrays/TypedArray.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */