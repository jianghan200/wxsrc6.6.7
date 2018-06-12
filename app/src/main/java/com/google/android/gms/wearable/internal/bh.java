package com.google.android.gms.wearable.internal;

import com.google.android.gms.wearable.d;
import com.google.android.gms.wearable.f;

public final class bh
  implements d
{
  private int aMd;
  private f bfw;
  
  public bh(d paramd)
  {
    this.aMd = paramd.getType();
    this.bfw = ((f)paramd.rP().freeze());
  }
  
  public final int getType()
  {
    return this.aMd;
  }
  
  public final f rP()
  {
    return this.bfw;
  }
  
  public final String toString()
  {
    String str;
    if (this.aMd == 1) {
      str = "changed";
    }
    for (;;)
    {
      return "DataEventEntity{ type=" + str + ", dataitem=" + this.bfw + " }";
      if (this.aMd == 2) {
        str = "deleted";
      } else {
        str = "unknown";
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/google/android/gms/wearable/internal/bh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */