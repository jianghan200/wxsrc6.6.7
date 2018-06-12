package com.google.android.exoplayer2.c.a;

import com.google.android.exoplayer2.i.t;

final class d
  implements b.a
{
  private final long aet;
  private final long aiT;
  private final long ajk;
  private final long[] ajl;
  private final long ajm;
  private final int ajn;
  
  d(long paramLong1, long paramLong2, long paramLong3)
  {
    this(paramLong1, paramLong2, paramLong3, null, 0L, 0);
  }
  
  d(long paramLong1, long paramLong2, long paramLong3, long[] paramArrayOfLong, long paramLong4, int paramInt)
  {
    this.aiT = paramLong1;
    this.aet = paramLong2;
    this.ajk = paramLong3;
    this.ajl = paramArrayOfLong;
    this.ajm = paramLong4;
    this.ajn = paramInt;
  }
  
  private long cr(int paramInt)
  {
    return this.aet * paramInt / 100L;
  }
  
  public final long C(long paramLong)
  {
    if ((!jR()) || (paramLong < this.aiT)) {
      return 0L;
    }
    double d = 256.0D * (paramLong - this.aiT) / this.ajm;
    int i = t.a(this.ajl, d, false) + 1;
    long l2 = cr(i);
    long l1;
    label77:
    long l3;
    if (i == 0)
    {
      paramLong = 0L;
      if (i != 99) {
        break label114;
      }
      l1 = 256L;
      l3 = cr(i + 1);
      if (l1 != paramLong) {
        break label126;
      }
    }
    label114:
    label126:
    for (paramLong = 0L;; paramLong = ((l3 - l2) * (d - paramLong) / (l1 - paramLong)))
    {
      return l2 + paramLong;
      paramLong = this.ajl[(i - 1)];
      break;
      l1 = this.ajl[i];
      break label77;
    }
  }
  
  public final boolean jR()
  {
    return this.ajl != null;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/google/android/exoplayer2/c/a/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */