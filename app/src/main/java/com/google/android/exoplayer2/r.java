package com.google.android.exoplayer2;

import com.google.android.exoplayer2.i.f;
import com.google.android.exoplayer2.source.i;

public abstract interface r
  extends f.b
{
  public abstract void a(t paramt, Format[] paramArrayOfFormat, i parami, long paramLong1, boolean paramBoolean, long paramLong2);
  
  public abstract void a(Format[] paramArrayOfFormat, i parami, long paramLong);
  
  public abstract void c(long paramLong1, long paramLong2);
  
  public abstract void disable();
  
  public abstract int getState();
  
  public abstract int getTrackType();
  
  public abstract boolean hv();
  
  public abstract boolean iT();
  
  public abstract s ip();
  
  public abstract f iq();
  
  public abstract i ir();
  
  public abstract boolean is();
  
  public abstract void it();
  
  public abstract boolean iu();
  
  public abstract void iv();
  
  public abstract void m(long paramLong);
  
  public abstract void setIndex(int paramInt);
  
  public abstract void start();
  
  public abstract void stop();
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/google/android/exoplayer2/r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */