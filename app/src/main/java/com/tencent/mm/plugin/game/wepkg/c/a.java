package com.tencent.mm.plugin.game.wepkg.c;

import java.io.InputStream;

public final class a
  extends c
{
  int count;
  
  public a(InputStream paramInputStream)
  {
    super(paramInputStream);
  }
  
  public final int aVA()
  {
    try
    {
      int i = this.count;
      this.count = 0;
      return i;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final int read()
  {
    int j = super.read();
    int k = this.count;
    if (j >= 0) {}
    for (int i = 1;; i = 0)
    {
      this.count = (i + k);
      return j;
    }
  }
  
  public final int read(byte[] paramArrayOfByte)
  {
    int j = super.read(paramArrayOfByte);
    int k = this.count;
    if (j >= 0) {}
    for (int i = j;; i = 0)
    {
      this.count = (i + k);
      return j;
    }
  }
  
  public final int read(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    paramInt2 = super.read(paramArrayOfByte, paramInt1, paramInt2);
    int i = this.count;
    if (paramInt2 >= 0) {}
    for (paramInt1 = paramInt2;; paramInt1 = 0)
    {
      this.count = (paramInt1 + i);
      return paramInt2;
    }
  }
  
  public final long skip(long paramLong)
  {
    paramLong = super.skip(paramLong);
    this.count = ((int)(this.count + paramLong));
    return paramLong;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/wepkg/c/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */