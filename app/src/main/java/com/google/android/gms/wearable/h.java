package com.google.android.gms.wearable;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.data.DataHolder;

public final class h
  extends com.google.android.gms.common.data.h<f>
  implements g
{
  private final Status bcQ;
  
  public h(DataHolder paramDataHolder)
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


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/google/android/gms/wearable/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */