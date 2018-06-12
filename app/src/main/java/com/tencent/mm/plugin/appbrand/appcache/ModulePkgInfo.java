package com.tencent.mm.plugin.appbrand.appcache;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.mm.plugin.appbrand.config.WxaAttributes.e;

public class ModulePkgInfo
  extends WxaAttributes.e
  implements Parcelable
{
  public static final Parcelable.Creator<ModulePkgInfo> CREATOR = new ModulePkgInfo.1();
  public volatile String ffK;
  
  public ModulePkgInfo() {}
  
  private ModulePkgInfo(Parcel paramParcel)
  {
    readFromParcel(paramParcel);
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void readFromParcel(Parcel paramParcel)
  {
    this.ffK = paramParcel.readString();
    this.name = paramParcel.readString();
    this.bKg = paramParcel.readString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(this.ffK);
    paramParcel.writeString(this.name);
    paramParcel.writeString(this.bKg);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/appbrand/appcache/ModulePkgInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */