package com.google.android.exoplayer2.source.a;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.h.f;
import com.google.android.exoplayer2.h.i;
import com.google.android.exoplayer2.h.r.c;

public abstract class a
  implements r.c
{
  public final f aiC;
  public final i asJ;
  public final Format asK;
  public final int asL;
  public final Object asM;
  public final long asN;
  public final long asO;
  public final int type;
  
  public a(f paramf, i parami, int paramInt1, Format paramFormat, int paramInt2, Object paramObject, long paramLong1, long paramLong2)
  {
    this.aiC = ((f)com.google.android.exoplayer2.i.a.Z(paramf));
    this.asJ = ((i)com.google.android.exoplayer2.i.a.Z(parami));
    this.type = paramInt1;
    this.asK = paramFormat;
    this.asL = paramInt2;
    this.asM = paramObject;
    this.asN = paramLong1;
    this.asO = paramLong2;
  }
  
  public abstract long kP();
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/google/android/exoplayer2/source/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */