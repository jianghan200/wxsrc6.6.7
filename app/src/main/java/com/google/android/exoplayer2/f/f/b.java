package com.google.android.exoplayer2.f.f;

import com.google.android.exoplayer2.f.d;
import java.util.Collections;
import java.util.List;

final class b
  implements d
{
  public static final b azr = new b();
  private final List<com.google.android.exoplayer2.f.a> awy;
  
  private b()
  {
    this.awy = Collections.emptyList();
  }
  
  public b(com.google.android.exoplayer2.f.a parama)
  {
    this.awy = Collections.singletonList(parama);
  }
  
  public final int P(long paramLong)
  {
    if (paramLong < 0L) {
      return 0;
    }
    return -1;
  }
  
  public final List<com.google.android.exoplayer2.f.a> Q(long paramLong)
  {
    if (paramLong >= 0L) {
      return this.awy;
    }
    return Collections.emptyList();
  }
  
  public final long cM(int paramInt)
  {
    if (paramInt == 0) {}
    for (boolean bool = true;; bool = false)
    {
      com.google.android.exoplayer2.i.a.ao(bool);
      return 0L;
    }
  }
  
  public final int lj()
  {
    return 1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/google/android/exoplayer2/f/f/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */