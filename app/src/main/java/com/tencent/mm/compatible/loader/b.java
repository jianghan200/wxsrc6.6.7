package com.tencent.mm.compatible.loader;

public final class b<E>
{
  static final Object tA = new Object();
  int fi;
  boolean tB;
  long[] tC;
  Object[] tD;
  
  static int b(long[] paramArrayOfLong, int paramInt, long paramLong)
  {
    int i = paramInt + 0;
    int j = -1;
    while (i - j > 1)
    {
      int k = (i + j) / 2;
      if (paramArrayOfLong[k] < paramLong) {
        j = k;
      } else {
        i = k;
      }
    }
    if (i == paramInt + 0) {
      paramInt = paramInt + 0 ^ 0xFFFFFFFF;
    }
    do
    {
      return paramInt;
      paramInt = i;
    } while (paramArrayOfLong[i] == paramLong);
    return i ^ 0xFFFFFFFF;
  }
  
  public final void put(long paramLong, E paramE)
  {
    int i = b(this.tC, this.fi, paramLong);
    if (i >= 0)
    {
      this.tD[i] = paramE;
      return;
    }
    int j = i ^ 0xFFFFFFFF;
    if ((j < this.fi) && (this.tD[j] == tA))
    {
      this.tC[j] = paramLong;
      this.tD[j] = paramE;
      return;
    }
    i = j;
    long[] arrayOfLong;
    Object[] arrayOfObject;
    if (this.tB)
    {
      i = j;
      if (this.fi >= this.tC.length)
      {
        int m = this.fi;
        arrayOfLong = this.tC;
        arrayOfObject = this.tD;
        i = 0;
        int k;
        for (j = 0; i < m; j = k)
        {
          Object localObject = arrayOfObject[i];
          k = j;
          if (localObject != tA)
          {
            if (i != j)
            {
              arrayOfLong[j] = arrayOfLong[i];
              arrayOfObject[j] = localObject;
            }
            k = j + 1;
          }
          i += 1;
        }
        this.tB = false;
        this.fi = j;
        i = b(this.tC, this.fi, paramLong) ^ 0xFFFFFFFF;
      }
    }
    if (this.fi >= this.tC.length)
    {
      j = a.ad(this.fi + 1);
      arrayOfLong = new long[j];
      arrayOfObject = new Object[j];
      System.arraycopy(this.tC, 0, arrayOfLong, 0, this.tC.length);
      System.arraycopy(this.tD, 0, arrayOfObject, 0, this.tD.length);
      this.tC = arrayOfLong;
      this.tD = arrayOfObject;
    }
    if (this.fi - i != 0)
    {
      System.arraycopy(this.tC, i, this.tC, i + 1, this.fi - i);
      System.arraycopy(this.tD, i, this.tD, i + 1, this.fi - i);
    }
    this.tC[i] = paramLong;
    this.tD[i] = paramE;
    this.fi += 1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/compatible/loader/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */