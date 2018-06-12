package com.google.android.gms.common.data;

import java.util.ArrayList;

public abstract class h<T>
  extends a<T>
{
  private ArrayList<Integer> aMA;
  private boolean aMz = false;
  
  public h(DataHolder paramDataHolder)
  {
    super(paramDataHolder);
  }
  
  private int ds(int paramInt)
  {
    if ((paramInt < 0) || (paramInt >= this.aMA.size())) {
      throw new IllegalArgumentException("Position " + paramInt + " is out of bounds for this buffer");
    }
    return ((Integer)this.aMA.get(paramInt)).intValue();
  }
  
  private void oY()
  {
    for (;;)
    {
      int i;
      String str2;
      try
      {
        if (this.aMz) {
          break label190;
        }
        int j = this.aMb.aMm;
        this.aMA = new ArrayList();
        if (j <= 0) {
          break label185;
        }
        this.aMA.add(Integer.valueOf(0));
        String str3 = oX();
        i = this.aMb.dq(0);
        String str1 = this.aMb.d(str3, 0, i);
        i = 1;
        if (i >= j) {
          break label185;
        }
        int k = this.aMb.dq(i);
        str2 = this.aMb.d(str3, i, k);
        if (str2 == null) {
          throw new NullPointerException("Missing value for markerColumn: " + str3 + ", at row: " + i + ", for window: " + k);
        }
      }
      finally {}
      if (!str2.equals(localObject1))
      {
        this.aMA.add(Integer.valueOf(i));
        Object localObject2 = str2;
        break label193;
        label185:
        this.aMz = true;
        label190:
        return;
      }
      label193:
      i += 1;
    }
  }
  
  public abstract T ay(int paramInt1, int paramInt2);
  
  public final T get(int paramInt)
  {
    oY();
    int k = ds(paramInt);
    int j;
    if ((paramInt < 0) || (paramInt == this.aMA.size()))
    {
      j = 0;
      return (T)ay(k, j);
    }
    if (paramInt == this.aMA.size() - 1) {}
    for (int i = this.aMb.aMm - ((Integer)this.aMA.get(paramInt)).intValue();; i = ((Integer)this.aMA.get(paramInt + 1)).intValue() - ((Integer)this.aMA.get(paramInt)).intValue())
    {
      j = i;
      if (i != 1) {
        break;
      }
      paramInt = ds(paramInt);
      this.aMb.dq(paramInt);
      j = i;
      break;
    }
  }
  
  public final int getCount()
  {
    oY();
    return this.aMA.size();
  }
  
  public abstract String oX();
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/google/android/gms/common/data/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */