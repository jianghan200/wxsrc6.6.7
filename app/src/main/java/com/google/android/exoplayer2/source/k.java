package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.i.a;
import com.google.android.exoplayer2.w;
import com.google.android.exoplayer2.w.a;
import com.google.android.exoplayer2.w.b;

public final class k
  extends w
{
  private static final Object asC = new Object();
  private final long aff;
  private final long afg;
  private final boolean afh;
  private final boolean afi;
  private final long asD;
  private final long asE;
  private final long asF;
  private final long asG;
  
  public k(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, long paramLong6, boolean paramBoolean)
  {
    this.aff = paramLong1;
    this.afg = paramLong2;
    this.asD = paramLong3;
    this.asE = paramLong4;
    this.asF = paramLong5;
    this.asG = paramLong6;
    this.afh = true;
    this.afi = paramBoolean;
  }
  
  public final int V(Object paramObject)
  {
    if (asC.equals(paramObject)) {
      return 0;
    }
    return -1;
  }
  
  public final w.a a(int paramInt, w.a parama, boolean paramBoolean)
  {
    a.av(paramInt, 1);
    if (paramBoolean) {}
    for (Object localObject = asC;; localObject = null)
    {
      long l1 = this.asD;
      long l2 = -this.asF;
      parama.aeX = localObject;
      parama.adz = localObject;
      parama.adO = 0;
      parama.aet = l1;
      parama.aeY = l2;
      parama.aeZ = null;
      parama.afa = null;
      parama.afb = null;
      parama.afc = null;
      parama.afd = null;
      parama.afe = -9223372036854775807L;
      return parama;
    }
  }
  
  public final w.b a(int paramInt, w.b paramb, long paramLong)
  {
    a.av(paramInt, 1);
    long l2 = this.asG;
    long l1 = l2;
    if (this.afi)
    {
      paramLong = l2 + paramLong;
      l1 = paramLong;
      if (paramLong > this.asE) {
        l1 = -9223372036854775807L;
      }
    }
    paramLong = this.aff;
    l2 = this.afg;
    boolean bool1 = this.afh;
    boolean bool2 = this.afi;
    long l3 = this.asE;
    long l4 = this.asF;
    paramb.aeX = null;
    paramb.aff = paramLong;
    paramb.afg = l2;
    paramb.afh = bool1;
    paramb.afi = bool2;
    paramb.afl = l1;
    paramb.aet = l3;
    paramb.afj = 0;
    paramb.afk = 0;
    paramb.afm = l4;
    return paramb;
  }
  
  public final int iU()
  {
    return 1;
  }
  
  public final int iV()
  {
    return 1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/google/android/exoplayer2/source/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */