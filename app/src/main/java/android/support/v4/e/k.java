package android.support.v4.e;

public final class k<E>
  implements Cloneable
{
  private static final Object tA = new Object();
  private int fi;
  private boolean tB = false;
  private Object[] tD;
  private int[] tU;
  
  public k()
  {
    this(10);
  }
  
  public k(int paramInt)
  {
    if (paramInt == 0) {
      this.tU = b.tx;
    }
    for (this.tD = b.tz;; this.tD = new Object[paramInt])
    {
      this.fi = 0;
      return;
      paramInt = b.ad(paramInt);
      this.tU = new int[paramInt];
    }
  }
  
  private k<E> bY()
  {
    try
    {
      k localk = (k)super.clone();
      return localCloneNotSupportedException1;
    }
    catch (CloneNotSupportedException localCloneNotSupportedException1)
    {
      try
      {
        localk.tU = ((int[])this.tU.clone());
        localk.tD = ((Object[])this.tD.clone());
        return localk;
      }
      catch (CloneNotSupportedException localCloneNotSupportedException2) {}
      localCloneNotSupportedException1 = localCloneNotSupportedException1;
      return null;
    }
  }
  
  private void gc()
  {
    int m = this.fi;
    int[] arrayOfInt = this.tU;
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
          arrayOfInt[j] = arrayOfInt[i];
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
  
  public final void clear()
  {
    int j = this.fi;
    Object[] arrayOfObject = this.tD;
    int i = 0;
    while (i < j)
    {
      arrayOfObject[i] = null;
      i += 1;
    }
    this.fi = 0;
    this.tB = false;
  }
  
  public final E get(int paramInt)
  {
    paramInt = b.a(this.tU, this.fi, paramInt);
    if ((paramInt < 0) || (this.tD[paramInt] == tA)) {
      return null;
    }
    return (E)this.tD[paramInt];
  }
  
  public final int indexOfKey(int paramInt)
  {
    if (this.tB) {
      gc();
    }
    return b.a(this.tU, this.fi, paramInt);
  }
  
  public final int keyAt(int paramInt)
  {
    if (this.tB) {
      gc();
    }
    return this.tU[paramInt];
  }
  
  public final void put(int paramInt, E paramE)
  {
    int i = b.a(this.tU, this.fi, paramInt);
    if (i >= 0)
    {
      this.tD[i] = paramE;
      return;
    }
    int j = i ^ 0xFFFFFFFF;
    if ((j < this.fi) && (this.tD[j] == tA))
    {
      this.tU[j] = paramInt;
      this.tD[j] = paramE;
      return;
    }
    i = j;
    if (this.tB)
    {
      i = j;
      if (this.fi >= this.tU.length)
      {
        gc();
        i = b.a(this.tU, this.fi, paramInt) ^ 0xFFFFFFFF;
      }
    }
    if (this.fi >= this.tU.length)
    {
      j = b.ad(this.fi + 1);
      int[] arrayOfInt = new int[j];
      Object[] arrayOfObject = new Object[j];
      System.arraycopy(this.tU, 0, arrayOfInt, 0, this.tU.length);
      System.arraycopy(this.tD, 0, arrayOfObject, 0, this.tD.length);
      this.tU = arrayOfInt;
      this.tD = arrayOfObject;
    }
    if (this.fi - i != 0)
    {
      System.arraycopy(this.tU, i, this.tU, i + 1, this.fi - i);
      System.arraycopy(this.tD, i, this.tD, i + 1, this.fi - i);
    }
    this.tU[i] = paramInt;
    this.tD[i] = paramE;
    this.fi += 1;
  }
  
  public final void remove(int paramInt)
  {
    paramInt = b.a(this.tU, this.fi, paramInt);
    if ((paramInt >= 0) && (this.tD[paramInt] != tA))
    {
      this.tD[paramInt] = tA;
      this.tB = true;
    }
  }
  
  public final void removeAt(int paramInt)
  {
    if (this.tD[paramInt] != tA)
    {
      this.tD[paramInt] = tA;
      this.tB = true;
    }
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


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/android/support/v4/e/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */