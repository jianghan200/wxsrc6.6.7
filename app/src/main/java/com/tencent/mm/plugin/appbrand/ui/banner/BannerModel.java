package com.tencent.mm.plugin.appbrand.ui.banner;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.mm.kernel.g;

final class BannerModel
  implements Parcelable
{
  public static final Parcelable.Creator<BannerModel> CREATOR = new BannerModel.1();
  private static volatile BannerModel gyp;
  String appId;
  String appName;
  String fmD;
  int fmv;
  String gyo;
  
  BannerModel() {}
  
  private BannerModel(Parcel paramParcel)
  {
    this.appId = paramParcel.readString();
    this.fmv = paramParcel.readInt();
    this.appName = paramParcel.readString();
    this.fmD = paramParcel.readString();
    this.gyo = paramParcel.readString();
  }
  
  static BannerModel anY()
  {
    try
    {
      BannerModel localBannerModel = ((e)g.l(e.class)).anN();
      gyp = localBannerModel;
      return localBannerModel;
    }
    finally {}
  }
  
  static BannerModel anZ()
  {
    try
    {
      BannerModel localBannerModel = gyp;
      return localBannerModel;
    }
    finally {}
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(this.appId);
    paramParcel.writeInt(this.fmv);
    paramParcel.writeString(this.appName);
    paramParcel.writeString(this.fmD);
    paramParcel.writeString(this.gyo);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/ui/banner/BannerModel.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */