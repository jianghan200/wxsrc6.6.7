package com.tencent.mm.plugin.appbrand.appstorage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class AppBrandLocalMediaObject
  implements Parcelable
{
  public static final Parcelable.Creator<AppBrandLocalMediaObject> CREATOR = new AppBrandLocalMediaObject.1();
  public String bNH;
  public String dDG;
  public long eyz;
  public String fjS;
  public boolean fjT;
  public long fjU;
  public String mimeType;
  
  protected AppBrandLocalMediaObject() {}
  
  protected AppBrandLocalMediaObject(Parcel paramParcel)
  {
    this.bNH = paramParcel.readString();
    this.dDG = paramParcel.readString();
    this.mimeType = paramParcel.readString();
    this.fjS = paramParcel.readString();
    if (paramParcel.readByte() != 0) {}
    for (boolean bool = true;; bool = false)
    {
      this.fjT = bool;
      this.eyz = paramParcel.readLong();
      this.fjU = paramParcel.readLong();
      return;
    }
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public String toString()
  {
    return "AppBrandLocalMediaObject{localId='" + this.bNH + '\'' + ", fileFullPath='" + this.dDG + '\'' + ", mimeType='" + this.mimeType + '\'' + ", fileExt='" + this.fjS + '\'' + '}';
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(this.bNH);
    paramParcel.writeString(this.dDG);
    paramParcel.writeString(this.mimeType);
    paramParcel.writeString(this.fjS);
    if (this.fjT) {}
    for (byte b = 1;; b = 0)
    {
      paramParcel.writeByte(b);
      paramParcel.writeLong(this.eyz);
      paramParcel.writeLong(this.fjU);
      return;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/appbrand/appstorage/AppBrandLocalMediaObject.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */