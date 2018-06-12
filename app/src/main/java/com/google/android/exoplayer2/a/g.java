package com.google.android.exoplayer2.a;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

final class g
  implements d
{
  private int aeg = -1;
  private ByteBuffer agG = afB;
  private int ahe = -1;
  int[] ahf;
  private boolean ahg;
  private int[] ahh;
  private boolean ahi;
  private ByteBuffer buffer = afB;
  
  public final void c(ByteBuffer paramByteBuffer)
  {
    int i = paramByteBuffer.position();
    int k = paramByteBuffer.limit();
    int j = (k - i) / (this.aeg * 2) * this.ahh.length * 2;
    if (this.buffer.capacity() < j) {
      this.buffer = ByteBuffer.allocateDirect(j).order(ByteOrder.nativeOrder());
    }
    while (i < k)
    {
      int[] arrayOfInt = this.ahh;
      int m = arrayOfInt.length;
      j = 0;
      for (;;)
      {
        if (j < m)
        {
          int n = arrayOfInt[j];
          this.buffer.putShort(paramByteBuffer.getShort(n * 2 + i));
          j += 1;
          continue;
          this.buffer.clear();
          break;
        }
      }
      i += this.aeg * 2;
    }
    paramByteBuffer.position(k);
    this.buffer.flip();
    this.agG = this.buffer;
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
    if (this.ahh == null) {
      return this.aeg;
    }
    return this.ahh.length;
  }
  
  public final int iZ()
  {
    return 2;
  }
  
  public final boolean isActive()
  {
    return this.ahg;
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
    if (!Arrays.equals(this.ahf, this.ahh)) {}
    for (int k = 1;; k = 0)
    {
      this.ahh = this.ahf;
      if (this.ahh != null) {
        break;
      }
      this.ahg = false;
      return k;
    }
    if (paramInt3 != 2) {
      throw new d.a(paramInt1, paramInt2, paramInt3);
    }
    if ((k == 0) && (this.ahe == paramInt1) && (this.aeg == paramInt2)) {
      return false;
    }
    this.ahe = paramInt1;
    this.aeg = paramInt2;
    if (paramInt2 != this.ahh.length) {}
    int i;
    for (k = 1;; k = 0)
    {
      this.ahg = k;
      i = 0;
      if (i >= this.ahh.length) {
        break label198;
      }
      j = this.ahh[i];
      if (j < paramInt2) {
        break;
      }
      throw new d.a(paramInt1, paramInt2, paramInt3);
    }
    k = this.ahg;
    if (j != i) {}
    for (int j = 1;; j = 0)
    {
      this.ahg = (j | k);
      i += 1;
      break;
    }
    label198:
    return true;
  }
  
  public final void reset()
  {
    flush();
    this.buffer = afB;
    this.aeg = -1;
    this.ahe = -1;
    this.ahh = null;
    this.ahg = false;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/google/android/exoplayer2/a/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */