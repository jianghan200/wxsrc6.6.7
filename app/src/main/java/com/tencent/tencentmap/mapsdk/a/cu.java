package com.tencent.tencentmap.mapsdk.a;

import android.util.SparseArray;

public final class cu<E>
{
  public static SparseArray<E> a(SparseArray<E> paramSparseArray)
  {
    if (paramSparseArray != null)
    {
      SparseArray localSparseArray = new SparseArray(paramSparseArray.size());
      int i = 0;
      while (i < paramSparseArray.size())
      {
        int j = paramSparseArray.keyAt(i);
        localSparseArray.append(j, paramSparseArray.get(j));
        i += 1;
      }
      return localSparseArray;
    }
    return null;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/cu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */