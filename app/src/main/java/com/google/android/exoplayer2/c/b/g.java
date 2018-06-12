package com.google.android.exoplayer2.c.b;

import com.google.android.exoplayer2.i.j;

final class g
{
  public boolean[] amA;
  public f amB;
  public int amC;
  public j amD;
  public boolean amE;
  public long amF;
  public c amo;
  public long amp;
  public long amq;
  public long amr;
  public int ams;
  public long[] amt;
  public int[] amu;
  public int[] amv;
  public int[] amw;
  public long[] amx;
  public boolean[] amy;
  public boolean amz;
  public int sampleCount;
  
  public final void cy(int paramInt)
  {
    if ((this.amD == null) || (this.amD.limit < paramInt)) {
      this.amD = new j(paramInt);
    }
    this.amC = paramInt;
    this.amz = true;
    this.amE = true;
  }
  
  public final long cz(int paramInt)
  {
    return this.amx[paramInt] + this.amw[paramInt];
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/google/android/exoplayer2/c/b/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */