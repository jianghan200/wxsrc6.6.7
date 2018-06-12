package com.tencent.mm.plugin.appbrand.appusage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public final class AppIdentity
  implements Parcelable
{
  public static final Parcelable.Creator<AppIdentity> CREATOR = new AppIdentity.1();
  public final int fmv;
  public final String username;
  
  protected AppIdentity(Parcel paramParcel)
  {
    this.username = paramParcel.readString();
    this.fmv = paramParcel.readInt();
  }
  
  public AppIdentity(String paramString, int paramInt)
  {
    this.username = paramString;
    this.fmv = paramInt;
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(this.username);
    paramParcel.writeInt(this.fmv);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/appbrand/appusage/AppIdentity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */