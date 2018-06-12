package com.google.android.exoplayer2.i;

import java.util.Arrays;

public final class e
{
  private long[] aCc = new long[32];
  private int size;
  
  public e()
  {
    this((byte)0);
  }
  
  private e(byte paramByte) {}
  
  public final void add(long paramLong)
  {
    if (this.size == this.aCc.length) {
      this.aCc = Arrays.copyOf(this.aCc, this.size * 2);
    }
    long[] arrayOfLong = this.aCc;
    int i = this.size;
    this.size = (i + 1);
    arrayOfLong[i] = paramLong;
  }
  
  public final long[] toArray()
  {
    return Arrays.copyOf(this.aCc, this.size);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/google/android/exoplayer2/i/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */