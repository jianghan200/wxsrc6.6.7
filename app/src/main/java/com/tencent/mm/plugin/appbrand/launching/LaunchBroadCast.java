package com.tencent.mm.plugin.appbrand.launching;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.mm.plugin.appbrand.ipc.d;

public final class LaunchBroadCast
  implements Parcelable
{
  public static final Parcelable.Creator<LaunchBroadCast> CREATOR = new LaunchBroadCast.1();
  public String appId;
  public boolean cdk;
  public int fmv;
  public int gfw;
  public String username;
  
  private LaunchBroadCast() {}
  
  private LaunchBroadCast(Parcel paramParcel)
  {
    this.username = paramParcel.readString();
    this.appId = paramParcel.readString();
    this.fmv = paramParcel.readInt();
    this.gfw = paramParcel.readInt();
    if (paramParcel.readByte() != 0) {}
    for (boolean bool = true;; bool = false)
    {
      this.cdk = bool;
      return;
    }
  }
  
  static void a(String paramString, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    LaunchBroadCast localLaunchBroadCast = new LaunchBroadCast();
    localLaunchBroadCast.username = null;
    localLaunchBroadCast.appId = paramString;
    localLaunchBroadCast.fmv = paramInt1;
    localLaunchBroadCast.gfw = paramInt2;
    localLaunchBroadCast.cdk = paramBoolean;
    d.c(localLaunchBroadCast);
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(this.username);
    paramParcel.writeString(this.appId);
    paramParcel.writeInt(this.fmv);
    paramParcel.writeInt(this.gfw);
    if (this.cdk) {}
    for (byte b = 1;; b = 0)
    {
      paramParcel.writeByte(b);
      return;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/appbrand/launching/LaunchBroadCast.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */