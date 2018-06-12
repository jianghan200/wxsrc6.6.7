package com.tencent.qqvideo.proxy.pi;

public class IRefObject
{
  private long mNativePtr;
  
  public IRefObject(long paramLong)
  {
    this.mNativePtr = paramLong;
  }
  
  private static native void freeNativePtr(long paramLong);
  
  private long getNativePtr()
  {
    try
    {
      long l = this.mNativePtr;
      return l;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public native void finalize();
  
  public synchronized native void release();
  
  public synchronized native void retain();
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/qqvideo/proxy/pi/IRefObject.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */