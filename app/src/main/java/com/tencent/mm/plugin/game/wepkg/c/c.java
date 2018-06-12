package com.tencent.mm.plugin.game.wepkg.c;

import java.io.FilterInputStream;
import java.io.InputStream;

public abstract class c
  extends FilterInputStream
{
  public c(InputStream paramInputStream)
  {
    super(paramInputStream);
  }
  
  public int available()
  {
    return this.in.available();
  }
  
  public void close()
  {
    this.in.close();
  }
  
  public void mark(int paramInt)
  {
    try
    {
      this.in.mark(paramInt);
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public boolean markSupported()
  {
    return this.in.markSupported();
  }
  
  public int read()
  {
    return this.in.read();
  }
  
  public int read(byte[] paramArrayOfByte)
  {
    return this.in.read(paramArrayOfByte);
  }
  
  public int read(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    return this.in.read(paramArrayOfByte, paramInt1, paramInt2);
  }
  
  public void reset()
  {
    try
    {
      this.in.reset();
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public long skip(long paramLong)
  {
    return this.in.skip(paramLong);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/game/wepkg/c/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */