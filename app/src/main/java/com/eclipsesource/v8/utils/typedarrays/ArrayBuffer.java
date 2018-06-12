package com.eclipsesource.v8.utils.typedarrays;

import java.nio.ByteBuffer;

public class ArrayBuffer
{
  private ByteBuffer byteBuffer;
  
  public ArrayBuffer(int paramInt)
  {
    this.byteBuffer = ByteBuffer.allocateDirect(paramInt);
  }
  
  public ArrayBuffer(ByteBuffer paramByteBuffer)
  {
    this.byteBuffer = validateByteBuffer(paramByteBuffer);
  }
  
  public ArrayBuffer(byte[] paramArrayOfByte)
  {
    this.byteBuffer = ByteBuffer.allocateDirect(paramArrayOfByte.length);
    this.byteBuffer.put(paramArrayOfByte, 0, paramArrayOfByte.length);
  }
  
  private ByteBuffer validateByteBuffer(ByteBuffer paramByteBuffer)
  {
    if (!paramByteBuffer.isDirect()) {
      throw new IllegalArgumentException("ByteBuffer must be a allocated as a direct ByteBuffer");
    }
    return paramByteBuffer;
  }
  
  public byte getByte(int paramInt)
  {
    return this.byteBuffer.get(paramInt);
  }
  
  public ByteBuffer getByteBuffer()
  {
    return this.byteBuffer;
  }
  
  public short getUnsignedByte(int paramInt)
  {
    return (short)(this.byteBuffer.get(paramInt) & 0xFF);
  }
  
  public int limit()
  {
    return this.byteBuffer.limit();
  }
  
  public void put(int paramInt, byte paramByte)
  {
    this.byteBuffer.put(paramInt, paramByte);
  }
  
  public String toString()
  {
    return "[object ArrayBuffer]";
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/eclipsesource/v8/utils/typedarrays/ArrayBuffer.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */