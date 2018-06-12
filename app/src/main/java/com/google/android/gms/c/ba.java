package com.google.android.gms.c;

final class ba
  implements Cloneable
{
  static final bb bab = new bb();
  boolean bac = false;
  int[] bad;
  bb[] bae;
  int fi;
  
  public ba()
  {
    this(10);
  }
  
  private ba(int paramInt)
  {
    paramInt = ad(paramInt);
    this.bad = new int[paramInt];
    this.bae = new bb[paramInt];
    this.fi = 0;
  }
  
  static int ad(int paramInt)
  {
    int j = paramInt * 4;
    paramInt = 4;
    for (;;)
    {
      int i = j;
      if (paramInt < 32)
      {
        if (j <= (1 << paramInt) - 12) {
          i = (1 << paramInt) - 12;
        }
      }
      else {
        return i / 4;
      }
      paramInt += 1;
    }
  }
  
  public final bb dM(int paramInt)
  {
    if (this.bac) {
      gc();
    }
    return this.bae[paramInt];
  }
  
  final int dN(int paramInt)
  {
    int i = 0;
    int j = this.fi - 1;
    while (i <= j)
    {
      int k = i + j >>> 1;
      int m = this.bad[k];
      if (m < paramInt)
      {
        i = k + 1;
      }
      else
      {
        j = k;
        if (m <= paramInt) {
          return j;
        }
        j = k - 1;
      }
    }
    j = i ^ 0xFFFFFFFF;
    return j;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (paramObject == this) {}
    label71:
    label93:
    label131:
    label138:
    label141:
    for (;;)
    {
      return true;
      if (!(paramObject instanceof ba)) {
        return false;
      }
      paramObject = (ba)paramObject;
      if (size() != ((ba)paramObject).size()) {
        return false;
      }
      Object localObject = this.bad;
      int[] arrayOfInt = ((ba)paramObject).bad;
      int j = this.fi;
      int i = 0;
      if (i < j) {
        if (localObject[i] != arrayOfInt[i])
        {
          i = 0;
          if (i != 0)
          {
            localObject = this.bae;
            paramObject = ((ba)paramObject).bae;
            j = this.fi;
            i = 0;
            if (i >= j) {
              break label138;
            }
            if (localObject[i].equals(paramObject[i])) {
              break label131;
            }
          }
        }
      }
      for (i = 0;; i = 1)
      {
        if (i != 0) {
          break label141;
        }
        return false;
        i += 1;
        break;
        i = 1;
        break label71;
        i += 1;
        break label93;
      }
    }
  }
  
  final void gc()
  {
    int m = this.fi;
    int[] arrayOfInt = this.bad;
    bb[] arrayOfbb = this.bae;
    int i = 0;
    int k;
    for (int j = 0; i < m; j = k)
    {
      bb localbb = arrayOfbb[i];
      k = j;
      if (localbb != bab)
      {
        if (i != j)
        {
          arrayOfInt[j] = arrayOfInt[i];
          arrayOfbb[j] = localbb;
          arrayOfbb[i] = null;
        }
        k = j + 1;
      }
      i += 1;
    }
    this.bac = false;
    this.fi = j;
  }
  
  public final int hashCode()
  {
    if (this.bac) {
      gc();
    }
    int j = 17;
    int i = 0;
    while (i < this.fi)
    {
      j = (j * 31 + this.bad[i]) * 31 + this.bae[i].hashCode();
      i += 1;
    }
    return j;
  }
  
  public final boolean isEmpty()
  {
    return size() == 0;
  }
  
  public final ba qI()
  {
    int i = 0;
    int j = size();
    ba localba = new ba(j);
    System.arraycopy(this.bad, 0, localba.bad, 0, j);
    while (i < j)
    {
      if (this.bae[i] != null) {
        localba.bae[i] = this.bae[i].qJ();
      }
      i += 1;
    }
    localba.fi = j;
    return localba;
  }
  
  public final int size()
  {
    if (this.bac) {
      gc();
    }
    return this.fi;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/google/android/gms/c/ba.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */