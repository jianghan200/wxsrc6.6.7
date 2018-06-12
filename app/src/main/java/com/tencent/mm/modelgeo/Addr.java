package com.tencent.mm.modelgeo;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.mm.sdk.platformtools.bi;

public class Addr
  implements Parcelable
{
  public static final Parcelable.Creator<Addr> CREATOR = new Addr.1();
  public String country;
  public String dRH;
  public String dRI;
  public String dRJ;
  public String dRK;
  public String dRL;
  public String dRM;
  public String dRN;
  public String dRO;
  public String dRP;
  public String dRQ;
  public String dRR;
  public float dRS;
  public float dRT;
  public Object tag = "";
  
  public final String Oy()
  {
    return bi.aG(this.dRK, "") + bi.aG(this.dRL, "") + bi.aG(this.dRM, "") + bi.aG(this.dRN, "") + bi.aG(this.dRO, "");
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("address='" + this.dRH + '\'');
    localStringBuilder.append(", country='" + this.country + '\'');
    localStringBuilder.append(", administrative_area_level_1='" + this.dRI + '\'');
    localStringBuilder.append(", locality='" + this.dRJ + '\'');
    localStringBuilder.append(", locality_shi='" + this.dRK + '\'');
    localStringBuilder.append(", sublocality='" + this.dRL + '\'');
    localStringBuilder.append(", neighborhood='" + this.dRM + '\'');
    localStringBuilder.append(", route='" + this.dRN + '\'');
    localStringBuilder.append(", streetNum='" + this.dRO + '\'');
    localStringBuilder.append(", roughAddr='" + this.dRP + '\'');
    localStringBuilder.append(", poi_name='" + this.dRQ + '\'');
    localStringBuilder.append(", lat=" + this.dRS);
    localStringBuilder.append(", lng=" + this.dRT);
    localStringBuilder.append(", tag=" + this.tag);
    return localStringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(bi.aG(this.dRH, ""));
    paramParcel.writeString(bi.aG(this.country, ""));
    paramParcel.writeString(bi.aG(this.dRI, ""));
    paramParcel.writeString(bi.aG(this.dRJ, ""));
    paramParcel.writeString(bi.aG(this.dRK, ""));
    paramParcel.writeString(bi.aG(this.dRL, ""));
    paramParcel.writeString(bi.aG(this.dRM, ""));
    paramParcel.writeString(bi.aG(this.dRN, ""));
    paramParcel.writeString(bi.aG(this.dRO, ""));
    paramParcel.writeString(bi.aG(this.dRP, ""));
    paramParcel.writeString(bi.aG(this.dRQ, ""));
    paramParcel.writeFloat(this.dRS);
    paramParcel.writeFloat(this.dRT);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/modelgeo/Addr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */