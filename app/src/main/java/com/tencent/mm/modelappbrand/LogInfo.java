package com.tencent.mm.modelappbrand;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class LogInfo
  implements Parcelable
{
  public static final Parcelable.Creator<LogInfo> CREATOR = new Parcelable.Creator() {};
  public int level;
  public String message;
  public long ts;
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeLong(this.ts);
    paramParcel.writeInt(this.level);
    paramParcel.writeString(this.message);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/modelappbrand/LogInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */