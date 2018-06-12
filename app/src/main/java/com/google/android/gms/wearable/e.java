package com.google.android.gms.wearable;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.h;

public final class e
  extends h<d>
  implements g
{
  public final Status bcQ;
  
  public e(DataHolder paramDataHolder)
  {
    super(paramDataHolder);
    this.bcQ = new Status(paramDataHolder.aJC);
  }
  
  public final Status oF()
  {
    return this.bcQ;
  }
  
  protected final String oX()
  {
    return "path";
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/google/android/gms/wearable/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */