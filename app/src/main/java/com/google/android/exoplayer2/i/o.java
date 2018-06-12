package com.google.android.exoplayer2.i;

import android.os.SystemClock;
import com.google.android.exoplayer2.b;
import com.google.android.exoplayer2.p;

public final class o
  implements f
{
  private long aCD;
  public long aCE;
  private p acY = p.aew;
  public boolean started;
  
  public final void O(long paramLong)
  {
    this.aCD = paramLong;
    if (this.started) {
      this.aCE = SystemClock.elapsedRealtime();
    }
  }
  
  public final void a(f paramf)
  {
    O(paramf.jn());
    this.acY = paramf.ju();
  }
  
  public final p b(p paramp)
  {
    if (this.started) {
      O(jn());
    }
    this.acY = paramp;
    return paramp;
  }
  
  public final long jn()
  {
    long l2 = this.aCD;
    long l1 = l2;
    if (this.started)
    {
      l1 = SystemClock.elapsedRealtime() - this.aCE;
      if (this.acY.aex == 1.0F) {
        l1 = l2 + b.o(l1);
      }
    }
    else
    {
      return l1;
    }
    return l2 + l1 * this.acY.aey;
  }
  
  public final p ju()
  {
    return this.acY;
  }
  
  public final void stop()
  {
    if (this.started)
    {
      O(jn());
      this.started = false;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/google/android/exoplayer2/i/o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */