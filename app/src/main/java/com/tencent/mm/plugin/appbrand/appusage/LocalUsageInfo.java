package com.tencent.mm.plugin.appbrand.appusage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class LocalUsageInfo
  implements Parcelable
{
  public static final Parcelable.Creator<LocalUsageInfo> CREATOR = new LocalUsageInfo.1();
  public final String appId;
  public final String fmD;
  public final int fmv;
  public final String nickname;
  public final String username;
  
  private LocalUsageInfo(Parcel paramParcel)
  {
    this.username = paramParcel.readString();
    this.appId = paramParcel.readString();
    this.fmv = paramParcel.readInt();
    this.nickname = paramParcel.readString();
    this.fmD = paramParcel.readString();
  }
  
  public LocalUsageInfo(String paramString1, String paramString2, int paramInt, String paramString3, String paramString4)
  {
    this.username = paramString1;
    this.appId = paramString2;
    this.fmv = paramInt;
    this.nickname = paramString3;
    this.fmD = paramString4;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(this.username);
    paramParcel.writeString(this.appId);
    paramParcel.writeInt(this.fmv);
    paramParcel.writeString(this.nickname);
    paramParcel.writeString(this.fmD);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/appbrand/appusage/LocalUsageInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */