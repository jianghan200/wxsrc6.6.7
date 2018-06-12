package com.tencent.mm.plugin.appbrand.jsapi.share;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class ShareInfo
  implements Parcelable
{
  public static final Parcelable.Creator<ShareInfo> CREATOR = new ShareInfo.1();
  public String dFy;
  public String dzR;
  
  private ShareInfo(Parcel paramParcel)
  {
    this.dzR = paramParcel.readString();
    this.dFy = paramParcel.readString();
  }
  
  public ShareInfo(String paramString1, String paramString2)
  {
    this.dzR = paramString1;
    this.dFy = paramString2;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(this.dzR);
    paramParcel.writeString(this.dFy);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/share/ShareInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */