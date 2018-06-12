package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.wearable.d;

public final class bi
  extends com.google.android.gms.common.data.f
  implements d
{
  private final int beK;
  
  public bi(DataHolder paramDataHolder, int paramInt1, int paramInt2)
  {
    super(paramDataHolder, paramInt1);
    this.beK = paramInt2;
  }
  
  public final int getType()
  {
    return getInteger("event_type");
  }
  
  public final com.google.android.gms.wearable.f rP()
  {
    return new f(this.aMb, this.aMx, this.beK);
  }
  
  public final String toString()
  {
    String str;
    if (getInteger("event_type") == 1) {
      str = "changed";
    }
    for (;;)
    {
      return "DataEventRef{ type=" + str + ", dataitem=" + rP() + " }";
      if (getInteger("event_type") == 2) {
        str = "deleted";
      } else {
        str = "unknown";
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/google/android/gms/wearable/internal/bi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */