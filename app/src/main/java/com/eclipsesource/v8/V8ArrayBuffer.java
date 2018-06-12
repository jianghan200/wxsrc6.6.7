package com.eclipsesource.v8;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class V8ArrayBuffer
  extends V8Value
{
  private ByteBuffer byteBuffer;
  
  public V8ArrayBuffer(V8 paramV8, int paramInt)
  {
    super(paramV8);
    initialize(paramV8.getV8RuntimePtr(), Integer.valueOf(paramInt));
    this.byteBuffer = paramV8.createV8ArrayBufferBackingStore(paramV8.getV8RuntimePtr(), this.objectHandle, paramInt);
    this.byteBuffer.order(ByteOrder.nativeOrder());
  }
  
  public V8ArrayBuffer(V8 paramV8, ByteBuffer paramByteBuffer)
  {
    super(paramV8);
    if (!paramByteBuffer.isDirect()) {
      throw new IllegalArgumentException("ByteBuffer must be a allocated as a direct ByteBuffer");
    }
    initialize(paramV8.getV8RuntimePtr(), paramByteBuffer);
    this.byteBuffer = paramByteBuffer;
    paramByteBuffer.order(ByteOrder.nativeOrder());
  }
  
  protected V8Value createTwin()
  {
    return new V8ArrayBuffer(this.v8, this.byteBuffer);
  }
  
  public ByteBuffer getBackingStore()
  {
    this.v8.checkReleased();
    this.v8.checkThread();
    return this.byteBuffer;
  }
  
  protected void initialize(long paramLong, Object paramObject)
  {
    this.v8.checkThread();
    int i;
    if ((paramObject instanceof ByteBuffer))
    {
      paramObject = (ByteBuffer)paramObject;
      i = ((ByteBuffer)paramObject).limit();
    }
    for (this.objectHandle = this.v8.initNewV8ArrayBuffer(this.v8.getV8RuntimePtr(), (ByteBuffer)paramObject, i);; this.objectHandle = this.v8.initNewV8ArrayBuffer(this.v8.getV8RuntimePtr(), i))
    {
      this.released = false;
      addObjectReference(this.objectHandle);
      return;
      i = ((Integer)paramObject).intValue();
    }
  }
  
  public V8ArrayBuffer twin()
  {
    return (V8ArrayBuffer)super.twin();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/eclipsesource/v8/V8ArrayBuffer.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */