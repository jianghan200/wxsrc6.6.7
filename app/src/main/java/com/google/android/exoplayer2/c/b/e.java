package com.google.android.exoplayer2.c.b;

import com.google.android.exoplayer2.Format;

public final class e
{
  public final Format aep;
  public final long aet;
  public final int alp;
  public final long amd;
  public final long ame;
  public final int amf;
  public final long[] amg;
  public final long[] amh;
  private final f[] ami;
  public final int id;
  public final int type;
  
  public e(int paramInt1, int paramInt2, long paramLong1, long paramLong2, long paramLong3, Format paramFormat, int paramInt3, f[] paramArrayOff, int paramInt4, long[] paramArrayOfLong1, long[] paramArrayOfLong2)
  {
    this.id = paramInt1;
    this.type = paramInt2;
    this.amd = paramLong1;
    this.ame = paramLong2;
    this.aet = paramLong3;
    this.aep = paramFormat;
    this.amf = paramInt3;
    this.ami = paramArrayOff;
    this.alp = paramInt4;
    this.amg = paramArrayOfLong1;
    this.amh = paramArrayOfLong2;
  }
  
  public final f cx(int paramInt)
  {
    if (this.ami == null) {
      return null;
    }
    return this.ami[paramInt];
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/google/android/exoplayer2/c/b/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */