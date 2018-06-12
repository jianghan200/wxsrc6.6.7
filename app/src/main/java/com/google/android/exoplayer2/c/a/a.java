package com.google.android.exoplayer2.c.a;

final class a
  implements b.a
{
  private final long aet;
  private final long aiT;
  private final int bitrate;
  
  public a(long paramLong1, int paramInt, long paramLong2)
  {
    this.aiT = paramLong1;
    this.bitrate = paramInt;
    if (paramLong2 == -1L) {}
    for (paramLong1 = -9223372036854775807L;; paramLong1 = C(paramLong2))
    {
      this.aet = paramLong1;
      return;
    }
  }
  
  public final long C(long paramLong)
  {
    return Math.max(0L, paramLong - this.aiT) * 1000000L * 8L / this.bitrate;
  }
  
  public final boolean jR()
  {
    return this.aet != -9223372036854775807L;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/google/android/exoplayer2/c/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */