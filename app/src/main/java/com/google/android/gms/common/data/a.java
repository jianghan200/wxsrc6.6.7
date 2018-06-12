package com.google.android.gms.common.data;

import java.util.Iterator;

public abstract class a<T>
  implements b<T>
{
  public final DataHolder aMb;
  
  protected a(DataHolder paramDataHolder)
  {
    this.aMb = paramDataHolder;
    if (this.aMb != null) {
      this.aMb.aMn = this;
    }
  }
  
  public int getCount()
  {
    if (this.aMb == null) {
      return 0;
    }
    return this.aMb.aMm;
  }
  
  public Iterator<T> iterator()
  {
    return new e(this);
  }
  
  public final void release()
  {
    if (this.aMb != null) {
      this.aMb.close();
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/google/android/gms/common/data/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */