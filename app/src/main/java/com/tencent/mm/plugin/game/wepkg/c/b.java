package com.tencent.mm.plugin.game.wepkg.c;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public final class b
  extends InputStream
{
  private a kgi;
  private long size;
  
  public b(File paramFile, long paramLong1, long paramLong2)
  {
    this.size = paramLong2;
    this.kgi = new a(new FileInputStream(paramFile));
    dJ(paramLong1);
    this.kgi.aVA();
  }
  
  private long aVB()
  {
    return this.size - this.kgi.count;
  }
  
  private long dI(long paramLong)
  {
    return Math.min(aVB(), paramLong);
  }
  
  private void dJ(long paramLong)
  {
    long l2;
    for (long l1 = 0L; l1 < paramLong; l1 += l2)
    {
      l2 = this.kgi.skip(paramLong - l1);
      if (l2 <= 0L) {
        break;
      }
    }
    if (l1 < paramLong) {
      throw new IOException("could not seek pos " + paramLong);
    }
  }
  
  public final int available()
  {
    return (int)dI(this.kgi.available());
  }
  
  public final int read()
  {
    if (aVB() <= 0L) {}
    for (int i = 1; i != 0; i = 0) {
      return -1;
    }
    return this.kgi.read();
  }
  
  public final int read(byte[] paramArrayOfByte)
  {
    return read(paramArrayOfByte, 0, paramArrayOfByte.length);
  }
  
  public final int read(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    long l = dI(paramInt2);
    if ((l == 0L) && (paramInt2 > 0)) {
      return -1;
    }
    return this.kgi.read(paramArrayOfByte, paramInt1, (int)l);
  }
  
  public final long skip(long paramLong)
  {
    return this.kgi.skip(dI(paramLong));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/wepkg/c/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */