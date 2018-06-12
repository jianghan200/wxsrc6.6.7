package com.google.android.gms.c;

import java.util.Map;

public class q<K, V>
{
  static Object[] tO;
  static int tP;
  static Object[] tQ;
  static int tR;
  int fi = 0;
  int[] tS = n.tx;
  Object[] tT = n.tz;
  
  static void b(int[] paramArrayOfInt, Object[] paramArrayOfObject, int paramInt)
  {
    if (paramArrayOfInt.length == 8) {
      try
      {
        if (tR < 10)
        {
          paramArrayOfObject[0] = tQ;
          paramArrayOfObject[1] = paramArrayOfInt;
          paramInt = (paramInt << 1) - 1;
          break label117;
          tQ = paramArrayOfObject;
          tR += 1;
        }
        return;
      }
      finally {}
    }
    if (paramArrayOfInt.length == 4) {}
    for (;;)
    {
      try
      {
        if (tP < 10)
        {
          paramArrayOfObject[0] = tO;
          paramArrayOfObject[1] = paramArrayOfInt;
          paramInt = (paramInt << 1) - 1;
          break label134;
          tO = paramArrayOfObject;
          tP += 1;
        }
        return;
      }
      finally {}
      label117:
      while (paramInt >= 2)
      {
        paramArrayOfObject[paramInt] = null;
        paramInt -= 1;
      }
      break;
      return;
      label134:
      while (paramInt >= 2)
      {
        paramArrayOfObject[paramInt] = null;
        paramInt -= 1;
      }
    }
  }
  
  private K keyAt(int paramInt)
  {
    return (K)this.tT[(paramInt << 1)];
  }
  
  private V valueAt(int paramInt)
  {
    return (V)this.tT[((paramInt << 1) + 1)];
  }
  
  final int bX()
  {
    int m = this.fi;
    int i;
    if (m == 0) {
      i = -1;
    }
    int j;
    do
    {
      do
      {
        return i;
        j = n.a(this.tS, m, 0);
        i = j;
      } while (j < 0);
      i = j;
    } while (this.tT[(j << 1)] == null);
    int k = j + 1;
    while ((k < m) && (this.tS[k] == 0))
    {
      if (this.tT[(k << 1)] == null) {
        return k;
      }
      k += 1;
    }
    j -= 1;
    for (;;)
    {
      if ((j < 0) || (this.tS[j] != 0)) {
        break label121;
      }
      i = j;
      if (this.tT[(j << 1)] == null) {
        break;
      }
      j -= 1;
    }
    label121:
    return k ^ 0xFFFFFFFF;
  }
  
  public void clear()
  {
    if (this.fi != 0)
    {
      b(this.tS, this.tT, this.fi);
      this.tS = n.tx;
      this.tT = n.tz;
      this.fi = 0;
    }
  }
  
  public boolean containsKey(Object paramObject)
  {
    if (paramObject == null) {
      if (bX() < 0) {}
    }
    while (indexOf(paramObject, paramObject.hashCode()) >= 0)
    {
      return true;
      return false;
    }
    return false;
  }
  
  public boolean containsValue(Object paramObject)
  {
    return indexOfValue(paramObject) >= 0;
  }
  
  final void du(int paramInt)
  {
    if (paramInt == 8) {}
    for (;;)
    {
      try
      {
        if (tQ != null)
        {
          Object[] arrayOfObject1 = tQ;
          this.tT = arrayOfObject1;
          tQ = (Object[])arrayOfObject1[0];
          this.tS = ((int[])arrayOfObject1[1]);
          arrayOfObject1[1] = null;
          arrayOfObject1[0] = null;
          tR -= 1;
          return;
        }
        this.tS = new int[paramInt];
        this.tT = new Object[paramInt << 1];
        return;
      }
      finally {}
      if (paramInt == 4) {
        try
        {
          if (tO != null)
          {
            Object[] arrayOfObject2 = tO;
            this.tT = arrayOfObject2;
            tO = (Object[])arrayOfObject2[0];
            this.tS = ((int[])arrayOfObject2[1]);
            arrayOfObject2[1] = null;
            arrayOfObject2[0] = null;
            tP -= 1;
            return;
          }
        }
        finally {}
      }
    }
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {}
    for (;;)
    {
      return true;
      if ((paramObject instanceof Map))
      {
        paramObject = (Map)paramObject;
        if (size() != ((Map)paramObject).size()) {
          return false;
        }
        int i = 0;
        try
        {
          while (i < this.fi)
          {
            Object localObject1 = keyAt(i);
            Object localObject2 = valueAt(i);
            Object localObject3 = ((Map)paramObject).get(localObject1);
            if (localObject2 == null)
            {
              if (localObject3 != null) {
                break label121;
              }
              if (!((Map)paramObject).containsKey(localObject1)) {
                break label121;
              }
            }
            else
            {
              boolean bool = localObject2.equals(localObject3);
              if (!bool) {
                return false;
              }
            }
            i += 1;
          }
          return false;
        }
        catch (NullPointerException paramObject)
        {
          return false;
        }
        catch (ClassCastException paramObject)
        {
          return false;
        }
      }
    }
    label121:
    return false;
  }
  
  public V get(Object paramObject)
  {
    if (paramObject == null) {}
    for (int i = bX(); i >= 0; i = indexOf(paramObject, paramObject.hashCode())) {
      return (V)this.tT[((i << 1) + 1)];
    }
    return null;
  }
  
  public int hashCode()
  {
    int[] arrayOfInt = this.tS;
    Object[] arrayOfObject = this.tT;
    int n = this.fi;
    int i = 1;
    int j = 0;
    int k = 0;
    if (j < n)
    {
      Object localObject = arrayOfObject[i];
      int i1 = arrayOfInt[j];
      if (localObject == null) {}
      for (int m = 0;; m = localObject.hashCode())
      {
        k += (m ^ i1);
        j += 1;
        i += 2;
        break;
      }
    }
    return k;
  }
  
  final int indexOf(Object paramObject, int paramInt)
  {
    int m = this.fi;
    int i;
    if (m == 0) {
      i = -1;
    }
    int j;
    do
    {
      do
      {
        return i;
        j = n.a(this.tS, m, paramInt);
        i = j;
      } while (j < 0);
      i = j;
    } while (paramObject.equals(this.tT[(j << 1)]));
    int k = j + 1;
    while ((k < m) && (this.tS[k] == paramInt))
    {
      if (paramObject.equals(this.tT[(k << 1)])) {
        return k;
      }
      k += 1;
    }
    j -= 1;
    for (;;)
    {
      if ((j < 0) || (this.tS[j] != paramInt)) {
        break label156;
      }
      i = j;
      if (paramObject.equals(this.tT[(j << 1)])) {
        break;
      }
      j -= 1;
    }
    label156:
    return k ^ 0xFFFFFFFF;
  }
  
  final int indexOfValue(Object paramObject)
  {
    int i = 1;
    int j = 1;
    int k = this.fi * 2;
    Object[] arrayOfObject = this.tT;
    if (paramObject == null)
    {
      i = j;
      while (i < k)
      {
        if (arrayOfObject[i] == null) {
          return i >> 1;
        }
        i += 2;
      }
    }
    do
    {
      i += 2;
      if (i >= k) {
        break;
      }
    } while (!paramObject.equals(arrayOfObject[i]));
    return i >> 1;
    return -1;
  }
  
  public boolean isEmpty()
  {
    return this.fi <= 0;
  }
  
  public V put(K paramK, V paramV)
  {
    int k = 8;
    int i;
    int j;
    if (paramK == null)
    {
      i = bX();
      j = 0;
    }
    while (i >= 0)
    {
      i = (i << 1) + 1;
      paramK = this.tT[i];
      this.tT[i] = paramV;
      return paramK;
      j = paramK.hashCode();
      i = indexOf(paramK, j);
    }
    int m = i ^ 0xFFFFFFFF;
    if (this.fi >= this.tS.length)
    {
      if (this.fi < 8) {
        break label267;
      }
      i = this.fi + (this.fi >> 1);
    }
    for (;;)
    {
      int[] arrayOfInt = this.tS;
      Object[] arrayOfObject = this.tT;
      du(i);
      if (this.tS.length > 0)
      {
        System.arraycopy(arrayOfInt, 0, this.tS, 0, arrayOfInt.length);
        System.arraycopy(arrayOfObject, 0, this.tT, 0, arrayOfObject.length);
      }
      b(arrayOfInt, arrayOfObject, this.fi);
      if (m < this.fi)
      {
        System.arraycopy(this.tS, m, this.tS, m + 1, this.fi - m);
        System.arraycopy(this.tT, m << 1, this.tT, m + 1 << 1, this.fi - m << 1);
      }
      this.tS[m] = j;
      this.tT[(m << 1)] = paramK;
      this.tT[((m << 1) + 1)] = paramV;
      this.fi += 1;
      return null;
      label267:
      i = k;
      if (this.fi < 4) {
        i = 4;
      }
    }
  }
  
  public V remove(Object paramObject)
  {
    if (paramObject == null) {}
    for (int i = bX(); i >= 0; i = indexOf(paramObject, paramObject.hashCode())) {
      return (V)removeAt(i);
    }
    return null;
  }
  
  public final V removeAt(int paramInt)
  {
    int i = 8;
    Object localObject = this.tT[((paramInt << 1) + 1)];
    if (this.fi <= 1)
    {
      b(this.tS, this.tT, this.fi);
      this.tS = n.tx;
      this.tT = n.tz;
      this.fi = 0;
    }
    int[] arrayOfInt;
    Object[] arrayOfObject;
    do
    {
      return (V)localObject;
      if ((this.tS.length <= 8) || (this.fi >= this.tS.length / 3)) {
        break;
      }
      if (this.fi > 8) {
        i = this.fi + (this.fi >> 1);
      }
      arrayOfInt = this.tS;
      arrayOfObject = this.tT;
      du(i);
      this.fi -= 1;
      if (paramInt > 0)
      {
        System.arraycopy(arrayOfInt, 0, this.tS, 0, paramInt);
        System.arraycopy(arrayOfObject, 0, this.tT, 0, paramInt << 1);
      }
    } while (paramInt >= this.fi);
    System.arraycopy(arrayOfInt, paramInt + 1, this.tS, paramInt, this.fi - paramInt);
    System.arraycopy(arrayOfObject, paramInt + 1 << 1, this.tT, paramInt << 1, this.fi - paramInt << 1);
    return (V)localObject;
    this.fi -= 1;
    if (paramInt < this.fi)
    {
      System.arraycopy(this.tS, paramInt + 1, this.tS, paramInt, this.fi - paramInt);
      System.arraycopy(this.tT, paramInt + 1 << 1, this.tT, paramInt << 1, this.fi - paramInt << 1);
    }
    this.tT[(this.fi << 1)] = null;
    this.tT[((this.fi << 1) + 1)] = null;
    return (V)localObject;
  }
  
  public int size()
  {
    return this.fi;
  }
  
  public String toString()
  {
    if (isEmpty()) {
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
      Object localObject = keyAt(i);
      if (localObject != this)
      {
        localStringBuilder.append(localObject);
        label70:
        localStringBuilder.append('=');
        localObject = valueAt(i);
        if (localObject == this) {
          break label111;
        }
        localStringBuilder.append(localObject);
      }
      for (;;)
      {
        i += 1;
        break;
        localStringBuilder.append("(this Map)");
        break label70;
        label111:
        localStringBuilder.append("(this Map)");
      }
    }
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/google/android/gms/c/q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */