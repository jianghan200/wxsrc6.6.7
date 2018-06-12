package com.tencent.mm.plugin.wallet_core.id_verify.util;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class SetPwdInfo
  implements Parcelable
{
  public static final Parcelable.Creator<SetPwdInfo> CREATOR = new SetPwdInfo.1();
  public String kRt;
  public String kRu = "";
  public String kRv = "";
  public int plg;
  
  public SetPwdInfo() {}
  
  protected SetPwdInfo(Parcel paramParcel)
  {
    this.plg = paramParcel.readInt();
    this.kRt = paramParcel.readString();
    this.kRu = paramParcel.readString();
    this.kRv = paramParcel.readString();
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeInt(this.plg);
    paramParcel.writeString(this.kRt);
    paramParcel.writeString(this.kRu);
    paramParcel.writeString(this.kRv);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/wallet_core/id_verify/util/SetPwdInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */