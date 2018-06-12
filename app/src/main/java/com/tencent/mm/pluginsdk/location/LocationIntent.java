package com.tencent.mm.pluginsdk.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.mm.modelgeo.Addr;

public class LocationIntent
  implements Parcelable
{
  public static final Parcelable.Creator<LocationIntent> CREATOR = new LocationIntent.1();
  public int bSz = 0;
  public Addr dSa = null;
  public String kCB;
  public String kFa = "";
  public String label = "";
  public double lat;
  public double lng;
  public String qyA = "";
  public int qyB = 0;
  
  public final String bGa()
  {
    StringBuffer localStringBuffer = new StringBuffer();
    localStringBuffer.append("lat " + this.lat + ";");
    localStringBuffer.append("lng " + this.lng + ";");
    localStringBuffer.append("scale " + this.bSz + ";");
    localStringBuffer.append("label " + this.label + ";");
    localStringBuffer.append("poiname " + this.kFa + ";");
    localStringBuffer.append("infourl " + this.qyA + ";");
    localStringBuffer.append("locTypeId " + this.kCB + ";");
    localStringBuffer.append("poiType " + this.qyB + ";");
    if (this.dSa != null) {
      localStringBuffer.append("addr " + this.dSa.toString() + ";");
    }
    return localStringBuffer.toString();
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeDouble(this.lat);
    paramParcel.writeDouble(this.lng);
    paramParcel.writeInt(this.bSz);
    paramParcel.writeString(this.label);
    paramParcel.writeString(this.kFa);
    paramParcel.writeString(this.qyA);
    paramParcel.writeString(this.kCB);
    paramParcel.writeInt(this.qyB);
    paramParcel.writeParcelable(this.dSa, paramInt);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/pluginsdk/location/LocationIntent.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */