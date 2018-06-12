package com.tencent.recovery.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.List;

public class RecoveryData
  implements Parcelable
{
  public static final Parcelable.Creator<RecoveryData> CREATOR = new Parcelable.Creator() {};
  public String clientVersion;
  public String fMk;
  public String processName;
  public String vhv;
  public List<RecoveryStatusItem> vhw;
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(this.processName);
    paramParcel.writeString(this.fMk);
    paramParcel.writeString(this.clientVersion);
    paramParcel.writeString(this.vhv);
    paramParcel.writeList(this.vhw);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/recovery/model/RecoveryData.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */