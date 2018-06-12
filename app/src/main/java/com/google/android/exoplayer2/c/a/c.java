package com.google.android.exoplayer2.c.a;

final class c
  implements b.a
{
  private final long aet;
  private final long[] aiA;
  private final long[] ajj;
  
  c(long[] paramArrayOfLong1, long[] paramArrayOfLong2, long paramLong)
  {
    this.aiA = paramArrayOfLong1;
    this.ajj = paramArrayOfLong2;
    this.aet = paramLong;
  }
  
  public final long C(long paramLong)
  {
    return this.aiA[com.google.android.exoplayer2.i.t.a(this.ajj, paramLong, true)];
  }
  
  public final boolean jR()
  {
    return true;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/google/android/exoplayer2/c/a/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */