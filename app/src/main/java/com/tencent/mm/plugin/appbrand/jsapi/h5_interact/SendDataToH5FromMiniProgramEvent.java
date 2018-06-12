package com.tencent.mm.plugin.appbrand.jsapi.h5_interact;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.mm.sdk.b.b;

public class SendDataToH5FromMiniProgramEvent
  extends b
  implements Parcelable
{
  public static final Parcelable.Creator<SendDataToH5FromMiniProgramEvent> CREATOR = new Parcelable.Creator() {};
  public String data;
  public String fQq;
  public int fQr;
  
  public SendDataToH5FromMiniProgramEvent() {}
  
  protected SendDataToH5FromMiniProgramEvent(Parcel paramParcel)
  {
    this.fQq = paramParcel.readString();
    this.data = paramParcel.readString();
    this.fQr = paramParcel.readInt();
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(this.fQq);
    paramParcel.writeString(this.data);
    paramParcel.writeInt(this.fQr);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/h5_interact/SendDataToH5FromMiniProgramEvent.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */