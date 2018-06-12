package com.tencent.mm.plugin.appbrand.dynamic.launching;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class WidgetSysConfig
  implements Parcelable
{
  public static final Parcelable.Creator<WidgetSysConfig> CREATOR = new WidgetSysConfig.1();
  public int fpO;
  public int fpP;
  public int fpQ;
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeInt(this.fpO);
    paramParcel.writeInt(this.fpP);
    paramParcel.writeInt(this.fpQ);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/appbrand/dynamic/launching/WidgetSysConfig.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */