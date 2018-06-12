package com.google.android.exoplayer2.source;

public final class d
  implements j
{
  private final j[] arS;
  
  public d(j[] paramArrayOfj)
  {
    this.arS = paramArrayOfj;
  }
  
  public final boolean G(long paramLong)
  {
    boolean bool3 = false;
    boolean bool4;
    boolean bool1;
    do
    {
      long l = kB();
      bool4 = bool3;
      if (l == Long.MIN_VALUE) {
        break;
      }
      j[] arrayOfj = this.arS;
      int j = arrayOfj.length;
      int i = 0;
      boolean bool2;
      for (bool1 = false; i < j; bool1 = bool2)
      {
        j localj = arrayOfj[i];
        bool2 = bool1;
        if (localj.kB() == l) {
          bool2 = bool1 | localj.G(paramLong);
        }
        i += 1;
      }
      bool4 = bool3 | bool1;
      bool3 = bool4;
    } while (bool1);
    return bool4;
  }
  
  public final long kA()
  {
    j[] arrayOfj = this.arS;
    int j = arrayOfj.length;
    int i = 0;
    for (long l1 = Long.MAX_VALUE; i < j; l1 = l2)
    {
      long l3 = arrayOfj[i].kA();
      l2 = l1;
      if (l3 != Long.MIN_VALUE) {
        l2 = Math.min(l1, l3);
      }
      i += 1;
    }
    long l2 = l1;
    if (l1 == Long.MAX_VALUE) {
      l2 = Long.MIN_VALUE;
    }
    return l2;
  }
  
  public final long kB()
  {
    j[] arrayOfj = this.arS;
    int j = arrayOfj.length;
    int i = 0;
    for (long l1 = Long.MAX_VALUE; i < j; l1 = l2)
    {
      long l3 = arrayOfj[i].kB();
      l2 = l1;
      if (l3 != Long.MIN_VALUE) {
        l2 = Math.min(l1, l3);
      }
      i += 1;
    }
    long l2 = l1;
    if (l1 == Long.MAX_VALUE) {
      l2 = Long.MIN_VALUE;
    }
    return l2;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/google/android/exoplayer2/source/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */