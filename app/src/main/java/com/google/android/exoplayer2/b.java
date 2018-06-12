package com.google.android.exoplayer2;

import com.google.android.exoplayer2.i.t;
import java.util.UUID;

public final class b
{
  public static final int CHANNEL_OUT_7POINT1_SURROUND;
  public static final UUID aco;
  public static final UUID acp;
  public static final UUID acq;
  public static final UUID acr;
  
  static
  {
    if (t.SDK_INT < 23) {}
    for (int i = 1020;; i = 6396)
    {
      CHANNEL_OUT_7POINT1_SURROUND = i;
      aco = new UUID(0L, 0L);
      acp = new UUID(1186680826959645954L, -5988876978535335093L);
      acq = new UUID(-1301668207276963122L, -6645017420763422227L);
      acr = new UUID(-7348484286925749626L, -6083546864340672619L);
      return;
    }
  }
  
  public static long n(long paramLong)
  {
    if ((paramLong == -9223372036854775807L) || (paramLong == Long.MIN_VALUE)) {
      return paramLong;
    }
    return paramLong / 1000L;
  }
  
  public static long o(long paramLong)
  {
    if ((paramLong == -9223372036854775807L) || (paramLong == Long.MIN_VALUE)) {
      return paramLong;
    }
    return paramLong * 1000L;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/google/android/exoplayer2/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */