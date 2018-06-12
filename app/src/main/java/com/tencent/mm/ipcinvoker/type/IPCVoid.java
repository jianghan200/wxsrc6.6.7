package com.tencent.mm.ipcinvoker.type;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class IPCVoid
  implements Parcelable
{
  public static final Parcelable.Creator<IPCVoid> CREATOR = new IPCVoid.1();
  public static final IPCVoid dnk = new IPCVoid();
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt) {}
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/ipcinvoker/type/IPCVoid.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */