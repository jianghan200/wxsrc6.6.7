package com.tencent.mm.plugin.setting.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class SwitchAccountModel
  implements Parcelable
{
  public static final Parcelable.Creator<SwitchAccountModel> CREATOR = new Parcelable.Creator() {};
  public final String jed;
  public final String mOP;
  public final String mOQ;
  public final int mOR;
  public final String username;
  
  public SwitchAccountModel(String paramString1, String paramString2, String paramString3, String paramString4, int paramInt)
  {
    this.mOP = paramString1;
    this.username = paramString2;
    this.jed = paramString3;
    this.mOQ = paramString4;
    this.mOR = paramInt;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(this.mOP);
    paramParcel.writeString(this.username);
    paramParcel.writeString(this.jed);
    paramParcel.writeString(this.mOQ);
    paramParcel.writeInt(this.mOR);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/plugin/setting/model/SwitchAccountModel.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */