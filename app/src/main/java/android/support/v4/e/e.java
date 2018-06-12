package android.support.v4.e;

public final class e<E>
  implements Cloneable
{
  public static final Object tA = new Object();
  public int fi;
  public boolean tB = false;
  public long[] tC;
  public Object[] tD;
  
  public e()
  {
    this((byte)0);
  }
  
  private e(byte paramByte)
  {
    paramByte = b.ae(10);
    this.tC = new long[paramByte];
    this.tD = new Object[paramByte];
    this.fi = 0;
  }
  
  private e<E> bV()
  {
    try
    {
      e locale = (e)super.clone();
      return localCloneNotSupportedException1;
    }
    catch (CloneNotSupportedException localCloneNotSupportedException1)
    {
      try
      {
        locale.tC = ((long[])this.tC.clone());
        locale.tD = ((Object[])this.tD.clone());
        return locale;
      }
      catch (CloneNotSupportedException localCloneNotSupportedException2) {}
      localCloneNotSupportedException1 = localCloneNotSupportedException1;
      return null;
    }
  }
  
  private void gc()
  {
    int m = this.fi;
    long[] arrayOfLong = this.tC;
    Object[] arrayOfObject = this.tD;
    int i = 0;
    int k;
    for (int j = 0; i < m; j = k)
    {
      Object localObject = arrayOfObject[i];
      k = j;
      if (localObject != tA)
      {
        if (i != j)
        {
          arrayOfLong[j] = arrayOfLong[i];
          arrayOfObject[j] = localObject;
          arrayOfObject[i] = null;
        }
        k = j + 1;
      }
      i += 1;
    }
    this.tB = false;
    this.fi = j;
  }
  
  private long keyAt(int paramInt)
  {
    if (this.tB) {
      gc();
    }
    return this.tC[paramInt];
  }
  
  public final E get(long paramLong)
  {
    int i = b.a(this.tC, this.fi, paramLong);
    if ((i < 0) || (this.tD[i] == tA)) {
      return null;
    }
    return (E)this.tD[i];
  }
  
  public final void put(long paramLong, E paramE)
  {
    int i = b.a(this.tC, this.fi, paramLong);
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
    if (this.tB)
    {
      i = j;
      if (this.fi >= this.tC.length)
      {
        gc();
        i = b.a(this.tC, this.fi, paramLong) ^ 0xFFFFFFFF;
      }
    }
    if (this.fi >= this.tC.length)
    {
      j = b.ae(this.fi + 1);
      long[] arrayOfLong = new long[j];
      Object[] arrayOfObject = new Object[j];
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
  
  public final int size()
  {
    if (this.tB) {
      gc();
    }
    return this.fi;
  }
  
  public final String toString()
  {
    if (size() <= 0) {
      return "{}";
    }
    StringBuilder localStringBuilder = new StringBuilder(this.fi * 28);
    localStringBuilder.append('{');
    int i = 0;
    if (i < this.fi)
    {
      if (i > 0) {
        localStringBuilder.append(", ");
      }
      localStringBuilder.append(keyAt(i));
      localStringBuilder.append('=');
      Object localObject = valueAt(i);
      if (localObject != this) {
        localStringBuilder.append(localObject);
      }
      for (;;)
      {
        i += 1;
        break;
        localStringBuilder.append("(this Map)");
      }
    }
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
  
  public final E valueAt(int paramInt)
  {
    if (this.tB) {
      gc();
    }
    return (E)this.tD[paramInt];
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/android/support/v4/e/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */