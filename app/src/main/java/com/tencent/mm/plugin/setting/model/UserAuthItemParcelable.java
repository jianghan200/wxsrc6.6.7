package com.tencent.mm.plugin.setting.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class UserAuthItemParcelable
  implements Parcelable
{
  public static final Parcelable.Creator<UserAuthItemParcelable> CREATOR = new UserAuthItemParcelable.1();
  public String mPl;
  public int mPm;
  public String scope;
  public int state;
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(this.scope);
    paramParcel.writeString(this.mPl);
    paramParcel.writeInt(this.state);
    paramParcel.writeInt(this.mPm);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/setting/model/UserAuthItemParcelable.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */