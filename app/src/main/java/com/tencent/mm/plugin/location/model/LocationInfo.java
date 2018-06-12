package com.tencent.mm.plugin.location.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.mm.plugin.location.ui.d;
import com.tencent.mm.sdk.platformtools.bi;

public class LocationInfo
  implements Parcelable
{
  public static final Parcelable.Creator<LocationInfo> CREATOR = new LocationInfo.1();
  public String bWB;
  public String kCA = "zh-cn";
  String kCB = "";
  public int kCC = 0;
  public String kCv = "";
  public double kCw = -85.0D;
  public double kCx = -1000.0D;
  public int kCy;
  public String kCz = "";
  
  public LocationInfo() {}
  
  public LocationInfo(byte paramByte)
  {
    this.kCv = (toString() + " " + System.nanoTime());
    this.kCy = d.aZx();
  }
  
  public final boolean aYY()
  {
    return (this.kCw != -85.0D) && (this.kCx != -1000.0D);
  }
  
  public final boolean aYZ()
  {
    return (!bi.oW(this.kCz)) || (!bi.oW(this.bWB));
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public String toString()
  {
    return this.kCw + " " + this.kCx + " " + this.kCz + " " + this.bWB + "  " + this.kCv;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(this.kCv);
    paramParcel.writeDouble(this.kCw);
    paramParcel.writeDouble(this.kCx);
    paramParcel.writeInt(this.kCy);
    paramParcel.writeString(this.kCz);
    paramParcel.writeString(this.kCA);
    paramParcel.writeString(this.bWB);
    paramParcel.writeString(this.kCB);
    paramParcel.writeInt(this.kCC);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/plugin/location/model/LocationInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */