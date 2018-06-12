package com.google.android.exoplayer2.a;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

final class j
  implements d
{
  private int aeg = -1;
  private ByteBuffer agG = afB;
  private int ahe = -1;
  private boolean ahi;
  private ByteBuffer buffer = afB;
  private int encoding = 0;
  
  public final void c(ByteBuffer paramByteBuffer)
  {
    int i = paramByteBuffer.position();
    int m = paramByteBuffer.limit();
    int j = m - i;
    switch (this.encoding)
    {
    default: 
      throw new IllegalStateException();
    case 3: 
      j *= 2;
      label68:
      if (this.buffer.capacity() < j) {
        this.buffer = ByteBuffer.allocateDirect(j).order(ByteOrder.nativeOrder());
      }
      break;
    }
    int k;
    for (;;)
    {
      j = i;
      k = i;
      switch (this.encoding)
      {
      default: 
        throw new IllegalStateException();
        j = j / 3 * 2;
        break label68;
        j /= 2;
        break label68;
        this.buffer.clear();
      }
    }
    while (j < m)
    {
      this.buffer.put((byte)0);
      this.buffer.put((byte)((paramByteBuffer.get(j) & 0xFF) - 128));
      j += 1;
      continue;
      while (k < m)
      {
        this.buffer.put(paramByteBuffer.get(k + 1));
        this.buffer.put(paramByteBuffer.get(k + 2));
        k += 3;
      }
    }
    for (;;)
    {
      if (i < m)
      {
        this.buffer.put(paramByteBuffer.get(i + 2));
        this.buffer.put(paramByteBuffer.get(i + 3));
        i += 4;
      }
      else
      {
        paramByteBuffer.position(paramByteBuffer.limit());
        this.buffer.flip();
        this.agG = this.buffer;
        return;
      }
    }
  }
  
  public final void flush()
  {
    this.agG = afB;
    this.ahi = false;
  }
  
  public final boolean iT()
  {
    return (this.ahi) && (this.agG == afB);
  }
  
  public final int iY()
  {
    return this.aeg;
  }
  
  public final int iZ()
  {
    return 2;
  }
  
  public final boolean isActive()
  {
    return (this.encoding != 0) && (this.encoding != 2);
  }
  
  public final void ja()
  {
    this.ahi = true;
  }
  
  public final ByteBuffer jb()
  {
    ByteBuffer localByteBuffer = this.agG;
    this.agG = afB;
    return localByteBuffer;
  }
  
  public final boolean r(int paramInt1, int paramInt2, int paramInt3)
  {
    if ((paramInt3 != 3) && (paramInt3 != 2) && (paramInt3 != Integer.MIN_VALUE) && (paramInt3 != 1073741824)) {
      throw new d.a(paramInt1, paramInt2, paramInt3);
    }
    if ((this.ahe == paramInt1) && (this.aeg == paramInt2) && (this.encoding == paramInt3)) {
      return false;
    }
    this.ahe = paramInt1;
    this.aeg = paramInt2;
    this.encoding = paramInt3;
    if (paramInt3 == 2) {
      this.buffer = afB;
    }
    return true;
  }
  
  public final void reset()
  {
    flush();
    this.buffer = afB;
    this.ahe = -1;
    this.aeg = -1;
    this.encoding = 0;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/google/android/exoplayer2/a/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */