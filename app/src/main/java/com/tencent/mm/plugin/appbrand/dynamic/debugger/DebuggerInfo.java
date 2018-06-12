package com.tencent.mm.plugin.appbrand.dynamic.debugger;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class DebuggerInfo
  implements Parcelable
{
  public static final Parcelable.Creator<DebuggerInfo> CREATOR = new DebuggerInfo.1();
  public boolean fvD;
  public boolean fvE;
  public boolean fvF;
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = 1;
    if (this.fvD)
    {
      paramInt = 1;
      paramParcel.writeInt(paramInt);
      if (!this.fvE) {
        break label50;
      }
      paramInt = 1;
      label25:
      paramParcel.writeInt(paramInt);
      if (!this.fvF) {
        break label55;
      }
    }
    label50:
    label55:
    for (paramInt = i;; paramInt = 0)
    {
      paramParcel.writeInt(paramInt);
      return;
      paramInt = 0;
      break;
      paramInt = 0;
      break label25;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/appbrand/dynamic/debugger/DebuggerInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */