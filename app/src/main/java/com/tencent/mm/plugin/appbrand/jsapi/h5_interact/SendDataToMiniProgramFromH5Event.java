package com.tencent.mm.plugin.appbrand.jsapi.h5_interact;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class SendDataToMiniProgramFromH5Event
  implements Parcelable
{
  public static final Parcelable.Creator<SendDataToMiniProgramFromH5Event> CREATOR = new SendDataToMiniProgramFromH5Event.1();
  public String data;
  public String fQs;
  public int fQt;
  
  public SendDataToMiniProgramFromH5Event() {}
  
  protected SendDataToMiniProgramFromH5Event(Parcel paramParcel)
  {
    this.fQs = paramParcel.readString();
    this.data = paramParcel.readString();
    this.fQt = paramParcel.readInt();
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(this.fQs);
    paramParcel.writeString(this.data);
    paramParcel.writeInt(this.fQt);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/h5_interact/SendDataToMiniProgramFromH5Event.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */