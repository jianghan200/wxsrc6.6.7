package com.google.android.exoplayer2.f.c;

import com.google.android.exoplayer2.f.d;
import com.google.android.exoplayer2.i.t;
import java.util.Collections;
import java.util.List;

final class b
  implements d
{
  private final com.google.android.exoplayer2.f.a[] ayy;
  private final long[] ayz;
  
  public b(com.google.android.exoplayer2.f.a[] paramArrayOfa, long[] paramArrayOfLong)
  {
    this.ayy = paramArrayOfa;
    this.ayz = paramArrayOfLong;
  }
  
  public final int P(long paramLong)
  {
    int i = t.a(this.ayz, paramLong);
    if (i < this.ayz.length) {
      return i;
    }
    return -1;
  }
  
  public final List<com.google.android.exoplayer2.f.a> Q(long paramLong)
  {
    int i = t.a(this.ayz, paramLong, false);
    if ((i == -1) || (this.ayy[i] == null)) {
      return Collections.emptyList();
    }
    return Collections.singletonList(this.ayy[i]);
  }
  
  public final long cM(int paramInt)
  {
    boolean bool2 = true;
    if (paramInt >= 0)
    {
      bool1 = true;
      com.google.android.exoplayer2.i.a.ao(bool1);
      if (paramInt >= this.ayz.length) {
        break label39;
      }
    }
    label39:
    for (boolean bool1 = bool2;; bool1 = false)
    {
      com.google.android.exoplayer2.i.a.ao(bool1);
      return this.ayz[paramInt];
      bool1 = false;
      break;
    }
  }
  
  public final int lj()
  {
    return this.ayz.length;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/google/android/exoplayer2/f/c/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */