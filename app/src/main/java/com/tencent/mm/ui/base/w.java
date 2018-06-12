package com.tencent.mm.ui.base;

import android.os.Build.VERSION;
import android.support.v4.view.u;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;

public abstract class w
  extends u
{
  private final v tAX;
  
  public w()
  {
    this(new v());
  }
  
  private w(v paramv)
  {
    this.tAX = paramv;
    SparseArray[] arrayOfSparseArray = new SparseArray[1];
    int i = 0;
    while (i <= 0)
    {
      arrayOfSparseArray[0] = new SparseArray();
      i += 1;
    }
    paramv.tAV = 1;
    paramv.tAW = arrayOfSparseArray[0];
    paramv.tAU = arrayOfSparseArray;
  }
  
  public final void a(ViewGroup paramViewGroup, int paramInt, Object paramObject)
  {
    paramObject = (View)paramObject;
    paramViewGroup.removeView((View)paramObject);
    int i = getItemViewType(paramInt);
    if (i != -1)
    {
      paramViewGroup = this.tAX;
      if (paramViewGroup.tAV != 1) {
        break label59;
      }
      paramViewGroup.tAW.put(paramInt, paramObject);
    }
    for (;;)
    {
      if (Build.VERSION.SDK_INT >= 14) {
        ((View)paramObject).setAccessibilityDelegate(null);
      }
      return;
      label59:
      paramViewGroup.tAU[i].put(paramInt, paramObject);
    }
  }
  
  public final boolean a(View paramView, Object paramObject)
  {
    return paramView == paramObject;
  }
  
  public final Object b(ViewGroup paramViewGroup, int paramInt)
  {
    Object localObject2 = null;
    int i = getItemViewType(paramInt);
    Object localObject1 = localObject2;
    v localv;
    if (i != -1)
    {
      localv = this.tAX;
      if (localv.tAV != 1) {
        break label63;
      }
      localObject1 = v.a(localv.tAW, paramInt);
    }
    for (;;)
    {
      localObject1 = getView(paramInt, (View)localObject1, paramViewGroup);
      paramViewGroup.addView((View)localObject1);
      return localObject1;
      label63:
      localObject1 = localObject2;
      if (i >= 0)
      {
        localObject1 = localObject2;
        if (i < localv.tAU.length) {
          localObject1 = v.a(localv.tAU[i], paramInt);
        }
      }
    }
  }
  
  public int getItemViewType(int paramInt)
  {
    return 0;
  }
  
  public abstract View getView(int paramInt, View paramView, ViewGroup paramViewGroup);
  
  public void notifyDataSetChanged()
  {
    v localv = this.tAX;
    View[] arrayOfView = localv.tAS;
    int[] arrayOfInt = localv.tAT;
    int j;
    label44:
    View localView;
    Object localObject2;
    if (localv.tAV > 1)
    {
      i = 1;
      localObject1 = localv.tAW;
      j = arrayOfView.length - 1;
      if (j < 0) {
        break label159;
      }
      localView = arrayOfView[j];
      localObject2 = localObject1;
      if (localView != null)
      {
        m = arrayOfInt[j];
        arrayOfView[j] = null;
        arrayOfInt[j] = -1;
        if (m < 0) {
          break label154;
        }
      }
    }
    label154:
    for (int k = 1;; k = 0)
    {
      localObject2 = localObject1;
      if (k != 0)
      {
        if (i != 0) {
          localObject1 = localv.tAU[m];
        }
        ((SparseArray)localObject1).put(j, localView);
        localObject2 = localObject1;
        if (Build.VERSION.SDK_INT >= 14)
        {
          localView.setAccessibilityDelegate(null);
          localObject2 = localObject1;
        }
      }
      j -= 1;
      localObject1 = localObject2;
      break label44;
      i = 0;
      break;
    }
    label159:
    int m = localv.tAS.length;
    int n = localv.tAV;
    Object localObject1 = localv.tAU;
    int i = 0;
    while (i < n)
    {
      localObject2 = localObject1[i];
      int i1 = ((SparseArray)localObject2).size();
      j = i1 - 1;
      k = 0;
      while (k < i1 - m)
      {
        ((SparseArray)localObject2).remove(((SparseArray)localObject2).keyAt(j));
        k += 1;
        j -= 1;
      }
      i += 1;
    }
    super.notifyDataSetChanged();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/ui/base/w.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */