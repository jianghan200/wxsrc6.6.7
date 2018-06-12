package com.tencent.mm.plugin.appbrand.dynamic.launching;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class WidgetRuntimeConfig
  implements Parcelable
{
  public static final Parcelable.Creator<WidgetRuntimeConfig> CREATOR = new WidgetRuntimeConfig.1();
  public String appId;
  public int fwV;
  public int fxl = 32;
  public boolean fxm = false;
  public boolean fxn = true;
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = 1;
    paramParcel.writeString(this.appId);
    paramParcel.writeInt(this.fwV);
    paramParcel.writeInt(this.fxl);
    if (this.fxm)
    {
      paramInt = 1;
      paramParcel.writeInt(paramInt);
      if (!this.fxn) {
        break label60;
      }
    }
    label60:
    for (paramInt = i;; paramInt = 0)
    {
      paramParcel.writeInt(paramInt);
      return;
      paramInt = 0;
      break;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/dynamic/launching/WidgetRuntimeConfig.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */