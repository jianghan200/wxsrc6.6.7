package com.google.android.gms.c;

import java.io.IOException;
import java.lang.reflect.Array;

public final class az<M extends ay<M>, T>
{
  protected final Class<T> aZZ;
  protected final boolean baa;
  public final int tag;
  protected final int type;
  
  private int am(Object paramObject)
  {
    int i = bh.dP(this.tag);
    switch (this.type)
    {
    default: 
      throw new IllegalArgumentException("Unknown type " + this.type);
    case 10: 
      paramObject = (be)paramObject;
      return ax.dI(i) * 2 + ((be)paramObject).qS();
    }
    return ax.b(i, (be)paramObject);
  }
  
  private void b(Object paramObject, ax paramax)
  {
    for (;;)
    {
      try
      {
        paramax.dJ(this.tag);
        switch (this.type)
        {
        case 10: 
          throw new IllegalArgumentException("Unknown type " + this.type);
        }
      }
      catch (IOException paramObject)
      {
        throw new IllegalStateException((Throwable)paramObject);
      }
      paramObject = (be)paramObject;
      int i = bh.dP(this.tag);
      ((be)paramObject).a(paramax);
      paramax.aB(i, 4);
      return;
      paramax.b((be)paramObject);
      return;
    }
  }
  
  final void a(Object paramObject, ax paramax)
  {
    if (this.baa)
    {
      int j = Array.getLength(paramObject);
      int i = 0;
      while (i < j)
      {
        Object localObject = Array.get(paramObject, i);
        if (localObject != null) {
          b(localObject, paramax);
        }
        i += 1;
      }
    }
    b(paramObject, paramax);
  }
  
  final int al(Object paramObject)
  {
    if (this.baa)
    {
      int m = Array.getLength(paramObject);
      int j = 0;
      for (int i = 0;; i = k)
      {
        k = i;
        if (j >= m) {
          break;
        }
        k = i;
        if (Array.get(paramObject, j) != null) {
          k = i + am(Array.get(paramObject, j));
        }
        j += 1;
      }
    }
    int k = am(paramObject);
    return k;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/google/android/gms/c/az.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */