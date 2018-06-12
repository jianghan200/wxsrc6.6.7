package com.tencent.mm.plugin.address.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class RcptItem
  implements Parcelable
{
  public static final Parcelable.Creator<RcptItem> CREATOR = new RcptItem.1();
  public String code = "";
  public String eXM = "";
  public boolean eXN = false;
  public String name = "";
  
  public RcptItem() {}
  
  public RcptItem(Parcel paramParcel)
  {
    this.name = paramParcel.readString();
    this.code = paramParcel.readString();
    this.eXM = paramParcel.readString();
  }
  
  public RcptItem(String paramString1, String paramString2, String paramString3)
  {
    this.name = paramString1;
    this.code = paramString2;
    this.eXM = paramString3;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(this.name);
    paramParcel.writeString(this.code);
    paramParcel.writeString(this.eXM);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/address/model/RcptItem.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */