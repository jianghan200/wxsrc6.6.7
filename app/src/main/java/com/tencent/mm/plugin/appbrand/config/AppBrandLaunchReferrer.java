package com.tencent.mm.plugin.appbrand.config;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.mm.sdk.platformtools.bi;
import org.json.JSONObject;

public final class AppBrandLaunchReferrer
  implements Parcelable
{
  public static final Parcelable.Creator<AppBrandLaunchReferrer> CREATOR = new AppBrandLaunchReferrer.1();
  public String appId;
  public int bJt;
  public int fqE;
  public String fqF;
  public String fqG;
  public String fqH;
  public String url;
  
  public AppBrandLaunchReferrer() {}
  
  private AppBrandLaunchReferrer(Parcel paramParcel)
  {
    h(paramParcel);
  }
  
  public final void a(AppBrandLaunchReferrer paramAppBrandLaunchReferrer)
  {
    if (paramAppBrandLaunchReferrer == null) {
      return;
    }
    Parcel localParcel = Parcel.obtain();
    localParcel.setDataPosition(0);
    paramAppBrandLaunchReferrer.writeToParcel(localParcel, 0);
    localParcel.setDataPosition(0);
    h(localParcel);
    localParcel.recycle();
  }
  
  public final JSONObject aef()
  {
    JSONObject localJSONObject2;
    try
    {
      JSONObject localJSONObject1 = new JSONObject(this.fqF);
      localJSONObject2 = new JSONObject();
      try
      {
        localJSONObject2.put("appId", this.appId);
        localJSONObject2.put("extraData", localJSONObject1);
        if (((this.fqE == 1) || (this.fqE == 3)) && (!bi.oW(this.fqG))) {
          localJSONObject2.put("privateExtraData", new JSONObject(this.fqG));
        }
      }
      catch (Exception localException2)
      {
        String str;
        for (;;) {}
      }
      if (localJSONObject2.length() == 0) {
        return null;
      }
    }
    catch (Exception localException1)
    {
      for (;;)
      {
        str = this.fqF;
      }
    }
    return localJSONObject2;
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  final void h(Parcel paramParcel)
  {
    this.fqE = paramParcel.readInt();
    this.appId = paramParcel.readString();
    this.fqF = paramParcel.readString();
    this.fqG = paramParcel.readString();
    this.url = paramParcel.readString();
    this.fqH = paramParcel.readString();
    this.bJt = paramParcel.readInt();
  }
  
  public final String toString()
  {
    return "AppBrandLaunchReferrer{launchScene=" + this.fqE + ", appId='" + this.appId + '\'' + ", extraData='" + this.fqF + '\'' + ", url='" + this.url + '\'' + ", agentId='" + this.fqH + '\'' + ", sourceType='" + this.bJt + '\'' + '}';
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeInt(this.fqE);
    paramParcel.writeString(this.appId);
    paramParcel.writeString(this.fqF);
    paramParcel.writeString(this.fqG);
    paramParcel.writeString(this.url);
    paramParcel.writeString(this.fqH);
    paramParcel.writeInt(this.bJt);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/appbrand/config/AppBrandLaunchReferrer.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */