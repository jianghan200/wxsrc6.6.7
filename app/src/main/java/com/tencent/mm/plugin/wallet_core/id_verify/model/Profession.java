package com.tencent.mm.plugin.wallet_core.id_verify.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class Profession
  implements Parcelable
{
  public static final Parcelable.Creator<Profession> CREATOR = new Profession.1();
  public String pkT;
  public int pkU;
  
  protected Profession(Parcel paramParcel)
  {
    this.pkT = paramParcel.readString();
    this.pkU = paramParcel.readInt();
  }
  
  public Profession(String paramString, int paramInt)
  {
    this.pkT = paramString;
    this.pkU = paramInt;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(this.pkT);
    paramParcel.writeInt(this.pkU);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/wallet_core/id_verify/model/Profession.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */