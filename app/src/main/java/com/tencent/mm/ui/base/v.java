package com.tencent.mm.ui.base;

import android.util.SparseArray;
import android.view.View;

public final class v
{
  View[] tAS = new View[0];
  int[] tAT = new int[0];
  SparseArray<View>[] tAU;
  int tAV;
  SparseArray<View> tAW;
  
  static View a(SparseArray<View> paramSparseArray, int paramInt)
  {
    int j = paramSparseArray.size();
    if (j > 0)
    {
      int i = 0;
      while (i < j)
      {
        int k = paramSparseArray.keyAt(i);
        localView = (View)paramSparseArray.get(k);
        if (k == paramInt)
        {
          paramSparseArray.remove(k);
          return localView;
        }
        i += 1;
      }
      paramInt = j - 1;
      View localView = (View)paramSparseArray.valueAt(paramInt);
      paramSparseArray.remove(paramSparseArray.keyAt(paramInt));
      return localView;
    }
    return null;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/ui/base/v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */