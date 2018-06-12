package com.tencent.mm.z;

import java.io.Closeable;

public abstract interface d
  extends Closeable
{
  public abstract int Kn();
  
  public abstract long getSize();
  
  public abstract boolean isOpen();
  
  public abstract void open();
  
  public abstract int readAt(long paramLong, byte[] paramArrayOfByte, int paramInt1, int paramInt2);
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/z/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */