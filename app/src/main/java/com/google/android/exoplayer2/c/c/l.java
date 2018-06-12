package com.google.android.exoplayer2.c.c;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.c.f;
import com.google.android.exoplayer2.c.k;
import com.google.android.exoplayer2.i.j;

public final class l
  implements h
{
  private k alX;
  private boolean anj;
  private long anl;
  private final j aor = new j(10);
  private int aos;
  private int sampleSize;
  
  public final void a(f paramf, u.d paramd)
  {
    paramd.kf();
    this.alX = paramf.cp(paramd.kg());
    this.alX.f(Format.h(paramd.kh(), "application/id3"));
  }
  
  public final void b(j paramj)
  {
    if (!this.anj) {
      return;
    }
    int i = paramj.me();
    if (this.aos < 10)
    {
      int j = Math.min(i, 10 - this.aos);
      System.arraycopy(paramj.data, paramj.position, this.aor.data, this.aos, j);
      if (j + this.aos == 10)
      {
        this.aor.setPosition(0);
        if ((73 != this.aor.readUnsignedByte()) || (68 != this.aor.readUnsignedByte()) || (51 != this.aor.readUnsignedByte()))
        {
          this.anj = false;
          return;
        }
        this.aor.da(3);
        this.sampleSize = (this.aor.mg() + 10);
      }
    }
    i = Math.min(i, this.sampleSize - this.aos);
    this.alX.a(paramj, i);
    this.aos = (i + this.aos);
  }
  
  public final void d(long paramLong, boolean paramBoolean)
  {
    if (!paramBoolean) {
      return;
    }
    this.anj = true;
    this.anl = paramLong;
    this.sampleSize = 0;
    this.aos = 0;
  }
  
  public final void jX()
  {
    this.anj = false;
  }
  
  public final void jY()
  {
    if ((!this.anj) || (this.sampleSize == 0) || (this.aos != this.sampleSize)) {
      return;
    }
    this.alX.a(this.anl, 1, this.sampleSize, 0, null);
    this.anj = false;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/google/android/exoplayer2/c/c/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */