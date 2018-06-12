package com.google.android.exoplayer2.c.c;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.c.f;
import com.google.android.exoplayer2.c.k;
import com.google.android.exoplayer2.i.j;
import com.google.android.exoplayer2.i.q;

public final class s
  implements p
{
  private q alB;
  private k alX;
  private boolean aoO;
  
  public final void a(q paramq, f paramf, u.d paramd)
  {
    this.alB = paramq;
    paramd.kf();
    this.alX = paramf.cp(paramd.kg());
    this.alX.f(Format.h(paramd.kh(), "application/x-scte35"));
  }
  
  public final void b(j paramj)
  {
    long l = -9223372036854775807L;
    if (!this.aoO)
    {
      if (this.alB.mp() == -9223372036854775807L) {
        return;
      }
      this.alX.f(Format.b("application/x-scte35", this.alB.mp()));
      this.aoO = true;
    }
    int i = paramj.me();
    this.alX.a(paramj, i);
    paramj = this.alX;
    q localq = this.alB;
    if (localq.aCG != -9223372036854775807L) {
      l = localq.aCG;
    }
    for (;;)
    {
      paramj.a(l, 1, i, 0, null);
      return;
      if (localq.amH != Long.MAX_VALUE) {
        l = localq.amH;
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/google/android/exoplayer2/c/c/s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */