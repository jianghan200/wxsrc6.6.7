package com.google.android.exoplayer2.f;

import com.google.android.exoplayer2.b.f;
import java.util.List;

public abstract class i
  extends f
  implements d
{
  private long aek;
  private d awd;
  
  public final int P(long paramLong)
  {
    return this.awd.P(paramLong - this.aek);
  }
  
  public final List<a> Q(long paramLong)
  {
    return this.awd.Q(paramLong - this.aek);
  }
  
  public final void a(long paramLong1, d paramd, long paramLong2)
  {
    this.aih = paramLong1;
    this.awd = paramd;
    paramLong1 = paramLong2;
    if (paramLong2 == Long.MAX_VALUE) {
      paramLong1 = this.aih;
    }
    this.aek = paramLong1;
  }
  
  public final long cM(int paramInt)
  {
    return this.awd.cM(paramInt) + this.aek;
  }
  
  public final void clear()
  {
    super.clear();
    this.awd = null;
  }
  
  public final int lj()
  {
    return this.awd.lj();
  }
  
  public abstract void release();
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/google/android/exoplayer2/f/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */