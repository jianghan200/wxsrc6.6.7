package com.tencent.mm.plugin.appbrand.launching.params;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.mm.modelappbrand.LaunchParamsOptional;
import com.tencent.mm.plugin.appbrand.appcache.a;
import com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig;
import com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer;
import com.tencent.mm.plugin.appbrand.report.AppBrandStatObject;

public final class LaunchParcel
  implements Parcelable
{
  public static final Parcelable.Creator<LaunchParcel> CREATOR = new Parcelable.Creator() {};
  public String appId;
  public int fmv;
  public AppBrandLaunchReferrer fqA;
  public String fqx;
  public AppBrandStatObject ghm;
  public LaunchParamsOptional ghn;
  public String username;
  public int version;
  
  public LaunchParcel() {}
  
  private LaunchParcel(Parcel paramParcel)
  {
    this.username = paramParcel.readString();
    this.appId = paramParcel.readString();
    this.version = paramParcel.readInt();
    this.fmv = paramParcel.readInt();
    this.fqx = paramParcel.readString();
    this.ghm = ((AppBrandStatObject)paramParcel.readParcelable(AppBrandStatObject.class.getClassLoader()));
    this.fqA = ((AppBrandLaunchReferrer)paramParcel.readParcelable(AppBrandLaunchReferrer.class.getClassLoader()));
    this.ghn = ((LaunchParamsOptional)paramParcel.readParcelable(LaunchParamsOptional.class.getClassLoader()));
  }
  
  public final void a(AppBrandInitConfig paramAppBrandInitConfig)
  {
    Object localObject2 = null;
    if (paramAppBrandInitConfig == null) {
      return;
    }
    paramAppBrandInitConfig.username = this.username;
    paramAppBrandInitConfig.fqx = a.qB(this.fqx);
    paramAppBrandInitConfig.fqA.a(this.fqA);
    if (this.ghn == null)
    {
      localObject1 = null;
      paramAppBrandInitConfig.dFy = ((String)localObject1);
      if (this.ghn != null) {
        break label77;
      }
    }
    label77:
    for (Object localObject1 = localObject2;; localObject1 = this.ghn.dzR)
    {
      paramAppBrandInitConfig.dzR = ((String)localObject1);
      return;
      localObject1 = this.ghn.dFy;
      break;
    }
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(this.username);
    paramParcel.writeString(this.appId);
    paramParcel.writeInt(this.version);
    paramParcel.writeInt(this.fmv);
    paramParcel.writeString(this.fqx);
    paramParcel.writeParcelable(this.ghm, paramInt);
    paramParcel.writeParcelable(this.fqA, paramInt);
    paramParcel.writeParcelable(this.ghn, paramInt);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/appbrand/launching/params/LaunchParcel.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */