package com.google.android.exoplayer2.g;

import com.google.android.exoplayer2.source.m;

public final class h
{
  public final m aAw;
  public final f aAx;
  public final Object aAy;
  public final com.google.android.exoplayer2.t[] aAz;
  
  public h(m paramm, f paramf, Object paramObject, com.google.android.exoplayer2.t[] paramArrayOft)
  {
    this.aAw = paramm;
    this.aAx = paramf;
    this.aAy = paramObject;
    this.aAz = paramArrayOft;
  }
  
  public final boolean a(h paramh, int paramInt)
  {
    if (paramh == null) {}
    while ((!com.google.android.exoplayer2.i.t.i(this.aAx.aAu[paramInt], paramh.aAx.aAu[paramInt])) || (!com.google.android.exoplayer2.i.t.i(this.aAz[paramInt], paramh.aAz[paramInt]))) {
      return false;
    }
    return true;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/google/android/exoplayer2/g/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */