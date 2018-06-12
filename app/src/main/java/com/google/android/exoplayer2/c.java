package com.google.android.exoplayer2;

import com.google.android.exoplayer2.g.f;
import com.google.android.exoplayer2.h.b;
import com.google.android.exoplayer2.h.j;
import com.google.android.exoplayer2.i.t;
import java.util.PriorityQueue;

public final class c
  implements m
{
  private final j acs;
  private final long act;
  private final long acu;
  private final long acv;
  private final long acw;
  private final com.google.android.exoplayer2.i.m acx;
  private int acy;
  private boolean isBuffering;
  
  public c()
  {
    this(new j());
  }
  
  private c(j paramj)
  {
    this(paramj, (byte)0);
  }
  
  private c(j paramj, byte paramByte)
  {
    this(paramj, '\000');
  }
  
  private c(j paramj, char paramChar)
  {
    this.acs = paramj;
    this.act = 15000000L;
    this.acu = 30000000L;
    this.acv = 2500000L;
    this.acw = 5000000L;
    this.acx = null;
  }
  
  private void reset(boolean paramBoolean)
  {
    this.acy = 0;
    if ((this.acx != null) && (this.isBuffering)) {
      this.acx.mo();
    }
    this.isBuffering = false;
    if (paramBoolean) {
      this.acs.reset();
    }
  }
  
  public final void a(r[] paramArrayOfr, f paramf)
  {
    int i = 0;
    this.acy = 0;
    while (i < paramArrayOfr.length)
    {
      if (paramf.aAu[i] != null) {
        this.acy += t.df(paramArrayOfr[i].getTrackType());
      }
      i += 1;
    }
    this.acs.cV(this.acy);
  }
  
  public final boolean c(long paramLong, boolean paramBoolean)
  {
    if (paramBoolean) {}
    for (long l = this.acw; (l <= 0L) || (paramLong >= l); l = this.acv) {
      return true;
    }
    return false;
  }
  
  public final b iA()
  {
    return this.acs;
  }
  
  public final void iy()
  {
    reset(false);
  }
  
  public final void iz()
  {
    reset(true);
  }
  
  public final void onStopped()
  {
    reset(true);
  }
  
  public final boolean p(long paramLong)
  {
    boolean bool2 = false;
    int i;
    int j;
    com.google.android.exoplayer2.i.m localm;
    if (paramLong > this.acu)
    {
      i = 0;
      if (this.acs.lR() < this.acy) {
        break label173;
      }
      j = 1;
      boolean bool3 = this.isBuffering;
      boolean bool1;
      if (i != 2)
      {
        bool1 = bool2;
        if (i == 1)
        {
          bool1 = bool2;
          if (this.isBuffering)
          {
            bool1 = bool2;
            if (j != 0) {}
          }
        }
      }
      else
      {
        bool1 = true;
      }
      this.isBuffering = bool1;
      if ((this.acx != null) && (this.isBuffering != bool3))
      {
        if (!this.isBuffering) {
          break label187;
        }
        localm = this.acx;
      }
    }
    for (;;)
    {
      synchronized (localm.lock)
      {
        localm.aCs.add(Integer.valueOf(0));
        localm.aCt = Math.max(localm.aCt, 0);
        return this.isBuffering;
        if (paramLong < this.act)
        {
          i = 2;
          break;
        }
        i = 1;
        break;
        label173:
        j = 0;
      }
      label187:
      this.acx.mo();
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/google/android/exoplayer2/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */